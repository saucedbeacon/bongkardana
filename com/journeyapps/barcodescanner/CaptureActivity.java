package com.journeyapps.barcodescanner;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import com.google.zxing.client.android.R;
import o.FontRes;
import o.IntRange;
import o.applyOptions;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class CaptureActivity extends Activity {
    public static final byte[] length = {117, 83, -92, Ascii.DC2, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMax = 52;
    private DecoratedBarcodeView getMax;
    private applyOptions setMin;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String length(int r6, short r7, int r8) {
        /*
            int r8 = r8 * 45
            int r8 = 101 - r8
            int r7 = r7 + 4
            byte[] r0 = length
            int r6 = r6 * 165
            int r6 = r6 + 11
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            r8 = r7
            r7 = r6
            goto L_0x0034
        L_0x001a:
            r3 = 0
        L_0x001b:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L_0x0026
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0026:
            int r7 = r7 + 1
            byte r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            r8 = r5
        L_0x0034:
            int r0 = r0 + r6
            int r6 = r0 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.length(int, short, int):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fe, code lost:
        if (r9 != 1) goto L_0x010f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            byte[] r0 = length
            r1 = 85
            byte r2 = r0[r1]
            byte r2 = (byte) r2
            r3 = 96
            byte r3 = r0[r3]
            short r3 = (short) r3
            r4 = 8
            byte r0 = r0[r4]
            byte r0 = (byte) r0
            java.lang.String r0 = length(r2, r3, r0)
            byte[] r2 = length
            byte r3 = r2[r4]
            byte r3 = (byte) r3
            r5 = r3 | 174(0xae, float:2.44E-43)
            short r5 = (short) r5
            byte r1 = r2[r1]
            byte r1 = (byte) r1
            java.lang.String r1 = length(r3, r5, r1)
            android.content.Context r2 = r8.getBaseContext()
            r3 = 0
            if (r2 == 0) goto L_0x0036
            android.content.Context r5 = r2.getApplicationContext()
            if (r5 == 0) goto L_0x0036
            android.content.Context r2 = r2.getApplicationContext()
            goto L_0x0037
        L_0x0036:
            r2 = r3
        L_0x0037:
            if (r2 == 0) goto L_0x0040
            o.isReset r5 = o.registerOnLoadCanceledListener.setMin()
            r5.getMax(r2, r0, r1)
        L_0x0040:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r0.nextInt(r1)
            int r1 = o.dispatchOnCancelled.length(r0)
            r2 = 1
            r5 = 171005400(0xa3155d8, float:8.5383854E-33)
            if (r0 == r1) goto L_0x0061
            o.onCanceled r6 = new o.onCanceled
            r6.<init>(r0, r1, r2)
            o.onCancelLoad.setMax(r5, r6)
            o.onCancelLoad.getMin(r5, r6)
        L_0x0061:
            android.content.Context r0 = r8.getBaseContext()
            if (r0 == 0) goto L_0x006c
            android.content.Context r0 = r0.getApplicationContext()
            goto L_0x006d
        L_0x006c:
            r0 = r3
        L_0x006d:
            if (r0 == 0) goto L_0x0082
            int r0 = o.dispatchOnCancelled.getMax(r0, r5)
            if (r5 == r0) goto L_0x0082
            o.onCanceled r1 = new o.onCanceled
            r6 = 512(0x200, float:7.175E-43)
            r1.<init>(r5, r0, r6)
            o.onCancelLoad.setMax(r5, r1)
            o.onCancelLoad.getMin(r5, r1)
        L_0x0082:
            android.content.Context r0 = r8.getBaseContext()
            if (r0 == 0) goto L_0x008c
            android.content.Context r3 = r0.getApplicationContext()
        L_0x008c:
            if (r3 == 0) goto L_0x00a4
            java.lang.String[] r0 = r3.fileList()
            int r0 = r0.length
            int r1 = o.dispatchOnCancelled.setMin(r3, r0)
            if (r0 == r1) goto L_0x00a4
            o.onCanceled r3 = new o.onCanceled
            r3.<init>(r0, r1, r4)
            o.onCancelLoad.setMax(r5, r3)
            o.onCancelLoad.getMin(r5, r3)
        L_0x00a4:
            super.onCreate(r9)
            com.journeyapps.barcodescanner.DecoratedBarcodeView r0 = r8.initializeContent()
            r8.getMax = r0
            o.applyOptions r0 = new o.applyOptions
            com.journeyapps.barcodescanner.DecoratedBarcodeView r1 = r8.getMax
            r0.<init>(r8, r1)
            r8.setMin = r0
            android.content.Intent r1 = r8.getIntent()
            android.app.Activity r3 = r0.length
            android.view.Window r3 = r3.getWindow()
            r5 = 128(0x80, float:1.794E-43)
            r3.addFlags(r5)
            r3 = -1
            if (r9 == 0) goto L_0x00d0
            java.lang.String r5 = "SAVED_ORIENTATION_LOCK"
            int r9 = r9.getInt(r5, r3)
            r0.getMax = r9
        L_0x00d0:
            if (r1 == 0) goto L_0x0173
            java.lang.String r9 = "SCAN_ORIENTATION_LOCKED"
            boolean r9 = r1.getBooleanExtra(r9, r2)
            r5 = 0
            if (r9 == 0) goto L_0x0118
            int r9 = r0.getMax
            if (r9 != r3) goto L_0x0111
            android.app.Activity r9 = r0.length
            android.view.WindowManager r9 = r9.getWindowManager()
            android.view.Display r9 = r9.getDefaultDisplay()
            int r9 = r9.getRotation()
            android.app.Activity r3 = r0.length
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.orientation
            r6 = 2
            if (r3 != r6) goto L_0x0101
            if (r9 == 0) goto L_0x010e
            if (r9 != r2) goto L_0x010f
            goto L_0x010e
        L_0x0101:
            if (r3 != r2) goto L_0x010e
            if (r9 == 0) goto L_0x010c
            r3 = 3
            if (r9 != r3) goto L_0x0109
            goto L_0x010c
        L_0x0109:
            r4 = 9
            goto L_0x010f
        L_0x010c:
            r4 = 1
            goto L_0x010f
        L_0x010e:
            r4 = 0
        L_0x010f:
            r0.getMax = r4
        L_0x0111:
            android.app.Activity r9 = r0.length
            int r3 = r0.getMax
            r9.setRequestedOrientation(r3)
        L_0x0118:
            java.lang.String r9 = r1.getAction()
            java.lang.String r3 = "com.google.zxing.client.android.SCAN"
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x0129
            com.journeyapps.barcodescanner.DecoratedBarcodeView r9 = r0.setMin
            r9.initializeFromIntent(r1)
        L_0x0129:
            java.lang.String r9 = "BEEP_ENABLED"
            boolean r9 = r1.getBooleanExtra(r9, r2)
            if (r9 != 0) goto L_0x0136
            com.google.zxing.client.android.BeepManager r9 = r0.isInside
            r9.setBeepEnabled(r5)
        L_0x0136:
            java.lang.String r9 = "SHOW_MISSING_CAMERA_PERMISSION_DIALOG"
            boolean r3 = r1.hasExtra(r9)
            if (r3 == 0) goto L_0x0151
            boolean r9 = r1.getBooleanExtra(r9, r2)
            java.lang.String r3 = "MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"
            java.lang.String r3 = r1.getStringExtra(r3)
            r0.IsOverlapping = r9
            if (r3 == 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            java.lang.String r3 = ""
        L_0x014f:
            r0.equals = r3
        L_0x0151:
            java.lang.String r9 = "TIMEOUT"
            boolean r3 = r1.hasExtra(r9)
            if (r3 == 0) goto L_0x0169
            android.os.Handler r3 = r0.toDoubleRange
            o.MediaButtonReceiver r4 = new o.MediaButtonReceiver
            r4.<init>(r0)
            r6 = 0
            long r6 = r1.getLongExtra(r9, r6)
            r3.postDelayed(r4, r6)
        L_0x0169:
            java.lang.String r9 = "BARCODE_IMAGE_ENABLED"
            boolean r9 = r1.getBooleanExtra(r9, r5)
            if (r9 == 0) goto L_0x0173
            r0.setMax = r2
        L_0x0173:
            o.applyOptions r9 = r8.setMin
            com.journeyapps.barcodescanner.DecoratedBarcodeView r0 = r9.setMin
            o.performLoadItem r9 = r9.toString
            r0.decodeSingle(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.journeyapps.barcodescanner.CaptureActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public DecoratedBarcodeView initializeContent() {
        setContentView(R.layout.zxing_capture);
        return (DecoratedBarcodeView) findViewById(R.id.zxing_barcode_scanner);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        applyOptions applyoptions = this.setMin;
        if (Build.VERSION.SDK_INT < 23) {
            applyoptions.setMin.resume();
        } else if (IntRange.length((Context) applyoptions.length, "android.permission.CAMERA") == 0) {
            applyoptions.setMin.resume();
        } else if (!applyoptions.hashCode) {
            FontRes.getMin(applyoptions.length, new String[]{"android.permission.CAMERA"}, applyOptions.getMin);
            applyoptions.hashCode = true;
        }
        applyoptions.toIntRange.start();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 30677198 == (max = dispatchOnCancelled.getMax(applicationContext, 30677198)))) {
            onCanceled oncanceled = new onCanceled(30677198, max, 512);
            onCancelLoad.setMax(30677198, oncanceled);
            onCancelLoad.getMin(30677198, oncanceled);
        }
        super.onPause();
        applyOptions applyoptions = this.setMin;
        applyoptions.toIntRange.cancel();
        applyoptions.setMin.pauseAndWait();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || -315686138 == (max = dispatchOnCancelled.getMax(applicationContext, -315686138)))) {
            onCanceled oncanceled = new onCanceled(-315686138, max, 512);
            onCancelLoad.setMax(-315686138, oncanceled);
            onCancelLoad.getMin(-315686138, oncanceled);
        }
        super.onDestroy();
        applyOptions applyoptions = this.setMin;
        applyoptions.toFloatRange = true;
        applyoptions.toIntRange.cancel();
        applyoptions.toDoubleRange.removeCallbacksAndMessages((Object) null);
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.setMin.getMax);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.setMin.length(i, iArr);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int length2;
        int min;
        int min2;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min2 = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min2, 8);
            onCancelLoad.setMax(1478421972, oncanceled);
            onCancelLoad.getMin(1478421972, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.getMin(context, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1478421972, oncanceled2);
            onCancelLoad.getMin(1478421972, oncanceled2);
        }
        return this.getMax.onKeyDown(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }
}
