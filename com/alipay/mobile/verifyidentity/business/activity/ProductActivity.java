package com.alipay.mobile.verifyidentity.business.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.alipay.mobile.verifyidentity.base.LocalBroadcastCompt;
import com.alipay.mobile.verifyidentity.base.message.ProductConstants;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public abstract class ProductActivity extends BaseActivity {
    public static final byte[] getMax = {62, 4, -94, -28, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMin = 194;
    private CreateProductReceiver createReceiver;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(byte r6, int r7, int r8) {
        /*
            int r7 = r7 * 165
            int r7 = 176 - r7
            int r8 = r8 + 4
            byte[] r0 = getMax
            int r6 = r6 * 45
            int r6 = r6 + 56
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            r8 = r7
            goto L_0x0032
        L_0x0019:
            r3 = 0
        L_0x001a:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L_0x0027
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0027:
            int r3 = r3 + 1
            byte r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0032:
            int r6 = r6 + r7
            int r6 = r6 + -2
            r7 = r8
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.business.activity.ProductActivity.getMax(byte, int, int):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = getMax;
        String max2 = getMax((byte) bArr[85], (byte) bArr[8], (short) bArr[96]);
        byte[] bArr2 = getMax;
        String max3 = getMax((byte) bArr2[8], (byte) bArr2[85], 174);
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
            onCancelLoad.setMax(1162168810, oncanceled);
            onCancelLoad.getMin(1162168810, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1162168810 == (max = dispatchOnCancelled.getMax(applicationContext2, 1162168810)))) {
            onCanceled oncanceled2 = new onCanceled(1162168810, max, 512);
            onCancelLoad.setMax(1162168810, oncanceled2);
            onCancelLoad.getMin(1162168810, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1162168810, oncanceled3);
            onCancelLoad.getMin(1162168810, oncanceled3);
        }
        int max4 = dispatchOnCancelled.getMax(0);
        if (max4 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max4, 16);
            onCancelLoad.setMax(1162168810, oncanceled4);
            onCancelLoad.getMin(1162168810, oncanceled4);
        }
        super.onCreate(bundle);
        registerReceiver();
    }

    private void registerReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ProductConstants.KEY_CREATE_PRODUCT);
        CreateProductReceiver createProductReceiver = new CreateProductReceiver();
        this.createReceiver = createProductReceiver;
        LocalBroadcastCompt.registerBroadcast(this, createProductReceiver, intentFilter);
    }

    class CreateProductReceiver extends BroadcastReceiver {
        private CreateProductReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(ProductConstants.KEY_CREATE_PRODUCT)) {
                ProductActivity.this.finish();
            }
        }
    }

    public void onDestroy() {
        LocalBroadcastCompt.unregisterBroadcast(this, this.createReceiver);
        super.onDestroy();
    }
}
