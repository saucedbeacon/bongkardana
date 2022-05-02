package com.alibaba.griver.image.capture.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class CustomBgImageView extends ImageView {
    public CustomBgImageView(Context context) {
        super(context);
    }

    public CustomBgImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomBgImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        a();
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        a();
    }

    private void a() {
        if (getScaleType() == ImageView.ScaleType.FIT_CENTER) {
            setBackgroundColor(-16777216);
        } else {
            setBackgroundColor(0);
        }
    }
}
