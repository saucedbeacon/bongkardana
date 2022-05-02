package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin._Assertions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class UtfEncodingKt {
    @NotNull
    public static final byte[] stringsToBytes(@NotNull String[] strArr) {
        int i;
        Intrinsics.checkNotNullParameter(strArr, "strings");
        boolean z = false;
        int i2 = 0;
        for (String length : strArr) {
            i2 += length.length();
        }
        byte[] bArr = new byte[i2];
        int length2 = strArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length2) {
            String str = strArr[i3];
            i3++;
            int length3 = str.length() - 1;
            if (length3 >= 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    i = i4 + 1;
                    bArr[i4] = (byte) str.charAt(i5);
                    if (i5 == length3) {
                        break;
                    }
                    i5 = i6;
                    i4 = i;
                }
                i4 = i;
            }
        }
        if (i4 == i2) {
            z = true;
        }
        if (!_Assertions.ENABLED || z) {
            return bArr;
        }
        throw new AssertionError("Should have reached the end");
    }
}
