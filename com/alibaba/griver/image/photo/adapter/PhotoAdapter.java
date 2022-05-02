package com.alibaba.griver.image.photo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import java.util.List;

public class PhotoAdapter<T> extends BaseAdapter {
    protected Context context;
    protected List<T> dataList;

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    public PhotoAdapter(Context context2, List<T> list) {
        ArrayList arrayList = new ArrayList();
        this.dataList = arrayList;
        this.context = context2;
        if (list != null) {
            arrayList.addAll(list);
        }
    }

    public void addDatas(List<T> list) {
        this.dataList.addAll(list);
    }

    public int getCount() {
        List<T> list = this.dataList;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Object getItem(int i) {
        return this.dataList.get(i);
    }

    public void setData(List<T> list) {
        if (list != null && !list.isEmpty()) {
            this.dataList.clear();
            this.dataList.addAll(list);
            notifyDataSetChanged();
        }
    }

    public List<T> getData() {
        return this.dataList;
    }
}
