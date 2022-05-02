package com.iap.ac.android.acs.plugin.downgrade.ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.downgrade.utils.ApiDowngradeUtils;
import com.iap.ac.android.acs.plugin.downgrade.utils.ImageLoader;
import com.iap.ac.android.common.log.ACLog;
import java.util.Random;
import o.IntRange;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class ErrorPageActivity extends Activity {
    private static final String KEY_BUTTON_TEXT = "buttonText";
    private static final String KEY_ICON_URL = "iconUrl";
    private static final String KEY_MESSAGE = "message";
    public static final String KEY_PAGE_FINISH_TYPE = "pageFinishType";
    private static final String KEY_TITLE = "title";
    public static final String PAGE_FINISH_WITH_ACTION = "pageFinishTypeOfAction";
    public static final String PAGE_FINISH_WITH_BACK = "pageFinishTypeOfBack";
    private static final String TAG = ApiDowngradeUtils.logTag("ErrorPageActivity");
    public static final byte[] setMax = {66, 67, 80, 117, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMin = 20;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(byte r6, short r7, short r8) {
        /*
            int r7 = r7 * 165
            int r7 = r7 + 11
            int r6 = r6 * 45
            int r6 = 101 - r6
            int r8 = r8 * 175
            int r8 = 179 - r8
            byte[] r0 = setMax
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            r6 = r7
            r4 = r8
            r3 = 0
            goto L_0x002c
        L_0x0019:
            r3 = 0
        L_0x001a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L_0x0025
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0025:
            int r3 = r3 + 1
            byte r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x002c:
            int r8 = r8 + 1
            int r7 = r7 + r4
            int r7 = r7 + -2
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.downgrade.ui.ErrorPageActivity.length(byte, short, short):java.lang.String");
    }

    public static void startPage(Context context, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(context, ErrorPageActivity.class);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        intent.putExtra("title", str);
        intent.putExtra("iconUrl", str2);
        intent.putExtra("message", str3);
        intent.putExtra(KEY_BUTTON_TEXT, str4);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = setMax;
        byte b = (byte) bArr[85];
        String length3 = length((byte) bArr[8], b, (byte) b);
        byte[] bArr2 = setMax;
        byte b2 = (byte) bArr2[8];
        String length4 = length((byte) bArr2[85], b2, (byte) b2);
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
            onCancelLoad.setMax(-1241385904, oncanceled);
            onCancelLoad.getMin(-1241385904, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-1241385904, oncanceled2);
            onCancelLoad.getMin(-1241385904, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-1241385904, oncanceled3);
            onCancelLoad.getMin(-1241385904, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.acplugin_activity_error_page);
        ACLog.d(TAG, "onCreate()");
        init();
    }

    private void init() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-504568553, oncanceled);
            onCancelLoad.getMin(-504568553, oncanceled);
        }
        Button button = (Button) findViewById(R.id.btn_action);
        String stringExtra = getIntent().getStringExtra("title");
        String stringExtra2 = getIntent().getStringExtra("iconUrl");
        String stringExtra3 = getIntent().getStringExtra("message");
        String stringExtra4 = getIntent().getStringExtra(KEY_BUTTON_TEXT);
        ((TextView) findViewById(R.id.tv_title)).setText(stringExtra);
        ImageLoader.loadImage((ImageView) findViewById(R.id.iv_icon), stringExtra2, IntRange.length((Context) this, R.drawable.acplugin_error_icon));
        ((TextView) findViewById(R.id.tv_message)).setText(stringExtra3);
        button.setText(stringExtra4);
        ((ImageView) findViewById(R.id.iv_back)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ErrorPageActivity.this.onBackPressed();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ErrorPageActivity.this.finishWithType(ErrorPageActivity.PAGE_FINISH_WITH_ACTION);
            }
        });
    }

    public void onBackPressed() {
        finishWithType(PAGE_FINISH_WITH_BACK);
    }

    public void finishWithType(String str) {
        ACLog.d(TAG, "finishWithType() finishType is ".concat(String.valueOf(str)));
        getIntent().putExtra(KEY_PAGE_FINISH_TYPE, str);
        finish();
    }
}
