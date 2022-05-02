package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import o.constrain;
import o.drawableHotspotChanged;
import o.executeSerial;
import o.getThumbScrollRange;
import o.printConnMonitorLog;
import o.recordMonitorOfRecvMsg;
import o.schedule;
import o.setOffStateDescriptionOnRAndAbove;
import o.submitLazy;

public abstract class JsonReader implements Closeable {
    private static final String[] toFloatRange = new String[128];
    protected int[] getMax = new int[32];
    protected String[] getMin = new String[32];
    protected boolean isInside;
    protected boolean length;
    protected int setMax;
    protected int[] setMin = new int[32];

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    public abstract void FastBitmap$CoordinateSystem() throws IOException;

    public abstract Token IsOverlapping() throws IOException;

    public abstract boolean equals() throws IOException;

    public abstract void getMax() throws IOException;

    public abstract boolean getMin() throws IOException;

    public abstract void isInside() throws IOException;

    public abstract void length() throws IOException;

    public abstract void setMax() throws IOException;

    public abstract int setMin(setMax setmax) throws IOException;

    public abstract void setMin() throws IOException;

    public abstract double toDoubleRange() throws IOException;

    public abstract String toFloatRange() throws IOException;

    public abstract String toIntRange() throws IOException;

    public abstract int values() throws IOException;

    static {
        for (int i = 0; i <= 31; i++) {
            toFloatRange[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = toFloatRange;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static JsonReader setMin(schedule schedule) {
        return new setOffStateDescriptionOnRAndAbove(schedule);
    }

    /* access modifiers changed from: protected */
    public final void setMax(int i) {
        int i2 = this.setMax;
        int[] iArr = this.getMax;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.getMax = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.getMin;
                this.getMin = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.setMin;
                this.setMin = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                StringBuilder sb = new StringBuilder("Nesting too deep at ");
                sb.append(Grayscale$Algorithm());
                throw new getThumbScrollRange(sb.toString());
            }
        }
        int[] iArr3 = this.getMax;
        int i3 = this.setMax;
        this.setMax = i3 + 1;
        iArr3[i3] = i;
    }

    /* access modifiers changed from: protected */
    public final drawableHotspotChanged setMin(String str) throws drawableHotspotChanged {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(Grayscale$Algorithm());
        throw new drawableHotspotChanged(sb.toString());
    }

    public final String Grayscale$Algorithm() {
        return constrain.setMin(this.setMax, this.getMax, this.getMin, this.setMin);
    }

    public static final class setMax {
        public final String[] getMax;
        public final recordMonitorOfRecvMsg getMin;

        private setMax(String[] strArr, recordMonitorOfRecvMsg recordmonitorofrecvmsg) {
            this.getMax = strArr;
            this.getMin = recordmonitorofrecvmsg;
        }

        public static setMax getMin(String... strArr) {
            try {
                printConnMonitorLog[] printconnmonitorlogArr = new printConnMonitorLog[strArr.length];
                submitLazy submitlazy = new submitLazy();
                for (int i = 0; i < strArr.length; i++) {
                    JsonReader.getMin(submitlazy, strArr[i]);
                    submitlazy.IsOverlapping();
                    printconnmonitorlogArr[i] = new printConnMonitorLog(submitlazy.valueOf());
                }
                return new setMax((String[]) strArr.clone(), recordMonitorOfRecvMsg.length(printconnmonitorlogArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    static /* synthetic */ void getMin(executeSerial executeserial, String str) throws IOException {
        String str2;
        String[] strArr = toFloatRange;
        executeserial.equals(34);
        int length2 = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                executeserial.setMin(str, i, i2);
            }
            executeserial.setMin(str2);
            i = i2 + 1;
        }
        if (i < length2) {
            executeserial.setMin(str, i, length2);
        }
        executeserial.equals(34);
    }
}
