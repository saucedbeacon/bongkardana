package id.dana.danah5.globalnetwork;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import o.debugMode;

public final class InquiryResultFactory {

    @Retention(RetentionPolicy.SOURCE)
    @interface ErrorCode {
        public static final String ERROR_CODE_NO_CONTENT_INFO = "002";
        public static final String ERROR_CODE_NO_MESSAGE = "003";
    }

    private InquiryResultFactory() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.fastjson.JSONObject getResult(java.lang.String r4, java.util.List<o.debugMode.Cdefault> r5, java.lang.String r6) {
        /*
            int r0 = r4.hashCode()
            r1 = 2
            r2 = 1
            r3 = 0
            switch(r0) {
                case -1149187101: goto L_0x0029;
                case 532999017: goto L_0x001f;
                case 1415358098: goto L_0x0015;
                case 1776037267: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "UNKNOWN_ERROR"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 3
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "NO_CONTENT_INFO"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "NO_MESSAGE"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "SUCCESS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            r0 = 0
            if (r4 == 0) goto L_0x0052
            java.lang.String r5 = ""
            if (r4 == r2) goto L_0x004b
            if (r4 == r1) goto L_0x0044
            java.lang.String r4 = "001"
            com.alibaba.fastjson.JSONObject r4 = getInquiryResult(r3, r4, r0, r5)
            return r4
        L_0x0044:
            java.lang.String r4 = "003"
            com.alibaba.fastjson.JSONObject r4 = getInquiryResult(r3, r4, r0, r5)
            return r4
        L_0x004b:
            java.lang.String r4 = "002"
            com.alibaba.fastjson.JSONObject r4 = getInquiryResult(r3, r4, r0, r5)
            return r4
        L_0x0052:
            com.alibaba.fastjson.JSONObject r4 = getInquiryResult(r2, r0, r5, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.globalnetwork.InquiryResultFactory.getResult(java.lang.String, java.util.List, java.lang.String):com.alibaba.fastjson.JSONObject");
    }

    private static JSONObject getInquiryResult(boolean z, String str, List<debugMode.Cdefault> list, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        jSONObject.put("data", (Object) list);
        jSONObject.put("lastUpdated", (Object) str2);
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("error", (Object) str);
        }
        return jSONObject;
    }
}
