package o;

import java.util.List;
import o.IpcChannelManager;

public class getMimeTypeFromContentType {
    private String acceptTimeoutUnit;
    private String acceptTimeoutValue;
    private String amount;
    private String cardIndexNo;
    private List<String> couponIds;
    private String fundType;
    private String originInstId;
    private String payMethod;
    private IpcChannelManager.ServerReadyListener payeeInfo;
    private String remarks;
    private String requestId;
    private boolean shareActivity;
    private String splitBillId;
    private String transferScenario;

    public String getAmount() {
        return this.amount;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public String getCardIndexNo() {
        return this.cardIndexNo;
    }

    public void setCardIndexNo(String str) {
        this.cardIndexNo = str;
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

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String str) {
        this.remarks = str;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public void setRequestId(String str) {
        this.requestId = str;
    }

    public String getAcceptTimeoutValue() {
        return this.acceptTimeoutValue;
    }

    public void setAcceptTimeoutValue(String str) {
        this.acceptTimeoutValue = str;
    }

    public String getAcceptTimeoutUnit() {
        return this.acceptTimeoutUnit;
    }

    public void setAcceptTimeoutUnit(String str) {
        this.acceptTimeoutUnit = str;
    }

    public String getOriginInstId() {
        return this.originInstId;
    }

    public void setOriginInstId(String str) {
        this.originInstId = str;
    }

    public String getTransferScenario() {
        return this.transferScenario;
    }

    public void setTransferScenario(String str) {
        this.transferScenario = str;
    }

    public IpcChannelManager.ServerReadyListener getPayeeInfo() {
        return this.payeeInfo;
    }

    public void setPayeeInfo(IpcChannelManager.ServerReadyListener serverReadyListener) {
        this.payeeInfo = serverReadyListener;
    }

    public List<String> getCouponIds() {
        return this.couponIds;
    }

    public void setCouponIds(List<String> list) {
        this.couponIds = list;
    }

    public String getSplitBillId() {
        return this.splitBillId;
    }

    public void setSplitBillId(String str) {
        this.splitBillId = str;
    }

    public boolean isShareActivity() {
        return this.shareActivity;
    }

    public void setShareActivity(boolean z) {
        this.shareActivity = z;
    }
}
