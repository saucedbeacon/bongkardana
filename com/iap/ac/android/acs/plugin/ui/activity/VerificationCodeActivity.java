package com.iap.ac.android.acs.plugin.ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.common.base.Ascii;
import com.iap.ac.android.acs.plugin.R;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.PhoneNumberFacade;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.model.MobilePhoneInfo;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.request.UserPhoneRequest;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.request.UserPhoneValidateCodeVerifyRequest;
import com.iap.ac.android.acs.plugin.rpc.getphonenumber.result.UserPhoneValidateCodeSendResult;
import com.iap.ac.android.acs.plugin.ui.utils.MultiLanguageUtils;
import com.iap.ac.android.acs.plugin.ui.utils.UIConstants;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginActionBar;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginLoadingDialog;
import com.iap.ac.android.acs.plugin.ui.view.ACPluginToast;
import com.iap.ac.android.acs.plugin.ui.view.VerificationCodeInputView;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.acs.plugin.utils.MonitorUtil;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.rpccommon.model.domain.result.BaseRpcResult;
import java.util.Map;
import java.util.Random;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;

public class VerificationCodeActivity extends Activity implements View.OnClickListener {
    private static final int COUNTDOWN_TIME = 60;
    public static final byte[] length = {44, 104, -44, Ascii.GS, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    public static final int setMin = 77;
    /* access modifiers changed from: private */
    public ACPluginActionBar mActionBar;
    /* access modifiers changed from: private */
    public TextView mActionDescText;
    private CountDownTimer mCountDownTimer;
    /* access modifiers changed from: private */
    public TextView mDescText;
    /* access modifiers changed from: private */
    public String mFailText;
    /* access modifiers changed from: private */
    public boolean mIsSavePhoneInfo;
    /* access modifiers changed from: private */
    public ACPluginLoadingDialog mLoadingDialog;
    /* access modifiers changed from: private */
    public String mLoadingText;
    private Handler mMainHandler = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public String mNetworkErrorText;
    /* access modifiers changed from: private */
    public MobilePhoneInfo mPhoneInfo;
    private TextView mPhoneNumText;
    /* access modifiers changed from: private */
    public String mResendDesc;
    /* access modifiers changed from: private */
    public TextView mResendDescText;
    /* access modifiers changed from: private */
    public TextView mResendText;
    /* access modifiers changed from: private */
    public String mSuccessText;
    /* access modifiers changed from: private */
    public String mValidateId;
    VerificationCodeInputView mVerificationCodeInputView;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = length
            int r8 = r8 * 45
            int r8 = 101 - r8
            int r6 = r6 * 165
            int r6 = 176 - r6
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            int r6 = r6 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            r4 = r8
            r3 = 0
            r8 = r7
            goto L_0x002c
        L_0x0017:
            r3 = 0
        L_0x0018:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L_0x0023
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0023:
            int r3 = r3 + 1
            int r7 = r7 + 1
            byte r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x002c:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + -2
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.plugin.ui.activity.VerificationCodeActivity.getMax(byte, int, byte):java.lang.String");
    }

    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = length;
        String max2 = getMax((byte) bArr[8], (short) bArr[85], (byte) bArr[8]);
        byte[] bArr2 = length;
        String max3 = getMax((byte) bArr2[96], 174, (byte) bArr2[96]);
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = (baseContext == null || baseContext.getApplicationContext() == null) ? null : baseContext.getApplicationContext();
        if (applicationContext != null) {
            registerOnLoadCanceledListener.setMin().getMax(applicationContext, max2, max3);
        }
        int nextInt = new Random().nextInt(Integer.MAX_VALUE);
        int length3 = dispatchOnCancelled.length(nextInt);
        if (nextInt != length3) {
            onCanceled oncanceled = new onCanceled(nextInt, length3, 1);
            onCancelLoad.setMax(-1574423715, oncanceled);
            onCancelLoad.getMin(-1574423715, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -1574423715 == (max = dispatchOnCancelled.getMax(applicationContext2, -1574423715)))) {
            onCanceled oncanceled2 = new onCanceled(-1574423715, max, 512);
            onCancelLoad.setMax(-1574423715, oncanceled2);
            onCancelLoad.getMin(-1574423715, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-1574423715, oncanceled3);
            onCancelLoad.getMin(-1574423715, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.acplugin_activity_verification_code);
        initData();
        initView();
        sendVerificationCode();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public void onClick(View view) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-2126942891, oncanceled);
            onCancelLoad.getMin(-2126942891, oncanceled);
        }
        if (view.getId() == R.id.resend_text) {
            ACLog.d(Constants.TAG, "VerificationCodeActivity#onClick, click resend text");
            sendVerificationCode();
        }
    }

    private void initData() {
        this.mIsSavePhoneInfo = getIntent().getBooleanExtra(UIConstants.KEY_SAVE_PHONE_INFO, false);
        this.mPhoneInfo = (MobilePhoneInfo) getIntent().getParcelableExtra(UIConstants.KEY_PHONE_INFO);
        StringBuilder sb = new StringBuilder("VerificationCodeActivity#initData, is save: ");
        sb.append(this.mIsSavePhoneInfo);
        sb.append(", phone info: ");
        sb.append(this.mPhoneInfo);
        ACLog.d(Constants.TAG, sb.toString());
    }

    private void initView() {
        this.mActionBar = (ACPluginActionBar) findViewById(R.id.action_bar);
        this.mDescText = (TextView) findViewById(R.id.desc_text);
        this.mActionDescText = (TextView) findViewById(R.id.action_desc_text);
        this.mPhoneNumText = (TextView) findViewById(R.id.phone_num_text);
        this.mResendDescText = (TextView) findViewById(R.id.resend_desc_text);
        TextView textView = (TextView) findViewById(R.id.resend_text);
        this.mResendText = textView;
        textView.setOnClickListener(this);
        fillText();
        initVerificationCodeInputView();
    }

    private void fillText() {
        this.mActionBar.setTitle(getString(R.string.acplugin_verify_phone));
        this.mResendDesc = getString(R.string.acplugin_resend_desc);
        this.mLoadingText = getString(R.string.acplugin_loading);
        this.mNetworkErrorText = getString(R.string.acplugin_network_error);
        this.mSuccessText = getString(R.string.acplugin_operation_success);
        this.mFailText = getString(R.string.acplugin_verification_code_error);
        this.mPhoneNumText.setText(UIUtils.encryptPhoneNumber(this.mPhoneInfo.mobilePhoneNumber));
        MultiLanguageUtils.getMultiLanguageTextMap(new MultiLanguageUtils.Callback() {
            public void onGetMultiLanguageText(@NonNull Map<String, String> map) {
                VerificationCodeActivity.this.mActionBar.setTitle(map.get("VerifyPhone"));
                VerificationCodeActivity.this.mDescText.setText(map.get("EnterVerificationCode"));
                VerificationCodeActivity.this.mActionDescText.setText(map.get("SendVerificationCodeDesc"));
                VerificationCodeActivity.this.mResendText.setText(map.get("Resend"));
                String unused = VerificationCodeActivity.this.mResendDesc = map.get("ResendDesc");
                String unused2 = VerificationCodeActivity.this.mLoadingText = map.get("Loading");
                String unused3 = VerificationCodeActivity.this.mNetworkErrorText = map.get("NetworkError");
                String unused4 = VerificationCodeActivity.this.mSuccessText = map.get("OperationSuccess");
                String unused5 = VerificationCodeActivity.this.mFailText = map.get("VerificationCodeError");
            }
        });
    }

    private void initVerificationCodeInputView() {
        VerificationCodeInputView verificationCodeInputView = (VerificationCodeInputView) findViewById(R.id.verification_code_input_view);
        this.mVerificationCodeInputView = verificationCodeInputView;
        verificationCodeInputView.setOnCompleteListener(new VerificationCodeInputView.OnCompleteListener() {
            public void onComplete(String str) {
                VerificationCodeActivity.this.showLoadingDialog();
                VerificationCodeActivity.this.verify(str);
            }
        });
        this.mVerificationCodeInputView.requestFocus();
    }

    private void sendVerificationCode() {
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(-1279487494, oncanceled);
            onCancelLoad.getMin(-1279487494, oncanceled);
        }
        StringBuilder sb = new StringBuilder("VerificationCodeActivity#sendVerificationCode, prefix: ");
        sb.append(this.mPhoneInfo.mobilePhoneRegionCode);
        sb.append(", phone number: ");
        sb.append(UIUtils.encryptPhoneNumber(this.mPhoneInfo.mobilePhoneNumber));
        ACLog.d(Constants.TAG, sb.toString());
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    UserPhoneRequest userPhoneRequest = new UserPhoneRequest();
                    userPhoneRequest.mobilePhoneNumber = VerificationCodeActivity.this.mPhoneInfo.mobilePhoneNumber;
                    userPhoneRequest.mobilePhoneRegionCode = VerificationCodeActivity.this.mPhoneInfo.mobilePhoneRegionCode;
                    UserPhoneValidateCodeSendResult sendUserPhoneValidateCode = ((PhoneNumberFacade) RPCProxyHost.getInterfaceProxy(PhoneNumberFacade.class, "ac_biz")).sendUserPhoneValidateCode(userPhoneRequest);
                    MonitorUtil.monitorRPC(PhoneNumberFacade.OPERATION_TYPE_SEND_VALIDATE_CODE, SystemClock.elapsedRealtime() - elapsedRealtime, sendUserPhoneValidateCode);
                    if (sendUserPhoneValidateCode == null) {
                        ACLog.e(Constants.TAG, "VerificationCodeActivity#sendVerificationCode, rpc result is null");
                        VerificationCodeActivity.this.showNetworkError();
                    } else if (!sendUserPhoneValidateCode.success) {
                        StringBuilder sb = new StringBuilder("VerificationCodeActivity#sendVerificationCode, rpc result fail, error: ");
                        sb.append(sendUserPhoneValidateCode.errorCode);
                        sb.append(", errorMessage: ");
                        sb.append(sendUserPhoneValidateCode.errorMessage);
                        ACLog.e(Constants.TAG, sb.toString());
                        VerificationCodeActivity.this.showNetworkError();
                    } else {
                        String unused = VerificationCodeActivity.this.mValidateId = sendUserPhoneValidateCode.validateId;
                        StringBuilder sb2 = new StringBuilder("VerificationCodeActivity#sendVerificationCode success, validateId: ");
                        sb2.append(VerificationCodeActivity.this.mValidateId);
                        ACLog.d(Constants.TAG, sb2.toString());
                        VerificationCodeActivity.this.remindToVerify();
                    }
                } catch (Throwable th) {
                    ACLog.e(Constants.TAG, "VerificationCodeActivity#sendVerificationCode, rpc error: ".concat(String.valueOf(th)));
                    VerificationCodeActivity.this.showNetworkError();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void remindToVerify() {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(-1157014239, oncanceled);
            onCancelLoad.getMin(-1157014239, oncanceled);
        }
        ACLog.d(Constants.TAG, "VerificationCodeActivity#remindToVerify");
        this.mMainHandler.post(new Runnable() {
            public void run() {
                VerificationCodeActivity.this.startCountDown();
                VerificationCodeActivity.this.mVerificationCodeInputView.showSoftInput();
            }
        });
    }

    /* access modifiers changed from: private */
    public void startCountDown() {
        int length2;
        int min;
        int max = dispatchOnCancelled.getMax(0);
        if (max != 0) {
            onCanceled oncanceled = new onCanceled(0, max, 16);
            onCancelLoad.setMax(1739566235, oncanceled);
            onCancelLoad.getMin(1739566235, oncanceled);
        }
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled2 = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1739566235, oncanceled2);
            onCancelLoad.getMin(1739566235, oncanceled2);
        }
        ACLog.d(Constants.TAG, "VerificationCodeActivity#startCountDown");
        this.mResendDescText.setVisibility(0);
        this.mResendText.setVisibility(8);
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        AnonymousClass5 r1 = new CountDownTimer(60150, 1000) {
            public void onTick(long j) {
                double d = (double) j;
                Double.isNaN(d);
                long round = Math.round(d / 1000.0d);
                VerificationCodeActivity.this.mResendDescText.setText(String.format(VerificationCodeActivity.this.mResendDesc, new Object[]{Long.valueOf(round)}));
            }

            public void onFinish() {
                VerificationCodeActivity.this.mResendDescText.setVisibility(8);
                VerificationCodeActivity.this.mResendText.setVisibility(0);
            }
        };
        this.mCountDownTimer = r1;
        r1.start();
    }

    /* access modifiers changed from: private */
    public void showLoadingDialog() {
        if (UIUtils.isActivityDisabled(this)) {
            ACLog.e(Constants.TAG, "VerificationCodeActivity#showLoadingDialog, activity disabled");
            return;
        }
        if (this.mLoadingDialog == null) {
            ACPluginLoadingDialog aCPluginLoadingDialog = new ACPluginLoadingDialog(this);
            this.mLoadingDialog = aCPluginLoadingDialog;
            aCPluginLoadingDialog.setText(this.mLoadingText);
        }
        this.mLoadingDialog.show();
        ACLog.d(Constants.TAG, "VerificationCodeActivity#showLoadingDialog");
    }

    /* access modifiers changed from: private */
    public void verify(final String str) {
        StringBuilder sb = new StringBuilder("VerificationCodeActivity#verify, is save: ");
        sb.append(this.mIsSavePhoneInfo);
        sb.append(", validateId: ");
        sb.append(this.mValidateId);
        sb.append(", code: ");
        sb.append(str);
        sb.append(", prefix: ");
        sb.append(this.mPhoneInfo.mobilePhoneRegionCode);
        sb.append(", phone number: ");
        sb.append(UIUtils.encryptPhoneNumber(this.mPhoneInfo.mobilePhoneNumber));
        ACLog.d(Constants.TAG, sb.toString());
        IAPAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    UserPhoneValidateCodeVerifyRequest userPhoneValidateCodeVerifyRequest = new UserPhoneValidateCodeVerifyRequest();
                    userPhoneValidateCodeVerifyRequest.validateId = VerificationCodeActivity.this.mValidateId;
                    userPhoneValidateCodeVerifyRequest.validateCode = str;
                    userPhoneValidateCodeVerifyRequest.mobilePhoneNumber = VerificationCodeActivity.this.mPhoneInfo.mobilePhoneNumber;
                    userPhoneValidateCodeVerifyRequest.mobilePhoneRegionCode = VerificationCodeActivity.this.mPhoneInfo.mobilePhoneRegionCode;
                    userPhoneValidateCodeVerifyRequest.saveMobilePhoneNumber = VerificationCodeActivity.this.mIsSavePhoneInfo;
                    BaseRpcResult verifyUserPhoneValidateCode = ((PhoneNumberFacade) RPCProxyHost.getInterfaceProxy(PhoneNumberFacade.class, "ac_biz")).verifyUserPhoneValidateCode(userPhoneValidateCodeVerifyRequest);
                    MonitorUtil.monitorRPC(PhoneNumberFacade.OPERATION_TYPE_VERIFY_VALIDATE_CODE, SystemClock.elapsedRealtime() - elapsedRealtime, verifyUserPhoneValidateCode);
                    if (verifyUserPhoneValidateCode == null) {
                        ACLog.e(Constants.TAG, "VerificationCodeActivity#verify, rpc result is null");
                        VerificationCodeActivity.this.showFail();
                    } else if (!verifyUserPhoneValidateCode.success) {
                        StringBuilder sb = new StringBuilder("VerificationCodeActivity#verify, rpc result fail, error: ");
                        sb.append(verifyUserPhoneValidateCode.errorCode);
                        sb.append(", errorMessage: ");
                        sb.append(verifyUserPhoneValidateCode.errorMessage);
                        ACLog.e(Constants.TAG, sb.toString());
                        VerificationCodeActivity.this.showFail();
                    } else {
                        ACLog.d(Constants.TAG, "VerificationCodeActivity#verify, rpc result success");
                        VerificationCodeActivity.this.showSuccess();
                    }
                } catch (Throwable th) {
                    ACLog.e(Constants.TAG, "VerificationCodeActivity#verify, rpc error: ".concat(String.valueOf(th)));
                    VerificationCodeActivity.this.showFail();
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void showNetworkError() {
        this.mMainHandler.post(new Runnable() {
            public void run() {
                if (UIUtils.isActivityDisabled(VerificationCodeActivity.this)) {
                    ACLog.e(Constants.TAG, "VerificationCodeActivity#showNetworkError, activity disabled");
                    return;
                }
                ACLog.d(Constants.TAG, "VerificationCodeActivity#showNetworkError");
                VerificationCodeActivity verificationCodeActivity = VerificationCodeActivity.this;
                ACPluginToast.makeToast(verificationCodeActivity, 2, verificationCodeActivity.mNetworkErrorText, 0).show();
                VerificationCodeActivity.this.mResendDescText.setVisibility(8);
                VerificationCodeActivity.this.mResendText.setVisibility(0);
            }
        });
    }

    /* access modifiers changed from: private */
    public void showSuccess() {
        this.mMainHandler.post(new Runnable() {
            public void run() {
                if (UIUtils.isActivityDisabled(VerificationCodeActivity.this)) {
                    ACLog.e(Constants.TAG, "VerificationCodeActivity#showSuccess, activity disabled");
                    return;
                }
                ACLog.d(Constants.TAG, "VerificationCodeActivity#showSuccess");
                if (VerificationCodeActivity.this.mLoadingDialog != null) {
                    VerificationCodeActivity.this.mLoadingDialog.dismiss();
                }
                VerificationCodeActivity verificationCodeActivity = VerificationCodeActivity.this;
                ACPluginToast.makeToast(verificationCodeActivity, 1, verificationCodeActivity.mSuccessText, 0, new ACPluginToast.OnToastDismissListener() {
                    public void onDismiss() {
                        if (UIUtils.isActivityDisabled(VerificationCodeActivity.this)) {
                            ACLog.e(Constants.TAG, "VerificationCodeActivity#showSuccess, activity disabled");
                            return;
                        }
                        ACLog.d(Constants.TAG, "VerificationCodeActivity#on success toast dismiss, finish activity");
                        VerificationCodeActivity.this.finishActivity();
                    }
                }).show();
            }
        });
    }

    /* access modifiers changed from: private */
    public void showFail() {
        this.mMainHandler.post(new Runnable() {
            public void run() {
                if (UIUtils.isActivityDisabled(VerificationCodeActivity.this)) {
                    ACLog.e(Constants.TAG, "VerificationCodeActivity#showFail, activity disabled");
                    return;
                }
                ACLog.d(Constants.TAG, "VerificationCodeActivity#showFail");
                if (VerificationCodeActivity.this.mLoadingDialog != null) {
                    VerificationCodeActivity.this.mLoadingDialog.dismiss();
                }
                VerificationCodeActivity verificationCodeActivity = VerificationCodeActivity.this;
                ACPluginToast.makeToast(verificationCodeActivity, 2, verificationCodeActivity.mFailText, 0, new ACPluginToast.OnToastDismissListener() {
                    public void onDismiss() {
                        if (UIUtils.isActivityDisabled(VerificationCodeActivity.this)) {
                            ACLog.e(Constants.TAG, "VerificationCodeActivity#showFail, activity disabled");
                            return;
                        }
                        ACLog.d(Constants.TAG, "VerificationCodeActivity#on fail toast dismiss, clear view");
                        VerificationCodeActivity.this.mVerificationCodeInputView.clear();
                        VerificationCodeActivity.this.mVerificationCodeInputView.showSoftInput();
                    }
                }).show();
            }
        });
    }

    /* access modifiers changed from: private */
    public void finishActivity() {
        ACLog.d(Constants.TAG, "VerificationCodeActivity#finishActivity");
        setResult(-1, new Intent());
        finish();
    }
}
