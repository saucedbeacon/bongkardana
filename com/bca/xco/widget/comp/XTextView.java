package com.bca.xco.widget.comp;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class XTextView extends TextView {
    private Context getMin;

    public XTextView(Context context) {
        super(context);
        this.getMin = context;
        a(context, 0);
    }

    public XTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.getMin = context;
        a(context, 0);
    }

    public XTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.getMin = context;
        a(context, 0);
    }

    public void a(Context context, int i) {
        int min;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-2040145257, oncanceled);
            onCancelLoad.getMin(-2040145257, oncanceled);
        }
        if (i == 1) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Bold.ttf"));
        } else {
            setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Regular.ttf"));
        }
    }
}
