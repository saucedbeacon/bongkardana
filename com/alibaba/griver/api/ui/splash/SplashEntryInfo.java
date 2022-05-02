package com.alibaba.griver.api.ui.splash;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class SplashEntryInfo implements Parcelable {
    public static final Parcelable.Creator<SplashEntryInfo> CREATOR = new Parcelable.Creator<SplashEntryInfo>() {
        public final SplashEntryInfo createFromParcel(Parcel parcel) {
            return new SplashEntryInfo(parcel);
        }

        public final SplashEntryInfo[] newArray(int i) {
            return new SplashEntryInfo[i];
        }
    };
    public String appId;
    public String appName;
    public String desc;
    public String iconUrl;
    public String slogan;

    public int describeContents() {
        return 0;
    }

    public SplashEntryInfo() {
    }

    protected SplashEntryInfo(Parcel parcel) {
        this.appId = parcel.readString();
        this.appName = parcel.readString();
        this.iconUrl = parcel.readString();
        this.desc = parcel.readString();
        this.slogan = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.appId);
        parcel.writeString(this.appName);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.desc);
        parcel.writeString(this.slogan);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SplashEntryInfo{appName='");
        sb.append(this.appName);
        sb.append('\'');
        sb.append(", appId='");
        sb.append(this.appId);
        sb.append('\'');
        sb.append(", iconUrl='");
        sb.append(this.iconUrl);
        sb.append('\'');
        sb.append(", slogan='");
        sb.append(this.slogan);
        sb.append('\'');
        sb.append(", desc='");
        sb.append(this.desc);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
