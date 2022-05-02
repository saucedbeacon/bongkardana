package com.alipay.mobile.verifyidentity.framework;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alipay.android.phone.mobilesdk.socketcraft.api.WSContextConstant;
import com.alipay.mobile.verifyidentity.base.message.RequestConstants;
import com.alipay.mobile.verifyidentity.business.activity.BaseActivity;
import com.alipay.mobile.verifyidentity.framework.engine.VIEngine;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class QueryActivity extends BaseActivity implements DialogInterface.OnKeyListener {
    public static final int getMax = WSContextConstant.HANDSHAKE_RECEIVE_SIZE;
    public static String s_productId;
    public static String s_sceneId;
    public static String s_tntInstId;
    public static String s_userId;
    public static final byte[] setMax = {Ascii.SO, -63, 78, 54, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, short r7, byte r8) {
        /*
            int r8 = r8 * 165
            int r8 = r8 + 11
            int r6 = r6 * 175
            int r6 = 178 - r6
            byte[] r0 = setMax
            int r7 = r7 * 45
            int r7 = 101 - r7
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0033
        L_0x001a:
            r3 = 0
        L_0x001b:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0026:
            int r6 = r6 + 1
            int r3 = r3 + 1
            byte r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0033:
            int r8 = r8 + r7
            int r7 = r8 + -2
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.verifyidentity.framework.QueryActivity.setMax(int, short, byte):java.lang.String");
    }

    public void initData() {
    }

    public void modifyViewFromOutside() {
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = setMax;
        String max2 = setMax((byte) bArr[85], (byte) bArr[8], (byte) bArr[85]);
        byte[] bArr2 = setMax;
        String max3 = setMax((byte) bArr2[8], (byte) bArr2[85], (byte) bArr2[8]);
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
            onCancelLoad.setMax(235726759, oncanceled);
            onCancelLoad.getMin(235726759, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || 235726759 == (max = dispatchOnCancelled.getMax(applicationContext2, 235726759)))) {
            onCanceled oncanceled2 = new onCanceled(235726759, max, 512);
            onCancelLoad.setMax(235726759, oncanceled2);
            onCancelLoad.getMin(235726759, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(235726759, oncanceled3);
            onCancelLoad.getMin(235726759, oncanceled3);
        }
        super.onCreate(bundle);
        processIntent();
    }

    private void processIntent() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("productId");
            if (TextUtils.isEmpty(stringExtra)) {
                stringExtra = s_productId;
            }
            String stringExtra2 = intent.getStringExtra("userId");
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = s_userId;
            }
            String stringExtra3 = intent.getStringExtra("sceneId");
            if (TextUtils.isEmpty(stringExtra3)) {
                stringExtra3 = s_sceneId;
            }
            String stringExtra4 = intent.getStringExtra(RequestConstants.SecVIKeyTntInstId);
            if (TextUtils.isEmpty(stringExtra4)) {
                stringExtra4 = s_tntInstId;
            }
            String stringExtra5 = intent.getStringExtra("productCode");
            String stringExtra6 = intent.getStringExtra("action");
            String stringExtra7 = intent.getStringExtra("type");
            HashMap hashMap = new HashMap();
            hashMap.put("productId", stringExtra);
            hashMap.put("userId", stringExtra2);
            hashMap.put("sceneId", stringExtra3);
            hashMap.put(RequestConstants.SecVIKeyTntInstId, stringExtra4);
            if (!TextUtils.isEmpty(stringExtra6)) {
                hashMap.put("action", stringExtra6);
            }
            if (!TextUtils.isEmpty(stringExtra7)) {
                hashMap.put("type", stringExtra7);
            }
            if (!TextUtils.isEmpty(stringExtra5)) {
                hashMap.put("productCode", stringExtra5);
            }
            VIEngine.enterBic(this, hashMap, new VIEngine.OnQueryResult() {
                public void onSuccess() {
                    QueryActivity.this.finish();
                }

                public void onFail() {
                    QueryActivity.this.finish();
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-539387827, oncanceled);
            onCancelLoad.getMin(-539387827, oncanceled);
        }
        overridePendingTransition(0, 0);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        processIntent();
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        int min;
        int min2;
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(843434795, oncanceled);
            onCancelLoad.getMin(843434795, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(843434795, oncanceled2);
            onCancelLoad.getMin(843434795, oncanceled2);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.getMin(context, i)))) {
            onCanceled oncanceled3 = new onCanceled(i, min, 32);
            onCancelLoad.setMax(843434795, oncanceled3);
            onCancelLoad.getMin(843434795, oncanceled3);
        }
        if (i != 4 || isFinishing()) {
            return false;
        }
        finish();
        return false;
    }
}
