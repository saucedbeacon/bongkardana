package com.alipay.zoloz.zface.ui.activity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.workspace.BioFragmentContainer;
import com.alipay.zoloz.hardware.camera.widget.AbsSurfaceView;
import com.alipay.zoloz.toyger.R;
import com.alipay.zoloz.zface.beans.AlertData;
import com.alipay.zoloz.zface.presenter.ZFaceBasePresenter;
import com.alipay.zoloz.zface.presenter.ZFaceCallback;
import com.google.common.base.Ascii;
import java.util.Random;
import o.FontRes;
import o.IntRange;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public abstract class BaseCameraPermissionActivity extends BioFragmentContainer implements ZFaceCallback {
    public static final int equals = 243;
    public static final byte[] getMin = {1, 104, 13, 104, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    private final int PERMISSION_REQUEST_CODE = 1;
    private View mCameraSurfaceView;
    private boolean mFirstCheckPermission = true;
    protected DialogInterface.OnClickListener mGoToPermissionSetting = new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialogInterface, int i) {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            StringBuilder sb = new StringBuilder("package:");
            sb.append(BaseCameraPermissionActivity.this.getPackageName());
            intent.setData(Uri.parse(sb.toString()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            BaseCameraPermissionActivity.this.startActivity(intent);
        }
    };
    private ZFaceBasePresenter mPresenter;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(int r7, byte r8, byte r9) {
        /*
            int r9 = r9 * 165
            int r9 = 176 - r9
            byte[] r0 = getMin
            int r7 = r7 * 175
            int r7 = 178 - r7
            int r8 = r8 * 45
            int r8 = r8 + 56
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L_0x001a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L_0x0033
        L_0x001a:
            r3 = 0
        L_0x001b:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r9) goto L_0x002a
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
            r0 = r9
            r9 = r6
        L_0x0033:
            int r9 = r9 + r7
            int r7 = r9 + -2
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.zface.ui.activity.BaseCameraPermissionActivity.setMin(int, byte, byte):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public abstract void alertCameraOpenFailed();

    /* access modifiers changed from: protected */
    public abstract void alertCameraPermissionFailed(DialogInterface.OnClickListener onClickListener);

    /* access modifiers changed from: protected */
    public abstract ZFaceBasePresenter createPresenter(ZFaceCallback zFaceCallback, AbsSurfaceView absSurfaceView);

    /* access modifiers changed from: protected */
    public abstract int getLayoutResId();

    public void onCameraWithPermission() {
    }

    /* access modifiers changed from: protected */
    public abstract void onInitView();

    /* access modifiers changed from: protected */
    public boolean preCheck() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte[] bArr = getMin;
        byte b = (byte) bArr[0];
        String min2 = setMin(b, (byte) b, (byte) bArr[8]);
        byte[] bArr2 = getMin;
        byte b2 = (byte) bArr2[8];
        String min3 = setMin(b2, (byte) b2, (byte) bArr2[0]);
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
            onCancelLoad.setMax(-257714108, oncanceled);
            onCancelLoad.getMin(-257714108, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-257714108, oncanceled2);
            onCancelLoad.getMin(-257714108, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(-257714108, oncanceled3);
            onCancelLoad.getMin(-257714108, oncanceled3);
        }
        super.onCreate(bundle);
        if (!preCheck()) {
            finish();
            return;
        }
        setContentView(getLayoutResId());
        getWindow().addFlags(128);
        initView();
        initPresenter();
        onInitView();
        this.mPresenter.startToyger();
    }

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        View view = this.mCameraSurfaceView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public void onPause() {
        super.onPause();
        this.mCameraSurfaceView.setVisibility(4);
    }

    private void initView() {
        this.mCameraSurfaceView = findViewById(R.id.zface_surface_view);
    }

    private void initPresenter() {
        this.mCameraSurfaceView.setVisibility(0);
        this.mPresenter = createPresenter(this, (AbsSurfaceView) this.mCameraSurfaceView);
    }

    public void onErrorEvent(AlertData alertData) {
        if (handleErrorEvnet(alertData)) {
        }
    }

    public boolean handleErrorEvnet(AlertData alertData) {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-404530196, oncanceled);
            onCancelLoad.getMin(-404530196, oncanceled);
        }
        if (!ZcodeConstants.ZCODE_ERROR_CAMERA_STREAM_ERROR.equals(alertData.subCode) && !ZcodeConstants.ZCODE_NO_CAMERA_PERMISSION.equals(alertData.subCode)) {
            return false;
        }
        if (!checkCameraPermission()) {
            return true;
        }
        alertCameraOpenFailed();
        return true;
    }

    private boolean checkCameraPermission() {
        boolean hasPermission = hasPermission();
        if (!hasPermission) {
            this.mCameraSurfaceView.setVisibility(4);
            if (this.mFirstCheckPermission) {
                this.mFirstCheckPermission = false;
                FontRes.getMin(this, new String[]{"android.permission.CAMERA"}, 1);
            } else {
                alertCameraPermissionFailed(this.mGoToPermissionSetting);
            }
        }
        return hasPermission;
    }

    /* access modifiers changed from: protected */
    public boolean hasPermission() {
        if (Build.VERSION.SDK_INT < 23 || IntRange.length((Context) this, "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            alertCameraPermissionFailed(this.mGoToPermissionSetting);
            return;
        }
        this.mCameraSurfaceView.setVisibility(0);
        onCameraWithPermission();
    }
}
