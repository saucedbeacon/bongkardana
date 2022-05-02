package o;

import java.util.List;

public class setLastScanStartTimeMillis extends getExtraBeaconDataTracker {
    private List<String> avatars;
    private long createdDate;
    private String deeplink;
    private String payeeIndex;
    private String payerIndex;
    private String splitBillId;
    private String status;
    private stopBleScan totalAmount;

    public List<String> getAvatars() {
        return this.avatars;
    }

    public void setAvatars(List<String> list) {
        this.avatars = list;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public long getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(long j) {
        this.createdDate = j;
    }

    public stopBleScan getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(stopBleScan stopblescan) {
        this.totalAmount = stopblescan;
    }

    public String getDeeplink() {
        return this.deeplink;
    }

    public void setDeeplink(String str) {
        this.deeplink = str;
    }

    public String getSplitBillId() {
        return this.splitBillId;
    }

    public void setSplitBillId(String str) {
        this.splitBillId = str;
    }

    public String getPayeeIndex() {
        return this.payeeIndex;
    }

    public void setPayeeIndex(String str) {
        this.payeeIndex = str;
    }

    public String getPayerIndex() {
        return this.payerIndex;
    }

    public void setPayerIndex(String str) {
        this.payerIndex = str;
    }
}
