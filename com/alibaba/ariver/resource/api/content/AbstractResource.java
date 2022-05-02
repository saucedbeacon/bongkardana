package com.alibaba.ariver.resource.api.content;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.engine.api.resources.ResourceSourceType;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import java.util.HashMap;
import java.util.Map;
import o.onActivityPostCreated;

abstract class AbstractResource implements Resource {
    private static char getMax = '䈿';
    private static char getMin = '죪';
    private static char length = '';
    private static char setMax = '';
    private static int setMin = 0;
    private static int toFloatRange = 1;
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private String f10169a;
    private String b;
    private Map<String, String> c;
    private String d;
    private Map<String, String> e;
    protected ResourceSourceType mSourceType;

    AbstractResource(@NonNull String str) {
        try {
            this.b = str;
            this.f10169a = UrlUtils.purifyUrl(str);
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* access modifiers changed from: protected */
    public String getOriginUrl() {
        int i = setMin + 69;
        toFloatRange = i % 128;
        int i2 = i % 2;
        try {
            String str = this.b;
            int i3 = setMin + 37;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    @NonNull
    public String getUrl() {
        try {
            int i = toFloatRange + 107;
            setMin = i % 128;
            if (i % 2 == 0) {
                try {
                    return this.f10169a;
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                String str = this.f10169a;
                Object obj = null;
                super.hashCode();
                return str;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public String getEncoding() {
        String str;
        int i = toFloatRange + 85;
        setMin = i % 128;
        if (i % 2 == 0) {
            str = setMax(new char[]{15553, 1782, 50159, 56286, 49943, 9291}).intern();
        } else {
            str = setMax(new char[]{15553, 1782, 50159, 56286, 49943, 9291}).intern();
            Object obj = null;
            super.hashCode();
        }
        int i2 = toFloatRange + 103;
        setMin = i2 % 128;
        if ((i2 % 2 != 0 ? 'L' : '2') != 'L') {
            return str;
        }
        int i3 = 3 / 0;
        return str;
    }

    public String getMimeType() {
        if ((TextUtils.isEmpty(this.d) ? '5' : 24) != 24) {
            int i = toFloatRange + 107;
            setMin = i % 128;
            int i2 = i % 2;
            this.d = FileUtils.getMimeType(this.f10169a);
            try {
                int i3 = setMin + 69;
                toFloatRange = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        return this.d;
    }

    public boolean isLocal() {
        int i = toFloatRange + 83;
        setMin = i % 128;
        if (i % 2 != 0) {
        }
        int i2 = setMin + 63;
        toFloatRange = i2 % 128;
        if (!(i2 % 2 == 0)) {
            return false;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return false;
    }

    public void setSourceType(ResourceSourceType resourceSourceType) {
        int i = toFloatRange + 97;
        setMin = i % 128;
        boolean z = i % 2 == 0;
        this.mSourceType = resourceSourceType;
        if (!z) {
            int i2 = 89 / 0;
        }
    }

    public ResourceSourceType getSourceType() {
        int i = setMin + 61;
        toFloatRange = i % 128;
        int i2 = i % 2;
        ResourceSourceType resourceSourceType = this.mSourceType;
        int i3 = toFloatRange + 79;
        setMin = i3 % 128;
        int i4 = i3 % 2;
        return resourceSourceType;
    }

    public Map<String, String> getHeaders() {
        int i = setMin + 121;
        toFloatRange = i % 128;
        int i2 = i % 2;
        Map<String, String> map = this.c;
        int i3 = toFloatRange + 29;
        setMin = i3 % 128;
        if (!(i3 % 2 != 0)) {
            return map;
        }
        Object obj = null;
        super.hashCode();
        return map;
    }

    public Map<String, String> getRequestHeadersMap() {
        Map<String, String> map;
        int i = toFloatRange + 51;
        setMin = i % 128;
        Object[] objArr = null;
        if ((i % 2 != 0 ? 'J' : '(') != 'J') {
            map = this.e;
        } else {
            map = this.e;
            super.hashCode();
        }
        int i2 = setMin + 45;
        toFloatRange = i2 % 128;
        if ((i2 % 2 == 0 ? '@' : 0) != '@') {
            return map;
        }
        int length2 = objArr.length;
        return map;
    }

    public void addRequestHeader(String str, String str2) {
        int i = toFloatRange + 27;
        setMin = i % 128;
        int i2 = i % 2;
        if (this.e == null) {
            this.e = new HashMap();
            int i3 = setMin + 7;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
        }
        this.e.put(str, str2);
    }

    public void addHeader(String str, String str2) {
        int i = toFloatRange + 123;
        setMin = i % 128;
        int i2 = i % 2;
        try {
            Object[] objArr = null;
            if (("Content-Type".equalsIgnoreCase(str) ? 'V' : '*') != '*') {
                int i3 = toFloatRange + 55;
                setMin = i3 % 128;
                if (i3 % 2 == 0) {
                    this.d = FileUtils.getMimeTypeFromContentType(str2);
                    return;
                }
                this.d = FileUtils.getMimeTypeFromContentType(str2);
                int length2 = objArr.length;
                return;
            }
            if (this.c == null) {
                this.c = new HashMap();
            }
            this.c.put(str, str2);
            int i4 = toFloatRange + 87;
            setMin = i4 % 128;
            if (i4 % 2 != 0) {
                int length3 = objArr.length;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String setMax(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i = toFloatRange + 13;
        setMin = i % 128;
        int i2 = i % 2;
        int i3 = 0;
        while (true) {
            if (!(i3 < cArr.length)) {
                break;
            }
            int i4 = toFloatRange + 47;
            setMin = i4 % 128;
            int i5 = i4 % 2;
            cArr3[0] = cArr[i3];
            int i6 = i3 + 1;
            cArr3[1] = cArr[i6];
            onActivityPostCreated.setMax(cArr3, setMax, length, getMax, getMin);
            cArr2[i3] = cArr3[0];
            cArr2[i6] = cArr3[1];
            i3 += 2;
        }
        String str = new String(cArr2, 1, cArr2[0]);
        int i7 = setMin + 25;
        toFloatRange = i7 % 128;
        if (!(i7 % 2 == 0)) {
            return str;
        }
        int i8 = 81 / 0;
        return str;
    }
}
