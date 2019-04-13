package com.example.geoquiz_kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var mTrueButton: Button
    private lateinit var mFalseButton: Button
    private lateinit var toast: Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTrueButton = findViewById(R.id.true_button)
        mFalseButton = findViewById(R.id.false_button)

        mTrueButton.setOnClickListener {
            toast = Toast.makeText(
                this@MainActivity,
                "Correct",
                Toast.LENGTH_SHORT
            )

            toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
            toast.show()
        }

        mFalseButton.setOnClickListener {
            toast = Toast.makeText(
                this@MainActivity,
                "Incorrect",
                Toast.LENGTH_SHORT
            )

            toast.setGravity(Gravity.TOP or Gravity.CENTER_HORIZONTAL, 0, 0)
            toast.show()
        }
    }
}
