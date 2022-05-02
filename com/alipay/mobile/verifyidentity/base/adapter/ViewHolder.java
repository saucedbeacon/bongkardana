package com.alipay.mobile.verifyidentity.base.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ViewHolder {
    private View mConvertView;
    private int mPosition;
    private SparseArray<View> mViews = new SparseArray<>();

    public ViewHolder(Context context, ViewGroup viewGroup, int i, int i2) {
        this.mPosition = i2;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.mConvertView = inflate;
        inflate.setTag(this);
    }

    public static ViewHolder get(Context context, View view, ViewGroup viewGroup, int i, int i2) {
        if (view == null) {
            return new ViewHolder(context, viewGroup, i, i2);
        }
        ViewHolder viewHolder = (ViewHolder) view.getTag();
        viewHolder.mPosition = i2;
        return viewHolder;
    }

    public <T extends View> T getView(int i) {
        T t = (View) this.mViews.get(i);
        if (t != null) {
            return t;
        }
        T findViewById = this.mConvertView.findViewById(i);
        this.mViews.put(i, findViewById);
        return findViewById;
    }

    public View getConvertView() {
        return this.mConvertView;
    }
}
