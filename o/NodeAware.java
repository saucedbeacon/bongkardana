package o;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class NodeAware {
    private String avatar;
    private long lastUpdated;
    private int transactionCount;
    @PrimaryKey(autoGenerate = true)
    private int uid;
    private String userId;
    private String userNickName;
    private String userPhoneNumber;
    private boolean visibleInQuickSend;

    public NodeAware() {
    }

    @Ignore
    public NodeAware(String str, String str2, String str3, String str4, long j, boolean z) {
        this.userId = str;
        this.userPhoneNumber = str2;
        this.userNickName = str3;
        this.avatar = str4;
        this.lastUpdated = j;
        this.visibleInQuickSend = z;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public int getUid() {
        return this.uid;
    }

    public void setUid(int i) {
        this.uid = i;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getUserPhoneNumber() {
        return this.userPhoneNumber;
    }

    public void setUserPhoneNumber(String str) {
        this.userPhoneNumber = str;
    }

    public String getUserNickName() {
        return this.userNickName;
    }

    public void setUserNickName(String str) {
        this.userNickName = str;
    }

    public long getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public int getTransactionCount() {
        return this.transactionCount;
    }

    public void setTransactionCount(int i) {
        this.transactionCount = i;
    }

    public boolean isVisibleInQuickSend() {
        return this.visibleInQuickSend;
    }

    public void setVisibleInQuickSend(boolean z) {
        this.visibleInQuickSend = z;
    }
}
