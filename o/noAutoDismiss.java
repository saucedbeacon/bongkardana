package o;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public final class noAutoDismiss {
    private noAutoDismiss() {
    }

    public static JSONObject handleError(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) str);
        return jSONObject;
    }

    public static JSONObject handleSuccess(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.TRUE);
        jSONObject.put("data", JSON.parse(str));
        return jSONObject;
    }
}
