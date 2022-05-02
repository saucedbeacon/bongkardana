package o;

final class fillInStackTrace {
    fillInStackTrace IsOverlapping;
    fillInStackTrace equals;
    boolean getMax;
    int getMin;
    boolean length;
    final byte[] setMax;
    int setMin;

    fillInStackTrace() {
        this.setMax = new byte[8192];
        this.getMax = true;
        this.length = false;
    }

    fillInStackTrace(fillInStackTrace fillinstacktrace) {
        this(fillinstacktrace.setMax, fillinstacktrace.getMin, fillinstacktrace.setMin);
        fillinstacktrace.length = true;
    }

    fillInStackTrace(byte[] bArr, int i, int i2) {
        this.setMax = bArr;
        this.getMin = i;
        this.setMin = i2;
        this.getMax = false;
        this.length = true;
    }

    public final fillInStackTrace setMin() {
        fillInStackTrace fillinstacktrace = this.equals;
        if (fillinstacktrace == this) {
            fillinstacktrace = null;
        }
        fillInStackTrace fillinstacktrace2 = this.IsOverlapping;
        fillinstacktrace2.equals = this.equals;
        this.equals.IsOverlapping = fillinstacktrace2;
        this.equals = null;
        this.IsOverlapping = null;
        return fillinstacktrace;
    }

    public final void setMax(fillInStackTrace fillinstacktrace, int i) {
        if (fillinstacktrace.getMax) {
            int i2 = fillinstacktrace.setMin;
            if (i2 + i > 8192) {
                if (!fillinstacktrace.length) {
                    int i3 = fillinstacktrace.getMin;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = fillinstacktrace.setMax;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        fillinstacktrace.setMin -= fillinstacktrace.getMin;
                        fillinstacktrace.getMin = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.setMax, this.getMin, fillinstacktrace.setMax, fillinstacktrace.setMin, i);
            fillinstacktrace.setMin += i;
            this.getMin += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
