package com.example.miwokapp;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageResourceId;
    private boolean isphrases = true;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation,int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
        isphrases = false;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImageResourceId(){ return imageResourceId; }
    public boolean isPhrasesActivity(){ return isphrases; }
}
