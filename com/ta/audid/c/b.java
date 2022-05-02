package com.ta.audid.c;

import com.ta.utdid2.a.a.c;
import com.ta.utdid2.a.a.e;
import java.util.Arrays;

public class b {
    public static c a(String str) {
        c cVar = new c();
        if (str == null || str.length() != 24) {
            cVar.b(false);
        } else {
            try {
                byte[] decode = com.ta.utdid2.a.a.b.decode(str, 2);
                if (decode.length == 18) {
                    byte[] bArr = new byte[14];
                    byte[] bArr2 = new byte[4];
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(decode, 0, bArr, 0, 14);
                    System.arraycopy(decode, 0, bArr2, 0, 4);
                    byte b = decode[8];
                    System.arraycopy(decode, 14, bArr3, 0, 4);
                    try {
                        if (Arrays.equals(bArr3, c.getBytes(e.hashCode(com.ta.utdid2.device.c.b(bArr))))) {
                            cVar.b(true);
                            cVar.setTimestamp(com.ta.audid.g.b.a(bArr2));
                            cVar.setVersion(b);
                            return cVar;
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                cVar.b(false);
                return cVar;
            }
        }
        return cVar;
    }
}
