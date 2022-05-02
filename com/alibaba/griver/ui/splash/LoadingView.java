package com.alibaba.griver.ui.splash;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.Map;

public abstract class LoadingView extends FrameLayout {
    public static final String TAG = "LoadingView";
    protected Activity hostActivity;
    protected OnCancelListener onCancelListener;

    public interface Factory {
        LoadingView createLoadingView(String str, String str2, Bundle bundle);
    }

    public interface OnCancelListener {
        void onCancel();
    }

    public abstract void onHandleMessage(String str, Map<String, Object> map);

    public abstract void onStart();

    public abstract void onStop();

    public LoadingView(Context context) {
        super(context);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setOnCancelListener(OnCancelListener onCancelListener2) {
        this.onCancelListener = onCancelListener2;
    }

    public void setHostActivity(Activity activity) {
        this.hostActivity = activity;
    }

    public final void start() {
        post(new Runnable() {
            public void run() {
                try {
                    LoadingView.this.onStart();
                } catch (Throwable th) {
                    RVLogger.e(LoadingView.TAG, th);
                }
            }
        });
    }

    public final void stop() {
        post(new Runnable() {
            public void run() {
                try {
                    LoadingView.this.onStop();
                } catch (Throwable th) {
                    RVLogger.e(LoadingView.TAG, th);
                }
            }
        });
    }

    public final void sendMessage(final String str, final Map<String, Object> map) {
        post(new Runnable() {
            public void run() {
                try {
                    LoadingView.this.onHandleMessage(str, map);
                } catch (Throwable th) {
                    RVLogger.e(LoadingView.TAG, th);
                }
            }
        });
    }

    public final void cancel() {
        OnCancelListener onCancelListener2 = this.onCancelListener;
        if (onCancelListener2 != null) {
            onCancelListener2.onCancel();
        }
    }

    public void performAnimation(String str, Animator.AnimatorListener animatorListener) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" animation not supported.");
        throw new IllegalArgumentException(sb.toString());
    }
}
