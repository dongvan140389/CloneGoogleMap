package com.example.dongvan.clonegooglemap.Module;

/**
 * Created by VoNga on 18-Apr-17.
 */

public class Duration {
    public String text;
    public int value;

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

    public Duration(String text, int value) {
        this.text = text;
        this.value = value;
    }
}
