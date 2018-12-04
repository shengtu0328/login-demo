package com.xrq.test.logindemo.enums;

public enum Permission {

    ADMITTED(1,"有权限"),
    DENIED(0,"没权限");


    private int state;

    private String stateInfo;

    Permission(int state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }
}
