package id.dana.data.config.source.amcs.result;

import com.alibaba.fastjson.JSONObject;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class OTCAcceptExpiryTimeConfigResult {
    private String unit;
    private String value;

    @Retention(RetentionPolicy.SOURCE)
    public @interface JsonKey {
        public static final String UNIT = "unit";
        public static final String VALUE = "value";
    }

    public OTCAcceptExpiryTimeConfigResult(JSONObject jSONObject) {
        this.unit = hasUnitObject(jSONObject) ? jSONObject.getString(JsonKey.UNIT) : "H";
        this.value = hasValueObject(jSONObject) ? jSONObject.getString("value") : "12";
    }

    public static OTCAcceptExpiryTimeConfigResult createDefaultConfig() {
        return new OTCAcceptExpiryTimeConfigResult((JSONObject) null);
    }

    private boolean hasUnitObject(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.containsKey(JsonKey.UNIT);
    }

    private boolean hasValueObject(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.containsKey("value");
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String str) {
        this.unit = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
