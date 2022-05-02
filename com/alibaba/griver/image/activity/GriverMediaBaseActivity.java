package com.alibaba.griver.image.activity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.alibaba.griver.base.common.utils.H5SplitCompatUtils;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class GriverMediaBaseActivity extends Activity {
    public static final byte[] getMax = {118, Ascii.US, -29, -94, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int length = 103;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(short r5, short r6, int r7) {
        /*
            int r6 = r6 * 165
            int r6 = 176 - r6
            int r5 = r5 + 4
            int r7 = r7 * 45
            int r7 = 101 - r7
            byte[] r0 = getMax
            byte[] r1 = new byte[r6]
            r2 = -1
            int r6 = r6 + r2
            if (r0 != 0) goto L_0x0015
            r3 = r7
            r7 = r6
            goto L_0x002a
        L_0x0015:
            int r5 = r5 + 1
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r6) goto L_0x0025
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0025:
            byte r3 = r0[r5]
            r4 = r7
            r7 = r6
            r6 = r4
        L_0x002a:
            int r6 = r6 + r3
            int r6 = r6 + -2
            r4 = r7
            r7 = r6
            r6 = r4
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.activity.GriverMediaBaseActivity.getMin(short, short, int):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = getMax;
        byte b = (byte) bArr[8];
        String min2 = getMin((short) bArr[96], b, (byte) b);
        byte b2 = (byte) getMax[85];
        String min3 = getMin(174, b2, (byte) b2);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, min2, min3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(-209586845, oncanceled);
            onCancelLoad.getMin(-209586845, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -209586845 == (max = dispatchOnCancelled.getMax(applicationContext2, -209586845)))) {
            onCanceled oncanceled2 = new onCanceled(-209586845, max, 512);
            onCancelLoad.setMax(-209586845, oncanceled2);
            onCancelLoad.getMin(-209586845, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-209586845, oncanceled3);
            onCancelLoad.getMin(-209586845, oncanceled3);
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -847967863 == (max = dispatchOnCancelled.getMax(applicationContext, -847967863)))) {
            onCanceled oncanceled = new onCanceled(-847967863, max, 512);
            onCancelLoad.setMax(-847967863, oncanceled);
            onCancelLoad.getMin(-847967863, oncanceled);
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        H5SplitCompatUtils.doInstall(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-755153565, oncanceled);
            onCancelLoad.getMin(-755153565, oncanceled);
        }
        super.onConfigurationChanged(configuration);
        H5SplitCompatUtils.doInstall(this);
    }
}
