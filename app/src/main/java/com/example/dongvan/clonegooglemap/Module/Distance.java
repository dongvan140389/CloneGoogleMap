package com.example.dongvan.clonegooglemap.Module;

/**
 * Created by VoNga on 18-Apr-17.
 */

public class Distance {
    private String text;
    private int value;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Distance(String text, int value) {
        this.text = text;
        this.value = value;
    }
}
