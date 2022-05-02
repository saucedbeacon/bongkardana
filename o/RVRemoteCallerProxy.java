package o;

public class RVRemoteCallerProxy extends removeAnimatorListener {
    private String cardCacheToken;
    private String formattedHolderName;
    private String formattedMaskedCardNo;
    private String fundOrderId;
    private String maskedPhoneNumber;
    private unRegisterWorker payMethodRiskResult;
    private IpcMessage securityContext;
    private registerWorker totalAmount;

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

    public unRegisterWorker getPayMethodRiskResult() {
        return this.payMethodRiskResult;
    }

    public void setPayMethodRiskResult(unRegisterWorker unregisterworker) {
        this.payMethodRiskResult = unregisterworker;
    }

    public IpcMessage getSecurityContext() {
        return this.securityContext;
    }

    public void setSecurityContext(IpcMessage ipcMessage) {
        this.securityContext = ipcMessage;
    }

    public String getPublicKey() {
        IpcMessage ipcMessage = this.securityContext;
        return ipcMessage == null ? "" : ipcMessage.getPublicKey();
    }

    public registerWorker getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(registerWorker registerworker) {
        this.totalAmount = registerworker;
    }
}
