package o;

import androidx.annotation.RestrictTo;
import java.io.PrintWriter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class setOnDismissListener {
    private static final Object getMin = new Object();
    private static char[] length = new char[24];

    private static int getMax(char[] cArr, int i, char c, int i2, boolean z) {
        int i3;
        if (!z && i <= 0) {
            return i2;
        }
        if (i > 99) {
            int i4 = i / 100;
            cArr[i2] = (char) (i4 + 48);
            i3 = i2 + 1;
            i -= i4 * 100;
        } else {
            i3 = i2;
        }
        if (i > 9 || i2 != i3) {
            int i5 = i / 10;
            cArr[i3] = (char) (i5 + 48);
            i3++;
            i -= i5 * 10;
        }
        cArr[i3] = (char) (i + 48);
        int i6 = i3 + 1;
        cArr[i6] = c;
        return i6 + 1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    private static void length(long j, PrintWriter printWriter) {
        char c;
        int i;
        int i2;
        int i3;
        synchronized (getMin) {
            if (length.length < 0) {
                length = new char[0];
            }
            char[] cArr = length;
            int i4 = 1;
            if (j == 0) {
                cArr[0] = '0';
            } else {
                if (j > 0) {
                    c = '+';
                } else {
                    c = '-';
                    j = -j;
                }
                int i5 = (int) (j % 1000);
                int floor = (int) Math.floor((double) (j / 1000));
                if (floor > 86400) {
                    i = floor / 86400;
                    floor -= 86400 * i;
                } else {
                    i = 0;
                }
                if (floor > 3600) {
                    i2 = floor / 3600;
                    floor -= i2 * 3600;
                } else {
                    i2 = 0;
                }
                if (floor > 60) {
                    i3 = floor / 60;
                    floor -= i3 * 60;
                } else {
                    i3 = 0;
                }
                cArr[0] = c;
                int max = getMax(cArr, i, 'd', 1, false);
                int max2 = getMax(cArr, i2, 'h', max, max != 1);
                int max3 = getMax(cArr, i3, 'm', max2, max2 != 1);
                int max4 = getMax(cArr, i5, 'm', getMax(cArr, floor, 's', max3, max3 != 1), true);
                cArr[max4] = 's';
                i4 = 1 + max4;
            }
            printWriter.print(new String(length, 0, i4));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void setMax(long j, PrintWriter printWriter) {
        length(j, printWriter);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static void getMin(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print("--");
        } else {
            length(j - j2, printWriter);
        }
    }
}
