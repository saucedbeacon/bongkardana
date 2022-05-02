package com.alipay.mobile.verifyidentity.base.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.List;

public abstract class ListViewAdapter<T> extends BaseAdapter {
    private int layoutId;
    protected Context mContext;
    protected List<T> mDatas;
    protected LayoutInflater mInflater;

    public abstract void convert(ViewHolder viewHolder, T t, int i);

    public long getItemId(int i) {
        return (long) i;
    }

    public ListViewAdapter(Context context, List<T> list, int i) {
        this.mContext = context;
        this.mInflater = LayoutInflater.from(context);
        this.mDatas = list;
        this.layoutId = i;
    }

    public int getCount() {
        return this.mDatas.size();
    }

    public T getItem(int i) {
        return this.mDatas.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder = ViewHolder.get(this.mContext, view, viewGroup, this.layoutId, i);
        convert(viewHolder, getItem(i), i);
        return viewHolder.getConvertView();
    }
}
