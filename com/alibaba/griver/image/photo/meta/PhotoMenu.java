package com.alibaba.griver.image.photo.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import java.util.HashMap;

public class PhotoMenu implements Parcelable {
    public static final Parcelable.Creator<PhotoMenu> CREATOR = new Parcelable.Creator<PhotoMenu>() {
        public final PhotoMenu createFromParcel(Parcel parcel) {
            return new PhotoMenu(parcel);
        }

        public final PhotoMenu[] newArray(int i) {
            return new PhotoMenu[i];
        }
    };
    public static final Byte SUPPORT_PHOTO = (byte) 4;
    public static final Byte SUPPORT_VIDEO = (byte) 2;
    public static final Byte SUPPORT_VIDEO_ORI = (byte) 1;
    public static final String TAG = "PhotoMenu";
    public static final String TAG_COLLECT = "collect";
    public static final String TAG_DELETE = "delete";
    public static final String TAG_SHARE = "share";
    public String bizCode;
    public boolean enableImpl;
    public boolean enabled;
    public String extra;
    public String extra2;
    public String extra3;
    public HashMap<String, String> spmExtra;
    public String spmID;
    public Byte supportType = SUPPORT_PHOTO;
    public String tag;
    public String title;

    public int describeContents() {
        return 0;
    }

    public boolean isPhotoSupport() {
        return (this.supportType.byteValue() & SUPPORT_PHOTO.byteValue()) > 0;
    }

    public PhotoMenu(Parcel parcel) {
        this.title = parcel.readString();
        this.tag = parcel.readString();
        this.extra = parcel.readString();
        boolean z = false;
        this.enableImpl = parcel.readInt() == 1;
        this.enabled = parcel.readInt() == 1 ? true : z;
        this.supportType = Byte.valueOf(parcel.readByte());
        this.extra2 = parcel.readString();
        this.extra3 = parcel.readString();
        this.spmID = parcel.readString();
        this.bizCode = parcel.readString();
        try {
            this.spmExtra = parcel.readHashMap(HashMap.class.getClassLoader());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("read spmExtra exception :");
            sb.append(e.getMessage());
            RVLogger.d(TAG, sb.toString());
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.tag);
        parcel.writeString(this.extra);
        parcel.writeInt(this.enableImpl ? 1 : 0);
        parcel.writeInt(this.enabled ? 1 : 0);
        parcel.writeByte(this.supportType.byteValue());
        parcel.writeString(this.extra2);
        parcel.writeString(this.extra3);
        parcel.writeString(this.spmID);
        parcel.writeString(this.bizCode);
        try {
            parcel.writeMap(this.spmExtra);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("write spmExtra exception :");
            sb.append(e.getMessage());
            RVLogger.d(TAG, sb.toString());
        }
    }
}
