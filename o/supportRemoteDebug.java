package o;

import android.text.TextUtils;
import java.util.List;

public class supportRemoteDebug {
    private List<String> avatarPayersList;
    private String comment;
    private long splitBillDate;
    private String splitBillId;
    private String status;
    private registerWorker totalAmount;

    public String getSplitBillId() {
        return this.splitBillId;
    }

    public void setSplitBillId(String str) {
        this.splitBillId = str;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(1819406231, oncanceled);
            onCancelLoad.getMin(1819406231, oncanceled);
        }
        this.comment = str;
    }

    public registerWorker getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(registerWorker registerworker) {
        this.totalAmount = registerworker;
    }

    public long getSplitBillDate() {
        return this.splitBillDate;
    }

    public void setSplitBillDate(long j) {
        this.splitBillDate = j;
    }

    public List<String> getAvatarPayersList() {
        return this.avatarPayersList;
    }

    public void setAvatarPayersList(List<String> list) {
        this.avatarPayersList = list;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public boolean isPendingItem() {
        return !TextUtils.isEmpty(this.status) && "IN_PROGRESS".equals(this.status);
    }
}
