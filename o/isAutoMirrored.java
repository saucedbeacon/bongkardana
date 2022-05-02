package o;

import java.io.Writer;

public final class isAutoMirrored extends Writer {
    private StringBuilder setMax = new StringBuilder(128);
    private final String setMin;

    public isAutoMirrored(String str) {
        this.setMin = str;
    }

    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c != 10) {
                this.setMax.append(c);
            } else if (this.setMax.length() > 0) {
                StringBuilder sb = this.setMax;
                sb.delete(0, sb.length());
            }
        }
    }

    public final void close() {
        if (this.setMax.length() > 0) {
            StringBuilder sb = this.setMax;
            sb.delete(0, sb.length());
        }
    }

    public final void flush() {
        if (this.setMax.length() > 0) {
            StringBuilder sb = this.setMax;
            sb.delete(0, sb.length());
        }
    }
}
