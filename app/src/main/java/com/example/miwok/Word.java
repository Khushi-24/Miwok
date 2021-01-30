package com.example.miwok;

import java.util.ArrayList;

public class Word {

    private String mMiwokTranslation;

    private  String mDefaultTranslation;

    private int mResourceId = NO_RESOURCE_ID;

    private int mAudioFilePosition = NO_RESOURCE_ID;

    private static final int NO_RESOURCE_ID =-1;

    public Word(String miwokTranslation, String defaultTranslation, int AudioFilePosition ){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioFilePosition = AudioFilePosition;
    }

    public Word(String miwokTranslation, String defaultTranslation, int resouceId, int AudioFilePosition){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mResourceId = resouceId;
        mAudioFilePosition = AudioFilePosition;
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

    public int getAudioFilePosition(){
        return mAudioFilePosition;
    }

    public Boolean hasImage()
    {
        return mResourceId != NO_RESOURCE_ID;
    }
}
