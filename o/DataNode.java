package o;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class DataNode {
    private long lastUpdated;
    private String phoneNumber;
    @PrimaryKey(autoGenerate = true)
    private int uid;
    private String userId;

    public DataNode() {
    }

    @Ignore
    public DataNode(String str, String str2, long j) {
        this.userId = str;
        this.phoneNumber = str2;
        this.lastUpdated = j;
    }

    public long getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
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
}
