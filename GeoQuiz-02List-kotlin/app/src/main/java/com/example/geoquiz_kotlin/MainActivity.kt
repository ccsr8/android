package com.example.geoquiz_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var mTrueButton: Button
    private lateinit var mFalseButton: Button
    private lateinit var mNextButton: ImageButton
    private lateinit var mQuestionTextView: TextView
    private lateinit var toast: Toast
    private var mCurrentIndex: Int = 0

    private var mQuestionBank: Array<Question> = arrayOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, true),
        Question(R.string.question_africa, true),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTrueButton = findViewById(R.id.true_button)
        mFalseButton = findViewById(R.id.false_button)
        mNextButton = findViewById(R.id.next_button)
        mQuestionTextView = findViewById(R.id.question_text_view)

        updateQuestion()

        mTrueButton.setOnClickListener {
            checkAnswer(true)
        }

        mFalseButton.setOnClickListener {
            checkAnswer(false)
        }

        mNextButton.setOnClickListener{
            mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.count()
            updateQuestion()
        }
    }

    fun updateQuestion() {
        var question: Int = mQuestionBank[mCurrentIndex].mTextResId
        mQuestionTextView.setText(question)
    }

    fun checkAnswer(userPressedTrue: Boolean){
        var answerIsTrue: Boolean = mQuestionBank[mCurrentIndex].mAnswerTrue
        var messageResId: Int = 0

        if (userPressedTrue == answerIsTrue){
            messageResId = R.string.correct_toast
        } else {
            messageResId = R.string.incorrect_toast
        }

        toast = Toast.makeText(this@MainActivity, messageResId, Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
        toast.show()
    }
}
