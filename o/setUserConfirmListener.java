package o;

import com.google.common.base.Ascii;
import java.io.Serializable;
import kotlin.jvm.internal.CharCompanionObject;
import o.SafeInputWidget;
import o.SecureQwertyKeyboard;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.TopLevel;

public final class setUserConfirmListener implements Serializable, printExceptionStackTrace {
    private static final Object FTAG = "Global";
    private static final int INVALID_UTF8 = Integer.MAX_VALUE;
    private static final int Id_decodeURI = 1;
    private static final int Id_decodeURIComponent = 2;
    private static final int Id_encodeURI = 3;
    private static final int Id_encodeURIComponent = 4;
    private static final int Id_escape = 5;
    private static final int Id_eval = 6;
    private static final int Id_isFinite = 7;
    private static final int Id_isNaN = 8;
    private static final int Id_isXMLName = 9;
    private static final int Id_new_CommonError = 14;
    private static final int Id_parseFloat = 10;
    private static final int Id_parseInt = 11;
    private static final int Id_unescape = 12;
    private static final int Id_uneval = 13;
    private static final int LAST_SCOPE_FUNCTION_ID = 13;
    private static final String URI_DECODE_RESERVED = ";/?:@&=+$,#";
    static final long serialVersionUID = 6080442165748707530L;

    private static int unHex(char c) {
        char c2 = 'A';
        if ('A' > c || c > 'F') {
            c2 = 'a';
            if ('a' > c || c > 'f') {
                if ('0' > c || c > '9') {
                    return -1;
                }
                return c - '0';
            }
        }
        return (c - c2) + 10;
    }

    public static void init(SecureQwertyKeyboard.AnonymousClass1 r16, LogUtils logUtils, boolean z) {
        int i;
        String str;
        String str2;
        LogUtils logUtils2 = logUtils;
        setUserConfirmListener setuserconfirmlistener = new setUserConfirmListener();
        for (int i2 = 1; i2 <= 13; i2++) {
            switch (i2) {
                case 1:
                    str2 = "decodeURI";
                    break;
                case 2:
                    str2 = "decodeURIComponent";
                    break;
                case 3:
                    str2 = "encodeURI";
                    break;
                case 4:
                    str2 = "encodeURIComponent";
                    break;
                case 5:
                    str2 = "escape";
                    break;
                case 6:
                    str2 = "eval";
                    break;
                case 7:
                    str2 = "isFinite";
                    break;
                case 8:
                    str2 = "isNaN";
                    break;
                case 9:
                    str2 = "isXMLName";
                    break;
                case 10:
                    str2 = "parseFloat";
                    break;
                case 11:
                    str = "parseInt";
                    i = 2;
                    break;
                case 12:
                    str2 = "unescape";
                    break;
                case 13:
                    str2 = "uneval";
                    break;
                default:
                    throw getStyleId.setMin();
            }
            str = str2;
            i = 1;
            EditTextUtil editTextUtil = new EditTextUtil(setuserconfirmlistener, FTAG, i2, str, i, logUtils);
            if (z) {
                editTextUtil.sealObject();
            }
            editTextUtil.exportAsScopeProperty();
        }
        ScriptableObject.defineProperty(logUtils2, "NaN", LogItem.b, 7);
        ScriptableObject.defineProperty(logUtils2, "Infinity", LogItem.getMax(Double.POSITIVE_INFINITY), 7);
        ScriptableObject.defineProperty(logUtils2, "undefined", checkOpen.instance, 7);
        for (TopLevel.NativeErrors nativeErrors : TopLevel.NativeErrors.values()) {
            if (nativeErrors != TopLevel.NativeErrors.Error) {
                String name = nativeErrors.name();
                ScriptableObject scriptableObject = (ScriptableObject) LogItem.getMin(r16, logUtils2, TopLevel.Builtins.Error, LogItem.create);
                scriptableObject.put("name", (LogUtils) scriptableObject, (Object) name);
                scriptableObject.put("message", (LogUtils) scriptableObject, (Object) "");
                EditTextUtil editTextUtil2 = new EditTextUtil(setuserconfirmlistener, FTAG, 14, name, 1, logUtils);
                editTextUtil2.markAsConstructor(scriptableObject);
                scriptableObject.put("constructor", (LogUtils) scriptableObject, (Object) editTextUtil2);
                scriptableObject.setAttributes("constructor", 2);
                if (z) {
                    scriptableObject.sealObject();
                    editTextUtil2.sealObject();
                }
                editTextUtil2.exportAsScopeProperty();
            } else {
                SecureQwertyKeyboard.AnonymousClass1 r13 = r16;
            }
        }
    }

    public final Object execIdCall(EditTextUtil editTextUtil, SecureQwertyKeyboard.AnonymousClass1 r4, LogUtils logUtils, LogUtils logUtils2, Object[] objArr) {
        if (editTextUtil.hasTag(FTAG)) {
            int methodId = editTextUtil.methodId();
            boolean z = true;
            switch (methodId) {
                case 1:
                case 2:
                    String min = LogItem.getMin(objArr);
                    if (methodId != 1) {
                        z = false;
                    }
                    return decode(min, z);
                case 3:
                case 4:
                    String min2 = LogItem.getMin(objArr);
                    if (methodId != 3) {
                        z = false;
                    }
                    return encode(min2, z);
                case 5:
                    return js_escape(objArr);
                case 6:
                    return js_eval(r4, logUtils, objArr);
                case 7:
                    if (objArr.length <= 0) {
                        return Boolean.FALSE;
                    }
                    return SafeInputWidget.AnonymousClass3.isFinite(objArr[0]);
                case 8:
                    if (objArr.length > 0) {
                        double max = LogItem.getMax(objArr[0]);
                        if (max == max) {
                            z = false;
                        }
                    }
                    return LogItem.getMin(z);
                case 9:
                    return LogItem.getMin(ZimValidateGwResponse.extractFromScope(logUtils).isXMLName(r4, objArr.length == 0 ? checkOpen.instance : objArr[0]));
                case 10:
                    return js_parseFloat(objArr);
                case 11:
                    return js_parseInt(objArr);
                case 12:
                    return js_unescape(objArr);
                case 13:
                    return LogItem.length(r4, logUtils, objArr.length != 0 ? objArr[0] : checkOpen.instance);
                case 14:
                    return CenterTextView.make(r4, logUtils, editTextUtil, objArr);
            }
        }
        throw editTextUtil.unknown();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r3 != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Object js_parseInt(java.lang.Object[] r11) {
        /*
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object[]) r11)
            r1 = 1
            int r11 = o.LogItem.setMax((java.lang.Object[]) r11, (int) r1)
            int r2 = r0.length()
            if (r2 != 0) goto L_0x0012
            java.lang.Double r11 = o.LogItem.b
            return r11
        L_0x0012:
            r3 = 0
            r4 = 0
        L_0x0014:
            char r5 = r0.charAt(r4)
            boolean r6 = o.LogItem.setMax((int) r5)
            if (r6 == 0) goto L_0x0022
            int r4 = r4 + 1
            if (r4 < r2) goto L_0x0014
        L_0x0022:
            r6 = 43
            if (r5 == r6) goto L_0x002d
            r6 = 45
            if (r5 != r6) goto L_0x002b
            r3 = 1
        L_0x002b:
            if (r3 == 0) goto L_0x002f
        L_0x002d:
            int r4 = r4 + 1
        L_0x002f:
            r5 = 88
            r6 = 120(0x78, float:1.68E-43)
            r7 = 16
            r8 = -1
            r9 = 48
            if (r11 != 0) goto L_0x003c
            r11 = -1
            goto L_0x005c
        L_0x003c:
            r10 = 2
            if (r11 < r10) goto L_0x0091
            r10 = 36
            if (r11 <= r10) goto L_0x0044
            goto L_0x0091
        L_0x0044:
            if (r11 != r7) goto L_0x005c
            int r10 = r2 - r4
            if (r10 <= r1) goto L_0x005c
            char r10 = r0.charAt(r4)
            if (r10 != r9) goto L_0x005c
            int r10 = r4 + 1
            char r10 = r0.charAt(r10)
            if (r10 == r6) goto L_0x005a
            if (r10 != r5) goto L_0x005c
        L_0x005a:
            int r4 = r4 + 2
        L_0x005c:
            if (r11 != r8) goto L_0x0084
            r11 = 10
            int r2 = r2 - r4
            if (r2 <= r1) goto L_0x0081
            char r1 = r0.charAt(r4)
            if (r1 != r9) goto L_0x0081
            int r1 = r4 + 1
            char r2 = r0.charAt(r1)
            if (r2 == r6) goto L_0x007e
            if (r2 != r5) goto L_0x0074
            goto L_0x007e
        L_0x0074:
            if (r9 > r2) goto L_0x0081
            r5 = 57
            if (r2 > r5) goto L_0x0081
            r7 = 8
            r4 = r1
            goto L_0x0085
        L_0x007e:
            int r4 = r4 + 2
            goto L_0x0085
        L_0x0081:
            r7 = 10
            goto L_0x0085
        L_0x0084:
            r7 = r11
        L_0x0085:
            double r0 = o.LogItem.getMax((java.lang.String) r0, (int) r4, (int) r7)
            if (r3 == 0) goto L_0x008c
            double r0 = -r0
        L_0x008c:
            java.lang.Number r11 = o.LogItem.getMax((double) r0)
            return r11
        L_0x0091:
            java.lang.Double r11 = o.LogItem.b
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setUserConfirmListener.js_parseInt(java.lang.Object[]):java.lang.Object");
    }

    static Object js_parseFloat(Object[] objArr) {
        int i;
        if (objArr.length <= 0) {
            return LogItem.b;
        }
        boolean z = false;
        String min = LogItem.getMin(objArr[0]);
        int length = min.length();
        int i2 = 0;
        while (i2 != length) {
            char charAt = min.charAt(i2);
            if (LogItem.setMax((int) charAt)) {
                i2++;
            } else {
                if (charAt == '+' || charAt == '-') {
                    int i3 = i2 + 1;
                    if (i3 == length) {
                        return LogItem.b;
                    }
                    i = i3;
                    charAt = min.charAt(i3);
                } else {
                    i = i2;
                }
                if (charAt != 'I') {
                    int i4 = -1;
                    int i5 = -1;
                    while (true) {
                        if (i < length) {
                            char charAt2 = min.charAt(i);
                            if (charAt2 != '+') {
                                if (charAt2 == 'E' || charAt2 == 'e') {
                                    if (i4 == -1 && i != length - 1) {
                                        i4 = i;
                                        i++;
                                    }
                                } else if (charAt2 != '-') {
                                    if (charAt2 != '.') {
                                        switch (charAt2) {
                                            case '0':
                                            case '1':
                                            case '2':
                                            case '3':
                                            case '4':
                                            case '5':
                                            case '6':
                                            case '7':
                                            case '8':
                                            case '9':
                                                if (i4 != -1) {
                                                    z = true;
                                                    break;
                                                } else {
                                                    continue;
                                                }
                                        }
                                    } else if (i5 == -1) {
                                        i5 = i;
                                        i++;
                                    }
                                }
                            }
                            if (i4 == i - 1) {
                                if (i == length - 1) {
                                    i--;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                    if (i4 == -1 || z) {
                        i4 = i;
                    }
                    try {
                        return Double.valueOf(min.substring(i2, i4));
                    } catch (NumberFormatException unused) {
                        return LogItem.b;
                    }
                } else if (i + 8 > length || !min.regionMatches(i, "Infinity", 0, 8)) {
                    return LogItem.b;
                } else {
                    return LogItem.getMax(min.charAt(i2) == '-' ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
                }
            }
        }
        return LogItem.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if ((r12 & -8) == 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object js_escape(java.lang.Object[] r12) {
        /*
            r11 = this;
            java.lang.String r0 = o.LogItem.getMin((java.lang.Object[]) r12)
            int r1 = r12.length
            r2 = 1
            if (r1 <= r2) goto L_0x0024
            r12 = r12[r2]
            double r3 = o.LogItem.getMax((java.lang.Object) r12)
            int r12 = (r3 > r3 ? 1 : (r3 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x001d
            int r12 = (int) r3
            double r5 = (double) r12
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x001d
            r1 = r12 & -8
            if (r1 != 0) goto L_0x001d
            goto L_0x0025
        L_0x001d:
            java.lang.String r12 = "msg.bad.esc.mask"
            org.mozilla.javascript.EvaluatorException r12 = o.SecureQwertyKeyboard.AnonymousClass1.setMin((java.lang.String) r12)
            throw r12
        L_0x0024:
            r12 = 7
        L_0x0025:
            r1 = 0
            r3 = 0
            int r4 = r0.length()
        L_0x002b:
            if (r3 == r4) goto L_0x00bd
            char r5 = r0.charAt(r3)
            r6 = 43
            if (r12 == 0) goto L_0x0072
            r7 = 48
            if (r5 < r7) goto L_0x003d
            r7 = 57
            if (r5 <= r7) goto L_0x006b
        L_0x003d:
            r7 = 65
            if (r5 < r7) goto L_0x0045
            r7 = 90
            if (r5 <= r7) goto L_0x006b
        L_0x0045:
            r7 = 97
            if (r5 < r7) goto L_0x004d
            r7 = 122(0x7a, float:1.71E-43)
            if (r5 <= r7) goto L_0x006b
        L_0x004d:
            r7 = 64
            if (r5 == r7) goto L_0x006b
            r7 = 42
            if (r5 == r7) goto L_0x006b
            r7 = 95
            if (r5 == r7) goto L_0x006b
            r7 = 45
            if (r5 == r7) goto L_0x006b
            r7 = 46
            if (r5 == r7) goto L_0x006b
            r7 = r12 & 4
            if (r7 == 0) goto L_0x0072
            r7 = 47
            if (r5 == r7) goto L_0x006b
            if (r5 != r6) goto L_0x0072
        L_0x006b:
            if (r1 == 0) goto L_0x00b9
            char r5 = (char) r5
            r1.append(r5)
            goto L_0x00b9
        L_0x0072:
            if (r1 != 0) goto L_0x0081
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r7 = r4 + 3
            r1.<init>(r7)
            r1.append(r0)
            r1.setLength(r3)
        L_0x0081:
            r7 = 256(0x100, float:3.59E-43)
            r8 = 2
            r9 = 37
            r10 = 4
            if (r5 >= r7) goto L_0x0097
            r7 = 32
            if (r5 != r7) goto L_0x0093
            if (r12 != r8) goto L_0x0093
            r1.append(r6)
            goto L_0x00b9
        L_0x0093:
            r1.append(r9)
            goto L_0x00a0
        L_0x0097:
            r1.append(r9)
            r6 = 117(0x75, float:1.64E-43)
            r1.append(r6)
            r8 = 4
        L_0x00a0:
            int r8 = r8 - r2
            int r8 = r8 * 4
        L_0x00a3:
            if (r8 < 0) goto L_0x00b9
            int r6 = r5 >> r8
            r6 = r6 & 15
            r7 = 10
            if (r6 >= r7) goto L_0x00b0
            int r6 = r6 + 48
            goto L_0x00b2
        L_0x00b0:
            int r6 = r6 + 55
        L_0x00b2:
            char r6 = (char) r6
            r1.append(r6)
            int r8 = r8 + -4
            goto L_0x00a3
        L_0x00b9:
            int r3 = r3 + 1
            goto L_0x002b
        L_0x00bd:
            if (r1 != 0) goto L_0x00c0
            return r0
        L_0x00c0:
            java.lang.String r12 = r1.toString()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setUserConfirmListener.js_escape(java.lang.Object[]):java.lang.Object");
    }

    private Object js_unescape(Object[] objArr) {
        int i;
        int i2;
        String min = LogItem.getMin(objArr);
        int indexOf = min.indexOf(37);
        if (indexOf < 0) {
            return min;
        }
        int length = min.length();
        char[] charArray = min.toCharArray();
        int i3 = indexOf;
        while (true) {
            int i4 = 0;
            if (indexOf == length) {
                return new String(charArray, 0, i3);
            }
            char c = charArray[indexOf];
            indexOf++;
            if (c == '%' && indexOf != length) {
                if (charArray[indexOf] == 'u') {
                    i2 = indexOf + 1;
                    i = indexOf + 5;
                } else {
                    i = indexOf + 2;
                    i2 = indexOf;
                }
                if (i <= length) {
                    while (i2 != i) {
                        i4 = getStyleId.setMax((int) charArray[i2], i4);
                        i2++;
                    }
                    if (i4 >= 0) {
                        c = (char) i4;
                        indexOf = i;
                    }
                }
            }
            charArray[i3] = c;
            i3++;
        }
    }

    private Object js_eval(SecureQwertyKeyboard.AnonymousClass1 r7, LogUtils logUtils, Object[] objArr) {
        LogUtils topLevelScope = ScriptableObject.getTopLevelScope(logUtils);
        return LogItem.setMax(r7, topLevelScope, topLevelScope, objArr, "eval code", 1);
    }

    static boolean isEvalFunction(Object obj) {
        if (!(obj instanceof EditTextUtil)) {
            return false;
        }
        EditTextUtil editTextUtil = (EditTextUtil) obj;
        return editTextUtil.hasTag(FTAG) && editTextUtil.methodId() == 6;
    }

    @Deprecated
    public static EcmaError constructError(SecureQwertyKeyboard.AnonymousClass1 r0, String str, String str2, LogUtils logUtils) {
        return LogItem.setMin(str, str2);
    }

    @Deprecated
    public static EcmaError constructError(SecureQwertyKeyboard.AnonymousClass1 r6, String str, String str2, LogUtils logUtils, String str3, int i, int i2, String str4) {
        return LogItem.getMax(str, str2, str3, i, str4, i2);
    }

    private static String encode(String str, boolean z) {
        int length = str.length();
        StringBuilder sb = null;
        byte[] bArr = null;
        int i = 0;
        while (i != length) {
            char charAt = str.charAt(i);
            if (!encodeUnescaped(charAt, z)) {
                if (sb == null) {
                    sb = new StringBuilder(length + 3);
                    sb.append(str);
                    sb.setLength(i);
                    bArr = new byte[6];
                }
                if (56320 > charAt || charAt > 57343) {
                    char c = charAt;
                    if (charAt >= 55296) {
                        c = charAt;
                        if (56319 >= charAt) {
                            i++;
                            if (i != length) {
                                char charAt2 = str.charAt(i);
                                if (56320 > charAt2 || charAt2 > 57343) {
                                    throw uriError();
                                }
                                c = ((charAt - 55296) << 10) + (charAt2 - CharCompanionObject.MIN_LOW_SURROGATE) + 65536;
                            } else {
                                throw uriError();
                            }
                        }
                    }
                    int oneUcs4ToUtf8Char = oneUcs4ToUtf8Char(bArr, c);
                    for (int i2 = 0; i2 < oneUcs4ToUtf8Char; i2++) {
                        byte b = bArr[i2] & 255;
                        sb.append('%');
                        sb.append(toHexChar(b >>> 4));
                        sb.append(toHexChar(b & Ascii.SI));
                    }
                } else {
                    throw uriError();
                }
            } else if (sb != null) {
                sb.append(charAt);
            }
            i++;
        }
        if (sb == null) {
            return str;
        }
        return sb.toString();
    }

    private static char toHexChar(int i) {
        if ((i >> 4) != 0) {
            getStyleId.setMin();
        }
        return (char) (i < 10 ? i + 48 : (i - 10) + 65);
    }

    private static int unHex(char c, char c2) {
        int unHex = unHex(c);
        int unHex2 = unHex(c2);
        if (unHex < 0 || unHex2 < 0) {
            return -1;
        }
        return (unHex << 4) | unHex2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0101 A[LOOP:2: B:68:0x0101->B:69:0x0103, LOOP_START, PHI: r4 r5 
      PHI: (r4v5 int) = (r4v1 int), (r4v6 int) binds: [B:67:0x00ff, B:69:0x0103] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v7 int) = (r5v4 int), (r5v8 int) binds: [B:67:0x00ff, B:69:0x0103] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String decode(java.lang.String r16, boolean r17) {
        /*
            r0 = r16
            int r1 = r16.length()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000a:
            if (r4 == r1) goto L_0x0130
            char r6 = r0.charAt(r4)
            r7 = 37
            if (r6 == r7) goto L_0x001e
            if (r3 == 0) goto L_0x001b
            int r7 = r5 + 1
            r3[r5] = r6
            r5 = r7
        L_0x001b:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x001e:
            if (r3 != 0) goto L_0x0026
            char[] r3 = new char[r1]
            r0.getChars(r2, r4, r3, r2)
            r5 = r4
        L_0x0026:
            int r6 = r4 + 3
            if (r6 > r1) goto L_0x012b
            int r8 = r4 + 1
            char r8 = r0.charAt(r8)
            int r9 = r4 + 2
            char r9 = r0.charAt(r9)
            int r8 = unHex(r8, r9)
            if (r8 < 0) goto L_0x0126
            r9 = r8 & 128(0x80, float:1.794E-43)
            if (r9 != 0) goto L_0x0043
        L_0x0040:
            char r7 = (char) r8
            goto L_0x00f7
        L_0x0043:
            r9 = r8 & 192(0xc0, float:2.69E-43)
            r10 = 128(0x80, float:1.794E-43)
            if (r9 == r10) goto L_0x0121
            r9 = r8 & 32
            r11 = 65536(0x10000, float:9.18355E-41)
            if (r9 != 0) goto L_0x0055
            r8 = r8 & 31
            r9 = 1
            r12 = 128(0x80, float:1.794E-43)
            goto L_0x0082
        L_0x0055:
            r9 = r8 & 16
            if (r9 != 0) goto L_0x0062
            r8 = r8 & 15
            r9 = 2048(0x800, float:2.87E-42)
            r12 = 2
            r9 = 2
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0062:
            r9 = r8 & 8
            if (r9 != 0) goto L_0x006c
            r8 = r8 & 7
            r9 = 3
            r12 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0082
        L_0x006c:
            r9 = r8 & 4
            if (r9 != 0) goto L_0x0079
            r8 = r8 & 3
            r9 = 2097152(0x200000, float:2.938736E-39)
            r12 = 4
            r9 = 4
            r12 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x0082
        L_0x0079:
            r9 = r8 & 2
            if (r9 != 0) goto L_0x011c
            r9 = 5
            r8 = r8 & 1
            r12 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x0082:
            int r13 = r9 * 3
            int r13 = r13 + r6
            if (r13 > r1) goto L_0x0117
            r13 = 0
        L_0x0088:
            if (r13 == r9) goto L_0x00ba
            char r14 = r0.charAt(r6)
            if (r14 != r7) goto L_0x00b5
            int r14 = r6 + 1
            char r14 = r0.charAt(r14)
            int r15 = r6 + 2
            char r15 = r0.charAt(r15)
            int r14 = unHex(r14, r15)
            if (r14 < 0) goto L_0x00b0
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r10) goto L_0x00b0
            int r8 = r8 << 6
            r14 = r14 & 63
            r8 = r8 | r14
            int r6 = r6 + 3
            int r13 = r13 + 1
            goto L_0x0088
        L_0x00b0:
            org.mozilla.javascript.EcmaError r0 = uriError()
            throw r0
        L_0x00b5:
            org.mozilla.javascript.EcmaError r0 = uriError()
            throw r0
        L_0x00ba:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r12) goto L_0x00d5
            if (r8 < r7) goto L_0x00c7
            r9 = 57343(0xdfff, float:8.0355E-41)
            if (r8 > r9) goto L_0x00c7
            goto L_0x00d5
        L_0x00c7:
            r9 = 65534(0xfffe, float:9.1833E-41)
            if (r8 == r9) goto L_0x00d1
            r9 = 65535(0xffff, float:9.1834E-41)
            if (r8 != r9) goto L_0x00d8
        L_0x00d1:
            r8 = 65533(0xfffd, float:9.1831E-41)
            goto L_0x00d8
        L_0x00d5:
            r8 = 2147483647(0x7fffffff, float:NaN)
        L_0x00d8:
            if (r8 < r11) goto L_0x0040
            int r8 = r8 - r11
            r9 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 > r9) goto L_0x00f2
            int r9 = r8 >>> 10
            int r9 = r9 + r7
            char r7 = (char) r9
            r8 = r8 & 1023(0x3ff, float:1.434E-42)
            r9 = 56320(0xdc00, float:7.8921E-41)
            int r8 = r8 + r9
            char r8 = (char) r8
            int r9 = r5 + 1
            r3[r5] = r7
            r7 = r8
            r5 = r9
            goto L_0x00f7
        L_0x00f2:
            org.mozilla.javascript.EcmaError r0 = uriError()
            throw r0
        L_0x00f7:
            if (r17 == 0) goto L_0x010f
            java.lang.String r8 = ";/?:@&=+$,#"
            int r8 = r8.indexOf(r7)
            if (r8 < 0) goto L_0x010f
        L_0x0101:
            if (r4 == r6) goto L_0x0114
            int r7 = r5 + 1
            char r8 = r0.charAt(r4)
            r3[r5] = r8
            int r4 = r4 + 1
            r5 = r7
            goto L_0x0101
        L_0x010f:
            int r4 = r5 + 1
            r3[r5] = r7
            r5 = r4
        L_0x0114:
            r4 = r6
            goto L_0x000a
        L_0x0117:
            org.mozilla.javascript.EcmaError r0 = uriError()
            throw r0
        L_0x011c:
            org.mozilla.javascript.EcmaError r0 = uriError()
            throw r0
        L_0x0121:
            org.mozilla.javascript.EcmaError r0 = uriError()
            throw r0
        L_0x0126:
            org.mozilla.javascript.EcmaError r0 = uriError()
            throw r0
        L_0x012b:
            org.mozilla.javascript.EcmaError r0 = uriError()
            throw r0
        L_0x0130:
            if (r3 != 0) goto L_0x0133
            return r0
        L_0x0133:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setUserConfirmListener.decode(java.lang.String, boolean):java.lang.String");
    }

    private static boolean encodeUnescaped(char c, boolean z) {
        if (('A' > c || c > 'Z') && (('a' > c || c > 'z') && (('0' > c || c > '9') && "-_.!~*'()".indexOf(c) < 0))) {
            return z && URI_DECODE_RESERVED.indexOf(c) >= 0;
        }
        return true;
    }

    private static EcmaError uriError() {
        return LogItem.setMin("URIError", LogItem.getMax("msg.bad.uri"));
    }

    private static int oneUcs4ToUtf8Char(byte[] bArr, int i) {
        if ((i & -128) == 0) {
            bArr[0] = (byte) i;
            return 1;
        }
        int i2 = i >>> 11;
        int i3 = 2;
        while (i2 != 0) {
            i2 >>>= 5;
            i3++;
        }
        int i4 = i3;
        while (true) {
            i4--;
            if (i4 > 0) {
                bArr[i4] = (byte) ((i & 63) | 128);
                i >>>= 6;
            } else {
                bArr[0] = (byte) ((256 - (1 << (8 - i3))) + i);
                return i3;
            }
        }
    }
}
