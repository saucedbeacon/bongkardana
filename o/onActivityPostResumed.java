package o;

public final class onActivityPostResumed {
    public static int[] getMin(char[] cArr, int[] iArr, boolean z) {
        int i = (cArr[0] << 16) + cArr[1];
        int i2 = (cArr[2] << 16) + cArr[3];
        if (!z) {
            setMax(iArr);
        }
        int i3 = 0;
        while (i3 < 16) {
            int i4 = i ^ iArr[i3];
            i3++;
            int min = i2 ^ getMin(i4);
            i2 = i4;
            i = min;
        }
        int i5 = i ^ iArr[16];
        int i6 = iArr[17] ^ i2;
        int[] iArr2 = {i6, i5};
        cArr[0] = (char) (i6 >>> 16);
        cArr[1] = (char) i6;
        cArr[2] = (char) (i5 >>> 16);
        cArr[3] = (char) i5;
        if (!z) {
            setMax(iArr);
        }
        return iArr2;
    }

    public static void setMax(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }

    public static int getMin(int i) {
        LiveData$LifecycleBoundObserver liveData$LifecycleBoundObserver = LiveData$LifecycleBoundObserver.setMax;
        return ((liveData$LifecycleBoundObserver.length[0][i >>> 24] + liveData$LifecycleBoundObserver.length[1][(i >>> 16) & 255]) ^ liveData$LifecycleBoundObserver.length[2][(i >>> 8) & 255]) + liveData$LifecycleBoundObserver.length[3][i & 255];
    }
}
