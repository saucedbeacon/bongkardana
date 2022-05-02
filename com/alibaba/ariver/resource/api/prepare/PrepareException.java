package com.alibaba.ariver.resource.api.prepare;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

@Keep
public class PrepareException extends Exception implements Parcelable {
    public static final Parcelable.Creator<PrepareException> CREATOR = new Parcelable.Creator<PrepareException>() {
        public final PrepareException createFromParcel(Parcel parcel) {
            return new PrepareException(parcel);
        }

        public final PrepareException[] newArray(int i) {
            return new PrepareException[i];
        }
    };
    public static final String ERROR_APPX_CHECK_FAILED = "7";
    public static final String ERROR_AUTH_FAIL = "8";
    public static final String ERROR_DOWNLOAD_EXCEPTION = "4";
    public static final String ERROR_NO_APPINFO = "1";
    public static final String ERROR_NO_URL = "6";
    public static final String ERROR_RPC_EXCEPTION = "2";
    public static final String ERROR_TIMEOUT = "3";
    public static final String ERROR_UNKNOWN = "0";
    public static final String ERROR_UNZIP_EXCEPTION = "5";
    private String code;
    private boolean needShowFail;

    public int describeContents() {
        return 0;
    }

    public PrepareException(String str) {
        this("0", str, (Throwable) null);
    }

    public PrepareException(String str, String str2) {
        this(str, str2, (Throwable) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PrepareException(java.lang.String r3, java.lang.String r4, java.lang.Throwable r5) {
        /*
            r2 = this;
            r2.<init>(r4, r5)
            r2.code = r3
            int r4 = r3.hashCode()
            r5 = 3
            r0 = 2
            r1 = 1
            switch(r4) {
                case 50: goto L_0x002e;
                case 51: goto L_0x0024;
                case 52: goto L_0x001a;
                case 53: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0038
        L_0x0010:
            java.lang.String r4 = "5"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0038
            r3 = 3
            goto L_0x0039
        L_0x001a:
            java.lang.String r4 = "4"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0038
            r3 = 2
            goto L_0x0039
        L_0x0024:
            java.lang.String r4 = "3"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0038
            r3 = 1
            goto L_0x0039
        L_0x002e:
            java.lang.String r4 = "2"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0038
            r3 = 0
            goto L_0x0039
        L_0x0038:
            r3 = -1
        L_0x0039:
            if (r3 == 0) goto L_0x0042
            if (r3 == r1) goto L_0x0042
            if (r3 == r0) goto L_0x0042
            if (r3 == r5) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r2.needShowFail = r1
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.api.prepare.PrepareException.<init>(java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    protected PrepareException(Parcel parcel) {
        this.code = parcel.readString();
    }

    public String getCode() {
        return this.code;
    }

    public boolean isNeedShowFail() {
        return this.needShowFail;
    }

    public void setNeedShowFail(boolean z) {
        this.needShowFail = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.code);
    }
}
