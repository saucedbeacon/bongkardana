package com.alibaba.griver.ui.ant.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import com.alibaba.griver.base.common.logger.GriverLogger;

public class AUScrollLayout extends AULinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10559a = AUScrollLayout.class.getSimpleName();
    private boolean b;
    private int c = 0;
    private boolean d = true;

    public AUScrollLayout(Context context) {
        super(context);
        a();
    }

    public AUScrollLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public void setDivideAutoSize(boolean z) {
        this.d = z;
    }

    private void a() {
        DisplayMetrics displayMetrics;
        Resources resources = getResources();
        if (!(resources == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
            this.c = displayMetrics.widthPixels;
        }
        String str = f10559a;
        StringBuilder sb = new StringBuilder("1111, maxWidth:");
        sb.append(this.c);
        GriverLogger.debug(str, sb.toString());
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int paddingLeft = getPaddingLeft();
        String str = f10559a;
        StringBuilder sb = new StringBuilder("2222, maxWidth:");
        sb.append(this.c);
        sb.append(" ,widthMeasureSpec:");
        sb.append(i);
        GriverLogger.debug(str, sb.toString());
        int paddingRight = getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                int measuredWidth = childAt.getMeasuredWidth();
                GriverLogger.debug(f10559a, "3333, childWidth:".concat(String.valueOf(measuredWidth)));
                int i4 = measuredWidth + paddingLeft;
                if (i4 + paddingRight > this.c) {
                    this.b = false;
                } else {
                    this.b = true;
                    paddingLeft = i4;
                }
            }
        }
        if (this.b) {
            setMeasuredDimension(this.c, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        String str = f10559a;
        StringBuilder sb = new StringBuilder("divideAutoSize:");
        sb.append(this.d);
        sb.append(", noScroll:");
        sb.append(this.b);
        sb.append(", maxWidth:");
        sb.append(this.c);
        GriverLogger.debug(str, sb.toString());
        if (!this.b || !this.d) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int paddingTop = getPaddingTop();
        int i5 = this.c / childCount;
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
                int paddingLeft = childAt.getPaddingLeft() + ((i5 - childAt.getMeasuredWidth()) / 2);
                childAt.setPadding(paddingLeft, childAt.getPaddingTop(), paddingLeft, childAt.getPaddingBottom());
                childAt.setLayoutParams(layoutParams);
                int i7 = i6 * i5;
                childAt.layout(i7, paddingTop, i7 + i5, childAt.getMeasuredHeight() + paddingTop);
            }
        }
    }
}
