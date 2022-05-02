package com.iap.ac.android.container.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.common.base.Ascii;
import com.iap.ac.android.common.container.constant.StartMethod;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.container.ACContainer;
import com.iap.ac.android.container.R;
import com.iap.ac.android.container.constant.ContainerKeys;
import com.iap.ac.android.container.presenter.ACContainerPresenter;
import com.iap.ac.android.container.view.IContainerView;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class ACContainerActivity extends Activity implements IContainerView {
    private static final String TAG = "ACContainerActivity";
    public static final byte[] getMax = {88, -29, 1, -110, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMax = 198;
    private Bundle bundle;
    private WebView mWebView;
    private String originalUrl;
    private String pageId;
    private TextView titleTextView;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(byte r6, byte r7, int r8) {
        /*
            int r8 = r8 * 165
            int r8 = 176 - r8
            byte[] r0 = getMax
            int r7 = r7 * 175
            int r7 = 178 - r7
            int r6 = r6 * 45
            int r6 = r6 + 56
            byte[] r1 = new byte[r8]
            int r8 = r8 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r6 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0035
        L_0x001b:
            r3 = 0
        L_0x001c:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L_0x0027
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0027:
            int r3 = r3 + 1
            int r7 = r7 + 1
            byte r4 = r0[r7]
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0035:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + -2
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.container.activity.ACContainerActivity.setMax(byte, byte, int):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle2) {
        int length;
        int min;
        int length2;
        int min2;
        int length3;
        byte[] bArr = getMax;
        byte b = (byte) bArr[2];
        String max = setMax(b, (byte) b, (byte) bArr[8]);
        byte[] bArr2 = getMax;
        byte b2 = (byte) bArr2[8];
        String max2 = setMax(b2, (byte) b2, (byte) bArr2[2]);
        Context baseContext = getBaseContext();
        byte[] bArr3 = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max, max2);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length4 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length4) {
            onCanceled oncanceled = new onCanceled(nextInt, length4, 1);
            onCancelLoad.setMax(173729865, oncanceled);
            onCancelLoad.getMin(173729865, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length3 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length3, 4);
            onCancelLoad.setMax(173729865, oncanceled2);
            onCancelLoad.getMin(173729865, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = applicationContext3.fileList().length) == (min2 = dispatchOnCancelled.setMin(applicationContext3, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min2, 8);
            onCancelLoad.setMax(173729865, oncanceled3);
            onCancelLoad.getMin(173729865, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        Context applicationContext4 = baseContext4 != null ? baseContext4.getApplicationContext() : null;
        if (!(applicationContext4 == null || (length = applicationContext4.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext4, length)))) {
            onCanceled oncanceled4 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(173729865, oncanceled4);
            onCancelLoad.getMin(173729865, oncanceled4);
        }
        super.onCreate(bundle2);
        setContentView(R.layout.layout_payment_container);
        ACLog.i(TAG, "Container activity onCreate.");
        ACContainerPresenter aCContainerPresenter = new ACContainerPresenter(this, this);
        this.bundle = getIntent().getExtras();
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.mWebView = webView;
        aCContainerPresenter.setWebView(webView);
        this.titleTextView = (TextView) findViewById(R.id.h5_ll_lv_nav_title);
        ((ImageButton) findViewById(R.id.h5_lv_nav_back_loading)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ACContainerActivity.this.onBackPressed();
            }
        });
        Bundle bundle3 = this.bundle;
        if (bundle3 != null) {
            this.originalUrl = bundle3.getString("url");
            this.pageId = this.bundle.getString(ContainerKeys.PARAM_PAGE_ID);
            String string = this.bundle.getString(ContainerKeys.PARAM_START_METHOD);
            String string2 = this.bundle.getString(ContainerKeys.PARAM_POST_PARAMS);
            if (StartMethod.POST.value.equals(string)) {
                if (!TextUtils.isEmpty(string2)) {
                    bArr3 = string2.getBytes();
                }
                aCContainerPresenter.postUrl(this.originalUrl, bArr3);
            } else {
                aCContainerPresenter.loadUrl(this.originalUrl);
            }
        }
        ACContainer.INSTANCE.onCreate(this.pageId, this.bundle);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(1292422907, oncanceled);
            onCancelLoad.getMin(1292422907, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled2 = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1292422907, oncanceled2);
            onCancelLoad.getMin(1292422907, oncanceled2);
        }
        super.onDestroy();
        ACLog.i(TAG, "Container activity onDestroy.");
        ACContainer.INSTANCE.onDestroy(this.pageId, this.bundle);
    }

    public void setTitle(String str) {
        TextView textView = this.titleTextView;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void onBackPressed() {
        WebView webView = this.mWebView;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.mWebView.goBack();
        }
    }
}
