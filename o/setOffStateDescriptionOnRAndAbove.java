package o;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import id.dana.sendmoney.summary.SummaryActivity;
import java.io.EOFException;
import java.io.IOException;

public final class setOffStateDescriptionOnRAndAbove extends JsonReader {
    private static final printConnMonitorLog IsOverlapping = printConnMonitorLog.encodeUtf8("\"\\");
    private static final printConnMonitorLog equals = printConnMonitorLog.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    private static final printConnMonitorLog toFloatRange = printConnMonitorLog.encodeUtf8("\n\r");
    private static final printConnMonitorLog toIntRange = printConnMonitorLog.encodeUtf8("'\\");
    private static final printConnMonitorLog values = printConnMonitorLog.encodeUtf8("*/");
    private long FastBitmap$CoordinateSystem;
    private final submitLazy hashCode;
    @Nullable
    private String invoke;
    private int toDoubleRange = 0;
    private final schedule toString;
    private int valueOf;

    public setOffStateDescriptionOnRAndAbove(schedule schedule) {
        if (schedule != null) {
            this.toString = schedule;
            this.hashCode = schedule.getMax();
            setMax(6);
            return;
        }
        throw new NullPointerException("source == null");
    }

    public final void length() throws IOException {
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i == 3) {
            setMax(1);
            this.setMin[this.setMax - 1] = 0;
            this.toDoubleRange = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_ARRAY but was ");
        sb.append(IsOverlapping());
        sb.append(" at path ");
        sb.append(Grayscale$Algorithm());
        throw new getThumbScrollRange(sb.toString());
    }

    public final void getMax() throws IOException {
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i == 4) {
            this.setMax--;
            int[] iArr = this.setMin;
            int i2 = this.setMax - 1;
            iArr[i2] = iArr[i2] + 1;
            this.toDoubleRange = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_ARRAY but was ");
        sb.append(IsOverlapping());
        sb.append(" at path ");
        sb.append(Grayscale$Algorithm());
        throw new getThumbScrollRange(sb.toString());
    }

    public final void setMin() throws IOException {
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i == 1) {
            setMax(3);
            this.toDoubleRange = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected BEGIN_OBJECT but was ");
        sb.append(IsOverlapping());
        sb.append(" at path ");
        sb.append(Grayscale$Algorithm());
        throw new getThumbScrollRange(sb.toString());
    }

    public final void setMax() throws IOException {
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i == 2) {
            this.setMax--;
            this.getMin[this.setMax] = null;
            int[] iArr = this.setMin;
            int i2 = this.setMax - 1;
            iArr[i2] = iArr[i2] + 1;
            this.toDoubleRange = 0;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected END_OBJECT but was ");
        sb.append(IsOverlapping());
        sb.append(" at path ");
        sb.append(Grayscale$Algorithm());
        throw new getThumbScrollRange(sb.toString());
    }

    public final boolean getMin() throws IOException {
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        return (i == 2 || i == 4 || i == 18) ? false : true;
    }

    public final JsonReader.Token IsOverlapping() throws IOException {
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        switch (i) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    private int Mean$Arithmetic() throws IOException {
        int i = this.getMax[this.setMax - 1];
        if (i == 1) {
            this.getMax[this.setMax - 1] = 2;
        } else if (i == 2) {
            int min = getMin(true);
            this.hashCode.IsOverlapping();
            if (min != 44) {
                if (min != 59) {
                    if (min == 93) {
                        this.toDoubleRange = 4;
                        return 4;
                    }
                    throw setMin("Unterminated array");
                } else if (!this.length) {
                    throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
                }
            }
        } else if (i == 3 || i == 5) {
            this.getMax[this.setMax - 1] = 4;
            if (i == 5) {
                int min2 = getMin(true);
                this.hashCode.IsOverlapping();
                if (min2 != 44) {
                    if (min2 != 59) {
                        if (min2 == 125) {
                            this.toDoubleRange = 2;
                            return 2;
                        }
                        throw setMin("Unterminated object");
                    } else if (!this.length) {
                        throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
                    }
                }
            }
            int min3 = getMin(true);
            if (min3 == 34) {
                this.hashCode.IsOverlapping();
                this.toDoubleRange = 13;
                return 13;
            } else if (min3 == 39) {
                this.hashCode.IsOverlapping();
                if (this.length) {
                    this.toDoubleRange = 12;
                    return 12;
                }
                throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
            } else if (min3 != 125) {
                if (!this.length) {
                    throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
                } else if (length((int) (char) min3)) {
                    this.toDoubleRange = 14;
                    return 14;
                } else {
                    throw setMin("Expected name");
                }
            } else if (i != 5) {
                this.hashCode.IsOverlapping();
                this.toDoubleRange = 2;
                return 2;
            } else {
                throw setMin("Expected name");
            }
        } else if (i == 4) {
            this.getMax[this.setMax - 1] = 5;
            int min4 = getMin(true);
            this.hashCode.IsOverlapping();
            if (min4 != 58) {
                if (min4 != 61) {
                    throw setMin("Expected ':'");
                } else if (!this.length) {
                    throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
                } else if (this.toString.getMin(1) && this.hashCode.getMax(0) == 62) {
                    this.hashCode.IsOverlapping();
                }
            }
        } else if (i == 6) {
            this.getMax[this.setMax - 1] = 7;
        } else if (i == 7) {
            if (getMin(false) == -1) {
                this.toDoubleRange = 18;
                return 18;
            } else if (!this.length) {
                throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
        } else if (i == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int min5 = getMin(true);
        if (min5 == 34) {
            this.hashCode.IsOverlapping();
            this.toDoubleRange = 9;
            return 9;
        } else if (min5 != 39) {
            if (!(min5 == 44 || min5 == 59)) {
                if (min5 == 91) {
                    this.hashCode.IsOverlapping();
                    this.toDoubleRange = 3;
                    return 3;
                } else if (min5 != 93) {
                    if (min5 != 123) {
                        int valueOf2 = valueOf();
                        if (valueOf2 != 0) {
                            return valueOf2;
                        }
                        int invoke2 = invoke();
                        if (invoke2 != 0) {
                            return invoke2;
                        }
                        if (!length((int) this.hashCode.getMax(0))) {
                            throw setMin("Expected value");
                        } else if (this.length) {
                            this.toDoubleRange = 10;
                            return 10;
                        } else {
                            throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
                        }
                    } else {
                        this.hashCode.IsOverlapping();
                        this.toDoubleRange = 1;
                        return 1;
                    }
                } else if (i == 1) {
                    this.hashCode.IsOverlapping();
                    this.toDoubleRange = 4;
                    return 4;
                }
            }
            if (i != 1 && i != 2) {
                throw setMin("Unexpected value");
            } else if (this.length) {
                this.toDoubleRange = 7;
                return 7;
            } else {
                throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
            }
        } else if (this.length) {
            this.hashCode.IsOverlapping();
            this.toDoubleRange = 8;
            return 8;
        } else {
            throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private int valueOf() throws IOException {
        String str;
        String str2;
        int i;
        byte max = this.hashCode.getMax(0);
        if (max == 116 || max == 84) {
            i = 5;
            str2 = SummaryActivity.CHECKED;
            str = "TRUE";
        } else if (max == 102 || max == 70) {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (max != 110 && max != 78) {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.toString.getMin((long) i3)) {
                return 0;
            }
            byte max2 = this.hashCode.getMax((long) i2);
            if (max2 != str2.charAt(i2) && max2 != str.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.toString.getMin((long) (length + 1)) && length((int) this.hashCode.getMax((long) length))) {
            return 0;
        }
        this.hashCode.isInside((long) length);
        this.toDoubleRange = i;
        return i;
    }

    private int invoke() throws IOException {
        byte max;
        long j = 0;
        long j2 = 0;
        int i = 0;
        char c = 0;
        boolean z = false;
        boolean z2 = true;
        while (true) {
            int i2 = i + 1;
            if (!this.toString.getMin((long) i2)) {
                break;
            }
            max = this.hashCode.getMax((long) i);
            if (max != 43) {
                if (max != 69 && max != 101) {
                    if (max != 45) {
                        if (max != 46) {
                            if (max >= 48 && max <= 57) {
                                if (c == 1 || c == 0) {
                                    j2 = (long) (-(max - 48));
                                    c = 2;
                                } else if (c == 2) {
                                    if (j2 == j) {
                                        return 0;
                                    }
                                    long j3 = (10 * j2) - ((long) (max - 48));
                                    z2 &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                    j2 = j3;
                                } else if (c == 3) {
                                    c = 4;
                                } else if (c == 5 || c == 6) {
                                    c = 7;
                                }
                            }
                        } else if (c != 2) {
                            return 0;
                        } else {
                            c = 3;
                        }
                    } else if (c == 0) {
                        c = 1;
                        z = true;
                    } else if (c != 5) {
                        return 0;
                    }
                    i = i2;
                    j = 0;
                } else if (c != 2 && c != 4) {
                    return 0;
                } else {
                    c = 5;
                    i = i2;
                    j = 0;
                }
            } else if (c != 5) {
                return 0;
            }
            c = 6;
            i = i2;
            j = 0;
        }
        if (length((int) max)) {
            return 0;
        }
        if (c == 2 && z2 && ((j2 != Long.MIN_VALUE || z) && (j2 != 0 || !z))) {
            if (!z) {
                j2 = -j2;
            }
            this.FastBitmap$CoordinateSystem = j2;
            this.hashCode.isInside((long) i);
            this.toDoubleRange = 16;
            return 16;
        } else if (c != 2 && c != 4 && c != 7) {
            return 0;
        } else {
            this.valueOf = i;
            this.toDoubleRange = 17;
            return 17;
        }
    }

    public final String toFloatRange() throws IOException {
        String str;
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i == 14) {
            str = invokeSuspend();
        } else if (i == 13) {
            str = length(IsOverlapping);
        } else if (i == 12) {
            str = length(toIntRange);
        } else if (i == 15) {
            str = this.invoke;
        } else {
            StringBuilder sb = new StringBuilder("Expected a name but was ");
            sb.append(IsOverlapping());
            sb.append(" at path ");
            sb.append(Grayscale$Algorithm());
            throw new getThumbScrollRange(sb.toString());
        }
        this.toDoubleRange = 0;
        this.getMin[this.setMax - 1] = str;
        return str;
    }

    public final int setMin(JsonReader.setMax setmax) throws IOException {
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i < 12 || i > 15) {
            return -1;
        }
        if (i == 15) {
            return getMin(this.invoke, setmax);
        }
        int max = this.toString.getMax(setmax.getMin);
        if (max != -1) {
            this.toDoubleRange = 0;
            this.getMin[this.setMax - 1] = setmax.getMax[max];
            return max;
        }
        String str = this.getMin[this.setMax - 1];
        String floatRange = toFloatRange();
        int min = getMin(floatRange, setmax);
        if (min == -1) {
            this.toDoubleRange = 15;
            this.invoke = floatRange;
            this.getMin[this.setMax - 1] = str;
        }
        return min;
    }

    public final void isInside() throws IOException {
        if (!this.isInside) {
            int i = this.toDoubleRange;
            if (i == 0) {
                i = Mean$Arithmetic();
            }
            if (i == 14) {
                getCause();
            } else if (i == 13) {
                setMin(IsOverlapping);
            } else if (i == 12) {
                setMin(toIntRange);
            } else if (i != 15) {
                StringBuilder sb = new StringBuilder("Expected a name but was ");
                sb.append(IsOverlapping());
                sb.append(" at path ");
                sb.append(Grayscale$Algorithm());
                throw new getThumbScrollRange(sb.toString());
            }
            this.toDoubleRange = 0;
            this.getMin[this.setMax - 1] = "null";
            return;
        }
        StringBuilder sb2 = new StringBuilder("Cannot skip unexpected ");
        sb2.append(IsOverlapping());
        sb2.append(" at ");
        sb2.append(Grayscale$Algorithm());
        throw new getThumbScrollRange(sb2.toString());
    }

    private int getMin(String str, JsonReader.setMax setmax) {
        int length = setmax.getMax.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(setmax.getMax[i])) {
                this.toDoubleRange = 0;
                this.getMin[this.setMax - 1] = str;
                return i;
            }
        }
        return -1;
    }

    public final String toIntRange() throws IOException {
        String str;
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i == 10) {
            str = invokeSuspend();
        } else if (i == 9) {
            str = length(IsOverlapping);
        } else if (i == 8) {
            str = length(toIntRange);
        } else if (i == 11) {
            str = this.invoke;
            this.invoke = null;
        } else if (i == 16) {
            str = Long.toString(this.FastBitmap$CoordinateSystem);
        } else if (i == 17) {
            str = this.hashCode.setMin((long) this.valueOf, MonitorModel.getMax);
        } else {
            StringBuilder sb = new StringBuilder("Expected a string but was ");
            sb.append(IsOverlapping());
            sb.append(" at path ");
            sb.append(Grayscale$Algorithm());
            throw new getThumbScrollRange(sb.toString());
        }
        this.toDoubleRange = 0;
        int[] iArr = this.setMin;
        int i2 = this.setMax - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public final boolean equals() throws IOException {
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i == 5) {
            this.toDoubleRange = 0;
            int[] iArr = this.setMin;
            int i2 = this.setMax - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.toDoubleRange = 0;
            int[] iArr2 = this.setMin;
            int i3 = this.setMax - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Expected a boolean but was ");
            sb.append(IsOverlapping());
            sb.append(" at path ");
            sb.append(Grayscale$Algorithm());
            throw new getThumbScrollRange(sb.toString());
        }
    }

    public final double toDoubleRange() throws IOException {
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i == 16) {
            this.toDoubleRange = 0;
            int[] iArr = this.setMin;
            int i2 = this.setMax - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.FastBitmap$CoordinateSystem;
        }
        if (i == 17) {
            this.invoke = this.hashCode.setMin((long) this.valueOf, MonitorModel.getMax);
        } else if (i == 9) {
            this.invoke = length(IsOverlapping);
        } else if (i == 8) {
            this.invoke = length(toIntRange);
        } else if (i == 10) {
            this.invoke = invokeSuspend();
        } else if (i != 11) {
            StringBuilder sb = new StringBuilder("Expected a double but was ");
            sb.append(IsOverlapping());
            sb.append(" at path ");
            sb.append(Grayscale$Algorithm());
            throw new getThumbScrollRange(sb.toString());
        }
        this.toDoubleRange = 11;
        try {
            double parseDouble = Double.parseDouble(this.invoke);
            if (this.length || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
                this.invoke = null;
                this.toDoubleRange = 0;
                int[] iArr2 = this.setMin;
                int i3 = this.setMax - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseDouble;
            }
            StringBuilder sb2 = new StringBuilder("JSON forbids NaN and infinities: ");
            sb2.append(parseDouble);
            sb2.append(" at path ");
            sb2.append(Grayscale$Algorithm());
            throw new drawableHotspotChanged(sb2.toString());
        } catch (NumberFormatException unused) {
            StringBuilder sb3 = new StringBuilder("Expected a double but was ");
            sb3.append(this.invoke);
            sb3.append(" at path ");
            sb3.append(Grayscale$Algorithm());
            throw new getThumbScrollRange(sb3.toString());
        }
    }

    private String length(printConnMonitorLog printconnmonitorlog) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long max = this.toString.getMax(printconnmonitorlog);
            if (max == -1) {
                throw setMin("Unterminated string");
            } else if (this.hashCode.getMax(max) == 92) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.hashCode.setMin(max, MonitorModel.getMax));
                this.hashCode.IsOverlapping();
                sb.append(b());
            } else if (sb == null) {
                String min = this.hashCode.setMin(max, MonitorModel.getMax);
                this.hashCode.IsOverlapping();
                return min;
            } else {
                sb.append(this.hashCode.setMin(max, MonitorModel.getMax));
                this.hashCode.IsOverlapping();
                return sb.toString();
            }
        }
    }

    private String invokeSuspend() throws IOException {
        long max = this.toString.getMax(equals);
        return max != -1 ? this.hashCode.setMin(max, MonitorModel.getMax) : this.hashCode.invokeSuspend();
    }

    private void setMin(printConnMonitorLog printconnmonitorlog) throws IOException {
        while (true) {
            long max = this.toString.getMax(printconnmonitorlog);
            if (max == -1) {
                throw setMin("Unterminated string");
            } else if (this.hashCode.getMax(max) == 92) {
                this.hashCode.isInside(max + 1);
                b();
            } else {
                this.hashCode.isInside(max + 1);
                return;
            }
        }
    }

    private void getCause() throws IOException {
        long max = this.toString.getMax(equals);
        submitLazy submitlazy = this.hashCode;
        if (max == -1) {
            max = submitlazy.setMax;
        }
        submitlazy.isInside(max);
    }

    public final int values() throws IOException {
        String str;
        int i = this.toDoubleRange;
        if (i == 0) {
            i = Mean$Arithmetic();
        }
        if (i == 16) {
            long j = this.FastBitmap$CoordinateSystem;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.toDoubleRange = 0;
                int[] iArr = this.setMin;
                int i3 = this.setMax - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder("Expected an int but was ");
            sb.append(this.FastBitmap$CoordinateSystem);
            sb.append(" at path ");
            sb.append(Grayscale$Algorithm());
            throw new getThumbScrollRange(sb.toString());
        }
        if (i == 17) {
            this.invoke = this.hashCode.setMin((long) this.valueOf, MonitorModel.getMax);
        } else if (i == 9 || i == 8) {
            if (i == 9) {
                str = length(IsOverlapping);
            } else {
                str = length(toIntRange);
            }
            this.invoke = str;
            try {
                int parseInt = Integer.parseInt(str);
                this.toDoubleRange = 0;
                int[] iArr2 = this.setMin;
                int i4 = this.setMax - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else if (i != 11) {
            StringBuilder sb2 = new StringBuilder("Expected an int but was ");
            sb2.append(IsOverlapping());
            sb2.append(" at path ");
            sb2.append(Grayscale$Algorithm());
            throw new getThumbScrollRange(sb2.toString());
        }
        this.toDoubleRange = 11;
        try {
            double parseDouble = Double.parseDouble(this.invoke);
            int i5 = (int) parseDouble;
            if (((double) i5) == parseDouble) {
                this.invoke = null;
                this.toDoubleRange = 0;
                int[] iArr3 = this.setMin;
                int i6 = this.setMax - 1;
                iArr3[i6] = iArr3[i6] + 1;
                return i5;
            }
            StringBuilder sb3 = new StringBuilder("Expected an int but was ");
            sb3.append(this.invoke);
            sb3.append(" at path ");
            sb3.append(Grayscale$Algorithm());
            throw new getThumbScrollRange(sb3.toString());
        } catch (NumberFormatException unused2) {
            StringBuilder sb4 = new StringBuilder("Expected an int but was ");
            sb4.append(this.invoke);
            sb4.append(" at path ");
            sb4.append(Grayscale$Algorithm());
            throw new getThumbScrollRange(sb4.toString());
        }
    }

    public final void close() throws IOException {
        this.toDoubleRange = 0;
        this.getMax[0] = 8;
        this.setMax = 1;
        submitLazy submitlazy = this.hashCode;
        try {
            submitlazy.isInside(submitlazy.setMax);
            this.toString.close();
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void FastBitmap$CoordinateSystem() throws IOException {
        if (!this.isInside) {
            int i = 0;
            do {
                int i2 = this.toDoubleRange;
                if (i2 == 0) {
                    i2 = Mean$Arithmetic();
                }
                if (i2 == 3) {
                    setMax(1);
                } else if (i2 == 1) {
                    setMax(3);
                } else {
                    if (i2 == 4) {
                        i--;
                        if (i >= 0) {
                            this.setMax--;
                        } else {
                            StringBuilder sb = new StringBuilder("Expected a value but was ");
                            sb.append(IsOverlapping());
                            sb.append(" at path ");
                            sb.append(Grayscale$Algorithm());
                            throw new getThumbScrollRange(sb.toString());
                        }
                    } else if (i2 == 2) {
                        i--;
                        if (i >= 0) {
                            this.setMax--;
                        } else {
                            StringBuilder sb2 = new StringBuilder("Expected a value but was ");
                            sb2.append(IsOverlapping());
                            sb2.append(" at path ");
                            sb2.append(Grayscale$Algorithm());
                            throw new getThumbScrollRange(sb2.toString());
                        }
                    } else if (i2 == 14 || i2 == 10) {
                        getCause();
                    } else if (i2 == 9 || i2 == 13) {
                        setMin(IsOverlapping);
                    } else if (i2 == 8 || i2 == 12) {
                        setMin(toIntRange);
                    } else if (i2 == 17) {
                        this.hashCode.isInside((long) this.valueOf);
                    } else if (i2 == 18) {
                        StringBuilder sb3 = new StringBuilder("Expected a value but was ");
                        sb3.append(IsOverlapping());
                        sb3.append(" at path ");
                        sb3.append(Grayscale$Algorithm());
                        throw new getThumbScrollRange(sb3.toString());
                    }
                    this.toDoubleRange = 0;
                }
                i++;
                this.toDoubleRange = 0;
            } while (i != 0);
            int[] iArr = this.setMin;
            int i3 = this.setMax - 1;
            iArr[i3] = iArr[i3] + 1;
            this.getMin[this.setMax - 1] = "null";
            return;
        }
        StringBuilder sb4 = new StringBuilder("Cannot skip unexpected ");
        sb4.append(IsOverlapping());
        sb4.append(" at ");
        sb4.append(Grayscale$Algorithm());
        throw new getThumbScrollRange(sb4.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r7.hashCode.isInside((long) (r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r1 != 47) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r7.toString.getMin(2) != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r7.length == false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = r7.hashCode.getMax(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        if (r2 == 42) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r2 == 47) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        r7.hashCode.IsOverlapping();
        r7.hashCode.IsOverlapping();
        onNavigationEvent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        r7.hashCode.IsOverlapping();
        r7.hashCode.IsOverlapping();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (ICustomTabsCallback() == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        throw setMin("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r1 != 35) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        if (r7.length == false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        onNavigationEvent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int getMin(boolean r8) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            o.schedule r2 = r7.toString
            int r3 = r1 + 1
            long r4 = (long) r3
            boolean r2 = r2.getMin(r4)
            if (r2 == 0) goto L_0x0091
            o.submitLazy r2 = r7.hashCode
            long r4 = (long) r1
            byte r1 = r2.getMax((long) r4)
            r2 = 10
            if (r1 == r2) goto L_0x008e
            r2 = 32
            if (r1 == r2) goto L_0x008e
            r2 = 13
            if (r1 == r2) goto L_0x008e
            r2 = 9
            if (r1 == r2) goto L_0x008e
            o.submitLazy r2 = r7.hashCode
            int r3 = r3 + -1
            long r3 = (long) r3
            r2.isInside(r3)
            java.lang.String r2 = "Use JsonReader.setLenient(true) to accept malformed JSON"
            r3 = 47
            if (r1 != r3) goto L_0x007b
            o.schedule r4 = r7.toString
            r5 = 2
            boolean r4 = r4.getMin(r5)
            if (r4 != 0) goto L_0x003d
            return r1
        L_0x003d:
            boolean r4 = r7.length
            if (r4 == 0) goto L_0x0076
            o.submitLazy r2 = r7.hashCode
            r4 = 1
            byte r2 = r2.getMax((long) r4)
            r4 = 42
            if (r2 == r4) goto L_0x005e
            if (r2 == r3) goto L_0x0050
            return r1
        L_0x0050:
            o.submitLazy r1 = r7.hashCode
            r1.IsOverlapping()
            o.submitLazy r1 = r7.hashCode
            r1.IsOverlapping()
            r7.onNavigationEvent()
            goto L_0x0001
        L_0x005e:
            o.submitLazy r1 = r7.hashCode
            r1.IsOverlapping()
            o.submitLazy r1 = r7.hashCode
            r1.IsOverlapping()
            boolean r1 = r7.ICustomTabsCallback()
            if (r1 == 0) goto L_0x006f
            goto L_0x0001
        L_0x006f:
            java.lang.String r8 = "Unterminated comment"
            o.drawableHotspotChanged r8 = r7.setMin((java.lang.String) r8)
            throw r8
        L_0x0076:
            o.drawableHotspotChanged r8 = r7.setMin((java.lang.String) r2)
            throw r8
        L_0x007b:
            r3 = 35
            if (r1 != r3) goto L_0x008d
            boolean r1 = r7.length
            if (r1 == 0) goto L_0x0088
            r7.onNavigationEvent()
            goto L_0x0001
        L_0x0088:
            o.drawableHotspotChanged r8 = r7.setMin((java.lang.String) r2)
            throw r8
        L_0x008d:
            return r1
        L_0x008e:
            r1 = r3
            goto L_0x0002
        L_0x0091:
            if (r8 != 0) goto L_0x0095
            r8 = -1
            return r8
        L_0x0095:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r8.<init>(r0)
            goto L_0x009e
        L_0x009d:
            throw r8
        L_0x009e:
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setOffStateDescriptionOnRAndAbove.getMin(boolean):int");
    }

    private void onNavigationEvent() throws IOException {
        long max = this.toString.getMax(toFloatRange);
        submitLazy submitlazy = this.hashCode;
        submitlazy.isInside(max != -1 ? max + 1 : submitlazy.setMax);
    }

    private boolean ICustomTabsCallback() throws IOException {
        long min = this.toString.setMin(values);
        boolean z = min != -1;
        submitLazy submitlazy = this.hashCode;
        submitlazy.isInside(z ? min + ((long) values.size()) : submitlazy.setMax);
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonReader(");
        sb.append(this.toString);
        sb.append(")");
        return sb.toString();
    }

    private char b() throws IOException {
        int i;
        int i2;
        if (this.toString.getMin(1)) {
            byte IsOverlapping2 = this.hashCode.IsOverlapping();
            if (IsOverlapping2 == 10 || IsOverlapping2 == 34 || IsOverlapping2 == 39 || IsOverlapping2 == 47 || IsOverlapping2 == 92) {
                return (char) IsOverlapping2;
            }
            if (IsOverlapping2 == 98) {
                return 8;
            }
            if (IsOverlapping2 == 102) {
                return 12;
            }
            if (IsOverlapping2 == 110) {
                return 10;
            }
            if (IsOverlapping2 == 114) {
                return 13;
            }
            if (IsOverlapping2 == 116) {
                return 9;
            }
            if (IsOverlapping2 != 117) {
                if (this.length) {
                    return (char) IsOverlapping2;
                }
                StringBuilder sb = new StringBuilder("Invalid escape sequence: \\");
                sb.append((char) IsOverlapping2);
                throw setMin(sb.toString());
            } else if (this.toString.getMin(4)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte max = this.hashCode.getMax((long) i3);
                    char c2 = (char) (c << 4);
                    if (max < 48 || max > 57) {
                        if (max >= 97 && max <= 102) {
                            i = max - 97;
                        } else if (max < 65 || max > 70) {
                            StringBuilder sb2 = new StringBuilder("\\u");
                            sb2.append(this.hashCode.setMin(4, MonitorModel.getMax));
                            throw setMin(sb2.toString());
                        } else {
                            i = max - 65;
                        }
                        i2 = i + 10;
                    } else {
                        i2 = max - 48;
                    }
                    c = (char) (c2 + i2);
                }
                this.hashCode.isInside(4);
                return c;
            } else {
                StringBuilder sb3 = new StringBuilder("Unterminated escape sequence at path ");
                sb3.append(Grayscale$Algorithm());
                throw new EOFException(sb3.toString());
            }
        } else {
            throw setMin("Unterminated escape sequence");
        }
    }

    private boolean length(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (!(i == 47 || i == 61)) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        if (this.length) {
            return false;
        }
        throw setMin("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
}
