package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.play.core.internal.af;
import com.google.android.play.core.internal.by;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    public static final byte[] getMax = {34, -75, Byte.MIN_VALUE, -125, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int length = 9;

    private final String a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    private final void a(String str) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1450534545, oncanceled);
            onCancelLoad.getMin(1450534545, oncanceled);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 66);
        sb.append("market://details?id=");
        sb.append(str);
        sb.append("&referrer=utm_source%3Dplay.core.missingsplits");
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(sb.toString())).setPackage("com.android.vending"));
        } catch (ActivityNotFoundException e) {
            new af(getClass().getName()).a((Throwable) e, "Couldn't start missing splits activity for %s", str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(short r6, byte r7, int r8) {
        /*
            int r8 = r8 * 165
            int r8 = r8 + 11
            byte[] r0 = getMax
            int r7 = r7 * 45
            int r7 = 101 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = -1
            int r8 = r8 + r2
            if (r0 != 0) goto L_0x0018
            r7 = r6
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r8
            goto L_0x0033
        L_0x0018:
            int r6 = r6 + 1
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r8) goto L_0x0028
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            return r6
        L_0x0028:
            byte r3 = r0[r6]
            r4 = r7
            r7 = r6
            r6 = r4
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r2
            r2 = r1
            r1 = r5
        L_0x0033:
            int r6 = r6 + r8
            int r6 = r6 + -2
            r8 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            r4 = r7
            r7 = r6
            r6 = r4
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.getMin(short, byte, int):java.lang.String");
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(1189402476, oncanceled);
            onCancelLoad.getMin(1189402476, oncanceled);
        }
        if (i == -1) {
            a(getPackageName());
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = getMax;
        String min2 = getMin((short) bArr[96], (byte) bArr[8], (byte) bArr[85]);
        byte[] bArr2 = getMax;
        String min3 = getMin(174, (byte) bArr2[85], (byte) bArr2[8]);
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
            onCancelLoad.setMax(127796049, oncanceled);
            onCancelLoad.getMin(127796049, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 127796049 == (max = dispatchOnCancelled.getMax(applicationContext2, 127796049)))) {
            onCanceled oncanceled2 = new onCanceled(127796049, max, 512);
            onCancelLoad.setMax(127796049, oncanceled2);
            onCancelLoad.getMin(127796049, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(127796049, oncanceled3);
            onCancelLoad.getMin(127796049, oncanceled3);
        }
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (by.a(this)) {
            String a2 = a();
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 91);
            sb.append("The app ");
            sb.append(a2);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb.toString()).setPositiveButton("Reinstall", this);
        } else {
            String a3 = a();
            StringBuilder sb2 = new StringBuilder(String.valueOf(a3).length() + 87);
            sb2.append("The app ");
            sb2.append(a3);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
    }
}
