package com.alibaba.griver.api.resource.appinfo;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;

public class UpdateAppException extends Throwable implements Parcelable {
    public static final Parcelable.Creator<UpdateAppException> CREATOR = new Parcelable.Creator<UpdateAppException>() {
        public final UpdateAppException createFromParcel(Parcel parcel) {
            return new UpdateAppException(parcel);
        }

        public final UpdateAppException[] newArray(int i) {
            return new UpdateAppException[i];
        }
    };
    public static final String ERROR_APP_INFO_NOT_EXIST = "1";
    public static final String ERROR_DOWNLOAD_EXCEPTION = "4";
    public static final String ERROR_NO_URL = "6";
    public static final String ERROR_RPC_EXCEPTION = "2";
    public static final String ERROR_TIMEOUT = "3";
    public static final String ERROR_UNKNOWN = "0";
    public static final String ERROR_UNZIP_EXCEPTION = "5";
    private String code;
    private Map<String, String> extras;

    public int describeContents() {
        return 0;
    }

    public UpdateAppException(Throwable th) {
        super(th);
        this.extras = null;
        this.code = "0";
    }

    public UpdateAppException(String str, String str2) {
        this(str, str2, (Map<String, String>) null);
    }

    public UpdateAppException(String str, String str2, Map<String, String> map) {
        super(str2);
        this.extras = null;
        this.code = str;
        this.extras = map;
    }

    public UpdateAppException(Parcel parcel) {
        this.extras = null;
        this.code = parcel.readString();
        if (parcel.readByte() == 1) {
            HashMap hashMap = new HashMap();
            this.extras = hashMap;
            parcel.readMap(hashMap, UpdateAppException.class.getClassLoader());
        }
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public Map<String, String> getExtras() {
        return this.extras;
    }

    public void setExtras(Map<String, String> map) {
        this.extras = map;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        int i2 = this.extras != null ? 1 : 0;
        parcel.writeByte((byte) i2);
        if (i2 != 0) {
            parcel.writeMap(this.extras);
        }
    }
}
