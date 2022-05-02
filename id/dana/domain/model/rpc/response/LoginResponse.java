package id.dana.domain.model.rpc.response;

import android.os.Parcel;
import android.os.Parcelable;
import id.dana.domain.model.rpc.UserInfo;
import java.util.List;
import o.initWithSecurityGuard;

public class LoginResponse extends initWithSecurityGuard implements Parcelable {
    public static final Parcelable.Creator<LoginResponse> CREATOR = new Parcelable.Creator<LoginResponse>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LoginResponse[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LoginResponse(parcel);
        }
    };
    private String clientKey;
    private EvUrlStatus evUrlStatus;
    private Integer failedCount;
    private String key;
    private Integer leftTimes;
    private Integer lockedExpireSeconds;
    private Integer maxFailedCount;
    private String pin;
    private String securityId;
    private String sessionId;
    private String userId;
    private UserInfo userInfo;
    private boolean userInfoCompleted;
    private List<String> verificationMethods;

    public int describeContents() {
        return 0;
    }

    protected LoginResponse(Parcel parcel) {
        this.userId = parcel.readString();
        this.sessionId = parcel.readString();
        this.clientKey = parcel.readString();
        this.userInfoCompleted = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.securityId = parcel.readString();
        this.userInfo = (UserInfo) parcel.readParcelable(UserInfo.class.getClassLoader());
        this.maxFailedCount = Integer.valueOf(parcel.readInt());
        this.lockedExpireSeconds = Integer.valueOf(parcel.readInt());
        this.failedCount = Integer.valueOf(parcel.readInt());
        this.verificationMethods = parcel.createStringArrayList();
        this.evUrlStatus = (EvUrlStatus) parcel.readParcelable(EvUrlStatus.class.getClassLoader());
        this.leftTimes = Integer.valueOf(parcel.readInt());
        this.pin = parcel.readString();
        this.key = parcel.readString();
    }

    public LoginResponse() {
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String getClientKey() {
        return this.clientKey;
    }

    public void setClientKey(String str) {
        this.clientKey = str;
    }

    public boolean isUserInfoCompleted() {
        return this.userInfoCompleted;
    }

    public void setUserInfoCompleted(boolean z) {
        this.userInfoCompleted = z;
    }

    public String getSecurityId() {
        return this.securityId;
    }

    public void setSecurityId(String str) {
        this.securityId = str;
    }

    public EvUrlStatus getEvUrlStatus() {
        return this.evUrlStatus;
    }

    public void setEvUrlStatus(EvUrlStatus evUrlStatus2) {
        this.evUrlStatus = evUrlStatus2;
    }

    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public void setUserInfo(UserInfo userInfo2) {
        this.userInfo = userInfo2;
    }

    public Integer getMaxFailedCount() {
        return this.maxFailedCount;
    }

    public void setMaxFailedCount(Integer num) {
        this.maxFailedCount = num;
    }

    public Integer getLockedExpireSeconds() {
        return this.lockedExpireSeconds;
    }

    public void setLockedExpireSeconds(Integer num) {
        this.lockedExpireSeconds = num;
    }

    public Integer getFailedCount() {
        return this.failedCount;
    }

    public void setFailedCount(Integer num) {
        this.failedCount = num;
    }

    public List<String> getVerificationMethods() {
        return this.verificationMethods;
    }

    public void setVerificationMethods(List<String> list) {
        this.verificationMethods = list;
    }

    public Integer getLeftTimes() {
        return this.leftTimes;
    }

    public void setLeftTimes(Integer num) {
        this.leftTimes = num;
    }

    public String getPin() {
        return this.pin;
    }

    public void setPin(String str) {
        this.pin = str;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.sessionId);
        parcel.writeString(this.clientKey);
        parcel.writeValue(Boolean.valueOf(this.userInfoCompleted));
        parcel.writeString(this.securityId);
        parcel.writeParcelable(this.userInfo, i);
        parcel.writeInt(this.maxFailedCount.intValue());
        parcel.writeInt(this.lockedExpireSeconds.intValue());
        parcel.writeInt(this.failedCount.intValue());
        parcel.writeStringList(this.verificationMethods);
        parcel.writeParcelable(this.evUrlStatus, i);
        parcel.writeInt(this.leftTimes.intValue());
        parcel.writeString(this.pin);
        parcel.writeString(this.key);
    }
}
