package o;

public class BleNotAvailableException {
    private String cardCacheToken;
    private String formattedHolderName;
    private String formattedMaskedCardNo;
    private String fundOrderId;
    private String maskedPhoneNumber;
    private onResultSuccess payMethodRiskResult;
    private String publicKey;
    private stopBleScan totalAmount;

    public String getCardCacheToken() {
        return this.cardCacheToken;
    }

    public void setCardCacheToken(String str) {
        this.cardCacheToken = str;
    }

    public String getFormattedHolderName() {
        return this.formattedHolderName;
    }

    public void setFormattedHolderName(String str) {
        this.formattedHolderName = str;
    }

    public String getFormattedMaskedCardNo() {
        return this.formattedMaskedCardNo;
    }

    public void setFormattedMaskedCardNo(String str) {
        this.formattedMaskedCardNo = str;
    }

    public String getFundOrderId() {
        return this.fundOrderId;
    }

    public void setFundOrderId(String str) {
        this.fundOrderId = str;
    }

    public String getMaskedPhoneNumber() {
        return this.maskedPhoneNumber;
    }

    public void setMaskedPhoneNumber(String str) {
        this.maskedPhoneNumber = str;
    }

    public onResultSuccess getPayMethodRiskResult() {
        return this.payMethodRiskResult;
    }

    public void setPayMethodRiskResult(onResultSuccess onresultsuccess) {
        this.payMethodRiskResult = onresultsuccess;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public void setPublicKey(String str) {
        this.publicKey = str;
    }

    public stopBleScan getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(stopBleScan stopblescan) {
        this.totalAmount = stopblescan;
    }
}
