package com.alibaba.ariver.kernel.api.remote;

import android.os.Parcel;
import android.os.Parcelable;

public class RemoteCallResult implements Parcelable {
    public static final Parcelable.Creator<RemoteCallResult> CREATOR = new Parcelable.Creator<RemoteCallResult>() {
        public final RemoteCallResult createFromParcel(Parcel parcel) {
            return new RemoteCallResult(parcel);
        }

        public final RemoteCallResult[] newArray(int i) {
            return new RemoteCallResult[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private boolean f9128a = false;
    private Object b;

    public int describeContents() {
        return 0;
    }

    public RemoteCallResult(Object obj) {
        if (obj instanceof Throwable) {
            this.f9128a = true;
        }
        this.b = obj;
    }

    protected RemoteCallResult(Parcel parcel) {
        boolean z = false;
        this.f9128a = parcel.readByte() != 0 ? true : z;
        this.b = parcel.readValue(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f9128a ? (byte) 1 : 0);
        parcel.writeValue(this.b);
    }

    public boolean isError() {
        return this.f9128a;
    }

    public Object getValue() {
        return this.b;
    }
}
