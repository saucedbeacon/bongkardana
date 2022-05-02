package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public static final int getMax = 110;
    public static final byte[] getMin = {Ascii.DLE, Ascii.FF, -28, 4, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    @VisibleForTesting
    private int zaa = 0;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(short r6, byte r7, byte r8) {
        /*
            int r7 = r7 * 175
            int r7 = 178 - r7
            int r8 = r8 * 45
            int r8 = r8 + 56
            int r6 = r6 * 165
            int r6 = r6 + 11
            byte[] r0 = getMin
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r8
            r4 = 0
            r8 = r7
            r7 = r6
            goto L_0x0030
        L_0x001a:
            r3 = 0
        L_0x001b:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L_0x0028
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0028:
            int r7 = r7 + 1
            byte r3 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x0030:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + -2
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.GoogleApiActivity.length(short, byte, byte):java.lang.String");
    }

    public static PendingIntent zaa(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, zaa(context, pendingIntent, i, true), 134217728);
    }

    public static Intent zaa(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra(CloudMessagingReceiver.IntentKeys.PENDING_INTENT, pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        int length;
        int min;
        int length2;
        byte b = (byte) getMin[96];
        byte b2 = (byte) b;
        String length3 = length(b, b2, (byte) b2);
        int i = 8;
        byte b3 = (byte) getMin[8];
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
            onCancelLoad.setMax(1147965210, oncanceled);
            onCancelLoad.getMin(1147965210, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1147965210, oncanceled2);
            onCancelLoad.getMin(1147965210, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1147965210, oncanceled3);
            onCancelLoad.getMin(1147965210, oncanceled3);
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.zaa = bundle.getInt("resolution");
        }
        if (this.zaa != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get(CloudMessagingReceiver.IntentKeys.PENDING_INTENT);
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                    this.zaa = 1;
                } catch (IntentSender.SendIntentException unused) {
                    finish();
                }
            } else {
                GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
                if (num != null) {
                    i = num.intValue();
                }
                instance.showErrorDialogFragment(this, i, 2, this);
                this.zaa = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1572098865, oncanceled);
            onCancelLoad.getMin(-1572098865, oncanceled);
        }
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.zaa = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                GoogleApiManager zaa2 = GoogleApiManager.zaa((Context) this);
                if (i2 == -1) {
                    zaa2.zac();
                } else if (i2 == 0) {
                    zaa2.zab(new ConnectionResult(13, (PendingIntent) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.zaa = 0;
            setResult(i2, intent);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.zaa);
        super.onSaveInstanceState(bundle);
    }

    public void onCancel(DialogInterface dialogInterface) {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(694440422, oncanceled);
            onCancelLoad.getMin(694440422, oncanceled);
        }
        this.zaa = 0;
        setResult(0);
        finish();
    }
}
