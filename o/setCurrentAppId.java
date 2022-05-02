package o;

import com.alibaba.fastjson.JSONObject;

public final class setCurrentAppId {
    private boolean length = true;
    private String setMax;
    private String setMin;

    public setCurrentAppId(String str, String str2) {
        this.setMax = str;
        this.setMin = str2;
    }

    public final JSONObject length() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) this.setMax);
        jSONObject.put("isDirect", (Object) Boolean.valueOf(this.length));
        jSONObject.put("productCode", (Object) this.setMin);
        return jSONObject;
    }
}
