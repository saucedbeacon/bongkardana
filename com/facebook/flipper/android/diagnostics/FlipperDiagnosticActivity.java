package com.facebook.flipper.android.diagnostics;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.common.base.Ascii;
import java.util.Random;
import o.CoordinatorLayout;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.setColorFilter;

public class FlipperDiagnosticActivity extends FragmentActivity {
    public static final byte[] getMax = {117, Ascii.US, 96, 110, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int length = 203;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(byte r7, byte r8, short r9) {
        /*
            byte[] r0 = getMax
            int r8 = r8 * 175
            int r8 = 178 - r8
            int r9 = r9 * 45
            int r9 = 101 - r9
            int r7 = r7 * 165
            int r7 = 176 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L_0x0033
        L_0x001a:
            r3 = 0
        L_0x001b:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L_0x002a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x002a:
            byte r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r6
        L_0x0033:
            int r0 = r0 + r7
            int r7 = r0 + -2
            r0 = r1
            r1 = r3
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.flipper.android.diagnostics.FlipperDiagnosticActivity.getMax(byte, byte, short):java.lang.String");
    }

    public void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = getMax;
        String max2 = getMax((byte) bArr[8], (byte) bArr[85], (byte) bArr[8]);
        byte[] bArr2 = getMax;
        String max3 = getMax((byte) bArr2[85], (byte) bArr2[8], (byte) bArr2[85]);
        Context baseContext = getBaseContext();
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(23278106, oncanceled);
            onCancelLoad.getMin(23278106, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 23278106 == (max = dispatchOnCancelled.getMax(applicationContext2, 23278106)))) {
            onCanceled oncanceled2 = new onCanceled(23278106, max, 512);
            onCancelLoad.setMax(23278106, oncanceled2);
            onCancelLoad.getMin(23278106, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = applicationContext3.fileList().length) == (min = dispatchOnCancelled.setMin(applicationContext3, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(23278106, oncanceled3);
            onCancelLoad.getMin(23278106, oncanceled3);
        }
        super.onCreate(bundle);
        setColorFilter setcolorfilter = new setColorFilter(getSupportFragmentManager());
        setcolorfilter.length(16908290, CoordinatorLayout.DefaultBehavior.getMax(), (String) null, 1);
        setcolorfilter.setMin();
    }
}
