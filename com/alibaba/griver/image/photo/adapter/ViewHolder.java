package com.alibaba.griver.image.photo.adapter;

import android.util.SparseArray;
import android.view.View;

public class ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<View> f10494a = new SparseArray<>();
    private View b;

    public static ViewHolder get(View view) {
        Object tag = view.getTag();
        if (tag instanceof ViewHolder) {
            return (ViewHolder) tag;
        }
        return new ViewHolder(view);
    }

    private ViewHolder(View view) {
        this.b = view;
        view.setTag(this);
    }

    public <T extends View> T findViewById(int i) {
        T t = (View) this.f10494a.get(i);
        if (t != null) {
            return t;
        }
        T findViewById = this.b.findViewById(i);
        this.f10494a.put(i, findViewById);
        return findViewById;
    }
}
