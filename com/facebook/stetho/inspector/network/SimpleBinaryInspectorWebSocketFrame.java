package com.facebook.stetho.inspector.network;

import com.facebook.stetho.inspector.network.NetworkEventReporter;
import java.io.UnsupportedEncodingException;

public class SimpleBinaryInspectorWebSocketFrame implements NetworkEventReporter.InspectorWebSocketFrame {
    private static int getMax = 0;
    private static long length = 6092960635847004399L;
    private static int setMin = 1;
    private final byte[] mPayload;
    private final String mRequestId;

    public SimpleBinaryInspectorWebSocketFrame(String str, byte[] bArr) {
        try {
            this.mRequestId = str;
            this.mPayload = bArr;
        } catch (Exception e) {
            throw e;
        }
    }

    public String requestId() {
        String str;
        try {
            int i = setMin + 45;
            getMax = i % 128;
            if ((i % 2 != 0 ? 'G' : 20) != 'G') {
                try {
                    str = this.mRequestId;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                str = this.mRequestId;
                Object obj = null;
                super.hashCode();
            }
            int i2 = setMin + 89;
            getMax = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int opcode() {
        int i = getMax + 63;
        setMin = i % 128;
        int i2 = (i % 2 == 0 ? 'Y' : 'a') != 'a' ? 4 : 2;
        int i3 = getMax + 97;
        setMin = i3 % 128;
        if (!(i3 % 2 == 0)) {
            return i2;
        }
        int i4 = 92 / 0;
        return i2;
    }

    public boolean mask() {
        try {
            int i = getMax + 7;
            setMin = i % 128;
            int i2 = i % 2;
            try {
                int i3 = setMin + 91;
                getMax = i3 % 128;
                if (i3 % 2 == 0) {
                    return false;
                }
                int i4 = 43 / 0;
                return false;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public String payloadData() {
        try {
            char c = 0;
            String str = new String(this.mPayload, setMin(new char[]{31051, 10737, 41517, 15176, 46574, 3744}).intern());
            int i = setMin + 75;
            getMax = i % 128;
            if (i % 2 == 0) {
                c = '5';
            }
            if (c == '5') {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static String setMin(char[] cArr) {
        char c;
        int length2;
        int i = getMax + 21;
        setMin = i % 128;
        if (!(i % 2 == 0)) {
            c = cArr[0];
            length2 = cArr.length - 1;
        } else {
            c = cArr[0];
            length2 = cArr.length << 1;
        }
        char[] cArr2 = new char[length2];
        int i2 = 1;
        while (true) {
            if (i2 >= cArr.length) {
                return new String(cArr2);
            }
            int i3 = getMax + 99;
            setMin = i3 % 128;
            int i4 = i3 % 2;
            cArr2[i2 - 1] = (char) ((int) (((long) (cArr[i2] ^ (i2 * c))) ^ length));
            i2++;
        }
    }
}
