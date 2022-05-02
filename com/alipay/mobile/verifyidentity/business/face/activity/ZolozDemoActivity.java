package com.alipay.mobile.verifyidentity.business.face.activity;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import com.alipay.mobile.verifyidentity.business.activity.ProductActivity;
import com.alipay.mobile.verifyidentity.business.face.R;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class ZolozDemoActivity extends ProductActivity {
    public static final int IsOverlapping = 149;
    public static finishCallBack mfinishCallBack;
    public static final byte[] setMax = {70, -85, 0, 0, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    private CountDownTimer king;

    public interface finishCallBack {
        void finish();
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 * 175
            int r8 = 179 - r8
            int r7 = r7 * 45
            int r7 = 101 - r7
            int r6 = r6 * 165
            int r6 = r6 + 11
            byte[] r0 = setMax
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r4 = r7
            r3 = 0
            r7 = r6
            goto L_0x002a
        L_0x0017:
            r3 = 0
        L_0x0018:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L_0x0025
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0025:
            byte r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x002a:
            int r6 = r6 + r4
            int r8 = r8 + 1
            int r6 = r6 + -2
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.face.activity.ZolozDemoActivity.getMax(byte, byte, short):java.lang.String");
    }

    public void modifyViewFromOutside() {
    }

    public static void setFinishCallBack(finishCallBack finishcallback) {
        mfinishCallBack = finishcallback;
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = setMax;
        String max2 = getMax((byte) bArr[85], (byte) bArr[2], (byte) bArr[85]);
        byte[] bArr2 = setMax;
        String max3 = getMax((byte) bArr2[2], (byte) bArr2[85], (byte) bArr2[2]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length2 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length2) {
            onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
            onCancelLoad.setMax(-1236719528, oncanceled);
            onCancelLoad.getMin(-1236719528, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -1236719528 == (max = dispatchOnCancelled.getMax(applicationContext2, -1236719528)))) {
            onCanceled oncanceled2 = new onCanceled(-1236719528, max, 512);
            onCancelLoad.setMax(-1236719528, oncanceled2);
            onCancelLoad.getMin(-1236719528, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-1236719528, oncanceled3);
            onCancelLoad.getMin(-1236719528, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.zolozdemoactivity);
    }

    public void initData() {
        this.king = new CountDownTimer(10000, 1000) {
            public void onTick(long j) {
            }

            public void onFinish() {
                if (ZolozDemoActivity.mfinishCallBack != null) {
                    ZolozDemoActivity.mfinishCallBack.finish();
                }
                ZolozDemoActivity.this.finish();
            }
        }.start();
    }

    public void onDestroy() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(797200774, oncanceled);
            onCancelLoad.getMin(797200774, oncanceled);
        }
        super.onDestroy();
        this.king.cancel();
    }
}
