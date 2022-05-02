package com.alibaba.ariver.app.ui.tabbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;

public class RVTabbarLayout extends LinearLayout {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public List<RVTabBarItem> f9962a = new ArrayList();
    /* access modifiers changed from: private */
    public Listener b;

    public interface Listener {
        void onTabItemClicked(int i, View view);
    }

    public RVTabbarLayout(Context context) {
        super(context);
        a();
    }

    public RVTabbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public RVTabbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    private void a() {
        setOrientation(0);
    }

    public void addTab(int i, RVTabBarItem rVTabBarItem) {
        if (this.f9962a != null) {
            final View rootView = rVTabBarItem.getRootView();
            rootView.setTag(rVTabBarItem);
            rootView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    int indexOf = RVTabbarLayout.this.f9962a.indexOf((RVTabBarItem) view.getTag());
                    if (RVTabbarLayout.this.b != null) {
                        RVTabbarLayout.this.b.onTabItemClicked(indexOf, rootView);
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
            layoutParams.gravity = 17;
            rootView.setLayoutParams(layoutParams);
            rootView.setClickable(true);
            rootView.setFocusable(true);
            if (i >= 0) {
                this.f9962a.add(i, rVTabBarItem);
                addView(rootView, i);
                return;
            }
            this.f9962a.add(rVTabBarItem);
            addView(rootView);
        }
    }

    public RVTabBarItem getTabBarItemAt(int i) {
        return this.f9962a.get(i);
    }

    public void addTab(RVTabBarItem rVTabBarItem) {
        addTab(-1, rVTabBarItem);
    }

    public void removeTab(int i) {
        this.f9962a.remove(i);
        removeViewAt(i);
    }

    public void setTabListener(Listener listener) {
        this.b = listener;
    }

    private void b() {
        List<RVTabBarItem> list = this.f9962a;
        if (list != null) {
            for (RVTabBarItem rootView : list) {
                rootView.getRootView().setSelected(false);
            }
        }
    }

    public void selectTab(int i) {
        List<RVTabBarItem> list = this.f9962a;
        if (list != null) {
            if (i >= list.size()) {
                i = 0;
            }
            b();
            this.f9962a.get(i).getRootView().setSelected(true);
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        this.f9962a.clear();
    }

    public int getTabSize() {
        List<RVTabBarItem> list = this.f9962a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}
