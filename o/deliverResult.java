package o;

import com.google.common.base.Ascii;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

final class deliverResult extends Thread {
    private static int equals = 1;
    public static final int getMax = 154;
    private static byte[] getMin = {Ascii.CAN, 76, 65, -1};
    private static int setMax;
    private final BufferedReader length;
    private final StringBuilder setMin = new StringBuilder();

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMax(byte r7, int r8, int r9) {
        /*
            int r0 = setMax
            int r0 = r0 + 77
            int r1 = r0 % 128
            equals = r1
            int r0 = r0 % 2
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r9 = r9 * 4
            int r9 = 10 - r9
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r0 = getMin
            byte[] r1 = new byte[r7]
            r2 = 50
            if (r0 == 0) goto L_0x0021
            r3 = 50
            goto L_0x0023
        L_0x0021:
            r3 = 53
        L_0x0023:
            r4 = 0
            if (r3 == r2) goto L_0x003f
            int r2 = setMax
            int r2 = r2 + 23
            int r3 = r2 % 128
            equals = r3
            int r2 = r2 % 2
            int r2 = setMax
            int r2 = r2 + 23
            int r3 = r2 % 128
            equals = r3
            int r2 = r2 % 2
            r2 = r9
            r3 = 0
            r9 = r8
            r8 = r7
            goto L_0x0055
        L_0x003f:
            r2 = 0
        L_0x0040:
            int r8 = r8 + 1
            int r3 = r2 + 1
            byte r5 = (byte) r9
            r1[r2] = r5
            if (r3 != r7) goto L_0x004f
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r4)
            return r7
        L_0x004f:
            byte r2 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L_0x0055:
            int r7 = r7 - r2
            r2 = r3
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: o.deliverResult.setMax(byte, int, int):java.lang.String");
    }

    public deliverResult(InputStream inputStream) {
        this.length = new BufferedReader(new InputStreamReader(inputStream));
    }

    public final String getMin() {
        int i = equals;
        int i2 = (i ^ 107) + ((i & 107) << 1);
        setMax = i2 % 128;
        if (i2 % 2 == 0) {
        }
        String obj = this.setMin.toString();
        int i3 = (equals + 4) - 1;
        setMax = i3 % 128;
        int i4 = i3 % 2;
        return obj;
    }

    public final void run() {
        while (true) {
            try {
                String readLine = this.length.readLine();
                if (readLine == null) {
                    break;
                }
                StringBuilder sb = this.setMin;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(readLine);
                byte b = (byte) ((getMin[3] + 2) - 1);
                byte b2 = (byte) b;
                sb2.append(setMax(b, b2, (byte) b2));
                sb.append(sb2.toString());
                int i = equals;
                int i2 = ((i | 31) << 1) - (i ^ 31);
                setMax = i2 % 128;
                int i3 = i2 % 2;
            } catch (IOException unused) {
                return;
            }
        }
        this.length.close();
        int i4 = (setMax + 34) - 1;
        equals = i4 % 128;
        if ((i4 % 2 != 0 ? 20 : 'b') != 20) {
            Object obj = null;
            super.hashCode();
        }
    }
}
