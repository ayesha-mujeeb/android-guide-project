package com.example.ayesha_mujeeb;

public class ModelRecyclerView {

    private int imageViewAppIcon;
    private String textViewAppName;
    private String textViewAppDesc;
    private String divider;

    ModelRecyclerView(int imageViewAppIcon, String textViewAppName, String textViewAppDesc, String divider) {
        this.imageViewAppIcon = imageViewAppIcon;
        this.textViewAppName = textViewAppName;
        this.textViewAppDesc = textViewAppDesc;
        this.divider = divider;
    }

    public int getImageViewAppIcon() {
        return imageViewAppIcon;
    }

    public String getTextViewAppName() {
        return textViewAppName;
    }

    public String getTextViewAppDesc() {
        return textViewAppDesc;
    }

    public String getDivider() {
        return divider;
    }
}
