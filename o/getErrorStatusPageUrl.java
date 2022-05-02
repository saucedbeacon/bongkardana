package o;

public class getErrorStatusPageUrl {
    private long lastUpdated;
    private String userAvatar;
    private String userId;
    private String userNickName;
    private String userPhoneNumber;

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

    public String getUserAvatar() {
        return this.userAvatar;
    }

    public void setUserAvatar(String str) {
        this.userAvatar = str;
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
}
