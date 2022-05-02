package com.alibaba.griver.ui.ant.listview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.alibaba.griver.ui.R;

public class AUMaxItemListView extends AUListView {
    public static final int DEFAULT_MAX_ITEMS = 5;

    /* renamed from: a  reason: collision with root package name */
    private int f10564a;
    private float b;

    public AUMaxItemListView(Context context) {
        this(context, (AttributeSet) null);
    }

    public AUMaxItemListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AUMaxItemListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.griverAUInputBox);
        this.f10564a = obtainStyledAttributes.getInteger(R.styleable.griverMaxItemsHeightListView_maxItems, 5);
        this.b = obtainStyledAttributes.getDimension(R.styleable.griverMaxItemsHeightListView_singleItemHeight, getResources().getDimension(R.dimen.griver_AU_SPACE12));
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f10564a;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (((float) getResources().getDisplayMetrics().heightPixels) * 0.8f), (int) ((((float) i3) * this.b) + ((float) ((i3 - 1) * getDividerHeight())))), Integer.MIN_VALUE));
    }
}
