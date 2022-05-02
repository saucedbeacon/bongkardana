package com.alibaba.ariver.resource.api.appinfo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Map;

public class UpdateAppException extends RuntimeException implements Parcelable {
    public static final Parcelable.Creator<UpdateAppException> CREATOR = new Parcelable.Creator<UpdateAppException>() {
        public final UpdateAppException createFromParcel(Parcel parcel) {
            return new UpdateAppException(parcel);
        }

        public final UpdateAppException[] newArray(int i) {
            return new UpdateAppException[i];
        }
    };
    public static final String ERROR_NO_APPINFO = "1";
    public static final String ERROR_UNKNOWN = "0";
    private String code;
    @Nullable
    private Map<String, String> extras;
    private boolean needShowError;

    public int describeContents() {
        return 0;
    }

    public UpdateAppException(String str, String str2) {
        this(str, str2, (Map<String, String>) null);
    }

    public UpdateAppException(String str, String str2, @Nullable Map<String, String> map) {
        super(str2);
        this.extras = null;
        this.needShowError = true;
        this.code = str;
        this.extras = map;
    }

    protected UpdateAppException(Parcel parcel) {
        this.extras = null;
        boolean z = true;
        this.needShowError = true;
        this.code = parcel.readString();
        if (parcel.readByte() == 1) {
            parcel.readMap(this.extras, UpdateAppException.class.getClassLoader());
        }
        this.needShowError = parcel.readByte() != 1 ? false : z;
    }

    public boolean isNeedShowError() {
        return this.needShowError;
    }

    public void setNeedShowError(boolean z) {
        this.needShowError = z;
    }

    public String getCode() {
        return this.code;
    }

    @Nullable
    public Map<String, String> getExtras() {
        return this.extras;
    }

    public UpdateAppException(Throwable th) {
        super(th);
        this.extras = null;
        this.needShowError = true;
        this.code = "0";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
        int i2 = this.extras != null ? 1 : 0;
        parcel.writeByte((byte) i2);
        if (i2 != 0) {
            parcel.writeMap(this.extras);
        }
        parcel.writeByte(this.needShowError ? (byte) 1 : 0);
    }
}
