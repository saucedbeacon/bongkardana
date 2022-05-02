package com.iap.ac.android.acs.plugin.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import androidx.annotation.NonNull;

public class ConstraintHeightListView extends ListView {
    private int mMaxHeight;

    public ConstraintHeightListView(@NonNull Context context) {
        super(context);
    }

    public ConstraintHeightListView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConstraintHeightListView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.mMaxHeight;
        if (i3 > 0 && i3 <= size) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        this.mMaxHeight = i;
    }
}
