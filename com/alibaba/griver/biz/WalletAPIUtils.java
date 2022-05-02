package com.alibaba.griver.biz;

public class WalletAPIUtils {
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r3 = r6.getExtendInfos();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alipay.iap.android.wallet.acl.base.APIContext createApiContext(com.alibaba.ariver.app.api.Page r6) {
        /*
            java.lang.String r0 = "languages"
            java.lang.String r1 = "clientParams"
            com.alibaba.ariver.app.api.App r2 = r6.getApp()
            java.lang.String r2 = r2.getAppId()
            com.alibaba.ariver.app.api.App r6 = r6.getApp()
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r3 = com.alibaba.ariver.resource.api.models.AppModel.class
            java.lang.Object r6 = r6.getData(r3)
            com.alibaba.ariver.resource.api.models.AppModel r6 = (com.alibaba.ariver.resource.api.models.AppModel) r6
            if (r6 == 0) goto L_0x0027
            com.alibaba.fastjson.JSONObject r3 = r6.getExtendInfos()
            if (r3 == 0) goto L_0x0027
            java.lang.String r4 = "merchantId"
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0029
        L_0x0027:
            java.lang.String r3 = ""
        L_0x0029:
            com.alipay.iap.android.wallet.acl.base.MiniProgramMetaData r4 = new com.alipay.iap.android.wallet.acl.base.MiniProgramMetaData
            r4.<init>(r2, r3)
            if (r6 == 0) goto L_0x00dc
            com.alibaba.ariver.resource.api.models.AppInfoModel r2 = r6.getAppInfoModel()
            if (r2 == 0) goto L_0x0059
            java.lang.String r3 = r2.getName()
            r4.setName(r3)
            java.lang.String r3 = r2.getLogo()
            r4.setLogo(r3)
            java.lang.String r3 = r2.getDesc()
            r4.setDesc(r3)
            java.lang.String r3 = r2.getVersion()
            r4.setDeployVersion(r3)
            java.lang.String r2 = r2.getDeveloperVersion()
            r4.setDeveloperVersion(r2)
        L_0x0059:
            com.alibaba.fastjson.JSONObject r6 = r6.getExtendInfos()
            if (r6 == 0) goto L_0x00dc
            r2 = 2
            r4.setAppType(r2)
            com.alibaba.fastjson.JSONObject r2 = r6.getJSONObject(r1)     // Catch:{ JSONException -> 0x00c1 }
            if (r2 == 0) goto L_0x0079
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c1 }
            com.alibaba.fastjson.JSONObject r1 = r6.getJSONObject(r1)     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r1 = com.alibaba.fastjson.JSON.toJSONString(r1)     // Catch:{ JSONException -> 0x00c1 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x00c1 }
            r4.setClientParams(r2)     // Catch:{ JSONException -> 0x00c1 }
        L_0x0079:
            com.alibaba.fastjson.JSONObject r1 = r6.getJSONObject(r0)     // Catch:{ JSONException -> 0x00c1 }
            if (r1 == 0) goto L_0x008f
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00c1 }
            com.alibaba.fastjson.JSONObject r0 = r6.getJSONObject(r0)     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r0 = com.alibaba.fastjson.JSON.toJSONString(r0)     // Catch:{ JSONException -> 0x00c1 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x00c1 }
            r4.setLanguages(r1)     // Catch:{ JSONException -> 0x00c1 }
        L_0x008f:
            java.lang.String r0 = "acParams"
            com.alibaba.fastjson.JSONObject r0 = r6.getJSONObject(r0)     // Catch:{ JSONException -> 0x00c1 }
            if (r0 == 0) goto L_0x00c1
            boolean r1 = r0.isEmpty()     // Catch:{ JSONException -> 0x00c1 }
            if (r1 != 0) goto L_0x00c1
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ JSONException -> 0x00c1 }
            r1.<init>()     // Catch:{ JSONException -> 0x00c1 }
            java.util.Set r2 = r0.keySet()     // Catch:{ JSONException -> 0x00c1 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x00c1 }
        L_0x00aa:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x00c1 }
            if (r3 == 0) goto L_0x00be
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x00c1 }
            java.lang.String r5 = r0.getString(r3)     // Catch:{ JSONException -> 0x00c1 }
            r1.put(r3, r5)     // Catch:{ JSONException -> 0x00c1 }
            goto L_0x00aa
        L_0x00be:
            r4.setAcParams(r1)     // Catch:{ JSONException -> 0x00c1 }
        L_0x00c1:
            java.lang.String r0 = "acquirerId"
            java.lang.String r0 = r6.getString(r0)
            r4.setAcquirerId(r0)
            java.lang.String r0 = "publishingStatus"
            java.lang.String r0 = r6.getString(r0)
            r4.setPublishStatus(r0)
            java.lang.String r0 = "authClientId"
            java.lang.String r6 = r6.getString(r0)
            r4.setClientId(r6)
        L_0x00dc:
            com.alipay.iap.android.wallet.acl.base.APIContext r6 = new com.alipay.iap.android.wallet.acl.base.APIContext
            r0 = 0
            java.lang.String r1 = "MiniProgram"
            r6.<init>(r1, r4, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.biz.WalletAPIUtils.createApiContext(com.alibaba.ariver.app.api.Page):com.alipay.iap.android.wallet.acl.base.APIContext");
    }
}
