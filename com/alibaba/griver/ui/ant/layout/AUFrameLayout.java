package com.alibaba.griver.ui.ant.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.griver.ui.ant.api.AUViewInterface;
import com.alibaba.griver.ui.ant.utils.AUAttrsUtils;
import com.alibaba.griver.ui.ant.utils.AUScreenUtils;

public class AUFrameLayout extends FrameLayout implements AUViewInterface {

    /* renamed from: a  reason: collision with root package name */
    private Boolean f10556a;

    public AUFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (AUScreenUtils.checkApFlag(context, attributeSet, this)) {
            AUAttrsUtils.adptApPadding(this, context);
        }
    }

    public AUFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (AUScreenUtils.checkApFlag(context, attributeSet, this)) {
            AUAttrsUtils.adptApPadding(this, context);
        }
    }

    public AUFrameLayout(Context context) {
        super(context);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        if (!AUScreenUtils.checkApFlag(getContext(), attributeSet, this)) {
            return super.generateLayoutParams(attributeSet);
        }
        int[] viewSizeAndMargin = AUAttrsUtils.getViewSizeAndMargin(getContext(), AUAttrsUtils.handleAttrs(attributeSet));
        FrameLayout.LayoutParams generateLayoutParams = super.generateLayoutParams(attributeSet);
        AUAttrsUtils.replaceLayoutParam(getContext(), generateLayoutParams, viewSizeAndMargin);
        return generateLayoutParams;
    }

    public void addView(View view) {
        a(view);
        super.addView(view);
    }

    private void a(View view) {
        if (view instanceof AUViewInterface) {
            AUViewInterface aUViewInterface = (AUViewInterface) view;
            if (aUViewInterface.isAP() == null) {
                aUViewInterface.setAP(isAP());
            }
        }
    }

    public void addView(View view, int i) {
        a(view);
        super.addView(view, i);
    }

    public void addView(View view, int i, int i2) {
        a(view);
        super.addView(view, i, i2);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
        super.addView(view, layoutParams);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a(view);
        super.addView(view, i, layoutParams);
    }

    public Boolean isAP() {
        return this.f10556a;
    }

    public void setAP(Boolean bool) {
        this.f10556a = bool;
    }
}
