package com.example.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {
    //region [private members]

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    //endregion

    //region [constructor]

    public Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    //endregion

    //region [getter, setter]

    public String getTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public UUID getmId() {
        return mId;
    }

    //endregion
}
