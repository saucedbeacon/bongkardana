package com.alipay.a.a.a.a.a;

import com.alipay.a.a.a.a.s;
import com.alipay.b.a.f;
import java.util.ArrayList;
import o.getTabbarModel;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public final class e extends b {
    private int c;
    private Object d;

    public e(int i, String str, Object obj) {
        super(str, obj);
        this.c = i;
    }

    public final void a(Object obj) {
        this.d = obj;
    }

    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.d != null) {
                arrayList.add(new BasicNameValuePair("extParam", f.a(this.d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.f9228a));
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            arrayList.add(new BasicNameValuePair("id", sb.toString()));
            arrayList.add(new BasicNameValuePair("requestData", this.b == null ? "[]" : f.a(this.b)));
            return URLEncodedUtils.format(arrayList, getTabbarModel.ENC).getBytes();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("request  =");
            sb2.append(this.b);
            sb2.append(":");
            sb2.append(e);
            throw new s(9, sb2.toString() == null ? "" : e.getMessage(), e);
        }
    }
}
