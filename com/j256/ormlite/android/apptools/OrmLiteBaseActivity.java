package com.j256.ormlite.android.apptools;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.alibaba.griver.ui.ant.utils.AUScreenAdaptTool;
import com.google.common.base.Ascii;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.logger.Logger;
import com.j256.ormlite.logger.LoggerFactory;
import com.j256.ormlite.support.ConnectionSource;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public abstract class OrmLiteBaseActivity<H extends OrmLiteSqliteOpenHelper> extends Activity {
    public static final int length = 42;
    private static Logger logger = LoggerFactory.getLogger((Class<?>) OrmLiteBaseActivity.class);
    public static final byte[] setMax = {80, 19, ImageFileType.HEAD_GIF_0, 44, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    private volatile boolean created = false;
    private volatile boolean destroyed = false;
    private volatile H helper;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(byte r5, byte r6, int r7) {
        /*
            int r6 = r6 * 165
            int r6 = 176 - r6
            int r7 = r7 * 45
            int r7 = 101 - r7
            byte[] r0 = setMax
            int r5 = r5 * 175
            int r5 = r5 + 4
            byte[] r1 = new byte[r6]
            r2 = -1
            int r6 = r6 + r2
            if (r0 != 0) goto L_0x001a
            r7 = r5
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r6
            goto L_0x0030
        L_0x001a:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r6) goto L_0x0028
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0028:
            byte r3 = r0[r5]
            r4 = r0
            r0 = r6
            r6 = r3
            r3 = r2
            r2 = r1
            r1 = r4
        L_0x0030:
            int r5 = r5 + 1
            int r6 = -r6
            int r7 = r7 + r6
            int r7 = r7 + -2
            r6 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.android.apptools.OrmLiteBaseActivity.setMax(byte, byte, int):java.lang.String");
    }

    public H getHelper() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1409734981, oncanceled);
            onCancelLoad.getMin(1409734981, oncanceled);
        }
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
            onCancelLoad.setMax(2147010802, oncanceled);
            onCancelLoad.getMin(2147010802, oncanceled);
        }
        return getHelper().getConnectionSource();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int max;
        byte b = (byte) setMax[8];
        byte b2 = (byte) b;
        String max2 = setMax(b, b2, (byte) b2);
        byte b3 = (byte) setMax[96];
        byte b4 = (byte) b3;
        String max3 = setMax(b3, b4, (byte) b4);
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
            onCancelLoad.setMax(-2033951131, oncanceled);
            onCancelLoad.getMin(-2033951131, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -2033951131 == (max = dispatchOnCancelled.getMax(applicationContext2, -2033951131)))) {
            onCanceled oncanceled2 = new onCanceled(-2033951131, max, 512);
            onCancelLoad.setMax(-2033951131, oncanceled2);
            onCancelLoad.getMin(-2033951131, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-2033951131, oncanceled3);
            onCancelLoad.getMin(-2033951131, oncanceled3);
        }
        int max4 = dispatchOnCancelled.getMax(0);
        if (max4 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max4, 16);
            onCancelLoad.setMax(-2033951131, oncanceled4);
            onCancelLoad.getMin(-2033951131, oncanceled4);
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
        H helper2 = OpenHelperManager.getHelper(context);
        logger.trace("{}: got new helper {} from OpenHelperManager", (Object) this, (Object) helper2);
        return helper2;
    }

    /* access modifiers changed from: protected */
    public void releaseHelper(H h) {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1407312772 == (max = dispatchOnCancelled.getMax(applicationContext, 1407312772)))) {
            onCanceled oncanceled = new onCanceled(1407312772, max, 512);
            onCancelLoad.setMax(1407312772, oncanceled);
            onCancelLoad.getMin(1407312772, oncanceled);
        }
        OpenHelperManager.releaseHelper();
        logger.trace("{}: helper {} was released, set to null", (Object) this, (Object) h);
        this.helper = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(AUScreenAdaptTool.PREFIX_ID);
        sb.append(Integer.toHexString(super.hashCode()));
        return sb.toString();
    }
}
