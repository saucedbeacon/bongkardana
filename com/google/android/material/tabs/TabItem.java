package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.R;
import o.prepareFromUri;

public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        prepareFromUri min = prepareFromUri.setMin(context, attributeSet, R.styleable.TabItem);
        this.text = min.setMin.getText(R.styleable.TabItem_android_text);
        this.icon = min.setMax(R.styleable.TabItem_android_icon);
        this.customLayout = min.setMin.getResourceId(R.styleable.TabItem_android_layout, 0);
        min.setMin.recycle();
    }
}
