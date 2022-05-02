package com.alipay.mobile.security.bio.workspace;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioCallback;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.alipay.mobile.security.bio.api.BioParameter;
import com.alipay.mobile.security.bio.api.BioProgressCallback;
import com.alipay.mobile.security.bio.api.BioResponse;
import com.alipay.mobile.security.bio.common.statistics.RecordExtAction;
import com.alipay.mobile.security.bio.common.statistics.RecordExtService;
import com.alipay.mobile.security.bio.config.Constant;
import com.alipay.mobile.security.bio.constants.CodeConstants;
import com.alipay.mobile.security.bio.exception.BioIllegalArgumentException;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.service.BioAppDescription;
import com.alipay.mobile.security.bio.service.BioAppManager;
import com.alipay.mobile.security.bio.service.BioServiceManager;
import com.alipay.mobile.security.bio.service.BioUploadService;
import com.alipay.mobile.security.bio.service.local.rpc.BioRPCService;
import com.alipay.mobile.security.bio.utils.StringUtil;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import o.restorePresenterStates;

public class BioTransfer implements BioDetector {
    private static BioDetector sBusyBioDetector;
    private ArrayList<String> extKeyList = new ArrayList<>(Arrays.asList(new String[]{"userid", "apdid", "scene_id", "appid", "token_id", "usernamehidden", "abtest", BioDetector.EXT_KEY_VERIFYID}));
    int fcStep = 0;
    String fcToken = "";
    boolean isIDFaceFlag = false;
    private AuthBroadCastReceiver mAuthBroadCastReceiver;
    /* access modifiers changed from: private */
    public BioAppManager mBioAppManager;
    private MicroModule mBioMicroModule;
    private BioServiceManager mBioServiceManager;
    Context mContext;
    /* access modifiers changed from: private */
    public BioCallback mFcBioCallBack;
    JSONObject mFcSpecialData;
    BioParameter mIDFaceParam;
    private restorePresenterStates mLocalBroadcastManager;
    RecordExtService mRecordExtService;

    public BioTransfer(Context context, MicroModule microModule) {
        if (context != null) {
            String zimId = microModule == null ? null : microModule.getZimId();
            if (TextUtils.isEmpty(zimId)) {
                BioServiceManager.createInstance(context);
            } else {
                BioServiceManager.createInstance(context, zimId);
            }
            BioServiceManager currentInstance = BioServiceManager.getCurrentInstance();
            this.mBioServiceManager = currentInstance;
            this.mRecordExtService = (RecordExtService) currentInstance.getBioService(RecordExtService.class);
            this.mBioAppManager = (BioAppManager) this.mBioServiceManager.getBioService(BioAppManager.class);
            this.mLocalBroadcastManager = restorePresenterStates.length(context.getApplicationContext());
            AuthBroadCastReceiver authBroadCastReceiver = new AuthBroadCastReceiver();
            this.mAuthBroadCastReceiver = authBroadCastReceiver;
            this.mLocalBroadcastManager.setMax(authBroadCastReceiver, new IntentFilter(Constant.BIOLOGY_CALLBACK_ACTION));
            this.mLocalBroadcastManager.setMax(this.mAuthBroadCastReceiver, new IntentFilter(Constant.BIOLOGY_CALLBACK_PROGRESS_ACTION));
            this.mContext = context.getApplicationContext();
            this.mBioMicroModule = microModule;
            return;
        }
        throw new BioIllegalArgumentException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r3.mFcBioCallBack = r5;
        buildBioParameter(r4.getBundle(), r4);
        r0 = toBioAppDescription(r4);
        r5 = r3.mBioAppManager.put(r0, r5);
        r4 = r4.getRemoteURL();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        ((com.alipay.mobile.security.bio.service.local.rpc.BioRPCService) r3.mBioServiceManager.getBioService(com.alipay.mobile.security.bio.service.local.rpc.BioRPCService.class)).setRemoteUrl(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        ((com.alipay.mobile.security.bio.service.BioUploadService) r3.mBioServiceManager.getBioService(com.alipay.mobile.security.bio.service.BioUploadService.class)).clearUp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        if (com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r3.mBioServiceManager.startBioActivity(r0, r3.mBioMicroModule)) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        sendResponse(r5, 201, "app is not installed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void auth(com.alipay.mobile.security.bio.api.BioParameter r4, com.alipay.mobile.security.bio.api.BioCallback r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0089
            if (r5 == 0) goto L_0x0089
            java.lang.Class<com.alipay.mobile.security.bio.workspace.BioTransfer> r0 = com.alipay.mobile.security.bio.workspace.BioTransfer.class
            monitor-enter(r0)
            com.alipay.mobile.security.bio.api.BioDetector r1 = sBusyBioDetector     // Catch:{ all -> 0x0086 }
            if (r1 != 0) goto L_0x000e
            sBusyBioDetector = r3     // Catch:{ all -> 0x0086 }
            goto L_0x0038
        L_0x000e:
            com.alipay.mobile.security.bio.api.BioDetector r1 = sBusyBioDetector     // Catch:{ all -> 0x0086 }
            if (r3 == r1) goto L_0x0038
            com.alipay.mobile.security.bio.api.BioResponse r4 = new com.alipay.mobile.security.bio.api.BioResponse     // Catch:{ all -> 0x0086 }
            r4.<init>()     // Catch:{ all -> 0x0086 }
            r1 = 400(0x190, float:5.6E-43)
            r4.setResult(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "pre bio session is running."
            r4.subMsg = r1     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = ""
            r4.subCode = r1     // Catch:{ all -> 0x0086 }
            r5.onResult(r4)     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "pre bio session is running. callback="
            r4.<init>(r1)     // Catch:{ all -> 0x0086 }
            r4.append(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = ", return directly."
            r4.append(r5)     // Catch:{ all -> 0x0086 }
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return
        L_0x0038:
            monitor-exit(r0)
            r3.mFcBioCallBack = r5
            android.os.Bundle r0 = r4.getBundle()
            r3.buildBioParameter(r0, r4)
            com.alipay.mobile.security.bio.service.BioAppDescription r0 = r3.toBioAppDescription(r4)
            com.alipay.mobile.security.bio.service.BioAppManager r1 = r3.mBioAppManager
            java.lang.String r5 = r1.put(r0, r5)
            java.lang.String r4 = r4.getRemoteURL()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0063
            com.alipay.mobile.security.bio.service.BioServiceManager r1 = r3.mBioServiceManager
            java.lang.Class<com.alipay.mobile.security.bio.service.local.rpc.BioRPCService> r2 = com.alipay.mobile.security.bio.service.local.rpc.BioRPCService.class
            java.lang.Object r1 = r1.getBioService(r2)
            com.alipay.mobile.security.bio.service.local.rpc.BioRPCService r1 = (com.alipay.mobile.security.bio.service.local.rpc.BioRPCService) r1
            r1.setRemoteUrl(r4)
        L_0x0063:
            com.alipay.mobile.security.bio.service.BioServiceManager r4 = r3.mBioServiceManager
            java.lang.Class<com.alipay.mobile.security.bio.service.BioUploadService> r1 = com.alipay.mobile.security.bio.service.BioUploadService.class
            java.lang.Object r4 = r4.getBioService(r1)
            com.alipay.mobile.security.bio.service.BioUploadService r4 = (com.alipay.mobile.security.bio.service.BioUploadService) r4
            r4.clearUp()
            com.alipay.mobile.security.bio.service.BioServiceManager r4 = r3.mBioServiceManager
            com.alipay.mobile.security.bio.module.MicroModule r1 = r3.mBioMicroModule
            java.lang.String r4 = r4.startBioActivity(r0, r1)
            boolean r4 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r4)
            if (r4 == 0) goto L_0x0085
            r4 = 201(0xc9, float:2.82E-43)
            java.lang.String r0 = "app is not installed"
            r3.sendResponse(r5, r4, r0)
        L_0x0085:
            return
        L_0x0086:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        L_0x0089:
            com.alipay.mobile.security.bio.exception.BioIllegalArgumentException r4 = new com.alipay.mobile.security.bio.exception.BioIllegalArgumentException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.workspace.BioTransfer.auth(com.alipay.mobile.security.bio.api.BioParameter, com.alipay.mobile.security.bio.api.BioCallback):void");
    }

    public String init(BioParameter bioParameter, BioCallback bioCallback) {
        if (bioParameter == null || bioCallback == null) {
            throw new BioIllegalArgumentException();
        }
        synchronized (BioTransfer.class) {
            if (sBusyBioDetector == null) {
                sBusyBioDetector = this;
            } else if (this != sBusyBioDetector) {
                BioResponse bioResponse = new BioResponse();
                bioResponse.setResult(400);
                bioResponse.subMsg = "pre bio session is running.";
                bioResponse.subCode = "";
                bioCallback.onResult(bioResponse);
                StringBuilder sb = new StringBuilder("pre bio session is running. callback=");
                sb.append(bioCallback);
                sb.append(", return directly.");
            }
        }
        buildBioParameter(bioParameter.getBundle(), bioParameter);
        String put = this.mBioAppManager.put(toBioAppDescription(bioParameter), bioCallback);
        String remoteURL = bioParameter.getRemoteURL();
        if (!TextUtils.isEmpty(remoteURL)) {
            ((BioRPCService) this.mBioServiceManager.getBioService(BioRPCService.class)).setRemoteUrl(remoteURL);
        }
        ((BioUploadService) this.mBioServiceManager.getBioService(BioUploadService.class)).clearUp();
        return put;
    }

    private BioAppDescription toBioAppDescription(BioParameter bioParameter) {
        int protocolFormat = Env.getProtocolFormat(this.mContext);
        bioParameter.addExtProperty("meta_serializer", String.valueOf(protocolFormat));
        try {
            Constructor<?> constructor = Class.forName(bioParameter.isValidate ? protocolFormat != 2 ? "com.alipay.mobile.security.bio.workspace.JsonToBioApp" : "com.alipay.mobile.security.bio.workspace.PbToBioApp" : protocolFormat != 2 ? "com.alipay.mobile.security.bio.workspace.JsonBioParameterToBioApp" : "com.alipay.mobile.security.bio.workspace.PbBioParameterToBioApp").getConstructor(new Class[]{Context.class, BioTransfer.class});
            constructor.setAccessible(true);
            return ((BaseBioParameterToBioApp) constructor.newInstance(new Object[]{this.mContext, this})).toBioApp(bioParameter);
        } catch (Throwable unused) {
            return null;
        }
    }

    private BioParameter buildBioParameter(Bundle bundle, BioParameter bioParameter) {
        Bundle bundle2 = bundle;
        BioParameter bioParameter2 = bioParameter;
        if (bundle2 == null && bioParameter2 == null) {
            throw new BioIllegalArgumentException("paramter is null");
        } else if (bundle2 == null) {
            return bioParameter2;
        } else {
            String string = bundle2.getString(BioDetector.EXT_KEY_MODULE_DATA_BUNDLE);
            if (TextUtils.isEmpty(string)) {
                return bioParameter2;
            }
            JSONObject parseObject = JSONObject.parseObject(string);
            String string2 = parseObject.getString("sceneId");
            String string3 = parseObject.getString("USER_ID");
            String string4 = parseObject.getString(BioDetector.EXT_KEY_BISCFG_BUNDLE);
            String string5 = bundle2.getString("TOKEN_ID");
            String string6 = bundle2.getString("APDID");
            String string7 = bundle2.getString(BioDetector.EXT_KEY_VERIFYID);
            String string8 = parseObject.getString("appid");
            String string9 = parseObject.getString("HAS_OTHERS");
            bioParameter2.setHeadImageUrl(bundle2 != null ? bundle2.getString("headurl") : null);
            if (!StringUtil.isNullorEmpty(string4)) {
                bioParameter2.setProtocol(string4);
            }
            String str = "";
            if (TextUtils.isEmpty(string7)) {
                string7 = str;
            }
            bioParameter2.addExtProperty(BioDetector.EXT_KEY_VERIFYID, string7);
            if (TextUtils.isEmpty(string6)) {
                string6 = str;
            }
            bioParameter2.addExtProperty("APDID", string6);
            if (TextUtils.isEmpty(string2)) {
                string2 = str;
            }
            bioParameter2.addExtProperty("SCENE_ID", string2);
            if (TextUtils.isEmpty(string5)) {
                string5 = str;
            }
            bioParameter2.addExtProperty("TOKEN_ID", string5);
            if (TextUtils.isEmpty(string3)) {
                string3 = str;
            }
            bioParameter2.addExtProperty("userid", string3);
            if (TextUtils.isEmpty(string8)) {
                string8 = str;
            }
            bioParameter2.addExtProperty("appid", string8);
            if (TextUtils.isEmpty(string9)) {
                string9 = "false";
            }
            bioParameter2.addExtProperty("HAS_OTHERS", string9);
            if (bundle2.containsKey("RequestPage")) {
                String valueOf = String.valueOf(bundle2.getInt("RequestPage"));
                if (TextUtils.isEmpty(valueOf)) {
                    valueOf = str;
                }
                bioParameter2.addExtProperty("pageNum", valueOf);
            }
            if (bundle2.containsKey("RequestCardType")) {
                String string10 = bundle2.getString("RequestCardType");
                if (TextUtils.isEmpty(string10)) {
                    string10 = str;
                }
                bioParameter2.addExtProperty(BioDetector.EXT_KEY_CARD_TYPE, string10);
            }
            if (bundle2.containsKey("RequestTotalPagesNum")) {
                String valueOf2 = String.valueOf(bundle2.getInt("RequestTotalPagesNum"));
                if (!TextUtils.isEmpty(valueOf2)) {
                    str = valueOf2;
                }
                bioParameter2.addExtProperty(BioDetector.EXT_KEY_TOTAL_PAGE_NUM, str);
            }
            return bioParameter2;
        }
    }

    public void sendResponse(String str, int i, String str2) {
        Intent intent = new Intent(Constant.BIOLOGY_CALLBACK_ACTION);
        BioResponse bioResponse = new BioResponse();
        bioResponse.setSuccess(false);
        bioResponse.setResult(i);
        if (i == 201) {
            bioResponse.subCode = CodeConstants.INVALID_ARGUMENT;
            bioResponse.subMsg = CodeConstants.getMessage(bioResponse.subCode);
        }
        bioResponse.setResultMessage(str2);
        bioResponse.setTag(str);
        Bundle bundle = new Bundle();
        bundle.putString(Constant.BIOLOGY_INTENT_ACTION_REV, JSON.toJSONString(bioResponse));
        intent.putExtras(bundle);
        new RuntimeException("".concat(String.valueOf(bioResponse)));
        this.mLocalBroadcastManager.setMin(intent);
    }

    public void destroy() {
        this.mBioAppManager = null;
        this.mFcBioCallBack = null;
        restorePresenterStates restorepresenterstates = this.mLocalBroadcastManager;
        if (restorepresenterstates != null) {
            restorepresenterstates.setMax(this.mAuthBroadCastReceiver);
        }
        BioServiceManager.destroyInstance();
        sBusyBioDetector = null;
    }

    public class AuthBroadCastReceiver extends BroadcastReceiver {
        public AuthBroadCastReceiver() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            String stringExtra = intent.getStringExtra(Constant.BIOLOGY_INTENT_ACTION_REV);
            if (TextUtils.isEmpty(stringExtra)) {
                new RuntimeException("why the AuthBroadCastReceiver.rev is empty?");
                return;
            }
            BioResponse bioResponse = null;
            try {
                bioResponse = (BioResponse) JSON.parseObject(stringExtra, BioResponse.class);
            } catch (Throwable unused) {
            }
            if (bioResponse == null) {
                StringBuilder sb = new StringBuilder("Failed to parse {");
                sb.append(stringExtra);
                sb.append("} to com.alipay.mobile.security.bio.api.BioResponse");
                new RuntimeException(sb.toString());
                return;
            }
            String tag = bioResponse.getTag();
            if (BioTransfer.this.mBioAppManager == null) {
                new RuntimeException("BioAppManager in receiver is null");
                return;
            }
            BioCallback bioCallback = BioTransfer.this.mBioAppManager.getBioCallback(tag);
            if (!TextUtils.equals(Constant.BIOLOGY_CALLBACK_PROGRESS_ACTION, action)) {
                if (bioCallback == null) {
                    try {
                        if (!BioTransfer.this.isIDFaceFlag) {
                            return;
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                }
                Map ext = bioResponse.getExt();
                if (ext == null || !"face".equals(ext.get("fc"))) {
                    if (BioTransfer.this.isIDFaceFlag) {
                        bioResponse.setToken(BioTransfer.this.fcToken);
                        HashMap hashMap = new HashMap();
                        hashMap.put("fcToken", BioTransfer.this.fcToken);
                        if (BioTransfer.this.fcStep == 1) {
                            BioTransfer.this.mRecordExtService.write(RecordExtAction.RECORD_FC_FACE_CALL_BACK_BIS_SYSTEM, hashMap);
                        }
                        hashMap.put("param", bioResponse.toString());
                        BioTransfer.this.mRecordExtService.write(RecordExtAction.RECORD_FC_CALL_BACK_VERITY_SYSTEM, hashMap);
                    }
                    if (BioTransfer.this.isIDFaceFlag) {
                        HashMap hashMap2 = new HashMap();
                        hashMap2.put("fcToken", BioTransfer.this.fcToken);
                        BioTransfer.this.mRecordExtService.write(RecordExtAction.RECORD_FC_EXIT_SDK, hashMap2);
                    }
                    int bioAction = BioTransfer.this.mBioAppManager.getBioAppDescription(tag).getBioAction() - 1000;
                    if (992 == bioAction || 993 == bioAction) {
                        if (ext == null) {
                            ext = new HashMap();
                            bioResponse.setExt(ext);
                        }
                        ext.put(BioDetector.EXT_KEY_UI, String.valueOf(bioAction));
                    }
                    bioCallback.onResult(bioResponse);
                    return;
                }
                BioTransfer.this.fcStep = 1;
                BioTransfer.this.auth(BioTransfer.this.mIDFaceParam, BioTransfer.this.mFcBioCallBack);
            } else if (bioCallback == null) {
                new RuntimeException("Failed to getBioCallback() by ".concat(String.valueOf(tag)));
            } else if (bioCallback instanceof BioProgressCallback) {
                ((BioProgressCallback) bioCallback).onFaceDetected(bioResponse.getExt());
            } else {
                StringBuilder sb2 = new StringBuilder("biologyCallback=");
                sb2.append(bioCallback);
                sb2.append(", has no method: onFaceDetected(Map<String, String>)");
            }
        }
    }

    public int preLoad() {
        return this.mBioServiceManager.preLoad();
    }

    public void command(int i) {
        String str;
        if (i == 8193) {
            str = Constant.BIOLOGY_FLAG_SERVER_FAIL;
        } else if (i != 8194) {
            switch (i) {
                case 4097:
                    str = Constant.BIOLOGY_FLAG_SERVER_SUCCESS;
                    break;
                case 4098:
                    str = Constant.BIOLOGY_FLAG_SERVER_CONTINUE;
                    break;
                case 4099:
                    str = Constant.BIOLOGY_FLAG_AUTOCLOSE;
                    break;
                default:
                    str = "";
                    break;
            }
        } else {
            str = Constant.BIOLOGY_FLAG_SERVER_RETRY;
        }
        if (!StringUtil.isNullorEmpty(str)) {
            this.mLocalBroadcastManager.setMin(new Intent(str));
        }
    }
}
