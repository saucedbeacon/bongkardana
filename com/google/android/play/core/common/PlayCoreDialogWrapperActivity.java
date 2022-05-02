package com.google.android.play.core.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import com.google.android.play.core.internal.bq;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class PlayCoreDialogWrapperActivity extends Activity {
    public static final int setMax = 91;
    public static final byte[] setMin = {124, -124, 44, -103, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private ResultReceiver f9565a;

    public static void a(Context context) {
        bq.a(context.getPackageManager(), new ComponentName(context.getPackageName(), "com.google.android.play.core.common.PlayCoreDialogWrapperActivity"), 1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(byte r5, int r6, short r7) {
        /*
            int r6 = r6 * 175
            int r6 = 179 - r6
            int r7 = r7 * 165
            int r7 = 176 - r7
            byte[] r0 = setMin
            int r5 = r5 * 45
            int r5 = 101 - r5
            byte[] r1 = new byte[r7]
            r2 = -1
            int r7 = r7 + r2
            if (r0 != 0) goto L_0x001a
            r5 = r6
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r7
            goto L_0x0032
        L_0x001a:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r7) goto L_0x0028
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            return r5
        L_0x0028:
            byte r3 = r0[r6]
            r4 = r7
            r7 = r5
            r5 = r6
            r6 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r4
        L_0x0032:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r5 + 1
            int r5 = r7 + -2
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.common.PlayCoreDialogWrapperActivity.setMax(byte, int, short):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        ResultReceiver resultReceiver;
        Bundle bundle;
        int i3;
        int length;
        int min;
        int max;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (max = dispatchOnCancelled.getMax(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, max, 512);
            onCancelLoad.setMax(-1432564632, oncanceled);
            onCancelLoad.getMin(-1432564632, oncanceled);
        }
        int max2 = dispatchOnCancelled.getMax(i);
        if (i != max2) {
            onCanceled oncanceled2 = new onCanceled(i, max2, 16);
            onCancelLoad.setMax(-1432564632, oncanceled2);
            onCancelLoad.getMin(-1432564632, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1432564632, oncanceled3);
            onCancelLoad.getMin(-1432564632, oncanceled3);
        }
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.f9565a) != null) {
            if (i2 == -1) {
                bundle = new Bundle();
                i3 = 1;
            } else if (i2 == 0) {
                bundle = new Bundle();
                i3 = 2;
            }
            resultReceiver.send(i3, bundle);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = setMin;
        String max2 = setMax((byte) bArr[8], (byte) bArr[96], (byte) bArr[8]);
        byte[] bArr2 = setMin;
        String max3 = setMax((byte) bArr2[96], (byte) bArr2[8], (byte) bArr2[96]);
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
            onCancelLoad.setMax(1484805987, oncanceled);
            onCancelLoad.getMin(1484805987, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 1484805987 == (max = dispatchOnCancelled.getMax(applicationContext2, 1484805987)))) {
            onCanceled oncanceled2 = new onCanceled(1484805987, max, 512);
            onCancelLoad.setMax(1484805987, oncanceled2);
            onCancelLoad.getMin(1484805987, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1484805987, oncanceled3);
            onCancelLoad.getMin(1484805987, oncanceled3);
        }
        super.onCreate(bundle);
        if (bundle == null) {
            this.f9565a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            try {
                startIntentSenderForResult(((PendingIntent) getIntent().getExtras().get("confirmation_intent")).getIntentSender(), 0, (Intent) null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                ResultReceiver resultReceiver = this.f9565a;
                if (resultReceiver != null) {
                    resultReceiver.send(3, new Bundle());
                }
                finish();
            }
        } else {
            this.f9565a = (ResultReceiver) bundle.getParcelable("result_receiver");
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("result_receiver", this.f9565a);
    }
}
