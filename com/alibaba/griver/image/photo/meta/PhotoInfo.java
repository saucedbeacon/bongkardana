package com.alibaba.griver.image.photo.meta;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.griver.image.framework.meta.Size;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class PhotoInfo implements Parcelable {
    public static final Parcelable.Creator<PhotoInfo> CREATOR = new Parcelable.Creator<PhotoInfo>() {
        public final PhotoInfo createFromParcel(Parcel parcel) {
            return new PhotoInfo(parcel);
        }

        public final PhotoInfo[] newArray(int i) {
            return new PhotoInfo[i];
        }
    };
    public static final int TYPE_PHOTO = 0;
    public static final int TYPE_PHOTO_SUB_TYPE_GIF = 100;
    public static final int TYPE_VIDEO = 1;
    public static final int TYPE_VIDEO_ORIGNAL = 2;
    private boolean A;
    private int B;
    private boolean C;
    private boolean D;
    private int E;

    /* renamed from: a  reason: collision with root package name */
    private int f9099a;
    private int b;
    public Bundle bizExtraParams;
    private double c;
    private double d;
    private long e;
    public Map<String, Object> extraInfo;
    private int f;
    private String g;
    private int h;
    private int i;
    public boolean isGiffSuffix;
    private int j;
    private int k;
    private Drawable l;
    private String m;
    private int n;

    /* renamed from: o  reason: collision with root package name */
    private int f9100o;
    public Size oriPhotoSize;
    private Drawable p;
    private String q;
    private String r;
    private Drawable s;
    public String shadowPathInQ;
    private Drawable t;
    private long u;
    private long v;
    public int videoHeight;
    public int videoWidth;
    public Rect viewBoundsOnScreen;
    private boolean w;
    private boolean x;
    private String y;
    private int z;

    public int describeContents() {
        return 0;
    }

    public int getMediaSubType() {
        return this.f9099a;
    }

    public void setMediaSubType(int i2) {
        int max = dispatchOnCancelled.setMax(i2);
        if (i2 != max) {
            onCanceled oncanceled = new onCanceled(i2, max, 1);
            onCancelLoad.setMax(-1718539989, oncanceled);
            onCancelLoad.getMin(-1718539989, oncanceled);
        }
        this.f9099a = i2;
    }

    public boolean isGif() {
        return this.b == 0 && this.f9099a == 100;
    }

    public double getLatitude() {
        return this.c;
    }

    public void setLatitude(double d2) {
        this.c = d2;
    }

    public double getLongitude() {
        return this.d;
    }

    public void setLongitude(double d2) {
        this.d = d2;
    }

    public int getPhotoGroupIndex() {
        return this.f;
    }

    public int getMediaType() {
        return this.b;
    }

    public boolean isVideo() {
        int i2 = this.b;
        return i2 == 1 || i2 == 2;
    }

    public void setIsAlbumMedia(boolean z2) {
        this.C = z2;
    }

    public boolean getIsAlbumMedia() {
        return this.C;
    }

    public void setMediaId(int i2) {
        this.E = i2;
    }

    public int getMediaId() {
        return this.E;
    }

    public boolean isPicCurrentlyTaked() {
        return this.D;
    }

    public void setIsPicCurrentlyTaked(boolean z2) {
        this.D = z2;
    }

    public PhotoInfo(String str) {
        this(str, "", "");
    }

    public PhotoInfo(String str, String str2, String str3) {
        this.b = 0;
        this.A = false;
        this.g = str;
        boolean isGifSuffix = isGifSuffix(str);
        this.isGiffSuffix = isGifSuffix;
        if (isGifSuffix) {
            this.f9099a = 100;
        }
        this.q = str2;
        this.r = str3;
        this.u = 0;
        this.h = 0;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.n = 0;
        this.f9100o = 0;
        this.w = false;
        this.x = false;
        this.z = -1;
    }

    public PhotoInfo(Parcel parcel) {
        boolean z2 = false;
        this.b = 0;
        this.A = false;
        this.g = parcel.readString();
        this.m = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.u = parcel.readLong();
        this.v = parcel.readLong();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.n = parcel.readInt();
        this.f9100o = parcel.readInt();
        this.w = parcel.readInt() > 0;
        this.x = parcel.readInt() > 0;
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.f = parcel.readInt();
        this.b = parcel.readInt();
        this.e = parcel.readLong();
        this.videoWidth = parcel.readInt();
        this.videoHeight = parcel.readInt();
        this.B = parcel.readInt();
        this.D = parcel.readInt() > 0;
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        this.isGiffSuffix = parcel.readInt() > 0;
        this.f9099a = parcel.readInt();
        this.E = parcel.readInt();
        this.C = parcel.readInt() > 0 ? true : z2;
    }

    public PhotoInfo(PhotoInfo photoInfo) {
        this.b = 0;
        this.A = false;
        this.g = photoInfo.g;
        this.l = photoInfo.l;
        this.q = photoInfo.q;
        this.r = photoInfo.r;
        this.s = photoInfo.s;
        this.p = photoInfo.p;
        this.m = photoInfo.m;
        this.u = photoInfo.u;
        this.v = photoInfo.v;
        this.t = photoInfo.t;
        this.h = photoInfo.h;
        this.i = photoInfo.i;
        this.j = photoInfo.j;
        this.k = photoInfo.k;
        this.n = photoInfo.n;
        this.f9100o = photoInfo.f9100o;
        this.w = photoInfo.w;
        this.x = photoInfo.x;
        this.y = photoInfo.y;
        this.z = photoInfo.z;
        this.f = photoInfo.f;
        this.b = photoInfo.b;
        this.e = photoInfo.e;
        this.videoHeight = photoInfo.videoHeight;
        this.videoWidth = photoInfo.videoWidth;
        this.B = photoInfo.B;
        this.D = photoInfo.D;
        this.c = photoInfo.c;
        this.d = photoInfo.d;
        this.isGiffSuffix = photoInfo.isGiffSuffix;
        this.A = photoInfo.A;
        this.extraInfo = photoInfo.extraInfo;
        this.bizExtraParams = photoInfo.bizExtraParams;
        this.f9099a = photoInfo.f9099a;
        this.E = photoInfo.E;
        this.C = photoInfo.C;
    }

    public void setPhotoOrientation(int i2) {
        this.B = i2;
    }

    public int getPhotoOrientation() {
        return this.B;
    }

    public String getThumbPath() {
        return this.m;
    }

    public PhotoInfo setThumbPath(String str) {
        this.m = str;
        return this;
    }

    public String getPhotoPath() {
        return this.g;
    }

    public PhotoInfo setPhotoPath(String str) {
        this.g = str;
        boolean isGifSuffix = isGifSuffix(str);
        this.isGiffSuffix = isGifSuffix;
        if (isGifSuffix) {
            this.f9099a = 100;
        }
        return this;
    }

    public String getLeftText() {
        return this.q;
    }

    public PhotoInfo setLeftText(String str) {
        this.q = str;
        return this;
    }

    public String getRightText() {
        return this.r;
    }

    public PhotoInfo setRightText(String str) {
        this.r = str;
        return this;
    }

    public long getPhotoSize() {
        return this.u;
    }

    public PhotoInfo setPhotoSize(long j2) {
        this.u = j2;
        return this;
    }

    public long getModifiedTime() {
        return this.v;
    }

    public PhotoInfo setModifiedTime(long j2) {
        this.v = j2;
        return this;
    }

    public Drawable getPhoto() {
        return this.l;
    }

    public PhotoInfo setPhoto(Drawable drawable) {
        this.l = drawable;
        return this;
    }

    public Drawable getThumb() {
        return this.p;
    }

    public PhotoInfo setThumb(Drawable drawable) {
        this.p = drawable;
        return this;
    }

    public Drawable getFail() {
        return this.s;
    }

    public PhotoInfo setFail(Drawable drawable) {
        this.s = drawable;
        return this;
    }

    public Drawable getLoading() {
        return this.t;
    }

    public PhotoInfo setLoading(Drawable drawable) {
        this.t = drawable;
        return this;
    }

    public int getPhotoWidth() {
        return this.h;
    }

    public PhotoInfo setPhotoWidth(int i2) {
        this.h = i2;
        return this;
    }

    public int getPhotoHeight() {
        return this.i;
    }

    public PhotoInfo setPhotoHeight(int i2) {
        this.i = i2;
        return this;
    }

    public boolean getLoadOrigin() {
        return this.w;
    }

    public PhotoInfo setLoadOrigin(boolean z2) {
        this.w = z2;
        return this;
    }

    public int getPhotoIndex() {
        return this.z;
    }

    public PhotoInfo setPhotoIndex(int i2) {
        this.z = i2;
        return this;
    }

    public int getLargePhotoWidth() {
        return this.j;
    }

    public void setLargePhotoWidth(int i2) {
        this.j = i2;
    }

    public int getLargePhotoHeight() {
        return this.k;
    }

    public void setLargePhotoHeight(int i2) {
        this.k = i2;
    }

    public void setInEdited(boolean z2) {
        this.A = z2;
    }

    public boolean getInEdited() {
        return this.A;
    }

    public boolean getSelected() {
        return this.x;
    }

    public PhotoInfo setSelected(boolean z2) {
        this.x = z2;
        return this;
    }

    public String getTag() {
        return this.y;
    }

    public PhotoInfo setTag(String str) {
        this.y = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.g);
        parcel.writeString(this.m);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeLong(this.u);
        parcel.writeLong(this.v);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f9100o);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.f);
        parcel.writeInt(this.b);
        parcel.writeLong(this.e);
        parcel.writeInt(this.videoWidth);
        parcel.writeInt(this.videoHeight);
        parcel.writeInt(this.B);
        parcel.writeInt(this.D ? 1 : 0);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeInt(this.isGiffSuffix ? 1 : 0);
        parcel.writeInt(this.f9099a);
        parcel.writeInt(this.E);
        parcel.writeInt(this.C ? 1 : 0);
    }

    public boolean isGifSuffix(String str) {
        if (str == null || str.length() <= 4) {
            return false;
        }
        int length = str.length();
        return str.substring(length - 4, length).equalsIgnoreCase(".gif");
    }
}
