package com.alibaba.ariver.engine.common.track;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONObject;

public class EventTrackerLogUtils {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r0.equals("NBComponent.render") != false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void trackKeyJSAPIInvoke(com.alibaba.ariver.engine.api.bridge.model.NativeCallContext r7) {
        /*
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.lang.String r0 = r7.getName()
            boolean r1 = com.alibaba.ariver.kernel.api.track.EventTrackerUtils.isKeyJsApi(r0)
            if (r1 == 0) goto L_0x00df
            com.alibaba.ariver.kernel.api.node.Node r1 = r7.getNode()
            boolean r1 = r1 instanceof com.alibaba.ariver.app.api.Page
            if (r1 == 0) goto L_0x00df
            com.alibaba.ariver.kernel.api.node.Node r1 = r7.getNode()
            com.alibaba.ariver.app.api.Page r1 = (com.alibaba.ariver.app.api.Page) r1
            java.lang.Class<com.alibaba.ariver.kernel.api.track.EventTrackStore> r2 = com.alibaba.ariver.kernel.api.track.EventTrackStore.class
            r3 = 1
            java.lang.Object r1 = r1.getData(r2, r3)
            com.alibaba.ariver.kernel.api.track.EventTrackStore r1 = (com.alibaba.ariver.kernel.api.track.EventTrackStore) r1
            boolean r2 = r1.apiCallIsFull()
            if (r2 != 0) goto L_0x00df
            java.lang.String r2 = "apicall"
            java.lang.String r2 = com.alibaba.ariver.kernel.api.track.EventTrackerUtils.getTrackerIdWithIndex(r2, r0)
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
            r4.<init>()
            java.lang.String r5 = "trackId"
            r4.put((java.lang.String) r5, (java.lang.Object) r2)
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "start"
            r4.put((java.lang.String) r5, (java.lang.Object) r2)
            com.alibaba.fastjson.JSONObject r2 = r7.getParams()
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -156300933: goto L_0x0090;
                case 113125: goto L_0x0086;
                case 92899676: goto L_0x007c;
                case 110532135: goto L_0x0072;
                case 951117504: goto L_0x0068;
                case 1316768351: goto L_0x005e;
                case 1703426986: goto L_0x0054;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0099
        L_0x0054:
            java.lang.String r3 = "pushWindow"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0099
            r3 = 3
            goto L_0x009a
        L_0x005e:
            java.lang.String r3 = "startApp"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0099
            r3 = 2
            goto L_0x009a
        L_0x0068:
            java.lang.String r3 = "confirm"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0099
            r3 = 5
            goto L_0x009a
        L_0x0072:
            java.lang.String r3 = "toast"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0099
            r3 = 4
            goto L_0x009a
        L_0x007c:
            java.lang.String r3 = "alert"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0099
            r3 = 6
            goto L_0x009a
        L_0x0086:
            java.lang.String r3 = "rpc"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0099
            r3 = 0
            goto L_0x009a
        L_0x0090:
            java.lang.String r6 = "NBComponent.render"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x0099
            goto L_0x009a
        L_0x0099:
            r3 = -1
        L_0x009a:
            switch(r3) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x00ae;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00a6;
                case 4: goto L_0x00a2;
                case 5: goto L_0x009e;
                case 6: goto L_0x009e;
                default: goto L_0x009d;
            }
        L_0x009d:
            goto L_0x00b5
        L_0x009e:
            f(r4, r2)
            goto L_0x00b5
        L_0x00a2:
            e(r4, r2)
            goto L_0x00b5
        L_0x00a6:
            d(r4, r2)
            goto L_0x00b5
        L_0x00aa:
            c(r4, r2)
            goto L_0x00b5
        L_0x00ae:
            b(r4, r2)
            goto L_0x00b5
        L_0x00b2:
            a(r4, r2)
        L_0x00b5:
            boolean r2 = com.alibaba.ariver.kernel.common.utils.RVKernelUtils.isDebug()
            if (r2 == 0) goto L_0x00d6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "trackKeyJSAPIInvoke action: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " obj: "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "AriverEngine:EventTrackerLogUtils"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r0)
        L_0x00d6:
            java.util.Map<java.lang.String, com.alibaba.fastjson.JSONObject> r0 = r1.jsapiCallDict
            java.lang.String r7 = r7.getId()
            r0.put(r7, r4)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.engine.common.track.EventTrackerLogUtils.trackKeyJSAPIInvoke(com.alibaba.ariver.engine.api.bridge.model.NativeCallContext):void");
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        jSONObject.put("operationType", (Object) JSONUtils.getString(jSONObject2, "operationType"));
    }

    private static void b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3 = JSONUtils.getJSONObject(jSONObject2, "props", (JSONObject) null);
        if (jSONObject3 != null) {
            String string = JSONUtils.getString(jSONObject3, "src");
            jSONObject.put("element", (Object) JSONUtils.getString(jSONObject2, "element"));
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("url", (Object) string);
            }
        }
    }

    private static void c(JSONObject jSONObject, JSONObject jSONObject2) {
        String string = JSONUtils.getString(jSONObject2, "appId");
        if (!TextUtils.isEmpty(string)) {
            jSONObject.put("appId", (Object) string);
        }
        String string2 = JSONUtils.getString(jSONObject2, "scheme");
        if (!TextUtils.isEmpty(string2)) {
            jSONObject.put("scheme", (Object) string2);
        }
    }

    private static void d(JSONObject jSONObject, JSONObject jSONObject2) {
        String string = JSONUtils.getString(jSONObject2, "url");
        if (!TextUtils.isEmpty(string)) {
            jSONObject.put("url", (Object) string);
        }
    }

    private static void e(JSONObject jSONObject, JSONObject jSONObject2) {
        String string = JSONUtils.getString(jSONObject2, "content");
        String string2 = JSONUtils.getString(jSONObject2, "type");
        jSONObject.put("content", (Object) string);
        jSONObject.put("type", (Object) string2);
    }

    private static void f(JSONObject jSONObject, JSONObject jSONObject2) {
        String string = JSONUtils.getString(jSONObject2, "message");
        String string2 = JSONUtils.getString(jSONObject2, "title");
        jSONObject.put("content", (Object) string);
        jSONObject.put("title", (Object) string2);
    }
}
