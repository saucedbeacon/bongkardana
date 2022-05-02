package com.alibaba.griver.ui.ant.model;

import android.graphics.drawable.Drawable;
import java.util.HashMap;

public class PopMenuItem {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f9107a;
    private int b = 0;
    private HashMap<String, Object> c;
    private Drawable d;
    private int e;

    public PopMenuItem(CharSequence charSequence) {
        this.f9107a = charSequence;
    }

    public CharSequence getName() {
        return this.f9107a;
    }

    public void setName(CharSequence charSequence) {
        this.f9107a = charSequence;
    }

    public int getResId() {
        return this.b;
    }

    public void setResId(int i) {
        this.b = i;
    }

    public void setDrawable(Drawable drawable) {
        this.d = drawable;
    }

    public Drawable getDrawable() {
        return this.d;
    }

    public HashMap<String, Object> getExternParam() {
        return this.c;
    }

    public void setExternParam(HashMap<String, Object> hashMap) {
        this.c = hashMap;
    }

    public int getType() {
        return this.e;
    }

    public void setType(int i) {
        this.e = i;
    }
}
