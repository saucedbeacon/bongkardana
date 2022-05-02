package com.alipay.mobile.security.bio.workspace;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSON;
import com.alipay.android.phone.mobilecommon.biometric.bio.R;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.bio.common.record.MetaRecord;
import com.alipay.mobile.security.bio.config.Constant;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioAppManager;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.utils.SignHelper;
import com.google.common.base.Ascii;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.restorePresenterStates;
import o.setColorFilter;

public class BioFragmentContainer extends FragmentActivity implements BioFragmentCallBack {
    public static final int length = 182;
    public static final byte[] setMax = {Framer.STDERR_FRAME_PREFIX, Framer.EXIT_FRAME_PREFIX, -94, 37, 22, -45, 42, -22, 0, Ascii.NAK, 0, -24, Ascii.FS, -30, 51, -42, -5, Ascii.DC4, -34, 39, Ascii.NAK, -18, -39, Ascii.US, Ascii.US, -5, -47, 42, -4, -9, -20, Ascii.GS, -8, Ascii.VT, -24, Ascii.RS, 10, -3, Ascii.FS, -17, 35, -43, -24, 40, -37, Framer.ENTER_FRAME_PREFIX, 43, -31, 22, -26, -29, Ascii.GS, Ascii.US, -27, -22, 38, 22, -38, 52, -27, -20, Ascii.SI, -27, Ascii.ESC, Ascii.US, -26, Framer.ENTER_FRAME_PREFIX, -18, 0, -16, -19, 32, Ascii.VT, -12, -22, Ascii.RS, -7, 3, 38, -27, -7, 9, 37, -9, -25, 1, 42, -9, Ascii.CAN, -46, -17, Framer.STDOUT_FRAME_PREFIX, 22, -45, 39, -19, -1, -15, 53, -19, -27, 5, 36, -17, 1, -4, 42, -47, 35, 8, -62, 53, 13, -22, Ascii.CAN, -4, -17, 38, -12, -13, -1, -32, 56, -6, -26, -12, 57, -12, Ascii.SO, -27, Ascii.SUB, -24, Ascii.FS, -29, 35, -16, 0, -32, 53, -26, 36, -26, Ascii.US, -10, Ascii.FF, -21, Ascii.DC4, -2, -27, 9, Ascii.FS, -3, -46, 32, 38, -25, -37, 37, Ascii.DC4, -3, Ascii.FF, -25, 42, -21, -9, 0, Ascii.DC4, -3, Ascii.FF, -22, 34, -26, -37, 9, 61, -41, 39, -60, Ascii.SI, -8, Ascii.VT, -7, 4, Ascii.VT, -23, 10, 62, -42, -13};
    protected BioAppDescription mBioAppDescription;
    protected BioFragment mBioFragment;
    protected BioServiceManager mBioServiceManager;
    private final BroadcastReceiver mBiologyBroadcastReceiver = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            if (Constant.BIOLOGY_FLAG_AUTOCLOSE.equals(intent.getAction())) {
                BioFragmentContainer.this.verifyCallBackEvent();
                BioFragmentContainer.this.commandFinished();
            }
            BioFragmentContainer.this.onReceiveAction(intent);
        }
    };
    protected FragmentManager mFragmentManager;
    protected restorePresenterStates mLocalBroadcastManager;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 165
            int r7 = r7 + 11
            int r6 = r6 * 175
            int r6 = r6 + 4
            int r8 = r8 * 45
            int r8 = r8 + 56
            byte[] r0 = setMax
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x0019
            r4 = r8
            r3 = 0
            r8 = r7
            goto L_0x002c
        L_0x0019:
            r3 = 0
        L_0x001a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L_0x0025
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x0025:
            int r3 = r3 + 1
            byte r4 = r0[r6]
            r5 = r8
            r8 = r7
            r7 = r5
        L_0x002c:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + -2
            r5 = r8
            r8 = r7
            r7 = r5
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.workspace.BioFragmentContainer.setMax(int, byte, int):java.lang.String");
    }

    /* access modifiers changed from: protected */
    public void onReceiveAction(Intent intent) {
    }

    public void sendAvatarResponse(BioFragmentResponse bioFragmentResponse) {
    }

    /* access modifiers changed from: protected */
    public void verifyCallBackEvent() {
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        ZimRecordService zimRecordService;
        BioServiceManager bioServiceManager = this.mBioServiceManager;
        if (!(bioServiceManager == null || (zimRecordService = (ZimRecordService) bioServiceManager.getBioService(ZimRecordService.class)) == null)) {
            zimRecordService.write(new MetaRecord("", "event", "20001117", "ztech_background", 1));
        }
        super.onUserLeaveHint();
    }

    public void onCreate(Bundle bundle) {
        int length2;
        int min;
        int max;
        byte[] bArr = setMax;
        byte b = (byte) bArr[85];
        String max2 = setMax((byte) bArr[8], b, (byte) b);
        byte[] bArr2 = setMax;
        byte b2 = (byte) bArr2[8];
        String max3 = setMax((byte) bArr2[85], b2, (byte) b2);
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
            onCancelLoad.setMax(-1681923720, oncanceled);
            onCancelLoad.getMin(-1681923720, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || -1681923720 == (max = dispatchOnCancelled.getMax(applicationContext2, -1681923720)))) {
            onCanceled oncanceled2 = new onCanceled(-1681923720, max, 512);
            onCancelLoad.setMax(-1681923720, oncanceled2);
            onCancelLoad.getMin(-1681923720, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length2 = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length2)))) {
            onCanceled oncanceled3 = new onCanceled(length2, min, 8);
            onCancelLoad.setMax(-1681923720, oncanceled3);
            onCancelLoad.getMin(-1681923720, oncanceled3);
        }
        super.onCreate(bundle);
        setContentView(R.layout.bio_framework_main);
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        this.mBioServiceManager = currentInstance;
        if (currentInstance == null) {
            new RuntimeException("null == BioServiceManager.getCurrentInstance()");
            sendResponse(206);
            finish();
            return;
        }
        this.mLocalBroadcastManager = restorePresenterStates.length(getApplicationContext());
        IntentFilter intentFilter = new IntentFilter(Constant.BIOLOGY_FLAG_AUTOCLOSE);
        IntentFilter intentFilter2 = new IntentFilter(Constant.BIOLOGY_FLAG_SERVER_SUCCESS);
        IntentFilter intentFilter3 = new IntentFilter(Constant.BIOLOGY_FLAG_SERVER_FAIL);
        IntentFilter intentFilter4 = new IntentFilter(Constant.BIOLOGY_FLAG_SERVER_RETRY);
        this.mLocalBroadcastManager.setMax(this.mBiologyBroadcastReceiver, intentFilter);
        this.mLocalBroadcastManager.setMax(this.mBiologyBroadcastReceiver, intentFilter2);
        this.mLocalBroadcastManager.setMax(this.mBiologyBroadcastReceiver, intentFilter3);
        this.mLocalBroadcastManager.setMax(this.mBiologyBroadcastReceiver, intentFilter4);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.mFragmentManager = supportFragmentManager;
        if (supportFragmentManager == null) {
            new RuntimeException("null == mFragmentManager");
            sendResponse(206);
            finish();
            return;
        }
        try {
            BioAppDescription bioAppDescription = ((BioAppManager) this.mBioServiceManager.getBioService(BioAppManager.class)).getBioAppDescription(getIntent().getStringExtra(Constant.BIOLOGY_INTENT_ACTION_INFO));
            this.mBioAppDescription = bioAppDescription;
            String remoteURL = bioAppDescription.getRemoteURL();
            if (!TextUtils.isEmpty(remoteURL)) {
                ((BioRPCService) this.mBioServiceManager.getBioService(BioRPCService.class)).setRemoteUrl(remoteURL);
            }
        } catch (Exception unused) {
        }
    }

    public void backward(Bundle bundle) {
        FragmentManager fragmentManager = this.mFragmentManager;
        int i = 0;
        if ((fragmentManager.setMin != null ? fragmentManager.setMin.size() : 0) > 1) {
            FragmentManager fragmentManager2 = this.mFragmentManager;
            fragmentManager2.getMax((FragmentManager.getMax) new FragmentManager.length(-1, 0), false);
            List<Fragment> min = this.mFragmentManager.getMin.getMin();
            FragmentManager fragmentManager3 = this.mFragmentManager;
            if (fragmentManager3.setMin != null) {
                i = fragmentManager3.setMin.size();
            }
            this.mBioFragment = (BioFragment) min.get(i - 1);
        }
    }

    public void forward(Bundle bundle, BioFragment bioFragment) {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            new RuntimeException("null == mFragmentManager in forward()");
            sendResponse(206);
            finish();
            return;
        }
        setColorFilter setcolorfilter = new setColorFilter(fragmentManager);
        int i = R.id.bio_framework_container;
        if (i != 0) {
            setcolorfilter.length(i, bioFragment, (String) null, 2);
            this.mBioFragment = bioFragment;
            boolean z = false;
            if (bundle != null) {
                z = bundle.getBoolean("BACK_STACK", true);
            }
            if (z) {
                if (setcolorfilter.hashCode) {
                    setcolorfilter.IsOverlapping = true;
                    setcolorfilter.toString = null;
                } else {
                    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                }
            }
            if (!isFinishing()) {
                try {
                    setcolorfilter.length();
                } catch (Exception unused) {
                }
            }
        } else {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
    }

    public void finish(Bundle bundle) {
        finish();
    }

    /* access modifiers changed from: protected */
    public String getUniqueID() {
        UUID randomUUID = UUID.randomUUID();
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(Math.random() * 10000.0d);
        sb.append(randomUUID.toString());
        return SignHelper.MD5(sb.toString());
    }

    public void onDestroy() {
        restorePresenterStates restorepresenterstates = this.mLocalBroadcastManager;
        if (restorepresenterstates != null) {
            restorepresenterstates.setMax(this.mBiologyBroadcastReceiver);
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void commandFinished() {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(-709327032, oncanceled);
            onCancelLoad.getMin(-709327032, oncanceled);
        }
        finishActivity(false);
    }

    public BioAppDescription getAppDescription() {
        return this.mBioAppDescription;
    }

    public void finishActivity(boolean z) {
        if (z) {
            BioAppDescription bioAppDescription = this.mBioAppDescription;
            if (bioAppDescription == null || bioAppDescription.isAutoClose()) {
                finish();
                return;
            }
            return;
        }
        finish();
    }

    public void sendResponse(String str, int i, String str2) {
        Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_ACTION);
        BioResponse bioResponse = new BioResponse();
        bioResponse.setSuccess(false);
        bioResponse.setResult(i);
        if (i == 101 || i == 200) {
            bioResponse.subCode = CodeConstants.ERROR_CAMERA;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 100) {
            bioResponse.subCode = CodeConstants.ERROR_CAMERA;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 205) {
            bioResponse.subCode = CodeConstants.SERVER_PARAM_ERROR;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 209) {
            bioResponse.subCode = CodeConstants.OUT_TIME;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 102) {
            bioResponse.subCode = CodeConstants.USER_UNSURPPORT_CPU;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 105) {
            bioResponse.subCode = CodeConstants.ANDROID_VERSION_LOW;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 201) {
            bioResponse.subCode = CodeConstants.INVALID_ARGUMENT;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 202) {
            bioResponse.subCode = CodeConstants.USER_QUITE;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 203) {
            bioResponse.subCode = CodeConstants.OVER_TIME;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 207) {
            bioResponse.subCode = CodeConstants.NETWORK_TIMEOUT;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 208) {
            bioResponse.subCode = CodeConstants.SERVER_FAIL;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 3001) {
            bioResponse.subCode = CodeConstants.LIVENESS_ERROR;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        } else if (i == 301) {
            bioResponse.subCode = CodeConstants.USER_BACK;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        }
        bioResponse.setResultMessage(str2);
        bioResponse.setTag(str);
        Bundle bundle = new Bundle();
        bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
        intent.putExtras(bundle);
        this.mLocalBroadcastManager.setMin(intent);
    }

    public void sendResponse(int i) {
        BioAppDescription bioAppDescription = this.mBioAppDescription;
        if (bioAppDescription != null) {
            sendResponse(bioAppDescription.getTag(), i, "");
        }
    }

    public void sendResponseWithSubcode(int i, String str, String str2) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(-1778044982, oncanceled);
            onCancelLoad.getMin(-1778044982, oncanceled);
        }
        BioAppDescription bioAppDescription = this.mBioAppDescription;
        if (bioAppDescription != null) {
            String tag = bioAppDescription.getTag();
            Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_ACTION);
            BioResponse bioResponse = new BioResponse();
            bioResponse.setSuccess(false);
            bioResponse.setResult(i);
            bioResponse.subCode = str;
            if (TextUtils.isEmpty(str2)) {
                str2 = CodeConstants.getMessage(bioResponse.subCode);
            }
            bioResponse.subMsg = str2;
            bioResponse.setResultMessage("");
            bioResponse.setTag(tag);
            Bundle bundle = new Bundle();
            bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
            intent.putExtras(bundle);
            this.mLocalBroadcastManager.setMin(intent);
        }
    }

    public void sendResponse(BioFragmentResponse bioFragmentResponse) {
        int length2;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1873115982, oncanceled);
            onCancelLoad.getMin(1873115982, oncanceled);
        }
        Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_ACTION);
        BioResponse bioResponse = new BioResponse();
        bioResponse.setSuccess(bioFragmentResponse.isSucess);
        bioResponse.setToken(bioFragmentResponse.token);
        bioResponse.subCode = bioFragmentResponse.subCode;
        bioResponse.subMsg = bioFragmentResponse.subMsg;
        bioResponse.setResultMessage(bioFragmentResponse.resultMessage);
        bioResponse.setResult(bioFragmentResponse.errorCode);
        bioResponse.setTag(this.mBioAppDescription.getTag());
        if (bioFragmentResponse.ext != null) {
            bioResponse.setExt(bioFragmentResponse.ext);
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
        intent.putExtras(bundle);
        this.mLocalBroadcastManager.setMin(intent);
    }

    public void sendProgressResponse(BioFragmentResponse bioFragmentResponse) {
        int length2;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length2 = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length2)))) {
            onCanceled oncanceled = new onCanceled(length2, min, 32);
            onCancelLoad.setMax(1110814919, oncanceled);
            onCancelLoad.getMin(1110814919, oncanceled);
        }
        Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_PROGRESS_ACTION);
        BioResponse bioResponse = new BioResponse();
        bioResponse.setSuccess(bioFragmentResponse.isSucess);
        bioResponse.setToken(bioFragmentResponse.token);
        bioResponse.subCode = bioFragmentResponse.subCode;
        bioResponse.subMsg = bioFragmentResponse.subMsg;
        bioResponse.setResultMessage(bioFragmentResponse.resultMessage);
        bioResponse.setResult(bioFragmentResponse.errorCode);
        bioResponse.setTag(this.mBioAppDescription.getTag());
        if (bioFragmentResponse.ext != null) {
            bioResponse.setExt(bioFragmentResponse.ext);
        }
        Bundle bundle = new Bundle();
        bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
        intent.putExtras(bundle);
        this.mLocalBroadcastManager.setMin(intent);
    }
}
