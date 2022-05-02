package id.dana.danah5.screenshot;

import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class ScreenshotPluginResultFactory {

    @Retention(RetentionPolicy.SOURCE)
    @interface ErrorCode {
        public static final String LOW_STORAGE = "004";
        public static final String NO_ACCESS = "002";
        public static final String SAVE_FAIL = "003";
        public static final String SUCCESS = "001";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.fastjson.JSONObject getResult(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 2
            r2 = 1
            switch(r0) {
                case 47665: goto L_0x0028;
                case 47666: goto L_0x001e;
                case 47667: goto L_0x0014;
                case 47668: goto L_0x000a;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x0032
        L_0x000a:
            java.lang.String r0 = "004"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0032
            r3 = 2
            goto L_0x0033
        L_0x0014:
            java.lang.String r0 = "003"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0032
            r3 = 3
            goto L_0x0033
        L_0x001e:
            java.lang.String r0 = "002"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0032
            r3 = 1
            goto L_0x0033
        L_0x0028:
            java.lang.String r0 = "001"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0032
            r3 = 0
            goto L_0x0033
        L_0x0032:
            r3 = -1
        L_0x0033:
            if (r3 == 0) goto L_0x0048
            if (r3 == r2) goto L_0x0043
            if (r3 == r1) goto L_0x003e
            com.alibaba.fastjson.JSONObject r3 = getFailedSaveResult()
            return r3
        L_0x003e:
            com.alibaba.fastjson.JSONObject r3 = getLowStorageResult()
            return r3
        L_0x0043:
            com.alibaba.fastjson.JSONObject r3 = getNoAccessResult()
            return r3
        L_0x0048:
            com.alibaba.fastjson.JSONObject r3 = getSuccessResult()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.screenshot.ScreenshotPluginResultFactory.getResult(java.lang.String):com.alibaba.fastjson.JSONObject");
    }

    private static JSONObject getSuccessResult() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        jSONObject.put("error", (Object) "001");
        return jSONObject;
    }

    private static JSONObject getNoAccessResult() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) "002");
        return jSONObject;
    }

    private static JSONObject getLowStorageResult() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) "004");
        return jSONObject;
    }

    private static JSONObject getFailedSaveResult() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) "003");
        return jSONObject;
    }
}
