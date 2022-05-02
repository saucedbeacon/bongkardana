package com.alibaba.ariver.app.ui.tabbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.alibaba.ariver.app.R;

public class RVTabBarItem {

    /* renamed from: a  reason: collision with root package name */
    private RelativeLayout f9960a;
    private TextView b;
    private TextView c = ((TextView) this.f9960a.findViewById(R.id.ariver_tabbar_item_badge));
    private RVTabDotView d = ((RVTabDotView) this.f9960a.findViewById(R.id.ariver_tabbar_item_dot_view));

    public RVTabBarItem(Context context) {
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(context).inflate(R.layout.ariver_tabbar_item, (ViewGroup) null);
        this.f9960a = relativeLayout;
        this.b = (TextView) relativeLayout.findViewById(R.id.ariver_tabbar_item_text);
    }

    public View getRootView() {
        return this.f9960a;
    }

    public TextView getIconAreaView() {
        return this.b;
    }

    public TextView getBadgeAreaView() {
        return this.c;
    }

    public RVTabDotView getSmallDotView() {
        return this.d;
    }

    public void setTag(String str) {
        this.f9960a.setTag(str);
    }

    public String getTag() {
        return (String) this.f9960a.getTag();
    }
}
