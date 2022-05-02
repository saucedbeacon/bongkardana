package com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.multilevel;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.text.AUTextView;

public class MultilevelSelectAdapter extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f10581a;
    private JSONArray b;

    public long getItemId(int i) {
        return (long) i;
    }

    public MultilevelSelectAdapter(JSONArray jSONArray, Activity activity) {
        this.b = jSONArray;
        this.f10581a = activity;
    }

    public int getCount() {
        return this.b.size();
    }

    public Object getItem(int i) {
        return this.b.getJSONObject(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f10581a).inflate(R.layout.griver_ui_single_item, viewGroup, false);
        }
        ((AUTextView) view.findViewById(R.id.griver_item_text)).setText(((JSONObject) getItem(i)).getString("name"));
        return view;
    }
}
