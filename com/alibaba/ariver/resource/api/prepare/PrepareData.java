package com.alibaba.ariver.resource.api.prepare;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class PrepareData implements Parcelable {
    public static final Parcelable.Creator<PrepareData> CREATOR = new Parcelable.Creator<PrepareData>() {
        public final PrepareData createFromParcel(Parcel parcel) {
            return new PrepareData(parcel);
        }

        public final PrepareData[] newArray(int i) {
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(1562355055, oncanceled);
                onCancelLoad.getMin(1562355055, oncanceled);
            }
            return new PrepareData[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private long f9156a;
    private long b;
    private long c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f9157o;

    public int describeContents() {
        return 0;
    }

    public PrepareData() {
        clear();
    }

    protected PrepareData(Parcel parcel) {
        this.i = parcel.readString();
        this.f9156a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = parcel.readLong();
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.f9157o = parcel.readString();
    }

    public void clear() {
        this.d = 0;
        this.c = 0;
        this.b = 0;
        this.f9156a = 0;
        this.h = 0;
        this.f = 0;
        this.m = "";
        this.l = "";
        this.f9157o = "";
        this.n = "";
        this.k = "";
        this.j = "";
    }

    public long getBeginTime() {
        return this.f9156a;
    }

    public void setBeginTime(long j2) {
        this.f9156a = j2;
    }

    public long getRequestBeginTime() {
        return this.b;
    }

    public void setRequestBeginTime(long j2) {
        this.b = j2;
    }

    public long getRequestEndTime() {
        return this.c;
    }

    public void setRequestEndTime(long j2) {
        this.c = j2;
    }

    public long getDownloadTime() {
        return this.d;
    }

    public void setDownloadTime(long j2) {
        long j3 = this.d;
        if (j3 == 0 || j3 > j2) {
            this.d = j2;
        }
    }

    public long getInstallTime() {
        return this.f;
    }

    public void setInstallTime(long j2) {
        this.f = j2;
    }

    public long getDownloadEndTime() {
        return this.e;
    }

    public void setDownloadEndTime(long j2) {
        this.e = j2;
    }

    public long getInstallEndTime() {
        return this.g;
    }

    public void setInstallEndTime(long j2) {
        this.g = j2;
    }

    public String getAppType() {
        return this.i;
    }

    public void setAppType(String str) {
        this.i = str;
    }

    public long getEndTime() {
        return this.h;
    }

    public void setEndTime(long j2) {
        this.h = j2;
    }

    public String getRequestMode() {
        return this.j;
    }

    public void setRequestMode(UpdateMode updateMode) {
        this.j = String.valueOf(updateMode.value);
    }

    public String getOfflineMode() {
        return this.k;
    }

    public void setOfflineMode(OfflineMode offlineMode) {
        this.k = String.valueOf(offlineMode.value);
    }

    public String getNbUrl() {
        return this.m;
    }

    public void setNbUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            this.m = "";
        } else {
            this.m = str;
        }
    }

    public String getAppId() {
        return this.n;
    }

    public void setAppId(String str) {
        this.n = str;
    }

    public String getVersion() {
        return this.f9157o;
    }

    public void setVersion(String str) {
        this.f9157o = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PrepareData{beginTime=");
        sb.append(this.f9156a);
        sb.append(", requestBeginTime=");
        sb.append(this.b);
        sb.append(", requestEndTime=");
        sb.append(this.c);
        sb.append(", downloadTime=");
        sb.append(this.d);
        sb.append(", installTime=");
        sb.append(this.f);
        sb.append(", endTime=");
        sb.append(this.h);
        sb.append(", offlineMode=");
        sb.append(this.k);
        sb.append(", errorDetail=");
        sb.append(this.l);
        sb.append(", nbUrl='");
        sb.append(this.m);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.i);
        parcel.writeLong(this.f9156a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.f9157o);
    }
}
