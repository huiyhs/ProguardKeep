package com.ganji.android.proguard;

import android.support.annotation.Keep;

/**
 * Created by huiyh on 2016/12/16.
 */

@Keep
public class KeepClassEntry {
    public int num;
    public String name;
    public boolean isEntry;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEntry() {
        return isEntry;
    }

    public void setEntry(boolean entry) {
        isEntry = entry;
    }

    public String findDesc(){
        return "";
    }
}
