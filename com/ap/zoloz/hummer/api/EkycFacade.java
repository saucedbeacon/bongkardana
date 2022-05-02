package com.ap.zoloz.hummer.api;

import com.alibaba.fastjson.JSON;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.biz.HummerZCodeConstant;
import com.ap.zoloz.hummer.common.AlertManager;
import com.ap.zoloz.hummer.common.HummerContext;
import com.ap.zoloz.hummer.common.HummerCore;
import com.ap.zoloz.hummer.common.IAlertManagerCallback;
import com.ap.zoloz.hummer.common.RecordManager;
import com.ap.zoloz.hummer.common.WebPageManager;
import com.ap.zoloz.hummer.common.WebTask;
import com.ap.zoloz.hummer.ekyc.biz.HummerEkycConstants;
import com.ap.zoloz.hummer.rpc.IRpcCallback;
import com.ap.zoloz.hummer.rpc.RpcManager;
import com.ap.zoloz.hummer.rpc.RpcResponse;
import java.util.HashMap;

public class EkycFacade extends BaseFacade {
    public static final String TAG = "EkycFacade";
    private static EkycFacade sInstance;
    private IEkycCallback mEkycCallback;
    /* access modifiers changed from: private */
    public IAlertManagerCallback mIAlertManagerCallback;

    public EkycFacade() {
        this.mHummerContext = new HummerContext();
        this.mHummerContext.add(HummerConstants.CURRENT_TASK_NAME, HummerConstants.CONTEXT, TAG);
        this.mHummerCore = new HummerCore();
    }

    public static EkycFacade getInstance() {
        if (sInstance == null) {
            synchronized (EkycFacade.class) {
                if (sInstance == null) {
                    sInstance = new EkycFacade();
                }
            }
        }
        return sInstance;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startEkyc(final com.ap.zoloz.hummer.api.EkycRequest r4, com.ap.zoloz.hummer.api.IEkycCallback r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EkycFacade startEkyc "
            r0.<init>(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.ap.zoloz.hummer.biz.HummerLogger.i(r0)
            java.lang.Class<com.ap.zoloz.hummer.api.EkycFacade> r0 = com.ap.zoloz.hummer.api.EkycFacade.class
            monitor-enter(r0)
            boolean r1 = sIsBusy     // Catch:{ all -> 0x0204 }
            if (r1 == 0) goto L_0x001f
            r3.forceQuit()     // Catch:{ all -> 0x0204 }
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0204 }
            r0 = 1
            sIsBusy = r0
            r3.mEkycCallback = r5
            if (r4 == 0) goto L_0x01fe
            com.ap.zoloz.hummer.common.HummerContext r5 = r3.mHummerContext
            if (r5 == 0) goto L_0x01fe
            com.ap.zoloz.hummer.common.HummerCore r5 = r3.mHummerCore
            if (r5 != 0) goto L_0x0031
            goto L_0x01fe
        L_0x0031:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            if (r5 == 0) goto L_0x0058
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = "hummerContext"
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L_0x0058
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = "hummerContext"
            java.lang.Object r5 = r5.get(r0)
            boolean r5 = r5 instanceof android.app.Activity
            if (r5 == 0) goto L_0x0058
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = "hummerContext"
            java.lang.Object r5 = r5.get(r0)
            android.content.Context r5 = (android.content.Context) r5
            r3.setContext(r5)
        L_0x0058:
            com.ap.zoloz.hummer.common.HummerContext r5 = r3.mHummerContext
            android.content.Context r5 = r5.mContext
            if (r5 != 0) goto L_0x0078
            java.lang.String r4 = "context is null!"
            com.ap.zoloz.hummer.biz.HummerLogger.e((java.lang.String) r4)
            com.ap.zoloz.hummer.api.EkycResponse r4 = new com.ap.zoloz.hummer.api.EkycResponse
            r4.<init>()
            r5 = 1003(0x3eb, float:1.406E-42)
            r4.code = r5
            java.lang.String r5 = "Z7011"
            r4.subCode = r5
            java.lang.String r5 = "context is null"
            r4.result = r5
            r3.finalizeEkyc(r4)
            return
        L_0x0078:
            com.ap.zoloz.hummer.api.EkycFacade$1 r5 = new com.ap.zoloz.hummer.api.EkycFacade$1
            r5.<init>()
            r3.mIAlertManagerCallback = r5
            java.lang.String r5 = r4.eKYCId
            boolean r5 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r5)
            if (r5 == 0) goto L_0x00a3
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "EkycFacade"
            java.lang.String r0 = "Z7010"
            r4.recordSystemError(r5, r0)
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "EkycFacade"
            java.lang.String r0 = "Z7010"
            r4.updateZStack(r5, r0)
            com.ap.zoloz.hummer.common.AlertManager r4 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            com.ap.zoloz.hummer.common.IAlertManagerCallback r5 = r3.mIAlertManagerCallback
            r4.alertSystemError(r5)
            return
        L_0x00a3:
            com.ap.zoloz.hummer.common.HummerContext r5 = r3.mHummerContext
            java.lang.String r0 = r4.eKYCId
            r5.mHummerId = r0
            com.alipay.zoloz.config.ConfigCenter r5 = com.alipay.zoloz.config.ConfigCenter.getInstance()
            java.util.HashMap r5 = r5.getBizConfig()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.bizConfig
            r5.putAll(r0)
            java.lang.String r5 = r4.clientCfg
            boolean r5 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r5)
            if (r5 == 0) goto L_0x00da
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "EkycFacade"
            java.lang.String r0 = "Z7012"
            r4.recordSystemError(r5, r0)
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "EkycFacade"
            java.lang.String r0 = "Z7012"
            r4.updateZStack(r5, r0)
            com.ap.zoloz.hummer.common.AlertManager r4 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            com.ap.zoloz.hummer.common.IAlertManagerCallback r5 = r3.mIAlertManagerCallback
            r4.alertSystemError(r5)
            return
        L_0x00da:
            java.lang.String r5 = r4.clientCfg
            boolean r5 = r3.parseAndSetConfig(r5)
            if (r5 != 0) goto L_0x00fe
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "EkycFacade"
            java.lang.String r0 = "Z7031"
            r4.recordSystemError(r5, r0)
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "EkycFacade"
            java.lang.String r0 = "Z7031"
            r4.updateZStack(r5, r0)
            com.ap.zoloz.hummer.common.AlertManager r4 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            com.ap.zoloz.hummer.common.IAlertManagerCallback r5 = r3.mIAlertManagerCallback
            r4.alertSystemError(r5)
            return
        L_0x00fe:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r0 = r0.mHummerId
            java.lang.String r1 = "hummerId"
            r5.put(r1, r0)
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "DEVICE_ID"
            java.lang.Object r0 = r0.query(r1)
            if (r0 == 0) goto L_0x0125
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "DEVICE_ID"
            java.lang.Object r0 = r0.query(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "DEVICE_ID"
            r5.put(r1, r0)
        L_0x0125:
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "MERCHANT_USER_ID"
            java.lang.Object r0 = r0.query(r1)
            if (r0 == 0) goto L_0x013f
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "MERCHANT_USER_ID"
            java.lang.Object r0 = r0.query(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "userId"
            r5.put(r1, r0)
        L_0x013f:
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "REMOTELOG_URL"
            java.lang.Object r0 = r0.query(r1)
            if (r0 == 0) goto L_0x0158
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "REMOTELOG_URL"
            java.lang.Object r0 = r0.query(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "REMOTELOG_URL"
            r5.put(r1, r0)
        L_0x0158:
            com.alipay.zoloz.config.ConfigCenter r0 = com.alipay.zoloz.config.ConfigCenter.getInstance()
            java.util.HashMap r0 = r0.getBizConfig()
            java.lang.String r1 = "authType"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x017e
            com.alipay.zoloz.config.ConfigCenter r0 = com.alipay.zoloz.config.ConfigCenter.getInstance()
            java.util.HashMap r0 = r0.getBizConfig()
            java.lang.String r1 = "authType"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "authType"
            r5.put(r1, r0)
            goto L_0x0185
        L_0x017e:
            java.lang.String r0 = "authType"
            java.lang.String r1 = "EKYC"
            r5.put(r0, r1)
        L_0x0185:
            com.ap.zoloz.hummer.common.RecordManager r0 = com.ap.zoloz.hummer.common.RecordManager.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r1 = r3.mHummerContext
            android.content.Context r1 = r1.mContext
            r0.init(r1, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            android.content.Context r0 = r0.mContext
            r1 = 0
            com.alipay.mobile.security.zim.api.ZIMMetaInfo r0 = com.alipay.mobile.security.zim.api.ZIMFacade.getZimMetaInfo(r0, r1)
            java.lang.String r0 = r0.getBioMetaInfo()
            java.lang.String r2 = "sdkVersion"
            r5.put(r2, r0)
            com.ap.zoloz.hummer.common.RecordManager r0 = com.ap.zoloz.hummer.common.RecordManager.getInstance()
            java.lang.String r2 = "ekycStart"
            r0.record(r2, r5)
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            if (r5 == 0) goto L_0x01c9
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = com.ap.zoloz.hummer.biz.HummerConstants.HUMMER_CONFIG_PATH
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L_0x01c9
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = com.ap.zoloz.hummer.biz.HummerConstants.HUMMER_CONFIG_PATH
            java.lang.Object r5 = r5.get(r0)
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
        L_0x01c9:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            if (r5 == 0) goto L_0x01e9
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = "zlz_font_style"
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L_0x01e9
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = "zlz_font_style"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            zoloz.ap.com.toolkit.ui.CustomTextView.setFontName(r5)
            zoloz.ap.com.toolkit.ui.CustomButton.setFontName(r5)
        L_0x01e9:
            com.alipay.zoloz.config.ConfigCenter r5 = com.alipay.zoloz.config.ConfigCenter.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            android.content.Context r0 = r0.mContext
            android.content.Context r0 = r0.getApplicationContext()
            com.ap.zoloz.hummer.api.EkycFacade$2 r2 = new com.ap.zoloz.hummer.api.EkycFacade$2
            r2.<init>(r4)
            r5.init(r0, r1, r2)
            return
        L_0x01fe:
            java.lang.String r4 = "illegal request!"
            com.ap.zoloz.hummer.biz.HummerLogger.e((java.lang.String) r4)
            return
        L_0x0204:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hummer.api.EkycFacade.startEkyc(com.ap.zoloz.hummer.api.EkycRequest, com.ap.zoloz.hummer.api.IEkycCallback):void");
    }

    /* access modifiers changed from: protected */
    public synchronized void release() {
        HummerLogger.i("releasing");
        super.release();
        sIsBusy = false;
        if (sInstance != null) {
            sInstance = null;
        }
        this.mEkycCallback = null;
        this.mIAlertManagerCallback = null;
    }

    /* access modifiers changed from: protected */
    public void forceQuit() {
        HummerLogger.i("forceQuitting");
        super.forceQuit();
        this.mIAlertManagerCallback = null;
    }

    public void forceRelease() {
        if (sIsBusy) {
            HashMap hashMap = new HashMap();
            hashMap.put(HummerEkycConstants.END_STATUS, HummerEkycConstants.LOGIN_EXPIRED);
            RecordManager.getInstance().record(HummerEkycConstants.END_EKYC, hashMap);
            forceQuit();
            release();
        }
    }

    public HummerContext getHummerContext() {
        return this.mHummerContext;
    }

    /* access modifiers changed from: private */
    public void finalizeEkyc(EkycResponse ekycResponse) {
        HashMap hashMap = new HashMap();
        hashMap.put(HummerConstants.PROD_RET_CODE, String.valueOf(ekycResponse.code));
        hashMap.put(HummerConstants.PROD_SUB_RET_CODE, ekycResponse.subCode);
        RecordManager.getInstance().record(HummerEkycConstants.END_EKYC, hashMap);
        IEkycCallback iEkycCallback = this.mEkycCallback;
        if (iEkycCallback != null) {
            iEkycCallback.onCompletion(ekycResponse);
        }
        StringBuilder sb = new StringBuilder("ekyc response =");
        sb.append(ekycResponse.toString());
        HummerLogger.i(sb.toString());
        release();
    }

    public void endWebTask(int i, String str) {
        HummerLogger.i("endWebTask ");
        if (this.mHummerContext != null && this.mHummerCore != null) {
            if (this.mHummerContext.getCurrentTaskConfig().type.equals(HummerConstants.WEB_TASK)) {
                WebTask webTask = (WebTask) this.mHummerCore.getCurrentTask();
                if (webTask != null) {
                    webTask.handleResult(i, str);
                    return;
                }
                return;
            }
            this.mHummerContext.recordSystemError(TAG, HummerZCodeConstant.WEBTASK_ERROR_CODE);
            this.mHummerContext.updateZStack(TAG, HummerZCodeConstant.WEBTASK_ERROR_CODE);
            AlertManager.getInstance().alertSystemError(this.mIAlertManagerCallback);
        }
    }

    /* access modifiers changed from: private */
    public void cancelEkyc() {
        if (this.mHummerContext != null) {
            int cancelIndex = this.mHummerContext.getCancelIndex();
            if (cancelIndex == 0) {
                this.mHummerContext.recordSystemError(TAG, HummerZCodeConstant.INVALID_CANCEL_INDEX);
                cancelExit();
                return;
            }
            RpcManager.getInstance().sendRpc(new IRpcCallback() {
                public void onCompletion(RpcResponse rpcResponse) {
                    EkycFacade.this.cancelExit();
                }
            }, RpcManager.getInstance().formatRequest(this.mHummerContext, cancelIndex, false));
        }
    }

    /* access modifiers changed from: private */
    public void cancelExit() {
        WebPageManager.getInstance().exitSession();
        EkycResponse ekycResponse = new EkycResponse();
        ekycResponse.code = 1003;
        if (this.mHummerContext != null) {
            ekycResponse.subCode = this.mHummerContext.getLastZStackCode();
            ekycResponse.result = JSON.toJSONString(this.mHummerContext.getZStack());
        }
        finalizeEkyc(ekycResponse);
    }
}
