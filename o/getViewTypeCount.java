package o;

import org.json.JSONObject;

public final class getViewTypeCount {
    private String getMin;
    public int setMax;
    public Object setMin;

    public getViewTypeCount(String str, int i) {
        this.getMin = str;
        this.setMax = i;
    }

    public final String length() {
        JSONObject jSONObject;
        try {
            if (this.setMin instanceof JSONObject) {
                jSONObject = (JSONObject) this.setMin;
            } else {
                jSONObject = new JSONObject();
            }
            if (jSONObject == null || !jSONObject.has("error") || !jSONObject.getJSONObject("error").has("message")) {
                return "";
            }
            String string = jSONObject.getJSONObject("error").getString("message");
            if (string == null || string.trim().length() <= 0) {
                return string;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(".");
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}
