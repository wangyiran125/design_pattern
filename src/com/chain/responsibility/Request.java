package com.chain.responsibility;

/**
 * Created by wyr on 2015/5/11.
 */
public class Request {
    private int value;
    private String description;

    public Request(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
