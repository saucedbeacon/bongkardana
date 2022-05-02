package o;

import kotlin.text.Typography;

public final class StatisticInterface {
    char[] setMax = new char[128];
    int setMin;

    /* access modifiers changed from: package-private */
    public final void length(String str) {
        int length = str.length();
        int i = this.setMin + (length >= 32768 ? 2 : 1) + length;
        if (i > this.setMax.length) {
            getMax(i);
        }
        if (length >= 32768) {
            char[] cArr = this.setMax;
            int i2 = this.setMin;
            cArr[i2] = (char) (32768 | (length >>> 16));
            this.setMin = i2 + 1;
        }
        char[] cArr2 = this.setMax;
        int i3 = this.setMin;
        cArr2[i3] = (char) length;
        int i4 = i3 + 1;
        this.setMin = i4;
        str.getChars(0, length, cArr2, i4);
        this.setMin = i;
    }

    /* access modifiers changed from: package-private */
    public final void setMax(char c) {
        int i = this.setMin;
        if (i == this.setMax.length) {
            getMax(i + 1);
        }
        char[] cArr = this.setMax;
        int i2 = this.setMin;
        cArr[i2] = c;
        this.setMin = i2 + 1;
    }

    private void getMax(int i) {
        if (i <= this.setMax.length) {
            getStyleId.setMin();
        }
        int length = this.setMax.length * 2;
        if (length >= i) {
            i = length;
        }
        char[] cArr = new char[i];
        System.arraycopy(this.setMax, 0, cArr, 0, this.setMin);
        this.setMax = cArr;
    }

    static int setMax(String str, int i, boolean z, StringBuilder sb) {
        char charAt = str.charAt(i);
        int i2 = i + 1;
        if ((32768 & charAt) != 0) {
            charAt = ((charAt & 32767) << 16) | str.charAt(i2);
            i2++;
        }
        if (sb != null) {
            String substring = str.substring(i2, i2 + charAt);
            if (!z) {
                sb.append(substring);
            } else {
                sb.append(Typography.quote);
                sb.append(LogItem.setMax(substring));
                sb.append(Typography.quote);
            }
        }
        return i2 + charAt;
    }

    /* access modifiers changed from: package-private */
    public final void length(String str, String str2) {
        setMax('0');
        StringBuilder sb = new StringBuilder("/");
        sb.append(str);
        sb.append('/');
        sb.append(str2);
        length(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final void getMax(double d) {
        setMax('(');
        long j = (long) d;
        if (((double) j) != d) {
            long doubleToLongBits = Double.doubleToLongBits(d);
            setMax('D');
            setMax((char) ((int) (doubleToLongBits >> 48)));
            setMax((char) ((int) (doubleToLongBits >> 32)));
            setMax((char) ((int) (doubleToLongBits >> 16)));
            setMax((char) ((int) doubleToLongBits));
            return;
        }
        if (j < 0) {
            getStyleId.setMin();
        }
        if (j <= 65535) {
            setMax('S');
            setMax((char) ((int) j));
            return;
        }
        setMax('J');
        setMax((char) ((int) (j >> 48)));
        setMax((char) ((int) (j >> 32)));
        setMax((char) ((int) (j >> 16)));
        setMax((char) ((int) j));
    }
}
