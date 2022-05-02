package com.alipay.mobile.verifyidentity.business.activity;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.alipay.StatusBarUtil;
import com.alipay.mobile.verifyidentity.uitools.CustomUi;
import com.google.common.base.Ascii;
import java.lang.ref.WeakReference;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public abstract class BaseActivity extends Activity {
    protected static final int MSG_SHOW_SUBMITTING = 1000;
    protected static final long SHOW_SUBMITTING_DELAY = 50;
    public static final byte[] getMin = {70, -85, 0, 0, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int length = 227;
    protected HandlerCallback handlerCallback;
    private long initSubmittingTime;
    protected Dialog submittingDialog;
    protected WeakHandler weakHandler;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(byte r7, short r8, short r9) {
        /*
            int r7 = r7 * 45
            int r7 = 101 - r7
            int r9 = r9 * 165
            int r9 = r9 + 11
            int r8 = r8 + 4
            byte[] r0 = getMin
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L_0x0030
        L_0x0017:
            r3 = 0
        L_0x0018:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L_0x0027
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0027:
            byte r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r6
        L_0x0030:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + -2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.activity.BaseActivity.setMax(byte, short, short):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public abstract void initData();

    /* access modifiers changed from: protected */
    public abstract void modifyViewFromOutside();

    public void showSubmittingDialog() {
        this.initSubmittingTime = System.currentTimeMillis();
        this.weakHandler.sendEmptyMessageDelayed(1000, SHOW_SUBMITTING_DELAY);
    }

    /* access modifiers changed from: protected */
    public void cancelSubmittingDialog() {
        this.weakHandler.removeMessages(1000);
    }

    public void hideSubmittingDialog() {
        if (System.currentTimeMillis() - this.initSubmittingTime <= SHOW_SUBMITTING_DELAY) {
            cancelSubmittingDialog();
        }
        Dialog dialog = this.submittingDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = getMin;
        String max2 = setMax((byte) bArr[2], (short) bArr[85], (byte) bArr[96]);
        byte[] bArr2 = getMin;
        String max3 = setMax((byte) bArr2[96], 174, (byte) bArr2[2]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(665529984, oncanceled);
            onCancelLoad.getMin(665529984, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 665529984 == (max = dispatchOnCancelled.getMax(applicationContext2, 665529984)))) {
            onCanceled oncanceled2 = new onCanceled(665529984, max, 512);
            onCancelLoad.setMax(665529984, oncanceled2);
            onCancelLoad.getMin(665529984, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(665529984, oncanceled3);
            onCancelLoad.getMin(665529984, oncanceled3);
        }
        super.onCreate(bundle);
        this.weakHandler = new WeakHandler(this);
    }

    public void onResume() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(602467299, oncanceled);
            onCancelLoad.getMin(602467299, oncanceled);
        }
        super.onResume();
        modifyStatusBg();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        SecTouchInterface secTouchInterface;
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1158662407, oncanceled);
            onCancelLoad.getMin(-1158662407, oncanceled);
        }
        if (motionEvent.getActionMasked() == 0 && (secTouchInterface = SecVIVerify.secTouchInterface) != null) {
            secTouchInterface.touchListener(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public WeakHandler getWeakHandler() {
        return this.weakHandler;
    }

    public void registerHandlerCallback(HandlerCallback handlerCallback2) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-25150790, oncanceled);
            onCancelLoad.getMin(-25150790, oncanceled);
        }
        this.handlerCallback = handlerCallback2;
    }

    public static class WeakHandler<T extends BaseActivity> extends Handler {
        WeakReference<T> mActivityReference;

        WeakHandler(T t) {
            this.mActivityReference = new WeakReference<>(t);
        }

        public void handleMessage(Message message) {
            WeakReference<T> weakReference = this.mActivityReference;
            if (weakReference != null && weakReference.get() != null) {
                if (message.what == 1000) {
                    if (!((BaseActivity) this.mActivityReference.get()).isFinishing()) {
                        if (((BaseActivity) this.mActivityReference.get()).submittingDialog == null) {
                            ((BaseActivity) this.mActivityReference.get()).submittingDialog = CustomUi.createLoadingDialog((Activity) this.mActivityReference.get());
                        }
                        ((BaseActivity) this.mActivityReference.get()).submittingDialog.show();
                    }
                } else if (((BaseActivity) this.mActivityReference.get()).handlerCallback != null) {
                    ((BaseActivity) this.mActivityReference.get()).handlerCallback.handleMessage(message);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        initData();
        modifyViewFromOutside();
    }

    /* access modifiers changed from: protected */
    public void modifyStatusBg() {
        String statusBarBgStrColor = ActivityInterfaceManager.getCommonActivityInterface().statusBarBgStrColor();
        if (!TextUtils.isEmpty(statusBarBgStrColor)) {
            StatusBarUtil.setColor(this, Color.parseColor(statusBarBgStrColor));
        }
    }

    public void onDestroy() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(289993806, oncanceled);
            onCancelLoad.getMin(289993806, oncanceled);
        }
        super.onDestroy();
        this.weakHandler.removeCallbacksAndMessages((Object) null);
        hideSubmittingDialog();
    }

    private boolean isNavigationBarShow() {
        if (Build.VERSION.SDK_INT >= 17) {
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            Point point = new Point();
            Point point2 = new Point();
            defaultDisplay.getSize(point);
            defaultDisplay.getRealSize(point2);
            return point2.y != point.y;
        }
        return !ViewConfiguration.get(this).hasPermanentMenuKey() && !KeyCharacterMap.deviceHasKey(4);
    }

    public int getNavigationBarHeight() {
        if (!isNavigationBarShow()) {
            return 0;
        }
        try {
            Resources resources = getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        } catch (Throwable unused) {
            return 0;
        }
    }
}
