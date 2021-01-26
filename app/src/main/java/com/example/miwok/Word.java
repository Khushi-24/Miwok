package com.example.miwok;

import java.util.ArrayList;

public class Word {

    private String mMiwokTranslation;

    private  String mDefaultTranslation;

    private int mResourceId = NO_RESOURCE_ID;

    private static final int NO_RESOURCE_ID =-1;

    public Word(String miwokTranslation, String defaultTranslation){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public Word(String miwokTranslation, String defaultTranslation, int resouceId){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mResourceId = resouceId;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getImageResourceId(){
        return mResourceId;
    }

    public Boolean hasImage()
    {
        return mResourceId != NO_RESOURCE_ID;
    }
}
