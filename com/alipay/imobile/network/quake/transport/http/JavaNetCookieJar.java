package com.alipay.imobile.network.quake.transport.http;

import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.transport.http.Cookie;
import com.alipay.imobile.network.quake.util.e;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class JavaNetCookieJar implements CookieJar {

    /* renamed from: a  reason: collision with root package name */
    private final CookieHandler f9385a;

    public JavaNetCookieJar(CookieHandler cookieHandler) {
        this.f9385a = cookieHandler;
    }

    private List<Cookie> a(URL url, String str) {
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i = 0;
        while (i < length) {
            int a2 = e.a(str, i, length, ";,");
            int a3 = e.a(str, i, a2, '=');
            String c = e.c(str, i, a3);
            if (!c.startsWith("$")) {
                String c2 = a3 < a2 ? e.c(str, a3 + 1, a2) : "";
                if (c2.startsWith("\"") && c2.endsWith("\"")) {
                    c2 = c2.substring(1, c2.length() - 1);
                }
                arrayList.add(new Cookie.Builder().name(c).value(c2).domain(url.getHost()).build());
            }
            i = a2 + 1;
        }
        return arrayList;
    }

    public final List<Cookie> loadForRequest(URL url) {
        String str = Quake.TAG;
        StringBuilder sb = new StringBuilder("load cookie for url=");
        sb.append(url.toString());
        LoggerWrapper.d(str, sb.toString());
        try {
            Map<String, List<String>> map = this.f9385a.get(url.toURI(), Collections.emptyMap());
            ArrayList arrayList = null;
            if (map == null) {
                return Collections.emptyList();
            }
            for (Map.Entry next : map.entrySet()) {
                String str2 = (String) next.getKey();
                if (("Cookie".equalsIgnoreCase(str2) || "Cookie2".equalsIgnoreCase(str2) || "Set-Cookie".equalsIgnoreCase(str2) || HttpHeaders.SET_COOKIE2.equalsIgnoreCase(str2)) && !((List) next.getValue()).isEmpty()) {
                    for (String str3 : (List) next.getValue()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.addAll(a(url, str3));
                    }
                }
            }
            return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
        } catch (IOException | URISyntaxException e) {
            String str4 = Quake.TAG;
            StringBuilder sb2 = new StringBuilder("Loading cookies failed for ");
            sb2.append(url.toString());
            LoggerWrapper.w(str4, sb2.toString(), e);
            return Collections.emptyList();
        }
    }

    public final void saveFromResponse(URL url, List<Cookie> list) {
        String str = Quake.TAG;
        StringBuilder sb = new StringBuilder("save cookie for url=");
        sb.append(url.toString());
        LoggerWrapper.d(str, sb.toString());
        if (this.f9385a != null) {
            ArrayList arrayList = new ArrayList();
            for (Cookie obj : list) {
                arrayList.add(obj.toString());
            }
            try {
                this.f9385a.put(url.toURI(), Collections.singletonMap("Set-cookie", arrayList));
            } catch (IOException | URISyntaxException e) {
                String str2 = Quake.TAG;
                StringBuilder sb2 = new StringBuilder("Saving cookies failed for ");
                sb2.append(url.toString());
                LoggerWrapper.w(str2, sb2.toString(), e);
            }
        }
    }
}
