package com.ap.zoloz.hummer.api;

import android.content.Context;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.biz.HummerZCodeConstant;
import com.ap.zoloz.hummer.connect.api.ConnectFacade;
import com.ap.zoloz.hummer.connect.api.ConnectRequest;
import com.ap.zoloz.hummer.connect.api.ConnectResponse;
import com.ap.zoloz.hummer.connect.api.IConnectCallback;
import com.google.firebase.perf.FirebasePerformance;

public class ZLZFacade {
    public static final String TAG = "ZLZFacade";
    private static ZLZFacade sInstance;
    protected static boolean sIsBusy;
    /* access modifiers changed from: private */
    public IZLZCallback mIZLZCallback;

    public static ZLZFacade getInstance() {
        if (sInstance == null) {
            synchronized (ZLZFacade.class) {
                if (sInstance == null) {
                    sInstance = new ZLZFacade();
                }
            }
        }
        return sInstance;
    }

    public void start(ZLZRequest zLZRequest, IZLZCallback iZLZCallback) {
        String str;
        StringBuilder sb = new StringBuilder("ZLZFacade start ");
        sb.append(zLZRequest.toString());
        HummerLogger.i(sb.toString());
        synchronized (ZLZFacade.class) {
            str = null;
            if (sIsBusy) {
                this.mIZLZCallback = null;
            }
        }
        sIsBusy = true;
        this.mIZLZCallback = iZLZCallback;
        if (!StringUtil.isNullorEmpty(zLZRequest.zlzConfig)) {
            str = BaseFacade.getAuthType(zLZRequest.zlzConfig);
        }
        switchConstants(zLZRequest);
        if (!isSupporttedAuthType(str)) {
            ZLZResponse zLZResponse = new ZLZResponse();
            zLZResponse.retCode = HummerZCodeConstant.INCORRECT_CLIENT_CONFIG;
            this.mIZLZCallback.onInterrupted(zLZResponse);
            release();
        } else if (str.equals("REALID") || str.equals("REALIDLITE_KYC")) {
            EkycFacade instance = EkycFacade.getInstance();
            EkycRequest ekycRequest = new EkycRequest();
            ekycRequest.bizConfig = zLZRequest.bizConfig;
            ekycRequest.bizConfig.put(HummerConstants.AUTH_TYPE, str);
            ekycRequest.clientCfg = zLZRequest.zlzConfig;
            ekycRequest.eKYCId = BaseFacade.getFlowId(zLZRequest.zlzConfig);
            instance.startEkyc(ekycRequest, new IEkycCallback() {
                public void onCompletion(EkycResponse ekycResponse) {
                    ZLZResponse zLZResponse = new ZLZResponse();
                    zLZResponse.retCode = ekycResponse.subCode;
                    zLZResponse.extInfo = ekycResponse.extInfo;
                    if (ekycResponse.code == 1003) {
                        ZLZFacade.this.mIZLZCallback.onInterrupted(zLZResponse);
                    } else {
                        ZLZFacade.this.mIZLZCallback.onCompleted(zLZResponse);
                    }
                    ZLZFacade.this.release();
                }
            });
        } else {
            ConnectFacade instance2 = ConnectFacade.getInstance();
            ConnectRequest connectRequest = new ConnectRequest();
            connectRequest.bizConfig = zLZRequest.bizConfig;
            connectRequest.bizConfig.put(HummerConstants.AUTH_TYPE, str);
            connectRequest.connectConfig = zLZRequest.zlzConfig;
            connectRequest.connectId = BaseFacade.getFlowId(zLZRequest.zlzConfig);
            instance2.startConnect(connectRequest, new IConnectCallback() {
                public void onCompletion(ConnectResponse connectResponse) {
                    ZLZResponse zLZResponse = new ZLZResponse();
                    zLZResponse.retCode = connectResponse.subCode;
                    zLZResponse.extInfo = connectResponse.extInfo;
                    if (connectResponse.code == 1003) {
                        ZLZFacade.this.mIZLZCallback.onInterrupted(zLZResponse);
                    } else {
                        ZLZFacade.this.mIZLZCallback.onCompleted(zLZResponse);
                    }
                    ZLZFacade.this.release();
                }
            });
        }
    }

    private void switchConstants(ZLZRequest zLZRequest) {
        updateValue(zLZRequest, ZLZConstants.CONTEXT, HummerConstants.HUMMER_CONTEXT);
        updateValue(zLZRequest, ZLZConstants.LOCALE, HummerConstants.HUMMER_LOCALE);
        updateValue(zLZRequest, "public_key", "public_key");
        updateValue(zLZRequest, ZLZConstants.CHAMELEON_CONFIG_PATH, HummerConstants.HUMMER_CONFIG_PATH);
    }

    private void updateValue(ZLZRequest zLZRequest, String str, String str2) {
        if (!str.equals(str2) && zLZRequest.bizConfig.containsKey(str)) {
            zLZRequest.bizConfig.put(str2, zLZRequest.bizConfig.remove(str));
        }
    }

    private boolean isSupporttedAuthType(String str) {
        if (!StringUtil.isNullorEmpty(str)) {
            return str.equals(FirebasePerformance.HttpMethod.CONNECT) || str.equals("ZDOC") || str.equals("ZFACE") || str.equals("REALID");
        }
        return false;
    }

    public static String getMetaInfo(Context context) {
        return BaseFacade.getMetaInfo(context);
    }

    public void release() {
        this.mIZLZCallback = null;
        sIsBusy = false;
        sInstance = null;
    }
}
