package com.j256.ormlite.android.apptools;

import android.app.ActivityGroup;
import android.content.Context;
import android.os.Bundle;
import com.google.common.base.Ascii;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public abstract class OrmLiteBaseActivityGroup<H extends OrmLiteSqliteOpenHelper> extends ActivityGroup {
    public static final int setMax = 223;
    public static final byte[] setMin = {60, -46, -114, 9, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    private volatile boolean created = false;
    private volatile boolean destroyed = false;
    private volatile H helper;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(byte r6, short r7, int r8) {
        /*
            int r6 = r6 * 165
            int r6 = 176 - r6
            int r7 = r7 * 175
            int r7 = 178 - r7
            byte[] r0 = setMin
            int r8 = r8 * 45
            int r8 = r8 + 56
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r7
            goto L_0x0035
        L_0x001a:
            r3 = 0
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x001e:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L_0x002b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x002b:
            int r3 = r3 + 1
            byte r4 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L_0x0035:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + -2
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.apptools.OrmLiteBaseActivityGroup.getMax(byte, short, int):java.lang.String");
    }

    public H getHelper() {
        if (this.helper != null) {
            return this.helper;
        }
        if (!this.created) {
            throw new IllegalStateException("A call has not been made to onCreate() yet so the helper is null");
        } else if (this.destroyed) {
            throw new IllegalStateException("A call to onDestroy has already been made and the helper cannot be used after that point");
        } else {
            throw new IllegalStateException("Helper is null for some unknown reason");
        }
    }

    public ConnectionSource getConnectionSource() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(996849475, oncanceled);
            onCancelLoad.getMin(996849475, oncanceled);
        }
        return getHelper().getConnectionSource();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = setMin;
        byte b = (byte) bArr[96];
        String max = getMax((byte) bArr[8], b, (byte) b);
        byte[] bArr2 = setMin;
        byte b2 = (byte) bArr2[8];
        String max2 = getMax((byte) bArr2[96], b2, (byte) b2);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(-1456099196, oncanceled);
            onCancelLoad.getMin(-1456099196, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1456099196, oncanceled2);
            onCancelLoad.getMin(-1456099196, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-1456099196, oncanceled3);
            onCancelLoad.getMin(-1456099196, oncanceled3);
        }
        if (this.helper == null) {
            this.helper = getHelperInternal(this);
            this.created = true;
        }
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        releaseHelper(this.helper);
        this.destroyed = true;
    }

    /* access modifiers changed from: protected */
    public H getHelperInternal(Context context) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(819671583, oncanceled);
            onCancelLoad.getMin(819671583, oncanceled);
        }
        return OpenHelperManager.getHelper(context);
    }

    /* access modifiers changed from: protected */
    public void releaseHelper(H h) {
        OpenHelperManager.releaseHelper();
        this.helper = null;
    }
}
