package com.zoloz.android.phone.zdoc.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.workspace.BioFragmentContainer;
import com.alipay.mobile.security.bio.workspace.BioFragmentResponse;
import com.alipay.zoloz.config.ConfigCenter;
import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.common.base.Ascii;
import com.zoloz.android.phone.zdoc.cardmanager.CardManagerCallBack;
import com.zoloz.android.phone.zdoc.cardmanager.FalconTaskManager;
import com.zoloz.android.phone.zdoc.cardmanager.ZdocResponse;
import com.zoloz.android.phone.zdoc.constant.DocCodeConstants;
import com.zoloz.android.phone.zdoc.constant.ZdocConstant;
import com.zoloz.android.phone.zdoc.fragment.BaseDocFragment;
import com.zoloz.android.phone.zdoc.fragment.BaseFragment;
import com.zoloz.android.phone.zdoc.fragment.ZdocCaptureFragment;
import com.zoloz.android.phone.zdoc.module.ZdocRemoteConfig;
import com.zoloz.android.phone.zdoc.service.ZdocRecordService;
import com.zoloz.android.phone.zdoc.ui.UIFacade;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import o.dispatchOnCancelled;
import o.invalidateDrawable;
import o.onCancelLoad;
import o.onCanceled;
import o.registerOnLoadCanceledListener;
import o.setColorFilter;

public class FalconCardNativeActivityNew extends BioFragmentContainer implements CardManagerCallBack {
    public static final int getMin = 77;
    public static final byte[] setMin = {114, -106, -55, 87, -22, Framer.STDIN_FRAME_PREFIX, -42, 22, 0, -21, 0, Ascii.CAN, -28, Ascii.RS, -51, 42, 5, -20, 34, -39, -21, Ascii.DC2, 39, -31, -31, 5, 47, -42, 4, 9, Ascii.DC4, -29, 8, -11, Ascii.CAN, -30, -10, 3, -28, 17, -35, 43, Ascii.CAN, -40, 37, -33, -43, Ascii.US, -22, Ascii.SUB, Ascii.GS, -29, -31, Ascii.ESC, 22, -38, -22, 38, -52, Ascii.ESC, Ascii.DC4, -15, Ascii.ESC, -27, -31, Ascii.SUB, -33, Ascii.DC2, 0, Ascii.DLE, 19, -32, -11, Ascii.FF, 22, -30, 7, -3, -38, Ascii.ESC, 7, -9, -37, 9, Ascii.EM, -1, -42, 9, -24, 46, 17, -49, -22, Framer.STDIN_FRAME_PREFIX, -39, 19, 1, Ascii.SI, -53, 19, Ascii.ESC, -5, -36, 17, -1, 4, -42, 47, -35, -8, 62, -53, -13, 22, -24, 4, 17, -38, Ascii.FF, 13, 1, 32, -56, 6, Ascii.SUB, Ascii.FF, -57, Ascii.FF, -14, Ascii.ESC, -26, Ascii.CAN, -28, Ascii.GS, -35, Ascii.DLE, 0, 32, -53, Ascii.SUB, -36, Ascii.SUB, -31, 10, -12, Ascii.NAK, -20, 2, Ascii.ESC, -9, -28, 3, 46, -32, -38, Ascii.EM, 37, -37, -20, 3, -12, Ascii.EM, -42, Ascii.NAK, 9, 0, -20, 3, -12, 22, -34, Ascii.SUB, 37, -9, -61, 41, -39, 60, -15, 8, -11, 7, -4, -11, Ascii.ETB, -10, -62, 42, 13};
    protected Bundle mArgs = new Bundle();
    private FrameLayout mContainerView;
    protected Fragment mFragment;
    private String mProtocolConfig;
    private ZdocRecordService mRecoreService;
    protected String mTarget = ZdocCaptureFragment.class.getName();

    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getMax(byte r6, short r7, byte r8) {
        /*
            byte[] r0 = setMin
            int r8 = r8 * 45
            int r8 = r8 + 56
            int r6 = r6 * 175
            int r6 = 178 - r6
            int r7 = r7 * 165
            int r7 = r7 + 11
            byte[] r1 = new byte[r7]
            int r7 = r7 + -1
            r2 = 0
            if (r0 != 0) goto L_0x001c
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r8
            r8 = r7
            r7 = r6
            goto L_0x0036
        L_0x001c:
            r3 = 0
        L_0x001d:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L_0x002a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L_0x002a:
            int r3 = r3 + 1
            byte r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            r8 = r5
        L_0x0036:
            int r6 = -r6
            int r0 = r0 + r6
            int r6 = r0 + -2
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zoloz.android.phone.zdoc.activities.FalconCardNativeActivityNew.getMax(byte, short, byte):java.lang.String");
    }

    @SuppressLint({"InlinedApi"})
    public void onCreate(Bundle bundle) {
        int length;
        int min;
        int length2;
        byte b = (byte) setMin[96];
        byte b2 = (byte) b;
        String max = getMax(b, b2, (byte) b2);
        byte b3 = (byte) setMin[8];
        byte b4 = (byte) b3;
        String max2 = getMax(b3, b4, (byte) b4);
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
            onCancelLoad.setMax(1898380479, oncanceled);
            onCancelLoad.getMin(1898380479, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        Context applicationContext2 = baseContext2 != null ? baseContext2.getApplicationContext() : null;
        if (!(applicationContext2 == null || (length2 = dispatchOnCancelled.length(applicationContext2, 0)) == 0)) {
            onCanceled oncanceled2 = new onCanceled(0, length2, 4);
            onCancelLoad.setMax(1898380479, oncanceled2);
            onCancelLoad.getMin(1898380479, oncanceled2);
        }
        Context baseContext3 = getBaseContext();
        if (baseContext3 != null) {
            context = baseContext3.getApplicationContext();
        }
        if (!(context == null || (length = context.fileList().length) == (min = dispatchOnCancelled.setMin(context, length)))) {
            onCanceled oncanceled3 = new onCanceled(length, min, 8);
            onCancelLoad.setMax(1898380479, oncanceled3);
            onCancelLoad.getMin(1898380479, oncanceled3);
        }
        requestWindowFeature(1);
        setRequestedOrientation(1);
        super.onCreate(bundle);
        if (BioServiceManager.getCurrentInstance() == null) {
            new IllegalStateException("null == BioServiceManager.getCurrentInstance()");
            finish();
        } else if (this.mBioAppDescription == null) {
            new IllegalStateException("null == mBioAppDescription");
            finish();
        } else {
            ConfigCenter.getInstance().setApplicationContext(getApplicationContext());
            updateLocale(this.mBioAppDescription.getExtProperty().get("locale"));
            recordStartZdoc();
            FalconTaskManager.getInstance().setContext(this);
            FalconTaskManager.getInstance().registerCallback(this);
            FalconTaskManager.getInstance().setBioServiceManager(BioServiceManager.getCurrentInstance());
            initContainerView();
            try {
                ZdocRemoteConfig zdocRemoteConfig = (ZdocRemoteConfig) JSON.parseObject(this.mBioAppDescription.getCfg(), ZdocRemoteConfig.class);
                if (zdocRemoteConfig.getCaptureMode() == 1) {
                    this.mTarget = "com.zoloz.android.phone.zdoc.fragment.ZdocScanTasksFragment";
                } else {
                    this.mTarget = ZdocCaptureFragment.class.getName();
                }
                this.mArgs.putSerializable("bio", this.mBioAppDescription);
                this.mArgs.putSerializable("config", zdocRemoteConfig);
                bindActivityFragment();
            } catch (Exception unused) {
                finish();
            }
        }
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

    /* access modifiers changed from: protected */
    public void onRestart() {
        super.onRestart();
        Fragment fragment = this.mFragment;
        if (fragment != null && (fragment instanceof BaseFragment)) {
            ((BaseFragment) fragment).onRestart();
        }
    }

    private void recordStartZdoc() {
        ApSecurityService apSecurityService;
        int length;
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = applicationContext.fileList().length) == (min = dispatchOnCancelled.getMin(applicationContext, length)))) {
            onCanceled oncanceled = new onCanceled(length, min, 32);
            onCancelLoad.setMax(-1463423705, oncanceled);
            onCancelLoad.getMin(-1463423705, oncanceled);
        }
        if (this.mRecoreService == null) {
            this.mRecoreService = (ZdocRecordService) BioServiceManager.getCurrentInstance().getBioService(ZdocRecordService.class);
        }
        this.mProtocolConfig = this.mBioAppDescription.getCfg();
        HashMap hashMap = new HashMap();
        hashMap.put("productId", "zoloz_zdoc");
        hashMap.put("sdkVersion", ZdocConstant.SDK_VERSION);
        hashMap.put(ZdocRecordService.BISTOKEN, this.mBioAppDescription.getBistoken());
        String staticApDidToken = ApSecurityService.getStaticApDidToken();
        if (TextUtils.isEmpty(staticApDidToken) && (apSecurityService = (ApSecurityService) BioServiceManager.getCurrentInstance().getBioService(ApSecurityService.class)) != null) {
            staticApDidToken = apSecurityService.getApDidToken();
        }
        hashMap.put("apdidToken", staticApDidToken);
        this.mRecoreService.addExtProperties(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("params", this.mProtocolConfig);
        hashMap2.put(ZdocRecordService.DEVICE_BRAND, Build.BRAND);
        this.mRecoreService.write(ZdocRecordService.START_ZDOC, hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("module", BlobStatic.META_TYPE_DOC);
        this.mRecoreService.write("ztech_enter", hashMap3);
    }

    private void initContainerView() {
        this.mContainerView = new FrameLayout(this);
        this.mContainerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.mContainerView.setId(16908300);
        setContentView(this.mContainerView);
    }

    private void bindActivityFragment() {
        int max;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || 1774812546 == (max = dispatchOnCancelled.getMax(applicationContext, 1774812546)))) {
            onCanceled oncanceled = new onCanceled(1774812546, max, 512);
            onCancelLoad.setMax(1774812546, oncanceled);
            onCancelLoad.getMin(1774812546, oncanceled);
        }
        try {
            Class<?> cls = Class.forName(this.mTarget, true, getClassLoader());
            try {
                String makeTag = makeTag(this.mContainerView.getId(), cls.getName());
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                setColorFilter setcolorfilter = new setColorFilter(supportFragmentManager);
                BaseDocFragment baseDocFragment = (BaseDocFragment) supportFragmentManager.findFragmentByTag(makeTag);
                if (baseDocFragment != null) {
                    if (baseDocFragment.getArguments() == null) {
                        try {
                            baseDocFragment.setArguments(this.mArgs);
                        } catch (IllegalStateException unused) {
                        }
                    } else {
                        baseDocFragment.getArguments().putAll(this.mArgs);
                    }
                    setcolorfilter.getMin(new invalidateDrawable.length(7, (Fragment) baseDocFragment));
                } else {
                    baseDocFragment = (BaseDocFragment) cls.newInstance();
                    baseDocFragment.setArguments(this.mArgs);
                    int id2 = this.mContainerView.getId();
                    if (id2 != 0) {
                        setcolorfilter.length(id2, baseDocFragment, makeTag, 2);
                    } else {
                        throw new IllegalArgumentException("Must use non-zero containerViewId");
                    }
                }
                setcolorfilter.length();
                this.mFragment = baseDocFragment;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    private String makeTag(int i, String str) {
        int min;
        Context baseContext = getBaseContext();
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || i == (min = dispatchOnCancelled.setMin(applicationContext, i)))) {
            onCanceled oncanceled = new onCanceled(i, min, 8);
            onCancelLoad.setMax(11892629, oncanceled);
            onCancelLoad.getMin(11892629, oncanceled);
        }
        int max = dispatchOnCancelled.getMax(i);
        if (i != max) {
            onCanceled oncanceled2 = new onCanceled(i, max, 16);
            onCancelLoad.setMax(11892629, oncanceled2);
            onCancelLoad.getMin(11892629, oncanceled2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(":");
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public void onBackPressed() {
        Fragment fragment = this.mFragment;
        if (!(fragment instanceof BaseDocFragment ? ((BaseDocFragment) fragment).onBackPressed() : false)) {
            super.onBackPressed();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ((BaseDocFragment) this.mFragment).onWindowFocusChanged(z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment fragment;
        int min;
        int length;
        Context baseContext = getBaseContext();
        Context context = null;
        Context applicationContext = baseContext != null ? baseContext.getApplicationContext() : null;
        if (!(applicationContext == null || (length = dispatchOnCancelled.length(applicationContext, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, length, 4);
            onCancelLoad.setMax(59240148, oncanceled);
            onCancelLoad.getMin(59240148, oncanceled);
        }
        Context baseContext2 = getBaseContext();
        if (baseContext2 != null) {
            context = baseContext2.getApplicationContext();
        }
        if (!(context == null || i == (min = dispatchOnCancelled.setMin(context, i)))) {
            onCanceled oncanceled2 = new onCanceled(i, min, 8);
            onCancelLoad.setMax(59240148, oncanceled2);
            onCancelLoad.getMin(59240148, oncanceled2);
        }
        if ((i >> 16) != 0 || (fragment = this.mFragment) == null) {
            super.onActivityResult(i, i2, intent);
        } else {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    public void onResult(ZdocResponse zdocResponse) {
        HashMap hashMap = new HashMap();
        hashMap.put(ZdocRecordService.ZDOC_RESULT, Integer.toString(zdocResponse.retCode));
        if (this.mRecoreService == null) {
            this.mRecoreService = (ZdocRecordService) BioServiceManager.getCurrentInstance().getBioService(ZdocRecordService.class);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("module", BlobStatic.META_TYPE_DOC);
        this.mRecoreService.write("ztech_exit", hashMap2);
        this.mRecoreService.write(ZdocRecordService.END_ZDOC, hashMap);
        if (zdocResponse != null) {
            BioFragmentResponse bioFragmentResponse = new BioFragmentResponse();
            if (zdocResponse.bioUploadResult != null) {
                bioFragmentResponse.isSucess = zdocResponse.bioUploadResult.productRetCode == 1001;
                bioFragmentResponse.suggest = zdocResponse.bioUploadResult.productRetCode;
                bioFragmentResponse.resultMessage = zdocResponse.bioUploadResult.subMsg;
                bioFragmentResponse.ext.put(BioDetector.EXT_KEY_UPLOAD_RESPONSE, JSON.toJSONString(zdocResponse.bioUploadResult));
            }
            bioFragmentResponse.errorCode = zdocResponse.retCode;
            bioFragmentResponse.ext.putAll(zdocResponse.ext);
            bioFragmentResponse.token = getAppDescription().getBistoken();
            int i = zdocResponse.retCode;
            if (i == 101 || i == 200) {
                bioFragmentResponse.subCode = DocCodeConstants.ERROR_CAMERA;
                bioFragmentResponse.subMsg = DocCodeConstants.getMessage(bioFragmentResponse.subCode);
            } else if (i == 100) {
                bioFragmentResponse.subCode = DocCodeConstants.ERROR_CAMERA;
                bioFragmentResponse.subMsg = DocCodeConstants.getMessage(bioFragmentResponse.subCode);
            } else if (i == 205) {
                bioFragmentResponse.subCode = DocCodeConstants.ERROR_SYSTEM;
                bioFragmentResponse.subMsg = DocCodeConstants.getMessage(bioFragmentResponse.subCode);
            } else if (i == 209) {
                bioFragmentResponse.subCode = DocCodeConstants.TOO_MANY_FAIL;
                bioFragmentResponse.subMsg = DocCodeConstants.getMessage(bioFragmentResponse.subCode);
            } else if (i == 202) {
                bioFragmentResponse.subCode = DocCodeConstants.INTERRUPT;
                bioFragmentResponse.subMsg = DocCodeConstants.getMessage(bioFragmentResponse.subCode);
            } else if (i == 203) {
                bioFragmentResponse.subCode = DocCodeConstants.TIME_OUT;
                bioFragmentResponse.subMsg = DocCodeConstants.getMessage(bioFragmentResponse.subCode);
            } else if (i == 207) {
                bioFragmentResponse.subCode = DocCodeConstants.NETWORK_BAD;
                bioFragmentResponse.subMsg = DocCodeConstants.getMessage(bioFragmentResponse.subCode);
            } else if (i == 208) {
                if (zdocResponse.bioUploadResult != null) {
                    bioFragmentResponse.subCode = zdocResponse.bioUploadResult.subCode;
                    bioFragmentResponse.subMsg = zdocResponse.bioUploadResult.subMsg;
                } else {
                    bioFragmentResponse.subCode = DocCodeConstants.FAIL_RETRY;
                    bioFragmentResponse.subMsg = DocCodeConstants.getMessage(bioFragmentResponse.subCode);
                }
            } else if (i == 301) {
                bioFragmentResponse.subCode = DocCodeConstants.USER_QUIT;
                bioFragmentResponse.subMsg = DocCodeConstants.getMessage(bioFragmentResponse.subCode);
            }
            sendResponse(bioFragmentResponse);
            finishActivity(false);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        UIFacade.release();
    }
}
