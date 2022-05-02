package com.alipay.mobile.rome.syncservice.sync.register;

import android.text.TextUtils;
import com.alipay.mobile.rome.syncsdk.a.a;
import com.alipay.mobile.rome.syncsdk.util.c;
import com.alipay.mobile.rome.syncservice.sync.b;

public final class Biz {

    /* renamed from: a  reason: collision with root package name */
    public String f9498a;
    public Integer b;
    public boolean c;
    public boolean d;
    public boolean e;
    public BizDimeEnum f;

    public enum BizDimeEnum {
        USER,
        DEVICE,
        NULL;

        public static BizDimeEnum getDime(String str) {
            if (TextUtils.equals(str, DEVICE.toString())) {
                return DEVICE;
            }
            if (TextUtils.equals(str, USER.toString())) {
                return USER;
            }
            return NULL;
        }

        public static BizDimeEnum getDime(int i) {
            if (i == 1) {
                return USER;
            }
            if (i == 2) {
                return DEVICE;
            }
            return NULL;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9498a);
        sb.append(",");
        sb.append(this.b);
        sb.append(",");
        sb.append(this.c);
        sb.append(",");
        sb.append(this.d);
        sb.append(",");
        sb.append(this.e);
        sb.append(",");
        BizDimeEnum bizDimeEnum = this.f;
        sb.append(bizDimeEnum == null ? null : bizDimeEnum.toString());
        return sb.toString();
    }

    public static Biz a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(",");
        if (split == null || split.length < 6) {
            c.d("Biz", "parseBiz length error: ".concat(String.valueOf(split)));
            return null;
        }
        Biz biz = new Biz();
        try {
            biz.f9498a = split[0];
            biz.b = Integer.valueOf(Integer.parseInt(split[1]));
            biz.c = Boolean.parseBoolean(split[2]);
            biz.d = Boolean.parseBoolean(split[3]);
            biz.e = Boolean.parseBoolean(split[4]);
            biz.f = BizDimeEnum.getDime(split[5]);
            return biz;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("parseBiz info=");
            sb.append(str);
            sb.append(", e=");
            sb.append(e2);
            c.a("Biz", sb.toString());
            String str2 = a.a().f9405a;
            if (TextUtils.isEmpty(str2)) {
                str2 = a.a().e();
            }
            b a2 = b.a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("|");
            sb2.append(e2);
            a2.a(sb2.toString(), (String) null, str2, "3019");
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Biz)) {
            return false;
        }
        Biz biz = (Biz) obj;
        if (com.alipay.mobile.rome.syncservice.d.b.a(this.f9498a, biz.f9498a) && this.d == biz.d && this.c == biz.c && this.e == biz.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.b;
        return (((((((num == null ? 0 : num.intValue()) + 629) * 37) + (this.c ? 1 : 0)) * 37) + (this.d ? 1 : 0)) * 37) + (this.e ? 1 : 0);
    }
}
