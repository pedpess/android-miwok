package com.example.android.miwok;

import android.media.MediaPlayer;

/**
 * Created by pedro on 13/09/16.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_MEDIA_PROVIDED = -1;
    private int mMediaResourceId = NO_MEDIA_PROVIDED;

    public Word(String mMiwokTranslation, String mDefaultTranslation, int mMediaResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMediaResourceId = mMediaResourceId;
    }

    public Word(String mMiwokTranslation, String mDefaultTranslation, int mImageResourceId, int mMediaResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mMediaResourceId = mMediaResourceId;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmMediaResourceId() {
        return mMediaResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasMedia() {
        return mMediaResourceId != NO_MEDIA_PROVIDED;
    }
}
