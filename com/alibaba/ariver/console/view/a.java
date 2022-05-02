package com.alibaba.ariver.console.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.R;

public class a extends TextView {

    /* renamed from: a  reason: collision with root package name */
    private float f10054a;
    private float b;
    private float c;
    private float d;
    private int e;
    private int f;
    private int g = new ViewConfiguration().getScaledTouchSlop();

    public a(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        Resources resources = context.getResources();
        int color = resources.getColor(R.color.console_toggle_button_background);
        setText(resources.getString(R.string.console_toggle_button_text));
        setBackgroundColor(color);
        setTextSize(15.0f);
        setPadding(18, 12, 18, 12);
        setTextColor(-1);
    }

    public void a(int i, int i2) {
        this.e = i;
        this.f = i2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f10054a = motionEvent.getX();
            this.b = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.c = motionEvent.getX() - this.f10054a;
                this.d = motionEvent.getY() - this.b;
                a();
            }
        } else if (Math.abs(this.c) > ((float) this.g) || Math.abs(this.d) > ((float) this.g)) {
            a();
            this.b = 0.0f;
            this.f10054a = 0.0f;
            return true;
        } else {
            this.b = 0.0f;
            this.f10054a = 0.0f;
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    private void a() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.rightMargin = (int) (((float) layoutParams.rightMargin) - this.c);
        layoutParams.bottomMargin = (int) (((float) layoutParams.bottomMargin) - this.d);
        StringBuilder sb = new StringBuilder("updateViewPosition ");
        sb.append(this.e);
        sb.append(" ");
        sb.append(this.f);
        sb.append(" ");
        sb.append(this.c);
        sb.append(" ");
        sb.append(this.d);
        RVLogger.d("ConsoleToggleButton", sb.toString());
        int i = this.e;
        if (layoutParams.rightMargin <= 0) {
            layoutParams.rightMargin = 0;
        } else if (layoutParams.rightMargin + getWidth() > i) {
            layoutParams.rightMargin = i - getWidth();
        }
        int i2 = this.f;
        if (layoutParams.bottomMargin <= 0) {
            layoutParams.bottomMargin = 0;
        } else if (layoutParams.bottomMargin + getHeight() > i2) {
            layoutParams.bottomMargin = i2 - getHeight();
        }
        getParent().requestLayout();
    }
}
