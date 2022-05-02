package com.ap.zoloz.hummer.connect.api;

import com.alibaba.fastjson.JSON;
import com.ap.zoloz.hummer.api.BaseFacade;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.ap.zoloz.hummer.biz.HummerLogger;
import com.ap.zoloz.hummer.common.HummerContext;
import com.ap.zoloz.hummer.common.HummerCore;
import com.ap.zoloz.hummer.common.HummerResponse;
import com.ap.zoloz.hummer.common.IAlertManagerCallback;
import com.ap.zoloz.hummer.common.IHummerCoreCallback;
import com.ap.zoloz.hummer.common.RecordManager;
import com.ap.zoloz.hummer.connect.biz.HummerConnectConstants;
import java.util.HashMap;

public class ConnectFacade extends BaseFacade {
    public static final String TAG = "ConnectFacade";
    private static ConnectFacade sInstance;
    /* access modifiers changed from: private */
    public IAlertManagerCallback iAlertManagerCallback;
    /* access modifiers changed from: private */
    public boolean isFromClient;
    private IConnectCallback mIConnectCallback;

    public static ConnectFacade getInstance() {
        if (sInstance == null) {
            synchronized (ConnectFacade.class) {
                if (sInstance == null) {
                    sInstance = new ConnectFacade();
                }
            }
        }
        return sInstance;
    }

    public ConnectFacade() {
        this.mHummerContext = new HummerContext();
        this.mHummerCore = new HummerCore();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startConnect(final com.ap.zoloz.hummer.connect.api.ConnectRequest r4, com.ap.zoloz.hummer.connect.api.IConnectCallback r5) {
        /*
            r3 = this;
            r3.mIConnectCallback = r5
            java.lang.Class<com.ap.zoloz.hummer.connect.api.ConnectFacade> r5 = com.ap.zoloz.hummer.connect.api.ConnectFacade.class
            monitor-enter(r5)
            boolean r0 = sIsBusy     // Catch:{ all -> 0x0236 }
            if (r0 == 0) goto L_0x000c
            r3.forceQuit()     // Catch:{ all -> 0x0236 }
        L_0x000c:
            monitor-exit(r5)     // Catch:{ all -> 0x0236 }
            r5 = 1
            sIsBusy = r5
            if (r4 == 0) goto L_0x0230
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            if (r0 == 0) goto L_0x0230
            com.ap.zoloz.hummer.common.HummerCore r0 = r3.mHummerCore
            if (r0 != 0) goto L_0x001c
            goto L_0x0230
        L_0x001c:
            java.lang.String r0 = ""
            zoloz.ap.com.toolkit.ui.CustomTextView.setFontName(r0)
            java.lang.String r0 = ""
            zoloz.ap.com.toolkit.ui.CustomButton.setFontName(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.bizConfig
            if (r0 == 0) goto L_0x0054
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.bizConfig
            java.lang.String r1 = "hummerContext"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0054
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.bizConfig
            java.lang.String r1 = "hummerContext"
            java.lang.Object r0 = r0.get(r1)
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x004e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.bizConfig
            java.lang.String r1 = "hummerContext"
            java.lang.Object r0 = r0.get(r1)
            android.content.Context r0 = (android.content.Context) r0
            r3.setContext(r0)
            goto L_0x0054
        L_0x004e:
            java.lang.String r4 = "context is not activity context!"
            com.ap.zoloz.hummer.biz.HummerLogger.e((java.lang.String) r4)
            return
        L_0x0054:
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            android.content.Context r0 = r0.mContext
            if (r0 != 0) goto L_0x0060
            java.lang.String r4 = "context is null!"
            com.ap.zoloz.hummer.biz.HummerLogger.e((java.lang.String) r4)
            return
        L_0x0060:
            java.lang.String r0 = r4.connectId
            boolean r0 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r0)
            if (r0 == 0) goto L_0x006b
            r3.isFromClient = r5
            goto L_0x006e
        L_0x006b:
            r5 = 0
            r3.isFromClient = r5
        L_0x006e:
            boolean r5 = r3.isFromClient
            if (r5 == 0) goto L_0x00a6
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            if (r5 == 0) goto L_0x008a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = "bizProdNode"
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L_0x008a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = "merchantId"
            boolean r5 = r5.containsKey(r0)
            if (r5 != 0) goto L_0x00a6
        L_0x008a:
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "ConnectFacade"
            java.lang.String r0 = "Z7036"
            r4.recordSystemError(r5, r0)
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "ConnectFacade"
            java.lang.String r0 = "Z7036"
            r4.updateZStack(r5, r0)
            com.ap.zoloz.hummer.common.AlertManager r4 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            com.ap.zoloz.hummer.common.IAlertManagerCallback r5 = r3.iAlertManagerCallback
            r4.alertSystemError(r5)
            return
        L_0x00a6:
            java.lang.String r5 = r4.connectConfig
            boolean r5 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r5)
            if (r5 != 0) goto L_0x0214
            java.lang.String r5 = r4.connectConfig
            boolean r5 = r3.parseAndSetConfig(r5)
            if (r5 != 0) goto L_0x00b8
            goto L_0x0214
        L_0x00b8:
            com.alipay.zoloz.config.ConfigCenter r5 = com.alipay.zoloz.config.ConfigCenter.getInstance()
            java.util.HashMap r5 = r5.getBizConfig()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.bizConfig
            r5.putAll(r0)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "DEVICE_ID"
            java.lang.Object r0 = r0.query(r1)
            if (r0 == 0) goto L_0x00e3
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "DEVICE_ID"
            java.lang.Object r0 = r0.query(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "DEVICE_ID"
            r5.put(r1, r0)
        L_0x00e3:
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "MERCHANT_USER_ID"
            java.lang.Object r0 = r0.query(r1)
            if (r0 == 0) goto L_0x00fd
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "MERCHANT_USER_ID"
            java.lang.Object r0 = r0.query(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "userId"
            r5.put(r1, r0)
        L_0x00fd:
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "REMOTELOG_URL"
            java.lang.Object r0 = r0.query(r1)
            if (r0 == 0) goto L_0x0116
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = "REMOTELOG_URL"
            java.lang.Object r0 = r0.query(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "REMOTELOG_URL"
            r5.put(r1, r0)
        L_0x0116:
            boolean r0 = r3.isFromClient
            if (r0 == 0) goto L_0x0128
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "bizId"
            r5.put(r1, r0)
            goto L_0x0137
        L_0x0128:
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r1 = r4.connectId
            r0.mHummerId = r1
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            java.lang.String r0 = r0.mHummerId
            java.lang.String r1 = "hummerId"
            r5.put(r1, r0)
        L_0x0137:
            com.alipay.zoloz.config.ConfigCenter r0 = com.alipay.zoloz.config.ConfigCenter.getInstance()
            java.util.HashMap r0 = r0.getBizConfig()
            java.lang.String r1 = "authType"
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x015d
            com.alipay.zoloz.config.ConfigCenter r0 = com.alipay.zoloz.config.ConfigCenter.getInstance()
            java.util.HashMap r0 = r0.getBizConfig()
            java.lang.String r1 = "authType"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "authType"
            r5.put(r1, r0)
            goto L_0x0164
        L_0x015d:
            java.lang.String r0 = "authType"
            java.lang.String r1 = "CONNECT"
            r5.put(r0, r1)
        L_0x0164:
            com.ap.zoloz.hummer.common.RecordManager r0 = com.ap.zoloz.hummer.common.RecordManager.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r1 = r3.mHummerContext
            android.content.Context r1 = r1.mContext
            r0.init(r1, r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            r1 = 0
            if (r0 == 0) goto L_0x01a3
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            android.content.Context r0 = r0.mContext
            if (r0 == 0) goto L_0x01a3
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            android.content.Context r0 = r0.mContext
            com.alipay.mobile.security.zim.api.ZIMMetaInfo r0 = com.alipay.mobile.security.zim.api.ZIMFacade.getZimMetaInfo(r0, r1)
            java.lang.String r0 = r0.getBioMetaInfo()
            java.lang.String r2 = "sdkVersion"
            r5.put(r2, r0)
            boolean r0 = r3.isFromClient
            if (r0 == 0) goto L_0x01a3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.bizConfig
            java.lang.String r2 = "bizProdNode"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "bizProdNode"
            r5.put(r2, r0)
        L_0x01a3:
            com.ap.zoloz.hummer.common.RecordManager r0 = com.ap.zoloz.hummer.common.RecordManager.getInstance()
            java.lang.String r2 = "connectStart"
            r0.record(r2, r5)
            r5.clear()
            java.lang.String r0 = "module"
            java.lang.String r2 = "hummer"
            r5.put(r0, r2)
            com.ap.zoloz.hummer.common.RecordManager r0 = com.ap.zoloz.hummer.common.RecordManager.getInstance()
            java.lang.String r2 = com.ap.zoloz.hummer.biz.HummerConstants.ZTECH_ENRTER
            r0.record(r2, r5)
            com.ap.zoloz.hummer.connect.api.ConnectFacade$1 r5 = new com.ap.zoloz.hummer.connect.api.ConnectFacade$1
            r5.<init>()
            r3.iAlertManagerCallback = r5
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            if (r5 == 0) goto L_0x01df
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = com.ap.zoloz.hummer.biz.HummerConstants.HUMMER_CONFIG_PATH
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L_0x01df
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = com.ap.zoloz.hummer.biz.HummerConstants.HUMMER_CONFIG_PATH
            java.lang.Object r5 = r5.get(r0)
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
        L_0x01df:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            if (r5 == 0) goto L_0x01ff
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = "zlz_font_style"
            boolean r5 = r5.containsKey(r0)
            if (r5 == 0) goto L_0x01ff
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.bizConfig
            java.lang.String r0 = "zlz_font_style"
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            zoloz.ap.com.toolkit.ui.CustomTextView.setFontName(r5)
            zoloz.ap.com.toolkit.ui.CustomButton.setFontName(r5)
        L_0x01ff:
            com.alipay.zoloz.config.ConfigCenter r5 = com.alipay.zoloz.config.ConfigCenter.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r0 = r3.mHummerContext
            android.content.Context r0 = r0.mContext
            android.content.Context r0 = r0.getApplicationContext()
            com.ap.zoloz.hummer.connect.api.ConnectFacade$2 r2 = new com.ap.zoloz.hummer.connect.api.ConnectFacade$2
            r2.<init>(r4)
            r5.init(r0, r1, r2)
            return
        L_0x0214:
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "ConnectFacade"
            java.lang.String r0 = "Z7036"
            r4.recordSystemError(r5, r0)
            com.ap.zoloz.hummer.common.HummerContext r4 = r3.mHummerContext
            java.lang.String r5 = "ConnectFacade"
            java.lang.String r0 = "Z7036"
            r4.updateZStack(r5, r0)
            com.ap.zoloz.hummer.common.AlertManager r4 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            com.ap.zoloz.hummer.common.IAlertManagerCallback r5 = r3.iAlertManagerCallback
            r4.alertSystemError(r5)
            return
        L_0x0230:
            java.lang.String r4 = "illegal request!"
            com.ap.zoloz.hummer.biz.HummerLogger.e((java.lang.String) r4)
            return
        L_0x0236:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hummer.connect.api.ConnectFacade.startConnect(com.ap.zoloz.hummer.connect.api.ConnectRequest, com.ap.zoloz.hummer.connect.api.IConnectCallback):void");
    }

    /* access modifiers changed from: private */
    public void finalizeConnect(ConnectResponse connectResponse) {
        HashMap hashMap = new HashMap();
        hashMap.put(HummerConstants.PROD_RET_CODE, String.valueOf(connectResponse.code));
        hashMap.put(HummerConstants.PROD_SUB_RET_CODE, connectResponse.subCode);
        RecordManager.getInstance().record(HummerConnectConstants.END_CONNECT, hashMap);
        IConnectCallback iConnectCallback = this.mIConnectCallback;
        if (iConnectCallback != null) {
            iConnectCallback.onCompletion(connectResponse);
        }
        StringBuilder sb = new StringBuilder("Connect response =");
        sb.append(connectResponse.toString());
        HummerLogger.i(sb.toString());
        hashMap.clear();
        hashMap.put("module", "hummer");
        RecordManager.getInstance().record(HummerConstants.ZTECH_EXIT, hashMap);
        release();
    }

    /* access modifiers changed from: private */
    public void startProcess() {
        this.mHummerCore.schedule(this.mHummerContext, new IHummerCoreCallback() {
            public void onCompletion(HummerContext hummerContext) {
                ConnectFacade.this.mHummerContext.add(HummerConstants.CURRENT_TASK_NAME, HummerConstants.CONTEXT, ConnectFacade.TAG);
                ConnectResponse connectResponse = new ConnectResponse();
                HummerContext unused = ConnectFacade.this.mHummerContext = hummerContext;
                HummerResponse hummerResponse = (HummerResponse) ConnectFacade.this.mHummerContext.query(HummerConstants.HUMMER_RESPONSE);
                if (hummerResponse != null) {
                    int i = hummerResponse.code;
                    if (i == 1000) {
                        connectResponse.code = 1000;
                        connectResponse.subCode = ConnectResponse.ZOLOZ_CONNECT_SUCCESS;
                        connectResponse.result = ConnectResponse.ZOLOZ_CONNECT_SUCCESS_MSG;
                    } else if (i != 2006) {
                        connectResponse.code = 1003;
                        if (ConnectFacade.this.mHummerContext != null) {
                            connectResponse.subCode = ConnectFacade.this.mHummerContext.getLastZStackCode();
                            connectResponse.result = JSON.toJSONString(ConnectFacade.this.mHummerContext.getZStack());
                        }
                    } else {
                        connectResponse.code = 2006;
                        if (ConnectFacade.this.mHummerContext != null) {
                            connectResponse.subCode = ConnectFacade.this.mHummerContext.getLastZStackCode();
                            connectResponse.result = JSON.toJSONString(ConnectFacade.this.mHummerContext.getZStack());
                        }
                    }
                    ConnectFacade.this.finalizeConnect(connectResponse);
                }
            }
        }, false);
    }

    public synchronized void release() {
        super.release();
        if (sInstance != null) {
            sInstance = null;
        }
        this.mIConnectCallback = null;
    }
}
