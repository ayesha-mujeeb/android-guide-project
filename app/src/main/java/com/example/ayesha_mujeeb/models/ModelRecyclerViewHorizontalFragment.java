package com.example.ayesha_mujeeb.models;

public class ModelRecyclerViewHorizontalFragment {

    private String textViewTag;
    private String textViewAppFullName;
    private String textViewAppFullDesc;

    private int imageViewAppPrev;
    private int imageViewAppFramelogo;

    private String textViewAppFrameName;
    private String textViewAppFrameDesc;

    public ModelRecyclerViewHorizontalFragment(String textViewTag, String textViewAppFullName, String textViewAppFullDesc, int imageViewAppPrev,
                                               int imageViewAppFramelogo, String textViewAppFrameName, String textViewAppFrameDesc) {
        this.textViewTag = textViewTag;
        this.textViewAppFullName = textViewAppFullName;
        this.textViewAppFullDesc = textViewAppFullDesc;
        this.imageViewAppPrev = imageViewAppPrev;
        this.imageViewAppFramelogo = imageViewAppFramelogo;
        this.textViewAppFrameName = textViewAppFrameName;
        this.textViewAppFrameDesc = textViewAppFrameDesc;
    }

    public String getTextViewTag() {
        return textViewTag;
    }

    public String getTextViewAppFullName() {
        return textViewAppFullName;
    }

    public String getTextViewAppFullDesc() {
        return textViewAppFullDesc;
    }

    public int getImageViewAppPrev() {
        return imageViewAppPrev;
    }

    public int getImageViewAppFramelogo() {
        return imageViewAppFramelogo;
    }

    public String getTextViewAppFrameName() {
        return textViewAppFrameName;
    }

    public String getTextViewAppFrameDesc() {
        return textViewAppFrameDesc;
    }
}
