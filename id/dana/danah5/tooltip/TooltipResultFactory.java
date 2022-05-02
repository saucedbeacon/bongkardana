package id.dana.danah5.tooltip;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class TooltipResultFactory {

    @Retention(RetentionPolicy.SOURCE)
    @interface ErrorCode {
        public static final String ERROR_CODE_NO_CONTENT_INFO = "002";
        public static final String ERROR_CODE_NO_MESSAGE = "003";
    }

    private TooltipResultFactory() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.fastjson.JSONObject getResult(java.lang.String r4) {
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
            if (r4 == 0) goto L_0x004f
            if (r4 == r2) goto L_0x0048
            if (r4 == r1) goto L_0x0041
            java.lang.String r4 = "001"
            com.alibaba.fastjson.JSONObject r4 = getTooltipResult(r3, r4)
            return r4
        L_0x0041:
            java.lang.String r4 = "003"
            com.alibaba.fastjson.JSONObject r4 = getTooltipResult(r3, r4)
            return r4
        L_0x0048:
            java.lang.String r4 = "002"
            com.alibaba.fastjson.JSONObject r4 = getTooltipResult(r3, r4)
            return r4
        L_0x004f:
            r4 = 0
            com.alibaba.fastjson.JSONObject r4 = getTooltipResult(r2, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.danah5.tooltip.TooltipResultFactory.getResult(java.lang.String):com.alibaba.fastjson.JSONObject");
    }

    private static JSONObject getTooltipResult(boolean z, String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        if (!TextUtils.isEmpty(str)) {
            jSONObject.put("error", (Object) str);
        }
        return jSONObject;
    }
}
