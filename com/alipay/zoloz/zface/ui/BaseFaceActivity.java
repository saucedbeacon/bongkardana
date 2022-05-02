package com.alipay.zoloz.zface.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import com.alipay.mobile.security.bio.config.Constant;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioAppManager;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.utils.ScreenUtil;
import com.alipay.zoloz.config.ConfigCenter;
import com.alipay.zoloz.hardware.camera.widget.AbsSurfaceView;
import com.alipay.zoloz.zface.beans.AlertData;
import com.alipay.zoloz.zface.presenter.ZFaceBasePresenter;
import com.alipay.zoloz.zface.presenter.ZFaceCallback;
import com.alipay.zoloz.zface.presenter.ZFacePresenter;
import com.alipay.zoloz.zface.services.TimeRecord;
import com.alipay.zoloz.zface.services.ZFaceRecordService;
import com.alipay.zoloz.zface.ui.activity.BaseCameraPermissionActivity;
import com.alipay.zoloz.zface.ui.util.AlertUtil;
import com.alipay.zoloz.zface.ui.util.EnvCheck;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import zoloz.ap.com.toolkit.R2;

public abstract class BaseFaceActivity extends BaseCameraPermissionActivity implements AlertUtil.AlertClickEvents {
    public static final byte[] getMax = {Ascii.DC2, -21, -42, -105, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    public static final int setMin = 11;
    private boolean isPause = false;
    protected AlertUtil mAlertUtil;
    protected String mAppTag;
    private boolean mIsFirstResume = true;
    protected boolean mIsUploading = false;
    private boolean mLastHasPermission = false;
    protected ZFacePresenter mZFacePresenter;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMin(int r6, byte r7, byte r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = getMax
            int r8 = r8 * 165
            int r8 = 176 - r8
            int r7 = r7 * 45
            int r7 = 101 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            goto L_0x0034
        L_0x0017:
            r3 = 0
            r5 = r8
            r8 = r7
        L_0x001a:
            r7 = r5
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L_0x002a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x002a:
            byte r4 = r0[r6]
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
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.zface.ui.BaseFaceActivity.getMin(int, byte, byte):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public abstract AlertUtil createAlertUtils(int i);

    /* access modifiers changed from: protected */
    public boolean isCanUseBack() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onHasPermissionResume() {
    }

    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        int max;
        byte[] bArr = getMax;
        byte b = (byte) bArr[8];
        String min2 = getMin((short) bArr[96], b, (byte) b);
        byte b2 = (byte) getMax[85];
        String min3 = getMin(174, b2, (byte) b2);
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
            onCancelLoad.setMax(1612302463, oncanceled);
            onCancelLoad.getMin(1612302463, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (max = dispatchOnCancelled.setMax(applicationContext2, 0, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, max, 2);
            onCancelLoad.setMax(1612302463, oncanceled2);
            onCancelLoad.getMin(1612302463, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        Context applicationContext3 = baseContext3 != null ? baseContext3.getApplicationContext() : null;
        if (!(applicationContext3 == null || (length2 = dispatchOnCancelled.length(applicationContext3, 0)) == 0)) {
            onCanceled oncanceled3 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1612302463, oncanceled3);
            onCancelLoad.getMin(1612302463, oncanceled3);
        }
        Context baseContext4 = getBaseContext();
        if (baseContext4 != null) {
            context = baseContext4.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled4 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1612302463, oncanceled4);
            onCancelLoad.getMin(1612302463, oncanceled4);
        }
        super.onCreate(bundle);
        ConfigCenter.getInstance().setApplicationContext(getApplicationContext());
        EnvCheck.EnvErrorType check = new EnvCheck().check(false);
        if (check == EnvCheck.EnvErrorType.ENV_ERROR_LOW_OS) {
            this.mAlertUtil.alertSystemNotSupport(ZcodeConstants.ZCODE_OS_VERSION_LOW);
        } else if (check == EnvCheck.EnvErrorType.ENV_ERROR_NO_FRONT_CAMERA) {
            this.mAlertUtil.alertSystemNotSupport(ZcodeConstants.ZCODE_ERROR_CAMERA_NO_DEVICE);
        } else if (check == EnvCheck.EnvErrorType.ENV_ERROR_UNSUPPORTED_CPU) {
            this.mAlertUtil.alertSystemNotSupport(ZcodeConstants.ZCODE_UNSUPPORTED_CPU);
        }
    }

    public boolean preCheck() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(338491717, oncanceled);
            onCancelLoad.getMin(338491717, oncanceled);
        }
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        if (currentInstance == null) {
            new IllegalStateException("null == BioServiceManager.getCurrentInstance()");
            return false;
        }
        this.mAppTag = getIntent().getStringExtra(Constant.BIOLOGY_INTENT_ACTION_INFO);
        updateLanguage(((BioAppManager) currentInstance.getBioService(BioAppManager.class)).getBioAppDescription(this.mAppTag));
        return true;
    }

    private void updateLanguage(BioAppDescription bioAppDescription) {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(48933511, oncanceled);
            onCancelLoad.getMin(48933511, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(48933511, oncanceled2);
            onCancelLoad.getMin(48933511, oncanceled2);
        }
        updateLocale(bioAppDescription.getExtProperty().get("locale"));
    }

    private void updateLocale(String str) {
        Locale locale;
        if (str != null) {
            try {
                Configuration configuration = getResources().getConfiguration();
                if (str.contains("-")) {
                    String[] split = str.split("-");
                    if (split.length == 2) {
                        locale = new Locale(split[0], split[1]);
                    } else if (split.length == 1) {
                        locale = new Locale(split[0]);
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        locale = getResources().getConfiguration().getLocales().get(0);
                    } else {
                        locale = getResources().getConfiguration().locale;
                    }
                } else {
                    locale = new Locale(str);
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    configuration.setLocale(locale);
                } else {
                    configuration.locale = new Locale(str);
                }
                getBaseContext().getResources().updateConfiguration(configuration, getResources().getDisplayMetrics());
            } catch (Exception unused) {
            }
        }
    }

    public ZFaceBasePresenter createPresenter(ZFaceCallback zFaceCallback, AbsSurfaceView absSurfaceView) {
        int length;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-653015845, oncanceled);
            onCancelLoad.getMin(-653015845, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled2 = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-653015845, oncanceled2);
            onCancelLoad.getMin(-653015845, oncanceled2);
        }
        this.mAppTag = getIntent().getStringExtra(Constant.BIOLOGY_INTENT_ACTION_INFO);
        ZFacePresenter zFacePresenter = new ZFacePresenter(zFaceCallback, this.mAppTag, absSurfaceView);
        this.mZFacePresenter = zFacePresenter;
        return zFacePresenter;
    }

    public void onResume() {
        super.onResume();
        int screenBrightness = ScreenUtil.getScreenBrightness(this);
        try {
            int light = this.mZFacePresenter.getRemoteConfig().getColl().getLight();
            if (light > screenBrightness) {
                ScreenUtil.setScreenBrightness(this, light);
            }
        } catch (Exception unused) {
        }
        if (this.mIsFirstResume) {
            this.mIsFirstResume = false;
            long timeInterval = TimeRecord.getInstance().getTimeInterval(ZFaceRecordService.ENTER_DETECTION_START);
            HashMap hashMap = new HashMap();
            hashMap.put("timecost", String.valueOf(timeInterval));
            StringBuilder sb = new StringBuilder("");
            sb.append(ScreenUtil.getScreenBrightness(this));
            hashMap.put("brightness", sb.toString());
            record(ZFaceRecordService.ENTER_DETECTION_END, hashMap);
        }
        if (this.isPause && !this.mIsUploading && hasPermission()) {
            if (!this.mLastHasPermission) {
                onHasPermissionResume();
                retry(0);
            } else {
                this.mAlertUtil.alertInterruptResume();
            }
        }
        this.isPause = false;
    }

    public void onPause() {
        super.onPause();
        this.isPause = true;
        this.mLastHasPermission = hasPermission();
        ZFacePresenter zFacePresenter = this.mZFacePresenter;
        if (zFacePresenter != null) {
            zFacePresenter.stopProcess();
        }
    }

    public void onDestroy() {
        record(ZFaceRecordService.NOTICE_EXIT_SDK, (Map<String, String>) null);
        ZFacePresenter zFacePresenter = this.mZFacePresenter;
        if (zFacePresenter != null) {
            zFacePresenter.release();
        }
        super.onDestroy();
    }

    public void sendResponse(int i, String str) {
        ZFacePresenter zFacePresenter = this.mZFacePresenter;
        if (zFacePresenter != null) {
            zFacePresenter.sendResponseWithSubcode(i, str, CodeConstants.getMessage(str));
        }
        finish();
    }

    public void retryUpload() {
        ZFacePresenter zFacePresenter = this.mZFacePresenter;
        if (zFacePresenter != null) {
            zFacePresenter.retryUpload();
        }
    }

    public void stopProcess() {
        ZFacePresenter zFacePresenter = this.mZFacePresenter;
        if (zFacePresenter != null) {
            zFacePresenter.stopProcess();
        }
    }

    public void onFrameComplete() {
        this.mIsUploading = true;
    }

    public void onErrorEvent(AlertData alertData) {
        this.mIsUploading = false;
        super.onErrorEvent(alertData);
    }

    public boolean handleErrorEvnet(AlertData alertData) {
        if (super.handleErrorEvnet(alertData)) {
            return true;
        }
        if (alertData.type == 11) {
            finish();
            return true;
        }
        ZFacePresenter zFacePresenter = this.mZFacePresenter;
        if (zFacePresenter != null) {
            zFacePresenter.stopProcess();
        }
        if (ZcodeConstants.ZCODE_INIT_TOYGER_ERROR.equals(alertData.subCode) || ZcodeConstants.ZCODE_ZIM_IS_BUSY.equals(alertData.subCode)) {
            this.mAlertUtil.alertSystemError();
        } else if (ZcodeConstants.NETWORK_TIMEOUT.equals(alertData.subCode) || ZcodeConstants.ZCODE_NETWORK_ERROR.equals(alertData.subCode)) {
            this.mAlertUtil.alertNetworkError();
        } else if (ZcodeConstants.ZCODE_ERROR_CAMERA_OPEN_FAILED.equals(alertData.subCode)) {
            alertCameraOpenFailed();
        } else if (ZcodeConstants.ZCODE_OS_VERSION_LOW.equals(alertData.subCode) || ZcodeConstants.ZCODE_UNSUPPORTED_CPU.equals(alertData.subCode) || ZcodeConstants.ZCODE_NO_FRANT_CAMERA.equals(alertData.subCode) || ZcodeConstants.ZCODE_ERROR_CAMERA_NO_DEVICE.equals(alertData.subCode)) {
            this.mAlertUtil.alertSystemNotSupport(alertData.subCode);
        } else if (ZcodeConstants.ZCODE_OVER_TIME.equals(alertData.subCode)) {
            this.mAlertUtil.alertTimeOut();
        } else if (ZcodeConstants.ZCODE_OUT_TIME.equals(alertData.subCode)) {
            this.mAlertUtil.alertRetryOutTime();
        } else if (ZcodeConstants.ZCODE_USER_BACK.equals(alertData.subCode)) {
            onBackPressed();
        } else if (ZcodeConstants.ZCODE_INTERUPT_RESUME.equals(alertData.subCode)) {
            this.mAlertUtil.alertInterruptResume();
        } else {
            if (!ZcodeConstants.ZCODE_SYSTEM_EXC.equals(alertData.subCode)) {
                if (ZcodeConstants.ZCODE_RETRY_ALERT.equals(alertData.subCode)) {
                    this.mAlertUtil.alertFailRetry();
                } else if (ZcodeConstants.ZCODE_FIRST_LOGIN.equals(alertData.subCode)) {
                    this.mAlertUtil.alertFirstLogin();
                } else if (ZcodeConstants.ZCODE_LIVENESS_ERROR.equals(alertData.subCode)) {
                    this.mAlertUtil.alertLivelessFail();
                }
            }
            this.mAlertUtil.alertSystemError();
        }
        return true;
    }

    public int getRetryTimes() {
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(1833237119, oncanceled);
            onCancelLoad.getMin(1833237119, oncanceled);
        }
        AlertUtil alertUtil = this.mAlertUtil;
        if (alertUtil == null) {
            return 1;
        }
        return alertUtil.getRetryTimes();
    }

    public void alertCameraPermissionFailed(DialogInterface.OnClickListener onClickListener) {
        int length;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(-547797144, oncanceled);
            onCancelLoad.getMin(-547797144, oncanceled);
        }
        this.mAlertUtil.alertCameraPermissionFailed(onClickListener);
    }

    public void alertCameraOpenFailed() {
        this.mAlertUtil.alertCameraOpenFailed();
    }

    public void onInitView() {
        ZFacePresenter zFacePresenter = this.mZFacePresenter;
        this.mAlertUtil = createAlertUtils(zFacePresenter != null ? zFacePresenter.getRemoteConfig().getColl().getRetry() : 2);
    }

    public void onBackPressed() {
        if (isCanUseBack()) {
            dealBackPress();
        }
    }

    private void dealBackPress() {
        boolean z;
        if (!this.mIsUploading) {
            try {
                z = R2.bool.show_exit_dialog();
            } catch (Exception unused) {
                z = true;
            }
            if (z) {
                this.mZFacePresenter.stopProcess();
                this.mAlertUtil.alertBack();
                return;
            }
            ZFacePresenter zFacePresenter = this.mZFacePresenter;
            if (zFacePresenter != null) {
                String str = CodeConstants.USER_QUITE;
                zFacePresenter.sendResponseWithSubcode(202, str, CodeConstants.getMessage(str));
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void record(String str) {
        record(str, (Map<String, String>) null);
    }

    /* access modifiers changed from: protected */
    public void record(String str, Map<String, String> map) {
        ZFaceRecordService zFaceRecordService;
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        if (currentInstance != null && (zFaceRecordService = (ZFaceRecordService) currentInstance.getBioService(ZFaceRecordService.class)) != null) {
            if (map == null) {
                zFaceRecordService.write(str);
            } else {
                zFaceRecordService.write(str, map);
            }
        }
    }
}
