package com.alibaba.griver.core.model.applist;

import java.io.Serializable;

public class AppCategory implements Serializable {
    private String identifier;
    private String name;

    public AppCategory(String str, String str2) {
        this.name = str;
        this.identifier = str2;
    }

    public AppCategory() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String str) {
        this.identifier = str;
    }
}
