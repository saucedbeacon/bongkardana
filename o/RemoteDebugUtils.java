package o;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class RemoteDebugUtils {
    private String avatar;
    private long lastUpdated;
    private String shownName;
    private String shownNumber;
    @PrimaryKey(autoGenerate = true)
    private int uid;
    private String userId;
    private String userNickname;
    private String userPhoneNumber;

    public RemoteDebugUtils() {
    }

    @Ignore
    public RemoteDebugUtils(String str, String str2, String str3, String str4, long j) {
        this.userId = str;
        this.userPhoneNumber = str2;
        this.userNickname = str3;
        this.avatar = str4;
        this.lastUpdated = j;
    }

    @Ignore
    public RemoteDebugUtils(String str, String str2, String str3, String str4, long j, String str5, String str6) {
        this.userId = str;
        this.userPhoneNumber = str2;
        this.userNickname = str3;
        this.avatar = str4;
        this.lastUpdated = j;
        this.shownName = str5;
        this.shownNumber = str6;
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

    public String getUserNickname() {
        return this.userNickname;
    }

    public void setUserNickname(String str) {
        this.userNickname = str;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public long getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public String getShownName() {
        return this.shownName;
    }

    public void setShownName(String str) {
        this.shownName = str;
    }

    public String getShownNumber() {
        return this.shownNumber;
    }

    public void setShownNumber(String str) {
        this.shownNumber = str;
    }
}
