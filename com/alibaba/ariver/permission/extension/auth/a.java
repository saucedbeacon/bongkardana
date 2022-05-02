package com.alibaba.ariver.permission.extension.auth;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.storage.KVStorageProxy;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.fastjson.JSONObject;
import id.dana.sendmoney.summary.SummaryActivity;
import o.onActivityPostResumed;

public class a {
    private static int length = 1;
    private static int[] setMax = {950659892, 1849910956, -996918919, 1691997983, 1719873223, -1507595355, -292912612, 36895413, -1494481997, 1348910960, -1889025099, -1137008737, -727652770, 330177594, 1036143473, -1448853742, -1436980524, 588344975};
    private static int setMin;

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x02cf, code lost:
        if ((r15) != false) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02d6, code lost:
        if (r14.success != false) goto L_0x02d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x02b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.ariver.permission.openauth.model.result.AuthSkipResultModel a(java.lang.String r13, com.alibaba.ariver.app.api.App r14, com.alibaba.ariver.permission.openauth.model.request.AuthSkipRequestModel r15) {
        /*
            com.alibaba.ariver.permission.openauth.model.result.AuthSkipResultModel r13 = new com.alibaba.ariver.permission.openauth.model.result.AuthSkipResultModel
            r13.<init>()
            java.util.Map r0 = r15.getAppExtInfo()
            java.lang.String r1 = "callMethod"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r1 = r15.getScopeNicks()
            r2 = 0
            if (r1 == 0) goto L_0x040f
            java.util.List r1 = r15.getScopeNicks()
            int r1 = r1.size()
            r3 = 1
            if (r1 == r3) goto L_0x0025
            goto L_0x040f
        L_0x0025:
            java.lang.String r1 = "getAuthCode"
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            r4 = 0
            if (r1 == 0) goto L_0x0030
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            if (r1 == 0) goto L_0x005f
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r13.setSuccess(r14)
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r14 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.FORBIDDEN_ERROR
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r14 = (com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.Error) r14
            int r15 = r14.getErrorCode()
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r13.setErrorCode(r15)
            java.lang.String r14 = r14.getErrorMessage()
            r13.setErrorMsg(r14)
            int r14 = setMin
            int r14 = r14 + 83
            int r15 = r14 % 128
            length = r15
            int r14 = r14 % 2
            if (r14 != 0) goto L_0x005e
            int r14 = r2.length     // Catch:{ all -> 0x005c }
            return r13
        L_0x005c:
            r13 = move-exception
            throw r13
        L_0x005e:
            return r13
        L_0x005f:
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r1 = com.alibaba.ariver.resource.api.models.AppModel.class
            java.lang.Object r1 = r14.getData(r1)
            com.alibaba.ariver.resource.api.models.AppModel r1 = (com.alibaba.ariver.resource.api.models.AppModel) r1
            java.lang.String r5 = r15.getIsvAppId()
            boolean r5 = a((com.alibaba.ariver.resource.api.models.AppModel) r1, (java.lang.String) r5)
            if (r5 != 0) goto L_0x008f
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r13.setSuccess(r14)
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r13.setCanSkipAuth(r14)
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r14 = new com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel
            r14.<init>()
            r13.setAuthExecuteResult(r14)
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r14 = r13.getAuthExecuteResult()
            java.util.List r15 = r15.getScopeNicks()
            r14.setSuccessScopes(r15)
            return r13
        L_0x008f:
            java.lang.Class<com.alibaba.ariver.kernel.common.storage.KVStorageProxy> r5 = com.alibaba.ariver.kernel.common.storage.KVStorageProxy.class
            java.lang.Object r5 = com.alibaba.ariver.kernel.common.RVProxy.get(r5)
            com.alibaba.ariver.kernel.common.storage.KVStorageProxy r5 = (com.alibaba.ariver.kernel.common.storage.KVStorageProxy) r5
            if (r5 == 0) goto L_0x018f
            java.lang.String r6 = r15.getAppId()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r8 = com.alibaba.ariver.resource.api.models.AppModel.class
            java.lang.Object r8 = r14.getData(r8)
            com.alibaba.ariver.resource.api.models.AppModel r8 = (com.alibaba.ariver.resource.api.models.AppModel) r8
            com.alibaba.ariver.resource.api.models.AppInfoModel r8 = r8.getAppInfoModel()
            java.lang.String r8 = r8.getAppKey()
            r7.append(r8)
            java.lang.String r8 = "token"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r5 = r5.getString(r6, r7)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x018c
            int r6 = length
            int r6 = r6 + 33
            int r7 = r6 % 128
            setMin = r7
            int r6 = r6 % 2
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSONObject.parseObject(r5)
            java.lang.String r6 = "accessToken"
            java.lang.String r7 = r5.getString(r6)
            java.lang.String r8 = "expirationTime"
            java.lang.Long r5 = r5.getLong(r8)
            long r8 = r5.longValue()
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L_0x0188
            int r5 = length
            int r5 = r5 + 83
            int r10 = r5 % 128
            setMin = r10
            int r5 = r5 % 2
            long r10 = java.lang.System.currentTimeMillis()
            r5 = 47
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x0103
            r8 = 57
            goto L_0x0105
        L_0x0103:
            r8 = 47
        L_0x0105:
            if (r8 == r5) goto L_0x0188
            java.util.List r5 = r15.getScopeNicks()
            java.util.Iterator r5 = r5.iterator()
            r8 = 1
        L_0x0110:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0145
            java.lang.Object r9 = r5.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Class<com.alibaba.ariver.kernel.common.storage.KVStorageProxy> r10 = com.alibaba.ariver.kernel.common.storage.KVStorageProxy.class
            java.lang.Object r10 = com.alibaba.ariver.kernel.common.RVProxy.get(r10)
            com.alibaba.ariver.kernel.common.storage.KVStorageProxy r10 = (com.alibaba.ariver.kernel.common.storage.KVStorageProxy) r10
            java.lang.String r11 = r15.getAppId()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            java.lang.String r9 = "scope"
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            java.lang.String r9 = r10.getString(r11, r9)
            java.lang.String r10 = "true"
            boolean r9 = android.text.TextUtils.equals(r10, r9)
            r8 = r8 & r9
            goto L_0x0110
        L_0x0145:
            if (r8 == 0) goto L_0x018f
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r13.setSuccess(r14)
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r13.setCanSkipAuth(r14)
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r14 = new com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel
            r14.<init>()
            r13.setAuthExecuteResult(r14)
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r14 = r13.getAuthExecuteResult()
            java.util.List r15 = r15.getScopeNicks()
            r14.setSuccessScopes(r15)
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r14 = r13.getAuthExecuteResult()
            java.util.Map r14 = r14.getExtInfo()
            if (r14 != 0) goto L_0x017d
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            int r15 = length
            int r15 = r15 + 99
            int r0 = r15 % 128
            setMin = r0
            int r15 = r15 % 2
        L_0x017d:
            r14.put(r6, r7)
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r15 = r13.getAuthExecuteResult()
            r15.setExtInfo(r14)
            return r13
        L_0x0188:
            a(r14)
            goto L_0x018f
        L_0x018c:
            a(r14)
        L_0x018f:
            java.lang.String r5 = r15.getIsvAppId()
            boolean r5 = a((com.alibaba.ariver.app.api.App) r14, (java.lang.String) r5)
            if (r5 == 0) goto L_0x01e8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r13.setSuccess(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r13.setCanSkipAuth(r0)
            com.alibaba.ariver.permission.openauth.model.request.AuthExecuteRequestModel r0 = new com.alibaba.ariver.permission.openauth.model.request.AuthExecuteRequestModel
            r0.<init>()
            java.lang.String r1 = r15.getAppId()
            r0.setAppId(r1)
            java.lang.String r1 = r15.getCurrentPageUrl()
            r0.setCurrentPageUrl(r1)
            java.lang.String r1 = r15.getFromSystem()
            r0.setFromSystem(r1)
            java.util.List r1 = r15.getScopeNicks()
            r0.setScopeNicks(r1)
            java.lang.String r1 = r15.getState()
            r0.setState(r1)
            java.lang.String r1 = r15.getIsvAppId()
            r0.setIsvAppId(r1)
            java.util.Map r1 = r15.getExtInfo()
            r0.setExtInfo(r1)
            java.util.Map r15 = r15.getAppExtInfo()
            r0.setAppExtInfo(r15)
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r14 = a((com.alibaba.ariver.app.api.App) r14, (com.alibaba.ariver.permission.openauth.model.request.AuthExecuteRequestModel) r0)
            r13.setAuthExecuteResult(r14)
            return r13
        L_0x01e8:
            java.lang.String r14 = r1.getAppId()
            com.alibaba.ariver.resource.api.models.AppInfoModel r5 = r1.getAppInfoModel()
            com.alibaba.ariver.resource.api.models.TemplateConfigModel r5 = r5.getTemplateConfig()
            if (r5 == 0) goto L_0x0215
            com.alibaba.ariver.resource.api.models.AppInfoModel r5 = r1.getAppInfoModel()
            com.alibaba.ariver.resource.api.models.TemplateConfigModel r5 = r5.getTemplateConfig()
            java.lang.String r5 = r5.getTemplateId()
            if (r5 == 0) goto L_0x0206
            r5 = 0
            goto L_0x0207
        L_0x0206:
            r5 = 1
        L_0x0207:
            if (r5 == r3) goto L_0x0215
            com.alibaba.ariver.resource.api.models.AppInfoModel r14 = r1.getAppInfoModel()
            com.alibaba.ariver.resource.api.models.TemplateConfigModel r14 = r14.getTemplateConfig()
            java.lang.String r14 = r14.getTemplateId()
        L_0x0215:
            java.lang.String r5 = r15.getIsvAppId()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0223
            java.lang.String r14 = r15.getIsvAppId()
        L_0x0223:
            com.alibaba.ariver.app.api.mtop.SendMtopParams r5 = new com.alibaba.ariver.app.api.mtop.SendMtopParams
            r5.<init>()
            java.lang.String r6 = r1.getAppId()
            java.lang.String r7 = "mainAppId"
            r5.addData(r7, r6)
            java.lang.String r6 = "invokerAppId"
            r5.addData(r6, r14)
            java.util.List r6 = r15.getScopeNicks()
            if (r6 == 0) goto L_0x0255
            java.util.List r6 = r15.getScopeNicks()
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0255
            java.util.List r15 = r15.getScopeNicks()
            java.lang.Object r15 = r15.get(r4)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r6 = "scopeName"
            r5.addData(r6, r15)
        L_0x0255:
            java.lang.String r15 = "getComponentAuth"
            boolean r15 = android.text.TextUtils.equals(r15, r0)
            if (r15 != 0) goto L_0x025f
            r15 = 1
            goto L_0x0260
        L_0x025f:
            r15 = 0
        L_0x0260:
            java.lang.String r6 = "authChannel"
            if (r15 == 0) goto L_0x028b
            java.lang.String r15 = "getBusinessAuth"
            boolean r15 = android.text.TextUtils.equals(r15, r0)
            if (r15 != 0) goto L_0x028b
            int r15 = length
            int r15 = r15 + 37
            int r7 = r15 % 128
            setMin = r7
            int r15 = r15 % 2
            java.lang.String r15 = "authorize"
            boolean r15 = android.text.TextUtils.equals(r15, r0)
            if (r15 != 0) goto L_0x028b
            java.lang.String r15 = "getAuthorize"
            boolean r7 = android.text.TextUtils.equals(r15, r0)
            if (r7 == 0) goto L_0x0287
            goto L_0x028b
        L_0x0287:
            r5.addData(r6, r15)
            goto L_0x028e
        L_0x028b:
            r5.addData(r6, r0)
        L_0x028e:
            java.lang.String r15 = r1.getAppId()
            r5.sourceAppId = r15
            java.lang.String r15 = "mtop.taobao.openlink.miniapp.auth.alert"
            r5.api = r15
            r5.needLogin = r3
            java.lang.String r15 = "1.0"
            r5.v = r15
            java.util.HashMap r15 = new java.util.HashMap
            r15.<init>()
            java.lang.String r0 = "appId"
            r15.put(r0, r14)
            r5.setHeaders(r15)
            java.lang.Class<com.alibaba.ariver.app.api.mtop.IMtopProxy> r14 = com.alibaba.ariver.app.api.mtop.IMtopProxy.class
            java.lang.Object r14 = com.alibaba.ariver.kernel.common.RVProxy.get(r14)
            com.alibaba.ariver.app.api.mtop.IMtopProxy r14 = (com.alibaba.ariver.app.api.mtop.IMtopProxy) r14
            com.alibaba.ariver.app.api.mtop.SendMtopResponse r14 = r14.requestInnerSync(r5)
            if (r14 == 0) goto L_0x040e
            int r15 = length
            int r15 = r15 + 97
            int r0 = r15 % 128
            setMin = r0
            int r15 = r15 % 2
            if (r15 == 0) goto L_0x02d4
            boolean r15 = r14.success
            super.hashCode()     // Catch:{ all -> 0x02d2 }
            if (r15 == 0) goto L_0x02ce
            r15 = 1
            goto L_0x02cf
        L_0x02ce:
            r15 = 0
        L_0x02cf:
            if (r15 == 0) goto L_0x03fa
            goto L_0x02d8
        L_0x02d2:
            r13 = move-exception
            throw r13
        L_0x02d4:
            boolean r15 = r14.success
            if (r15 == 0) goto L_0x03fa
        L_0x02d8:
            byte[] r15 = r14.data
            if (r15 == 0) goto L_0x03fa
            int r0 = r15.length
            if (r0 <= 0) goto L_0x03fa
            java.lang.String r0 = new java.lang.String
            r1 = 48
            java.lang.String r2 = ""
            int r1 = android.text.TextUtils.indexOf(r2, r1, r4, r4)
            r2 = 4
            int r1 = 4 - r1
            int[] r2 = new int[r2]
            r2 = {606213438, -1615894682, 170526698, 1079373836} // fill-array
            java.lang.String r1 = length(r1, r2)
            java.lang.String r1 = r1.intern()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.<init>(r15, r1)
            boolean r15 = android.text.TextUtils.isEmpty(r0)
            if (r15 != 0) goto L_0x0308
            r15 = 0
            goto L_0x0309
        L_0x0308:
            r15 = 1
        L_0x0309:
            if (r15 == r3) goto L_0x03fa
            int r15 = length
            int r15 = r15 + 79
            int r1 = r15 % 128
            setMin = r1
            int r15 = r15 % 2
            com.alibaba.fastjson.JSONObject r15 = com.alibaba.fastjson.JSON.parseObject(r0)
            java.lang.String r0 = "data"
            com.alibaba.fastjson.JSONObject r15 = r15.getJSONObject(r0)
            if (r15 == 0) goto L_0x03fa
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x03fa
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r13.setSuccess(r14)
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r14 = new com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel
            r14.<init>()
            r13.setAuthContentResult(r14)
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r14 = r13.getAuthContentResult()
            java.lang.String r0 = "appName"
            java.lang.String r0 = r15.getString(r0)
            r14.setAppName(r0)
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r14 = r13.getAuthContentResult()
            java.lang.String r0 = "appLogoLink"
            java.lang.String r0 = r15.getString(r0)
            r14.setAppLogoLink(r0)
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r14 = r13.getAuthContentResult()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.setAgreements(r0)
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r14 = r13.getAuthContentResult()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r14.setIsvAgent(r0)
            java.lang.String r14 = "appAlias"
            java.lang.String r0 = r15.getString(r14)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0388
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r1 = r13.getAuthContentResult()
            java.util.Map r1 = r1.getExtInfo()
            if (r1 != 0) goto L_0x037e
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
        L_0x037e:
            r1.put(r14, r0)
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r14 = r13.getAuthContentResult()
            r14.setExtInfo(r1)
        L_0x0388:
            java.lang.String r14 = "authText"
            com.alibaba.fastjson.JSONArray r14 = r15.getJSONArray(r14)
            java.util.List r14 = com.alibaba.ariver.kernel.common.utils.JSONUtils.toStringArray(r14)
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r0 = r13.getAuthContentResult()
            r0.setAuthText(r14)
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r14 = r13.getAuthContentResult()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r14.setSuccess(r0)
            java.lang.String r14 = "agreements"
            com.alibaba.fastjson.JSONArray r14 = r15.getJSONArray(r14)
            if (r14 == 0) goto L_0x03f4
            int r15 = length
            int r15 = r15 + 55
            int r0 = r15 % 128
            setMin = r0
            int r15 = r15 % 2
            if (r15 == 0) goto L_0x03b8
            r15 = 1
            goto L_0x03b9
        L_0x03b8:
            r15 = 0
        L_0x03b9:
            if (r15 == 0) goto L_0x03c0
            int r15 = r14.size()
            goto L_0x03c5
        L_0x03c0:
            int r15 = r14.size()
            r3 = 0
        L_0x03c5:
            if (r3 >= r15) goto L_0x03f4
            com.alibaba.ariver.permission.openauth.model.result.AuthAgreementModel r0 = new com.alibaba.ariver.permission.openauth.model.result.AuthAgreementModel
            r0.<init>()
            com.alibaba.fastjson.JSONObject r1 = r14.getJSONObject(r3)
            java.lang.String r2 = "link"
            java.lang.String r1 = r1.getString(r2)
            r0.setLink(r1)
            com.alibaba.fastjson.JSONObject r1 = r14.getJSONObject(r3)
            java.lang.String r2 = "name"
            java.lang.String r1 = r1.getString(r2)
            r0.setName(r1)
            com.alibaba.ariver.permission.openauth.model.result.AuthContentResultModel r1 = r13.getAuthContentResult()
            java.util.List r1 = r1.getAgreements()
            r1.add(r0)
            int r3 = r3 + 1
            goto L_0x03c5
        L_0x03f4:
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r13.setSuccess(r14)
            return r13
        L_0x03fa:
            java.lang.Boolean r15 = java.lang.Boolean.FALSE
            r13.setSuccess(r15)
            java.lang.String r15 = r14.errorCode
            r13.setErrorCode(r15)
            java.lang.String r15 = r14.errorMsg
            r13.setErrorMsg(r15)
            byte[] r14 = r14.data
            r13.setData(r14)
        L_0x040e:
            return r13
        L_0x040f:
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r13.setSuccess(r14)
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r14 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.INVALID_PARAM
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r14 = (com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.Error) r14
            int r14 = r14.getErrorCode()
            java.lang.String r14 = java.lang.String.valueOf(r14)
            r13.setErrorCode(r14)
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r14 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.INVALID_PARAM
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r14 = (com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.Error) r14
            java.lang.String r14 = r14.getErrorMessage()
            r13.setErrorMsg(r14)
            int r14 = setMin
            int r14 = r14 + 43
            int r15 = r14 % 128
            length = r15
            int r14 = r14 % 2
            if (r14 != 0) goto L_0x0440
            super.hashCode()     // Catch:{ all -> 0x043e }
            return r13
        L_0x043e:
            r13 = move-exception
            throw r13
        L_0x0440:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.extension.auth.a.a(java.lang.String, com.alibaba.ariver.app.api.App, com.alibaba.ariver.permission.openauth.model.request.AuthSkipRequestModel):com.alibaba.ariver.permission.openauth.model.result.AuthSkipResultModel");
    }

    private static void a(App app) {
        int i = length + 63;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            try {
                PermissionModel permissionModel = ((AppModel) app.getData(AppModel.class)).getPermissionModel();
                if ((permissionModel != null ? '?' : 'X') == '?') {
                    JSONObject nativeApiScopeConfig = permissionModel.getNativeApiScopeConfig();
                    if ((nativeApiScopeConfig != null ? '#' : '=') == '#') {
                        int i3 = length + 125;
                        setMin = i3 % 128;
                        int i4 = i3 % 2;
                        for (String next : nativeApiScopeConfig.keySet()) {
                            String appId = app.getAppId();
                            StringBuilder sb = new StringBuilder();
                            sb.append(next);
                            sb.append("scope");
                            if (SummaryActivity.CHECKED.equals(((KVStorageProxy) RVProxy.get(KVStorageProxy.class)).getString(appId, sb.toString()))) {
                                String appId2 = app.getAppId();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(next);
                                sb2.append("scope");
                                ((KVStorageProxy) RVProxy.get(KVStorageProxy.class)).remove(appId2, sb2.toString());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0215, code lost:
        if (r0 != null) goto L_0x0217;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x0285 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel a(com.alibaba.ariver.app.api.App r22, com.alibaba.ariver.permission.openauth.model.request.AuthExecuteRequestModel r23) {
        /*
            r0 = r22
            com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel r1 = new com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel
            r1.<init>()
            java.util.Map r2 = r23.getAppExtInfo()
            java.lang.String r3 = "callMethod"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "getAuthCode"
            boolean r2 = android.text.TextUtils.equals(r3, r2)
            r4 = 75
            if (r2 == 0) goto L_0x0020
            r2 = 13
            goto L_0x0022
        L_0x0020:
            r2 = 75
        L_0x0022:
            if (r2 == r4) goto L_0x0040
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setSuccess(r0)
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r0 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.FORBIDDEN_ERROR
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r0 = (com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.Error) r0
            int r2 = r0.getErrorCode()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.setErrorCode(r2)
            java.lang.String r0 = r0.getErrorMessage()
            r1.setErrorMsg(r0)
            return r1
        L_0x0040:
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r2 = com.alibaba.ariver.resource.api.models.AppModel.class
            java.lang.Object r2 = r0.getData(r2)
            com.alibaba.ariver.resource.api.models.AppModel r2 = (com.alibaba.ariver.resource.api.models.AppModel) r2
            java.lang.String r4 = r2.getAppId()
            com.alibaba.ariver.resource.api.models.AppInfoModel r5 = r2.getAppInfoModel()
            com.alibaba.ariver.resource.api.models.TemplateConfigModel r5 = r5.getTemplateConfig()
            if (r5 == 0) goto L_0x0070
            com.alibaba.ariver.resource.api.models.AppInfoModel r5 = r2.getAppInfoModel()
            com.alibaba.ariver.resource.api.models.TemplateConfigModel r5 = r5.getTemplateConfig()
            java.lang.String r5 = r5.getTemplateId()
            if (r5 == 0) goto L_0x0070
            com.alibaba.ariver.resource.api.models.AppInfoModel r4 = r2.getAppInfoModel()
            com.alibaba.ariver.resource.api.models.TemplateConfigModel r4 = r4.getTemplateConfig()
            java.lang.String r4 = r4.getTemplateId()
        L_0x0070:
            java.lang.String r5 = r23.getIsvAppId()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x007e
            java.lang.String r4 = r23.getIsvAppId()
        L_0x007e:
            java.lang.Class<com.alibaba.ariver.kernel.common.storage.KVStorageProxy> r5 = com.alibaba.ariver.kernel.common.storage.KVStorageProxy.class
            java.lang.Object r5 = com.alibaba.ariver.kernel.common.RVProxy.get(r5)
            com.alibaba.ariver.kernel.common.storage.KVStorageProxy r5 = (com.alibaba.ariver.kernel.common.storage.KVStorageProxy) r5
            java.lang.String r6 = r2.getAppId()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.alibaba.ariver.resource.api.models.AppInfoModel r8 = r2.getAppInfoModel()
            java.lang.String r8 = r8.getAppKey()
            r7.append(r8)
            java.lang.String r8 = "token"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r5 = r5.getString(r6, r7)
            r6 = 0
            boolean r9 = android.text.TextUtils.isEmpty(r5)
            java.lang.String r11 = "accessToken"
            if (r9 != 0) goto L_0x00c4
            com.alibaba.fastjson.JSONObject r5 = com.alibaba.fastjson.JSONObject.parseObject(r5)
            java.lang.String r6 = r5.getString(r11)
            java.lang.String r7 = "expirationTime"
            java.lang.Long r5 = r5.getLong(r7)
            long r12 = r5.longValue()
            goto L_0x00c6
        L_0x00c4:
            r12 = r6
            r6 = 0
        L_0x00c6:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L_0x00ce
            r5 = 0
            goto L_0x00cf
        L_0x00ce:
            r5 = 1
        L_0x00cf:
            java.lang.String r7 = "requestRecentlyApp onSuccess parseObject error"
            java.lang.String r15 = "TRVLink"
            java.lang.String r14 = "6"
            java.lang.String r3 = "appId"
            java.lang.String r10 = "1.0"
            java.lang.String r9 = "invokerAppId"
            r16 = r8
            java.lang.String r8 = "mainAppId"
            java.lang.String r0 = "data"
            r17 = r7
            java.lang.String r7 = "publicInfo"
            r18 = 2
            r19 = r15
            r15 = 1
            if (r5 == r15) goto L_0x02d9
            long r20 = java.lang.System.currentTimeMillis()
            int r5 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r5 > 0) goto L_0x00f6
            goto L_0x02d9
        L_0x00f6:
            com.alibaba.ariver.app.api.mtop.SendMtopParams r5 = new com.alibaba.ariver.app.api.mtop.SendMtopParams
            r5.<init>()
            java.lang.String r12 = r2.getAppId()
            r5.sourceAppId = r12
            r5.addData(r11, r6)
            com.alibaba.fastjson.JSONObject r12 = new com.alibaba.fastjson.JSONObject
            r12.<init>()
            java.util.List r13 = r23.getScopeNicks()
            java.util.Iterator r13 = r13.iterator()
        L_0x0111:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x014e
            int r15 = length
            int r15 = r15 + 69
            r20 = r14
            int r14 = r15 % 128
            setMin = r14
            int r15 = r15 % 2
            if (r15 == 0) goto L_0x0128
            r14 = 99
            goto L_0x0129
        L_0x0128:
            r14 = 5
        L_0x0129:
            r15 = 5
            if (r14 == r15) goto L_0x013f
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Boolean r15 = java.lang.Boolean.TRUE
            r12.put((java.lang.String) r14, (java.lang.Object) r15)
            r14 = 0
            super.hashCode()     // Catch:{ all -> 0x013c }
            goto L_0x014b
        L_0x013c:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x013f:
            r14 = 0
            java.lang.Object r15 = r13.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r12.put((java.lang.String) r15, (java.lang.Object) r14)
        L_0x014b:
            r14 = r20
            goto L_0x0111
        L_0x014e:
            r20 = r14
            java.lang.String r2 = r2.getAppId()
            r5.addData(r8, r2)
            r5.addData(r9, r4)
            java.lang.String r2 = r12.toJSONString()
            java.lang.String r8 = "scopeAuthDiffs"
            r5.addData(r8, r2)
            java.lang.String r2 = "mtop.taobao.miniapp.auth.change"
            r5.api = r2
            r5.v = r10
            r2 = 1
            r5.needLogin = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r2.put(r3, r4)
            r5.setHeaders(r2)
            java.lang.Class<com.alibaba.ariver.app.api.mtop.IMtopProxy> r2 = com.alibaba.ariver.app.api.mtop.IMtopProxy.class
            java.lang.Object r2 = com.alibaba.ariver.kernel.common.RVProxy.get(r2)
            com.alibaba.ariver.app.api.mtop.IMtopProxy r2 = (com.alibaba.ariver.app.api.mtop.IMtopProxy) r2
            com.alibaba.ariver.app.api.mtop.SendMtopResponse r2 = r2.requestInnerSync(r5)
            if (r2 == 0) goto L_0x0187
            r3 = 1
            goto L_0x0188
        L_0x0187:
            r3 = 0
        L_0x0188:
            r4 = 1
            if (r3 == r4) goto L_0x018d
            goto L_0x02b7
        L_0x018d:
            int r3 = length
            int r3 = r3 + 93
            int r4 = r3 % 128
            setMin = r4
            int r3 = r3 % 2
            boolean r3 = r2.success
            if (r3 == 0) goto L_0x02b7
            int r3 = setMin
            r4 = 13
            int r3 = r3 + r4
            int r4 = r3 % 128
            length = r4
            int r3 = r3 % 2
            byte[] r2 = r2.data     // Catch:{ Exception -> 0x029c }
            if (r2 == 0) goto L_0x01ac
            r3 = 0
            goto L_0x01ad
        L_0x01ac:
            r3 = 1
        L_0x01ad:
            r4 = 1
            if (r3 == r4) goto L_0x0290
            int r3 = r2.length     // Catch:{ Exception -> 0x029c }
            if (r3 <= 0) goto L_0x0290
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x029c }
            float r4 = android.media.AudioTrack.getMaxVolume()     // Catch:{ Exception -> 0x029c }
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            int r4 = 6 - r4
            r5 = 4
            int[] r5 = new int[r5]     // Catch:{ Exception -> 0x029c }
            r8 = 606213438(0x2422153e, float:3.5146143E-17)
            r9 = 0
            r5[r9] = r8     // Catch:{ Exception -> 0x029c }
            r8 = -1615894682(0xffffffff9faf6766, float:-7.428644E-20)
            r9 = 1
            r5[r9] = r8     // Catch:{ Exception -> 0x029c }
            r8 = 170526698(0xa2a07ea, float:8.186691E-33)
            r5[r18] = r8     // Catch:{ Exception -> 0x029c }
            r8 = 3
            r9 = 1079373836(0x4055f00c, float:3.3427763)
            r5[r8] = r9     // Catch:{ Exception -> 0x029c }
            java.lang.String r4 = length(r4, r5)     // Catch:{ Exception -> 0x029c }
            java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x029c }
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ Exception -> 0x029c }
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x029c }
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x029c }
            if (r2 != 0) goto L_0x0290
            int r2 = length
            int r2 = r2 + 33
            int r4 = r2 % 128
            setMin = r4
            int r2 = r2 % 2
            if (r2 == 0) goto L_0x01fb
            r9 = 0
            goto L_0x01fc
        L_0x01fb:
            r9 = 1
        L_0x01fc:
            if (r9 == 0) goto L_0x0209
            com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r3)     // Catch:{ Exception -> 0x029c }
            com.alibaba.fastjson.JSONObject r0 = r2.getJSONObject(r0)     // Catch:{ Exception -> 0x029c }
            if (r0 == 0) goto L_0x0290
            goto L_0x0217
        L_0x0209:
            com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r3)     // Catch:{ Exception -> 0x029c }
            com.alibaba.fastjson.JSONObject r0 = r2.getJSONObject(r0)     // Catch:{ Exception -> 0x029c }
            r2 = 54
            r3 = 0
            int r2 = r2 / r3
            if (r0 == 0) goto L_0x0290
        L_0x0217:
            boolean r2 = r0.isEmpty()     // Catch:{ Exception -> 0x029c }
            if (r2 != 0) goto L_0x0290
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x029c }
            r1.setSuccess(r2)     // Catch:{ Exception -> 0x029c }
            java.util.List r2 = r23.getScopeNicks()     // Catch:{ Exception -> 0x029c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x029c }
        L_0x022a:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x029c }
            if (r3 == 0) goto L_0x0259
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x029c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x029c }
            java.lang.Class<com.alibaba.ariver.kernel.common.storage.KVStorageProxy> r4 = com.alibaba.ariver.kernel.common.storage.KVStorageProxy.class
            java.lang.Object r4 = com.alibaba.ariver.kernel.common.RVProxy.get(r4)     // Catch:{ Exception -> 0x029c }
            com.alibaba.ariver.kernel.common.storage.KVStorageProxy r4 = (com.alibaba.ariver.kernel.common.storage.KVStorageProxy) r4     // Catch:{ Exception -> 0x029c }
            java.lang.String r5 = r23.getAppId()     // Catch:{ Exception -> 0x029c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x029c }
            r8.<init>()     // Catch:{ Exception -> 0x029c }
            r8.append(r3)     // Catch:{ Exception -> 0x029c }
            java.lang.String r3 = "scope"
            r8.append(r3)     // Catch:{ Exception -> 0x029c }
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x029c }
            java.lang.String r8 = "true"
            r4.putString(r5, r3, r8)     // Catch:{ Exception -> 0x029c }
            goto L_0x022a
        L_0x0259:
            java.util.Map r2 = r1.getExtInfo()     // Catch:{ Exception -> 0x0285 }
            if (r2 != 0) goto L_0x0264
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x0285 }
            r2.<init>()     // Catch:{ Exception -> 0x0285 }
        L_0x0264:
            r2.put(r11, r6)     // Catch:{ Exception -> 0x0285 }
            boolean r3 = r0.containsKey(r7)     // Catch:{ Exception -> 0x0285 }
            if (r3 == 0) goto L_0x0270
            r3 = 28
            goto L_0x0272
        L_0x0270:
            r3 = 98
        L_0x0272:
            r4 = 28
            if (r3 == r4) goto L_0x0277
            goto L_0x0282
        L_0x0277:
            com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ Exception -> 0x0285 }
            java.lang.String r0 = r0.toJSONString()     // Catch:{ Exception -> 0x0285 }
            r2.put(r7, r0)     // Catch:{ Exception -> 0x0285 }
        L_0x0282:
            r1.setExtInfo(r2)     // Catch:{ Exception -> 0x0285 }
        L_0x0285:
            java.util.List r0 = r23.getScopeNicks()     // Catch:{ Exception -> 0x029c }
            r1.setSuccessScopes(r0)     // Catch:{ Exception -> 0x029c }
            goto L_0x0290
        L_0x028d:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0290:
            int r0 = setMin
            int r0 = r0 + 105
            int r2 = r0 % 128
            length = r2
            int r0 = r0 % 2
            goto L_0x045b
        L_0x029c:
            r0 = move-exception
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setSuccess(r2)
            r5 = r20
            r1.setErrorCode(r5)
            java.lang.String r2 = r0.getMessage()
            r1.setErrorMsg(r2)
            r6 = r17
            r12 = r19
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r12, r6, r0)
            goto L_0x045b
        L_0x02b7:
            if (r2 == 0) goto L_0x045b
            int r0 = length
            int r0 = r0 + 19
            int r3 = r0 % 128
            setMin = r3
            int r0 = r0 % 2
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setSuccess(r0)
            java.lang.String r0 = r2.errorCode
            r1.setErrorCode(r0)
            java.lang.String r0 = r2.errorMsg
            r1.setErrorMsg(r0)
            byte[] r0 = r2.data
            r1.setData(r0)
            goto L_0x045b
        L_0x02d9:
            r5 = r14
            r6 = r17
            r12 = r19
            com.alibaba.ariver.app.api.mtop.SendMtopParams r13 = new com.alibaba.ariver.app.api.mtop.SendMtopParams
            r13.<init>()
            java.lang.String r14 = r2.getAppId()
            r13.sourceAppId = r14
            com.alibaba.fastjson.JSONArray r14 = new com.alibaba.fastjson.JSONArray
            r14.<init>()
            java.util.List r15 = r23.getScopeNicks()
            r14.addAll(r15)
            java.lang.String r2 = r2.getAppId()
            r13.addData(r8, r2)
            r13.addData(r9, r4)
            java.lang.String r2 = r14.toJSONString()
            java.lang.String r8 = "authScopes"
            r13.addData(r8, r2)
            java.lang.String r2 = "mtop.taobao.openlink.miniapp.auth.token.get"
            r13.api = r2
            r13.v = r10
            r2 = 1
            r13.needLogin = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r2.put(r3, r4)
            r13.setHeaders(r2)
            java.lang.Class<com.alibaba.ariver.app.api.mtop.IMtopProxy> r2 = com.alibaba.ariver.app.api.mtop.IMtopProxy.class
            java.lang.Object r2 = com.alibaba.ariver.kernel.common.RVProxy.get(r2)
            com.alibaba.ariver.app.api.mtop.IMtopProxy r2 = (com.alibaba.ariver.app.api.mtop.IMtopProxy) r2
            com.alibaba.ariver.app.api.mtop.SendMtopResponse r2 = r2.requestInnerSync(r13)
            if (r2 == 0) goto L_0x043b
            boolean r3 = r2.success
            if (r3 == 0) goto L_0x043b
            byte[] r2 = r2.data     // Catch:{ Exception -> 0x0427 }
            if (r2 == 0) goto L_0x0334
            r3 = 1
            goto L_0x0335
        L_0x0334:
            r3 = 0
        L_0x0335:
            r4 = 1
            if (r3 == r4) goto L_0x033a
            goto L_0x045b
        L_0x033a:
            int r3 = r2.length     // Catch:{ Exception -> 0x0427 }
            if (r3 <= 0) goto L_0x045b
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0427 }
            int r4 = android.view.ViewConfiguration.getKeyRepeatDelay()     // Catch:{ Exception -> 0x0427 }
            int r4 = r4 >> 16
            r8 = 5
            int r4 = 5 - r4
            r8 = 4
            int[] r8 = new int[r8]     // Catch:{ Exception -> 0x0427 }
            r9 = 606213438(0x2422153e, float:3.5146143E-17)
            r10 = 0
            r8[r10] = r9     // Catch:{ Exception -> 0x0427 }
            r9 = -1615894682(0xffffffff9faf6766, float:-7.428644E-20)
            r10 = 1
            r8[r10] = r9     // Catch:{ Exception -> 0x0427 }
            r9 = 170526698(0xa2a07ea, float:8.186691E-33)
            r8[r18] = r9     // Catch:{ Exception -> 0x0427 }
            r9 = 3
            r10 = 1079373836(0x4055f00c, float:3.3427763)
            r8[r9] = r10     // Catch:{ Exception -> 0x0427 }
            java.lang.String r4 = length(r4, r8)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r4 = r4.intern()     // Catch:{ Exception -> 0x0427 }
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)     // Catch:{ Exception -> 0x0427 }
            r3.<init>(r2, r4)     // Catch:{ Exception -> 0x0427 }
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0427 }
            if (r2 != 0) goto L_0x045b
            com.alibaba.fastjson.JSONObject r2 = com.alibaba.fastjson.JSON.parseObject(r3)     // Catch:{ Exception -> 0x0427 }
            com.alibaba.fastjson.JSONObject r0 = r2.getJSONObject(r0)     // Catch:{ Exception -> 0x0427 }
            if (r0 == 0) goto L_0x045b
            boolean r2 = r0.isEmpty()     // Catch:{ Exception -> 0x0427 }
            if (r2 != 0) goto L_0x045b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0427 }
            r1.setSuccess(r2)     // Catch:{ Exception -> 0x0427 }
            java.lang.Class<com.alibaba.ariver.kernel.common.storage.KVStorageProxy> r2 = com.alibaba.ariver.kernel.common.storage.KVStorageProxy.class
            java.lang.Object r2 = com.alibaba.ariver.kernel.common.RVProxy.get(r2)     // Catch:{ Exception -> 0x0427 }
            com.alibaba.ariver.kernel.common.storage.KVStorageProxy r2 = (com.alibaba.ariver.kernel.common.storage.KVStorageProxy) r2     // Catch:{ Exception -> 0x0427 }
            java.lang.String r3 = r23.getAppId()     // Catch:{ Exception -> 0x0427 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0427 }
            r4.<init>()     // Catch:{ Exception -> 0x0427 }
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r8 = com.alibaba.ariver.resource.api.models.AppModel.class
            r9 = r22
            java.lang.Object r8 = r9.getData(r8)     // Catch:{ Exception -> 0x0427 }
            com.alibaba.ariver.resource.api.models.AppModel r8 = (com.alibaba.ariver.resource.api.models.AppModel) r8     // Catch:{ Exception -> 0x0427 }
            com.alibaba.ariver.resource.api.models.AppInfoModel r8 = r8.getAppInfoModel()     // Catch:{ Exception -> 0x0427 }
            java.lang.String r8 = r8.getAppKey()     // Catch:{ Exception -> 0x0427 }
            r4.append(r8)     // Catch:{ Exception -> 0x0427 }
            r8 = r16
            r4.append(r8)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0427 }
            java.lang.String r8 = r0.toJSONString()     // Catch:{ Exception -> 0x0427 }
            r2.putString(r3, r4, r8)     // Catch:{ Exception -> 0x0427 }
            java.util.List r2 = r23.getScopeNicks()     // Catch:{ Exception -> 0x0427 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0427 }
        L_0x03ca:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x0427 }
            if (r3 == 0) goto L_0x03f9
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x0427 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0427 }
            java.lang.Class<com.alibaba.ariver.kernel.common.storage.KVStorageProxy> r4 = com.alibaba.ariver.kernel.common.storage.KVStorageProxy.class
            java.lang.Object r4 = com.alibaba.ariver.kernel.common.RVProxy.get(r4)     // Catch:{ Exception -> 0x0427 }
            com.alibaba.ariver.kernel.common.storage.KVStorageProxy r4 = (com.alibaba.ariver.kernel.common.storage.KVStorageProxy) r4     // Catch:{ Exception -> 0x0427 }
            java.lang.String r8 = r23.getAppId()     // Catch:{ Exception -> 0x0427 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0427 }
            r9.<init>()     // Catch:{ Exception -> 0x0427 }
            r9.append(r3)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r3 = "scope"
            r9.append(r3)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r3 = r9.toString()     // Catch:{ Exception -> 0x0427 }
            java.lang.String r9 = "true"
            r4.putString(r8, r3, r9)     // Catch:{ Exception -> 0x0427 }
            goto L_0x03ca
        L_0x03f9:
            java.util.List r2 = r23.getScopeNicks()     // Catch:{ Exception -> 0x0427 }
            r1.setSuccessScopes(r2)     // Catch:{ Exception -> 0x0427 }
            java.lang.String r2 = r0.getString(r11)     // Catch:{ Exception -> 0x045b }
            java.util.Map r3 = r1.getExtInfo()     // Catch:{ Exception -> 0x045b }
            if (r3 != 0) goto L_0x040f
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x045b }
            r3.<init>()     // Catch:{ Exception -> 0x045b }
        L_0x040f:
            r3.put(r11, r2)     // Catch:{ Exception -> 0x045b }
            boolean r2 = r0.containsKey(r7)     // Catch:{ Exception -> 0x045b }
            if (r2 == 0) goto L_0x0423
            com.alibaba.fastjson.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ Exception -> 0x045b }
            java.lang.String r0 = r0.toJSONString()     // Catch:{ Exception -> 0x045b }
            r3.put(r7, r0)     // Catch:{ Exception -> 0x045b }
        L_0x0423:
            r1.setExtInfo(r3)     // Catch:{ Exception -> 0x045b }
            goto L_0x045b
        L_0x0427:
            r0 = move-exception
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.setSuccess(r2)
            r1.setErrorCode(r5)
            java.lang.String r2 = r0.getMessage()
            r1.setErrorMsg(r2)
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r12, r6, r0)
            goto L_0x045b
        L_0x043b:
            if (r2 == 0) goto L_0x045b
            int r0 = length
            int r0 = r0 + 53
            int r3 = r0 % 128
            setMin = r3
            int r0 = r0 % 2
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setSuccess(r0)
            java.lang.String r0 = r2.errorCode
            r1.setErrorCode(r0)
            java.lang.String r0 = r2.errorMsg
            r1.setErrorMsg(r0)
            byte[] r0 = r2.data
            r1.setData(r0)
        L_0x045b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.extension.auth.a.a(com.alibaba.ariver.app.api.App, com.alibaba.ariver.permission.openauth.model.request.AuthExecuteRequestModel):com.alibaba.ariver.permission.openauth.model.result.AuthExecuteResultModel");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x017a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r0.getExtendInfos() != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r0.getExtendInfos() != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f5, code lost:
        if ((r3 != null ? 'L' : 'X') != 'X') goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0100, code lost:
        if (r9.getPluginModels() != null) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r0 != null) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.alibaba.ariver.app.api.App r9, java.lang.String r10) {
        /*
            int r0 = setMin
            int r0 = r0 + 35
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x001e
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r0 = com.alibaba.ariver.resource.api.models.AppModel.class
            java.lang.Object r0 = r9.getData(r0)
            com.alibaba.ariver.resource.api.models.AppModel r0 = (com.alibaba.ariver.resource.api.models.AppModel) r0
            super.hashCode()     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x017a
            goto L_0x0028
        L_0x001c:
            r9 = move-exception
            throw r9
        L_0x001e:
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r0 = com.alibaba.ariver.resource.api.models.AppModel.class
            java.lang.Object r0 = r9.getData(r0)
            com.alibaba.ariver.resource.api.models.AppModel r0 = (com.alibaba.ariver.resource.api.models.AppModel) r0
            if (r0 == 0) goto L_0x017a
        L_0x0028:
            int r3 = length
            int r3 = r3 + 25
            int r4 = r3 % 128
            setMin = r4
            int r3 = r3 % 2
            java.lang.String r4 = "official"
            java.lang.String r5 = "true"
            if (r3 == 0) goto L_0x0044
            com.alibaba.fastjson.JSONObject r3 = r0.getExtendInfos()
            r6 = 61
            int r6 = r6 / r2
            if (r3 == 0) goto L_0x0059
            goto L_0x004a
        L_0x0042:
            r9 = move-exception
            throw r9
        L_0x0044:
            com.alibaba.fastjson.JSONObject r3 = r0.getExtendInfos()
            if (r3 == 0) goto L_0x0059
        L_0x004a:
            com.alibaba.fastjson.JSONObject r3 = r0.getExtendInfos()
            java.lang.String r3 = r3.getString(r4)
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L_0x0059
            return r2
        L_0x0059:
            java.lang.String r3 = r0.getAppId()     // Catch:{ Exception -> 0x0178 }
            boolean r3 = android.text.TextUtils.equals(r3, r10)     // Catch:{ Exception -> 0x0178 }
            r6 = 1
            if (r3 != 0) goto L_0x0066
            r3 = 1
            goto L_0x0067
        L_0x0066:
            r3 = 0
        L_0x0067:
            if (r3 == 0) goto L_0x0155
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0178 }
            if (r3 != 0) goto L_0x0155
            int r3 = setMin
            int r3 = r3 + 79
            int r7 = r3 % 128
            length = r7
            int r3 = r3 % 2
            com.alibaba.ariver.resource.api.models.AppInfoModel r3 = r0.getAppInfoModel()
            java.util.List r3 = r3.getPlugins()
            if (r3 == 0) goto L_0x0085
            r7 = 0
            goto L_0x0086
        L_0x0085:
            r7 = 1
        L_0x0086:
            if (r7 == r6) goto L_0x00c8
            java.util.Iterator r3 = r3.iterator()
        L_0x008c:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0094
            r7 = 0
            goto L_0x0095
        L_0x0094:
            r7 = 1
        L_0x0095:
            if (r7 == 0) goto L_0x0098
            goto L_0x00c8
        L_0x0098:
            int r7 = length
            int r7 = r7 + 35
            int r8 = r7 % 128
            setMin = r8
            int r7 = r7 % 2
            java.lang.Object r7 = r3.next()
            com.alibaba.ariver.resource.api.models.PluginModel r7 = (com.alibaba.ariver.resource.api.models.PluginModel) r7
            java.lang.String r8 = r7.getAppId()
            boolean r8 = android.text.TextUtils.equals(r8, r10)
            if (r8 == 0) goto L_0x008c
            com.alibaba.fastjson.JSONObject r9 = r7.getExtendInfo()
            if (r9 == 0) goto L_0x00c7
            com.alibaba.fastjson.JSONObject r9 = r7.getExtendInfo()
            java.lang.String r9 = r9.getString(r4)
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L_0x00c7
            return r6
        L_0x00c7:
            return r2
        L_0x00c8:
            java.lang.Class<com.alibaba.ariver.resource.api.models.DynamicPluginInfo> r3 = com.alibaba.ariver.resource.api.models.DynamicPluginInfo.class
            java.lang.Object r9 = r9.getData(r3)
            com.alibaba.ariver.resource.api.models.DynamicPluginInfo r9 = (com.alibaba.ariver.resource.api.models.DynamicPluginInfo) r9
            if (r9 == 0) goto L_0x00d4
            r3 = 0
            goto L_0x00d5
        L_0x00d4:
            r3 = 1
        L_0x00d5:
            if (r3 == 0) goto L_0x00d9
            goto L_0x0155
        L_0x00d9:
            int r3 = length
            int r3 = r3 + 23
            int r7 = r3 % 128
            setMin = r7
            int r3 = r3 % 2
            if (r3 == 0) goto L_0x00fc
            java.util.List r3 = r9.getPluginModels()     // Catch:{ Exception -> 0x00fa }
            super.hashCode()     // Catch:{ all -> 0x00f8 }
            r1 = 88
            if (r3 == 0) goto L_0x00f3
            r3 = 76
            goto L_0x00f5
        L_0x00f3:
            r3 = 88
        L_0x00f5:
            if (r3 == r1) goto L_0x0155
            goto L_0x0102
        L_0x00f8:
            r9 = move-exception
            throw r9
        L_0x00fa:
            r9 = move-exception
            throw r9
        L_0x00fc:
            java.util.List r1 = r9.getPluginModels()
            if (r1 == 0) goto L_0x0155
        L_0x0102:
            java.util.List r9 = r9.getPluginModels()
            java.util.Iterator r9 = r9.iterator()
        L_0x010a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x0112
            r1 = 1
            goto L_0x0113
        L_0x0112:
            r1 = 0
        L_0x0113:
            if (r1 == 0) goto L_0x0155
            java.lang.Object r1 = r9.next()
            com.alibaba.ariver.resource.api.models.PluginModel r1 = (com.alibaba.ariver.resource.api.models.PluginModel) r1
            java.lang.String r3 = r1.getAppId()
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto L_0x0127
            r3 = 1
            goto L_0x0128
        L_0x0127:
            r3 = 0
        L_0x0128:
            if (r3 == r6) goto L_0x012b
            goto L_0x010a
        L_0x012b:
            com.alibaba.fastjson.JSONObject r9 = r1.getExtendInfo()
            r10 = 37
            if (r9 == 0) goto L_0x0136
            r9 = 37
            goto L_0x0138
        L_0x0136:
            r9 = 22
        L_0x0138:
            if (r9 == r10) goto L_0x013b
            goto L_0x0154
        L_0x013b:
            int r9 = setMin
            int r9 = r9 + 11
            int r10 = r9 % 128
            length = r10
            int r9 = r9 % 2
            com.alibaba.fastjson.JSONObject r9 = r1.getExtendInfo()     // Catch:{ Exception -> 0x0178 }
            java.lang.String r9 = r9.getString(r4)     // Catch:{ Exception -> 0x0178 }
            boolean r9 = r5.equals(r9)     // Catch:{ Exception -> 0x0178 }
            if (r9 == 0) goto L_0x0154
            return r6
        L_0x0154:
            return r2
        L_0x0155:
            com.alibaba.fastjson.JSONObject r9 = r0.getExtendInfos()
            if (r9 == 0) goto L_0x0177
            com.alibaba.fastjson.JSONObject r9 = r0.getExtendInfos()
            java.lang.String r9 = r9.getString(r4)
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L_0x0177
            int r9 = length
            int r9 = r9 + 75
            int r10 = r9 % 128
            setMin = r10
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x0176
            return r2
        L_0x0176:
            return r6
        L_0x0177:
            return r2
        L_0x0178:
            r9 = move-exception
            throw r9
        L_0x017a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.extension.auth.a.a(com.alibaba.ariver.app.api.App, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r7.getPermissionModel() != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r7.getPermissionModel() != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (android.text.TextUtils.equals(r7.getAppId(), r8) != false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (android.text.TextUtils.isEmpty(r8) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        r0 = '/';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r0 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r0 == '/') goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        r7 = r7.getAppInfoModel().getPlugins();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        if (r7 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        r4 = 'K';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r4 = 'C';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r4 == 'C') goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0068, code lost:
        r0 = setMin + 121;
        length = r0 % 128;
        r0 = r0 % 2;
        r7 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (r7.hasNext() == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007e, code lost:
        r0 = 'Y';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        r0 = 'U';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if (r0 == 'U') goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r0 = setMin + 103;
        length = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008f, code lost:
        if ((r0 % 2) != 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        r0 = r7.next();
        r4 = android.text.TextUtils.equals(r0.getAppId(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        if (r4 == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        r0 = r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        if (android.text.TextUtils.equals(r0.getAppId(), r8) == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        r4 = 'V';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        r4 = 'L';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r7 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00be, code lost:
        if (r4 == 'L') goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c2, code lost:
        r7 = length + 117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        setMin = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d0, code lost:
        if (r0.getPermission() == null) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d2, code lost:
        r7 = 'F';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d5, code lost:
        r7 = ')';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d7, code lost:
        if (r7 == 'F') goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00da, code lost:
        r7 = setMin + 123;
        length = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e4, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e5, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e6, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e7, code lost:
        r7 = com.alibaba.ariver.resource.content.ResourcePackagePool.getInstance().getPackage(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f1, code lost:
        if ((r7 instanceof com.alibaba.ariver.resource.content.PluginResourcePackage) == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f3, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f5, code lost:
        r0 = 'V';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f7, code lost:
        if (r0 == 'V') goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00f9, code lost:
        r0 = setMin + 103;
        length = r0 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0103, code lost:
        if ((r0 % 2) != 0) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r7 = ((com.alibaba.ariver.resource.content.PluginResourcePackage) r7).getPluginModel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r0 = r2.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x010c, code lost:
        if (r7 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0111, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r7 != null) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0113, code lost:
        r7 = ((com.alibaba.ariver.resource.content.PluginResourcePackage) r7).getPluginModel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0119, code lost:
        if (r7 == null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0123, code lost:
        if (android.text.TextUtils.equals(r7.getAppId(), r8) == false) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x012b, code lost:
        if (r7.getPermission() == null) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x012d, code lost:
        r7 = kotlin.text.Typography.quote;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0130, code lost:
        r7 = ']';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0132, code lost:
        if (r7 == ']') goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0134, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0135, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0136, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.alibaba.ariver.resource.api.models.AppModel r7, java.lang.String r8) {
        /*
            int r0 = length
            int r0 = r0 + 103
            int r1 = r0 % 128
            setMin = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0016
            super.hashCode()     // Catch:{ all -> 0x0014 }
            if (r7 == 0) goto L_0x0136
            goto L_0x0018
        L_0x0014:
            r7 = move-exception
            throw r7
        L_0x0016:
            if (r7 == 0) goto L_0x0136
        L_0x0018:
            int r0 = length
            int r0 = r0 + 35
            int r3 = r0 % 128
            setMin = r3
            int r0 = r0 % 2
            r3 = 1
            if (r0 == 0) goto L_0x0031
            com.alibaba.ariver.resource.api.models.PermissionModel r0 = r7.getPermissionModel()
            r4 = 79
            int r4 = r4 / r1
            if (r0 == 0) goto L_0x0038
            goto L_0x0037
        L_0x002f:
            r7 = move-exception
            throw r7
        L_0x0031:
            com.alibaba.ariver.resource.api.models.PermissionModel r0 = r7.getPermissionModel()
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            return r3
        L_0x0038:
            java.lang.String r0 = r7.getAppId()
            boolean r0 = android.text.TextUtils.equals(r0, r8)
            if (r0 != 0) goto L_0x0136
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r4 = 47
            if (r0 != 0) goto L_0x004d
            r0 = 47
            goto L_0x004f
        L_0x004d:
            r0 = 16
        L_0x004f:
            if (r0 == r4) goto L_0x0053
            goto L_0x0136
        L_0x0053:
            com.alibaba.ariver.resource.api.models.AppInfoModel r7 = r7.getAppInfoModel()
            java.util.List r7 = r7.getPlugins()
            r0 = 67
            if (r7 == 0) goto L_0x0062
            r4 = 75
            goto L_0x0064
        L_0x0062:
            r4 = 67
        L_0x0064:
            r5 = 86
            if (r4 == r0) goto L_0x00e7
            int r0 = setMin
            int r0 = r0 + 121
            int r4 = r0 % 128
            length = r4
            int r0 = r0 % 2
            java.util.Iterator r7 = r7.iterator()
        L_0x0076:
            boolean r0 = r7.hasNext()
            r4 = 85
            if (r0 == 0) goto L_0x0081
            r0 = 89
            goto L_0x0083
        L_0x0081:
            r0 = 85
        L_0x0083:
            if (r0 == r4) goto L_0x00e7
            int r0 = setMin
            int r0 = r0 + 103
            int r4 = r0 % 128
            length = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x00a7
            java.lang.Object r0 = r7.next()
            com.alibaba.ariver.resource.api.models.PluginModel r0 = (com.alibaba.ariver.resource.api.models.PluginModel) r0
            java.lang.String r4 = r0.getAppId()
            boolean r4 = android.text.TextUtils.equals(r4, r8)
            super.hashCode()     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x0076
            goto L_0x00c0
        L_0x00a5:
            r7 = move-exception
            throw r7
        L_0x00a7:
            java.lang.Object r0 = r7.next()
            com.alibaba.ariver.resource.api.models.PluginModel r0 = (com.alibaba.ariver.resource.api.models.PluginModel) r0
            java.lang.String r4 = r0.getAppId()
            boolean r4 = android.text.TextUtils.equals(r4, r8)
            r6 = 76
            if (r4 == 0) goto L_0x00bc
            r4 = 86
            goto L_0x00be
        L_0x00bc:
            r4 = 76
        L_0x00be:
            if (r4 == r6) goto L_0x0076
        L_0x00c0:
            int r7 = length     // Catch:{ Exception -> 0x0111 }
            int r7 = r7 + 117
            int r4 = r7 % 128
            setMin = r4     // Catch:{ Exception -> 0x00e5 }
            int r7 = r7 % 2
            com.alibaba.fastjson.JSONObject r7 = r0.getPermission()
            r0 = 70
            if (r7 == 0) goto L_0x00d5
            r7 = 70
            goto L_0x00d7
        L_0x00d5:
            r7 = 41
        L_0x00d7:
            if (r7 == r0) goto L_0x00da
            goto L_0x00e7
        L_0x00da:
            int r7 = setMin
            int r7 = r7 + 123
            int r8 = r7 % 128
            length = r8
            int r7 = r7 % 2
            return r3
        L_0x00e5:
            r7 = move-exception
            throw r7
        L_0x00e7:
            com.alibaba.ariver.resource.content.ResourcePackagePool r7 = com.alibaba.ariver.resource.content.ResourcePackagePool.getInstance()
            com.alibaba.ariver.resource.api.content.ResourcePackage r7 = r7.getPackage(r8)
            boolean r0 = r7 instanceof com.alibaba.ariver.resource.content.PluginResourcePackage
            if (r0 == 0) goto L_0x00f5
            r0 = 4
            goto L_0x00f7
        L_0x00f5:
            r0 = 86
        L_0x00f7:
            if (r0 == r5) goto L_0x0136
            int r0 = setMin
            int r0 = r0 + 103
            int r4 = r0 % 128
            length = r4
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0113
            com.alibaba.ariver.resource.content.PluginResourcePackage r7 = (com.alibaba.ariver.resource.content.PluginResourcePackage) r7     // Catch:{ Exception -> 0x0111 }
            com.alibaba.ariver.resource.api.models.PluginModel r7 = r7.getPluginModel()     // Catch:{ Exception -> 0x0111 }
            int r0 = r2.length     // Catch:{ all -> 0x010f }
            if (r7 == 0) goto L_0x0136
            goto L_0x011b
        L_0x010f:
            r7 = move-exception
            throw r7
        L_0x0111:
            r7 = move-exception
            goto L_0x0135
        L_0x0113:
            com.alibaba.ariver.resource.content.PluginResourcePackage r7 = (com.alibaba.ariver.resource.content.PluginResourcePackage) r7
            com.alibaba.ariver.resource.api.models.PluginModel r7 = r7.getPluginModel()
            if (r7 == 0) goto L_0x0136
        L_0x011b:
            java.lang.String r0 = r7.getAppId()
            boolean r8 = android.text.TextUtils.equals(r0, r8)
            if (r8 == 0) goto L_0x0136
            com.alibaba.fastjson.JSONObject r7 = r7.getPermission()     // Catch:{ Exception -> 0x0111 }
            r8 = 93
            if (r7 == 0) goto L_0x0130
            r7 = 34
            goto L_0x0132
        L_0x0130:
            r7 = 93
        L_0x0132:
            if (r7 == r8) goto L_0x0136
            return r3
        L_0x0135:
            throw r7
        L_0x0136:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.extension.auth.a.a(com.alibaba.ariver.resource.api.models.AppModel, java.lang.String):boolean");
    }

    private static String length(int i, int[] iArr) {
        int i2;
        int[] iArr2;
        char[] cArr;
        char[] cArr2;
        int i3 = setMin + 75;
        length = i3 % 128;
        if (i3 % 2 != 0) {
            cArr2 = new char[4];
            cArr = new char[(iArr.length << 1)];
            iArr2 = (int[]) setMax.clone();
            i2 = 0;
        } else {
            cArr2 = new char[3];
            cArr = new char[(iArr.length * 1)];
            try {
                iArr2 = (int[]) setMax.clone();
                i2 = 1;
            } catch (Exception e) {
                throw e;
            }
        }
        while (true) {
            if (i2 >= iArr.length) {
                return new String(cArr, 0, i);
            }
            int i4 = length + 31;
            setMin = i4 % 128;
            int i5 = i4 % 2;
            cArr2[0] = (char) (iArr[i2] >> 16);
            cArr2[1] = (char) iArr[i2];
            int i6 = i2 + 1;
            cArr2[2] = (char) (iArr[i6] >> 16);
            cArr2[3] = (char) iArr[i6];
            onActivityPostResumed.getMin(cArr2, iArr2, false);
            int i7 = i2 << 1;
            cArr[i7] = cArr2[0];
            cArr[i7 + 1] = cArr2[1];
            cArr[i7 + 2] = cArr2[2];
            cArr[i7 + 3] = cArr2[3];
            i2 += 2;
        }
    }
}
