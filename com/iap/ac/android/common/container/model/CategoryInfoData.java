package com.iap.ac.android.common.container.model;

public class CategoryInfoData {
    private String category;
    private String categoryId;

    public CategoryInfoData() {
    }

    public CategoryInfoData(String str, String str2) {
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
