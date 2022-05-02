package com.alibaba.ariver.permission.extension.auth;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppContext;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.LangResourceUtil;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.R;
import com.alibaba.ariver.permission.api.OnGetAuthListener;
import com.alibaba.ariver.permission.api.RVFlag;
import com.alibaba.ariver.permission.api.proxy.AuthDialogProxy;
import com.alibaba.ariver.permission.api.proxy.H5OpenAuthProxy;
import com.alibaba.ariver.permission.model.AuthProtocol;
import com.alibaba.ariver.permission.openauth.model.result.AuthAgreementModel;
import com.alibaba.ariver.permission.openauth.model.result.AuthSkipResultModel;
import com.alibaba.ariver.permission.openauth.model.result.H5AuthParamsModel;
import com.alibaba.ariver.permission.view.IOpenAuthDialog;
import com.alibaba.ariver.permission.view.IOpenAuthNoticeDialog;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.wallet.acl.oauth.OAuthService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import o.onActivityPreCreated;

public class RVOpenAuthHelper {
    public static final String ERROR_CODE_CANCEL = "11";
    public static final String PLATFORM_AP = "AP";
    public static final String PLATFORM_TB = "TB";

    /* renamed from: a  reason: collision with root package name */
    private static boolean f10120a = false;
    private static int getMax = 1;
    private static int length;
    private static long setMax;
    private OnGetAuthListener b;
    private BridgeCallback c;
    private String d;
    private List<String> e;
    private Context f;
    private App g;

    static void getMax() {
        setMax = 8355656919243812965L;
    }

    static /* synthetic */ void access$000(RVOpenAuthHelper rVOpenAuthHelper, Page page, String str, String str2, String str3, byte[] bArr, boolean z) {
        try {
            int i = getMax + 99;
            length = i % 128;
            int i2 = i % 2;
            rVOpenAuthHelper.a(page, str, str2, str3, bArr, z);
            int i3 = getMax + 71;
            length = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                super.hashCode();
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static /* synthetic */ BridgeCallback access$100(RVOpenAuthHelper rVOpenAuthHelper) {
        BridgeCallback bridgeCallback;
        try {
            int i = getMax + 79;
            length = i % 128;
            if (i % 2 != 0) {
                bridgeCallback = rVOpenAuthHelper.c;
                Object[] objArr = null;
                int length2 = objArr.length;
            } else {
                try {
                    bridgeCallback = rVOpenAuthHelper.c;
                } catch (Exception e2) {
                    throw e2;
                }
            }
            int i2 = length + 31;
            getMax = i2 % 128;
            int i3 = i2 % 2;
            return bridgeCallback;
        } catch (Exception e3) {
            throw e3;
        }
    }

    static /* synthetic */ void access$1200(RVOpenAuthHelper rVOpenAuthHelper, String str, App app, Page page, String str2, String str3, List list, boolean z, String str4, Map map, Map map2) {
        try {
            int i = length + 39;
            getMax = i % 128;
            boolean z2 = i % 2 == 0;
            rVOpenAuthHelper.a(str, app, page, str2, str3, list, z, str4, map, map2);
            if (z2) {
                int i2 = 71 / 0;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static /* synthetic */ void access$1400(RVOpenAuthHelper rVOpenAuthHelper, App app, Page page, AuthSkipResultModel authSkipResultModel, String str, String str2, String str3, List list, boolean z, String str4, Map map, Map map2) {
        int i = length + 25;
        getMax = i % 128;
        int i2 = i % 2;
        rVOpenAuthHelper.a(app, page, authSkipResultModel, str, str2, str3, list, z, str4, map, map2);
        try {
            int i3 = getMax + 89;
            length = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e2) {
            throw e2;
        }
    }

    static {
        getMax();
        int i = getMax + 53;
        length = i % 128;
        int i2 = i % 2;
    }

    public RVOpenAuthHelper(Context context, App app, BridgeCallback bridgeCallback, String str) {
        this.f = context;
        this.g = app;
        this.c = bridgeCallback;
        this.d = str;
    }

    public RVOpenAuthHelper(Context context, App app, BridgeCallback bridgeCallback, String str, OnGetAuthListener onGetAuthListener) {
        this.f = context;
        this.g = app;
        this.c = bridgeCallback;
        this.d = str;
        this.b = onGetAuthListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01f9, code lost:
        r4.put("accessToken", (java.lang.Object) r5.getAuthExecuteResult().getExtInfo().get("accessToken"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x020c, code lost:
        if (r14.c == null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020e, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0210, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0212, code lost:
        if (r0 == true) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0215, code lost:
        if (r9 == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0217, code lost:
        r6 = '-';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x021a, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x021b, code lost:
        if (r6 == 0) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x021d, code lost:
        r0 = length + 29;
        getMax = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x022d, code lost:
        if (r9.contains(com.alipay.iap.android.wallet.acl.oauth.OAuthService.SCOPE_AUTH_USER) == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x022f, code lost:
        com.alibaba.ariver.permission.api.RVFlag.setOpenAuthGrantFlag(r14.d, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0235, code lost:
        sendResult(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0238, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0239, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x023a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0077, code lost:
        if ((r3 != null ? 'P' : '%') != '%') goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        if ((r5.getSuccess() != null) != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e2, code lost:
        if (r3 == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f0, code lost:
        if (r5.getCanSkipAuth().booleanValue() == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
        if ((r5.getShowType().equalsIgnoreCase("CALLBACK") ? '!' : 20) != 20) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("AriverPermission:RVOpenAuthHelper", "getAuthContentOrAutoAuth rpc canSkipAuth");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0119, code lost:
        if (r5.getAuthExecuteResult() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x011b, code lost:
        r3 = r5.getAuthExecuteResult().getAuthCode();
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("AriverPermission:RVOpenAuthHelper", "getAuthContentOrAutoAuth rpc authCode is ".concat(java.lang.String.valueOf(r3)));
        r4 = new com.alibaba.fastjson.JSONObject();
        r4.put("authCode", (java.lang.Object) r3);
        r4.put("authcode", (java.lang.Object) r3);
        r3 = new com.alibaba.fastjson.JSONArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0148, code lost:
        if (r5.getAuthExecuteResult() == null) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0156, code lost:
        if (com.alibaba.ariver.kernel.common.utils.CollectionUtils.isEmpty((java.util.List) r5.getAuthExecuteResult().getSuccessScopes()) != false) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0158, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015a, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        if (r6 == true) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015e, code lost:
        r6 = getMax + 97;
        length = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r6 = r5.getAuthExecuteResult().getSuccessScopes().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0178, code lost:
        if (r6.hasNext() == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017a, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017c, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017e, code lost:
        if (r7 == true) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0181, code lost:
        r3.add(r6.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x018b, code lost:
        r4.put("authSuccessScopes", (java.lang.Object) r3);
        r3 = new com.alibaba.fastjson.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0199, code lost:
        if (r5.getAuthExecuteResult() == null) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x019b, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x019d, code lost:
        r6 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x019f, code lost:
        if (r6 == 0) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r6 = length + 57;
        getMax = r6 % 128;
        r6 = r6 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01b8, code lost:
        if (com.alibaba.ariver.kernel.common.utils.CollectionUtils.isEmpty((java.util.Map) r5.getAuthExecuteResult().getErrorScopes()) != false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01ba, code lost:
        r6 = r5.getAuthExecuteResult().getErrorScopes().entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ce, code lost:
        if (r6.hasNext() == false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01d0, code lost:
        r7 = r6.next();
        r3.put((java.lang.String) r7.getKey(), r7.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01e4, code lost:
        r4.put("authErrorScopes", (java.lang.Object) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ed, code lost:
        if (PLATFORM_TB.equals(r0) == false) goto L_0x020a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01f7, code lost:
        if (r5.getAuthExecuteResult().getExtInfo() == null) goto L_0x020a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void getAuthContentOrAutoAuth(java.lang.String r18, @androidx.annotation.Nullable com.alibaba.ariver.app.api.Page r19, java.lang.String r20, java.lang.String r21, java.util.List<java.lang.String> r22, java.lang.String r23, java.util.Map<java.lang.String, java.lang.String> r24, boolean r25, java.util.Map<java.lang.String, java.lang.String> r26, android.os.Bundle r27) {
        /*
            r17 = this;
            r14 = r17
            r0 = r18
            r15 = r19
            r9 = r22
            java.lang.String r1 = "accessToken"
            java.lang.String r2 = "TB"
            java.lang.String r13 = "AriverPermission:RVOpenAuthHelper"
            com.alibaba.ariver.permission.openauth.model.request.AuthSkipRequestModel r3 = new com.alibaba.ariver.permission.openauth.model.request.AuthSkipRequestModel
            r3.<init>()
            r7 = r20
            r3.setAppId(r7)
            r8 = r21
            r3.setCurrentPageUrl(r8)
            java.lang.String r4 = "mobilegw_android"
            r3.setFromSystem(r4)
            r3.setScopeNicks(r9)
            java.lang.String r4 = "QnJpbmcgc21hbGwgYW5kIGJlYXV0aWZ1bCBjaGFuZ2VzIHRvIHRoZSB3b3JsZA=="
            r3.setState(r4)
            r11 = r23
            r3.setIsvAppId(r11)
            r12 = r24
            r3.setExtInfo(r12)
            r10 = r26
            r3.setAppExtInfo(r10)
            r14.e = r9
            boolean r4 = android.text.TextUtils.equals(r2, r0)     // Catch:{ Exception -> 0x02bf }
            if (r4 == 0) goto L_0x0049
            com.alibaba.ariver.app.api.App r4 = r14.g     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.permission.openauth.model.result.AuthSkipResultModel r3 = com.alibaba.ariver.permission.extension.auth.a.a(r0, r4, r3)     // Catch:{ Exception -> 0x02bf }
        L_0x0047:
            r5 = r3
            goto L_0x0058
        L_0x0049:
            java.lang.Class<com.alibaba.ariver.permission.api.proxy.Oauth2AuthCodeService> r4 = com.alibaba.ariver.permission.api.proxy.Oauth2AuthCodeService.class
            java.lang.Object r4 = com.alibaba.ariver.kernel.common.RVProxy.get(r4)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.permission.api.proxy.Oauth2AuthCodeService r4 = (com.alibaba.ariver.permission.api.proxy.Oauth2AuthCodeService) r4     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.app.api.App r5 = r14.g     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.permission.openauth.model.result.AuthSkipResultModel r3 = r4.getAuthSkipResult(r0, r5, r3)     // Catch:{ Exception -> 0x02bf }
            goto L_0x0047
        L_0x0058:
            if (r5 == 0) goto L_0x02be
            int r3 = getMax
            int r3 = r3 + 73
            int r4 = r3 % 128
            length = r4
            int r3 = r3 % 2
            r4 = 0
            if (r3 == 0) goto L_0x007d
            java.lang.Boolean r3 = r5.getSuccess()     // Catch:{ Exception -> 0x02bf }
            super.hashCode()     // Catch:{ all -> 0x007a }
            r6 = 37
            if (r3 == 0) goto L_0x0075
            r3 = 80
            goto L_0x0077
        L_0x0075:
            r3 = 37
        L_0x0077:
            if (r3 == r6) goto L_0x00c5
            goto L_0x0088
        L_0x007a:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x007d:
            java.lang.Boolean r3 = r5.getSuccess()     // Catch:{ Exception -> 0x02bf }
            if (r3 == 0) goto L_0x0085
            r3 = 1
            goto L_0x0086
        L_0x0085:
            r3 = 0
        L_0x0086:
            if (r3 == 0) goto L_0x00c5
        L_0x0088:
            java.lang.Boolean r3 = r5.getSuccess()     // Catch:{ Exception -> 0x02bf }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x02bf }
            if (r3 != 0) goto L_0x00c5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02bf }
            java.lang.String r2 = "getAuthContentOrAutoAuth rpc !isSuccess"
            r1.<init>(r2)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r2 = r5.getErrorCode()     // Catch:{ Exception -> 0x02bf }
            r1.append(r2)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r2 = r5.getErrorMsg()     // Catch:{ Exception -> 0x02bf }
            r1.append(r2)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r1)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper$1 r7 = new com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper$1     // Catch:{ Exception -> 0x02bf }
            r1 = r7
            r2 = r17
            r3 = r19
            r4 = r18
            r6 = r25
            r1.<init>(r3, r4, r5, r6)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.runOnMain(r7)     // Catch:{ Exception -> 0x02bf }
            return
        L_0x00c5:
            java.lang.Boolean r3 = r5.getCanSkipAuth()     // Catch:{ Exception -> 0x02bf }
            if (r3 == 0) goto L_0x00f5
            int r3 = getMax     // Catch:{ Exception -> 0x00f3 }
            int r3 = r3 + 53
            int r6 = r3 % 128
            length = r6     // Catch:{ Exception -> 0x00f3 }
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x00e8
            java.lang.Boolean r3 = r5.getCanSkipAuth()     // Catch:{ Exception -> 0x02bf }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x02bf }
            super.hashCode()     // Catch:{ all -> 0x00e5 }
            if (r3 != 0) goto L_0x0110
            goto L_0x00f5
        L_0x00e5:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00e8:
            java.lang.Boolean r3 = r5.getCanSkipAuth()     // Catch:{ Exception -> 0x02bf }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x02bf }
            if (r3 != 0) goto L_0x0110
            goto L_0x00f5
        L_0x00f3:
            r0 = move-exception
            throw r0
        L_0x00f5:
            java.lang.String r3 = r5.getShowType()     // Catch:{ Exception -> 0x02bf }
            if (r3 == 0) goto L_0x023b
            java.lang.String r3 = r5.getShowType()     // Catch:{ Exception -> 0x02bf }
            java.lang.String r4 = "CALLBACK"
            boolean r3 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x02bf }
            r4 = 20
            if (r3 == 0) goto L_0x010c
            r3 = 33
            goto L_0x010e
        L_0x010c:
            r3 = 20
        L_0x010e:
            if (r3 == r4) goto L_0x023b
        L_0x0110:
            java.lang.String r3 = "getAuthContentOrAutoAuth rpc canSkipAuth"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r3)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r3 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            if (r3 == 0) goto L_0x02be
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r3 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            java.lang.String r3 = r3.getAuthCode()     // Catch:{ Exception -> 0x02bf }
            java.lang.String r4 = "getAuthContentOrAutoAuth rpc authCode is "
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r4 = r4.concat(r6)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r4)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x02bf }
            r4.<init>()     // Catch:{ Exception -> 0x02bf }
            java.lang.String r6 = "authCode"
            r4.put((java.lang.String) r6, (java.lang.Object) r3)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r6 = "authcode"
            r4.put((java.lang.String) r6, (java.lang.Object) r3)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.fastjson.JSONArray r3 = new com.alibaba.fastjson.JSONArray     // Catch:{ Exception -> 0x02bf }
            r3.<init>()     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r6 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            if (r6 == 0) goto L_0x018b
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r6 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            java.util.List r6 = r6.getSuccessScopes()     // Catch:{ Exception -> 0x02bf }
            boolean r6 = com.alibaba.ariver.kernel.common.utils.CollectionUtils.isEmpty((java.util.List) r6)     // Catch:{ Exception -> 0x02bf }
            if (r6 != 0) goto L_0x015a
            r6 = 0
            goto L_0x015b
        L_0x015a:
            r6 = 1
        L_0x015b:
            r7 = 1
            if (r6 == r7) goto L_0x018b
            int r6 = getMax
            int r6 = r6 + 97
            int r7 = r6 % 128
            length = r7
            int r6 = r6 % 2
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r6 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            java.util.List r6 = r6.getSuccessScopes()     // Catch:{ Exception -> 0x02bf }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x02bf }
        L_0x0174:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x02bf }
            if (r7 == 0) goto L_0x017c
            r7 = 1
            goto L_0x017d
        L_0x017c:
            r7 = 0
        L_0x017d:
            r8 = 1
            if (r7 == r8) goto L_0x0181
            goto L_0x018b
        L_0x0181:
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x02bf }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x02bf }
            r3.add(r7)     // Catch:{ Exception -> 0x02bf }
            goto L_0x0174
        L_0x018b:
            java.lang.String r6 = "authSuccessScopes"
            r4.put((java.lang.String) r6, (java.lang.Object) r3)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.fastjson.JSONObject r3 = new com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x02bf }
            r3.<init>()     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r6 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            if (r6 == 0) goto L_0x019d
            r6 = 0
            goto L_0x019f
        L_0x019d:
            r6 = 12
        L_0x019f:
            if (r6 == 0) goto L_0x01a2
            goto L_0x01e4
        L_0x01a2:
            int r6 = length     // Catch:{ Exception -> 0x0239 }
            int r6 = r6 + 57
            int r7 = r6 % 128
            getMax = r7     // Catch:{ Exception -> 0x0239 }
            int r6 = r6 % 2
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r6 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            java.util.Map r6 = r6.getErrorScopes()     // Catch:{ Exception -> 0x02bf }
            boolean r6 = com.alibaba.ariver.kernel.common.utils.CollectionUtils.isEmpty((java.util.Map) r6)     // Catch:{ Exception -> 0x02bf }
            if (r6 != 0) goto L_0x01e4
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r6 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            java.util.Map r6 = r6.getErrorScopes()     // Catch:{ Exception -> 0x02bf }
            java.util.Set r6 = r6.entrySet()     // Catch:{ Exception -> 0x02bf }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x02bf }
        L_0x01ca:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x02bf }
            if (r7 == 0) goto L_0x01e4
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x02bf }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x02bf }
            java.lang.Object r8 = r7.getKey()     // Catch:{ Exception -> 0x02bf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x02bf }
            java.lang.Object r7 = r7.getValue()     // Catch:{ Exception -> 0x02bf }
            r3.put((java.lang.String) r8, (java.lang.Object) r7)     // Catch:{ Exception -> 0x02bf }
            goto L_0x01ca
        L_0x01e4:
            java.lang.String r6 = "authErrorScopes"
            r4.put((java.lang.String) r6, (java.lang.Object) r3)     // Catch:{ Exception -> 0x02bf }
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x02bf }
            if (r0 == 0) goto L_0x020a
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r0 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            java.util.Map r0 = r0.getExtInfo()     // Catch:{ Exception -> 0x02bf }
            if (r0 == 0) goto L_0x020a
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r0 = r5.getAuthExecuteResult()     // Catch:{ Exception -> 0x02bf }
            java.util.Map r0 = r0.getExtInfo()     // Catch:{ Exception -> 0x02bf }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x02bf }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x02bf }
            r4.put((java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ Exception -> 0x02bf }
        L_0x020a:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r14.c     // Catch:{ Exception -> 0x02bf }
            if (r0 == 0) goto L_0x0210
            r0 = 1
            goto L_0x0211
        L_0x0210:
            r0 = 0
        L_0x0211:
            r1 = 1
            if (r0 == r1) goto L_0x0215
            goto L_0x0235
        L_0x0215:
            if (r9 == 0) goto L_0x021a
            r6 = 45
            goto L_0x021b
        L_0x021a:
            r6 = 0
        L_0x021b:
            if (r6 == 0) goto L_0x0235
            int r0 = length
            int r0 = r0 + 29
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            java.lang.String r0 = "auth_user"
            boolean r0 = r9.contains(r0)     // Catch:{ Exception -> 0x02bf }
            if (r0 == 0) goto L_0x0235
            java.lang.String r0 = r14.d     // Catch:{ Exception -> 0x02bf }
            r1 = 1
            com.alibaba.ariver.permission.api.RVFlag.setOpenAuthGrantFlag(r0, r1)     // Catch:{ Exception -> 0x02bf }
        L_0x0235:
            r14.sendResult(r15, r4)     // Catch:{ Exception -> 0x02bf }
            return
        L_0x0239:
            r0 = move-exception
            throw r0
        L_0x023b:
            java.lang.String r1 = "getAuthContentOrAutoAuth rpc !canSkipAuth"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r1)     // Catch:{ Exception -> 0x02bf }
            java.lang.Class<com.alibaba.ariver.permission.api.proxy.H5OpenAuthProxy> r1 = com.alibaba.ariver.permission.api.proxy.H5OpenAuthProxy.class
            java.lang.Object r1 = com.alibaba.ariver.kernel.common.RVProxy.get(r1)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.permission.api.proxy.H5OpenAuthProxy r1 = (com.alibaba.ariver.permission.api.proxy.H5OpenAuthProxy) r1     // Catch:{ Exception -> 0x02bf }
            java.lang.String r2 = r5.getShowType()     // Catch:{ Exception -> 0x02bf }
            if (r2 == 0) goto L_0x0251
            r2 = 1
            r6 = 1
            goto L_0x0253
        L_0x0251:
            r2 = 1
            r6 = 0
        L_0x0253:
            if (r6 == r2) goto L_0x0256
            goto L_0x028f
        L_0x0256:
            java.lang.String r2 = r5.getShowType()     // Catch:{ Exception -> 0x02bf }
            java.lang.String r3 = "H5"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch:{ Exception -> 0x02bf }
            if (r2 == 0) goto L_0x028f
            if (r1 == 0) goto L_0x028f
            int r0 = length
            int r0 = r0 + 111
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            com.alibaba.ariver.permission.openauth.model.result.H5AuthParamsModel r0 = r5.getH5AuthParams()     // Catch:{ Exception -> 0x02bf }
            r2 = r27
            r14.a(r1, r15, r0, r2)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.app.api.App r0 = r14.g     // Catch:{ Exception -> 0x02bf }
            if (r0 == 0) goto L_0x02be
            com.alibaba.ariver.app.api.App r0 = r14.g     // Catch:{ Exception -> 0x02bf }
            java.lang.String r1 = "lastCalledJsApi"
            java.lang.String r2 = "getAuthCode"
            r0.putStringValue(r1, r2)     // Catch:{ Exception -> 0x02bf }
            int r0 = getMax
            int r0 = r0 + 79
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            return
        L_0x028f:
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r1 = r5.getAuthContentResult()     // Catch:{ Exception -> 0x02bf }
            if (r1 == 0) goto L_0x02be
            java.lang.String r1 = "getAuthContentOrAutoAuth rpc begin present auth dialog"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r13, r1)     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper$a r16 = new com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper$a     // Catch:{ Exception -> 0x02bf }
            com.alibaba.ariver.app.api.App r3 = r14.g     // Catch:{ Exception -> 0x02bf }
            r1 = r16
            r2 = r17
            r4 = r19
            r6 = r18
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r25
            r11 = r23
            r12 = r24
            r14 = r13
            r13 = r26
            r1.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x02bc }
            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.runOnMain(r16)     // Catch:{ Exception -> 0x02bc }
            goto L_0x02be
        L_0x02bc:
            r0 = move-exception
            goto L_0x02c1
        L_0x02be:
            return
        L_0x02bf:
            r0 = move-exception
            r14 = r13
        L_0x02c1:
            java.lang.String r1 = "getAuthContentOrAutoAuth rpc exception "
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r14, r1, r0)
            r1 = r17
            r1.a(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper.getAuthContentOrAutoAuth(java.lang.String, com.alibaba.ariver.app.api.Page, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.Map, boolean, java.util.Map, android.os.Bundle):void");
    }

    public void setOpenAuthGrantFlag() {
        if ((this.e != null ? '[' : 'J') != 'J') {
            if (!(!this.e.contains(OAuthService.SCOPE_AUTH_USER))) {
                try {
                    int i = getMax + 121;
                    try {
                        length = i % 128;
                        int i2 = i % 2;
                        RVFlag.setOpenAuthGrantFlag(this.d, true);
                        int i3 = length + 115;
                        getMax = i3 % 128;
                        int i4 = i3 % 2;
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            }
        }
    }

    public void sendResult(@Nullable Page page, JSONObject jSONObject) {
        try {
            int i = length + 21;
            getMax = i % 128;
            int i2 = i % 2;
            if (!(13 == JSONUtils.getInt(jSONObject, "error"))) {
                f10120a = false;
                try {
                    int i3 = length + 73;
                    getMax = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                int i5 = getMax + 63;
                length = i5 % 128;
                int i6 = i5 % 2;
                f10120a = true;
            }
            if (this.b != null) {
                StringBuilder sb = new StringBuilder("result for provider: ");
                sb.append(jSONObject.toString());
                RVLogger.d("AriverPermission:RVOpenAuthHelper", sb.toString());
                this.b.onResult(jSONObject);
            } else if (this.c != null) {
                StringBuilder sb2 = new StringBuilder("result for jsbridge: ");
                sb2.append(jSONObject.toString());
                RVLogger.d("AriverPermission:RVOpenAuthHelper", sb2.toString());
                this.c.sendJSONResponse(jSONObject);
            }
            if (page != null) {
                int i7 = getMax + 31;
                length = i7 % 128;
                SendToRenderCallback sendToRenderCallback = null;
                if ((i7 % 2 != 0 ? '_' : Typography.greater) != '_') {
                    if ((page.getRender() != null ? 'Q' : 'W') != 'Q') {
                        return;
                    }
                } else {
                    Render render = page.getRender();
                    super.hashCode();
                    if ((render != null ? (char) 5 : 4) != 5) {
                        return;
                    }
                }
                EngineUtils.sendToRender(page.getRender(), "alipayAuthChange", jSONObject, sendToRenderCallback);
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    private void a(Page page, Exception exc) {
        JSONObject jSONObject = new JSONObject();
        if (!(exc.getClass().getName().contains("RpcException"))) {
            jSONObject.put("error", (Object) 10);
            jSONObject.put("errorMessage", (Object) exc.toString());
        } else {
            int i = getMax + 57;
            length = i % 128;
            int i2 = i % 2;
            try {
                jSONObject.put("error", (Object) 12);
                jSONObject.put("errorMessage", (Object) "Network Error");
                int i3 = length + 33;
                getMax = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        sendResult(page, jSONObject);
    }

    private void a(App app, @Nullable Page page, AuthSkipResultModel authSkipResultModel, String str, String str2, String str3, List<String> list, boolean z, String str4, Map<String, String> map, Map<String, String> map2) {
        int i = getMax + 47;
        length = i % 128;
        int i2 = i % 2;
        boolean z2 = false;
        if (!(app == null)) {
            if (!(app.isDestroyed())) {
                try {
                    int i3 = length + 29;
                    getMax = i3 % 128;
                    int i4 = i3 % 2;
                    if (app.isExited()) {
                        z2 = true;
                    }
                    if (!z2 && app.getAppContext() != null) {
                        final IOpenAuthNoticeDialog authNoticeDialog = ((AuthDialogProxy) RVProxy.get(AuthDialogProxy.class)).getAuthNoticeDialog(app.getAppContext().getContext());
                        final IOpenAuthNoticeDialog iOpenAuthNoticeDialog = authNoticeDialog;
                        final AuthSkipResultModel authSkipResultModel2 = authSkipResultModel;
                        final App app2 = app;
                        final Page page2 = page;
                        final String str5 = str;
                        final String str6 = str2;
                        final String str7 = str3;
                        final List<String> list2 = list;
                        final boolean z3 = z;
                        final String str8 = str4;
                        final Map<String, String> map3 = map;
                        final Map<String, String> map4 = map2;
                        authNoticeDialog.setPositiveListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                RVLogger.d("AriverPermission:RVOpenAuthHelper", "h5OpenAuthNoticeDialog click auth again");
                                iOpenAuthNoticeDialog.cancel();
                                if (authSkipResultModel2.getAuthContentResult() != null) {
                                    ExecutorUtils.runOnMain(new a(app2, page2, authSkipResultModel2, str5, str6, str7, list2, z3, str8, map3, map4));
                                }
                            }
                        });
                        final Page page3 = page;
                        authNoticeDialog.setNegativeListener(new View.OnClickListener() {
                            public void onClick(View view) {
                                RVLogger.d("AriverPermission:RVOpenAuthHelper", "h5OpenAuthNoticeDialog click exit auth");
                                authNoticeDialog.cancel();
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("error", (Object) "11");
                                jSONObject.put("message", (Object) LangResourceUtil.getString(R.string.tiny_user_cancel_authorization));
                                jSONObject.put("errorMessage", (Object) LangResourceUtil.getString(R.string.tiny_user_cancel_authorization));
                                RVOpenAuthHelper.this.sendResult(page3, jSONObject);
                            }
                        });
                        authNoticeDialog.show();
                        return;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0136, code lost:
        if (r12 == false) goto L_0x014f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014d, code lost:
        if ((!r5.getErrorScopes().isEmpty() ? 'I' : 17) != 17) goto L_0x014f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r16, com.alibaba.ariver.app.api.App r17, @androidx.annotation.Nullable com.alibaba.ariver.app.api.Page r18, java.lang.String r19, java.lang.String r20, java.util.List<java.lang.String> r21, boolean r22, java.lang.String r23, java.util.Map<java.lang.String, java.lang.String> r24, java.util.Map<java.lang.String, java.lang.String> r25) {
        /*
            r15 = this;
            r7 = r15
            r0 = r16
            r8 = r18
            r1 = r21
            java.lang.String r2 = "publicInfo"
            java.lang.String r3 = "accessToken"
            java.lang.String r4 = "TB"
            java.lang.String r9 = "AriverPermission:RVOpenAuthHelper"
            com.alibaba.ariver.permission.openauth.model.request.AuthExecuteRequestModel r5 = new com.alibaba.ariver.permission.openauth.model.request.AuthExecuteRequestModel
            r5.<init>()
            r6 = r19
            r5.setAppId(r6)
            r6 = r20
            r5.setCurrentPageUrl(r6)
            java.lang.String r6 = "mobilegw_android"
            r5.setFromSystem(r6)
            r5.setScopeNicks(r1)
            java.lang.String r6 = "QnJpbmcgc21hbGwgYW5kIGJlYXV0aWZ1bCBjaGFuZ2VzIHRvIHRoZSB3b3JsZA=="
            r5.setState(r6)
            r6 = r23
            r5.setIsvAppId(r6)
            r6 = r24
            r5.setExtInfo(r6)
            r6 = r25
            r5.setAppExtInfo(r6)
            boolean r6 = android.text.TextUtils.equals(r4, r0)     // Catch:{ Exception -> 0x0206 }
            if (r6 == 0) goto L_0x0051
            int r6 = length
            int r6 = r6 + 111
            int r10 = r6 % 128
            getMax = r10
            int r6 = r6 % 2
            r6 = r17
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r5 = com.alibaba.ariver.permission.extension.auth.a.a((com.alibaba.ariver.app.api.App) r6, (com.alibaba.ariver.permission.openauth.model.request.AuthExecuteRequestModel) r5)     // Catch:{ Exception -> 0x0206 }
            goto L_0x005d
        L_0x0051:
            java.lang.Class<com.alibaba.ariver.permission.api.proxy.Oauth2AuthCodeService> r6 = com.alibaba.ariver.permission.api.proxy.Oauth2AuthCodeService.class
            java.lang.Object r6 = com.alibaba.ariver.kernel.common.RVProxy.get(r6)     // Catch:{ Exception -> 0x0206 }
            com.alibaba.ariver.permission.api.proxy.Oauth2AuthCodeService r6 = (com.alibaba.ariver.permission.api.proxy.Oauth2AuthCodeService) r6     // Catch:{ Exception -> 0x0206 }
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r5 = r6.executeAuth(r5)     // Catch:{ Exception -> 0x0206 }
        L_0x005d:
            if (r5 == 0) goto L_0x0205
            int r6 = length
            int r6 = r6 + 97
            int r10 = r6 % 128
            getMax = r10
            int r6 = r6 % 2
            java.lang.Boolean r6 = r5.getSuccess()     // Catch:{ Exception -> 0x0206 }
            r10 = 0
            r11 = 1
            if (r6 == 0) goto L_0x0073
            r6 = 1
            goto L_0x0074
        L_0x0073:
            r6 = 0
        L_0x0074:
            if (r6 == 0) goto L_0x00cd
            java.lang.Boolean r6 = r5.getSuccess()     // Catch:{ Exception -> 0x0206 }
            boolean r6 = r6.booleanValue()     // Catch:{ Exception -> 0x0206 }
            if (r6 != 0) goto L_0x00cd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0206 }
            java.lang.String r2 = "executeAuth rpc !isSuccess "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r2 = r5.getErrorCode()     // Catch:{ Exception -> 0x0206 }
            r1.append(r2)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r2 = " "
            r1.append(r2)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r2 = r5.getErrorMsg()     // Catch:{ Exception -> 0x0206 }
            r1.append(r2)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0206 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r9, r1)     // Catch:{ Exception -> 0x0206 }
            com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper$4 r12 = new com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper$4     // Catch:{ Exception -> 0x0206 }
            r1 = r12
            r2 = r15
            r3 = r18
            r4 = r16
            r6 = r22
            r1.<init>(r3, r4, r5, r6)     // Catch:{ Exception -> 0x0206 }
            com.alibaba.ariver.kernel.common.utils.ExecutorUtils.runOnMain(r12)     // Catch:{ Exception -> 0x0206 }
            int r0 = getMax     // Catch:{ Exception -> 0x00ca }
            int r0 = r0 + 35
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x00ca }
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x00bf
            r0 = 1
            goto L_0x00c0
        L_0x00bf:
            r0 = 0
        L_0x00c0:
            if (r0 == r11) goto L_0x00c3
            return
        L_0x00c3:
            r0 = 75
            int r0 = r0 / r10
            return
        L_0x00c7:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x00ca:
            r0 = move-exception
            goto L_0x0201
        L_0x00cd:
            java.lang.String r6 = "executeAuth rpc isSuccess"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r9, r6)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r6 = r5.getAuthCode()     // Catch:{ Exception -> 0x0206 }
            java.lang.String r10 = "executeAuth rpc authCode is "
            java.lang.String r12 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r10 = r10.concat(r12)     // Catch:{ Exception -> 0x0206 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r9, r10)     // Catch:{ Exception -> 0x0206 }
            com.alibaba.fastjson.JSONObject r10 = new com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x0206 }
            r10.<init>()     // Catch:{ Exception -> 0x0206 }
            java.lang.String r12 = "authCode"
            r10.put((java.lang.String) r12, (java.lang.Object) r6)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r12 = "authcode"
            r10.put((java.lang.String) r12, (java.lang.Object) r6)     // Catch:{ Exception -> 0x0206 }
            com.alibaba.fastjson.JSONArray r6 = new com.alibaba.fastjson.JSONArray     // Catch:{ Exception -> 0x0206 }
            r6.<init>()     // Catch:{ Exception -> 0x0206 }
            java.util.List r12 = r5.getSuccessScopes()     // Catch:{ Exception -> 0x0206 }
            if (r12 == 0) goto L_0x010e
            java.util.List r12 = r5.getSuccessScopes()     // Catch:{ Exception -> 0x0206 }
            boolean r12 = r12.isEmpty()     // Catch:{ Exception -> 0x0206 }
            if (r12 != 0) goto L_0x010e
            java.util.List r12 = r5.getSuccessScopes()     // Catch:{ Exception -> 0x0206 }
            r6.addAll(r12)     // Catch:{ Exception -> 0x0206 }
        L_0x010e:
            java.lang.String r12 = "authSuccessScopes"
            r10.put((java.lang.String) r12, (java.lang.Object) r6)     // Catch:{ Exception -> 0x0206 }
            com.alibaba.fastjson.JSONObject r6 = new com.alibaba.fastjson.JSONObject     // Catch:{ Exception -> 0x0206 }
            r6.<init>()     // Catch:{ Exception -> 0x0206 }
            java.util.Map r12 = r5.getErrorScopes()     // Catch:{ Exception -> 0x0206 }
            if (r12 == 0) goto L_0x0175
            int r12 = getMax
            int r12 = r12 + 49
            int r13 = r12 % 128
            length = r13
            int r12 = r12 % 2
            if (r12 == 0) goto L_0x013c
            java.util.Map r12 = r5.getErrorScopes()     // Catch:{ Exception -> 0x0206 }
            boolean r12 = r12.isEmpty()     // Catch:{ Exception -> 0x0206 }
            r13 = 0
            super.hashCode()     // Catch:{ all -> 0x0139 }
            if (r12 != 0) goto L_0x0175
            goto L_0x014f
        L_0x0139:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x013c:
            java.util.Map r12 = r5.getErrorScopes()     // Catch:{ Exception -> 0x0206 }
            boolean r12 = r12.isEmpty()     // Catch:{ Exception -> 0x0206 }
            r13 = 17
            if (r12 != 0) goto L_0x014b
            r12 = 73
            goto L_0x014d
        L_0x014b:
            r12 = 17
        L_0x014d:
            if (r12 == r13) goto L_0x0175
        L_0x014f:
            java.util.Map r12 = r5.getErrorScopes()     // Catch:{ Exception -> 0x0206 }
            java.util.Set r12 = r12.entrySet()     // Catch:{ Exception -> 0x0206 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x0206 }
        L_0x015b:
            boolean r13 = r12.hasNext()     // Catch:{ Exception -> 0x0206 }
            if (r13 == 0) goto L_0x0175
            java.lang.Object r13 = r12.next()     // Catch:{ Exception -> 0x0206 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ Exception -> 0x0206 }
            java.lang.Object r14 = r13.getKey()     // Catch:{ Exception -> 0x0206 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x0206 }
            java.lang.Object r13 = r13.getValue()     // Catch:{ Exception -> 0x0206 }
            r6.put((java.lang.String) r14, (java.lang.Object) r13)     // Catch:{ Exception -> 0x0206 }
            goto L_0x015b
        L_0x0175:
            java.util.Map r12 = r5.getExtInfo()     // Catch:{ Exception -> 0x0206 }
            if (r12 == 0) goto L_0x01c2
            boolean r0 = android.text.TextUtils.equals(r4, r0)     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x01c2
            java.util.Map r0 = r5.getExtInfo()     // Catch:{ Exception -> 0x0206 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0206 }
            r10.put((java.lang.String) r3, (java.lang.Object) r0)     // Catch:{ Exception -> 0x0206 }
            java.util.Map r0 = r5.getExtInfo()     // Catch:{ Exception -> 0x01c2 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x01c2 }
            if (r0 == 0) goto L_0x01c2
            java.util.Map r0 = r5.getExtInfo()     // Catch:{ Exception -> 0x01c2 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x01c2 }
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSONObject.parseObject(r0)     // Catch:{ Exception -> 0x01c2 }
            java.util.Set r2 = r0.keySet()     // Catch:{ Exception -> 0x01c2 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x01c2 }
        L_0x01ae:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x01c2 }
            if (r3 == 0) goto L_0x01c2
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x01c2 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x01c2 }
            java.lang.Object r4 = r0.get(r3)     // Catch:{ Exception -> 0x01c2 }
            r10.put((java.lang.String) r3, (java.lang.Object) r4)     // Catch:{ Exception -> 0x01c2 }
            goto L_0x01ae
        L_0x01c2:
            java.lang.String r0 = "authErrorScopes"
            r10.put((java.lang.String) r0, (java.lang.Object) r6)     // Catch:{ Exception -> 0x0206 }
            com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r0 = r7.c     // Catch:{ Exception -> 0x0206 }
            r2 = 34
            if (r0 == 0) goto L_0x01d0
            r0 = 77
            goto L_0x01d2
        L_0x01d0:
            r0 = 34
        L_0x01d2:
            if (r0 == r2) goto L_0x0202
            if (r1 == 0) goto L_0x0202
            int r0 = getMax     // Catch:{ Exception -> 0x00ca }
            int r0 = r0 + 15
            int r2 = r0 % 128
            length = r2     // Catch:{ Exception -> 0x00ca }
            int r0 = r0 % 2
            java.lang.String r0 = "auth_user"
            boolean r0 = r1.contains(r0)     // Catch:{ Exception -> 0x0206 }
            if (r0 == 0) goto L_0x0202
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0206 }
            java.lang.String r1 = "executeAuth setOpenAuthGrantFlag "
            r0.<init>(r1)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r1 = r7.d     // Catch:{ Exception -> 0x0206 }
            r0.append(r1)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0206 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r9, r0)     // Catch:{ Exception -> 0x0206 }
            java.lang.String r0 = r7.d     // Catch:{ Exception -> 0x0206 }
            com.alibaba.ariver.permission.api.RVFlag.setOpenAuthGrantFlag(r0, r11)     // Catch:{ Exception -> 0x0206 }
            goto L_0x0202
        L_0x0201:
            throw r0
        L_0x0202:
            r15.sendResult(r8, r10)     // Catch:{ Exception -> 0x0206 }
        L_0x0205:
            return
        L_0x0206:
            r0 = move-exception
            java.lang.String r1 = "executeAuth rpc exception "
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r9, r1, r0)
            r15.a(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper.a(java.lang.String, com.alibaba.ariver.app.api.App, com.alibaba.ariver.app.api.Page, java.lang.String, java.lang.String, java.util.List, boolean, java.lang.String, java.util.Map, java.util.Map):void");
    }

    private void a(@Nullable Page page, String str, String str2, String str3, byte[] bArr, boolean z) {
        App app = this.g;
        if (app != null) {
            int i = length + 9;
            getMax = i % 128;
            boolean z2 = false;
            if (i % 2 == 0) {
                boolean isExited = app.isExited();
                Object obj = null;
                super.hashCode();
                if (isExited) {
                    return;
                }
            } else {
                if (app.isExited()) {
                    return;
                }
            }
            if (!this.g.isDestroyed()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error", (Object) 15);
                jSONObject.put("errorMessage", (Object) str2);
                jSONObject.put("errorDesc", (Object) str3);
                if (TextUtils.equals(PLATFORM_TB, str)) {
                    jSONObject.put("errorCode", (Object) str2);
                    jSONObject.put("message", (Object) str3);
                    jSONObject.put("errorMessage", (Object) str3);
                    if ((bArr != null ? 6 : '_') != '_' && bArr.length > 0) {
                        String str4 = new String(bArr, Charset.forName(length(new char[]{48423, 48498, 1590, 62983, 41800, 17348, 28887, 41429, 31883}).intern()));
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject.putAll(JSON.parseObject(str4));
                            jSONObject.remove("api");
                        }
                    }
                }
                sendResult(page, jSONObject);
                RVLogger.d("AriverPermission:RVOpenAuthHelper", "showBusinessFailedDialog showErrorTip: ".concat(String.valueOf(z)));
                if (!z) {
                    z2 = true;
                }
                if (!z2) {
                    int i2 = getMax + 5;
                    length = i2 % 128;
                    int i3 = i2 % 2;
                    Context context = this.f;
                    ((AuthDialogProxy) RVProxy.get(AuthDialogProxy.class)).showErrorTipDialog(context, LangResourceUtil.getString(context, R.string.tiny_server_busy_error), LangResourceUtil.getString(this.f, R.string.tiny_apologize_for_the_delay));
                    int i4 = getMax + 1;
                    length = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0.isEmpty() == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004a, code lost:
        if ((!r2) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a() {
        /*
            r4 = this;
            int r0 = getMax
            int r0 = r0 + 53
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVConfigService> r0 = com.alibaba.ariver.kernel.common.service.RVConfigService.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ Exception -> 0x0056 }
            com.alibaba.ariver.kernel.common.service.RVConfigService r0 = (com.alibaba.ariver.kernel.common.service.RVConfigService) r0     // Catch:{ Exception -> 0x0056 }
            java.lang.String r1 = "h5_newGetAuthCodeConfig"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getConfig(r1, r2)     // Catch:{ Exception -> 0x0056 }
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.parseObject((java.lang.String) r0)     // Catch:{ Exception -> 0x0056 }
            r1 = 0
            if (r0 == 0) goto L_0x0055
            int r2 = length
            int r2 = r2 + 89
            int r3 = r2 % 128
            getMax = r3
            int r2 = r2 % 2
            r3 = 88
            if (r2 != 0) goto L_0x0032
            r2 = 88
            goto L_0x0034
        L_0x0032:
            r2 = 18
        L_0x0034:
            if (r2 == r3) goto L_0x003d
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0055
            goto L_0x004c
        L_0x003d:
            boolean r2 = r0.isEmpty()     // Catch:{ Exception -> 0x0056 }
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x0053 }
            if (r2 != 0) goto L_0x0049
            r2 = 1
            goto L_0x004a
        L_0x0049:
            r2 = 0
        L_0x004a:
            if (r2 == 0) goto L_0x0055
        L_0x004c:
            java.lang.String r2 = "callbackErrorAtDuplicate"
            boolean r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getBoolean(r0, r2, r1)
            return r0
        L_0x0053:
            r0 = move-exception
            throw r0
        L_0x0055:
            return r1
        L_0x0056:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.extension.auth.RVOpenAuthHelper.a():boolean");
    }

    private void a(H5OpenAuthProxy h5OpenAuthProxy, @Nullable Page page, H5AuthParamsModel h5AuthParamsModel, Bundle bundle) {
        boolean z;
        String appId = h5AuthParamsModel.getAppId();
        Bundle bundle2 = new Bundle();
        Iterator<Map.Entry<String, String>> it = h5AuthParamsModel.getParams().entrySet().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                try {
                    break;
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                Map.Entry next = it.next();
                bundle2.putString((String) next.getKey(), (String) next.getValue());
                int i = length + 1;
                getMax = i % 128;
                int i2 = i % 2;
            }
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        if (!(("YES".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_passStartParamInGetAuthCode", (String) null)) ? 'D' : Typography.amp) == '&' || bundle == null)) {
            int i3 = getMax + 113;
            length = i3 % 128;
            int i4 = i3 % 2;
            if (bundle.isEmpty()) {
                z = true;
            }
            if (!z) {
                bundle2.putAll(bundle);
            }
        }
        h5OpenAuthProxy.addOpenAuthHelper(valueOf, this, page);
        if ((f10120a ? ';' : Typography.less) != ';') {
            f10120a = true;
            RVLogger.d("AriverPermission:RVOpenAuthHelper", "startH5OpenAuth,key is :".concat(String.valueOf(valueOf)));
            h5OpenAuthProxy.startH5OpenAuth(valueOf, appId, bundle2);
            int i5 = getMax + 125;
            length = i5 % 128;
            int i6 = i5 % 2;
        } else if (a()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error", (Object) 13);
            jSONObject.put("errorMessage", (Object) LangResourceUtil.getString(R.string.tiny_being_init_authorization_panel));
            sendResult(page, jSONObject);
        }
    }

    class a implements Runnable {
        /* access modifiers changed from: private */
        public AuthSkipResultModel b;
        /* access modifiers changed from: private */
        public String c;
        /* access modifiers changed from: private */
        public String d;
        /* access modifiers changed from: private */
        public List<String> e;
        /* access modifiers changed from: private */
        public boolean f;
        /* access modifiers changed from: private */
        public String g;
        /* access modifiers changed from: private */
        public Map<String, String> h;
        /* access modifiers changed from: private */
        public Map<String, String> i;
        /* access modifiers changed from: private */
        public Page j;
        /* access modifiers changed from: private */
        public App k;
        /* access modifiers changed from: private */
        public String l;

        public a(App app, Page page, @Nullable AuthSkipResultModel authSkipResultModel, String str, String str2, String str3, List<String> list, boolean z, String str4, Map<String, String> map, Map<String, String> map2) {
            this.b = authSkipResultModel;
            this.k = app;
            this.j = page;
            this.l = str;
            this.c = str2;
            this.d = str3;
            this.e = list;
            this.f = z;
            this.g = str4;
            this.h = map;
            this.i = map2;
        }

        public void run() {
            List<String> authText = this.b.getAuthContentResult().getAuthText();
            String appName = this.b.getAuthContentResult().getAppName();
            String appLogoLink = this.b.getAuthContentResult().getAppLogoLink();
            List<AuthAgreementModel> agreements = this.b.getAuthContentResult().getAgreements();
            if (((AuthDialogProxy) RVProxy.get(AuthDialogProxy.class)) == null) {
                RVLogger.e("AriverPermission:RVOpenAuthHelper", "get authdialogproxy is null");
            }
            if (authText != null && !authText.isEmpty()) {
                RVLogger.e("authText is Empty");
            }
            App app = this.k;
            if (app != null && !app.isDestroyed() && !this.k.isExited()) {
                AppContext appContext = this.k.getAppContext();
                Page page = this.j;
                if ((page == null || (!page.isDestroyed() && !this.j.isExited())) && appContext != null) {
                    final IOpenAuthDialog openAuthDialog = ((AuthDialogProxy) RVProxy.get(AuthDialogProxy.class)).getOpenAuthDialog(appContext.getContext());
                    if (agreements == null || agreements.isEmpty()) {
                        openAuthDialog.setContent(appName, appLogoLink, this.k, this.e, authText, (List<AuthProtocol>) null, this.b.getAuthContentResult().getIsvAgent().booleanValue() ? this.b.getAuthContentResult().getIsvAgentDesc() : null, this.b.getAuthContentResult().getExtInfo());
                    } else {
                        ArrayList arrayList = new ArrayList(agreements.size());
                        for (AuthAgreementModel next : agreements) {
                            arrayList.add(new AuthProtocol(next.getName(), next.getLink()));
                        }
                        openAuthDialog.setContent(appName, appLogoLink, this.k, this.e, authText, arrayList, this.b.getAuthContentResult().getIsvAgent().booleanValue() ? this.b.getAuthContentResult().getIsvAgentDesc() : null, this.b.getAuthContentResult().getExtInfo());
                    }
                    openAuthDialog.setOnConfirmClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            RVLogger.d("AriverPermission:RVOpenAuthHelper", "h5OpenAuthDialog click begin invoke auth");
                            openAuthDialog.cancel();
                            ExecutorUtils.execute(ExecutorType.URGENT, new Runnable() {
                                public void run() {
                                    RVOpenAuthHelper.access$1200(RVOpenAuthHelper.this, a.this.l, a.this.k, a.this.j, a.this.c, a.this.d, a.this.e, a.this.f, a.this.g, a.this.h, a.this.i);
                                }
                            });
                        }
                    });
                    openAuthDialog.setOnCloseClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            RVLogger.d("AriverPermission:RVOpenAuthHelper", "h5OpenAuthDialog click close");
                            openAuthDialog.cancel();
                            RVOpenAuthHelper.access$1400(RVOpenAuthHelper.this, a.this.k, a.this.j, a.this.b, a.this.l, a.this.c, a.this.d, a.this.e, a.this.f, a.this.g, a.this.h, a.this.i);
                        }
                    });
                    try {
                        openAuthDialog.show();
                    } catch (Throwable th) {
                        RVLogger.e("AriverPermission:RVOpenAuthHelper", th);
                    }
                } else {
                    RVLogger.w("AriverPermission:RVOpenAuthHelper", "auth should show dailog but page is exited!");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", (Object) "11");
                    jSONObject.put("message", (Object) "页面已退出");
                    jSONObject.put("errorMessage", (Object) "页面已退出");
                    RVOpenAuthHelper.access$100(RVOpenAuthHelper.this).sendJSONResponse(jSONObject);
                }
            }
        }
    }

    private static String length(char[] cArr) {
        int i = length + 13;
        getMax = i % 128;
        int i2 = i % 2;
        try {
            try {
                char[] length2 = onActivityPreCreated.length(setMax, cArr);
                int i3 = 4;
                while (true) {
                    if ((i3 < length2.length ? '8' : Typography.quote) == '\"') {
                        return new String(length2, 4, length2.length - 4);
                    }
                    int i4 = getMax + 49;
                    length = i4 % 128;
                    if (i4 % 2 != 0) {
                        length2[i3] = (char) ((int) (((long) (length2[i3] | length2[i3 << 5])) + ((long) (i3 * 3)) + setMax));
                        i3 += 67;
                    } else {
                        length2[i3] = (char) ((int) (((long) (length2[i3] ^ length2[i3 % 4])) ^ (((long) (i3 - 4)) * setMax)));
                        i3++;
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }
}
