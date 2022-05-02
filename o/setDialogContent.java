package o;

import java.util.List;

public class setDialogContent {
    private String comment;
    private String deeplinkUrl;
    private String payeeIndex;
    private String payerAmount;
    private String payerIndex;
    private List<DefaultRemoteDebugProxyImpl> payersResult;
    private String splitBillId;
    private String status;

    public String getSplitBillId() {
        return this.splitBillId;
    }

    public void setSplitBillId(String str) {
        this.splitBillId = str;
    }

    public String getPayerIndex() {
        return this.payerIndex;
    }

    public void setPayerIndex(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1686111618, oncanceled);
            onCancelLoad.getMin(1686111618, oncanceled);
        }
        this.payerIndex = str;
    }

    public String getPayeeIndex() {
        return this.payeeIndex;
    }

    public void setPayeeIndex(String str) {
        this.payeeIndex = str;
    }

    public String getPayerAmount() {
        return this.payerAmount;
    }

    public void setPayerAmount(String str) {
        this.payerAmount = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public List<DefaultRemoteDebugProxyImpl> getPayersResult() {
        return this.payersResult;
    }

    public void setPayersResult(List<DefaultRemoteDebugProxyImpl> list) {
        this.payersResult = list;
    }

    public String getDeeplinkUrl() {
        return this.deeplinkUrl;
    }

    public void setDeeplinkUrl(String str) {
        this.deeplinkUrl = str;
    }
}
