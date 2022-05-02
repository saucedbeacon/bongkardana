package id.dana.domain.model.rpc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import java.util.List;
import o.GriverSecurity;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class UserInfo implements Parcelable {
    public static final Parcelable.Creator<UserInfo> CREATOR = new Parcelable.Creator<UserInfo>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new UserInfo[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new UserInfo(parcel);
        }
    };
    private String avatarUrl;
    private String birthday;
    private boolean certified;
    private String certifiedLevel;
    private List<String> emails;
    private String firstName;
    private String gender;
    private String job;
    private String language;
    private String lastName;
    private List<GriverSecurity> loginIdInfos;
    private String middleName;
    private List<String> mobileNos;
    private String nationality;
    private String nickname;
    private Date registeredTime;
    private String userId;
    private String userStatus;

    public int describeContents() {
        return 0;
    }

    protected UserInfo(Parcel parcel) {
        this.userId = parcel.readString();
        this.userStatus = parcel.readString();
        this.avatarUrl = parcel.readString();
        this.nickname = parcel.readString();
        this.birthday = parcel.readString();
        this.job = parcel.readString();
        this.nationality = parcel.readString();
        this.gender = parcel.readString();
        this.certified = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.certifiedLevel = parcel.readString();
        this.firstName = parcel.readString();
        this.middleName = parcel.readString();
        this.lastName = parcel.readString();
        this.mobileNos = parcel.createStringArrayList();
        this.emails = parcel.createStringArrayList();
        this.language = parcel.readString();
        this.registeredTime = (Date) parcel.readValue(Date.class.getClassLoader());
    }

    public UserInfo() {
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getUserStatus() {
        return this.userStatus;
    }

    public void setUserStatus(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-8756146, oncanceled);
            onCancelLoad.getMin(-8756146, oncanceled);
        }
        this.userStatus = str;
    }

    public List<GriverSecurity> getLoginIdInfos() {
        return this.loginIdInfos;
    }

    public void setLoginIdInfos(List<GriverSecurity> list) {
        this.loginIdInfos = list;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String str) {
        this.job = str;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String str) {
        this.nationality = str;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public boolean isCertified() {
        return this.certified;
    }

    public void setCertified(boolean z) {
        this.certified = z;
    }

    public String getCertifiedLevel() {
        return this.certifiedLevel;
    }

    public void setCertifiedLevel(String str) {
        this.certifiedLevel = str;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String str) {
        this.middleName = str;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public List<String> getMobileNos() {
        return this.mobileNos;
    }

    public void setMobileNos(List<String> list) {
        this.mobileNos = list;
    }

    public List<String> getEmails() {
        return this.emails;
    }

    public void setEmails(List<String> list) {
        this.emails = list;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public Date getRegisteredTime() {
        return this.registeredTime;
    }

    public void setRegisteredTime(Date date) {
        this.registeredTime = date;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.userId);
        parcel.writeString(this.userStatus);
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.nickname);
        parcel.writeString(this.birthday);
        parcel.writeString(this.job);
        parcel.writeString(this.nationality);
        parcel.writeString(this.gender);
        parcel.writeValue(Boolean.valueOf(this.certified));
        parcel.writeString(this.certifiedLevel);
        parcel.writeString(this.firstName);
        parcel.writeString(this.middleName);
        parcel.writeString(this.lastName);
        parcel.writeStringList(this.mobileNos);
        parcel.writeStringList(this.emails);
        parcel.writeString(this.language);
        parcel.writeValue(this.registeredTime);
    }
}
