package o;

public class WhichButton {
    private String merchantName;
    private String orderAmount;
    private String orderId;
    private String rawText;
    private String receipt;
    private String timestamp;

    public String getOrderId() {
        return this.orderId;
    }

    public void setOrderId(String str) {
        this.orderId = str;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public void setMerchantName(String str) {
        this.merchantName = str;
    }

    public String getOrderAmount() {
        return this.orderAmount;
    }

    public void setOrderAmount(String str) {
        this.orderAmount = str;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public String getReceipt() {
        return this.receipt;
    }

    public void setReceipt(String str) {
        this.receipt = str;
    }

    public String getRawText() {
        return this.rawText;
    }

    public void setRawText(String str) {
        this.rawText = str;
    }
}
