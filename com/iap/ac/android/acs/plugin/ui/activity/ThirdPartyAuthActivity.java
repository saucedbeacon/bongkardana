package com.iap.ac.android.acs.plugin.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.log.ACLog;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.restorePresenterStates;

public class ThirdPartyAuthActivity extends Activity {
    public static final String KEY_ACTION = "ACTION";
    public static final String KEY_APP_NAME = "APP_NAME";
    public static final String KEY_URI = "URI";
    public static final int REQ_OPEN_AUTH = 181010;
    private static final String TAG = "IAPConnectPlugin";
    public static final int length = 237;
    public static final byte[] setMax = {Ascii.SUB, 57, 123, Ascii.ESC, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    private String action;
    private String appName;
    private String uriString;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(short r7, int r8, short r9) {
        /*
            byte[] r0 = setMax
            int r8 = r8 * 175
            int r8 = r8 + 4
            int r9 = r9 * 165
            int r9 = 176 - r9
            int r7 = r7 * 45
            int r7 = 101 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L_0x0018
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            goto L_0x0031
        L_0x0018:
            r3 = 0
        L_0x0019:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L_0x0029
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x0029:
            byte r3 = r0[r8]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L_0x0031:
            int r8 = r8 + 1
            int r0 = r0 + r7
            int r7 = r0 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.ui.activity.ThirdPartyAuthActivity.length(short, int, short):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
        int length2;
        int min;
        int length3;
        byte b = (byte) setMax[8];
        byte b2 = (byte) b;
        String length4 = length(b, b2, (byte) b2);
        byte b3 = (byte) setMax[85];
        byte b4 = (byte) b3;
        String length5 = length(b3, b4, (byte) b4);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, length4, length5);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length6 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length6) {
            onCanceled oncanceled = new onCanceled(nextInt, length6, 1);
            onCancelLoad.setMax(796775994, oncanceled);
            onCancelLoad.getMin(796775994, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(796775994, oncanceled2);
            onCancelLoad.getMin(796775994, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(796775994, oncanceled3);
            onCancelLoad.getMin(796775994, oncanceled3);
        }
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        this.appName = intent.getStringExtra(KEY_APP_NAME);
        this.uriString = intent.getStringExtra(KEY_URI);
        String stringExtra = intent.getStringExtra(KEY_ACTION);
        this.action = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.action = "android.intent.action.VIEW";
        }
        if (TextUtils.isEmpty(this.action) || TextUtils.isEmpty(this.uriString) || TextUtils.isEmpty(this.appName)) {
            sendBroadcast(new Intent(Constants.ACTION_THIRD_PARTY_AUTH_FOR_AC));
            finish();
            return;
        }
        Intent intent2 = new Intent();
        intent2.setAction(this.action);
        intent2.setData(Uri.parse(this.uriString));
        startActivityForResult(intent2, REQ_OPEN_AUTH);
        ACLog.d("IAPConnectPlugin", "Interceptor4thirdPartyAuthForAc#ThirdPartyAuthActivity use URI to start App");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 16);
            onCancelLoad.setMax(519300783, oncanceled);
            onCancelLoad.getMin(519300783, oncanceled);
        }
        ACLog.d("IAPConnectPlugin", "Interceptor4thirdPartyAuthForAc#ThirdPartyAuthActivity onActivityResult");
        if (181010 == i) {
            String stringExtra = (intent == null || TextUtils.isEmpty(intent.getStringExtra("result"))) ? "" : intent.getStringExtra("result");
            Intent intent2 = new Intent(Constants.ACTION_THIRD_PARTY_AUTH_FOR_AC);
            intent2.putExtra(Constants.KEY_AUTH_RESULT_CODE, i2);
            intent2.putExtra("authCode", stringExtra);
            restorePresenterStates.length(this).setMin(intent2);
            ACLog.d("IAPConnectPlugin", "Interceptor4thirdPartyAuthForAc#ThirdPartyAuthActivity send local broadcast");
            MonitorUtil.monitorAuthBack(this.appName);
        }
        finish();
    }
}
