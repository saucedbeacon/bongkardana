package com.alipay.iap.android.f2fpay.widgets.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.paymentcode.F2FPaymentCodeInfo;
import com.alipay.iap.android.f2fpay.widgets.data.BarCodeConfiguration;
import com.alipay.iap.android.f2fpay.widgets.data.QRCodeConfiguration;
import com.alipay.iap.android.f2fpay.widgets.widget.F2FPayBarcodeView;
import com.alipay.iap.android.f2fpay.widgets.widget.F2FPayQRCodeView;
import com.google.common.base.Ascii;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class F2FPayFullscreenDisplayActivity extends Activity {
    public static final int getMin = 20;
    public static final byte[] setMax = {115, -111, -112, 70, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};

    /* renamed from: a  reason: collision with root package name */
    private String f10670a;
    private Rect b = new Rect();
    private a c;
    private int d;
    private int e;
    private View f;
    /* access modifiers changed from: private */
    public FrameLayout g;

    public enum a {
        QRCode,
        Barcode
    }

    /* access modifiers changed from: private */
    public void a(int i, int i2) {
        float f2;
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(2136672920, oncanceled);
            onCancelLoad.getMin(2136672920, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled2 = new onCanceled(i, max, 16);
            onCancelLoad.setMax(2136672920, oncanceled2);
            onCancelLoad.getMin(2136672920, oncanceled2);
        }
        if (this.f != null) {
            int i3 = this.d;
            int i4 = i - (i3 * 2);
            int i5 = i2 - (i3 * 2);
            float f3 = 0.0f;
            if (this.c == a.QRCode) {
                f3 = (((float) i4) * 1.0f) / ((float) this.b.width());
            } else if (this.c == a.Barcode) {
                f3 = (((float) i5) * 1.0f) / ((float) this.b.width());
                f2 = 90.0f;
                this.f.setScaleX(f3);
                this.f.setScaleY(f3);
                this.f.setRotation(f2);
                this.f.forceLayout();
                this.f.invalidate();
            }
            f2 = 0.0f;
            this.f.setScaleX(f3);
            this.f.setScaleY(f3);
            this.f.setRotation(f2);
            this.f.forceLayout();
            this.f.invalidate();
        }
    }

    public static void a(Rect rect, View view) {
        view.getWindowVisibleDisplayFrame(rect);
        Point point = new Point(rect.left, rect.top);
        view.getGlobalVisibleRect(rect);
        rect.offset(-point.x, -point.y);
        int height = view.getHeight() - rect.height();
        if (height <= 0) {
            return;
        }
        if (rect.top <= 0) {
            rect.top -= height;
        } else {
            rect.bottom += height;
        }
    }

    private boolean a() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(920365098, oncanceled);
            onCancelLoad.getMin(920365098, oncanceled);
        }
        this.d = com.alipay.iap.android.f2fpay.widgets.a.a.a(getResources(), 30.0f);
        try {
            Intent intent = getIntent();
            this.f10670a = intent.getStringExtra("PAYMENT_CODE");
            this.e = intent.getIntExtra("BACKGROUND_COLOR", -1);
            this.c = (a) intent.getSerializableExtra("DISPLAY_PATTERN");
            return true;
        } catch (Exception e2) {
            LoggerWrapper.e(F2FPayConstants.TAG, e2.getMessage(), e2);
            return false;
        }
    }

    private void b() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-138120231, oncanceled);
            onCancelLoad.getMin(-138120231, oncanceled);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        this.g = frameLayout;
        frameLayout.setBackgroundColor(this.e);
        addContentView(this.g, new ViewGroup.LayoutParams(-1, -1));
        c();
        this.g.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                int width = F2FPayFullscreenDisplayActivity.this.g.getWidth();
                int height = F2FPayFullscreenDisplayActivity.this.g.getHeight();
                if (width > 0 && height > 0) {
                    F2FPayFullscreenDisplayActivity.this.a(width, height);
                }
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.b.width(), this.b.height());
        Intent intent = getIntent();
        if (this.c == a.QRCode) {
            F2FPayQRCodeView f2FPayQRCodeView = new F2FPayQRCodeView(this);
            this.f = f2FPayQRCodeView;
            f2FPayQRCodeView.setConfiguration((QRCodeConfiguration) intent.getParcelableExtra("QR_CODE_CONFIGURATION"));
            F2FPaymentCodeInfo f2FPaymentCodeInfo = new F2FPaymentCodeInfo();
            f2FPaymentCodeInfo.paymentCode = this.f10670a;
            f2FPayQRCodeView.updatePaymentCode(f2FPaymentCodeInfo);
        } else if (this.c == a.Barcode) {
            F2FPayBarcodeView f2FPayBarcodeView = new F2FPayBarcodeView(this);
            this.f = f2FPayBarcodeView;
            f2FPayBarcodeView.setConfiguration((BarCodeConfiguration) intent.getParcelableExtra("BARCODE_CONFIGURATION"));
            F2FPaymentCodeInfo f2FPaymentCodeInfo2 = new F2FPaymentCodeInfo();
            f2FPaymentCodeInfo2.paymentCode = this.f10670a;
            f2FPayBarcodeView.updatePaymentCode(f2FPaymentCodeInfo2);
            layoutParams.height = -2;
        }
        if (this.f != null) {
            layoutParams.gravity = 17;
            this.g.addView(this.f, layoutParams);
        }
        View view = new View(this);
        view.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                F2FPayFullscreenDisplayActivity.this.finish();
            }
        });
        this.g.addView(view, -1, -1);
    }

    private void c() {
        a(this.b, (View) this.g);
        if (this.c == a.QRCode) {
            Rect rect = this.b;
            int i = this.d;
            rect.inset(i, i);
        } else if (this.c == a.Barcode) {
            this.b.inset(0, this.d);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(byte r6, int r7, int r8) {
        /*
            int r6 = r6 * 45
            int r6 = 101 - r6
            int r7 = r7 * 165
            int r7 = r7 + 11
            byte[] r0 = setMax
            int r8 = r8 * 175
            int r8 = 179 - r8
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            r8 = r7
            goto L_0x0032
        L_0x001b:
            r3 = 0
        L_0x001c:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L_0x0027
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0027:
            byte r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L_0x0032:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r0 + 1
            int r6 = r6 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.f2fpay.widgets.activity.F2FPayFullscreenDisplayActivity.getMax(byte, int, int):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int max;
        byte[] bArr = setMax;
        byte b2 = (byte) bArr[96];
        String max2 = getMax((byte) bArr[8], b2, (byte) b2);
        byte[] bArr2 = setMax;
        byte b3 = (byte) bArr2[8];
        String max3 = getMax((byte) bArr2[96], b3, (byte) b3);
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
            onCancelLoad.setMax(-1167661278, oncanceled);
            onCancelLoad.getMin(-1167661278, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -1167661278 == (max = dispatchOnCancelled.getMax(applicationContext2, -1167661278)))) {
            onCanceled oncanceled2 = new onCanceled(-1167661278, max, 512);
            onCancelLoad.setMax(-1167661278, oncanceled2);
            onCancelLoad.getMin(-1167661278, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-1167661278, oncanceled3);
            onCancelLoad.getMin(-1167661278, oncanceled3);
        }
        int max4 = dispatchOnCancelled.getMax(0);
        if (max4 != 0) {
            onCanceled oncanceled4 = new onCanceled(0, max4, 16);
            onCancelLoad.setMax(-1167661278, oncanceled4);
            onCancelLoad.getMin(-1167661278, oncanceled4);
        }
        super.onCreate(bundle);
        if (!a()) {
            finish();
        } else {
            b();
        }
    }
}
