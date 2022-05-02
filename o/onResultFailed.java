package o;

public class onResultFailed {
    private String amount;
    private String buyerPhoneNo;
    private String buyerUserId;
    private String cashierUrl;
    private String extendInfo;
    private String payAmount;
    private String payAmountCurrency;
    private String payMethod;
    private String paymentCode;
    private String productCode;
    private String sellerName;
    private String sellerUserId;
    private String state;
    private String stateReasonCode;
    private String stateReasonDesc;
    private String tradeAmount;
    private String tradeAmountCurrency;
    private String tradeNo;

    public String getTradeNo() {
        return this.tradeNo;
    }

    public void setTradeNo(String str) {
        this.tradeNo = str;
    }

    public String getBuyerPhoneNo() {
        return this.buyerPhoneNo;
    }

    public void setBuyerPhoneNo(String str) {
        this.buyerPhoneNo = str;
    }

    public String getBuyerUserId() {
        return this.buyerUserId;
    }

    public void setBuyerUserId(String str) {
        this.buyerUserId = str;
    }

    public String getPaymentCode() {
        return this.paymentCode;
    }

    public void setPaymentCode(String str) {
        this.paymentCode = str;
    }

    public String getSellerUserId() {
        return this.sellerUserId;
    }

    public void setSellerUserId(String str) {
        this.sellerUserId = str;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public void setSellerName(String str) {
        this.sellerName = str;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String str) {
        this.productCode = str;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(2143199321, oncanceled);
            onCancelLoad.getMin(2143199321, oncanceled);
        }
        this.amount = str;
    }

    public String getPayAmount() {
        return this.payAmount;
    }

    public void setPayAmount(String str) {
        this.payAmount = str;
    }

    public String getPayAmountCurrency() {
        return this.payAmountCurrency;
    }

    public void setPayAmountCurrency(String str) {
        this.payAmountCurrency = str;
    }

    public String getTradeAmount() {
        return this.tradeAmount;
    }

    public void setTradeAmount(String str) {
        this.tradeAmount = str;
    }

    public String getTradeAmountCurrency() {
        return this.tradeAmountCurrency;
    }

    public void setTradeAmountCurrency(String str) {
        this.tradeAmountCurrency = str;
    }

    public String getCashierUrl() {
        return this.cashierUrl;
    }

    public void setCashierUrl(String str) {
        this.cashierUrl = str;
    }

    public String getExtendInfo() {
        return this.extendInfo;
    }

    public void setExtendInfo(String str) {
        this.extendInfo = str;
    }

    public String getPayMethod() {
        return this.payMethod;
    }

    public void setPayMethod(String str) {
        this.payMethod = str;
    }

    public String getStateReasonCode() {
        return this.stateReasonCode;
    }

    public void setStateReasonCode(String str) {
        this.stateReasonCode = str;
    }

    public String getStateReasonDesc() {
        return this.stateReasonDesc;
    }

    public void setStateReasonDesc(String str) {
        this.stateReasonDesc = str;
    }
}
