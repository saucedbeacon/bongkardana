package o;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public final class inferThemeIsLight {
    private inferThemeIsLight() {
    }

    static JSONObject getSuccessResult(boolean z, String str, WhichButton whichButton) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.valueOf(z));
        jSONObject.put("error", (Object) str);
        jSONObject.put("data", JSON.toJSON(whichButton));
        return jSONObject;
    }

    public static JSONObject getFailedResult(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", (Object) Boolean.FALSE);
        jSONObject.put("error", (Object) str);
        jSONObject.put("data", JSON.toJSON(new WhichButton()));
        return jSONObject;
    }
}
