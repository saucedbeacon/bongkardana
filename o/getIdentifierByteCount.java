package o;

public class getIdentifierByteCount {
    private String fundType;
    private String payMethod;
    private boolean payMethodFlag;
    private UCUtils payMethodView;
    private stopBleScan payerMaxAmount;
    private stopBleScan payerMinAmount;

    public boolean isPayMethodFlag() {
        return this.payMethodFlag;
    }

    public void setPayMethodFlag(boolean z) {
        this.payMethodFlag = z;
    }

    public String getFundType() {
        return this.fundType;
    }

    public void setFundType(String str) {
        this.fundType = str;
    }

    public String getPayMethod() {
        return this.payMethod;
    }

    public void setPayMethod(String str) {
        this.payMethod = str;
    }

    public stopBleScan getPayerMinAmount() {
        return this.payerMinAmount;
    }

    public void setPayerMinAmount(stopBleScan stopblescan) {
        this.payerMinAmount = stopblescan;
    }

    public stopBleScan getPayerMaxAmount() {
        return this.payerMaxAmount;
    }

    public void setPayerMaxAmount(stopBleScan stopblescan) {
        this.payerMaxAmount = stopblescan;
    }

    public UCUtils getPayMethodView() {
        return this.payMethodView;
    }

    public void setPayMethodView(UCUtils uCUtils) {
        this.payMethodView = uCUtils;
    }
}
