package com.zoloz.android.phone.zdoc.render;

import android.view.View;

public abstract class BaseRender {
    protected View view;

    /* access modifiers changed from: protected */
    public abstract void renderBg();

    /* access modifiers changed from: protected */
    public abstract void renderColor();

    /* access modifiers changed from: protected */
    public abstract void renderLabel();

    public BaseRender(View view2) {
        this.view = view2;
    }

    public void render() {
        if (this.view != null) {
            renderBg();
            renderLabel();
            renderColor();
        }
    }
}
