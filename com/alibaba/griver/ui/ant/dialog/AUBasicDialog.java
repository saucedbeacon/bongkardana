package com.alibaba.griver.ui.ant.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.ui.ant.api.AUPopSupportPreemption;
import com.alibaba.griver.ui.ant.dialog.PopManager;
import com.alibaba.griver.ui.ant.utils.ViewUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import o.restorePresenterStates;

public class AUBasicDialog extends Dialog implements AUPopSupportPreemption {
    public static final int PRIORITY_BELOW_CDP = 40;
    public static final int PRIORITY_BETWEEN_CDP_SHARE_TOKEN = 55;
    public static final int PRIORITY_BIZ = 100;
    public static final int PRIORITY_CDP = 50;
    public static final int PRIORITY_SHARE_TOKEN = 60;
    public static final int PRIORITY_UNDEFINED = 0;

    /* renamed from: a  reason: collision with root package name */
    private Handler f10548a = new Handler(Looper.getMainLooper());
    private DialogInterface.OnDismissListener b = null;
    private DialogInterface.OnCancelListener c = null;
    private int d = 100;
    private boolean e;
    protected Context mContext;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    public AUBasicDialog(@NonNull Context context) {
        super(context);
        this.e = Looper.myLooper() == Looper.getMainLooper();
        this.mContext = context;
    }

    public AUBasicDialog(@NonNull Context context, int i) {
        super(context, i);
        this.e = Looper.myLooper() == Looper.getMainLooper();
        this.mContext = context;
    }

    protected AUBasicDialog(@NonNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.e = Looper.myLooper() == Looper.getMainLooper();
        this.mContext = context;
    }

    public void show(int i) {
        this.d = i;
        show();
    }

    public void show() {
        if (!a()) {
            GriverLogger.d("AUBasicDialog", "Activity is finish:".concat(String.valueOf(this)));
        } else if (!PopManager.isOpen()) {
            StringBuilder sb = new StringBuilder("direct show:");
            sb.append(this.mContext);
            sb.append(",");
            sb.append(this);
            GriverLogger.d("AUBasicDialog", sb.toString());
            super.show();
        } else {
            PopManager.PopBean findPop = PopManager.findPop(this);
            if (findPop == null || !findPop.isRegister) {
                PopManager.show(this);
            } else if (!findPop.isQueue) {
                StringBuilder sb2 = new StringBuilder("show:");
                sb2.append(this.mContext);
                sb2.append(",");
                sb2.append(this);
                GriverLogger.d("AUBasicDialog", sb2.toString());
                super.show();
            }
        }
    }

    public void dismiss() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            PopManager.dismiss(this);
        } else {
            this.f10548a.post(new Runnable() {
                public void run() {
                    PopManager.dismiss(AUBasicDialog.this);
                }
            });
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder sb = new StringBuilder("onDetachedFromWindow:");
        sb.append(this.mContext);
        sb.append(",");
        sb.append(this);
        GriverLogger.d("AUBasicDialog", sb.toString());
        PopManager.dismiss(this);
    }

    private boolean a() {
        Activity activityByContext;
        Context context = this.mContext;
        if (context == null || (activityByContext = ViewUtils.getActivityByContext(context)) == null) {
            return false;
        }
        if (!activityByContext.isFinishing() && !activityByContext.isDestroyed()) {
            return true;
        }
        StringBuilder sb = new StringBuilder("Activity is finish,name=");
        sb.append(activityByContext.getClass().getName());
        GriverLogger.d("AUDialog", sb.toString());
        return false;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        restorePresenterStates.length(getContext()).setMin(new Intent("com.alipay.mobile.antui.basic.AUBasicDialog"));
    }

    public Activity getPopActivity() {
        return ViewUtils.getActivityByContext(getContext());
    }

    public void showPop() {
        show();
    }

    public int getPriority() {
        return this.d;
    }

    public void setPriority(int i) {
        this.d = i;
    }

    public void onPreemption() {
        GriverLogger.d("AUBasicDialog", "onPreemption:".concat(String.valueOf(this)));
        super.setOnCancelListener((DialogInterface.OnCancelListener) null);
        super.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dismissPop();
        super.setOnCancelListener(this.c);
        super.setOnDismissListener(this.b);
    }

    public void dismissPop() {
        if (Looper.myLooper() != Looper.getMainLooper() && !a()) {
            GriverLogger.d("AUBasicDialog", "Activity is finish:".concat(String.valueOf(this)));
        } else if (isShowing()) {
            try {
                GriverLogger.d("AUBasicDialog", "isShowing() == true, dismiss:".concat(String.valueOf(this)));
                super.dismiss();
            } catch (IllegalArgumentException e2) {
                GriverLogger.e("AUBasicDialog", "IllegalArgumentException: e".concat(String.valueOf(e2)));
            }
        }
    }

    public void setContentView(View view) {
        if (view != null) {
            super.setContentView(view);
        }
    }

    /* access modifiers changed from: protected */
    public void setWindowMaxWidth(int i) {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        getWindow().setAttributes(attributes);
        View decorView = getWindow().getDecorView();
        if (decorView != null) {
            decorView.setPadding(i, 0, i, 0);
        }
    }

    public boolean isCreateInUIThread() {
        return this.e;
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.c = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.b = onDismissListener;
        super.setOnDismissListener(onDismissListener);
    }
}
