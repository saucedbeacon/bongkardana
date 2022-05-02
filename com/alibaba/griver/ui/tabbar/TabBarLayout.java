package com.alibaba.griver.ui.tabbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class TabBarLayout extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public List<View> f10625a = new ArrayList();
    private int b;
    /* access modifiers changed from: private */
    public H5TabListener c;

    public interface H5TabListener {
        void onTabItemClicked(int i, View view);
    }

    public TabBarLayout(Context context) {
        super(context);
        a();
    }

    public TabBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public TabBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        setOrientation(0);
    }

    public void addTab(int i, final View view) {
        if (this.f10625a != null) {
            view.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int indexOf = TabBarLayout.this.f10625a.indexOf(view);
                    if (TabBarLayout.this.c != null) {
                        TabBarLayout.this.c.onTabItemClicked(indexOf, view);
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            layoutParams.gravity = 17;
            view.setLayoutParams(layoutParams);
            view.setClickable(true);
            view.setFocusable(true);
            if (i >= 0) {
                this.f10625a.add(i, view);
                addView(view, i);
                return;
            }
            this.f10625a.add(view);
            addView(view);
        }
    }

    public void addTab(View view) {
        addTab(-1, view);
    }

    public void setTabListener(H5TabListener h5TabListener) {
        this.c = h5TabListener;
    }

    private void b() {
        List<View> list = this.f10625a;
        if (list != null) {
            for (View selected : list) {
                selected.setSelected(false);
            }
        }
    }

    public void selectTab(int i) {
        List<View> list = this.f10625a;
        if (list != null) {
            if (i >= list.size()) {
                i = 0;
            }
            b();
            this.f10625a.get(i).setSelected(true);
            this.b = i;
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        this.f10625a.clear();
        this.b = -1;
    }

    public int getSelectedIndex() {
        return this.b;
    }

    public int getTabSize() {
        List<View> list = this.f10625a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
