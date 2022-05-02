package com.alibaba.ariver.kernel.common.io;

import android.os.Parcel;
import android.os.Parcelable;

public class ByteArrayParcelable implements Parcelable {
    public static final Parcelable.Creator<ByteArrayParcelable> CREATOR = new Parcelable.Creator<ByteArrayParcelable>() {
        public final ByteArrayParcelable createFromParcel(Parcel parcel) {
            return new ByteArrayParcelable(parcel);
        }

        public final ByteArrayParcelable[] newArray(int i) {
            return new ByteArrayParcelable[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private byte[] f10094a;

    public int describeContents() {
        return 0;
    }

    public ByteArrayParcelable(byte[] bArr) {
        this.f10094a = bArr;
    }

    protected ByteArrayParcelable(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.f10094a = bArr;
            parcel.readByteArray(bArr);
        }
    }

    public byte[] getBytes() {
        return this.f10094a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.f10094a;
        int length = bArr == null ? 0 : bArr.length;
        parcel.writeInt(length);
        if (length > 0) {
            parcel.writeByteArray(this.f10094a);
        }
    }
}
