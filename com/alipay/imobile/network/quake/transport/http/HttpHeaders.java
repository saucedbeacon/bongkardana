package com.alipay.imobile.network.quake.transport.http;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HttpHeaders {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f9380a;

    public static final class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f9381a = new ArrayList(20);

        private void b(String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("name == null");
            } else if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= 31 || charAt >= 127) {
                        throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in header name: %s", new Object[]{Integer.valueOf(charAt), Integer.valueOf(i), str}));
                    }
                }
                if (str2 != null) {
                    int length2 = str2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        char charAt2 = str2.charAt(i2);
                        if (charAt2 <= 31 || charAt2 >= 127) {
                            throw new IllegalArgumentException(String.format("Unexpected char %#04x at %d in %s value: %s", new Object[]{Integer.valueOf(charAt2), Integer.valueOf(i2), str, str2}));
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("value == null");
            } else {
                throw new IllegalArgumentException("name is empty");
            }
        }

        /* access modifiers changed from: package-private */
        public final Builder a(String str, String str2) {
            this.f9381a.add(str);
            this.f9381a.add(str2.trim());
            return this;
        }

        public final Builder add(String str) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                return add(str.substring(0, indexOf).trim(), str.substring(indexOf + 1));
            }
            throw new IllegalArgumentException("Unexpected header: ".concat(String.valueOf(str)));
        }

        public final Builder add(String str, String str2) {
            b(str, str2);
            return a(str, str2);
        }

        public final HttpHeaders build() {
            return new HttpHeaders(this);
        }

        public final String get(String str) {
            for (int size = this.f9381a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase(this.f9381a.get(size))) {
                    return this.f9381a.get(size + 1);
                }
            }
            return null;
        }

        public final Builder removeAll(String str) {
            int i = 0;
            while (i < this.f9381a.size()) {
                if (str.equalsIgnoreCase(this.f9381a.get(i))) {
                    this.f9381a.remove(i);
                    this.f9381a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, String str2) {
            b(str, str2);
            removeAll(str);
            a(str, str2);
            return this;
        }
    }

    private HttpHeaders(Builder builder) {
        this.f9380a = (String[]) builder.f9381a.toArray(new String[builder.f9381a.size()]);
    }

    public int a() {
        return this.f9380a.length / 2;
    }

    public String a(int i) {
        return this.f9380a[i * 2];
    }

    public List<String> a(String str) {
        int a2 = a();
        ArrayList arrayList = null;
        for (int i = 0; i < a2; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public Builder b() {
        Builder builder = new Builder();
        Collections.addAll(builder.f9381a, this.f9380a);
        return builder;
    }

    public String b(int i) {
        return this.f9380a[(i * 2) + 1];
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int a2 = a();
        for (int i = 0; i < a2; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
