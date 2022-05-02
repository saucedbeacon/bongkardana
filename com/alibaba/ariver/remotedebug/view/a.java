package com.alibaba.ariver.remotedebug.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.DisplayUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.R;

public class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private ImageView f9035a;
    private TextView b;
    private TextView c;
    private ViewGroup d;
    /* access modifiers changed from: private */
    public ActionEventListener e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j = 0;

    public a(Context context) {
        super(context);
        d();
    }

    private void d() {
        Context context = getContext();
        Activity activity = (Activity) context;
        this.d = (ViewGroup) activity.findViewById(16908290);
        ImageView imageView = new ImageView(context);
        this.f9035a = imageView;
        imageView.setBackgroundColor(-16711936);
        int density = (int) (DimensionUtil.getDensity(context) * 4.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(density, density);
        layoutParams.gravity = 16;
        layoutParams.setMargins(25, 0, 25, 0);
        this.f9035a.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setMinWidth((int) (DimensionUtil.getDensity(context) * 100.0f));
        this.b.setTextColor(-1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        layoutParams2.setMargins(0, 0, 25, 0);
        this.b.setLayoutParams(layoutParams2);
        this.b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
            }
        });
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextColor(-1);
        this.c.setText(R.string.remote_debug_exit);
        this.c.setPadding(0, 25, 25, 25);
        this.c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (a.this.e != null) {
                    a.this.e.exitRemoteDebug();
                }
            }
        });
        int titleAndStatusBarHeight = DisplayUtils.getTitleAndStatusBarHeight(activity);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 16;
        this.c.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 5;
        layoutParams4.rightMargin = 20;
        layoutParams4.topMargin = titleAndStatusBarHeight + 20;
        addView(this.f9035a);
        addView(this.b);
        addView(this.c);
        setOrientation(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#CC606066"));
        gradientDrawable.setCornerRadius(18.0f);
        setBackgroundDrawable(gradientDrawable);
        this.j = titleAndStatusBarHeight;
        this.d.addView(this, layoutParams4);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.h = motionEvent.getX();
            this.i = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.f = motionEvent.getX() - this.h;
                this.g = motionEvent.getY() - this.i;
                e();
            }
        } else if (Math.abs(this.f) > 3.0f || Math.abs(this.g) > 3.0f) {
            e();
            this.i = 0.0f;
            this.h = 0.0f;
            return true;
        } else {
            this.i = 0.0f;
            this.h = 0.0f;
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    private void e() {
        try {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.rightMargin = (int) (((float) layoutParams.rightMargin) - this.f);
            layoutParams.topMargin = (int) (((float) layoutParams.topMargin) + this.g);
            int width = this.d.getWidth();
            if (layoutParams.rightMargin <= 0) {
                layoutParams.rightMargin = 0;
            } else if (layoutParams.rightMargin + getWidth() > width) {
                layoutParams.rightMargin = width - getWidth();
            }
            if (layoutParams.topMargin < this.j) {
                layoutParams.topMargin = this.j;
            } else if (layoutParams.topMargin + getHeight() > this.d.getHeight()) {
                layoutParams.topMargin = this.d.getHeight() - getHeight();
            }
            this.d.updateViewLayout(this, layoutParams);
        } catch (Throwable th) {
            RVLogger.e(a.class.getSimpleName(), "updateViewPosition...e=".concat(String.valueOf(th)));
        }
    }

    public void setActionEventListener(ActionEventListener actionEventListener) {
        this.e = actionEventListener;
    }

    public void a() {
        this.f9035a.setBackgroundColor(-7829368);
        this.b.setText(R.string.tiny_remote_debug_connecting);
    }

    public void b() {
        this.f9035a.setBackgroundColor(-16711936);
        this.b.setText(R.string.tiny_remote_debug_connected);
    }

    public void c() {
        this.f9035a.setBackgroundColor(-65536);
        this.b.setText(R.string.tiny_remote_debug_disconnected);
    }

    public void setStateText(String str) {
        this.b.setText(str);
    }

    public void setExitText(String str) {
        this.c.setText(str);
    }
}
