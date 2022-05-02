package id.dana.domain.profilemenu.model;

import android.os.Parcel;
import android.os.Parcelable;
import o.getWorkSpaceId;
import o.setBeaconParsers;

public class SettingModel implements Parcelable {
    public static final Parcelable.Creator<SettingModel> CREATOR = new Parcelable.Creator<SettingModel>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new SettingModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new SettingModel(parcel);
        }
    };
    private String action;
    private String autoRouteAuthenticationType;
    private boolean autoRouteSwitch;
    private String avatarUrl;
    private String balance;
    private String collection;
    private String currency = "";
    private boolean enable;
    private String expense = "";
    private String iconUrl;
    private String income = "";
    private setBeaconParsers initFeedStatus = null;
    private boolean kybRevoked;
    private boolean kycRevoked;
    private String name;
    private boolean needToShow = true;
    private boolean nullObject = false;
    private String redirectUrl;
    private boolean shareFeed;
    private String subtitle;
    private String subtitleColor;
    private boolean subtitleIsBelow;
    private String subtitleType;
    private String title;
    private getWorkSpaceId userInvestmentInfo = null;
    private String username = "";
    private int viewType;

    public int describeContents() {
        return 0;
    }

    private SettingModel(boolean z) {
        this.nullObject = z;
    }

    protected SettingModel(Parcel parcel) {
        boolean z = false;
        this.nullObject = parcel.readByte() != 0;
        this.title = parcel.readString();
        this.subtitle = parcel.readString();
        this.subtitleType = parcel.readString();
        this.subtitleIsBelow = parcel.readByte() != 0;
        this.subtitleColor = parcel.readString();
        this.iconUrl = parcel.readString();
        this.redirectUrl = parcel.readString();
        this.action = parcel.readString();
        this.enable = parcel.readByte() != 0;
        this.collection = parcel.readString();
        this.name = parcel.readString();
        this.balance = parcel.readString();
        this.viewType = parcel.readInt();
        this.kybRevoked = parcel.readByte() != 0;
        this.kycRevoked = parcel.readByte() != 0;
        this.avatarUrl = parcel.readString();
        this.needToShow = parcel.readByte() != 0;
        this.shareFeed = parcel.readByte() != 0;
        this.autoRouteSwitch = parcel.readByte() != 0 ? true : z;
        this.income = parcel.readString();
        this.expense = parcel.readString();
        this.currency = parcel.readString();
        this.username = parcel.readString();
    }

    public SettingModel() {
    }

    public static SettingModel empty() {
        return new SettingModel(true);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.nullObject ? (byte) 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.subtitleType);
        parcel.writeByte(this.subtitleIsBelow ? (byte) 1 : 0);
        parcel.writeString(this.subtitleColor);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.redirectUrl);
        parcel.writeString(this.action);
        parcel.writeByte(this.enable ? (byte) 1 : 0);
        parcel.writeString(this.collection);
        parcel.writeString(this.name);
        parcel.writeString(this.balance);
        parcel.writeInt(this.viewType);
        parcel.writeByte(this.kybRevoked ? (byte) 1 : 0);
        parcel.writeByte(this.kycRevoked ? (byte) 1 : 0);
        parcel.writeString(this.avatarUrl);
        parcel.writeByte(this.needToShow ? (byte) 1 : 0);
        parcel.writeByte(this.shareFeed ? (byte) 1 : 0);
        parcel.writeByte(this.autoRouteSwitch ? (byte) 1 : 0);
        parcel.writeString(this.income);
        parcel.writeString(this.expense);
        parcel.writeString(this.currency);
        parcel.writeString(this.username);
    }

    public setBeaconParsers getInitFeedStatus() {
        return this.initFeedStatus;
    }

    public void setInitFeedStatus(setBeaconParsers setbeaconparsers) {
        this.initFeedStatus = setbeaconparsers;
    }

    public boolean isNullObject() {
        return this.nullObject;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public void setEnable(boolean z) {
        this.enable = z;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setRedirectUrl(String str) {
        this.redirectUrl = str;
    }

    public int getViewType() {
        return this.viewType;
    }

    public void setViewType(int i) {
        this.viewType = i;
    }

    public String getBalance() {
        return this.balance;
    }

    public void setBalance(String str) {
        this.balance = str;
    }

    public boolean isKybRevoked() {
        return this.kybRevoked;
    }

    public void setKybRevoked(boolean z) {
        this.kybRevoked = z;
    }

    public boolean isKycRevoked() {
        return this.kycRevoked;
    }

    public void setKycRevoked(boolean z) {
        this.kycRevoked = z;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public String getSubtitleType() {
        return this.subtitleType;
    }

    public void setSubtitleType(String str) {
        this.subtitleType = str;
    }

    public Boolean getSubtitleIsBelow() {
        return Boolean.valueOf(this.subtitleIsBelow);
    }

    public void setSubtitleIsBelow(boolean z) {
        this.subtitleIsBelow = z;
    }

    public String getSubtitleColor() {
        return this.subtitleColor;
    }

    public void setSubtitleColor(String str) {
        this.subtitleColor = str;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public String getCollection() {
        return this.collection;
    }

    public void setCollection(String str) {
        this.collection = str;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public boolean isShareFeed() {
        return this.shareFeed;
    }

    public SettingModel setShareFeed(boolean z) {
        this.shareFeed = z;
        return this;
    }

    public boolean isAutoRouteSwitch() {
        return this.autoRouteSwitch;
    }

    public void setAutoRouteSwitch(boolean z) {
        this.autoRouteSwitch = z;
    }

    public String getAutoRouteAuthenticationType() {
        return this.autoRouteAuthenticationType;
    }

    public void setAutoRouteAuthenticationType(String str) {
        this.autoRouteAuthenticationType = str;
    }

    public boolean isNeedToShow() {
        return this.needToShow;
    }

    public void setNeedToShow(boolean z) {
        this.needToShow = z;
    }

    public String getIncome() {
        return this.income;
    }

    public void setIncome(String str) {
        this.income = str;
    }

    public String getExpense() {
        return this.expense;
    }

    public void setExpense(String str) {
        this.expense = str;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String str) {
        this.currency = str;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public getWorkSpaceId getUserInvestmentInfo() {
        return this.userInvestmentInfo;
    }

    public void setUserInvestmentInfo(getWorkSpaceId getworkspaceid) {
        this.userInvestmentInfo = getworkspaceid;
    }
}
