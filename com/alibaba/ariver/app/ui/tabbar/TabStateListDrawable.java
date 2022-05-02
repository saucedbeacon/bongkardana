package com.alibaba.ariver.app.ui.tabbar;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

public class TabStateListDrawable extends StateListDrawable {

    /* renamed from: a  reason: collision with root package name */
    private Drawable f9963a;
    private Drawable b;

    public void addCheckedState(Drawable drawable) {
        addState(new int[]{16842919}, drawable);
        addState(new int[]{16842913}, drawable);
        this.b = drawable;
        Drawable drawable2 = this.f9963a;
        if (drawable2 != null) {
            addNormalState(drawable2);
        }
    }

    public synchronized void addNormalState(Drawable drawable) {
        if (this.b == null) {
            this.f9963a = drawable;
        } else {
            addState(new int[0], drawable);
        }
    }
}
