package o;

import android.content.Context;

public final class dispatchOnCancelled {
    private static final long[] getMax = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    private static final boolean[] getMin = {false, false, false, false, false, false, false, false, false, false, false};
    private static final int[] length = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    static long setMin = 2000;

    private static boolean getMin(int i) {
        return i == 1 || i == 3 || i == 4 || i == 7 || i == 10;
    }

    public static int length(Context context, int i) {
        if (!setMin(1)) {
            return length[1] ^ i;
        }
        int length2 = onLoadInBackground.length(context, i);
        getMax[1] = System.currentTimeMillis();
        length[1] = i ^ length2;
        return length2;
    }

    public static int getMax(int i) {
        if (!setMin(2)) {
            return i ^ length[2];
        }
        int max = onLoadInBackground.setMax(i);
        getMax[2] = System.currentTimeMillis();
        length[2] = i ^ max;
        return max;
    }

    public static int getMax(Context context, int i) {
        if (!setMin(3)) {
            return length[3] ^ i;
        }
        int max = onLoadInBackground.setMax(context, i);
        getMax[3] = System.currentTimeMillis();
        length[3] = i ^ max;
        return max;
    }

    public static int setMin(Context context, int i) {
        if (!setMin(4)) {
            return length[4] ^ i;
        }
        int max = dispatchOnLoadComplete.getMax(context, i);
        getMax[4] = System.currentTimeMillis();
        length[4] = i ^ max;
        return max;
    }

    public static int setMax(int i) {
        if (!setMin(6)) {
            return i ^ length[6];
        }
        int min = cancelLoadInBackground.getMin(i);
        getMax[6] = System.currentTimeMillis();
        length[6] = i ^ min;
        return min;
    }

    public static int length(int i) {
        if (!setMin(6)) {
            return i ^ length[6];
        }
        int length2 = cancelLoadInBackground.length(i);
        getMax[6] = System.currentTimeMillis();
        length[6] = i ^ length2;
        return length2;
    }

    public static int setMax(Context context, int i, int i2) {
        if (!setMin(7)) {
            return length[7] ^ i;
        }
        int max = isLoadInBackgroundCanceled.setMax(context, i, 0);
        getMax[7] = System.currentTimeMillis();
        length[7] = i ^ max;
        return max;
    }

    public static int getMin(Context context, int i) {
        if (!setMin(10)) {
            return length[10] ^ i;
        }
        int length2 = deliverCancellation.length(context, i);
        getMax[10] = System.currentTimeMillis();
        length[10] = i ^ length2;
        return length2;
    }

    private static boolean setMin(int i) {
        long[] jArr = getMax;
        if (jArr[i] != -1) {
            return jArr[i] + setMin < System.currentTimeMillis() && !getMin(i);
        }
        return true;
    }
}
