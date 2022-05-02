package o;

public class getServiceUuidEndOffset {
    private OnRpcResultListener attributes;
    private String cashierOrderId;
    private String fundAmount;
    private String fundOrderId;
    private onResultSuccess payMethodRiskResult;
    private String pubkey;
    private String riskPhoneNumber;

    public String getFundOrderId() {
        return this.fundOrderId;
    }

    public getServiceUuidEndOffset setFundOrderId(String str) {
        this.fundOrderId = str;
        return this;
    }

    public String getFundAmount() {
        return this.fundAmount;
    }

    public getServiceUuidEndOffset setFundAmount(String str) {
        this.fundAmount = str;
        return this;
    }

    public onResultSuccess getPayMethodRiskResult() {
        return this.payMethodRiskResult;
    }

    public getServiceUuidEndOffset setPayMethodRiskResult(onResultSuccess onresultsuccess) {
        this.payMethodRiskResult = onresultsuccess;
        return this;
    }

    public OnRpcResultListener getAttributes() {
        return this.attributes;
    }

    public getServiceUuidEndOffset setAttributes(OnRpcResultListener onRpcResultListener) {
        this.attributes = onRpcResultListener;
        return this;
    }

    public String getRiskPhoneNumber() {
        return this.riskPhoneNumber;
    }

    public getServiceUuidEndOffset setRiskPhoneNumber(String str) {
        this.riskPhoneNumber = str;
        return this;
    }

    public String getPubkey() {
        return this.pubkey;
    }

    public getServiceUuidEndOffset setPubkey(String str) {
        this.pubkey = str;
        return this;
    }

    public String getCashierOrderId() {
        return this.cashierOrderId;
    }

    public getServiceUuidEndOffset setCashierOrderId(String str) {
        this.cashierOrderId = str;
        return this;
    }
}
