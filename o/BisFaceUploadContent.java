package o;

import com.google.common.base.Ascii;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;

public class BisFaceUploadContent extends setUiContext implements doCheck {
    static final /* synthetic */ boolean $assertionsDisabled = (!BisFaceUploadContent.class.desiredAssertionStatus());
    private static final int ANCHOR_BOL = -2;
    private static final int INDEX_LEN = 2;
    private static final int Id_compile = 1;
    private static final int Id_exec = 4;
    private static final int Id_global = 3;
    private static final int Id_ignoreCase = 4;
    private static final int Id_lastIndex = 1;
    private static final int Id_multiline = 5;
    private static final int Id_prefix = 6;
    private static final int Id_source = 2;
    private static final int Id_test = 5;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    public static final int JSREG_FOLD = 2;
    public static final int JSREG_GLOB = 1;
    public static final int JSREG_MULTILINE = 4;
    public static final int MATCH = 1;
    private static final int MAX_INSTANCE_ID = 5;
    private static final int MAX_PROTOTYPE_ID = 6;
    public static final int PREFIX = 2;
    private static final Object REGEXP_TAG = new Object();
    private static final byte REOP_ALNUM = 9;
    private static final byte REOP_ALT = 31;
    private static final byte REOP_ALTPREREQ = 53;
    private static final byte REOP_ALTPREREQ2 = 55;
    private static final byte REOP_ALTPREREQi = 54;
    private static final byte REOP_ASSERT = 41;
    private static final byte REOP_ASSERTNOTTEST = 44;
    private static final byte REOP_ASSERTTEST = 43;
    private static final byte REOP_ASSERT_NOT = 42;
    private static final byte REOP_BACKREF = 13;
    private static final byte REOP_BOL = 2;
    private static final byte REOP_CLASS = 22;
    private static final byte REOP_DIGIT = 7;
    private static final byte REOP_DOT = 6;
    private static final byte REOP_EMPTY = 1;
    private static final byte REOP_END = 57;
    private static final byte REOP_ENDCHILD = 49;
    private static final byte REOP_EOL = 3;
    private static final byte REOP_FLAT = 14;
    private static final byte REOP_FLAT1 = 15;
    private static final byte REOP_FLAT1i = 17;
    private static final byte REOP_FLATi = 16;
    private static final byte REOP_JUMP = 32;
    private static final byte REOP_LPAREN = 29;
    private static final byte REOP_MINIMALOPT = 47;
    private static final byte REOP_MINIMALPLUS = 46;
    private static final byte REOP_MINIMALQUANT = 48;
    private static final byte REOP_MINIMALREPEAT = 52;
    private static final byte REOP_MINIMALSTAR = 45;
    private static final byte REOP_NCLASS = 23;
    private static final byte REOP_NONALNUM = 10;
    private static final byte REOP_NONDIGIT = 8;
    private static final byte REOP_NONSPACE = 12;
    private static final byte REOP_OPT = 28;
    private static final byte REOP_PLUS = 27;
    private static final byte REOP_QUANT = 25;
    private static final byte REOP_REPEAT = 51;
    private static final byte REOP_RPAREN = 30;
    private static final byte REOP_SIMPLE_END = 23;
    private static final byte REOP_SIMPLE_START = 1;
    private static final byte REOP_SPACE = 11;
    private static final byte REOP_STAR = 26;
    private static final byte REOP_UCFLAT1 = 18;
    private static final byte REOP_UCFLAT1i = 19;
    private static final byte REOP_WBDRY = 4;
    private static final byte REOP_WNONBDRY = 5;
    public static final int TEST = 0;
    private static final boolean debug = false;
    static final long serialVersionUID = 4965263491464903264L;
    Object lastIndex;
    private int lastIndexAttr;
    private MapStringString re;

    private static boolean isControlLetter(char c) {
        if ('a' > c || c > 'z') {
            return 'A' <= c && c <= 'Z';
        }
        return true;
    }

    static boolean isDigit(char c) {
        return '0' <= c && c <= '9';
    }

    private static boolean reopIsSimple(int i) {
        return i > 0 && i <= 23;
    }

    private static int toASCIIHexDigit(int i) {
        if (i < 48) {
            return -1;
        }
        if (i <= 57) {
            return i - 48;
        }
        int i2 = i | 32;
        if (97 > i2 || i2 > 102) {
            return -1;
        }
        return (i2 - 97) + 10;
    }

    public String getClassName() {
        return "RegExp";
    }

    public int getMaxInstanceId() {
        return 5;
    }

    public String getTypeOf() {
        return "object";
    }

    public static void init(SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils, boolean z) {
        BisFaceUploadContent bisFaceUploadContent = new BisFaceUploadContent();
        bisFaceUploadContent.re = compileRE(r4, "", (String) null, false);
        bisFaceUploadContent.activatePrototypeMap(6);
        bisFaceUploadContent.setParentScope(logUtils);
        bisFaceUploadContent.setPrototype(getObjectPrototype(logUtils));
        BisUploadGwRequest bisUploadGwRequest = new BisUploadGwRequest();
        bisFaceUploadContent.defineProperty("constructor", (Object) bisUploadGwRequest, 2);
        LogItem.getMax((onInit) bisUploadGwRequest, logUtils);
        bisUploadGwRequest.setImmunePrototypeProperty(bisFaceUploadContent);
        if (z) {
            bisFaceUploadContent.sealObject();
            bisUploadGwRequest.sealObject();
        }
        defineProperty(logUtils, "RegExp", bisUploadGwRequest, 2);
    }

    BisFaceUploadContent(LogUtils logUtils, MapStringString mapStringString) {
        Double valueOf = Double.valueOf(0.0d);
        this.lastIndex = valueOf;
        this.lastIndexAttr = 6;
        this.re = mapStringString;
        this.lastIndex = valueOf;
        LogItem.getMin((ScriptableObject) this, logUtils, TopLevel.Builtins.RegExp);
    }

    public Object call(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        return execSub(r1, logUtils, objArr, 1);
    }

    public LogUtils construct(SecureQwertyKeyboard.AnonymousClass1 r2, LogUtils logUtils, Object[] objArr) {
        return (LogUtils) execSub(r2, logUtils, objArr, 1);
    }

    /* access modifiers changed from: package-private */
    public LogUtils compile(SecureQwertyKeyboard.AnonymousClass1 r5, LogUtils logUtils, Object[] objArr) {
        if (objArr.length <= 0 || !(objArr[0] instanceof BisFaceUploadContent)) {
            this.re = compileRE(r5, (objArr.length == 0 || (objArr[0] instanceof checkOpen)) ? "" : escapeRegExp(objArr[0]), (objArr.length <= 1 || objArr[1] == checkOpen.instance) ? null : LogItem.getMin(objArr[1]), false);
            this.lastIndex = Double.valueOf(0.0d);
            return this;
        } else if (objArr.length <= 1 || objArr[1] == checkOpen.instance) {
            BisFaceUploadContent bisFaceUploadContent = objArr[0];
            this.re = bisFaceUploadContent.re;
            this.lastIndex = bisFaceUploadContent.lastIndex;
            return this;
        } else {
            throw LogItem.toFloatRange("msg.bad.regexp.compile");
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('/');
        if (this.re.source.length != 0) {
            sb.append(this.re.source);
        } else {
            sb.append("(?:)");
        }
        sb.append('/');
        if ((this.re.flags & 1) != 0) {
            sb.append('g');
        }
        if ((this.re.flags & 2) != 0) {
            sb.append('i');
        }
        if ((this.re.flags & 4) != 0) {
            sb.append('m');
        }
        return sb.toString();
    }

    BisFaceUploadContent() {
        this.lastIndex = Double.valueOf(0.0d);
        this.lastIndexAttr = 6;
    }

    private static initStandard getImpl(SecureQwertyKeyboard.AnonymousClass1 r0) {
        return (initStandard) LogItem.length(r0);
    }

    private static String escapeRegExp(Object obj) {
        String min = LogItem.getMin(obj);
        StringBuilder sb = null;
        int i = 0;
        for (int indexOf = min.indexOf(47); indexOf >= 0; indexOf = min.indexOf(47, indexOf + 1)) {
            if (indexOf == i || min.charAt(indexOf - 1) != '\\') {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(min, i, indexOf);
                sb.append("\\/");
                i = indexOf + 1;
            }
        }
        if (sb == null) {
            return min;
        }
        sb.append(min, i, min.length());
        return sb.toString();
    }

    private Object execSub(SecureQwertyKeyboard.AnonymousClass1 r12, LogUtils logUtils, Object[] objArr, int i) {
        String str;
        initStandard impl = getImpl(r12);
        if (objArr.length == 0) {
            str = impl.getMin;
            if (str == null) {
                str = LogItem.getMin(checkOpen.instance);
            }
        } else {
            str = LogItem.getMin(objArr[0]);
        }
        String str2 = str;
        double d = 0.0d;
        double length = (this.re.flags & 1) != 0 ? LogItem.length(this.lastIndex) : 0.0d;
        if (length < 0.0d || ((double) str2.length()) < length) {
            this.lastIndex = Double.valueOf(0.0d);
            return null;
        }
        int[] iArr = {(int) length};
        Object executeRegExp = executeRegExp(r12, logUtils, impl, str2, iArr, i);
        if ((this.re.flags & 1) == 0) {
            return executeRegExp;
        }
        if (!(executeRegExp == null || executeRegExp == checkOpen.instance)) {
            d = (double) iArr[0];
        }
        this.lastIndex = Double.valueOf(d);
        return executeRegExp;
    }

    static MapStringString compileRE(SecureQwertyKeyboard.AnonymousClass1 r10, String str, String str2, boolean z) {
        int i;
        int i2;
        MapStringString mapStringString = new MapStringString(str);
        int length = str.length();
        if (str2 != null) {
            i = 0;
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char charAt = str2.charAt(i3);
                if (charAt == 'g') {
                    i2 = 1;
                } else if (charAt == 'i') {
                    i2 = 2;
                } else if (charAt == 'm') {
                    i2 = 4;
                } else {
                    reportError("msg.invalid.re.flag", String.valueOf(charAt));
                    i2 = 0;
                }
                if ((i & i2) != 0) {
                    reportError("msg.invalid.re.flag", String.valueOf(charAt));
                }
                i |= i2;
            }
        } else {
            i = 0;
        }
        mapStringString.flags = i;
        BisBehavToken bisBehavToken = new BisBehavToken(r10, mapStringString.source, length, i);
        if (z && length > 0) {
            bisBehavToken.FastBitmap$CoordinateSystem = new EntryStringString((byte) 14);
            bisBehavToken.FastBitmap$CoordinateSystem.hashCode = bisBehavToken.length[0];
            bisBehavToken.FastBitmap$CoordinateSystem.invokeSuspend = length;
            bisBehavToken.FastBitmap$CoordinateSystem.Mean$Arithmetic = 0;
            bisBehavToken.values += 5;
        } else if (!parseDisjunction(bisBehavToken)) {
            return null;
        } else {
            if (bisBehavToken.IsOverlapping > bisBehavToken.equals) {
                bisBehavToken = new BisBehavToken(r10, mapStringString.source, length, i);
                bisBehavToken.toIntRange = bisBehavToken.equals;
                if (!parseDisjunction(bisBehavToken)) {
                    return null;
                }
            }
        }
        mapStringString.program = new byte[(bisBehavToken.values + 1)];
        if (bisBehavToken.isInside != 0) {
            mapStringString.classList = new BisFaceImage[bisBehavToken.isInside];
            mapStringString.classCount = bisBehavToken.isInside;
        }
        mapStringString.program[emitREBytecode(bisBehavToken, mapStringString, 0, bisBehavToken.FastBitmap$CoordinateSystem)] = REOP_END;
        mapStringString.parenCount = bisBehavToken.equals;
        byte b = mapStringString.program[0];
        if (b == 2) {
            mapStringString.anchorCh = -2;
        } else if (b != 31) {
            switch (b) {
                case 14:
                case 16:
                    mapStringString.anchorCh = mapStringString.source[getIndex(mapStringString.program, 1)];
                    break;
                case 15:
                case 17:
                    mapStringString.anchorCh = (char) (mapStringString.program[1] & 255);
                    break;
                case 18:
                case 19:
                    mapStringString.anchorCh = (char) getIndex(mapStringString.program, 1);
                    break;
            }
        } else {
            EntryStringString entryStringString = bisBehavToken.FastBitmap$CoordinateSystem;
            if (entryStringString.setMin.setMax == 2 && entryStringString.getMax.setMax == 2) {
                mapStringString.anchorCh = -2;
            }
        }
        return mapStringString;
    }

    private static boolean isWord(char c) {
        if ('a' > c || c > 'z') {
            return ('A' <= c && c <= 'Z') || isDigit(c) || c == '_';
        }
        return true;
    }

    private static boolean isLineTerm(char c) {
        return LogItem.getMax((int) c);
    }

    private static boolean isREWhiteSpace(int i) {
        return LogItem.length(i);
    }

    private static char upcase(char c) {
        if (c < 128) {
            return ('a' > c || c > 'z') ? c : (char) (c - ' ');
        }
        char upperCase = Character.toUpperCase(c);
        return upperCase < 128 ? c : upperCase;
    }

    private static char downcase(char c) {
        if (c < 128) {
            return ('A' > c || c > 'Z') ? c : (char) (c + ' ');
        }
        char lowerCase = Character.toLowerCase(c);
        return lowerCase < 128 ? c : lowerCase;
    }

    private static boolean parseDisjunction(BisBehavToken bisBehavToken) {
        if (!parseAlternative(bisBehavToken)) {
            return false;
        }
        char[] cArr = bisBehavToken.length;
        int i = bisBehavToken.getMin;
        if (i != cArr.length && cArr[i] == '|') {
            bisBehavToken.getMin++;
            EntryStringString entryStringString = new EntryStringString((byte) 31);
            entryStringString.setMin = bisBehavToken.FastBitmap$CoordinateSystem;
            if (!parseDisjunction(bisBehavToken)) {
                return false;
            }
            entryStringString.getMax = bisBehavToken.FastBitmap$CoordinateSystem;
            bisBehavToken.FastBitmap$CoordinateSystem = entryStringString;
            if (entryStringString.setMin.setMax == 14 && entryStringString.getMax.setMax == 14) {
                entryStringString.setMax = (bisBehavToken.setMax & 2) == 0 ? REOP_ALTPREREQ : REOP_ALTPREREQi;
                entryStringString.hashCode = entryStringString.setMin.hashCode;
                entryStringString.FastBitmap$CoordinateSystem = entryStringString.getMax.hashCode;
                bisBehavToken.values += 13;
            } else if (entryStringString.setMin.setMax == 22 && entryStringString.setMin.FastBitmap$CoordinateSystem < 256 && entryStringString.getMax.setMax == 14 && (bisBehavToken.setMax & 2) == 0) {
                entryStringString.setMax = REOP_ALTPREREQ2;
                entryStringString.hashCode = entryStringString.getMax.hashCode;
                entryStringString.FastBitmap$CoordinateSystem = entryStringString.setMin.FastBitmap$CoordinateSystem;
                bisBehavToken.values += 13;
            } else if (entryStringString.setMin.setMax == 14 && entryStringString.getMax.setMax == 22 && entryStringString.getMax.FastBitmap$CoordinateSystem < 256 && (bisBehavToken.setMax & 2) == 0) {
                entryStringString.setMax = REOP_ALTPREREQ2;
                entryStringString.hashCode = entryStringString.setMin.hashCode;
                entryStringString.FastBitmap$CoordinateSystem = entryStringString.getMax.FastBitmap$CoordinateSystem;
                bisBehavToken.values += 13;
            } else {
                bisBehavToken.values += 9;
            }
        }
        return true;
    }

    private static boolean parseAlternative(BisBehavToken bisBehavToken) {
        char[] cArr = bisBehavToken.length;
        EntryStringString entryStringString = null;
        EntryStringString entryStringString2 = null;
        while (bisBehavToken.getMin != bisBehavToken.setMin && cArr[bisBehavToken.getMin] != '|' && (bisBehavToken.toFloatRange == 0 || cArr[bisBehavToken.getMin] != ')')) {
            if (!parseTerm(bisBehavToken)) {
                return false;
            }
            if (entryStringString == null) {
                entryStringString = bisBehavToken.FastBitmap$CoordinateSystem;
                entryStringString2 = entryStringString;
            } else {
                entryStringString2.getMin = bisBehavToken.FastBitmap$CoordinateSystem;
            }
            while (entryStringString2.getMin != null) {
                entryStringString2 = entryStringString2.getMin;
            }
        }
        if (entryStringString == null) {
            bisBehavToken.FastBitmap$CoordinateSystem = new EntryStringString((byte) 1);
        } else {
            bisBehavToken.FastBitmap$CoordinateSystem = entryStringString;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [char[]] */
    /* JADX WARNING: type inference failed for: r5v0, types: [char] */
    /* JADX WARNING: type inference failed for: r8v0, types: [char] */
    /* JADX WARNING: type inference failed for: r1v4, types: [int, char] */
    /* JADX WARNING: type inference failed for: r12v3, types: [int, char] */
    /* JADX WARNING: type inference failed for: r12v5, types: [int, char] */
    /* JADX WARNING: type inference failed for: r1v10, types: [char] */
    /* JADX WARNING: type inference failed for: r8v9, types: [int, char] */
    /* JADX WARNING: type inference failed for: r8v15, types: [char] */
    /* JADX WARNING: type inference failed for: r12v20, types: [char] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005b, code lost:
        r13 = 0;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        if (r13 >= r1) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005f, code lost:
        if (r8 >= r2) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0061, code lost:
        r15 = r8 + 1;
        r14 = o.getStyleId.setMax((int) r18[r8], r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r14 >= 0) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006b, code lost:
        r8 = r15 - (r13 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
        r13 = r13 + 1;
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0074, code lost:
        r12 = r14;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=char, code=int, for r1v4, types: [int, char] */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean calculateBitmapSize(o.BisBehavToken r16, o.EntryStringString r17, char[] r18, int r19, int r20) {
        /*
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = 0
            r0.toDoubleRange = r3
            r4 = 1
            r0.toString = r4
            if (r1 != r2) goto L_0x000f
            return r4
        L_0x000f:
            char r5 = r18[r1]
            r6 = 94
            if (r5 != r6) goto L_0x0019
            int r1 = r1 + 1
            r0.toString = r3
        L_0x0019:
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x001c:
            if (r1 == r2) goto L_0x0109
            char r8 = r18[r1]
            r9 = 2
            java.lang.String r10 = ""
            java.lang.String r11 = "msg.bad.range"
            r12 = 92
            if (r8 == r12) goto L_0x0030
            int r8 = r1 + 1
            char r12 = r18[r1]
        L_0x002d:
            r1 = r8
            goto L_0x00ca
        L_0x0030:
            int r1 = r1 + 1
            int r8 = r1 + 1
            char r1 = r18[r1]
            r13 = 68
            if (r1 == r13) goto L_0x00fe
            r13 = 83
            if (r1 == r13) goto L_0x00fe
            r13 = 87
            if (r1 == r13) goto L_0x00fe
            r13 = 102(0x66, float:1.43E-43)
            if (r1 == r13) goto L_0x00c6
            r13 = 110(0x6e, float:1.54E-43)
            if (r1 == r13) goto L_0x00c2
            switch(r1) {
                case 48: goto L_0x0098;
                case 49: goto L_0x0098;
                case 50: goto L_0x0098;
                case 51: goto L_0x0098;
                case 52: goto L_0x0098;
                case 53: goto L_0x0098;
                case 54: goto L_0x0098;
                case 55: goto L_0x0098;
                default: goto L_0x004d;
            }
        L_0x004d:
            switch(r1) {
                case 98: goto L_0x0095;
                case 99: goto L_0x0085;
                case 100: goto L_0x007c;
                default: goto L_0x0050;
            }
        L_0x0050:
            switch(r1) {
                case 114: goto L_0x0079;
                case 115: goto L_0x00fe;
                case 116: goto L_0x0076;
                case 117: goto L_0x005a;
                case 118: goto L_0x0057;
                case 119: goto L_0x00fe;
                case 120: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            r12 = r1
            goto L_0x002d
        L_0x0055:
            r1 = 2
            goto L_0x005b
        L_0x0057:
            r12 = 11
            goto L_0x002d
        L_0x005a:
            r1 = 4
        L_0x005b:
            r13 = 0
            r14 = 0
        L_0x005d:
            if (r13 >= r1) goto L_0x0074
            if (r8 >= r2) goto L_0x0074
            int r15 = r8 + 1
            char r8 = r18[r8]
            int r14 = o.getStyleId.setMax((int) r8, (int) r14)
            if (r14 >= 0) goto L_0x0070
            int r13 = r13 + 1
            int r8 = r15 - r13
            goto L_0x002d
        L_0x0070:
            int r13 = r13 + 1
            r8 = r15
            goto L_0x005d
        L_0x0074:
            r12 = r14
            goto L_0x002d
        L_0x0076:
            r12 = 9
            goto L_0x002d
        L_0x0079:
            r12 = 13
            goto L_0x002d
        L_0x007c:
            if (r6 == 0) goto L_0x0082
            reportError(r11, r10)
            return r3
        L_0x0082:
            r12 = 57
            goto L_0x002d
        L_0x0085:
            if (r8 >= r2) goto L_0x0092
            char r1 = r18[r8]
            boolean r1 = isControlLetter(r1)
            if (r1 == 0) goto L_0x0092
            int r8 = r8 + 1
            goto L_0x002d
        L_0x0092:
            int r8 = r8 + -1
            goto L_0x002d
        L_0x0095:
            r12 = 8
            goto L_0x002d
        L_0x0098:
            int r1 = r1 + -48
            char r12 = r18[r8]
            r13 = 48
            if (r13 > r12) goto L_0x0053
            r14 = 55
            if (r12 > r14) goto L_0x0053
            int r8 = r8 + 1
            int r1 = r1 * 8
            int r12 = r12 + -48
            int r1 = r1 + r12
            char r12 = r18[r8]
            if (r13 > r12) goto L_0x0053
            if (r12 > r14) goto L_0x0053
            int r8 = r8 + 1
            int r13 = r1 * 8
            int r12 = r12 + -48
            int r13 = r13 + r12
            r12 = 255(0xff, float:3.57E-43)
            if (r13 > r12) goto L_0x00bf
            r12 = r13
            goto L_0x002d
        L_0x00bf:
            int r8 = r8 + -1
            goto L_0x0053
        L_0x00c2:
            r12 = 10
            goto L_0x002d
        L_0x00c6:
            r12 = 12
            goto L_0x002d
        L_0x00ca:
            if (r6 == 0) goto L_0x00d4
            if (r7 <= r12) goto L_0x00d2
            reportError(r11, r10)
            return r3
        L_0x00d2:
            r6 = 0
            goto L_0x00e4
        L_0x00d4:
            int r8 = r2 + -1
            if (r1 >= r8) goto L_0x00e4
            char r8 = r18[r1]
            r10 = 45
            if (r8 != r10) goto L_0x00e4
            int r1 = r1 + 1
            char r7 = (char) r12
            r6 = 1
            goto L_0x001c
        L_0x00e4:
            r8 = r16
            int r10 = r8.setMax
            r9 = r9 & r10
            if (r9 == 0) goto L_0x00f9
            char r9 = (char) r12
            char r10 = upcase(r9)
            char r9 = downcase(r9)
            if (r10 < r9) goto L_0x00f8
            r12 = r10
            goto L_0x00f9
        L_0x00f8:
            r12 = r9
        L_0x00f9:
            if (r12 <= r5) goto L_0x001c
            r5 = r12
            goto L_0x001c
        L_0x00fe:
            if (r6 == 0) goto L_0x0104
            reportError(r11, r10)
            return r3
        L_0x0104:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0.toDoubleRange = r1
            return r4
        L_0x0109:
            int r5 = r5 + r4
            r0.toDoubleRange = r5
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BisFaceUploadContent.calculateBitmapSize(o.BisBehavToken, o.EntryStringString, char[], int, int):boolean");
    }

    private static void doFlat(BisBehavToken bisBehavToken, char c) {
        bisBehavToken.FastBitmap$CoordinateSystem = new EntryStringString((byte) 14);
        bisBehavToken.FastBitmap$CoordinateSystem.hashCode = c;
        bisBehavToken.FastBitmap$CoordinateSystem.invokeSuspend = 1;
        bisBehavToken.FastBitmap$CoordinateSystem.Mean$Arithmetic = -1;
        bisBehavToken.values += 3;
    }

    private static int getDecimalValue(char c, BisBehavToken bisBehavToken, int i, String str) {
        int i2 = bisBehavToken.getMin;
        char[] cArr = bisBehavToken.length;
        int i3 = c - '0';
        boolean z = false;
        while (bisBehavToken.getMin != bisBehavToken.setMin) {
            char c2 = cArr[bisBehavToken.getMin];
            if (!isDigit(c2)) {
                break;
            }
            if (!z && (i3 = (i3 * 10) + (c2 - '0')) >= i) {
                i3 = i;
                z = true;
            }
            bisBehavToken.getMin++;
        }
        if (z) {
            reportError(str, String.valueOf(cArr, i2, bisBehavToken.getMin - i2));
        }
        return i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v67, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v109, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v110, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v111, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v112, resolved type: char} */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x017d, code lost:
        r4 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0430 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0431  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean parseTerm(o.BisBehavToken r16) {
        /*
            r0 = r16
            char[] r1 = r0.length
            int r2 = r0.getMin
            int r3 = r2 + 1
            r0.getMin = r3
            char r2 = r1[r2]
            int r3 = r0.equals
            r4 = 36
            r5 = 3
            r6 = 1
            if (r2 == r4) goto L_0x0462
            r4 = 46
            r7 = 42
            r8 = 6
            r10 = 65535(0xffff, float:9.1834E-41)
            r11 = 63
            r13 = 0
            if (r2 == r4) goto L_0x0337
            if (r2 == r11) goto L_0x0328
            r4 = 94
            r14 = 2
            if (r2 == r4) goto L_0x031b
            r4 = 91
            r15 = 92
            java.lang.String r12 = ""
            if (r2 == r4) goto L_0x02c0
            r4 = 14
            r9 = 4
            if (r2 == r15) goto L_0x00e6
            switch(r2) {
                case 40: goto L_0x005b;
                case 41: goto L_0x0055;
                case 42: goto L_0x0328;
                case 43: goto L_0x0328;
                default: goto L_0x0038;
            }
        L_0x0038:
            o.EntryStringString r8 = new o.EntryStringString
            r8.<init>(r4)
            r0.FastBitmap$CoordinateSystem = r8
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.hashCode = r2
            o.EntryStringString r2 = r0.FastBitmap$CoordinateSystem
            r2.invokeSuspend = r6
            o.EntryStringString r2 = r0.FastBitmap$CoordinateSystem
            int r4 = r0.getMin
            int r4 = r4 - r6
            r2.Mean$Arithmetic = r4
            int r2 = r0.values
            int r2 = r2 + r5
            r0.values = r2
            goto L_0x0343
        L_0x0055:
            java.lang.String r0 = "msg.re.unmatched.right.paren"
            reportError(r0, r12)
            return r13
        L_0x005b:
            r2 = 0
            int r4 = r0.getMin
            int r4 = r4 + r6
            int r5 = r0.setMin
            if (r4 >= r5) goto L_0x009d
            int r4 = r0.getMin
            char r4 = r1[r4]
            if (r4 != r11) goto L_0x009d
            int r4 = r0.getMin
            int r4 = r4 + r6
            char r4 = r1[r4]
            r5 = 61
            if (r4 == r5) goto L_0x007a
            r15 = 33
            if (r4 == r15) goto L_0x007a
            r15 = 58
            if (r4 != r15) goto L_0x009d
        L_0x007a:
            int r8 = r0.getMin
            int r8 = r8 + r14
            r0.getMin = r8
            if (r4 != r5) goto L_0x008e
            o.EntryStringString r2 = new o.EntryStringString
            r4 = 41
            r2.<init>(r4)
            int r4 = r0.values
            int r4 = r4 + r9
            r0.values = r4
            goto L_0x00b1
        L_0x008e:
            r5 = 33
            if (r4 != r5) goto L_0x00b1
            o.EntryStringString r2 = new o.EntryStringString
            r2.<init>(r7)
            int r4 = r0.values
            int r4 = r4 + r9
            r0.values = r4
            goto L_0x00b1
        L_0x009d:
            o.EntryStringString r2 = new o.EntryStringString
            r4 = 29
            r2.<init>(r4)
            int r4 = r0.values
            int r4 = r4 + r8
            r0.values = r4
            int r4 = r0.equals
            int r5 = r4 + 1
            r0.equals = r5
            r2.length = r4
        L_0x00b1:
            int r4 = r0.toFloatRange
            int r4 = r4 + r6
            r0.toFloatRange = r4
            boolean r4 = parseDisjunction(r16)
            if (r4 != 0) goto L_0x00bd
            return r13
        L_0x00bd:
            int r4 = r0.getMin
            int r5 = r0.setMin
            if (r4 == r5) goto L_0x00e0
            int r4 = r0.getMin
            char r4 = r1[r4]
            r5 = 41
            if (r4 == r5) goto L_0x00cc
            goto L_0x00e0
        L_0x00cc:
            int r4 = r0.getMin
            int r4 = r4 + r6
            r0.getMin = r4
            int r4 = r0.toFloatRange
            int r4 = r4 - r6
            r0.toFloatRange = r4
            if (r2 == 0) goto L_0x0343
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r2.setMin = r4
            r0.FastBitmap$CoordinateSystem = r2
            goto L_0x0343
        L_0x00e0:
            java.lang.String r0 = "msg.unterm.paren"
            reportError(r0, r12)
            return r13
        L_0x00e6:
            int r2 = r0.getMin
            int r8 = r0.setMin
            if (r2 >= r8) goto L_0x02ba
            int r2 = r0.getMin
            int r8 = r2 + 1
            r0.getMin = r8
            char r2 = r1[r2]
            r8 = 66
            if (r2 == r8) goto L_0x02ac
            r8 = 68
            if (r2 == r8) goto L_0x029c
            r8 = 83
            if (r2 == r8) goto L_0x028c
            r8 = 87
            r11 = 10
            if (r2 == r8) goto L_0x027c
            r8 = 102(0x66, float:1.43E-43)
            if (r2 == r8) goto L_0x0275
            r8 = 110(0x6e, float:1.54E-43)
            if (r2 == r8) goto L_0x0270
            r8 = 13
            java.lang.String r11 = "msg.bad.backref"
            r7 = 48
            switch(r2) {
                case 48: goto L_0x0245;
                case 49: goto L_0x01df;
                case 50: goto L_0x01df;
                case 51: goto L_0x01df;
                case 52: goto L_0x01df;
                case 53: goto L_0x01df;
                case 54: goto L_0x01df;
                case 55: goto L_0x01df;
                case 56: goto L_0x01df;
                case 57: goto L_0x01df;
                default: goto L_0x0117;
            }
        L_0x0117:
            switch(r2) {
                case 98: goto L_0x01d2;
                case 99: goto L_0x01ac;
                case 100: goto L_0x019d;
                default: goto L_0x011a;
            }
        L_0x011a:
            r7 = 11
            switch(r2) {
                case 114: goto L_0x0198;
                case 115: goto L_0x018a;
                case 116: goto L_0x0183;
                case 117: goto L_0x0153;
                case 118: goto L_0x014e;
                case 119: goto L_0x013e;
                case 120: goto L_0x013c;
                default: goto L_0x011f;
            }
        L_0x011f:
            o.EntryStringString r7 = new o.EntryStringString
            r7.<init>(r4)
            r0.FastBitmap$CoordinateSystem = r7
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.hashCode = r2
            o.EntryStringString r2 = r0.FastBitmap$CoordinateSystem
            r2.invokeSuspend = r6
            o.EntryStringString r2 = r0.FastBitmap$CoordinateSystem
            int r4 = r0.getMin
            int r4 = r4 - r6
            r2.Mean$Arithmetic = r4
            int r2 = r0.values
            int r2 = r2 + r5
            r0.values = r2
            goto L_0x0343
        L_0x013c:
            r9 = 2
            goto L_0x0153
        L_0x013e:
            o.EntryStringString r2 = new o.EntryStringString
            r4 = 9
            r2.<init>(r4)
            r0.FastBitmap$CoordinateSystem = r2
            int r2 = r0.values
            int r2 = r2 + r6
            r0.values = r2
            goto L_0x0343
        L_0x014e:
            doFlat(r0, r7)
            goto L_0x0343
        L_0x0153:
            r2 = 0
            r4 = 0
        L_0x0155:
            if (r2 >= r9) goto L_0x017d
            int r5 = r0.getMin
            int r7 = r0.setMin
            if (r5 >= r7) goto L_0x017d
            int r5 = r0.getMin
            int r7 = r5 + 1
            r0.getMin = r7
            char r5 = r1[r5]
            int r4 = o.getStyleId.setMax((int) r5, (int) r4)
            if (r4 >= 0) goto L_0x017a
            int r4 = r0.getMin
            int r2 = r2 + r14
            int r4 = r4 - r2
            r0.getMin = r4
            int r2 = r0.getMin
            int r4 = r2 + 1
            r0.getMin = r4
            char r4 = r1[r2]
            goto L_0x017d
        L_0x017a:
            int r2 = r2 + 1
            goto L_0x0155
        L_0x017d:
            char r2 = (char) r4
            doFlat(r0, r2)
            goto L_0x0343
        L_0x0183:
            r2 = 9
            doFlat(r0, r2)
            goto L_0x0343
        L_0x018a:
            o.EntryStringString r2 = new o.EntryStringString
            r2.<init>(r7)
            r0.FastBitmap$CoordinateSystem = r2
            int r2 = r0.values
            int r2 = r2 + r6
            r0.values = r2
            goto L_0x0343
        L_0x0198:
            doFlat(r0, r8)
            goto L_0x0343
        L_0x019d:
            o.EntryStringString r2 = new o.EntryStringString
            r4 = 7
            r2.<init>(r4)
            r0.FastBitmap$CoordinateSystem = r2
            int r2 = r0.values
            int r2 = r2 + r6
            r0.values = r2
            goto L_0x0343
        L_0x01ac:
            int r2 = r0.getMin
            int r4 = r0.setMin
            if (r2 >= r4) goto L_0x01c8
            int r2 = r0.getMin
            char r2 = r1[r2]
            boolean r2 = isControlLetter(r2)
            if (r2 == 0) goto L_0x01c8
            int r2 = r0.getMin
            int r4 = r2 + 1
            r0.getMin = r4
            char r2 = r1[r2]
            r2 = r2 & 31
            char r15 = (char) r2
            goto L_0x01cd
        L_0x01c8:
            int r2 = r0.getMin
            int r2 = r2 - r6
            r0.getMin = r2
        L_0x01cd:
            doFlat(r0, r15)
            goto L_0x0343
        L_0x01d2:
            o.EntryStringString r1 = new o.EntryStringString
            r1.<init>(r9)
            r0.FastBitmap$CoordinateSystem = r1
            int r1 = r0.values
            int r1 = r1 + r6
            r0.values = r1
            return r6
        L_0x01df:
            int r4 = r0.getMin
            int r4 = r4 - r6
            java.lang.String r9 = "msg.overlarge.backref"
            int r9 = getDecimalValue(r2, r0, r10, r9)
            int r14 = r0.toIntRange
            if (r9 <= r14) goto L_0x01f1
            o.SecureQwertyKeyboard$1 r14 = r0.getMax
            reportWarning(r14, r11, r12)
        L_0x01f1:
            int r11 = r0.toIntRange
            if (r9 <= r11) goto L_0x022b
            r0.getMin = r4
            r4 = 56
            if (r2 < r4) goto L_0x0200
            doFlat(r0, r15)
            goto L_0x0343
        L_0x0200:
            int r4 = r0.getMin
            int r4 = r4 + r6
            r0.getMin = r4
            int r2 = r2 - r7
        L_0x0206:
            r4 = 32
            if (r2 >= r4) goto L_0x0225
            int r4 = r0.getMin
            int r5 = r0.setMin
            if (r4 >= r5) goto L_0x0225
            int r4 = r0.getMin
            char r4 = r1[r4]
            if (r4 < r7) goto L_0x0225
            r5 = 55
            if (r4 > r5) goto L_0x0225
            int r5 = r0.getMin
            int r5 = r5 + r6
            r0.getMin = r5
            int r2 = r2 * 8
            int r4 = r4 + -48
            int r2 = r2 + r4
            goto L_0x0206
        L_0x0225:
            char r2 = (char) r2
            doFlat(r0, r2)
            goto L_0x0343
        L_0x022b:
            o.EntryStringString r2 = new o.EntryStringString
            r2.<init>(r8)
            r0.FastBitmap$CoordinateSystem = r2
            o.EntryStringString r2 = r0.FastBitmap$CoordinateSystem
            int r4 = r9 + -1
            r2.length = r4
            int r2 = r0.values
            int r2 = r2 + r5
            r0.values = r2
            int r2 = r0.IsOverlapping
            if (r2 >= r9) goto L_0x0343
            r0.IsOverlapping = r9
            goto L_0x0343
        L_0x0245:
            o.SecureQwertyKeyboard$1 r2 = r0.getMax
            reportWarning(r2, r11, r12)
            r2 = 0
        L_0x024b:
            r4 = 32
            if (r2 >= r4) goto L_0x026a
            int r4 = r0.getMin
            int r5 = r0.setMin
            if (r4 >= r5) goto L_0x026a
            int r4 = r0.getMin
            char r4 = r1[r4]
            if (r4 < r7) goto L_0x026a
            r5 = 55
            if (r4 > r5) goto L_0x026a
            int r5 = r0.getMin
            int r5 = r5 + r6
            r0.getMin = r5
            int r2 = r2 * 8
            int r4 = r4 + -48
            int r2 = r2 + r4
            goto L_0x024b
        L_0x026a:
            char r2 = (char) r2
            doFlat(r0, r2)
            goto L_0x0343
        L_0x0270:
            doFlat(r0, r11)
            goto L_0x0343
        L_0x0275:
            r2 = 12
            doFlat(r0, r2)
            goto L_0x0343
        L_0x027c:
            r2 = 12
            o.EntryStringString r4 = new o.EntryStringString
            r4.<init>(r11)
            r0.FastBitmap$CoordinateSystem = r4
            int r4 = r0.values
            int r4 = r4 + r6
            r0.values = r4
            goto L_0x0343
        L_0x028c:
            r2 = 12
            o.EntryStringString r4 = new o.EntryStringString
            r4.<init>(r2)
            r0.FastBitmap$CoordinateSystem = r4
            int r2 = r0.values
            int r2 = r2 + r6
            r0.values = r2
            goto L_0x0343
        L_0x029c:
            o.EntryStringString r2 = new o.EntryStringString
            r4 = 8
            r2.<init>(r4)
            r0.FastBitmap$CoordinateSystem = r2
            int r2 = r0.values
            int r2 = r2 + r6
            r0.values = r2
            goto L_0x0343
        L_0x02ac:
            o.EntryStringString r1 = new o.EntryStringString
            r2 = 5
            r1.<init>(r2)
            r0.FastBitmap$CoordinateSystem = r1
            int r1 = r0.values
            int r1 = r1 + r6
            r0.values = r1
            return r6
        L_0x02ba:
            java.lang.String r0 = "msg.trail.backslash"
            reportError(r0, r12)
            return r13
        L_0x02c0:
            o.EntryStringString r2 = new o.EntryStringString
            r4 = 22
            r2.<init>(r4)
            r0.FastBitmap$CoordinateSystem = r2
            int r2 = r0.getMin
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.equals = r2
        L_0x02cf:
            int r4 = r0.getMin
            int r7 = r0.setMin
            if (r4 != r7) goto L_0x02db
            java.lang.String r0 = "msg.unterm.class"
            reportError(r0, r12)
            return r13
        L_0x02db:
            int r4 = r0.getMin
            char r4 = r1[r4]
            if (r4 != r15) goto L_0x02e7
            int r4 = r0.getMin
            int r4 = r4 + r6
            r0.getMin = r4
            goto L_0x0315
        L_0x02e7:
            int r4 = r0.getMin
            char r4 = r1[r4]
            r7 = 93
            if (r4 != r7) goto L_0x0315
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            int r7 = r0.getMin
            int r7 = r7 - r2
            r4.values = r7
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            int r7 = r0.isInside
            int r8 = r7 + 1
            r0.isInside = r8
            r4.FastBitmap$CoordinateSystem = r7
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            int r7 = r0.getMin
            int r8 = r7 + 1
            r0.getMin = r8
            boolean r2 = calculateBitmapSize(r0, r4, r1, r2, r7)
            if (r2 != 0) goto L_0x030f
            return r13
        L_0x030f:
            int r2 = r0.values
            int r2 = r2 + r5
            r0.values = r2
            goto L_0x0343
        L_0x0315:
            int r4 = r0.getMin
            int r4 = r4 + r6
            r0.getMin = r4
            goto L_0x02cf
        L_0x031b:
            o.EntryStringString r1 = new o.EntryStringString
            r1.<init>(r14)
            r0.FastBitmap$CoordinateSystem = r1
            int r1 = r0.values
            int r1 = r1 + r6
            r0.values = r1
            return r6
        L_0x0328:
            int r0 = r0.getMin
            int r0 = r0 - r6
            char r0 = r1[r0]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "msg.bad.quant"
            reportError(r1, r0)
            return r13
        L_0x0337:
            o.EntryStringString r2 = new o.EntryStringString
            r2.<init>(r8)
            r0.FastBitmap$CoordinateSystem = r2
            int r2 = r0.values
            int r2 = r2 + r6
            r0.values = r2
        L_0x0343:
            o.EntryStringString r2 = r0.FastBitmap$CoordinateSystem
            int r4 = r0.getMin
            int r5 = r0.setMin
            if (r4 != r5) goto L_0x034c
            return r6
        L_0x034c:
            int r4 = r0.getMin
            char r4 = r1[r4]
            r5 = -1
            r7 = 25
            r8 = 42
            if (r4 == r8) goto L_0x0417
            r8 = 43
            if (r4 == r8) goto L_0x0400
            r8 = 63
            if (r4 == r8) goto L_0x03e9
            r8 = 123(0x7b, float:1.72E-43)
            if (r4 == r8) goto L_0x0366
            r5 = 0
            goto L_0x042e
        L_0x0366:
            int r4 = r0.getMin
            int r8 = r0.getMin
            int r8 = r8 + r6
            r0.getMin = r8
            int r9 = r1.length
            if (r8 >= r9) goto L_0x03e3
            int r8 = r0.getMin
            char r8 = r1[r8]
            boolean r9 = isDigit(r8)
            if (r9 == 0) goto L_0x03e3
            int r9 = r0.getMin
            int r9 = r9 + r6
            r0.getMin = r9
            java.lang.String r9 = "msg.overlarge.min"
            int r8 = getDecimalValue(r8, r0, r10, r9)
            int r9 = r0.getMin
            int r11 = r1.length
            if (r9 >= r11) goto L_0x03e3
            int r9 = r0.getMin
            char r9 = r1[r9]
            r11 = 44
            if (r9 != r11) goto L_0x03c6
            int r11 = r0.getMin
            int r11 = r11 + r6
            r0.getMin = r11
            int r12 = r1.length
            if (r11 >= r12) goto L_0x03c6
            int r9 = r0.getMin
            char r9 = r1[r9]
            boolean r11 = isDigit(r9)
            if (r11 == 0) goto L_0x03c7
            int r11 = r0.getMin
            int r11 = r11 + r6
            r0.getMin = r11
            int r12 = r1.length
            if (r11 >= r12) goto L_0x03c7
            java.lang.String r5 = "msg.overlarge.max"
            int r5 = getDecimalValue(r9, r0, r10, r5)
            int r9 = r0.getMin
            char r9 = r1[r9]
            if (r8 <= r5) goto L_0x03c7
            int r0 = r0.getMin
            char r0 = r1[r0]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "msg.max.lt.min"
            reportError(r1, r0)
            return r13
        L_0x03c6:
            r5 = r8
        L_0x03c7:
            r10 = 125(0x7d, float:1.75E-43)
            if (r9 != r10) goto L_0x03e3
            o.EntryStringString r9 = new o.EntryStringString
            r9.<init>(r7)
            r0.FastBitmap$CoordinateSystem = r9
            o.EntryStringString r7 = r0.FastBitmap$CoordinateSystem
            r7.IsOverlapping = r8
            o.EntryStringString r7 = r0.FastBitmap$CoordinateSystem
            r7.toFloatRange = r5
            int r5 = r0.values
            r7 = 12
            int r5 = r5 + r7
            r0.values = r5
            r5 = 1
            goto L_0x03e4
        L_0x03e3:
            r5 = 0
        L_0x03e4:
            if (r5 != 0) goto L_0x042e
            r0.getMin = r4
            goto L_0x042e
        L_0x03e9:
            o.EntryStringString r4 = new o.EntryStringString
            r4.<init>(r7)
            r0.FastBitmap$CoordinateSystem = r4
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.IsOverlapping = r13
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.toFloatRange = r6
            int r4 = r0.values
            r8 = 8
            int r4 = r4 + r8
            r0.values = r4
            goto L_0x042d
        L_0x0400:
            r8 = 8
            o.EntryStringString r4 = new o.EntryStringString
            r4.<init>(r7)
            r0.FastBitmap$CoordinateSystem = r4
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.IsOverlapping = r6
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.toFloatRange = r5
            int r4 = r0.values
            int r4 = r4 + r8
            r0.values = r4
            goto L_0x042d
        L_0x0417:
            r8 = 8
            o.EntryStringString r4 = new o.EntryStringString
            r4.<init>(r7)
            r0.FastBitmap$CoordinateSystem = r4
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.IsOverlapping = r13
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.toFloatRange = r5
            int r4 = r0.values
            int r4 = r4 + r8
            r0.values = r4
        L_0x042d:
            r5 = 1
        L_0x042e:
            if (r5 != 0) goto L_0x0431
            return r6
        L_0x0431:
            int r4 = r0.getMin
            int r4 = r4 + r6
            r0.getMin = r4
            o.EntryStringString r4 = r0.FastBitmap$CoordinateSystem
            r4.setMin = r2
            o.EntryStringString r2 = r0.FastBitmap$CoordinateSystem
            r2.length = r3
            o.EntryStringString r2 = r0.FastBitmap$CoordinateSystem
            int r4 = r0.equals
            int r4 = r4 - r3
            r2.toIntRange = r4
            int r2 = r0.getMin
            int r3 = r0.setMin
            if (r2 >= r3) goto L_0x045d
            int r2 = r0.getMin
            char r1 = r1[r2]
            r2 = 63
            if (r1 != r2) goto L_0x045d
            int r1 = r0.getMin
            int r1 = r1 + r6
            r0.getMin = r1
            o.EntryStringString r0 = r0.FastBitmap$CoordinateSystem
            r0.isInside = r13
            goto L_0x0461
        L_0x045d:
            o.EntryStringString r0 = r0.FastBitmap$CoordinateSystem
            r0.isInside = r6
        L_0x0461:
            return r6
        L_0x0462:
            o.EntryStringString r1 = new o.EntryStringString
            r1.<init>(r5)
            r0.FastBitmap$CoordinateSystem = r1
            int r1 = r0.values
            int r1 = r1 + r6
            r0.values = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BisFaceUploadContent.parseTerm(o.BisBehavToken):boolean");
    }

    private static void resolveForwardJump(byte[] bArr, int i, int i2) {
        if (i <= i2) {
            addIndex(bArr, i, i2 - i);
            return;
        }
        throw getStyleId.setMin();
    }

    private static int getOffset(byte[] bArr, int i) {
        return getIndex(bArr, i);
    }

    private static int addIndex(byte[] bArr, int i, int i2) {
        if (i2 < 0) {
            throw getStyleId.setMin();
        } else if (i2 <= 65535) {
            bArr[i] = (byte) (i2 >> 8);
            bArr[i + 1] = (byte) i2;
            return i + 2;
        } else {
            throw SecureQwertyKeyboard.AnonymousClass1.getMax("Too complex regexp");
        }
    }

    private static int getIndex(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    private static int emitREBytecode(BisBehavToken bisBehavToken, MapStringString mapStringString, int i, EntryStringString entryStringString) {
        int i2;
        byte[] bArr = mapStringString.program;
        while (entryStringString != null) {
            int i3 = i + 1;
            bArr[i] = entryStringString.setMax;
            byte b = entryStringString.setMax;
            boolean z = true;
            if (b != 1) {
                if (b != 22) {
                    if (b == 25) {
                        if (entryStringString.IsOverlapping == 0 && entryStringString.toFloatRange == -1) {
                            bArr[i3 - 1] = entryStringString.isInside ? (byte) 26 : 45;
                        } else if (entryStringString.IsOverlapping == 0 && entryStringString.toFloatRange == 1) {
                            bArr[i3 - 1] = entryStringString.isInside ? 28 : REOP_MINIMALOPT;
                        } else if (entryStringString.IsOverlapping == 1 && entryStringString.toFloatRange == -1) {
                            bArr[i3 - 1] = entryStringString.isInside ? 27 : REOP_MINIMALPLUS;
                        } else {
                            if (!entryStringString.isInside) {
                                bArr[i3 - 1] = REOP_MINIMALQUANT;
                            }
                            i3 = addIndex(bArr, addIndex(bArr, i3, entryStringString.IsOverlapping), entryStringString.toFloatRange + 1);
                        }
                        int addIndex = addIndex(bArr, addIndex(bArr, i3, entryStringString.toIntRange), entryStringString.length);
                        int emitREBytecode = emitREBytecode(bisBehavToken, mapStringString, addIndex + 2, entryStringString.setMin);
                        i2 = emitREBytecode + 1;
                        bArr[emitREBytecode] = 49;
                        resolveForwardJump(bArr, addIndex, i2);
                    } else if (b != 29) {
                        if (b != 31) {
                            if (b == 13) {
                                i = addIndex(bArr, i3, entryStringString.length);
                            } else if (b == 14) {
                                if (entryStringString.Mean$Arithmetic != -1) {
                                    while (entryStringString.getMin != null && entryStringString.getMin.setMax == 14 && entryStringString.Mean$Arithmetic + entryStringString.invokeSuspend == entryStringString.getMin.Mean$Arithmetic) {
                                        entryStringString.invokeSuspend += entryStringString.getMin.invokeSuspend;
                                        entryStringString.getMin = entryStringString.getMin.getMin;
                                    }
                                }
                                if (entryStringString.Mean$Arithmetic != -1 && entryStringString.invokeSuspend > 1) {
                                    if ((bisBehavToken.setMax & 2) != 0) {
                                        bArr[i3 - 1] = 16;
                                    } else {
                                        bArr[i3 - 1] = 14;
                                    }
                                    i = addIndex(bArr, addIndex(bArr, i3, entryStringString.Mean$Arithmetic), entryStringString.invokeSuspend);
                                } else if (entryStringString.hashCode < 256) {
                                    if ((bisBehavToken.setMax & 2) != 0) {
                                        bArr[i3 - 1] = 17;
                                    } else {
                                        bArr[i3 - 1] = 15;
                                    }
                                    i = i3 + 1;
                                    bArr[i3] = (byte) entryStringString.hashCode;
                                } else {
                                    if ((bisBehavToken.setMax & 2) != 0) {
                                        bArr[i3 - 1] = 19;
                                    } else {
                                        bArr[i3 - 1] = 18;
                                    }
                                    i = addIndex(bArr, i3, entryStringString.hashCode);
                                }
                            } else if (b == 41) {
                                int emitREBytecode2 = emitREBytecode(bisBehavToken, mapStringString, i3 + 2, entryStringString.setMin);
                                i2 = emitREBytecode2 + 1;
                                bArr[emitREBytecode2] = REOP_ASSERTTEST;
                                resolveForwardJump(bArr, i3, i2);
                            } else if (b != 42) {
                                switch (b) {
                                    case 53:
                                    case 54:
                                    case 55:
                                        if (entryStringString.setMax != 54) {
                                            z = false;
                                        }
                                        char c = entryStringString.hashCode;
                                        if (z) {
                                            c = upcase(c);
                                        }
                                        addIndex(bArr, i3, c);
                                        int i4 = i3 + 2;
                                        int i5 = entryStringString.FastBitmap$CoordinateSystem;
                                        if (z) {
                                            i5 = upcase((char) i5);
                                        }
                                        addIndex(bArr, i4, i5);
                                        i3 = i4 + 2;
                                        break;
                                }
                            } else {
                                int emitREBytecode3 = emitREBytecode(bisBehavToken, mapStringString, i3 + 2, entryStringString.setMin);
                                i2 = emitREBytecode3 + 1;
                                bArr[emitREBytecode3] = REOP_ASSERTNOTTEST;
                                resolveForwardJump(bArr, i3, i2);
                            }
                        }
                        EntryStringString entryStringString2 = entryStringString.getMax;
                        int emitREBytecode4 = emitREBytecode(bisBehavToken, mapStringString, i3 + 2, entryStringString.setMin);
                        int i6 = emitREBytecode4 + 1;
                        bArr[emitREBytecode4] = 32;
                        int i7 = i6 + 2;
                        resolveForwardJump(bArr, i3, i7);
                        int emitREBytecode5 = emitREBytecode(bisBehavToken, mapStringString, i7, entryStringString2);
                        int i8 = emitREBytecode5 + 1;
                        bArr[emitREBytecode5] = 32;
                        i = i8 + 2;
                        resolveForwardJump(bArr, i6, i);
                        resolveForwardJump(bArr, i8, i);
                    } else {
                        int emitREBytecode6 = emitREBytecode(bisBehavToken, mapStringString, addIndex(bArr, i3, entryStringString.length), entryStringString.setMin);
                        bArr[emitREBytecode6] = 30;
                        i = addIndex(bArr, emitREBytecode6 + 1, entryStringString.length);
                    }
                    i = i2;
                } else {
                    if (!entryStringString.toString) {
                        bArr[i3 - 1] = Ascii.ETB;
                    }
                    i = addIndex(bArr, i3, entryStringString.FastBitmap$CoordinateSystem);
                    mapStringString.classList[entryStringString.FastBitmap$CoordinateSystem] = new BisFaceImage(entryStringString.toDoubleRange, entryStringString.equals, entryStringString.values, entryStringString.toString);
                }
                entryStringString = entryStringString.getMin;
            } else {
                i3--;
            }
            i = i3;
            entryStringString = entryStringString.getMin;
        }
        return i;
    }

    private static void pushProgState(ZimDispatchPbGwFacade zimDispatchPbGwFacade, int i, int i2, int i3, ClientConfigPB clientConfigPB, int i4, int i5) {
        zimDispatchPbGwFacade.toFloatRange = new BisUploadGwResult(zimDispatchPbGwFacade.toFloatRange, i, i2, i3, clientConfigPB, i4, i5);
    }

    private static BisUploadGwResult popProgState(ZimDispatchPbGwFacade zimDispatchPbGwFacade) {
        BisUploadGwResult bisUploadGwResult = zimDispatchPbGwFacade.toFloatRange;
        zimDispatchPbGwFacade.toFloatRange = bisUploadGwResult.getMin;
        return bisUploadGwResult;
    }

    private static void pushBackTrackState(ZimDispatchPbGwFacade zimDispatchPbGwFacade, byte b, int i) {
        BisUploadGwResult bisUploadGwResult = zimDispatchPbGwFacade.toFloatRange;
        zimDispatchPbGwFacade.isInside = new ClientConfigPB(zimDispatchPbGwFacade, b, i, zimDispatchPbGwFacade.setMin, bisUploadGwResult.setMax, bisUploadGwResult.toFloatRange);
    }

    private static void pushBackTrackState(ZimDispatchPbGwFacade zimDispatchPbGwFacade, byte b, int i, int i2, int i3, int i4) {
        zimDispatchPbGwFacade.isInside = new ClientConfigPB(zimDispatchPbGwFacade, b, i, i2, i3, i4);
    }

    private static boolean flatNMatcher(ZimDispatchPbGwFacade zimDispatchPbGwFacade, int i, int i2, String str, int i3) {
        if (zimDispatchPbGwFacade.setMin + i2 > i3) {
            return false;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            if (zimDispatchPbGwFacade.length.source[i + i4] != str.charAt(zimDispatchPbGwFacade.setMin + i4)) {
                return false;
            }
        }
        zimDispatchPbGwFacade.setMin += i2;
        return true;
    }

    private static boolean flatNIMatcher(ZimDispatchPbGwFacade zimDispatchPbGwFacade, int i, int i2, String str, int i3) {
        if (zimDispatchPbGwFacade.setMin + i2 > i3) {
            return false;
        }
        char[] cArr = zimDispatchPbGwFacade.length.source;
        for (int i4 = 0; i4 < i2; i4++) {
            char c = cArr[i + i4];
            char charAt = str.charAt(zimDispatchPbGwFacade.setMin + i4);
            if (c != charAt && upcase(c) != upcase(charAt)) {
                return false;
            }
        }
        zimDispatchPbGwFacade.setMin += i2;
        return true;
    }

    private static boolean backrefMatcher(ZimDispatchPbGwFacade zimDispatchPbGwFacade, int i, String str, int i2) {
        if (zimDispatchPbGwFacade.setMax == null || i >= zimDispatchPbGwFacade.setMax.length) {
            return false;
        }
        int i3 = (int) zimDispatchPbGwFacade.setMax[i];
        if (i3 == -1) {
            return true;
        }
        int i4 = (int) (zimDispatchPbGwFacade.setMax[i] >>> 32);
        if (zimDispatchPbGwFacade.setMin + i4 > i2) {
            return false;
        }
        if ((zimDispatchPbGwFacade.length.flags & 2) != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                char charAt = str.charAt(i3 + i5);
                char charAt2 = str.charAt(zimDispatchPbGwFacade.setMin + i5);
                if (charAt != charAt2 && upcase(charAt) != upcase(charAt2)) {
                    return false;
                }
            }
        } else if (!str.regionMatches(i3, str, zimDispatchPbGwFacade.setMin, i4)) {
            return false;
        }
        zimDispatchPbGwFacade.setMin += i4;
        return true;
    }

    private static void addCharacterToCharSet(BisFaceImage bisFaceImage, char c) {
        int i = c / 8;
        if (c < bisFaceImage.length) {
            byte[] bArr = bisFaceImage.bits;
            bArr[i] = (byte) ((1 << (c & 7)) | bArr[i]);
            return;
        }
        throw LogItem.setMin("SyntaxError", "invalid range in character class");
    }

    private static void addCharacterRangeToCharSet(BisFaceImage bisFaceImage, char c, char c2) {
        int i = c / 8;
        int i2 = c2 / 8;
        if (c2 >= bisFaceImage.length || c > c2) {
            throw LogItem.setMin("SyntaxError", "invalid range in character class");
        }
        char c3 = (char) (c & 7);
        char c4 = (char) (c2 & 7);
        if (i == i2) {
            byte[] bArr = bisFaceImage.bits;
            bArr[i] = (byte) (((255 >> (7 - (c4 - c3))) << c3) | bArr[i]);
            return;
        }
        byte[] bArr2 = bisFaceImage.bits;
        bArr2[i] = (byte) ((255 << c3) | bArr2[i]);
        while (true) {
            i++;
            if (i < i2) {
                bisFaceImage.bits[i] = -1;
            } else {
                byte[] bArr3 = bisFaceImage.bits;
                bArr3[i2] = (byte) (bArr3[i2] | (255 >> (7 - c4)));
                return;
            }
        }
    }

    private static void processCharSet(ZimDispatchPbGwFacade zimDispatchPbGwFacade, BisFaceImage bisFaceImage) {
        synchronized (bisFaceImage) {
            if (!bisFaceImage.converted) {
                processCharSetImpl(zimDispatchPbGwFacade, bisFaceImage);
                bisFaceImage.converted = true;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a7, code lost:
        r9 = 0;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a9, code lost:
        if (r9 >= r2) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ab, code lost:
        if (r12 >= r3) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ad, code lost:
        r15 = r12 + 1;
        r12 = toASCIIHexDigit(r0.length.source[r12]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b9, code lost:
        if (r12 >= 0) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bb, code lost:
        r12 = r15 - (r9 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c0, code lost:
        r13 = (r13 << 4) | r12;
        r9 = r9 + 1;
        r12 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c7, code lost:
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c8, code lost:
        r10 = (char) r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void processCharSetImpl(o.ZimDispatchPbGwFacade r17, o.BisFaceImage r18) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r1.startIndex
            int r3 = r1.strlength
            int r3 = r3 + r2
            int r4 = r1.length
            int r4 = r4 + 7
            r5 = 8
            int r4 = r4 / r5
            byte[] r4 = new byte[r4]
            r1.bits = r4
            if (r2 != r3) goto L_0x0017
            return
        L_0x0017:
            o.MapStringString r4 = r0.length
            char[] r4 = r4.source
            char r4 = r4[r2]
            r6 = 94
            r7 = 0
            r8 = 1
            if (r4 != r6) goto L_0x0035
            boolean r4 = $assertionsDisabled
            if (r4 != 0) goto L_0x0032
            boolean r4 = r1.sense
            if (r4 != 0) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0032:
            int r2 = r2 + 1
            goto L_0x0044
        L_0x0035:
            boolean r4 = $assertionsDisabled
            if (r4 != 0) goto L_0x0044
            boolean r4 = r1.sense
            if (r4 == 0) goto L_0x003e
            goto L_0x0044
        L_0x003e:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0044:
            r4 = 0
            r6 = 0
        L_0x0046:
            if (r2 == r3) goto L_0x01e0
            o.MapStringString r9 = r0.length
            char[] r9 = r9.source
            char r9 = r9[r2]
            r10 = 92
            r11 = 2
            if (r9 == r10) goto L_0x0062
            o.MapStringString r9 = r0.length
            char[] r9 = r9.source
            int r10 = r2 + 1
            char r2 = r9[r2]
            r16 = r10
            r10 = r2
            r2 = r16
            goto L_0x0144
        L_0x0062:
            int r2 = r2 + 1
            o.MapStringString r9 = r0.length
            char[] r9 = r9.source
            int r12 = r2 + 1
            char r2 = r9[r2]
            r9 = 68
            if (r2 == r9) goto L_0x01cf
            r9 = 83
            if (r2 == r9) goto L_0x01bd
            r9 = 87
            if (r2 == r9) goto L_0x01ab
            r9 = 102(0x66, float:1.43E-43)
            if (r2 == r9) goto L_0x0140
            r9 = 110(0x6e, float:1.54E-43)
            if (r2 == r9) goto L_0x013c
            r9 = 48
            switch(r2) {
                case 48: goto L_0x010b;
                case 49: goto L_0x010b;
                case 50: goto L_0x010b;
                case 51: goto L_0x010b;
                case 52: goto L_0x010b;
                case 53: goto L_0x010b;
                case 54: goto L_0x010b;
                case 55: goto L_0x010b;
                default: goto L_0x0085;
            }
        L_0x0085:
            switch(r2) {
                case 98: goto L_0x0107;
                case 99: goto L_0x00e9;
                case 100: goto L_0x00e2;
                default: goto L_0x0088;
            }
        L_0x0088:
            switch(r2) {
                case 114: goto L_0x00df;
                case 115: goto L_0x00cd;
                case 116: goto L_0x00ca;
                case 117: goto L_0x00a6;
                case 118: goto L_0x00a3;
                case 119: goto L_0x0091;
                case 120: goto L_0x008f;
                default: goto L_0x008b;
            }
        L_0x008b:
            r10 = r2
        L_0x008c:
            r2 = r12
            goto L_0x0144
        L_0x008f:
            r2 = 2
            goto L_0x00a7
        L_0x0091:
            int r2 = r1.length
            int r2 = r2 - r8
        L_0x0094:
            if (r2 < 0) goto L_0x01dd
            char r9 = (char) r2
            boolean r10 = isWord(r9)
            if (r10 == 0) goto L_0x00a0
            addCharacterToCharSet(r1, r9)
        L_0x00a0:
            int r2 = r2 + -1
            goto L_0x0094
        L_0x00a3:
            r10 = 11
            goto L_0x008c
        L_0x00a6:
            r2 = 4
        L_0x00a7:
            r9 = 0
            r13 = 0
        L_0x00a9:
            if (r9 >= r2) goto L_0x00c7
            if (r12 >= r3) goto L_0x00c7
            o.MapStringString r14 = r0.length
            char[] r14 = r14.source
            int r15 = r12 + 1
            char r12 = r14[r12]
            int r12 = toASCIIHexDigit(r12)
            if (r12 >= 0) goto L_0x00c0
            int r9 = r9 + 1
            int r12 = r15 - r9
            goto L_0x00c8
        L_0x00c0:
            int r13 = r13 << 4
            r13 = r13 | r12
            int r9 = r9 + 1
            r12 = r15
            goto L_0x00a9
        L_0x00c7:
            r10 = r13
        L_0x00c8:
            char r10 = (char) r10
            goto L_0x008c
        L_0x00ca:
            r10 = 9
            goto L_0x008c
        L_0x00cd:
            int r2 = r1.length
            int r2 = r2 - r8
        L_0x00d0:
            if (r2 < 0) goto L_0x01dd
            boolean r9 = isREWhiteSpace(r2)
            if (r9 == 0) goto L_0x00dc
            char r9 = (char) r2
            addCharacterToCharSet(r1, r9)
        L_0x00dc:
            int r2 = r2 + -1
            goto L_0x00d0
        L_0x00df:
            r10 = 13
            goto L_0x008c
        L_0x00e2:
            r2 = 57
            addCharacterRangeToCharSet(r1, r9, r2)
            goto L_0x01dd
        L_0x00e9:
            if (r12 >= r3) goto L_0x0104
            o.MapStringString r2 = r0.length
            char[] r2 = r2.source
            char r2 = r2[r12]
            boolean r2 = isControlLetter(r2)
            if (r2 == 0) goto L_0x0104
            o.MapStringString r2 = r0.length
            char[] r2 = r2.source
            int r9 = r12 + 1
            char r2 = r2[r12]
            r2 = r2 & 31
            char r10 = (char) r2
            r2 = r9
            goto L_0x0144
        L_0x0104:
            int r12 = r12 + -1
            goto L_0x008c
        L_0x0107:
            r2 = r12
            r10 = 8
            goto L_0x0144
        L_0x010b:
            int r2 = r2 + -48
            o.MapStringString r10 = r0.length
            char[] r10 = r10.source
            char r10 = r10[r12]
            if (r9 > r10) goto L_0x0139
            r13 = 55
            if (r10 > r13) goto L_0x0139
            int r12 = r12 + 1
            int r2 = r2 * 8
            int r10 = r10 + -48
            int r2 = r2 + r10
            o.MapStringString r10 = r0.length
            char[] r10 = r10.source
            char r10 = r10[r12]
            if (r9 > r10) goto L_0x0139
            if (r10 > r13) goto L_0x0139
            int r12 = r12 + 1
            int r9 = r2 * 8
            int r10 = r10 + -48
            int r9 = r9 + r10
            r10 = 255(0xff, float:3.57E-43)
            if (r9 > r10) goto L_0x0137
            r2 = r9
            goto L_0x0139
        L_0x0137:
            int r12 = r12 + -1
        L_0x0139:
            char r10 = (char) r2
            goto L_0x008c
        L_0x013c:
            r10 = 10
            goto L_0x008c
        L_0x0140:
            r10 = 12
            goto L_0x008c
        L_0x0144:
            if (r4 == 0) goto L_0x017e
            o.MapStringString r4 = r0.length
            int r4 = r4.flags
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0178
            boolean r4 = $assertionsDisabled
            if (r4 != 0) goto L_0x015a
            if (r6 > r10) goto L_0x0154
            goto L_0x015a
        L_0x0154:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x015a:
            r4 = r6
        L_0x015b:
            if (r4 > r10) goto L_0x017b
            addCharacterToCharSet(r1, r4)
            char r9 = upcase(r4)
            char r11 = downcase(r4)
            if (r4 == r9) goto L_0x016d
            addCharacterToCharSet(r1, r9)
        L_0x016d:
            if (r4 == r11) goto L_0x0172
            addCharacterToCharSet(r1, r11)
        L_0x0172:
            int r4 = r4 + 1
            char r4 = (char) r4
            if (r4 == 0) goto L_0x017b
            goto L_0x015b
        L_0x0178:
            addCharacterRangeToCharSet(r1, r6, r10)
        L_0x017b:
            r4 = 0
            goto L_0x0046
        L_0x017e:
            o.MapStringString r9 = r0.length
            int r9 = r9.flags
            r9 = r9 & r11
            if (r9 == 0) goto L_0x0194
            char r9 = upcase(r10)
            addCharacterToCharSet(r1, r9)
            char r9 = downcase(r10)
            addCharacterToCharSet(r1, r9)
            goto L_0x0197
        L_0x0194:
            addCharacterToCharSet(r1, r10)
        L_0x0197:
            int r9 = r3 + -1
            if (r2 >= r9) goto L_0x0046
            o.MapStringString r9 = r0.length
            char[] r9 = r9.source
            char r9 = r9[r2]
            r11 = 45
            if (r9 != r11) goto L_0x0046
            int r2 = r2 + 1
            r6 = r10
            r4 = 1
            goto L_0x0046
        L_0x01ab:
            int r2 = r1.length
            int r2 = r2 - r8
        L_0x01ae:
            if (r2 < 0) goto L_0x01dd
            char r9 = (char) r2
            boolean r10 = isWord(r9)
            if (r10 != 0) goto L_0x01ba
            addCharacterToCharSet(r1, r9)
        L_0x01ba:
            int r2 = r2 + -1
            goto L_0x01ae
        L_0x01bd:
            int r2 = r1.length
            int r2 = r2 - r8
        L_0x01c0:
            if (r2 < 0) goto L_0x01dd
            boolean r9 = isREWhiteSpace(r2)
            if (r9 != 0) goto L_0x01cc
            char r9 = (char) r2
            addCharacterToCharSet(r1, r9)
        L_0x01cc:
            int r2 = r2 + -1
            goto L_0x01c0
        L_0x01cf:
            r2 = 47
            addCharacterRangeToCharSet(r1, r7, r2)
            r2 = 58
            int r9 = r1.length
            int r9 = r9 - r8
            char r9 = (char) r9
            addCharacterRangeToCharSet(r1, r2, r9)
        L_0x01dd:
            r2 = r12
            goto L_0x0046
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BisFaceUploadContent.processCharSetImpl(o.ZimDispatchPbGwFacade, o.BisFaceImage):void");
    }

    private static boolean classMatcher(ZimDispatchPbGwFacade zimDispatchPbGwFacade, BisFaceImage bisFaceImage, char c) {
        if (!bisFaceImage.converted) {
            processCharSet(zimDispatchPbGwFacade, bisFaceImage);
        }
        int i = c >> 3;
        boolean z = true;
        if (!(bisFaceImage.length == 0 || c >= bisFaceImage.length || (bisFaceImage.bits[i] & (1 << (c & 7))) == 0)) {
            z = false;
        }
        return bisFaceImage.sense ^ z;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f6, code lost:
        if (isLineTerm(r4.charAt(r3.setMin - 1)) == false) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01f9, code lost:
        if (r1 == false) goto L_0x0200;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fb, code lost:
        if (r9 != false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01fd, code lost:
        r3.setMin = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01ff, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0200, code lost:
        r3.setMin = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0203, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00be, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a3, code lost:
        if (isWord(r4.charAt(r3.setMin)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01c9, code lost:
        if (isWord(r4.charAt(r3.setMin)) != false) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01cb, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01cc, code lost:
        r1 = r1 ^ r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01e0, code lost:
        if (isLineTerm(r4.charAt(r3.setMin)) == false) goto L_0x01f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int simpleMatch(o.ZimDispatchPbGwFacade r3, java.lang.String r4, int r5, byte[] r6, int r7, int r8, boolean r9) {
        /*
            int r0 = r3.setMin
            r1 = 0
            r2 = 1
            switch(r5) {
                case 1: goto L_0x01f8;
                case 2: goto L_0x01e3;
                case 3: goto L_0x01ce;
                case 4: goto L_0x01a6;
                case 5: goto L_0x0180;
                case 6: goto L_0x0169;
                case 7: goto L_0x0152;
                case 8: goto L_0x013b;
                case 9: goto L_0x0124;
                case 10: goto L_0x010d;
                case 11: goto L_0x00f6;
                case 12: goto L_0x00df;
                case 13: goto L_0x00d3;
                case 14: goto L_0x00c1;
                case 15: goto L_0x00a3;
                case 16: goto L_0x0091;
                case 17: goto L_0x006d;
                case 18: goto L_0x0053;
                case 19: goto L_0x002f;
                case 20: goto L_0x0007;
                case 21: goto L_0x0007;
                case 22: goto L_0x000c;
                case 23: goto L_0x000c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.RuntimeException r3 = o.getStyleId.setMin()
            throw r3
        L_0x000c:
            int r5 = getIndex(r6, r7)
            int r7 = r7 + 2
            int r6 = r3.setMin
            if (r6 == r8) goto L_0x01f9
            o.MapStringString r6 = r3.length
            o.BisFaceImage[] r6 = r6.classList
            r5 = r6[r5]
            int r6 = r3.setMin
            char r4 = r4.charAt(r6)
            boolean r4 = classMatcher(r3, r5, r4)
            if (r4 == 0) goto L_0x01f9
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x002f:
            int r5 = getIndex(r6, r7)
            char r5 = (char) r5
            int r7 = r7 + 2
            int r6 = r3.setMin
            if (r6 == r8) goto L_0x01f9
            int r6 = r3.setMin
            char r4 = r4.charAt(r6)
            if (r5 == r4) goto L_0x004c
            char r5 = upcase(r5)
            char r4 = upcase(r4)
            if (r5 != r4) goto L_0x01f9
        L_0x004c:
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x0053:
            int r5 = getIndex(r6, r7)
            char r5 = (char) r5
            int r7 = r7 + 2
            int r6 = r3.setMin
            if (r6 == r8) goto L_0x01f9
            int r6 = r3.setMin
            char r4 = r4.charAt(r6)
            if (r4 != r5) goto L_0x01f9
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x006d:
            int r5 = r7 + 1
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            char r6 = (char) r6
            int r7 = r3.setMin
            if (r7 == r8) goto L_0x00be
            int r7 = r3.setMin
            char r4 = r4.charAt(r7)
            if (r6 == r4) goto L_0x008a
            char r6 = upcase(r6)
            char r4 = upcase(r4)
            if (r6 != r4) goto L_0x00be
        L_0x008a:
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            r1 = 1
            goto L_0x00be
        L_0x0091:
            int r5 = getIndex(r6, r7)
            int r7 = r7 + 2
            int r6 = getIndex(r6, r7)
            int r7 = r7 + 2
            boolean r1 = flatNIMatcher(r3, r5, r6, r4, r8)
            goto L_0x01f9
        L_0x00a3:
            int r5 = r7 + 1
            byte r6 = r6[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            char r6 = (char) r6
            int r7 = r3.setMin
            if (r7 == r8) goto L_0x00be
            int r7 = r3.setMin
            char r4 = r4.charAt(r7)
            if (r4 != r6) goto L_0x00be
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            r7 = r5
            goto L_0x01f8
        L_0x00be:
            r7 = r5
            goto L_0x01f9
        L_0x00c1:
            int r5 = getIndex(r6, r7)
            int r7 = r7 + 2
            int r6 = getIndex(r6, r7)
            int r7 = r7 + 2
            boolean r1 = flatNMatcher(r3, r5, r6, r4, r8)
            goto L_0x01f9
        L_0x00d3:
            int r5 = getIndex(r6, r7)
            int r7 = r7 + 2
            boolean r1 = backrefMatcher(r3, r5, r4, r8)
            goto L_0x01f9
        L_0x00df:
            int r5 = r3.setMin
            if (r5 == r8) goto L_0x01f9
            int r5 = r3.setMin
            char r4 = r4.charAt(r5)
            boolean r4 = isREWhiteSpace(r4)
            if (r4 != 0) goto L_0x01f9
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x00f6:
            int r5 = r3.setMin
            if (r5 == r8) goto L_0x01f9
            int r5 = r3.setMin
            char r4 = r4.charAt(r5)
            boolean r4 = isREWhiteSpace(r4)
            if (r4 == 0) goto L_0x01f9
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x010d:
            int r5 = r3.setMin
            if (r5 == r8) goto L_0x01f9
            int r5 = r3.setMin
            char r4 = r4.charAt(r5)
            boolean r4 = isWord(r4)
            if (r4 != 0) goto L_0x01f9
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x0124:
            int r5 = r3.setMin
            if (r5 == r8) goto L_0x01f9
            int r5 = r3.setMin
            char r4 = r4.charAt(r5)
            boolean r4 = isWord(r4)
            if (r4 == 0) goto L_0x01f9
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x013b:
            int r5 = r3.setMin
            if (r5 == r8) goto L_0x01f9
            int r5 = r3.setMin
            char r4 = r4.charAt(r5)
            boolean r4 = isDigit(r4)
            if (r4 != 0) goto L_0x01f9
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x0152:
            int r5 = r3.setMin
            if (r5 == r8) goto L_0x01f9
            int r5 = r3.setMin
            char r4 = r4.charAt(r5)
            boolean r4 = isDigit(r4)
            if (r4 == 0) goto L_0x01f9
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x0169:
            int r5 = r3.setMin
            if (r5 == r8) goto L_0x01f9
            int r5 = r3.setMin
            char r4 = r4.charAt(r5)
            boolean r4 = isLineTerm(r4)
            if (r4 != 0) goto L_0x01f9
            int r4 = r3.setMin
            int r4 = r4 + r2
            r3.setMin = r4
            goto L_0x01f8
        L_0x0180:
            int r5 = r3.setMin
            if (r5 == 0) goto L_0x0194
            int r5 = r3.setMin
            int r5 = r5 - r2
            char r5 = r4.charAt(r5)
            boolean r5 = isWord(r5)
            if (r5 != 0) goto L_0x0192
            goto L_0x0194
        L_0x0192:
            r5 = 0
            goto L_0x0195
        L_0x0194:
            r5 = 1
        L_0x0195:
            int r6 = r3.setMin
            if (r6 >= r8) goto L_0x01cc
            int r6 = r3.setMin
            char r4 = r4.charAt(r6)
            boolean r4 = isWord(r4)
            if (r4 == 0) goto L_0x01cc
            goto L_0x01cb
        L_0x01a6:
            int r5 = r3.setMin
            if (r5 == 0) goto L_0x01ba
            int r5 = r3.setMin
            int r5 = r5 - r2
            char r5 = r4.charAt(r5)
            boolean r5 = isWord(r5)
            if (r5 != 0) goto L_0x01b8
            goto L_0x01ba
        L_0x01b8:
            r5 = 0
            goto L_0x01bb
        L_0x01ba:
            r5 = 1
        L_0x01bb:
            int r6 = r3.setMin
            if (r6 >= r8) goto L_0x01cb
            int r6 = r3.setMin
            char r4 = r4.charAt(r6)
            boolean r4 = isWord(r4)
            if (r4 != 0) goto L_0x01cc
        L_0x01cb:
            r1 = 1
        L_0x01cc:
            r1 = r1 ^ r5
            goto L_0x01f9
        L_0x01ce:
            int r5 = r3.setMin
            if (r5 == r8) goto L_0x01f8
            boolean r5 = r3.getMax
            if (r5 == 0) goto L_0x01f9
            int r5 = r3.setMin
            char r4 = r4.charAt(r5)
            boolean r4 = isLineTerm(r4)
            if (r4 == 0) goto L_0x01f9
            goto L_0x01f8
        L_0x01e3:
            int r5 = r3.setMin
            if (r5 == 0) goto L_0x01f8
            boolean r5 = r3.getMax
            if (r5 == 0) goto L_0x01f9
            int r5 = r3.setMin
            int r5 = r5 - r2
            char r4 = r4.charAt(r5)
            boolean r4 = isLineTerm(r4)
            if (r4 == 0) goto L_0x01f9
        L_0x01f8:
            r1 = 1
        L_0x01f9:
            if (r1 == 0) goto L_0x0200
            if (r9 != 0) goto L_0x01ff
            r3.setMin = r0
        L_0x01ff:
            return r7
        L_0x0200:
            r3.setMin = r0
            r3 = -1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BisFaceUploadContent.simpleMatch(o.ZimDispatchPbGwFacade, java.lang.String, int, byte[], int, int, boolean):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v65, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v66, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v67, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: byte} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x01dd A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01f0  */
    private static boolean executeREBytecode(o.ZimDispatchPbGwFacade r22, java.lang.String r23, int r24) {
        /*
            r7 = r22
            r8 = r24
            o.MapStringString r0 = r7.length
            byte[] r9 = r0.program
            r10 = 0
            byte r11 = r9[r10]
            o.MapStringString r0 = r7.length
            int r0 = r0.anchorCh
            r12 = 57
            r14 = 52
            r15 = 1
            if (r0 >= 0) goto L_0x004f
            boolean r0 = reopIsSimple(r11)
            if (r0 == 0) goto L_0x004f
        L_0x001c:
            int r0 = r7.setMin
            if (r0 > r8) goto L_0x0041
            r4 = 1
            r6 = 1
            r0 = r22
            r1 = r23
            r2 = r11
            r3 = r9
            r5 = r24
            int r0 = simpleMatch(r0, r1, r2, r3, r4, r5, r6)
            if (r0 < 0) goto L_0x0036
            int r1 = r0 + 1
            byte r11 = r9[r0]
            r0 = 1
            goto L_0x0043
        L_0x0036:
            int r0 = r7.getMin
            int r0 = r0 + r15
            r7.getMin = r0
            int r0 = r7.setMin
            int r0 = r0 + r15
            r7.setMin = r0
            goto L_0x001c
        L_0x0041:
            r0 = 0
            r1 = 1
        L_0x0043:
            if (r0 != 0) goto L_0x0046
            return r10
        L_0x0046:
            r2 = r11
            r16 = 0
            r17 = 57
            r18 = 0
        L_0x004d:
            r11 = r1
            goto L_0x0057
        L_0x004f:
            r2 = r11
            r11 = 1
            r16 = 0
            r17 = 57
            r18 = 0
        L_0x0057:
            boolean r0 = reopIsSimple(r2)
            if (r0 == 0) goto L_0x0076
            r6 = 1
            r0 = r22
            r1 = r23
            r3 = r9
            r4 = r11
            r5 = r24
            int r0 = simpleMatch(r0, r1, r2, r3, r4, r5, r6)
            if (r0 < 0) goto L_0x006e
            r1 = 1
            goto L_0x006f
        L_0x006e:
            r1 = 0
        L_0x006f:
            if (r1 == 0) goto L_0x0072
            r11 = r0
        L_0x0072:
            r18 = r1
            goto L_0x030a
        L_0x0076:
            if (r2 == r12) goto L_0x044a
            r6 = -1
            switch(r2) {
                case 25: goto L_0x0289;
                case 26: goto L_0x0289;
                case 27: goto L_0x0289;
                case 28: goto L_0x0289;
                case 29: goto L_0x03b4;
                case 30: goto L_0x039e;
                case 31: goto L_0x035b;
                case 32: goto L_0x0350;
                default: goto L_0x007c;
            }
        L_0x007c:
            r5 = 44
            switch(r2) {
                case 41: goto L_0x02e5;
                case 42: goto L_0x02a6;
                case 43: goto L_0x028c;
                case 44: goto L_0x028c;
                case 45: goto L_0x0289;
                case 46: goto L_0x0289;
                case 47: goto L_0x0289;
                case 48: goto L_0x0289;
                case 49: goto L_0x0281;
                default: goto L_0x0081;
            }
        L_0x0081:
            switch(r2) {
                case 51: goto L_0x0192;
                case 52: goto L_0x00c9;
                case 53: goto L_0x008b;
                case 54: goto L_0x008b;
                case 55: goto L_0x008b;
                default: goto L_0x0084;
            }
        L_0x0084:
            java.lang.String r0 = "invalid bytecode"
            java.lang.RuntimeException r0 = o.getStyleId.setMax(r0)
            throw r0
        L_0x008b:
            int r0 = getIndex(r9, r11)
            char r0 = (char) r0
            int r11 = r11 + 2
            int r1 = getIndex(r9, r11)
            char r1 = (char) r1
            int r11 = r11 + 2
            int r3 = r7.setMin
            if (r3 != r8) goto L_0x00a1
        L_0x009d:
            r18 = 0
            goto L_0x030a
        L_0x00a1:
            int r3 = r7.setMin
            r5 = r23
            char r3 = r5.charAt(r3)
            r4 = 55
            if (r2 != r4) goto L_0x00bc
            if (r3 == r0) goto L_0x035b
            o.MapStringString r0 = r7.length
            o.BisFaceImage[] r0 = r0.classList
            r0 = r0[r1]
            boolean r0 = classMatcher(r7, r0, r3)
            if (r0 != 0) goto L_0x035b
            goto L_0x009d
        L_0x00bc:
            r4 = 54
            if (r2 != r4) goto L_0x00c4
            char r3 = upcase(r3)
        L_0x00c4:
            if (r3 == r0) goto L_0x035b
            if (r3 == r1) goto L_0x035b
            goto L_0x009d
        L_0x00c9:
            r5 = r23
            o.BisUploadGwResult r4 = popProgState(r22)
            if (r18 != 0) goto L_0x0120
            int r0 = r4.getMax
            if (r0 == r6) goto L_0x00e0
            int r0 = r4.getMax
            if (r0 <= 0) goto L_0x00da
            goto L_0x00e0
        L_0x00da:
            int r0 = r4.toFloatRange
            int r1 = r4.setMax
            goto L_0x01aa
        L_0x00e0:
            int r1 = r4.length
            int r2 = r4.getMax
            int r3 = r7.setMin
            r16 = 0
            int r0 = r4.setMax
            int r4 = r4.toFloatRange
            r17 = r0
            r0 = r22
            r19 = r4
            r4 = r16
            r5 = r17
            r12 = -1
            r6 = r19
            pushProgState(r0, r1, r2, r3, r4, r5, r6)
            int r0 = getIndex(r9, r11)
            int r1 = r11 + 2
            int r2 = getIndex(r9, r1)
            int r1 = r1 + 4
            r3 = 0
        L_0x0109:
            if (r3 >= r0) goto L_0x0113
            int r4 = r2 + r3
            r7.setMin(r4, r12, r10)
            int r3 = r3 + 1
            goto L_0x0109
        L_0x0113:
            int r0 = r1 + 1
            byte r2 = r9[r1]
        L_0x0117:
            r16 = r11
            r12 = 57
            r17 = 52
            r11 = r0
            goto L_0x0057
        L_0x0120:
            r12 = -1
            int r0 = r4.length
            if (r0 != 0) goto L_0x0131
            int r0 = r7.setMin
            int r1 = r4.setMin
            if (r0 != r1) goto L_0x0131
            int r0 = r4.toFloatRange
            int r1 = r4.setMax
            goto L_0x01c5
        L_0x0131:
            int r0 = r4.length
            int r1 = r4.getMax
            if (r0 == 0) goto L_0x0139
            int r0 = r0 + -1
        L_0x0139:
            r16 = r0
            if (r1 == r12) goto L_0x013f
            int r1 = r1 + -1
        L_0x013f:
            r2 = r1
            int r3 = r7.setMin
            r5 = 0
            int r6 = r4.setMax
            int r1 = r4.toFloatRange
            r0 = r22
            r17 = r1
            r1 = r16
            r13 = r4
            r4 = r5
            r5 = r6
            r6 = r17
            pushProgState(r0, r1, r2, r3, r4, r5, r6)
            if (r16 == 0) goto L_0x0173
            int r0 = getIndex(r9, r11)
            int r1 = r11 + 2
            int r2 = getIndex(r9, r1)
            int r1 = r1 + 4
            r3 = 0
        L_0x0164:
            if (r3 >= r0) goto L_0x016e
            int r4 = r2 + r3
            r7.setMin(r4, r12, r10)
            int r3 = r3 + 1
            goto L_0x0164
        L_0x016e:
            int r0 = r1 + 1
            byte r2 = r9[r1]
            goto L_0x0117
        L_0x0173:
            int r0 = r13.toFloatRange
            int r1 = r13.setMax
            pushBackTrackState(r7, r14, r11)
            popProgState(r22)
            int r11 = r11 + 4
            int r2 = getOffset(r9, r11)
            int r11 = r11 + r2
            int r2 = r11 + 1
            byte r3 = r9[r11]
            r16 = r0
            r17 = r1
            r11 = r2
            r2 = r3
            r12 = 57
            goto L_0x0057
        L_0x0192:
            r12 = -1
        L_0x0193:
            o.BisUploadGwResult r13 = popProgState(r22)
            if (r18 != 0) goto L_0x01b0
            int r0 = r13.length
            if (r0 != 0) goto L_0x019f
            r18 = 1
        L_0x019f:
            int r0 = r13.toFloatRange
            int r1 = r13.setMax
            int r11 = r11 + 4
            int r2 = getOffset(r9, r11)
            int r11 = r11 + r2
        L_0x01aa:
            r16 = r0
            r17 = r1
            goto L_0x030a
        L_0x01b0:
            int r0 = r13.length
            if (r0 != 0) goto L_0x01cb
            int r0 = r7.setMin
            int r1 = r13.setMin
            if (r0 != r1) goto L_0x01cb
            int r0 = r13.toFloatRange
            int r1 = r13.setMax
            int r11 = r11 + 4
            int r2 = getOffset(r9, r11)
            int r11 = r11 + r2
        L_0x01c5:
            r16 = r0
            r17 = r1
            goto L_0x009d
        L_0x01cb:
            int r0 = r13.length
            int r1 = r13.getMax
            if (r0 == 0) goto L_0x01d3
            int r0 = r0 + -1
        L_0x01d3:
            r16 = r0
            if (r1 == r12) goto L_0x01d9
            int r1 = r1 + -1
        L_0x01d9:
            r17 = r1
            if (r17 != 0) goto L_0x01f0
            int r0 = r13.toFloatRange
            int r1 = r13.setMax
            int r11 = r11 + 4
            int r2 = getOffset(r9, r11)
            int r11 = r11 + r2
            r16 = r0
            r17 = r1
            r18 = 1
            goto L_0x030a
        L_0x01f0:
            int r0 = r11 + 6
            byte r2 = r9[r0]
            int r6 = r7.setMin
            boolean r1 = reopIsSimple(r2)
            if (r1 == 0) goto L_0x022e
            int r4 = r0 + 1
            r18 = 1
            r0 = r22
            r1 = r23
            r3 = r9
            r5 = r24
            r20 = r6
            r6 = r18
            int r0 = simpleMatch(r0, r1, r2, r3, r4, r5, r6)
            if (r0 >= 0) goto L_0x0229
            if (r16 != 0) goto L_0x0215
            r0 = 1
            goto L_0x0216
        L_0x0215:
            r0 = 0
        L_0x0216:
            int r1 = r13.toFloatRange
            int r2 = r13.setMax
            int r11 = r11 + 4
            int r3 = getOffset(r9, r11)
            int r11 = r11 + r3
            r18 = r0
            r16 = r1
            r17 = r2
            goto L_0x030a
        L_0x0229:
            r18 = r0
            r21 = 1
            goto L_0x0234
        L_0x022e:
            r20 = r6
            r21 = r18
            r18 = r0
        L_0x0234:
            r4 = 0
            int r5 = r13.setMax
            int r6 = r13.toFloatRange
            r0 = r22
            r1 = r16
            r2 = r17
            r3 = r20
            pushProgState(r0, r1, r2, r3, r4, r5, r6)
            if (r16 != 0) goto L_0x0269
            r1 = 51
            int r4 = r13.setMax
            int r5 = r13.toFloatRange
            r0 = r22
            r2 = r11
            r3 = r20
            pushBackTrackState(r0, r1, r2, r3, r4, r5)
            int r0 = getIndex(r9, r11)
            int r1 = r11 + 2
            int r1 = getIndex(r9, r1)
            r2 = 0
        L_0x025f:
            if (r2 >= r0) goto L_0x0269
            int r3 = r1 + r2
            r7.setMin(r3, r12, r10)
            int r2 = r2 + 1
            goto L_0x025f
        L_0x0269:
            byte r0 = r9[r18]
            r1 = 49
            if (r0 == r1) goto L_0x027d
            int r1 = r18 + 1
            byte r2 = r9[r18]
            r16 = r11
            r18 = r21
            r12 = 57
            r17 = 51
            goto L_0x004d
        L_0x027d:
            r18 = r21
            goto L_0x0193
        L_0x0281:
            r11 = r16
            r2 = r17
            r18 = 1
            goto L_0x0057
        L_0x0289:
            r12 = -1
            goto L_0x03ca
        L_0x028c:
            o.BisUploadGwResult r0 = popProgState(r22)
            int r1 = r0.setMin
            r7.setMin = r1
            o.ClientConfigPB r1 = r0.equals
            r7.isInside = r1
            int r1 = r0.toFloatRange
            int r0 = r0.setMax
            if (r2 != r5) goto L_0x02a0
            r18 = r18 ^ 1
        L_0x02a0:
            r17 = r0
            r16 = r1
            goto L_0x030a
        L_0x02a6:
            int r0 = getIndex(r9, r11)
            int r12 = r11 + r0
            int r11 = r11 + 2
            int r13 = r11 + 1
            byte r11 = r9[r11]
            boolean r0 = reopIsSimple(r11)
            if (r0 == 0) goto L_0x02cf
            r6 = 0
            r0 = r22
            r1 = r23
            r2 = r11
            r3 = r9
            r4 = r13
            r14 = 44
            r5 = r24
            int r0 = simpleMatch(r0, r1, r2, r3, r4, r5, r6)
            if (r0 < 0) goto L_0x02d1
            byte r0 = r9[r0]
            if (r0 != r14) goto L_0x02d1
            goto L_0x0307
        L_0x02cf:
            r14 = 44
        L_0x02d1:
            r1 = 0
            r2 = 0
            int r3 = r7.setMin
            o.ClientConfigPB r4 = r7.isInside
            r0 = r22
            r5 = r17
            r6 = r16
            pushProgState(r0, r1, r2, r3, r4, r5, r6)
            pushBackTrackState(r7, r14, r12)
            goto L_0x034e
        L_0x02e5:
            int r0 = getIndex(r9, r11)
            int r12 = r11 + r0
            int r11 = r11 + 2
            int r13 = r11 + 1
            byte r11 = r9[r11]
            boolean r0 = reopIsSimple(r11)
            if (r0 == 0) goto L_0x033a
            r6 = 0
            r0 = r22
            r1 = r23
            r2 = r11
            r3 = r9
            r4 = r13
            r5 = r24
            int r0 = simpleMatch(r0, r1, r2, r3, r4, r5, r6)
            if (r0 >= 0) goto L_0x033a
        L_0x0307:
            r11 = r13
            goto L_0x009d
        L_0x030a:
            if (r18 != 0) goto L_0x0334
            o.ClientConfigPB r0 = r7.isInside
            if (r0 == 0) goto L_0x0333
            o.ClientConfigPB r1 = r0.setMax
            r7.isInside = r1
            long[] r1 = r0.toFloatRange
            r7.setMax = r1
            int r1 = r0.getMax
            r7.setMin = r1
            o.BisUploadGwResult r1 = r0.IsOverlapping
            r7.toFloatRange = r1
            int r1 = r0.getMin
            int r2 = r0.equals
            int r11 = r0.length
            int r0 = r0.setMin
            r17 = r1
            r16 = r2
            r12 = 57
            r14 = 52
            r2 = r0
            goto L_0x0057
        L_0x0333:
            return r10
        L_0x0334:
            int r0 = r11 + 1
            byte r2 = r9[r11]
            goto L_0x03c3
        L_0x033a:
            r1 = 0
            r2 = 0
            int r3 = r7.setMin
            o.ClientConfigPB r4 = r7.isInside
            r0 = r22
            r5 = r17
            r6 = r16
            pushProgState(r0, r1, r2, r3, r4, r5, r6)
            r0 = 43
            pushBackTrackState(r7, r0, r12)
        L_0x034e:
            r2 = r11
            goto L_0x039c
        L_0x0350:
            int r0 = getOffset(r9, r11)
            int r11 = r11 + r0
            int r0 = r11 + 1
            byte r2 = r9[r11]
            goto L_0x03c3
        L_0x035b:
            int r0 = getOffset(r9, r11)
            int r12 = r11 + r0
            int r11 = r11 + 2
            int r4 = r11 + 1
            byte r2 = r9[r11]
            int r11 = r7.setMin
            boolean r0 = reopIsSimple(r2)
            if (r0 == 0) goto L_0x038b
            r6 = 1
            r0 = r22
            r1 = r23
            r3 = r9
            r5 = r24
            int r0 = simpleMatch(r0, r1, r2, r3, r4, r5, r6)
            if (r0 >= 0) goto L_0x0382
            int r11 = r12 + 1
            byte r2 = r9[r12]
            goto L_0x03c4
        L_0x0382:
            int r1 = r0 + 1
            byte r0 = r9[r0]
            r6 = r0
            r13 = r1
            r18 = 1
            goto L_0x038d
        L_0x038b:
            r6 = r2
            r13 = r4
        L_0x038d:
            int r2 = r12 + 1
            byte r1 = r9[r12]
            r0 = r22
            r3 = r11
            r4 = r17
            r5 = r16
            pushBackTrackState(r0, r1, r2, r3, r4, r5)
            r2 = r6
        L_0x039c:
            r11 = r13
            goto L_0x03c4
        L_0x039e:
            int r0 = getIndex(r9, r11)
            int r11 = r11 + 2
            long[] r1 = r7.setMax
            r2 = r1[r0]
            int r1 = (int) r2
            int r2 = r7.setMin
            int r2 = r2 - r1
            r7.setMin(r0, r1, r2)
            int r0 = r11 + 1
            byte r2 = r9[r11]
            goto L_0x03c3
        L_0x03b4:
            int r0 = getIndex(r9, r11)
            int r11 = r11 + 2
            int r1 = r7.setMin
            r7.setMin(r0, r1, r10)
            int r0 = r11 + 1
            byte r2 = r9[r11]
        L_0x03c3:
            r11 = r0
        L_0x03c4:
            r12 = 57
            r14 = 52
            goto L_0x0057
        L_0x03ca:
            switch(r2) {
                case 25: goto L_0x03ec;
                case 26: goto L_0x03e6;
                case 27: goto L_0x03e1;
                case 28: goto L_0x03dd;
                default: goto L_0x03cd;
            }
        L_0x03cd:
            switch(r2) {
                case 45: goto L_0x03db;
                case 46: goto L_0x03d9;
                case 47: goto L_0x03d7;
                case 48: goto L_0x03d5;
                default: goto L_0x03d0;
            }
        L_0x03d0:
            java.lang.RuntimeException r0 = o.getStyleId.setMin()
            throw r0
        L_0x03d5:
            r0 = 0
            goto L_0x03ed
        L_0x03d7:
            r0 = 0
            goto L_0x03de
        L_0x03d9:
            r0 = 0
            goto L_0x03e2
        L_0x03db:
            r0 = 0
            goto L_0x03e7
        L_0x03dd:
            r0 = 1
        L_0x03de:
            r13 = r11
            r2 = 1
            goto L_0x03e9
        L_0x03e1:
            r0 = 1
        L_0x03e2:
            r13 = r11
            r2 = -1
            r12 = 1
            goto L_0x03ea
        L_0x03e6:
            r0 = 1
        L_0x03e7:
            r13 = r11
            r2 = -1
        L_0x03e9:
            r12 = 0
        L_0x03ea:
            r11 = r0
            goto L_0x03fd
        L_0x03ec:
            r0 = 1
        L_0x03ed:
            int r1 = getOffset(r9, r11)
            int r11 = r11 + 2
            int r2 = getOffset(r9, r11)
            int r2 = r2 - r15
            int r11 = r11 + 2
            r12 = r1
            r13 = r11
            goto L_0x03ea
        L_0x03fd:
            int r3 = r7.setMin
            r4 = 0
            r0 = r22
            r1 = r12
            r5 = r17
            r6 = r16
            pushProgState(r0, r1, r2, r3, r4, r5, r6)
            if (r11 == 0) goto L_0x0421
            r1 = 51
            pushBackTrackState(r7, r1, r13)
            int r0 = r13 + 6
            int r11 = r0 + 1
            byte r2 = r9[r0]
            r16 = r13
            r12 = 57
            r14 = 52
            r17 = 51
            goto L_0x0057
        L_0x0421:
            r1 = 51
            if (r12 == 0) goto L_0x0435
            int r0 = r13 + 6
            int r11 = r0 + 1
            byte r2 = r9[r0]
            r16 = r13
            r12 = 57
            r14 = 52
            r17 = 52
            goto L_0x0057
        L_0x0435:
            r0 = 52
            pushBackTrackState(r7, r0, r13)
            popProgState(r22)
            int r13 = r13 + 4
            int r2 = getOffset(r9, r13)
            int r13 = r13 + r2
            int r11 = r13 + 1
            byte r2 = r9[r13]
            goto L_0x03c4
        L_0x044a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BisFaceUploadContent.executeREBytecode(o.ZimDispatchPbGwFacade, java.lang.String, int):boolean");
    }

    private static boolean matchRegExp(ZimDispatchPbGwFacade zimDispatchPbGwFacade, MapStringString mapStringString, String str, int i, int i2, boolean z) {
        if (mapStringString.parenCount != 0) {
            zimDispatchPbGwFacade.setMax = new long[mapStringString.parenCount];
        } else {
            zimDispatchPbGwFacade.setMax = null;
        }
        zimDispatchPbGwFacade.isInside = null;
        zimDispatchPbGwFacade.toFloatRange = null;
        zimDispatchPbGwFacade.getMax = z || (mapStringString.flags & 4) != 0;
        zimDispatchPbGwFacade.length = mapStringString;
        int i3 = zimDispatchPbGwFacade.length.anchorCh;
        int i4 = i;
        while (i4 <= i2) {
            if (i3 >= 0) {
                while (i4 != i2) {
                    char charAt = str.charAt(i4);
                    if (charAt != i3 && ((zimDispatchPbGwFacade.length.flags & 2) == 0 || upcase(charAt) != upcase((char) i3))) {
                        i4++;
                    }
                }
                return false;
            }
            zimDispatchPbGwFacade.setMin = i4;
            zimDispatchPbGwFacade.getMin = i4 - i;
            for (int i5 = 0; i5 < mapStringString.parenCount; i5++) {
                zimDispatchPbGwFacade.setMax[i5] = -1;
            }
            boolean executeREBytecode = executeREBytecode(zimDispatchPbGwFacade, str, i2);
            zimDispatchPbGwFacade.isInside = null;
            zimDispatchPbGwFacade.toFloatRange = null;
            if (executeREBytecode) {
                return true;
            }
            if (i3 != -2 || zimDispatchPbGwFacade.getMax) {
                i4 = zimDispatchPbGwFacade.getMin + i + 1;
            } else {
                zimDispatchPbGwFacade.getMin = i2;
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object executeRegExp(SecureQwertyKeyboard.AnonymousClass1 r20, LogUtils logUtils, initStandard initstandard, String str, int[] iArr, int i) {
        LogUtils logUtils2;
        Object obj;
        int i2;
        int i3;
        int i4;
        initStandard initstandard2 = initstandard;
        String str2 = str;
        int i5 = i;
        ZimDispatchPbGwFacade zimDispatchPbGwFacade = new ZimDispatchPbGwFacade();
        int i6 = iArr[0];
        int length = str.length();
        int i7 = i6 > length ? length : i6;
        ZimInitGwRequest zimInitGwRequest = null;
        if (matchRegExp(zimDispatchPbGwFacade, this.re, str, i7, length, initstandard2.setMax)) {
            int i8 = zimDispatchPbGwFacade.setMin;
            iArr[0] = i8;
            int i9 = i8 - (zimDispatchPbGwFacade.getMin + i7);
            int i10 = i8 - i9;
            if (i5 == 0) {
                logUtils2 = null;
                obj = Boolean.TRUE;
            } else {
                Object max = SecureQwertyKeyboard.AnonymousClass1.getMax(logUtils, 0);
                logUtils2 = (LogUtils) max;
                logUtils2.put(0, logUtils2, (Object) str2.substring(i10, i10 + i9));
                obj = max;
            }
            if (this.re.parenCount == 0) {
                initstandard2.length = null;
                initstandard2.setMin = new ZimInitGwRequest();
                i3 = i8;
                i2 = length;
            } else {
                initstandard2.length = new ZimInitGwRequest[this.re.parenCount];
                int i11 = 0;
                while (i11 < this.re.parenCount) {
                    int i12 = length;
                    int i13 = (int) zimDispatchPbGwFacade.setMax[i11];
                    if (i13 != -1) {
                        i4 = i8;
                        ZimInitGwRequest zimInitGwRequest2 = new ZimInitGwRequest(str2, i13, (int) (zimDispatchPbGwFacade.setMax[i11] >>> 32));
                        initstandard2.length[i11] = zimInitGwRequest2;
                        if (i5 != 0) {
                            logUtils2.put(i11 + 1, logUtils2, (Object) zimInitGwRequest2.toString());
                        }
                        zimInitGwRequest = zimInitGwRequest2;
                    } else {
                        i4 = i8;
                        if (i5 != 0) {
                            logUtils2.put(i11 + 1, logUtils2, checkOpen.instance);
                        }
                    }
                    i11++;
                    i8 = i4;
                    length = i12;
                }
                i3 = i8;
                i2 = length;
                initstandard2.setMin = zimInitGwRequest;
            }
            if (i5 != 0) {
                logUtils2.put("index", logUtils2, (Object) Integer.valueOf(zimDispatchPbGwFacade.getMin + i7));
                logUtils2.put("input", logUtils2, (Object) str2);
            }
            if (initstandard2.getMax == null) {
                initstandard2.getMax = new ZimInitGwRequest();
                initstandard2.IsOverlapping = new ZimInitGwRequest();
                initstandard2.isInside = new ZimInitGwRequest();
            }
            initstandard2.getMax.getMin = str2;
            initstandard2.getMax.setMax = i10;
            initstandard2.getMax.getMax = i9;
            initstandard2.IsOverlapping.getMin = str2;
            if (r20.IsOverlapping == 120) {
                initstandard2.IsOverlapping.setMax = i7;
                initstandard2.IsOverlapping.getMax = zimDispatchPbGwFacade.getMin;
            } else {
                initstandard2.IsOverlapping.setMax = 0;
                initstandard2.IsOverlapping.getMax = i7 + zimDispatchPbGwFacade.getMin;
            }
            initstandard2.isInside.getMin = str2;
            int i14 = i3;
            initstandard2.isInside.setMax = i14;
            initstandard2.isInside.getMax = i2 - i14;
            return obj;
        } else if (i5 != 2) {
            return null;
        } else {
            return checkOpen.instance;
        }
    }

    /* access modifiers changed from: package-private */
    public int getFlags() {
        return this.re.flags;
    }

    private static void reportWarning(SecureQwertyKeyboard.AnonymousClass1 r1, String str, String str2) {
        if (r1.getMax(11)) {
            SecureQwertyKeyboard.AnonymousClass1.getMin(LogItem.getMin(str, (Object) str2));
        }
    }

    private static void reportError(String str, String str2) {
        throw LogItem.setMin("SyntaxError", LogItem.getMin(str, (Object) str2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int findInstanceIdInfo(java.lang.String r9) {
        /*
            r8 = this;
            int r0 = r9.length()
            r1 = 5
            r2 = 2
            r3 = 1
            r4 = 4
            r5 = 3
            r6 = 0
            r7 = 6
            if (r0 != r7) goto L_0x0021
            char r0 = r9.charAt(r6)
            r7 = 103(0x67, float:1.44E-43)
            if (r0 != r7) goto L_0x0019
            java.lang.String r0 = "global"
            r7 = 3
            goto L_0x0043
        L_0x0019:
            r7 = 115(0x73, float:1.61E-43)
            if (r0 != r7) goto L_0x0041
            java.lang.String r0 = "source"
            r7 = 2
            goto L_0x0043
        L_0x0021:
            r7 = 9
            if (r0 != r7) goto L_0x0039
            char r0 = r9.charAt(r6)
            r7 = 108(0x6c, float:1.51E-43)
            if (r0 != r7) goto L_0x0031
            java.lang.String r0 = "lastIndex"
            r7 = 1
            goto L_0x0043
        L_0x0031:
            r7 = 109(0x6d, float:1.53E-43)
            if (r0 != r7) goto L_0x0041
            java.lang.String r0 = "multiline"
            r7 = 5
            goto L_0x0043
        L_0x0039:
            r7 = 10
            if (r0 != r7) goto L_0x0041
            java.lang.String r0 = "ignoreCase"
            r7 = 4
            goto L_0x0043
        L_0x0041:
            r0 = 0
            r7 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x004e
            if (r0 == r9) goto L_0x004e
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r6 = r7
        L_0x004f:
            if (r6 != 0) goto L_0x0056
            int r9 = super.findInstanceIdInfo((java.lang.String) r9)
            return r9
        L_0x0056:
            if (r6 == r3) goto L_0x0069
            if (r6 == r2) goto L_0x0067
            if (r6 == r5) goto L_0x0067
            if (r6 == r4) goto L_0x0067
            if (r6 != r1) goto L_0x0061
            goto L_0x0067
        L_0x0061:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>()
            throw r9
        L_0x0067:
            r9 = 7
            goto L_0x006b
        L_0x0069:
            int r9 = r8.lastIndexAttr
        L_0x006b:
            int r9 = instanceIdInfo(r9, r6)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BisFaceUploadContent.findInstanceIdInfo(java.lang.String):int");
    }

    public String getInstanceIdName(int i) {
        if (i == 1) {
            return "lastIndex";
        }
        if (i == 2) {
            return "source";
        }
        if (i == 3) {
            return "global";
        }
        if (i != 4) {
            return i != 5 ? super.getInstanceIdName(i) : "multiline";
        }
        return "ignoreCase";
    }

    public Object getInstanceIdValue(int i) {
        boolean z = true;
        if (i == 1) {
            return this.lastIndex;
        }
        if (i == 2) {
            return new String(this.re.source);
        }
        if (i == 3) {
            if ((this.re.flags & 1) == 0) {
                z = false;
            }
            return LogItem.getMin(z);
        } else if (i == 4) {
            if ((this.re.flags & 2) == 0) {
                z = false;
            }
            return LogItem.getMin(z);
        } else if (i != 5) {
            return super.getInstanceIdValue(i);
        } else {
            if ((this.re.flags & 4) == 0) {
                z = false;
            }
            return LogItem.getMin(z);
        }
    }

    public void setInstanceIdValue(int i, Object obj) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1735909648, oncanceled);
            onCancelLoad.getMin(-1735909648, oncanceled);
        }
        if (i == 1) {
            this.lastIndex = obj;
        } else if (i != 2 && i != 3 && i != 4 && i != 5) {
            super.setInstanceIdValue(i, obj);
        }
    }

    public void setInstanceIdAttributes(int i, int i2) {
        if (i != 1) {
            super.setInstanceIdAttributes(i, i2);
        } else {
            this.lastIndexAttr = i2;
        }
    }

    public void initPrototypeId(int i) {
        String str;
        String str2;
        int max = dispatchOnCancelled.setMax(i);
        int i2 = 1;
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-2107766750, oncanceled);
            onCancelLoad.getMin(-2107766750, oncanceled);
        }
        switch (i) {
            case 1:
                i2 = 2;
                str = "compile";
                break;
            case 2:
                str2 = "toString";
                break;
            case 3:
                str2 = "toSource";
                break;
            case 4:
                str = "exec";
                break;
            case 5:
                str = "test";
                break;
            case 6:
                str = "prefix";
                break;
            default:
                throw new IllegalArgumentException(String.valueOf(i));
        }
        str = str2;
        i2 = 0;
        initPrototypeMethod(REGEXP_TAG, i, str, i2);
    }

    public Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r3, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (!editTextUtil.hasTag(REGEXP_TAG)) {
            return super.execIdCall(editTextUtil, r3, logUtils, logUtils2, objArr);
        }
        int methodId = editTextUtil.methodId();
        switch (methodId) {
            case 1:
                return realThis(logUtils2, editTextUtil).compile(r3, logUtils, objArr);
            case 2:
            case 3:
                return realThis(logUtils2, editTextUtil).toString();
            case 4:
                return realThis(logUtils2, editTextUtil).execSub(r3, logUtils, objArr, 1);
            case 5:
                return Boolean.TRUE.equals(realThis(logUtils2, editTextUtil).execSub(r3, logUtils, objArr, 0)) ? Boolean.TRUE : Boolean.FALSE;
            case 6:
                return realThis(logUtils2, editTextUtil).execSub(r3, logUtils, objArr, 2);
            default:
                throw new IllegalArgumentException(String.valueOf(methodId));
        }
    }

    private static BisFaceUploadContent realThis(LogUtils logUtils, EditTextUtil editTextUtil) {
        if (logUtils instanceof BisFaceUploadContent) {
            return (BisFaceUploadContent) logUtils;
        }
        throw incompatibleCallError(editTextUtil);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0045 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int findPrototypeId(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r7.length()
            r1 = 116(0x74, float:1.63E-43)
            r2 = 3
            r3 = 6
            r4 = 4
            r5 = 0
            if (r0 == r4) goto L_0x002f
            if (r0 == r3) goto L_0x002b
            r3 = 7
            if (r0 == r3) goto L_0x0027
            r3 = 8
            if (r0 == r3) goto L_0x0016
            goto L_0x0041
        L_0x0016:
            char r0 = r7.charAt(r2)
            r3 = 111(0x6f, float:1.56E-43)
            if (r0 != r3) goto L_0x0021
            java.lang.String r0 = "toSource"
            goto L_0x0043
        L_0x0021:
            if (r0 != r1) goto L_0x0041
            r2 = 2
            java.lang.String r0 = "toString"
            goto L_0x0043
        L_0x0027:
            r2 = 1
            java.lang.String r0 = "compile"
            goto L_0x0043
        L_0x002b:
            java.lang.String r0 = "prefix"
            r2 = 6
            goto L_0x0043
        L_0x002f:
            char r0 = r7.charAt(r5)
            r2 = 101(0x65, float:1.42E-43)
            if (r0 != r2) goto L_0x003b
            java.lang.String r0 = "exec"
            r2 = 4
            goto L_0x0043
        L_0x003b:
            if (r0 != r1) goto L_0x0041
            r2 = 5
            java.lang.String r0 = "test"
            goto L_0x0043
        L_0x0041:
            r0 = 0
            r2 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x004e
            if (r0 == r7) goto L_0x004e
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r5 = r2
        L_0x004f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BisFaceUploadContent.findPrototypeId(java.lang.String):int");
    }
}
