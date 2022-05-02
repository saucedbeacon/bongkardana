package com.alibaba.griver.core.jsapi.toast;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.core.R;
import com.google.android.exoplayer2.DefaultLoadControl;

public class PopupWindowToast extends PopupWindow implements Runnable {
    public static final int LONG_DELAY = 3500;
    public static final int SHORT_DELAY = 2000;

    /* renamed from: a  reason: collision with root package name */
    private Activity f10311a;
    private TextView b;
    private int c;
    private Handler d;

    public PopupWindowToast(Activity activity) {
        this(activity, 0);
    }

    public PopupWindowToast(Activity activity, int i) {
        this.c = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS;
        this.d = new Handler();
        this.f10311a = activity;
        a(activity, i);
    }

    private void a(Activity activity, int i) {
        View inflate = LayoutInflater.from(this.f10311a).inflate(R.layout.griver_core_toast, (ViewGroup) null);
        setWidth(-2);
        setHeight(-2);
        this.b = (TextView) inflate.findViewById(R.id.h5_mini_toast_text);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.h5_mini_toast_icon);
        if (i == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            imageView.setBackgroundResource(i);
        }
        setContentView(inflate);
    }

    public void run() {
        dismiss();
    }

    public void setMessage(int i) {
        this.b.setText(i);
    }

    public void setMessage(CharSequence charSequence) {
        Activity activity = this.f10311a;
        GriverLogger.debug("AUToast", "AUToastPopupWindow ".concat(String.valueOf(activity != null ? activity.getPackageName() : ", tipSrc:".concat(String.valueOf(charSequence)))));
        this.b.setText(charSequence);
    }

    public void showTime(int i) {
        this.c = i;
    }

    public void dismiss() {
        if (this.f10311a.isFinishing() || a()) {
            GriverLogger.d("AUToastPopupWindow", "Activity is finish");
        } else if (isShowing()) {
            GriverLogger.d("AUToastPopupWindow", "isShowing() == true");
            try {
                super.dismiss();
            } catch (IllegalArgumentException e) {
                GriverLogger.e("AUToastPopupWindow", "IllegalArgumentException: e".concat(String.valueOf(e)));
            }
        }
    }

    private boolean a() {
        return Build.VERSION.SDK_INT >= 17 && this.f10311a.isDestroyed();
    }

    public void show() {
        if (this.f10311a.isFinishing() || a()) {
            GriverLogger.d("AUToastPopupWindow", "Activity is finish");
            return;
        }
        showAtLocation(this.f10311a.findViewById(16908290), 17, 0, 0);
        this.d.postDelayed(this, (long) this.c);
    }
}
