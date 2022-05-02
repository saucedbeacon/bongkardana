package o;

import com.alipay.zoloz.toyger.blob.BlobStatic;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.j256.ormlite.stmt.query.SimpleComparison;
import id.dana.richview.CurrencyTextView;
import id.dana.savings.activity.SavingsActivity;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public abstract class isHasFace extends LogFactory implements Comparable<isHasFace> {
    private static Map<Integer, String> toFloatRange;
    protected int FastBitmap$CoordinateSystem;
    protected isHasFace hashCode;
    protected int toString;

    public /* synthetic */ int compareTo(Object obj) {
        isHasFace ishasface = (isHasFace) obj;
        if (equals(ishasface)) {
            return 0;
        }
        int i = this.toString;
        for (isHasFace ishasface2 = this.hashCode; ishasface2 != null; ishasface2 = ishasface2.hashCode) {
            i += ishasface2.toString;
        }
        int i2 = ishasface.toString;
        for (isHasFace ishasface3 = ishasface.hashCode; ishasface3 != null; ishasface3 = ishasface3.hashCode) {
            i2 += ishasface3.toString;
        }
        if (i < i2) {
            return -1;
        }
        if (i2 < i) {
            return 1;
        }
        int i3 = this.FastBitmap$CoordinateSystem;
        int i4 = ishasface.FastBitmap$CoordinateSystem;
        if (i3 < i4) {
            return -1;
        }
        if (i4 < i3) {
            return 1;
        }
        return hashCode() - ishasface.hashCode();
    }

    static {
        HashMap hashMap = new HashMap();
        toFloatRange = hashMap;
        hashMap.put(52, CurrencyTextView.DEFAULT_LANGUAGE_CODE);
        toFloatRange.put(32, "typeof");
        toFloatRange.put(53, "instanceof");
        toFloatRange.put(31, "delete");
        toFloatRange.put(90, ",");
        toFloatRange.put(104, ":");
        toFloatRange.put(105, "||");
        toFloatRange.put(106, "&&");
        toFloatRange.put(107, "++");
        toFloatRange.put(108, "--");
        toFloatRange.put(9, "|");
        toFloatRange.put(10, "^");
        toFloatRange.put(11, "&");
        toFloatRange.put(12, "==");
        toFloatRange.put(13, "!=");
        toFloatRange.put(14, SimpleComparison.LESS_THAN_OPERATION);
        toFloatRange.put(16, SimpleComparison.GREATER_THAN_OPERATION);
        toFloatRange.put(15, SimpleComparison.LESS_THAN_EQUAL_TO_OPERATION);
        toFloatRange.put(17, SimpleComparison.GREATER_THAN_EQUAL_TO_OPERATION);
        toFloatRange.put(18, "<<");
        toFloatRange.put(19, ">>");
        toFloatRange.put(20, ">>>");
        toFloatRange.put(21, "+");
        toFloatRange.put(22, "-");
        toFloatRange.put(23, "*");
        toFloatRange.put(24, "/");
        toFloatRange.put(25, "%");
        toFloatRange.put(26, "!");
        toFloatRange.put(27, "~");
        toFloatRange.put(28, "+");
        toFloatRange.put(29, "-");
        toFloatRange.put(46, "===");
        toFloatRange.put(47, "!==");
        toFloatRange.put(91, SimpleComparison.EQUAL_TO_OPERATION);
        toFloatRange.put(92, "|=");
        toFloatRange.put(94, "&=");
        toFloatRange.put(95, "<<=");
        toFloatRange.put(96, ">>=");
        toFloatRange.put(97, ">>>=");
        toFloatRange.put(98, "+=");
        toFloatRange.put(99, "-=");
        toFloatRange.put(100, "*=");
        toFloatRange.put(101, "/=");
        toFloatRange.put(102, "%=");
        toFloatRange.put(93, "^=");
        toFloatRange.put(127, "void");
    }

    public static class length implements Comparator<isHasFace>, Serializable {
        private static final long serialVersionUID = 1;

        public final int compare(isHasFace ishasface, isHasFace ishasface2) {
            return ishasface.toString - ishasface2.toString;
        }
    }

    public isHasFace() {
        super(-1);
        this.toString = -1;
        this.FastBitmap$CoordinateSystem = 1;
    }

    public isHasFace(int i) {
        this();
        this.toString = i;
    }

    public isHasFace(int i, int i2) {
        this();
        this.toString = i;
        this.FastBitmap$CoordinateSystem = i2;
    }

    public final int Mean$Arithmetic() {
        return this.toString;
    }

    public final void IsOverlapping(int i) {
        this.toString = i;
    }

    public final int b() {
        int i = this.toString;
        for (isHasFace ishasface = this.hashCode; ishasface != null; ishasface = ishasface.hashCode) {
            i += ishasface.toString;
        }
        return i;
    }

    public final int create() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final void equals(int i) {
        this.FastBitmap$CoordinateSystem = i;
    }

    public final void toFloatRange(int i) {
        this.toString -= i;
    }

    public final isHasFace onNavigationEvent() {
        return this.hashCode;
    }

    public final void getMax(isHasFace ishasface) {
        isHasFace ishasface2 = this.hashCode;
        if (ishasface != ishasface2) {
            if (ishasface2 != null) {
                this.toString -= -ishasface2.toString;
            }
            this.hashCode = ishasface;
            this.toString -= ishasface.toString;
        }
    }

    public boolean toDoubleRange() {
        int length2 = length();
        if (length2 == 30 || length2 == 31 || length2 == 37 || length2 == 38 || length2 == 50 || length2 == 51 || length2 == 56 || length2 == 57 || length2 == 82 || length2 == 83 || length2 == 107 || length2 == 108) {
            return true;
        }
        switch (length2) {
            case -1:
            case 35:
            case 65:
            case 73:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case TsExtractor.TS_STREAM_TYPE_HDMV_DTS:
            case 131:
            case 132:
            case 133:
            case TsExtractor.TS_STREAM_TYPE_E_AC3:
            case 136:
            case SavingsActivity.RV_BENEFIT_WIDTH:
            case 141:
            case 142:
            case 143:
            case 154:
            case 155:
            case 159:
            case BlobStatic.MONITOR_IMAGE_WIDTH:
                return true;
            default:
                switch (length2) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        switch (length2) {
                            case 69:
                            case 70:
                            case 71:
                                return true;
                            default:
                                switch (length2) {
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public static RuntimeException ICustomTabsCallback() throws RuntimeException {
        throw getStyleId.setMin();
    }

    public final int equals() {
        isHasFace ishasface = this;
        while (ishasface.setMax == -1) {
            ishasface = ishasface.hashCode;
            if (ishasface == null) {
                return -1;
            }
        }
        return ishasface.setMax;
    }

    public final void length(int i, int i2) {
        this.toString = i;
        this.FastBitmap$CoordinateSystem = i2 - i;
    }

    public final void length(isHasFace ishasface) {
        if (ishasface != null) {
            this.FastBitmap$CoordinateSystem = (ishasface.toString + ishasface.FastBitmap$CoordinateSystem) - this.toString;
            getMax((LogFactory) ishasface);
            ishasface.getMax(this);
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }
}
