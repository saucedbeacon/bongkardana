package com.ap.zoloz.hummer.connect.h5;

public class ZolozConnectH5Handler {
    public static final String TAG = "ZolozConnectH5Handler";
    public static final String ZIM_IDENTIFY_ACTION = "action";
    public static final String ZIM_IDENTIFY_BIZCONFIG = "bizParam";
    public static final String ZIM_IDENTIFY_CLIENT_CONFIG = "clientConfig";
    public static final String ZIM_IDENTIFY_CONNECT_ID = "connectId";
    public static final String ZIM_IDENTIFY_START_CONNECT = "startConnect";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void identify(com.alibaba.fastjson.JSONObject r6, android.content.Context r7, final com.ap.zoloz.hummer.h5.IH5HandlerCallback r8) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x008b
            if (r7 != 0) goto L_0x0006
            goto L_0x008b
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " jsapi"
            r0.<init>(r1)
            java.lang.String r1 = r6.toJSONString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ZolozConnectH5Handler"
            com.ap.zoloz.hummer.biz.HummerLogger.i(r1, r0)
            java.lang.String r0 = "action"
            java.lang.String r0 = r6.getString(r0)
            boolean r1 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r0)
            if (r1 == 0) goto L_0x002a
            return
        L_0x002a:
            java.lang.String r1 = "startConnect"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008b
            com.ap.zoloz.hummer.connect.api.ConnectFacade r0 = com.ap.zoloz.hummer.connect.api.ConnectFacade.getInstance()
            r0.setContext(r7)
            java.lang.String r7 = "connectId"
            java.lang.String r7 = r6.getString(r7)
            com.ap.zoloz.hummer.connect.api.ConnectRequest r1 = new com.ap.zoloz.hummer.connect.api.ConnectRequest
            r1.<init>()
            r1.connectId = r7
            java.lang.String r7 = "bizParam"
            com.alibaba.fastjson.JSONObject r2 = r6.getJSONObject(r7)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r2 == 0) goto L_0x0063
            int r4 = r2.size()
            if (r4 <= 0) goto L_0x0063
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            java.lang.Object r7 = com.alibaba.fastjson.JSONObject.toJavaObject(r2, r7)
            r3 = r7
            java.util.Map r3 = (java.util.Map) r3
            goto L_0x0076
        L_0x0063:
            java.lang.String r7 = r6.getString(r7)
            boolean r2 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r7)
            if (r2 != 0) goto L_0x0076
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Object r7 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r7, r2)
            r3 = r7
            java.util.Map r3 = (java.util.Map) r3
        L_0x0076:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r1.bizConfig
            r7.putAll(r3)
            java.lang.String r7 = "clientConfig"
            java.lang.String r6 = r6.getString(r7)
            r1.connectConfig = r6
            com.ap.zoloz.hummer.connect.h5.ZolozConnectH5Handler$1 r6 = new com.ap.zoloz.hummer.connect.h5.ZolozConnectH5Handler$1
            r6.<init>(r8)
            r0.startConnect(r1, r6)
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hummer.connect.h5.ZolozConnectH5Handler.identify(com.alibaba.fastjson.JSONObject, android.content.Context, com.ap.zoloz.hummer.h5.IH5HandlerCallback):void");
    }
}
