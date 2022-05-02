package com.alibaba.griver.ui.blur;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import com.alibaba.griver.ui.R;
import com.alibaba.griver.ui.ant.text.AUTextView;

public class AUBubbleView extends AUTextView {
    public static final int POSITION_TOP_LEFT = 0;
    public static final int POSITION_TOP_MID = 2;
    public static final int POSITION_TOP_RIGHT = 1;

    /* renamed from: a  reason: collision with root package name */
    private AUBubbleDrawable f10574a;

    public AUBubbleView(Context context) {
        super(new ContextThemeWrapper(context, R.style.griver_BubbleViewStyle));
        a(context, (AttributeSet) null);
    }

    public AUBubbleView(Context context, AttributeSet attributeSet) {
        super(new ContextThemeWrapper(context, R.style.griver_BubbleViewStyle), attributeSet);
        a(context, attributeSet);
    }

    public AUBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(new ContextThemeWrapper(context, R.style.griver_BubbleViewStyle), attributeSet, i);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        int parseColor = Color.parseColor("#FF3B30");
        int i = 1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.griver_AUBubbleView);
            i = obtainStyledAttributes.getInt(R.styleable.griver_AUBubbleView_bubblePosition, 1);
            parseColor = obtainStyledAttributes.getColor(R.styleable.griver_AUBubbleView_bubbleColor, parseColor);
            obtainStyledAttributes.recycle();
        }
        AUBubbleDrawable aUBubbleDrawable = new AUBubbleDrawable();
        this.f10574a = aUBubbleDrawable;
        aUBubbleDrawable.setPosition(i);
        this.f10574a.setColor(parseColor);
        if (Build.VERSION.SDK_INT >= 16) {
            setBackground(this.f10574a);
        } else {
            setBackgroundDrawable(this.f10574a);
        }
        setGravity(17);
    }

    public void onMeasure(int i, int i2) {
        a();
        super.onMeasure(i, i2);
    }

    private void a() {
        double textSize = (double) getTextSize();
        Double.isNaN(textSize);
        double textSize2 = (double) (getTextSize() / 13.0f);
        int i = (int) (textSize / 2.2d);
        Double.isNaN(textSize2);
        setPadding(i, (int) textSize2, i, (int) (textSize2 * 1.5d));
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f10574a.setWidth(getWidth());
        this.f10574a.setHeight(getHeight());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, (-(((float) getHeight()) - this.f10574a.getBubbleHeight())) / 1.5f);
        super.onDraw(canvas);
        canvas.restore();
    }
}
