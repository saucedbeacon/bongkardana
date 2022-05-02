package com.alibaba.griver.image.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.image.R;
import com.alibaba.griver.image.framework.meta.ImageFileType;
import com.alibaba.griver.image.photo.meta.PhotoParam;
import com.alibaba.griver.image.photo.widget.PhotoBrowseView;
import com.alibaba.griver.ui.ant.AUTitleBar;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class GriverPhotoPreviewActivity extends GriverMediaBaseActivity {
    public static final String TAG = "GriverPhotoPreviewActivity";
    public static final byte[] setMax = {66, ImageFileType.HEAD_GIF_0, 5, -103, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMin = 198;

    /* renamed from: a  reason: collision with root package name */
    private PhotoBrowseView f10452a;
    private boolean b;
    private AUTitleBar c;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(byte r7, byte r8, byte r9) {
        /*
            byte[] r0 = setMax
            int r7 = r7 * 165
            int r7 = r7 + 11
            int r9 = r9 * 175
            int r9 = 178 - r9
            int r8 = r8 * 45
            int r8 = 101 - r8
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r8 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            goto L_0x0035
        L_0x001b:
            r3 = 0
        L_0x001c:
            int r9 = r9 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L_0x002b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x002b:
            byte r3 = r0[r9]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r1
            r1 = r6
        L_0x0035:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + -2
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.activity.GriverPhotoPreviewActivity.setMax(byte, byte, byte):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = setMax;
        int i = 8;
        String max = setMax((byte) bArr[96], (byte) bArr[8], (byte) bArr[96]);
        byte[] bArr2 = setMax;
        String max2 = setMax((byte) bArr2[8], (byte) bArr2[96], (byte) bArr2[8]);
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
            onCancelLoad.setMax(-626992012, oncanceled);
            onCancelLoad.getMin(-626992012, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-626992012, oncanceled2);
            onCancelLoad.getMin(-626992012, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-626992012, oncanceled3);
            onCancelLoad.getMin(-626992012, oncanceled3);
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (bundle == null) {
            bundle = getIntent().getExtras();
            if (bundle == null) {
                finish();
                return;
            }
        } else {
            RVLogger.d(TAG, "initialize photo preview with save instance.");
        }
        if (bundle.getBoolean(PhotoParam.BROWSE_GALLERY, false)) {
            getWindow().setFlags(1024, 1024);
        }
        setContentView(R.layout.griver_image_activity_photo_preview);
        PhotoBrowseView photoBrowseView = (PhotoBrowseView) findViewById(R.id.photo_browse_view);
        this.f10452a = photoBrowseView;
        photoBrowseView.setActivity(this);
        this.f10452a.setBundle(bundle);
        this.b = bundle.getBoolean(PhotoParam.USING_PHONE_TITLE_BAR, false);
        AUTitleBar aUTitleBar = (AUTitleBar) findViewById(R.id.cashier_top_bar);
        this.c = aUTitleBar;
        if (this.b) {
            i = 0;
        }
        aUTitleBar.setVisibility(i);
        this.c.setBackgroundDrawable(new ColorDrawable(1059465787));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f10452a.setActivity((Activity) null);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10452a.pause();
    }

    public void onBackPressed() {
        PhotoBrowseView photoBrowseView = this.f10452a;
        if (photoBrowseView != null) {
            photoBrowseView.backPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f10452a.resume();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f10452a.newIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f10452a.saveInstanceState(getIntent(), bundle);
    }
}
