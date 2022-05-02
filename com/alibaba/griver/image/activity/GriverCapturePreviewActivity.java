package com.alibaba.griver.image.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.executor.GriverExecutors;
import com.alibaba.griver.image.GriverImageService;
import com.alibaba.griver.image.R;
import com.alibaba.griver.image.capture.CaptureServiceImpl;
import com.alibaba.griver.image.capture.meta.CaptureParam;
import com.alibaba.griver.image.capture.meta.MediaInfo;
import com.alibaba.griver.image.framework.api.APImageDownLoadCallback;
import com.google.common.base.Ascii;
import java.io.File;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class GriverCapturePreviewActivity extends GriverMediaBaseActivity {
    public static final String EXTRA_KEY_MEDIA_INFO = "EXTRA_KEY_MEDIA_INFO";
    public static final int getMin = 165;
    public static final byte[] setMax = {19, -14, 115, -87, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};

    /* renamed from: a  reason: collision with root package name */
    private ImageView f10450a;
    private TextView b;
    private TextView c;
    /* access modifiers changed from: private */
    public MediaInfo d;
    private String e;
    private Bundle f;
    private View g;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(byte r7, short r8, byte r9) {
        /*
            int r9 = r9 * 45
            int r9 = r9 + 56
            int r8 = r8 * 165
            int r8 = r8 + 11
            int r7 = r7 * 175
            int r7 = 178 - r7
            byte[] r0 = setMax
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r9 = r8
            r3 = r1
            r5 = 0
            r8 = r7
            r1 = r0
            r0 = r9
            goto L_0x0032
        L_0x001a:
            r3 = 0
        L_0x001b:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L_0x002a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L_0x002a:
            byte r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L_0x0032:
            int r7 = -r7
            int r9 = r9 + r7
            int r9 = r9 + -2
            r7 = r8
            r8 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.image.activity.GriverCapturePreviewActivity.setMax(byte, short, byte):java.lang.String");
    }

    public static String getAbsPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return Uri.parse(str).getPath();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte b2 = (byte) setMax[96];
        byte b3 = (byte) b2;
        String max2 = setMax(b2, b3, (byte) b3);
        byte b4 = (byte) setMax[8];
        byte b5 = (byte) b4;
        String max3 = setMax(b4, b5, (byte) b5);
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
            onCancelLoad.setMax(-360972550, oncanceled);
            onCancelLoad.getMin(-360972550, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -360972550 == (max = dispatchOnCancelled.getMax(applicationContext2, -360972550)))) {
            onCanceled oncanceled2 = new onCanceled(-360972550, max, 512);
            onCancelLoad.setMax(-360972550, oncanceled2);
            onCancelLoad.getMin(-360972550, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-360972550, oncanceled3);
            onCancelLoad.getMin(-360972550, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.griver_image_activity_record_preview);
        if (b()) {
            this.f10450a = (ImageView) findViewById(R.id.previewIv);
            this.b = (TextView) findViewById(R.id.takeAgain);
            this.g = findViewById(R.id.bottomBar);
            this.b.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    GriverCapturePreviewActivity.this.a();
                }
            });
            TextView textView = (TextView) findViewById(R.id.usePhoto);
            this.c = textView;
            textView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    CaptureServiceImpl.notifyAction(false, GriverCapturePreviewActivity.this.d, true);
                    GriverCapturePreviewActivity.this.finish();
                }
            });
            a(this.d);
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        Intent intent = new Intent(GriverEnv.getApplicationContext(), GriverCaptureActivity.class);
        this.f.remove(EXTRA_KEY_MEDIA_INFO);
        intent.putExtras(this.f);
        intent.putExtra(CaptureParam.INIT_TYPE, 1);
        startActivity(intent);
        a(this.d.path);
        finish();
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            RVLogger.d("GriverCapturePreviewActivity", "deleteImage called when path is Empty.");
        } else {
            GriverExecutors.getExecutor(ExecutorType.NORMAL).execute(new DeleteRunnable(str));
        }
    }

    private boolean b() {
        Bundle extras = getIntent().getExtras();
        this.f = extras;
        if (extras == null) {
            finish();
            RVLogger.d("GriverCapturePreviewActivity", "Extras is Null.");
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) extras.getSerializable(EXTRA_KEY_MEDIA_INFO);
        this.d = mediaInfo;
        if (mediaInfo == null) {
            finish();
            RVLogger.d("GriverCapturePreviewActivity", "PhotoInfo is Null.");
            return false;
        }
        this.e = this.f.getString("businessId");
        return true;
    }

    private void a(MediaInfo mediaInfo) {
        if (this.d.heightPx < this.d.widthPx) {
            this.f10450a.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.g.setBackgroundColor(getResources().getColor(R.color.griver_image_colorLandscapeBarBg));
        } else {
            this.f10450a.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.g.setBackgroundColor(getResources().getColor(R.color.griver_image_colorPortraitBarBg));
        }
        c().loadOriginalImage(mediaInfo.path, this.f10450a, (Drawable) null, (APImageDownLoadCallback) null, this.e);
    }

    private GriverImageService c() {
        GriverImageService griverImageService = (GriverImageService) RVProxy.get(GriverImageService.class);
        if (griverImageService == null) {
            RVLogger.w("GriverCapturePreviewActivity", "GriverImageService is Null.");
        }
        return griverImageService;
    }

    public void onBackPressed() {
        a();
        super.onBackPressed();
    }

    static class DeleteRunnable implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private String f10451a;

        public DeleteRunnable(String str) {
            this.f10451a = GriverCapturePreviewActivity.getAbsPath(str);
        }

        public void run() {
            File file = new File(this.f10451a);
            if (!file.exists()) {
                return;
            }
            if (file.delete()) {
                RVLogger.d("GriverCapturePreviewActivity", "Delete image success.");
            } else {
                RVLogger.d("GriverCapturePreviewActivity", "Delete image failed.");
            }
        }
    }
}
