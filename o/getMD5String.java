package o;

import java.util.List;

public class getMD5String {
    private List<getMD5Base64> availableScope;
    private String merchantName;

    public getMD5String() {
    }

    public getMD5String(String str, List<getMD5Base64> list) {
        this.merchantName = str;
        this.availableScope = list;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public List<getMD5Base64> getAvailableScope() {
        return this.availableScope;
    }

    public void setAvailableScope(List<getMD5Base64> list) {
        this.availableScope = list;
    }
}
