package com.alibaba.ariver.app.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONObject;

public class EntryInfo implements Parcelable {
    public static final Parcelable.Creator<EntryInfo> CREATOR = new Parcelable.Creator<EntryInfo>() {
        public final EntryInfo createFromParcel(Parcel parcel) {
            return new EntryInfo(parcel);
        }

        public final EntryInfo[] newArray(int i) {
            return new EntryInfo[i];
        }
    };
    public String desc;
    public JSONObject extraInfo;
    public String iconUrl;
    public boolean isOffline;
    public String slogan;
    public String title;

    public int describeContents() {
        return 0;
    }

    public EntryInfo() {
    }

    public EntryInfo(String str, String str2, String str3, boolean z) {
        this.title = str;
        this.iconUrl = str2;
        this.slogan = str3;
        this.isOffline = z;
    }

    public EntryInfo(Parcel parcel) {
        this.title = parcel.readString();
        this.iconUrl = parcel.readString();
        this.slogan = parcel.readString();
        this.desc = parcel.readString();
        this.isOffline = parcel.readByte() != 1 ? false : true;
        this.extraInfo = (JSONObject) parcel.readSerializable();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.slogan);
        parcel.writeString(this.desc);
        parcel.writeByte(this.isOffline ^ true ? (byte) 1 : 0);
        parcel.writeSerializable(this.extraInfo);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EntryInfo{title='");
        sb.append(this.title);
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
        sb.append(", extraInfo='");
        sb.append(this.extraInfo);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
