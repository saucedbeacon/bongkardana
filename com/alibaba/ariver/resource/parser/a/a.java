package com.alibaba.ariver.resource.parser.a;

public class a {
    public static long a(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        boolean z = true;
        long j = 0;
        while (i < i3 && bArr[i] != 0) {
            if (bArr[i] == 32 || bArr[i] == 48) {
                if (!z) {
                    if (bArr[i] == 32) {
                        break;
                    }
                } else {
                    continue;
                    i++;
                }
            }
            z = false;
            j = (j << 3) + ((long) (bArr[i] - 48));
            i++;
        }
        return j;
    }
}
