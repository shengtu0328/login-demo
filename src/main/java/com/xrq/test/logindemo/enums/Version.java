package com.xrq.test.logindemo.enums;

public enum Version {

    V1("1.0"),
    V2("2.0");


    private String number;

    Version(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
