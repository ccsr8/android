package com.example.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class CrimeLab {

    //region [private members]

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    //endregion

    //region [constructor]

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
    }

    //endregion

    //region [properties]

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }

        return sCrimeLab;
    }

    public List<Crime> getmCrimes() {
        return mCrimes;
    }


    //endregion
}
