package me.grantland.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import o.continuousFrame;
import o.createBinaryFrame;

public class AutofitLayout extends FrameLayout {
    private boolean mEnabled;
    private WeakHashMap<View, createBinaryFrame> mHelpers = new WeakHashMap<>();
    private float mMinTextSize;
    private float mPrecision;

    public AutofitLayout(Context context) {
        super(context);
        init(context, (AttributeSet) null, 0);
    }

    public AutofitLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0);
    }

    public AutofitLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i);
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        float f = -1.0f;
        int i2 = -1;
        boolean z = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, continuousFrame.getMin.AutofitTextView, i, 0);
            z = obtainStyledAttributes.getBoolean(continuousFrame.getMin.AutofitTextView_sizeToFit, true);
            i2 = obtainStyledAttributes.getDimensionPixelSize(continuousFrame.getMin.AutofitTextView_minTextSize, -1);
            f = obtainStyledAttributes.getFloat(continuousFrame.getMin.AutofitTextView_precision, -1.0f);
            obtainStyledAttributes.recycle();
        }
        this.mEnabled = z;
        this.mMinTextSize = (float) i2;
        this.mPrecision = f;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        TextView textView = (TextView) view;
        createBinaryFrame enabled = createBinaryFrame.create(textView).setEnabled(this.mEnabled);
        float f = this.mPrecision;
        if (f > 0.0f) {
            enabled.setPrecision(f);
        }
        float f2 = this.mMinTextSize;
        if (f2 > 0.0f) {
            enabled.setMinTextSize(0, f2);
        }
        this.mHelpers.put(textView, enabled);
    }

    public createBinaryFrame getAutofitHelper(TextView textView) {
        return this.mHelpers.get(textView);
    }

    public createBinaryFrame getAutofitHelper(int i) {
        return this.mHelpers.get(getChildAt(i));
    }
}
