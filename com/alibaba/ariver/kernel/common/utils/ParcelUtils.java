package com.alibaba.ariver.kernel.common.utils;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelUtils {
    public static <T extends Parcelable> T parcelAndUnParcel(T t) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(t, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain2.unmarshall(marshall, 0, marshall.length);
            obtain2.setDataPosition(0);
            return obtain2.readParcelable(ParcelUtils.class.getClassLoader());
        } finally {
            obtain2.recycle();
        }
    }
}
