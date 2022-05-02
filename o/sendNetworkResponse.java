package o;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class sendNetworkResponse {
    private String comment;
    private long createdDate;
    private String deepLinkUrl;
    private long lastUpdated;
    private int payeeIndex;
    private int payerIndex;
    private String payers;
    private String splitBillId;
    private String status;
    private String totalAmount;
    @PrimaryKey(autoGenerate = true)
    private int uid;

    public sendNetworkResponse() {
    }

    @Ignore
    public sendNetworkResponse(String str, String str2, String str3, String str4, String str5, long j) {
        this.comment = str;
        this.deepLinkUrl = str2;
        this.payers = str3;
        this.lastUpdated = j;
        this.splitBillId = str4;
        this.totalAmount = str5;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public String getDeepLinkUrl() {
        return this.deepLinkUrl;
    }

    public void setDeepLinkUrl(String str) {
        this.deepLinkUrl = str;
    }

    public String getPayers() {
        return this.payers;
    }

    public void setPayers(String str) {
        this.payers = str;
    }

    public int getUid() {
        return this.uid;
    }

    public void setUid(int i) {
        this.uid = i;
    }

    public long getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public String getSplitBillId() {
        return this.splitBillId;
    }

    public void setSplitBillId(String str) {
        this.splitBillId = str;
    }

    public long getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(long j) {
        this.createdDate = j;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTotalAmount(String str) {
        this.totalAmount = str;
    }

    public String getTotalAmount() {
        return this.totalAmount;
    }

    public int getPayeeIndex() {
        return this.payeeIndex;
    }

    public void setPayeeIndex(int i) {
        this.payeeIndex = i;
    }

    public int getPayerIndex() {
        return this.payerIndex;
    }

    public void setPayerIndex(int i) {
        this.payerIndex = i;
    }
}
