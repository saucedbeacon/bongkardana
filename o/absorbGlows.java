package o;

import androidx.annotation.NonNull;

@Deprecated
public final class absorbGlows {
    public static byte[] setMax(@NonNull byte[] bArr, @NonNull shouldDeferAccessibilityEvent shoulddeferaccessibilityevent, int i) {
        byte[] bArr2 = bArr;
        shouldDeferAccessibilityEvent shoulddeferaccessibilityevent2 = shoulddeferaccessibilityevent;
        int i2 = i;
        if (i2 == 0) {
            return bArr2;
        }
        if (i2 % 90 != 0 || i2 < 0 || i2 > 270) {
            throw new IllegalArgumentException("0 <= rotation < 360, rotation % 90 == 0");
        }
        int i3 = shoulddeferaccessibilityevent2.getMax;
        int i4 = shoulddeferaccessibilityevent2.getMin;
        byte[] bArr3 = new byte[bArr2.length];
        int i5 = i3 * i4;
        boolean z = i2 % 180 != 0;
        boolean z2 = i2 % 270 != 0;
        boolean z3 = i2 >= 180;
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                int i8 = (i6 * i3) + i7;
                int i9 = ((i6 >> 1) * i3) + i5 + (i7 & -2);
                int i10 = i9 + 1;
                int i11 = z ? i4 : i3;
                int i12 = z ? i3 : i4;
                int i13 = z ? i6 : i7;
                int i14 = z ? i7 : i6;
                if (z2) {
                    i13 = (i11 - i13) - 1;
                }
                if (z3) {
                    i14 = (i12 - i14) - 1;
                }
                int i15 = i5 + ((i14 >> 1) * i11) + (i13 & -2);
                bArr3[(i14 * i11) + i13] = (byte) (bArr2[i8] & 255);
                bArr3[i15] = (byte) (bArr2[i9] & 255);
                bArr3[i15 + 1] = (byte) (bArr2[i10] & 255);
            }
        }
        return bArr3;
    }
}
