package o;

import id.dana.home.view.QrRefreshNotification;
import java.io.IOException;

public final class ShareTarget$RequestMethod {
    static final String[] getMin = new String[64];
    private static final String[] length = {QrRefreshNotification.DATA, "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    static final evictAll setMax = evictAll.a("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    static final String[] setMin = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = setMin;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = CustomTabsIntent$ShareState.getMin("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = getMin;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i3 = 0; i3 <= 0; i3++) {
            int i4 = iArr[i3];
            StringBuilder sb = new StringBuilder();
            sb.append(getMin[i4]);
            sb.append("|PADDED");
            getMin[i4 | 8] = sb.toString();
        }
        String[] strArr3 = getMin;
        strArr3[4] = "END_HEADERS";
        strArr3[32] = "PRIORITY";
        strArr3[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr2[i5];
            for (int i7 = 0; i7 <= 0; i7++) {
                int i8 = iArr[i7];
                String[] strArr4 = getMin;
                int i9 = i8 | i6;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(getMin[i8]);
                sb2.append('|');
                sb2.append(getMin[i6]);
                strArr4[i9] = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(getMin[i8]);
                sb3.append('|');
                sb3.append(getMin[i6]);
                sb3.append("|PADDED");
                getMin[i9 | 8] = sb3.toString();
            }
        }
        while (true) {
            String[] strArr5 = getMin;
            if (i < strArr5.length) {
                if (strArr5[i] == null) {
                    strArr5[i] = setMin[i];
                }
                i++;
            } else {
                return;
            }
        }
    }

    private ShareTarget$RequestMethod() {
    }

    static IllegalArgumentException length(String str, Object... objArr) {
        throw new IllegalArgumentException(CustomTabsIntent$ShareState.getMin(str, objArr));
    }

    static IOException getMin(String str, Object... objArr) {
        throw new IOException(CustomTabsIntent$ShareState.getMin(str, objArr));
    }

    static String length(boolean z, int i, int i2, byte b, byte b2) {
        String str;
        String[] strArr = length;
        String min = b < strArr.length ? strArr[b] : CustomTabsIntent$ShareState.getMin("0x%02x", Byte.valueOf(b));
        if (b2 == 0) {
            str = "";
        } else {
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    str = b2 == 1 ? "ACK" : setMin[b2];
                } else if (!(b == 7 || b == 8)) {
                    String[] strArr2 = getMin;
                    String str2 = b2 < strArr2.length ? strArr2[b2] : setMin[b2];
                    str = (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = setMin[b2];
        }
        Object[] objArr = new Object[5];
        objArr[0] = z ? "<<" : ">>";
        objArr[1] = Integer.valueOf(i);
        objArr[2] = Integer.valueOf(i2);
        objArr[3] = min;
        objArr[4] = str;
        return CustomTabsIntent$ShareState.getMin("%s 0x%08x %5d %-13s %s", objArr);
    }
}
