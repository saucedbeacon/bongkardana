package o;

import com.alibaba.fastjson.annotation.JSONField;

public class getExtensionManager {
    @JSONField(name = "expiry_default")
    private boolean expiryDefault;
    @JSONField(name = "expiry_number")
    private int expiryNumber;
    @JSONField(name = "expiry_unit")
    private String expiryUnit;

    public int getExpiryNumber() {
        return this.expiryNumber;
    }

    public void setExpiryNumber(int i) {
        this.expiryNumber = i;
    }

    public String getExpiryUnit() {
        return this.expiryUnit;
    }

    public void setExpiryUnit(String str) {
        this.expiryUnit = str;
    }

    public boolean isExpiryDefault() {
        return this.expiryDefault;
    }

    public void setExpiryDefault(boolean z) {
        this.expiryDefault = z;
    }
}
