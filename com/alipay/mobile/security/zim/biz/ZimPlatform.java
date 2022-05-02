package com.alipay.mobile.security.zim.biz;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alipay.biometrics.ui.widget.LoadingProgressDialog;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwRequest;
import com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse;
import com.alipay.bis.common.service.facade.gw.zim.ZimValidateGwResponse;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioDetectorBuilder;
import com.alipay.mobile.security.bio.api.BioParameter;
import com.alipay.mobile.security.bio.api.BioProgressCallback;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.bio.constants.ZcodeConstants;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadResult;
import com.alipay.mobile.security.bio.service.BioUploadServiceCore;
import com.alipay.mobile.security.bio.service.ZimRecordService;
import com.alipay.mobile.security.bio.service.local.apsecurity.ApSecurityService;
import com.alipay.mobile.security.bio.service.local.monitorlog.MonitorLogService;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.alipay.mobile.security.bio.workspace.Env;
import com.alipay.mobile.security.zim.R;
import com.alipay.mobile.security.zim.api.ZIMCallback;
import com.alipay.mobile.security.zim.api.ZIMFacade;
import com.alipay.mobile.security.zim.api.ZIMResponse;
import com.alipay.mobile.security.zim.api.ZimProgressCallback;
import com.alipay.mobile.security.zim.gw.BaseGwService;
import com.alipay.mobile.security.zim.gw.BioUploadServiceCoreZhub;
import com.alipay.mobile.security.zim.gw.GwListener;
import com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import zoloz.ap.com.toolkit.ui.DialogHelper;

public class ZimPlatform extends ZIMFacade implements GwListener, BioProgressCallback {
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_RESULT = "result";
    public static final String KEY_RET_CODE = "retCode";
    public static final String KEY_SUB_CODE = "subCode";
    public static final String KEY_SUB_MSG = "subMsg";
    public static final String REASON_0 = "0";
    public static final String RESULT_FALSE = Boolean.FALSE.toString();
    public static final String RESULT_TRUE = Boolean.TRUE.toString();
    private static Context mH5Context;
    private static boolean sIsBusy;
    private boolean isInit = false;
    private BaseGwService mBaseGWService;
    private BioDetector mBioDetector;
    /* access modifiers changed from: private */
    public BioParameter mBioParameter = new BioParameter();
    private BioServiceManager mBioServiceManager;
    /* access modifiers changed from: private */
    public Context mContext;
    private String mFacePayInfo;
    /* access modifiers changed from: private */
    public LoadingProgressDialog mLoadingProgressDialog;
    /* access modifiers changed from: private */
    public Map<String, String> mParams;
    private ZIMCallback mZIMCallback;
    /* access modifiers changed from: private */
    public String mZimId = "";
    private ZimMessageChannel mZimMessageChannel;

    public ZimPlatform(Context context) {
        this.mContext = context;
        try {
            Constructor<?> constructor = Class.forName(Env.getProtocolFormat(context) != 2 ? "com.alipay.mobile.security.zim.gw.JsonGwService" : "com.alipay.mobile.security.zim.gw.PbGwService").getConstructor(new Class[]{GwListener.class});
            constructor.setAccessible(true);
            this.mBaseGWService = (BaseGwService) constructor.newInstance(new Object[]{this});
        } catch (Throwable unused) {
            ZIMResponse zIMResponse = new ZIMResponse();
            zIMResponse.subCode = ZcodeConstants.ZCODE_PROGURD_ERROR;
            zIMResponse.msg = ZcodeConstants.getMessage(zIMResponse.subCode);
            zIMResponse.code = 1001;
            zIMResponse.extInfo.put(ZIMFacade.KEY_BIO_ACTION, "206");
            doCallZimCallback(zIMResponse);
        }
    }

    public static void setH5Context(Context context) {
        mH5Context = context;
    }

    private void initZoloz(Context context, String str, ZimMessageChannel zimMessageChannel) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(15929499, oncanceled);
                onCancelLoad.getMin(15929499, oncanceled);
            }
        }
        if (!this.isInit) {
            createLoadingDialog();
        }
        this.mBioDetector = BioDetectorBuilder.create(context, new MicroModule(str));
        BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
        this.mBioServiceManager = currentInstance;
        ApSecurityService apSecurityService = (ApSecurityService) currentInstance.getBioService(ApSecurityService.class);
        if (apSecurityService != null) {
            apSecurityService.init(this.mContext);
        }
        this.mZimMessageChannel = zimMessageChannel;
    }

    public ZimInitGwResponse parse(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(465542707, oncanceled);
            onCancelLoad.getMin(465542707, oncanceled);
        }
        if (!TextUtils.isEmpty(str)) {
            return this.mBaseGWService.convert(str);
        }
        return null;
    }

    public void verify(String str, Map<String, String> map, ZIMCallback zIMCallback) {
        verify(str, map, (ZimMessageChannel) null, zIMCallback);
    }

    public void verify(String str, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback) {
        ZimInitGwResponse zimInitGwResponse = null;
        if (map != null) {
            if (map.containsKey("zimInitResp")) {
                zimInitGwResponse = parse(map.remove("zimInitResp"));
            }
            if (zimInitGwResponse != null) {
                map.remove(ZIMFacade.KEY_INIT_RESP_OLD);
            } else if (map.containsKey(ZIMFacade.KEY_INIT_RESP_OLD)) {
                zimInitGwResponse = parse(map.remove(ZIMFacade.KEY_INIT_RESP_OLD));
            }
        }
        verify(str, zimInitGwResponse, map, zimMessageChannel, zIMCallback);
    }

    public void verify(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZIMCallback zIMCallback) {
        verify(str, zimInitGwResponse, map, (ZimMessageChannel) null, zIMCallback);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        r3.mZimId = r4;
        r3.mParams = r6;
        r3.mZIMCallback = r8;
        r0 = new java.lang.StringBuilder("verify(zimId=");
        r0.append(r4);
        r0.append(", params=");
        r0.append(com.alipay.mobile.security.bio.utils.StringUtil.map2String(r6));
        r0.append(", channel=");
        r0.append(r7);
        r0.append(", callback=");
        r0.append(r8);
        r0.append(")");
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        if (r6 == null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        if (r6.containsKey(com.alipay.mobile.security.zim.api.ZIMFacade.KEY_ENV_NAME) == false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r8 = r6.remove(com.alipay.mobile.security.zim.api.ZIMFacade.KEY_ENV_NAME);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        initEnv(r3.mContext, r8);
        initZoloz(r3.mContext, r4, r7);
        r7 = com.alipay.mobile.security.zim.biz.RecordProcessor.getInstance();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0087, code lost:
        if (r7 != null) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        r7 = com.alipay.mobile.security.zim.biz.RecordProcessor.createInstance(r3.mContext);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        r7.zimInit(r4);
        r7.record(com.alipay.mobile.security.zim.biz.RecordProcessor.KEY_ZIM_START);
        r7.record(com.alipay.mobile.security.zim.biz.RecordProcessor.KEY_VERIFY_REQUEST);
        r8 = new java.util.HashMap();
        r8.put("module", "zim");
        r7.record(com.alipay.mobile.security.zim.biz.RecordProcessor.KEY_ZTECH_ENRTER, (java.util.Map<java.lang.String, java.lang.String>) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ad, code lost:
        if (r5 == null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b0, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b1, code lost:
        r7 = java.lang.Boolean.toString(r1);
        r3.mBioParameter.addExtProperty("mock", r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        if (r1 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        onInit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c2, code lost:
        performInitRequest(r4, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void verify(java.lang.String r4, com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse r5, java.util.Map<java.lang.String, java.lang.String> r6, com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel r7, com.alipay.mobile.security.zim.api.ZIMCallback r8) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00d1
            if (r8 == 0) goto L_0x00c9
            java.lang.Class<com.alipay.mobile.security.zim.biz.ZimPlatform> r0 = com.alipay.mobile.security.zim.biz.ZimPlatform.class
            monitor-enter(r0)
            boolean r1 = sIsBusy     // Catch:{ all -> 0x00c6 }
            if (r1 == 0) goto L_0x0031
            com.alipay.mobile.security.zim.api.ZIMResponse r4 = new com.alipay.mobile.security.zim.api.ZIMResponse     // Catch:{ all -> 0x00c6 }
            r4.<init>()     // Catch:{ all -> 0x00c6 }
            r5 = 2006(0x7d6, float:2.811E-42)
            r4.code = r5     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = "busy"
            r4.reason = r5     // Catch:{ all -> 0x00c6 }
            java.lang.String r5 = com.alipay.mobile.security.bio.constants.ZcodeConstants.ZCODE_ZIM_IS_BUSY     // Catch:{ all -> 0x00c6 }
            r4.subCode = r5     // Catch:{ all -> 0x00c6 }
            java.util.Map<java.lang.String, java.lang.String> r5 = r4.extInfo     // Catch:{ all -> 0x00c6 }
            java.lang.String r6 = "zimAction"
            java.lang.String r7 = "400"
            r5.put(r6, r7)     // Catch:{ all -> 0x00c6 }
            r3.recordVerifyResponse(r4)     // Catch:{ all -> 0x00c6 }
            r8.response(r4)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x0031:
            r1 = 1
            sIsBusy = r1     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            r3.mZimId = r4
            r3.mParams = r6
            r3.mZIMCallback = r8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "verify(zimId="
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = ", params="
            r0.append(r2)
            java.lang.String r2 = com.alipay.mobile.security.bio.utils.StringUtil.map2String(r6)
            r0.append(r2)
            java.lang.String r2 = ", channel="
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = ", callback="
            r0.append(r2)
            r0.append(r8)
            java.lang.String r8 = ")"
            r0.append(r8)
            r8 = 0
            if (r6 == 0) goto L_0x0079
            java.lang.String r0 = "env_name"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x0079
            java.lang.String r8 = "env_name"
            java.lang.Object r8 = r6.remove(r8)
            java.lang.String r8 = (java.lang.String) r8
        L_0x0079:
            android.content.Context r0 = r3.mContext
            initEnv(r0, r8)
            android.content.Context r8 = r3.mContext
            r3.initZoloz(r8, r4, r7)
            com.alipay.mobile.security.zim.biz.RecordProcessor r7 = com.alipay.mobile.security.zim.biz.RecordProcessor.getInstance()
            if (r7 != 0) goto L_0x008f
            android.content.Context r7 = r3.mContext
            com.alipay.mobile.security.zim.biz.RecordProcessor r7 = com.alipay.mobile.security.zim.biz.RecordProcessor.createInstance(r7)
        L_0x008f:
            r7.zimInit(r4)
            java.lang.String r8 = com.alipay.mobile.security.zim.biz.RecordProcessor.KEY_ZIM_START
            r7.record((java.lang.String) r8)
            java.lang.String r8 = com.alipay.mobile.security.zim.biz.RecordProcessor.KEY_VERIFY_REQUEST
            r7.record((java.lang.String) r8)
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.lang.String r0 = "module"
            java.lang.String r2 = "zim"
            r8.put(r0, r2)
            java.lang.String r0 = com.alipay.mobile.security.zim.biz.RecordProcessor.KEY_ZTECH_ENRTER
            r7.record((java.lang.String) r0, (java.util.Map<java.lang.String, java.lang.String>) r8)
            if (r5 == 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r1 = 0
        L_0x00b1:
            java.lang.String r7 = java.lang.Boolean.toString(r1)
            com.alipay.mobile.security.bio.api.BioParameter r8 = r3.mBioParameter
            java.lang.String r0 = "mock"
            r8.addExtProperty(r0, r7)
            if (r1 == 0) goto L_0x00c2
            r3.onInit(r5)
            return
        L_0x00c2:
            r3.performInitRequest(r4, r6, r7)
            return
        L_0x00c6:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x00c9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "ZIMCallback cant be null"
            r4.<init>(r5)
            throw r4
        L_0x00d1:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "zimId cant be null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.zim.biz.ZimPlatform.verify(java.lang.String, com.alipay.bis.common.service.facade.gw.zim.ZimInitGwResponse, java.util.Map, com.alipay.mobile.security.zim.msgchannel.ZimMessageChannel, com.alipay.mobile.security.zim.api.ZIMCallback):void");
    }

    /* access modifiers changed from: private */
    public void performInitRequest(String str, Map<String, String> map, String str2) {
        showLoadingDialog();
        ZimInitGwRequest zimInitGwRequest = new ZimInitGwRequest();
        zimInitGwRequest.zimId = str;
        zimInitGwRequest.metaInfo = getMetaInfos(this.mContext, (Map<String, Object>) null, false);
        if (map != null && map.containsKey(ZIMFacade.KEY_BIZ_DATA)) {
            zimInitGwRequest.bizData = map.get(ZIMFacade.KEY_BIZ_DATA);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("mock", str2);
        hashMap.put("payload", String.valueOf(((float) JSON.toJSONString(zimInitGwRequest).getBytes().length) / 1024.0f));
        RecordProcessor.getInstance().record(RecordProcessor.KEY_INITPROD_REQUEST, (Map<String, String>) hashMap);
        this.mBaseGWService.init(zimInitGwRequest);
    }

    public void init(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZIMCallback zIMCallback) {
        init(str, zimInitGwResponse, map, (ZimMessageChannel) null, zIMCallback);
    }

    public void init(String str, ZimInitGwResponse zimInitGwResponse, Map<String, String> map, ZimMessageChannel zimMessageChannel, ZIMCallback zIMCallback) {
        this.isInit = true;
        verify(str, zimInitGwResponse, map, zimMessageChannel, zIMCallback);
    }

    public void onResult(BioResponse bioResponse) {
        HashMap hashMap = new HashMap(2);
        StringBuilder sb = new StringBuilder("");
        sb.append(bioResponse.isSuccess());
        hashMap.put("result", sb.toString());
        StringBuilder sb2 = new StringBuilder("");
        sb2.append(bioResponse.getResultMessage());
        hashMap.put("message", sb2.toString());
        StringBuilder sb3 = new StringBuilder("");
        sb3.append(bioResponse.getResult());
        hashMap.put("retCode", sb3.toString());
        StringBuilder sb4 = new StringBuilder("");
        sb4.append(bioResponse.subCode);
        hashMap.put("subCode", sb4.toString());
        StringBuilder sb5 = new StringBuilder("");
        sb5.append(bioResponse.subMsg);
        hashMap.put(KEY_SUB_MSG, sb5.toString());
        RecordProcessor instance = RecordProcessor.getInstance();
        if (instance == null) {
            instance = RecordProcessor.createInstance(this.mContext);
        }
        instance.zimInit(this.mZimId);
        instance.record(RecordProcessor.KEY_AUTH_RESPONSE, (Map<String, String>) hashMap);
        boolean z = true;
        ZIMResponse zIMResponse = null;
        Map<String, String> ext = bioResponse.getExt();
        if (ext != null && !ext.isEmpty()) {
            if (ext.containsKey(BioDetector.EXT_KEY_UPLOAD_RESPONSE)) {
                BioUploadResult bioUploadResult = (BioUploadResult) JSON.parseObject(ext.remove(BioDetector.EXT_KEY_UPLOAD_RESPONSE), BioUploadResult.class);
                ZIMResponse zIMResponse2 = new ZIMResponse();
                zIMResponse2.code = bioUploadResult.validationRetCode;
                StringBuilder sb6 = new StringBuilder("");
                sb6.append(bioUploadResult.validationRetCode);
                zIMResponse2.reason = sb6.toString();
                zIMResponse2.subCode = bioUploadResult.subCode;
                zIMResponse2.msg = bioUploadResult.subMsg;
                if (bioUploadResult.extParams != null && !bioUploadResult.extParams.isEmpty()) {
                    zIMResponse2.extInfo.putAll(bioUploadResult.extParams);
                }
                if (!ext.isEmpty()) {
                    zIMResponse2.extInfo.putAll(ext);
                }
                zIMResponse = zIMResponse2;
            } else if (ext.containsKey(BioDetector.EXT_KEY_RETRY_UI_TYPE)) {
                retry(ext.get(BioDetector.EXT_KEY_RETRY_UI_TYPE));
                z = false;
            }
        }
        if (z) {
            int result = bioResponse.getResult();
            if (zIMResponse == null) {
                zIMResponse = new ZIMResponse();
                if (bioResponse.getResult() == 205) {
                    zIMResponse.code = 1003;
                } else if (bioResponse.getResult() == 301 || bioResponse.getResult() == 202 || bioResponse.getResult() == 210 || bioResponse.getResult() == 207) {
                    zIMResponse.code = 1003;
                } else if (bioResponse.getResult() == 200 || bioResponse.getResult() == 101 || bioResponse.getResult() == 100 || bioResponse.getResult() == 102) {
                    zIMResponse.code = 1003;
                    result = 100;
                } else if (bioResponse.getResult() == 203) {
                    zIMResponse.code = 1003;
                } else if (bioResponse.getResult() == 300 || bioResponse.getResult() == 208) {
                    zIMResponse.code = 1003;
                } else if (bioResponse.getResult() == 209) {
                    zIMResponse.code = 1005;
                } else if (bioResponse.getResult() == 3001) {
                    zIMResponse.code = 2006;
                } else {
                    zIMResponse.code = 1001;
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(bioResponse.getResult());
                zIMResponse.reason = sb7.toString();
                zIMResponse.subCode = bioResponse.subCode;
                zIMResponse.msg = bioResponse.subMsg;
            }
            recordVerifyResponse(zIMResponse);
            zIMResponse.extInfo.put(ZIMFacade.KEY_BIO_ACTION, String.valueOf(result));
            doCallZimCallback(zIMResponse);
        }
    }

    public void onInit(ZimInitGwResponse zimInitGwResponse) {
        Class<?> cls;
        try {
            if (this.mLoadingProgressDialog != null) {
                this.mLoadingProgressDialog.cancel();
            }
        } catch (Throwable unused) {
        }
        boolean z = false;
        if (zimInitGwResponse.retCode == 1001 || zimInitGwResponse.retCode == 200) {
            z = true;
        } else {
            if (!StringUtil.isNullorEmpty(zimInitGwResponse.zimId) && !zimInitGwResponse.zimId.equals(this.mZimId)) {
                this.mZimId = zimInitGwResponse.zimId;
            }
            if (zimInitGwResponse.extParams != null && !zimInitGwResponse.extParams.isEmpty()) {
                this.mFacePayInfo = zimInitGwResponse.extParams.get(ZIMFacade.KEY_FACE_PAY_INFO);
            }
            this.mBioParameter.setProtocol(zimInitGwResponse.protocol);
            Map<String, String> map = this.mParams;
            if (map != null && map.containsKey(ZIMFacade.KEY_AUTO_CLOSE)) {
                this.mBioParameter.setAutoClose(Boolean.parseBoolean(this.mParams.remove(ZIMFacade.KEY_AUTO_CLOSE)));
            }
            Map<String, String> extProperty = this.mBioParameter.getExtProperty();
            extProperty.put(BioDetector.EXT_KEY_VERIFYID, this.mZimId);
            extProperty.put("TOKEN_ID", this.mZimId);
            Map<String, String> map2 = this.mParams;
            if (map2 != null && !map2.isEmpty()) {
                extProperty.putAll(this.mParams);
            }
            RecordProcessor instance = RecordProcessor.getInstance();
            if (instance == null) {
                instance = RecordProcessor.createInstance(this.mContext);
            }
            instance.zimInit(this.mZimId);
            RecordProcessor.getInstance().record(RecordProcessor.KEY_AUTH_REQUEST);
            this.mBioParameter.isValidate = true;
            try {
                HashMap hashMap = new HashMap();
                if (this.mZimMessageChannel != null) {
                    hashMap.put(ZIMFacade.KEY_ZIM_MSG_CHANNEL, this.mZimMessageChannel);
                }
                if (this.mParams != null && !this.mParams.isEmpty()) {
                    if (this.mParams.containsKey(ZIMFacade.KEY_CERT_NAME)) {
                        hashMap.put(ZIMFacade.KEY_CERT_NAME, this.mParams.get(ZIMFacade.KEY_CERT_NAME));
                    }
                    if (this.mParams.containsKey(ZIMFacade.KEY_CERT_NO)) {
                        hashMap.put(ZIMFacade.KEY_CERT_NO, this.mParams.get(ZIMFacade.KEY_CERT_NO));
                    }
                }
                if (2 == Env.getProtocolFormat(this.mContext)) {
                    cls = Class.forName("com.alipay.mobile.security.bio.service.impl.BioUploadServiceCoreZhubPb");
                } else {
                    cls = Class.forName("com.alipay.mobile.security.bio.service.impl.BioUploadServiceCoreZhubJson");
                }
                String name = BioUploadServiceCore.class.getName();
                BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
                currentInstance.putBioService(name, cls);
                ((BioUploadServiceCoreZhub) currentInstance.getBioService(name)).setExtParams(this.mZimId, hashMap);
            } catch (Throwable unused2) {
            }
            if (zimInitGwResponse.retCode != 2002 || !showRetryDialog(zimInitGwResponse)) {
                auth(this.mBioParameter);
            } else {
                return;
            }
        }
        if (z) {
            ZIMResponse zIMResponse = new ZIMResponse();
            if (200 == zimInitGwResponse.retCode) {
                zIMResponse.code = 2006;
            } else {
                zIMResponse.code = zimInitGwResponse.retCode;
            }
            StringBuilder sb = new StringBuilder("");
            sb.append(zimInitGwResponse.retCode);
            zIMResponse.reason = sb.toString();
            zIMResponse.subCode = zimInitGwResponse.retCodeSub;
            zIMResponse.msg = zimInitGwResponse.retMessageSub;
            zIMResponse.extInfo.put(ZIMFacade.KEY_BIO_ACTION, "206");
            recordVerifyResponse(zIMResponse);
            doCallZimCallback(zIMResponse);
        }
    }

    private boolean showRetryDialog(final ZimInitGwResponse zimInitGwResponse) {
        Context context = this.mContext;
        if (context == null || !(context instanceof Activity)) {
            return false;
        }
        new DialogHelper((Activity) this.mContext).alert(this.mContext.getString(R.string.alert_network_error_title), this.mContext.getString(R.string.alert_network_error_msg), this.mContext.getString(R.string.btn_retry), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                ZimPlatform zimPlatform = ZimPlatform.this;
                zimPlatform.performInitRequest(zimPlatform.mZimId, ZimPlatform.this.mParams, "false");
            }
        }, this.mContext.getString(R.string.btn_exit), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                ZimPlatform zimPlatform = ZimPlatform.this;
                zimPlatform.auth(zimPlatform.mBioParameter);
                ZIMResponse zIMResponse = new ZIMResponse();
                if (200 == zimInitGwResponse.retCode) {
                    zIMResponse.code = 2006;
                } else {
                    zIMResponse.code = zimInitGwResponse.retCode;
                }
                StringBuilder sb = new StringBuilder("");
                sb.append(zimInitGwResponse.retCode);
                zIMResponse.reason = sb.toString();
                zIMResponse.subCode = zimInitGwResponse.retCodeSub;
                zIMResponse.msg = zimInitGwResponse.retMessageSub;
                zIMResponse.extInfo.put(ZIMFacade.KEY_BIO_ACTION, "206");
                ZimPlatform.this.recordVerifyResponse(zIMResponse);
                boolean unused = ZimPlatform.this.doCallZimCallback(zIMResponse);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    public void auth(BioParameter bioParameter) {
        for (String str : mCustomEnvs.keySet()) {
            bioParameter.getExtProperty().put(str, (String) mCustomEnvs.get(str));
        }
        try {
            if (!this.isInit) {
                this.mBioDetector.auth(bioParameter, this);
                return;
            }
            String init = this.mBioDetector.init(bioParameter, this);
            ZIMResponse zIMResponse = new ZIMResponse();
            if (!TextUtils.isEmpty(init)) {
                zIMResponse.code = 100;
                zIMResponse.singleTag = init;
            } else {
                zIMResponse.code = 200;
            }
            this.mZIMCallback.response(zIMResponse);
        } catch (Throwable th) {
            ZIMResponse zIMResponse2 = new ZIMResponse();
            zIMResponse2.code = 1001;
            zIMResponse2.reason = "".concat(String.valueOf(th));
            zIMResponse2.extInfo.put(ZIMFacade.KEY_BIO_ACTION, "206");
            zIMResponse2.subCode = ZcodeConstants.ZCODE_AUTH_BIO_ERROR;
            zIMResponse2.msg = ZcodeConstants.getMessage(zIMResponse2.subCode);
            recordVerifyResponse(zIMResponse2);
            doCallZimCallback(zIMResponse2);
        }
    }

    public void retry(String str) {
        command(4099);
        ((ZimRecordService) this.mBioServiceManager.getBioService(ZimRecordService.class)).retry();
        this.mBioParameter.addExtProperty(BioDetector.EXT_KEY_RETRY_UI_TYPE, str);
        auth(this.mBioParameter);
    }

    public void retry() {
        command(4099);
        ((ZimRecordService) this.mBioServiceManager.getBioService(ZimRecordService.class)).retry();
        auth(this.mBioParameter);
    }

    public boolean onFaceDetected(Map<String, String> map) {
        if (!(this.mZIMCallback instanceof ZimProgressCallback)) {
            return true;
        }
        if (!TextUtils.isEmpty(this.mFacePayInfo)) {
            map.put(ZIMFacade.KEY_FACE_PAY_INFO, this.mFacePayInfo);
        }
        ((ZimProgressCallback) this.mZIMCallback).onFaceDetected(map);
        return true;
    }

    /* access modifiers changed from: private */
    public boolean doCallZimCallback(ZIMResponse zIMResponse) {
        MonitorLogService monitorLogService;
        StringBuilder sb = new StringBuilder("doCallZimCallback(): zimResponse=");
        sb.append(zIMResponse);
        sb.append(", mZIMCallback=");
        sb.append(this.mZIMCallback);
        new RuntimeException(sb.toString());
        boolean response = this.mZIMCallback.response(zIMResponse);
        RecordProcessor instance = RecordProcessor.getInstance();
        if (instance != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("subCode", zIMResponse.subCode);
            instance.record(RecordProcessor.KEY_ZIM_EXIT, (Map<String, String>) hashMap);
        }
        BioServiceManager bioServiceManager = this.mBioServiceManager;
        if (!(bioServiceManager == null || (monitorLogService = (MonitorLogService) bioServiceManager.getBioService(MonitorLogService.class)) == null)) {
            monitorLogService.trigUpload();
        }
        if (response) {
            destroy();
        }
        return response;
    }

    public void destroy() {
        sIsBusy = false;
        RecordProcessor instance = RecordProcessor.getInstance();
        HashMap hashMap = new HashMap();
        hashMap.put("module", "zim");
        instance.record(RecordProcessor.KEY_ZTECH_EXIT, (Map<String, String>) hashMap);
        if (instance != null) {
            if (instance.destroyable()) {
                instance.destroy();
            } else {
                instance.clear();
            }
        }
        BioDetector bioDetector = this.mBioDetector;
        if (bioDetector != null) {
            bioDetector.destroy();
        }
        BaseGwService baseGwService = this.mBaseGWService;
        if (baseGwService != null) {
            baseGwService.destroy();
        }
        this.mContext = null;
        mH5Context = null;
        this.mBioServiceManager = null;
        this.mZimMessageChannel = null;
    }

    private void recordValidateResponse(ZimValidateGwResponse zimValidateGwResponse) {
        HashMap hashMap = new HashMap();
        if (zimValidateGwResponse != null) {
            int i = zimValidateGwResponse.validationRetCode;
            if (i == 100 || i == 1000) {
                hashMap.put("result", RESULT_TRUE);
            } else {
                hashMap.put("result", RESULT_FALSE);
            }
            hashMap.put("message", "");
            StringBuilder sb = new StringBuilder("");
            sb.append(zimValidateGwResponse.validationRetCode);
            hashMap.put("retCode", sb.toString());
            hashMap.put("subCode", zimValidateGwResponse.retCodeSub);
            hashMap.put(KEY_SUB_MSG, zimValidateGwResponse.retMessageSub);
        } else {
            hashMap.put("result", RESULT_FALSE);
            hashMap.put("message", "0");
            hashMap.put("retCode", "0");
            hashMap.put("subCode", "");
            hashMap.put(KEY_SUB_MSG, "");
        }
        RecordProcessor.getInstance().record(RecordProcessor.KEY_VALIDATE_RESPONSE, (Map<String, String>) hashMap);
    }

    /* access modifiers changed from: private */
    public void recordVerifyResponse(ZIMResponse zIMResponse) {
        HashMap hashMap = new HashMap(2);
        if (zIMResponse != null) {
            int i = zIMResponse.code;
            if (i == 100 || i == 1000) {
                hashMap.put("result", RESULT_TRUE);
            } else {
                hashMap.put("result", RESULT_FALSE);
            }
            StringBuilder sb = new StringBuilder("");
            sb.append(zIMResponse.reason);
            hashMap.put("message", sb.toString());
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(zIMResponse.code);
            hashMap.put("retCode", sb2.toString());
            hashMap.put("subCode", zIMResponse.subCode);
            hashMap.put(KEY_SUB_MSG, zIMResponse.msg);
        } else {
            hashMap.put("result", RESULT_FALSE);
            hashMap.put("message", "0");
            hashMap.put("retCode", "0");
            hashMap.put("subCode", "");
            hashMap.put(KEY_SUB_MSG, "");
        }
        RecordProcessor.getInstance().record(RecordProcessor.KEY_VERIFY_RESPONSE, (Map<String, String>) hashMap);
    }

    public void command(int i) {
        this.mBioDetector.command(i);
    }

    private void createLoadingDialog() {
        Context context = this.mContext;
        if (context != null && (context instanceof Activity) && !((Activity) context).isFinishing()) {
            ((Activity) this.mContext).runOnUiThread(new Runnable() {
                public void run() {
                    LoadingProgressDialog unused = ZimPlatform.this.mLoadingProgressDialog = new LoadingProgressDialog(ZimPlatform.this.mContext);
                    ZimPlatform.this.mLoadingProgressDialog.setContentView(R.layout.zim_layout_loading_dialog);
                }
            });
        }
    }

    private void showLoadingDialog() {
        Context context;
        LoadingProgressDialog loadingProgressDialog = this.mLoadingProgressDialog;
        if (loadingProgressDialog != null && !loadingProgressDialog.isShowing() && (context = this.mContext) != null && (context instanceof Activity)) {
            ((Activity) context).runOnUiThread(new Runnable() {
                public void run() {
                    if (ZimPlatform.this.mContext != null && !((Activity) ZimPlatform.this.mContext).isFinishing()) {
                        ZimPlatform.this.mLoadingProgressDialog.show();
                    }
                }
            });
        }
    }
}
