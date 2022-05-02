package com.alibaba.griver.image.framework.meta;

import android.text.TextUtils;
import java.util.Map;

public class BaseInfo {
    public static final int PRIORITY_HIGH = 10;
    public static final int PRIORITY_LOW = 1;
    public static final int PRIORITY_MID = 5;

    /* renamed from: a  reason: collision with root package name */
    private String f10475a;
    private Integer b = 5;
    public String businessId;
    private boolean c = false;
    private int d = -1;
    private String e;
    public Map<String, String> extInfo;
    private long f = Long.MAX_VALUE;

    public int getPriority() {
        return this.b.intValue();
    }

    public void setPriority(int i) {
        if (i > 0 && i <= 10) {
            this.b = Integer.valueOf(i);
        }
    }

    public boolean isHttps() {
        return this.c;
    }

    public void setHttps(boolean z) {
        this.c = z;
    }

    public String getBizType() {
        if (TextUtils.isEmpty(this.e)) {
            this.e = this.businessId;
        }
        return this.e;
    }

    public BaseInfo setBizType(String str) {
        this.e = str;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseInfo{md5='");
        sb.append(this.f10475a);
        sb.append('\'');
        sb.append(", priority=");
        sb.append(this.b);
        sb.append(", bHttps=");
        sb.append(this.c);
        sb.append(", bizType='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", businessId='");
        sb.append(this.businessId);
        sb.append('\'');
        sb.append(", extInfo='");
        sb.append(this.extInfo);
        sb.append('\'');
        sb.append(", expiredTime='");
        sb.append(this.f);
        sb.append('\'');
        sb.append("，mTimeout=");
        sb.append(this.d);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
