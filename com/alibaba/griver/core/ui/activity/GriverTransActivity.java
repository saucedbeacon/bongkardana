package com.alibaba.griver.core.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.core.ui.activity.GriverBaseActivity;
import com.alibaba.griver.core.utils.h;
import com.google.common.base.Ascii;
import java.util.Random;
import net.sqlcipher.database.SQLiteDatabase;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class GriverTransActivity extends GriverBaseActivity {
    public static Class[] ACTIVITY_CLASSES = {Lite1.class, Lite2.class, Lite3.class};
    public static final String TAG = "Griver:NebulaTransActivity";

    private static void a(Activity activity, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                if (BundleUtils.getBoolean(extras, RVParams.TRANS_ANIMATE, false)) {
                    h.a(activity, 855638016);
                }
                h.a(activity, -16777216);
            } catch (Exception e) {
                RVLogger.e(TAG, (Throwable) e);
            }
        }
    }

    /* access modifiers changed from: private */
    public static void a(Activity activity) {
        if (!activity.isFinishing()) {
            if (Build.VERSION.SDK_INT < 26) {
                activity.setRequestedOrientation(1);
            }
            a(activity, activity.getIntent());
        }
    }

    public static class Main extends GriverBaseActivity.Main {
        public static final byte[] getMax = {Ascii.RS, 124, -72, 47, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
        public static final int toFloatRange = 88;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String length(int r8, int r9, short r10) {
            /*
                int r9 = r9 * 45
                int r9 = r9 + 56
                int r10 = r10 * 165
                int r10 = 176 - r10
                byte[] r0 = getMax
                int r8 = r8 * 175
                int r8 = 178 - r8
                byte[] r1 = new byte[r10]
                r2 = 0
                if (r0 != 0) goto L_0x0019
                r9 = r8
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                goto L_0x0033
            L_0x0019:
                r3 = 0
            L_0x001a:
                int r8 = r8 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r10) goto L_0x0029
                java.lang.String r8 = new java.lang.String
                r8.<init>(r1, r2)
                return r8
            L_0x0029:
                byte r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r6
                r7 = r0
                r0 = r10
                r10 = r3
                r3 = r1
                r1 = r7
            L_0x0033:
                int r8 = r8 + r10
                int r8 = r8 + -2
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverTransActivity.Main.length(int, int, short):java.lang.String");
        }

        public void onCreate(@Nullable Bundle bundle) {
            int length;
            int min;
            int max;
            byte[] bArr = getMax;
            byte b = (byte) bArr[85];
            String length2 = length(b, (byte) b, (byte) bArr[8]);
            byte[] bArr2 = getMax;
            byte b2 = (byte) bArr2[8];
            String length3 = length(b2, (byte) b2, (byte) bArr2[85]);
            Context baseContext = getBaseContext();
            Context context = null;
            Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
            if (applicationContext != null) {
                registerOnLoadCanceledListener.setMin().getMax(applicationContext, length2, length3);
            }
            int nextInt = new Random().nextInt(Integer.MAX_VALUE);
            int length4 = dispatchOnCancelled.length(nextInt);
            if (nextInt != length4) {
                onCanceled oncanceled = new onCanceled(nextInt, length4, 1);
                onCancelLoad.setMax(694537730, oncanceled);
                onCancelLoad.getMin(694537730, oncanceled);
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || 694537730 == (max = dispatchOnCancelled.getMax(applicationContext2, 694537730)))) {
                onCanceled oncanceled2 = new onCanceled(694537730, max, 512);
                onCancelLoad.setMax(694537730, oncanceled2);
                onCancelLoad.getMin(694537730, oncanceled2);
            }
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
                onCanceled oncanceled3 = new onCanceled(length, min, 8);
                onCancelLoad.setMax(694537730, oncanceled3);
                onCancelLoad.getMin(694537730, oncanceled3);
            }
            super.onCreate(bundle);
            GriverTransActivity.a(this);
        }
    }

    public static class LiteBase extends GriverBaseActivity.Lite {
        public static final int equals = 45;
        public static final byte[] isInside = {19, 43, 80, 34, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String getMax(byte r6, short r7, short r8) {
            /*
                int r7 = r7 * 175
                int r7 = 179 - r7
                int r6 = r6 * 45
                int r6 = 101 - r6
                byte[] r0 = isInside
                int r8 = r8 * 165
                int r8 = 176 - r8
                byte[] r1 = new byte[r8]
                int r8 = r8 + -1
                r2 = 0
                if (r0 != 0) goto L_0x0019
                r4 = r7
                r6 = r8
                r3 = 0
                goto L_0x002c
            L_0x0019:
                r3 = 0
            L_0x001a:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L_0x0025
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L_0x0025:
                int r3 = r3 + 1
                byte r4 = r0[r7]
                r5 = r8
                r8 = r6
                r6 = r5
            L_0x002c:
                int r7 = r7 + 1
                int r8 = r8 + r4
                int r8 = r8 + -2
                r5 = r8
                r8 = r6
                r6 = r5
                goto L_0x001a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverTransActivity.LiteBase.getMax(byte, short, short):java.lang.String");
        }

        public void onCreate(@Nullable Bundle bundle) {
            int length;
            int min;
            int max;
            int max2;
            byte[] bArr = isInside;
            String max3 = getMax((byte) bArr[8], (byte) bArr[85], (byte) bArr[8]);
            byte[] bArr2 = isInside;
            String max4 = getMax((byte) bArr2[85], (byte) bArr2[8], (byte) bArr2[85]);
            Context baseContext = getBaseContext();
            Context context = null;
            Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
            if (applicationContext != null) {
                registerOnLoadCanceledListener.setMin().getMax(applicationContext, max3, max4);
            }
            int nextInt = new Random().nextInt(Integer.MAX_VALUE);
            int length2 = dispatchOnCancelled.length(nextInt);
            if (nextInt != length2) {
                onCanceled oncanceled = new onCanceled(nextInt, length2, 1);
                onCancelLoad.setMax(696903546, oncanceled);
                onCancelLoad.getMin(696903546, oncanceled);
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || 696903546 == (max2 = dispatchOnCancelled.getMax(applicationContext2, 696903546)))) {
                onCanceled oncanceled2 = new onCanceled(696903546, max2, 512);
                onCancelLoad.setMax(696903546, oncanceled2);
                onCancelLoad.getMin(696903546, oncanceled2);
            }
            Context baseContext3 = getBaseContext();
            Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
            if (!(applicationContext3 == null || 696903546 == (max = dispatchOnCancelled.getMax(applicationContext3, 696903546)))) {
                onCanceled oncanceled3 = new onCanceled(696903546, max, 512);
                onCancelLoad.setMax(696903546, oncanceled3);
                onCancelLoad.getMin(696903546, oncanceled3);
            }
            Context baseContext4 = getBaseContext();
            if (baseContext4 != null) {
                context = baseContext4.getApplicationContext();
            }
            if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
                onCanceled oncanceled4 = new onCanceled(length, min, 8);
                onCancelLoad.setMax(696903546, oncanceled4);
                onCancelLoad.getMin(696903546, oncanceled4);
            }
            super.onCreate(bundle);
            GriverTransActivity.a(this);
        }
    }

    public static class Lite1 extends LiteBase {
        public static final byte[] setMin = {69, -3, -20, 90, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
        public static final int toFloatRange = SQLiteDatabase.MAX_SQL_CACHE_SIZE;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String setMin(int r6, int r7, int r8) {
            /*
                byte[] r0 = setMin
                int r6 = r6 * 165
                int r6 = r6 + 11
                int r8 = r8 * 45
                int r8 = r8 + 56
                int r7 = r7 + 4
                byte[] r1 = new byte[r6]
                int r6 = r6 + -1
                r2 = 0
                if (r0 != 0) goto L_0x0017
                r3 = r8
                r4 = 0
                r8 = r7
                goto L_0x002c
            L_0x0017:
                r3 = 0
            L_0x0018:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L_0x0027
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L_0x0027:
                byte r3 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L_0x002c:
                int r7 = r7 + r3
                int r7 = r7 + -2
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L_0x0018
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverTransActivity.Lite1.setMin(int, int, int):java.lang.String");
        }

        public void onCreate(Bundle bundle) {
            int length;
            int min;
            int length2;
            byte[] bArr = setMin;
            String min2 = setMin((byte) bArr[85], (short) bArr[96], (byte) bArr[85]);
            byte[] bArr2 = setMin;
            byte b = (byte) bArr2[8];
            String min3 = setMin(b, (short) (b | 174), (byte) bArr2[8]);
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
                onCancelLoad.setMax(443694002, oncanceled);
                onCancelLoad.getMin(443694002, oncanceled);
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(443694002, oncanceled2);
                onCancelLoad.getMin(443694002, oncanceled2);
            }
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
                onCanceled oncanceled3 = new onCanceled(length, min, 8);
                onCancelLoad.setMax(443694002, oncanceled3);
                onCancelLoad.getMin(443694002, oncanceled3);
            }
            super.onCreate(bundle);
            RVLogger.d(GriverTransActivity.TAG, "onCreate NebulaTransActivity$Lite1");
        }
    }

    public static class Lite2 extends LiteBase {
        public static final byte[] setMin = {114, -106, -55, 87, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
        public static final int toIntRange = 211;

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String getMin(short r7, int r8, int r9) {
            /*
                byte[] r0 = setMin
                int r9 = r9 * 175
                int r9 = 179 - r9
                int r7 = r7 * 165
                int r7 = r7 + 11
                int r8 = r8 * 45
                int r8 = 101 - r8
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L_0x0018
                r3 = r1
                r5 = 0
                r1 = r0
                r0 = r9
                goto L_0x002d
            L_0x0018:
                r3 = 0
            L_0x0019:
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L_0x0026
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                return r7
            L_0x0026:
                byte r3 = r0[r9]
                r6 = r0
                r0 = r9
                r9 = r3
                r3 = r1
                r1 = r6
            L_0x002d:
                int r9 = -r9
                int r8 = r8 + r9
                int r9 = r0 + 1
                int r8 = r8 + -2
                r0 = r1
                r1 = r3
                r3 = r5
                goto L_0x0019
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverTransActivity.Lite2.getMin(short, int, int):java.lang.String");
        }

        public void onCreate(Bundle bundle) {
            int length;
            int min;
            int length2;
            int max;
            byte[] bArr = setMin;
            String min2 = getMin((byte) bArr[96], (byte) bArr[8], (byte) bArr[96]);
            byte[] bArr2 = setMin;
            String min3 = getMin((byte) bArr2[8], (byte) bArr2[96], (byte) bArr2[8]);
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
                onCancelLoad.setMax(1323689711, oncanceled);
                onCancelLoad.getMin(1323689711, oncanceled);
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || 1323689711 == (max = dispatchOnCancelled.getMax(applicationContext2, 1323689711)))) {
                onCanceled oncanceled2 = new onCanceled(1323689711, max, 512);
                onCancelLoad.setMax(1323689711, oncanceled2);
                onCancelLoad.getMin(1323689711, oncanceled2);
            }
            Context baseContext3 = getBaseContext();
            Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
            if (!(applicationContext3 == null || (length2 = dispatchOnCancelled.length(applicationContext3, 0)) == 0)) {
                onCanceled oncanceled3 = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(1323689711, oncanceled3);
                onCancelLoad.getMin(1323689711, oncanceled3);
            }
            Context baseContext4 = getBaseContext();
            if (baseContext4 != null) {
                context = baseContext4.getApplicationContext();
            }
            if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
                onCanceled oncanceled4 = new onCanceled(length, min, 8);
                onCancelLoad.setMax(1323689711, oncanceled4);
                onCancelLoad.getMin(1323689711, oncanceled4);
            }
            super.onCreate(bundle);
            RVLogger.d(GriverTransActivity.TAG, "onCreate NebulaTransActivity$Lite2");
        }
    }

    public static class Lite3 extends LiteBase {
        public static final byte[] setMin = {60, -83, -82, Framer.EXIT_FRAME_PREFIX, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
        public static final int toIntRange = 28;

        /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.String length(short r5, byte r6, byte r7) {
            /*
                byte[] r0 = setMin
                int r5 = r5 * 165
                int r5 = 176 - r5
                int r7 = r7 * 175
                int r7 = r7 + 4
                int r6 = r6 * 45
                int r6 = 101 - r6
                byte[] r1 = new byte[r5]
                r2 = -1
                int r5 = r5 + r2
                if (r0 != 0) goto L_0x001b
                r2 = r1
                r3 = -1
                r1 = r0
                r0 = r7
                r7 = r6
                r6 = r5
                goto L_0x0033
            L_0x001b:
                int r2 = r2 + 1
                byte r3 = (byte) r6
                r1[r2] = r3
                if (r2 != r5) goto L_0x0029
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r1, r6)
                return r5
            L_0x0029:
                byte r3 = r0[r7]
                r4 = r6
                r6 = r5
                r5 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                r0 = r7
                r7 = r4
            L_0x0033:
                int r5 = -r5
                int r0 = r0 + 1
                int r7 = r7 + r5
                int r5 = r7 + -2
                r7 = r0
                r0 = r1
                r1 = r2
                r2 = r3
                r4 = r6
                r6 = r5
                r5 = r4
                goto L_0x001b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.ui.activity.GriverTransActivity.Lite3.length(short, byte, byte):java.lang.String");
        }

        public void onCreate(Bundle bundle) {
            int length;
            int min;
            int length2;
            byte b = (byte) setMin[8];
            byte b2 = (byte) b;
            String length3 = length(b, b2, (byte) b2);
            byte b3 = (byte) setMin[96];
            byte b4 = (byte) b3;
            String length4 = length(b3, b4, (byte) b4);
            Context baseContext = getBaseContext();
            Context context = null;
            Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
            if (applicationContext != null) {
                registerOnLoadCanceledListener.setMin().getMax(applicationContext, length3, length4);
            }
            int nextInt = new Random().nextInt(Integer.MAX_VALUE);
            int length5 = dispatchOnCancelled.length(nextInt);
            if (nextInt != length5) {
                onCanceled oncanceled = new onCanceled(nextInt, length5, 1);
                onCancelLoad.setMax(-760992164, oncanceled);
                onCancelLoad.getMin(-760992164, oncanceled);
            }
            Context baseContext2 = getBaseContext();
            Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
            if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
                onCanceled oncanceled2 = new onCanceled(0, length2, 4);
                onCancelLoad.setMax(-760992164, oncanceled2);
                onCancelLoad.getMin(-760992164, oncanceled2);
            }
            Context baseContext3 = getBaseContext();
            if (baseContext3 != null) {
                context = baseContext3.getApplicationContext();
            }
            if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
                onCanceled oncanceled3 = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-760992164, oncanceled3);
                onCancelLoad.getMin(-760992164, oncanceled3);
            }
            super.onCreate(bundle);
            RVLogger.d(GriverTransActivity.TAG, "onCreate NebulaTransActivity$Lite3");
        }
    }
}
