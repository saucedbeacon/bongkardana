package com.alibaba.griver.ui.tabbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.griver.ui.R;

public class TabBarItem {

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f10624a;
    private TextView b;
    private TextView c = ((TextView) this.f10624a.findViewById(R.id.h5_tabbaritem_badge));
    private DotView d = ((DotView) this.f10624a.findViewById(R.id.h5_tabbaritem_dotView));

    public TabBarItem(Context context) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.griver_ui_tabbaritem, (ViewGroup) null);
        this.f10624a = relativeLayout;
        this.b = (TextView) relativeLayout.findViewById(R.id.h5_tabbaritem_txticon);
    }

    public View getRootView() {
        return this.f10624a;
    }

    public View getIconAreaView() {
        return this.b;
    }

    public View getBadgeAreaView() {
        return this.c;
    }

    public DotView getSmallDotView() {
        return this.d;
    }

    public String getTag() {
        return (String) this.f10624a.getTag();
    }

    public void setTag(String str) {
        this.f10624a.setTag(str);
    }
}
