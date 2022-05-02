package com.iap.ac.android.acs.plugin.rpc.getphonenumber.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.iap.ac.android.acs.plugin.ui.utils.UIUtils;

public class MobilePhoneInfo implements Parcelable {
    public static final Parcelable.Creator<MobilePhoneInfo> CREATOR = new Parcelable.Creator<MobilePhoneInfo>() {
        public final MobilePhoneInfo createFromParcel(Parcel parcel) {
            MobilePhoneInfo mobilePhoneInfo = new MobilePhoneInfo();
            mobilePhoneInfo.region = parcel.readString();
            mobilePhoneInfo.formattedMobilePhoneNumber = parcel.readString();
            mobilePhoneInfo.mobilePhoneNumber = parcel.readString();
            mobilePhoneInfo.mobilePhoneRegionCode = parcel.readString();
            return mobilePhoneInfo;
        }

        public final MobilePhoneInfo[] newArray(int i) {
            return new MobilePhoneInfo[i];
        }
    };
    public String formattedMobilePhoneNumber;
    public String mobilePhoneNumber;
    public String mobilePhoneRegionCode;
    public String region;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.region);
        parcel.writeString(this.formattedMobilePhoneNumber);
        parcel.writeString(this.mobilePhoneNumber);
        parcel.writeString(this.mobilePhoneRegionCode);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MobilePhoneInfo{region='");
        sb.append(this.region);
        sb.append('\'');
        sb.append(", formattedMobilePhoneNumber='");
        sb.append(UIUtils.encryptPhoneNumber(this.formattedMobilePhoneNumber));
        sb.append('\'');
        sb.append(", mobilePhoneNumber='");
        sb.append(UIUtils.encryptPhoneNumber(this.mobilePhoneNumber));
        sb.append('\'');
        sb.append(", mobilePhoneRegionCode='");
        sb.append(this.mobilePhoneRegionCode);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
