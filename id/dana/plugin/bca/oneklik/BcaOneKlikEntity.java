package id.dana.plugin.bca.oneklik;

public class BcaOneKlikEntity {
    private String accessToken;
    private String apiKey;
    private String apiSecret;
    private String customerIdMerchant;
    private String merchantId;
    private String xcoId;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApiSecret() {
        return this.apiSecret;
    }

    public String getCustomerIdMerchant() {
        return this.customerIdMerchant;
    }

    public String getMerchantId() {
        return this.merchantId;
    }

    public String getXcoId() {
        return this.xcoId;
    }

    public boolean hasMandatoryValue() {
        return (getAccessToken() == null || getApiKey() == null || getApiSecret() == null || getCustomerIdMerchant() == null || getMerchantId() == null) ? false : true;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setApiKey(String str) {
        this.apiKey = str;
    }

    public void setApiSecret(String str) {
        this.apiSecret = str;
    }

    public void setCustomerIdMerchant(String str) {
        this.customerIdMerchant = str;
    }

    public void setMerchantId(String str) {
        this.merchantId = str;
    }

    public void setXcoId(String str) {
        this.xcoId = str;
    }
}
