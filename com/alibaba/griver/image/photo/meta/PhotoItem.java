package com.alibaba.griver.image.photo.meta;

import android.os.Parcel;
import android.os.Parcelable;

public class PhotoItem extends PhotoInfo {
    public static final Parcelable.Creator<PhotoItem> CREATOR = new Parcelable.Creator<PhotoItem>() {
        public final PhotoItem createFromParcel(Parcel parcel) {
            return new PhotoItem(parcel);
        }

        public final PhotoItem[] newArray(int i) {
            return new PhotoItem[i];
        }
    };
    public static final int TYPE_PHOTO_GIF = 10;

    /* renamed from: a  reason: collision with root package name */
    private boolean f10501a;
    public boolean isDisabledByIntercept;
    public boolean isLoadedOnce;
    public String modifyTimeDesc;
    public boolean takePhoto;

    public int describeContents() {
        return 0;
    }

    public PhotoItem() {
        this((String) null, false, "", "");
    }

    public PhotoItem(String str) {
        this(str, false, "", "");
    }

    public PhotoItem(String str, boolean z) {
        this(str, z, "", "");
    }

    public PhotoItem(String str, boolean z, String str2, String str3) {
        super(str);
        setSelected(z);
        setLeftText(str2);
        setRightText(str3);
        this.f10501a = true;
        this.takePhoto = false;
    }

    public PhotoItem(Parcel parcel) {
        super(parcel);
        boolean z = true;
        this.f10501a = parcel.readInt() > 0;
        this.takePhoto = parcel.readInt() <= 0 ? false : z;
    }

    public PhotoItem(PhotoInfo photoInfo) {
        super(photoInfo);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f10501a ? 1 : 0);
        parcel.writeInt(this.takePhoto ? 1 : 0);
    }
}
