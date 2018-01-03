package com.example.android.miwok;

/**
 * Created by Andy Tenholder on 11/4/2016.
 */

public class Word {
    /** Defualt translation for the word*/
    private String mDefaultTranslation;

    /** Miwok translation for the word*/
    private String mMiwokTranslation;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResource;






    public Word (String defaultTranslation, String miwokTranslation, int audioResource){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResource = audioResource;
        }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResource){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResource = audioResource;
        }

    /** Gets default translation for the word*/
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /** Gets miwok translation for the word*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceID() {return mImageResourceID;}

    public int getAudioResource() {return mAudioResource;}

    public boolean hasImage() {
        if (mImageResourceID < 0){
            return false;
        }else{
            return true;
        }
    }
}
