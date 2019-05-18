package com.example.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {

    //region [event handlers]

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }


    //endregion
}
