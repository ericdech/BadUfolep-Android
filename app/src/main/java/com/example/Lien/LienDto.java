package com.example.Lien;

import android.app.Application;

public class LienDto extends Application {

    private String someVariable = "192.168.1.52:8080";

    public String getSomeVariable() {
        return someVariable;
    }

    public void setSomeVariable(String someVariable) {
        this.someVariable = someVariable;
    }
}