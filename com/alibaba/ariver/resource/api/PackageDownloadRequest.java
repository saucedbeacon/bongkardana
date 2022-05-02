package com.alibaba.ariver.resource.api;

import android.os.Parcel;
import android.os.Parcelable;

public class PackageDownloadRequest implements Parcelable {
    public static final Parcelable.Creator<PackageDownloadRequest> CREATOR = new Parcelable.Creator<PackageDownloadRequest>() {
        public final PackageDownloadRequest createFromParcel(Parcel parcel) {
            return new PackageDownloadRequest(parcel);
        }

        public final PackageDownloadRequest[] newArray(int i) {
            return new PackageDownloadRequest[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f10166a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private boolean g;

    public int describeContents() {
        return 0;
    }

    public PackageDownloadRequest() {
    }

    protected PackageDownloadRequest(Parcel parcel) {
        this.f10166a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        boolean z = true;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readByte() == 0 ? false : z;
    }

    public String getFileName() {
        return this.b;
    }

    public void setFileName(String str) {
        this.b = str;
    }

    public String getFilePath() {
        return this.c;
    }

    public void setFilePath(String str) {
        this.c = str;
    }

    public String getDownloadUrl() {
        return this.f10166a;
    }

    public void setDownloadUrl(String str) {
        this.f10166a = str;
    }

    public String getAppId() {
        return this.d;
    }

    public void setAppId(String str) {
        this.d = str;
    }

    public String getVersion() {
        return this.e;
    }

    public void setVersion(String str) {
        this.e = str;
    }

    public boolean isAutoInstall() {
        return this.f;
    }

    public void setAutoInstall(boolean z) {
        this.f = z;
    }

    public boolean isUrgentResource() {
        return this.g;
    }

    public void setIsUrgentResource(boolean z) {
        this.g = z;
    }

    public static boolean isInDownloadPath(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("nebulaDownload");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10166a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByte(this.f ? (byte) 1 : 0);
        parcel.writeByte(this.g ? (byte) 1 : 0);
    }
}
