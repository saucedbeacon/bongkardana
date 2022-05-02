package com.facebook.stetho.server.http;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import kotlin.text.Typography;
import o.onActivityPreCreated;

public abstract class LightHttpBody {
    private static long getMax = 4246596355878425207L;
    private static int length = 0;
    private static int setMin = 1;

    public abstract int contentLength();

    public abstract String contentType();

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public static LightHttpBody create(String str, String str2) {
        int i = setMin + 117;
        length = i % 128;
        int i2 = i % 2;
        try {
            char c = 7;
            LightHttpBody create = create(str.getBytes(setMin(new char[]{8599, 63064, 2148, 8642, 27093, 58491, 11468, 24221, 26739}).intern()), str2);
            int i3 = setMin + 11;
            length = i3 % 128;
            if (i3 % 2 == 0) {
                c = Typography.amp;
            }
            if (c == '&') {
                return create;
            }
            int i4 = 89 / 0;
            return create;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static LightHttpBody create(final byte[] bArr, final String str) {
        AnonymousClass1 r0 = new LightHttpBody() {
            public final String contentType() {
                return str;
            }

            public final int contentLength() {
                return bArr.length;
            }

            public final void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(bArr);
            }
        };
        try {
            int i = length + 99;
            try {
                setMin = i % 128;
                if ((i % 2 == 0 ? 12 : '(') != 12) {
                    return r0;
                }
                Object obj = null;
                super.hashCode();
                return r0;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    private static String setMin(char[] cArr) {
        boolean z;
        try {
            int i = setMin + 123;
            length = i % 128;
            int i2 = i % 2;
            char[] length2 = onActivityPreCreated.length(getMax, cArr);
            int i3 = 4;
            while (true) {
                z = true;
                if (!(i3 < length2.length)) {
                    break;
                }
                int i4 = length + 27;
                setMin = i4 % 128;
                if (i4 % 2 == 0) {
                    length2[i3] = (char) ((int) (((long) (length2[i3] | length2[i3 * 5])) * (((long) (i3 >>> 3)) % getMax)));
                    i3 += 82;
                } else {
                    length2[i3] = (char) ((int) (((long) (length2[i3] ^ length2[i3 % 4])) ^ (((long) (i3 - 4)) * getMax)));
                    i3++;
                }
            }
            String str = new String(length2, 4, length2.length - 4);
            int i5 = setMin + 71;
            length = i5 % 128;
            if (i5 % 2 == 0) {
                z = false;
            }
            if (!z) {
                return str;
            }
            int i6 = 20 / 0;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }
}
