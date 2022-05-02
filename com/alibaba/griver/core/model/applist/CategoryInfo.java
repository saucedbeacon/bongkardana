package com.alibaba.griver.core.model.applist;

import java.io.Serializable;

public class CategoryInfo implements Serializable {
    private String category;
    private String categoryId;

    public CategoryInfo() {
    }

    public CategoryInfo(String str, String str2) {
        this.category = str;
        this.categoryId = str2;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(String str) {
        this.categoryId = str;
    }
}
