package com.example.ayesha_mujeeb.models;

public class ModelRecyclerViewVerticalFragment {

    private int imageViewAppIcon;
    private String textViewAppName;
    private String textViewAppDesc;

    public ModelRecyclerViewVerticalFragment(int imageViewAppIcon, String textViewAppName, String textViewAppDesc) {
        this.imageViewAppIcon = imageViewAppIcon;
        this.textViewAppName = textViewAppName;
        this.textViewAppDesc = textViewAppDesc;
    }

    public int getImageViewAppIcon() {
        return imageViewAppIcon;
    }

    public void setImageViewAppIcon(int imageViewAppIcon) {
        this.imageViewAppIcon = imageViewAppIcon;
    }

    public String getTextViewAppName() {
        return textViewAppName;
    }

    public void setTextViewAppName(String textViewAppName) {
        this.textViewAppName = textViewAppName;
    }

    public String getTextViewAppDesc() {
        return textViewAppDesc;
    }

    public void setTextViewAppDesc(String textViewAppDesc) {
        this.textViewAppDesc = textViewAppDesc;
    }
}
