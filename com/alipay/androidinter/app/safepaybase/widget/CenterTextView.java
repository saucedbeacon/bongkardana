package com.alipay.androidinter.app.safepaybase.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.alipay.mobile.verifyidentity.uitools.CustomUi;

public class CenterTextView extends TextView {
    private StaticLayout myStaticLayout;
    private TextPaint tp;

    public CenterTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        initView();
    }

    private void initView() {
        TextPaint textPaint = new TextPaint(1);
        this.tp = textPaint;
        textPaint.setTextSize(getTextSize());
        this.tp.setColor(getCurrentTextColor());
        this.myStaticLayout = new StaticLayout(getText(), this.tp, getWidth(), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        if (CustomUi.getContentTypeface() != null) {
            this.tp.setTypeface(CustomUi.getContentTypeface());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.myStaticLayout.draw(canvas);
    }
}
