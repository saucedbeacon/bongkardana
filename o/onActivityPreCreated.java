package o;

public final class onActivityPreCreated {
    public static char[] length(long j, char[] cArr) {
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int i = 0;
        int i2 = 4;
        for (int i3 = 0; i3 < cArr.length; i3++) {
            if ((((j >>> i3) & 1) != 1 || i >= 4) && i2 < length) {
                cArr2[i2] = cArr[i3];
                i2++;
            } else {
                cArr2[i] = cArr[i3];
                i++;
            }
        }
        return cArr2;
    }
}
