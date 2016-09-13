package com.example.android.miwok;

/**
 * Created by pedro on 13/09/16.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;

    public Word(String mMiwokTranslation, String mDefaultTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }
}
