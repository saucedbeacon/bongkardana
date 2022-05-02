package com.alibaba.griver.ui.ant.listview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.griver.ui.R;

public class AUMaxItemCornerListView extends AUCornerListView {

    /* renamed from: a  reason: collision with root package name */
    private float f10563a;
    private float b;

    public AUMaxItemCornerListView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AUMaxItemCornerListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AUMaxItemCornerListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.griverAUInputBox);
        this.f10563a = (float) obtainStyledAttributes.getInt(R.styleable.griverMaxItemsHeightListView_maxItems, 5);
        this.b = obtainStyledAttributes.getDimension(R.styleable.griverMaxItemsHeightListView_singleItemHeight, getResources().getDimension(R.dimen.griver_AU_SPACE12));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        float f = this.f10563a;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (((float) getResources().getDisplayMetrics().heightPixels) * 0.8f), (int) ((this.b * f) + ((f - 1.0f) * ((float) getDividerHeight())))), Integer.MIN_VALUE));
    }

    public void setMaxItems(float f) {
        this.f10563a = f;
    }

    public void setSingleItemHeight(float f) {
        this.b = f;
    }
}
