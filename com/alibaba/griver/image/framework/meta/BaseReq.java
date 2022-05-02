package com.alibaba.griver.image.framework.meta;

import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

public class BaseReq extends BaseInfo {
    public static final String KEY_FILE_KEY = "filekey";
    public static final String KEY_NETCHECK = "netcheck";
    public static final String KEY_REFID = "refid";
    public static final String KEY_SSID = "ssid";
    public static final int MAX_SUPER_SIZE = 16000;
    public static final int PRIORITY_HIGH = 10;
    public static final int PRIORITY_LOW = 1;
    public static final int PRIORITY_MID = 5;
    public static final int QUALITY_DJ_DEFUALT = 80;
    public static final int QUALITY_DJ_MIN = 40;
    public static final int QUALITY_NONE = -1;

    /* renamed from: a  reason: collision with root package name */
    private Integer f10476a = -1;
    public String aliasPath;
    private boolean b = false;
    public BaseOptions baseOptions;
    public Bundle bundle;
    private WeakReference<Context> c;
    public boolean detectedGif;
    public boolean enableSaliency = false;
    public String fileKey;
    public Integer height;
    public Float scale;
    public boolean shareGifMemCache = true;
    public Size srcSize;
    public boolean usingSourceType;
    public Integer width;

    public void setQuality(int i) {
        this.f10476a = Integer.valueOf(a(i));
    }

    public int getQuality() {
        return this.f10476a.intValue();
    }

    public void setPriority(int i) {
        super.setPriority(i);
    }

    public int getPriority() {
        return super.getPriority();
    }

    public void setProgressive(boolean z) {
        this.b = z;
    }

    public boolean isProgressive() {
        return this.b;
    }

    public void setContext(Context context) {
        if (context != null) {
            this.c = new WeakReference<>(context);
        }
    }

    public Context getContext() {
        WeakReference<Context> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private int a(int i) {
        if (i <= 0) {
            return -1;
        }
        if (i >= 80) {
            return 80;
        }
        if (i <= 0 || i >= 40) {
            return (i / 10) * 10;
        }
        return 40;
    }

    public static boolean isSuperSize(Integer num) {
        return (num == null || num.intValue() <= 16000 || num.intValue() == Integer.MAX_VALUE) ? false : true;
    }

    public void setEnableSaliency(boolean z) {
        this.enableSaliency = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseReq{width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", quality=");
        sb.append(this.f10476a);
        sb.append(", bProgressive=");
        sb.append(this.b);
        sb.append(", scale=");
        sb.append(this.scale);
        sb.append(", srcSize=");
        sb.append(this.srcSize);
        sb.append(", businessId='");
        sb.append(this.businessId);
        sb.append(", aliasPath=");
        sb.append(this.aliasPath);
        sb.append(", usingSourceType=");
        sb.append(this.usingSourceType);
        sb.append(", context=");
        sb.append(getContext());
        sb.append(", detectedGif=");
        sb.append(this.detectedGif);
        sb.append(", shareGifMemCache=");
        sb.append(this.shareGifMemCache);
        sb.append(", enableSaliency=");
        sb.append(this.enableSaliency);
        sb.append(", baseInfo=");
        sb.append(super.toString());
        sb.append(", fileKey=");
        sb.append(this.fileKey);
        sb.append(", bundle=");
        sb.append(this.bundle);
        sb.append('}');
        return sb.toString();
    }
}
