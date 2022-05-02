package com.ap.zoloz.hummer.h5;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Locale;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class ZolozEkycH5Handler {
    public static final String HUMMER_FOUNDATION_ADD = "add";
    public static final String HUMMER_FOUNDATION_DELETE = "delete";
    public static final String HUMMER_FOUNDATION_GET_INTPUT_PARAMS = "getInputParams";
    public static final String HUMMER_FOUNDATION_GET_LANGUAGE = "getLanguage";
    public static final String HUMMER_FOUNDATION_GET_OUTPUT_PARAMS = "getOutputParams";
    public static final String HUMMER_FOUNDATION_HIDE_LOADING_DIALOG = "hideLoadingDialog";
    private static final String HUMMER_FOUNDATION_KEY = "key";
    public static final String HUMMER_FOUNDATION_LOGGING = "logging";
    public static final String HUMMER_FOUNDATION_LOG_MESS = "logMessage";
    public static final String HUMMER_FOUNDATION_LOG_SEED_ID = "logSeedID";
    public static final String HUMMER_FOUNDATION_MESSAGE = "message";
    public static final String HUMMER_FOUNDATION_NEED_RPC = "needRpc";
    public static final String HUMMER_FOUNDATION_NEGATIVE = "negative";
    private static final String HUMMER_FOUNDATION_PIPE_TYPE = "pipeType";
    public static final String HUMMER_FOUNDATION_POSITIVE = "positive";
    public static final String HUMMER_FOUNDATION_QUERY = "query";
    public static final String HUMMER_FOUNDATION_SEND_RPC = "sendRpc";
    public static final String HUMMER_FOUNDATION_SHOW_ALERT = "showAlert";
    public static final String HUMMER_FOUNDATION_SHOW_LOADING_DIALOG = "showLoadingDialog";
    public static final String HUMMER_FOUNDATION_TITLE = "title";
    private static final String HUMMER_FOUNDATION_TYPE = "type";
    private static final String HUMMER_FOUNDATION_VALUE = "value";
    public static final String TAG = "ZolozEkycH5Handler";
    public static final String ZIM_IDENTIFY_ACTION = "action";
    public static final String ZIM_IDENTIFY_BIZCONFIG = "bizParam";
    public static final String ZIM_IDENTIFY_EKYCID = "ekycId";
    public static final String ZIM_IDENTIFY_EKYCONFIG = "ekycConfig";
    public static final String ZIM_IDENTIFY_FINISH_WEB_TASK = "finishWebTask";
    public static final String ZIM_IDENTIFY_NEXTINDEX = "nextIndex";
    public static final String ZIM_IDENTIFY_START_EKYC = "startEkyc";
    public static final String ZIM_IDENTIFY_STATUS = "status";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.Map} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void identify(com.alibaba.fastjson.JSONObject r7, android.content.Context r8, final com.ap.zoloz.hummer.h5.IH5HandlerCallback r9) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x02a8
            if (r8 != 0) goto L_0x0006
            goto L_0x02a8
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " jsapi"
            r0.<init>(r1)
            java.lang.String r1 = r7.toJSONString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ZolozEkycH5Handler"
            com.ap.zoloz.hummer.biz.HummerLogger.i(r1, r0)
            java.lang.String r0 = "action"
            java.lang.String r0 = r7.getString(r0)
            boolean r1 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r0)
            if (r1 == 0) goto L_0x002a
            return
        L_0x002a:
            com.ap.zoloz.hummer.api.EkycFacade r1 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            r1.setContext(r8)
            java.lang.String r2 = "startEkyc"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x008c
            java.lang.String r8 = "ekycId"
            java.lang.String r8 = r7.getString(r8)
            com.ap.zoloz.hummer.api.EkycRequest r0 = new com.ap.zoloz.hummer.api.EkycRequest
            r0.<init>()
            r0.eKYCId = r8
            java.lang.String r8 = "bizParam"
            com.alibaba.fastjson.JSONObject r2 = r7.getJSONObject(r8)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            if (r2 == 0) goto L_0x0063
            int r4 = r2.size()
            if (r4 <= 0) goto L_0x0063
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            java.lang.Object r8 = com.alibaba.fastjson.JSONObject.toJavaObject(r2, r8)
            r3 = r8
            java.util.Map r3 = (java.util.Map) r3
            goto L_0x0076
        L_0x0063:
            java.lang.String r8 = r7.getString(r8)
            boolean r2 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r8)
            if (r2 != 0) goto L_0x0076
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Object r8 = com.alibaba.fastjson.JSON.parseObject((java.lang.String) r8, r2)
            r3 = r8
            java.util.Map r3 = (java.util.Map) r3
        L_0x0076:
            java.util.Map<java.lang.String, java.lang.Object> r8 = r0.bizConfig
            r8.putAll(r3)
            java.lang.String r8 = "ekycConfig"
            java.lang.String r7 = r7.getString(r8)
            r0.clientCfg = r7
            com.ap.zoloz.hummer.h5.ZolozEkycH5Handler$1 r7 = new com.ap.zoloz.hummer.h5.ZolozEkycH5Handler$1
            r7.<init>(r9)
            r1.startEkyc(r0, r7)
            return
        L_0x008c:
            java.lang.String r1 = "finishWebTask"
            boolean r1 = r1.equals(r0)
            r2 = 0
            if (r1 == 0) goto L_0x00bb
            java.lang.String r8 = "nextIndex"
            java.lang.Integer r0 = r7.getInteger(r8)
            if (r0 == 0) goto L_0x00a5
            java.lang.Integer r8 = r7.getInteger(r8)
            int r2 = r8.intValue()
        L_0x00a5:
            com.ap.zoloz.hummer.api.EkycFacade r8 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            java.lang.String r0 = "status"
            java.lang.String r7 = r7.getString(r0)
            r8.endWebTask(r2, r7)
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>()
            r9.onCompletion(r7)
            return
        L_0x00bb:
            java.lang.String r1 = "logging"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00df
            java.lang.String r8 = "logSeedID"
            java.lang.String r8 = r7.getString(r8)
            java.lang.String r9 = "logMessage"
            com.alibaba.fastjson.JSONObject r7 = r7.getJSONObject(r9)
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            java.lang.Object r7 = com.alibaba.fastjson.JSONObject.toJavaObject(r7, r9)
            java.util.Map r7 = (java.util.Map) r7
            com.ap.zoloz.hummer.common.RecordManager r9 = com.ap.zoloz.hummer.common.RecordManager.getInstance()
            r9.record(r8, r7)
            return
        L_0x00df:
            java.lang.String r1 = "sendRpc"
            boolean r1 = r1.equals(r0)
            java.lang.String r3 = "type"
            if (r1 == 0) goto L_0x0121
            java.lang.String r7 = r7.getString(r3)
            com.ap.zoloz.hummer.api.EkycFacade r8 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r8 = r8.getHummerContext()
            r8.updateRpcIndexList()
            com.ap.zoloz.hummer.rpc.RpcManager r8 = com.ap.zoloz.hummer.rpc.RpcManager.getInstance()
            com.ap.zoloz.hummer.h5.ZolozEkycH5Handler$2 r0 = new com.ap.zoloz.hummer.h5.ZolozEkycH5Handler$2
            r0.<init>(r9)
            com.ap.zoloz.hummer.rpc.RpcManager r9 = com.ap.zoloz.hummer.rpc.RpcManager.getInstance()
            com.ap.zoloz.hummer.api.EkycFacade r1 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r1 = r1.getHummerContext()
            com.ap.zoloz.hummer.api.EkycFacade r3 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r3 = r3.getHummerContext()
            int r7 = r3.getNextIndex(r7)
            com.ap.zoloz.hummer.rpc.RpcRequest r7 = r9.formatRequest(r1, r7, r2)
            r8.sendRpc(r0, r7)
            return
        L_0x0121:
            java.lang.String r1 = "showAlert"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x014e
            java.lang.String r8 = "title"
            java.lang.String r1 = r7.getString(r8)
            java.lang.String r8 = "message"
            java.lang.String r2 = r7.getString(r8)
            java.lang.String r8 = "positive"
            java.lang.String r3 = r7.getString(r8)
            java.lang.String r8 = "negative"
            java.lang.String r4 = r7.getString(r8)
            com.ap.zoloz.hummer.common.AlertManager r0 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            com.ap.zoloz.hummer.h5.ZolozEkycH5Handler$3 r5 = new com.ap.zoloz.hummer.h5.ZolozEkycH5Handler$3
            r5.<init>(r9)
            r0.alert(r1, r2, r3, r4, r5)
            return
        L_0x014e:
            java.lang.String r1 = "showLoadingDialog"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0166
            com.ap.zoloz.hummer.common.AlertManager r7 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            com.ap.zoloz.hummer.h5.ZolozEkycH5Handler$4 r8 = new com.ap.zoloz.hummer.h5.ZolozEkycH5Handler$4
            r8.<init>()
            r9 = 1
            java.lang.String r0 = ""
            r7.showProgressDialog(r0, r2, r8, r9)
            return
        L_0x0166:
            java.lang.String r1 = "hideLoadingDialog"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0176
            com.ap.zoloz.hummer.common.AlertManager r7 = com.ap.zoloz.hummer.common.AlertManager.getInstance()
            r7.dismissDialog()
            return
        L_0x0176:
            java.lang.String r1 = "add"
            boolean r1 = r1.equals(r0)
            java.lang.String r2 = "value"
            java.lang.String r4 = "key"
            if (r1 == 0) goto L_0x01a7
            java.lang.String r8 = r7.getString(r4)
            java.lang.String r0 = "pipeType"
            java.lang.String r0 = r7.getString(r0)
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r7 = r7.getObject(r2, r1)
            com.ap.zoloz.hummer.api.EkycFacade r1 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r1 = r1.getHummerContext()
            r1.add(r8, r0, r7)
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>()
            r9.onCompletion(r7)
            return
        L_0x01a7:
            java.lang.String r1 = "query"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01cb
            java.lang.String r7 = r7.getString(r4)
            com.alibaba.fastjson.JSONObject r8 = new com.alibaba.fastjson.JSONObject
            r8.<init>()
            com.ap.zoloz.hummer.api.EkycFacade r0 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r0 = r0.getHummerContext()
            java.lang.Object r7 = r0.query(r7)
            r8.put((java.lang.String) r2, (java.lang.Object) r7)
            r9.onCompletion(r8)
            return
        L_0x01cb:
            java.lang.String r1 = "delete"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01eb
            java.lang.String r7 = r7.getString(r4)
            com.ap.zoloz.hummer.api.EkycFacade r8 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r8 = r8.getHummerContext()
            r8.delete(r7)
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>()
            r9.onCompletion(r7)
            return
        L_0x01eb:
            java.lang.String r1 = "needRpc"
            boolean r2 = r1.equals(r0)
            if (r2 == 0) goto L_0x0213
            com.alibaba.fastjson.JSONObject r8 = new com.alibaba.fastjson.JSONObject
            r8.<init>()
            java.lang.String r7 = r7.getString(r3)
            com.ap.zoloz.hummer.api.EkycFacade r0 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r0 = r0.getHummerContext()
            boolean r7 = r0.needRPC(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8.put((java.lang.String) r1, (java.lang.Object) r7)
            r9.onCompletion(r8)
            return
        L_0x0213:
            java.lang.String r1 = "getInputParams"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0235
            com.alibaba.fastjson.JSONObject r7 = new com.alibaba.fastjson.JSONObject
            r7.<init>()
            com.ap.zoloz.hummer.api.EkycFacade r8 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r8 = r8.getHummerContext()
            java.util.Map r8 = r8.getInputParam()
            if (r8 == 0) goto L_0x0231
            r7.putAll(r8)
        L_0x0231:
            r9.onCompletion(r7)
            return
        L_0x0235:
            java.lang.String r1 = "getOutputParams"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0259
            com.alibaba.fastjson.JSONObject r8 = new com.alibaba.fastjson.JSONObject
            r8.<init>()
            java.lang.String r7 = r7.getString(r3)
            com.ap.zoloz.hummer.api.EkycFacade r0 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r0 = r0.getHummerContext()
            com.alibaba.fastjson.JSONObject r7 = r0.getOutputParam(r7)
            if (r7 == 0) goto L_0x0255
            r8 = r7
        L_0x0255:
            r9.onCompletion(r8)
            return
        L_0x0259:
            java.lang.String r7 = "getLanguage"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x02a8
            com.ap.zoloz.hummer.api.EkycFacade r7 = com.ap.zoloz.hummer.api.EkycFacade.getInstance()
            com.ap.zoloz.hummer.common.HummerContext r7 = r7.getHummerContext()
            java.lang.String r0 = "hummerLocale"
            java.lang.Object r7 = r7.query(r0)
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = com.alipay.mobile.security.bio.utils.StringUtil.isNullorEmpty(r7)
            if (r0 != 0) goto L_0x027b
            r6.updateLocale(r8, r7)
            goto L_0x029b
        L_0x027b:
            java.util.Locale r7 = r6.getSystemLocale(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = r7.getLanguage()
            r8.append(r0)
            java.lang.String r0 = "-"
            r8.append(r0)
            java.lang.String r7 = r7.getCountry()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
        L_0x029b:
            com.alibaba.fastjson.JSONObject r8 = new com.alibaba.fastjson.JSONObject
            r8.<init>()
            java.lang.String r0 = "language"
            r8.put((java.lang.String) r0, (java.lang.Object) r7)
            r9.onCompletion(r8)
        L_0x02a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ap.zoloz.hummer.h5.ZolozEkycH5Handler.identify(com.alibaba.fastjson.JSONObject, android.content.Context, com.ap.zoloz.hummer.h5.IH5HandlerCallback):void");
    }

    private Locale getSystemLocale(Context context) {
        if (Build.VERSION.SDK_INT < 17) {
            return context.getResources().getConfiguration().locale;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getResources().getConfiguration().getLocales().get(0);
        }
        return context.getResources().getConfiguration().locale;
    }

    private void updateLocale(Context context, String str) {
        Locale locale;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 32);
                onCancelLoad.setMax(737862782, oncanceled);
                onCancelLoad.getMin(737862782, oncanceled);
            }
        }
        if (str != null) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                if (str.contains("-")) {
                    String[] split = str.split("-");
                    if (split.length == 2) {
                        locale = new Locale(split[0], split[1]);
                    } else if (split.length == 1) {
                        locale = new Locale(split[0]);
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        locale = context.getResources().getConfiguration().getLocales().get(0);
                    } else {
                        locale = context.getResources().getConfiguration().locale;
                    }
                } else {
                    locale = new Locale(str);
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    configuration.setLocale(locale);
                } else {
                    configuration.locale = locale;
                }
                context.getResources().updateConfiguration(configuration, context.getResources().getDisplayMetrics());
            } catch (Exception unused) {
            }
        }
    }
}
