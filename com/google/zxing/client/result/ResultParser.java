package com.google.zxing.client.result;

import android.text.TextUtils;
import com.alibaba.fastjson.parser.JSONLexer;
import com.google.zxing.Result;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.text.Typography;

public abstract class ResultParser {
    private static final Pattern AMPERSAND = Pattern.compile("&");
    private static final String BYTE_ORDER_MARK = "﻿";
    private static final Pattern DIGITS = Pattern.compile("\\d+");
    private static final Pattern EQUALS = Pattern.compile(SimpleComparison.EQUAL_TO_OPERATION);
    private static final ResultParser[] PARSERS = {new BookmarkDoCoMoResultParser(), new AddressBookDoCoMoResultParser(), new EmailDoCoMoResultParser(), new AddressBookAUResultParser(), new VCardResultParser(), new BizcardResultParser(), new VEventResultParser(), new EmailAddressResultParser(), new SMTPResultParser(), new TelResultParser(), new SMSMMSResultParser(), new SMSTOMMSTOResultParser(), new GeoResultParser(), new WifiResultParser(), new URLTOResultParser(), new URIResultParser(), new ISBNResultParser(), new ProductResultParser(), new ExpandedProductResultParser(), new VINResultParser()};
    private static char[] getMax = null;
    private static int getMin = 0;
    private static int isInside = 1;
    private static int length;
    private static boolean setMax;
    private static boolean setMin;

    static void setMax() {
        getMin = 259;
        setMax = true;
        setMin = true;
        getMax = new char[]{344, 343, 329, 304, 315};
    }

    public abstract ParsedResult parse(Result result);

    static {
        setMax();
        int i = length + 49;
        isInside = i % 128;
        if ((i % 2 == 0 ? 'T' : '\'') == 'T') {
            Object obj = null;
            super.hashCode();
        }
    }

    protected static String getMassagedText(Result result) {
        String str;
        int i = length + 3;
        isInside = i % 128;
        if (i % 2 == 0) {
            str = result.getText();
            boolean startsWith = str.startsWith(BYTE_ORDER_MARK);
            Object obj = null;
            super.hashCode();
            if (!startsWith) {
                return str;
            }
        } else {
            try {
                str = result.getText();
                if (!str.startsWith(BYTE_ORDER_MARK)) {
                    return str;
                }
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = isInside + 99;
        length = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return str.substring(1);
    }

    public static ParsedResult parseResult(Result result) {
        int i = length + 5;
        isInside = i % 128;
        int i2 = i % 2;
        ResultParser[] resultParserArr = PARSERS;
        int length2 = resultParserArr.length;
        int i3 = 0;
        while (true) {
            if ((i3 < length2 ? (char) 11 : 21) != 11) {
                return new TextParsedResult(result.getText(), (String) null);
            }
            ParsedResult parse = resultParserArr[i3].parse(result);
            if (!(parse == null)) {
                int i4 = isInside + 89;
                length = i4 % 128;
                int i5 = i4 % 2;
                return parse;
            }
            i3++;
        }
    }

    protected static void maybeAppend(String str, StringBuilder sb) {
        boolean z = true;
        if (!(str == null)) {
            sb.append(10);
            sb.append(str);
            int i = isInside + 95;
            length = i % 128;
            int i2 = i % 2;
        }
        try {
            int i3 = isInside + 75;
            length = i3 % 128;
            if (i3 % 2 == 0) {
                z = false;
            }
            if (z) {
                int i4 = 50 / 0;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    protected static void maybeAppend(String[] strArr, StringBuilder sb) {
        int i = length + 49;
        isInside = i % 128;
        int i2 = i % 2;
        if ((strArr != null ? (char) 0 : 9) != 9) {
            int i3 = isInside + 53;
            length = i3 % 128;
            if (i3 % 2 != 0) {
            }
            for (String append : strArr) {
                int i4 = isInside + 23;
                length = i4 % 128;
                int i5 = i4 % 2;
                sb.append(10);
                sb.append(append);
            }
        }
    }

    protected static String[] maybeWrap(String str) {
        String[] strArr = null;
        if (str == null) {
            try {
                int i = length + 95;
                isInside = i % 128;
                if ((i % 2 == 0 ? 6 : 'c') == 'c') {
                    return strArr;
                }
                int i2 = 76 / 0;
                return strArr;
            } catch (Exception e) {
                throw e;
            }
        } else {
            String[] strArr2 = {str};
            int i3 = length + 107;
            isInside = i3 % 128;
            if ((i3 % 2 == 0 ? '?' : '`') == '`') {
                return strArr2;
            }
            int length2 = strArr.length;
            return strArr2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r4 == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0052, code lost:
        if (r4 == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006e, code lost:
        if ((r7 != '\\' ? 21 : ' ') != 21) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (r7 != 'x') goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r3.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x007b, code lost:
        r4 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String unescapeBackslash(java.lang.String r9) {
        /*
            int r0 = isInside
            int r0 = r0 + 107
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            r0 = 92
            int r1 = r9.indexOf(r0)
            if (r1 >= 0) goto L_0x0013
            return r9
        L_0x0013:
            int r2 = r9.length()     // Catch:{ Exception -> 0x0083 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r4 = r2 + -1
            r3.<init>(r4)
            char[] r4 = r9.toCharArray()     // Catch:{ Exception -> 0x0081 }
            r5 = 0
            r3.append(r4, r5, r1)     // Catch:{ Exception -> 0x0081 }
            r4 = 0
        L_0x0027:
            r6 = 1
            if (r1 >= r2) goto L_0x002c
            r7 = 0
            goto L_0x002d
        L_0x002c:
            r7 = 1
        L_0x002d:
            if (r7 == 0) goto L_0x0034
            java.lang.String r9 = r3.toString()
            return r9
        L_0x0034:
            int r7 = isInside     // Catch:{ Exception -> 0x0083 }
            int r7 = r7 + 87
            int r8 = r7 % 128
            length = r8     // Catch:{ Exception -> 0x0083 }
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x0042
            r7 = 0
            goto L_0x0043
        L_0x0042:
            r7 = 1
        L_0x0043:
            if (r7 == 0) goto L_0x004c
            char r7 = r9.charAt(r1)
            if (r4 != 0) goto L_0x0078
            goto L_0x0054
        L_0x004c:
            char r7 = r9.charAt(r1)
            r8 = 0
            int r8 = r8.length     // Catch:{ all -> 0x007f }
            if (r4 != 0) goto L_0x0078
        L_0x0054:
            int r4 = length
            int r4 = r4 + 47
            int r8 = r4 % 128
            isInside = r8
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0062
            r4 = 1
            goto L_0x0063
        L_0x0062:
            r4 = 0
        L_0x0063:
            if (r4 == r6) goto L_0x0071
            r4 = 21
            if (r7 == r0) goto L_0x006c
            r8 = 21
            goto L_0x006e
        L_0x006c:
            r8 = 32
        L_0x006e:
            if (r8 == r4) goto L_0x0078
            goto L_0x0076
        L_0x0071:
            r4 = 120(0x78, float:1.68E-43)
            if (r7 == r4) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r4 = 1
            goto L_0x007c
        L_0x0078:
            r3.append(r7)     // Catch:{ Exception -> 0x0081 }
            r4 = 0
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0027
        L_0x007f:
            r9 = move-exception
            throw r9
        L_0x0081:
            r9 = move-exception
            throw r9
        L_0x0083:
            r9 = move-exception
            goto L_0x0086
        L_0x0085:
            throw r9
        L_0x0086:
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.ResultParser.unescapeBackslash(java.lang.String):java.lang.String");
    }

    protected static int parseHexDigit(char c) {
        int i;
        if (c < '0' || c > '9') {
            if (c >= 'a') {
                if ((c <= 'f' ? '`' : '(') != '(') {
                    int i2 = isInside + 101;
                    length = i2 % 128;
                    int i3 = i2 % 2;
                    i = c - 'a';
                    return i + 10;
                }
            }
            if (c < 'A') {
                return -1;
            }
            int i4 = length + 107;
            isInside = i4 % 128;
            int i5 = i4 % 2;
            if (c > 'F') {
                return -1;
            }
            i = c - 'A';
            return i + 10;
        }
        int i6 = c - '0';
        int i7 = length + 105;
        isInside = i7 % 128;
        int i8 = i7 % 2;
        return i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if ((r2 != null ? 27 : 'T') != 27) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static boolean isStringOfDigits(java.lang.CharSequence r2, int r3) {
        /*
            int r0 = length
            int r0 = r0 + 121
            int r1 = r0 % 128
            isInside = r1
            int r0 = r0 % 2
            r1 = 90
            if (r0 != 0) goto L_0x0011
            r0 = 43
            goto L_0x0013
        L_0x0011:
            r0 = 90
        L_0x0013:
            if (r0 == r1) goto L_0x0025
            r0 = 0
            int r0 = r0.length     // Catch:{ all -> 0x0023 }
            r0 = 27
            if (r2 == 0) goto L_0x001e
            r1 = 27
            goto L_0x0020
        L_0x001e:
            r1 = 84
        L_0x0020:
            if (r1 == r0) goto L_0x0027
            goto L_0x0052
        L_0x0023:
            r2 = move-exception
            throw r2
        L_0x0025:
            if (r2 == 0) goto L_0x0052
        L_0x0027:
            if (r3 <= 0) goto L_0x0052
            int r0 = r2.length()
            if (r3 != r0) goto L_0x0052
            int r3 = isInside
            int r3 = r3 + 119
            int r0 = r3 % 128
            length = r0
            int r3 = r3 % 2
            java.util.regex.Pattern r3 = DIGITS     // Catch:{ Exception -> 0x0050 }
            java.util.regex.Matcher r2 = r3.matcher(r2)     // Catch:{ Exception -> 0x0050 }
            boolean r2 = r2.matches()     // Catch:{ Exception -> 0x0050 }
            r3 = 89
            if (r2 == 0) goto L_0x004a
            r2 = 35
            goto L_0x004c
        L_0x004a:
            r2 = 89
        L_0x004c:
            if (r2 == r3) goto L_0x0052
            r2 = 1
            return r2
        L_0x0050:
            r2 = move-exception
            throw r2
        L_0x0052:
            r2 = 0
            int r3 = length
            int r3 = r3 + 99
            int r0 = r3 % 128
            isInside = r0
            int r3 = r3 % 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.ResultParser.isStringOfDigits(java.lang.CharSequence, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r5 != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if ((DIGITS.matcher(r5.subSequence(r6, r7)).matches() ? '2' : kotlin.text.Typography.dollar) != '$') goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static boolean isSubstringOfDigits(java.lang.CharSequence r5, int r6, int r7) {
        /*
            r0 = 0
            if (r5 == 0) goto L_0x006d
            if (r7 > 0) goto L_0x0006
            goto L_0x006d
        L_0x0006:
            int r7 = r7 + r6
            int r1 = r5.length()
            r2 = 1
            if (r1 < r7) goto L_0x0010
            r1 = 1
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            r3 = 0
            if (r1 == r2) goto L_0x0015
            goto L_0x0054
        L_0x0015:
            int r1 = isInside
            int r1 = r1 + 71
            int r4 = r1 % 128
            length = r4
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0023
            r1 = 1
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x003a
            java.util.regex.Pattern r1 = DIGITS
            java.lang.CharSequence r5 = r5.subSequence(r6, r7)
            java.util.regex.Matcher r5 = r1.matcher(r5)
            boolean r5 = r5.matches()
            int r6 = r3.length     // Catch:{ all -> 0x0038 }
            if (r5 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0038:
            r5 = move-exception
            throw r5
        L_0x003a:
            java.util.regex.Pattern r1 = DIGITS
            java.lang.CharSequence r5 = r5.subSequence(r6, r7)
            java.util.regex.Matcher r5 = r1.matcher(r5)
            boolean r5 = r5.matches()
            r6 = 36
            if (r5 == 0) goto L_0x004f
            r5 = 50
            goto L_0x0051
        L_0x004f:
            r5 = 36
        L_0x0051:
            if (r5 == r6) goto L_0x0054
        L_0x0053:
            return r2
        L_0x0054:
            int r5 = length
            int r5 = r5 + 23
            int r6 = r5 % 128
            isInside = r6
            int r5 = r5 % 2
            r6 = 73
            if (r5 != 0) goto L_0x0065
            r5 = 92
            goto L_0x0067
        L_0x0065:
            r5 = 73
        L_0x0067:
            if (r5 == r6) goto L_0x006d
            int r5 = r3.length     // Catch:{ all -> 0x006b }
            return r0
        L_0x006b:
            r5 = move-exception
            throw r5
        L_0x006d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.ResultParser.isSubstringOfDigits(java.lang.CharSequence, int, int):boolean");
    }

    static Map<String, String> parseNameValuePairs(String str) {
        int i;
        int i2 = isInside + 41;
        length = i2 % 128;
        if ((i2 % 2 != 0 ? '8' : ';') != ';') {
            try {
                i = str.indexOf(73);
                if (i < 0) {
                    return null;
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            i = str.indexOf(63);
            if ((i < 0 ? (char) 21 : 13) == 21) {
                return null;
            }
        }
        HashMap hashMap = new HashMap(3);
        String[] split = AMPERSAND.split(str.substring(i + 1));
        int length2 = split.length;
        int i3 = 0;
        while (true) {
            if (!(i3 < length2)) {
                return hashMap;
            }
            int i4 = isInside + 47;
            length = i4 % 128;
            if (i4 % 2 != 0) {
                try {
                    appendKeyValue(split[i3], hashMap);
                    i3 += 91;
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                appendKeyValue(split[i3], hashMap);
                i3++;
            }
        }
    }

    private static void appendKeyValue(CharSequence charSequence, Map<String, String> map) {
        String[] strArr;
        try {
            int i = isInside + 41;
            length = i % 128;
            if (i % 2 == 0) {
                try {
                    strArr = EQUALS.split(charSequence, 2);
                    if (strArr.length != 2) {
                        return;
                    }
                } catch (Exception e) {
                    throw e;
                }
            } else {
                strArr = EQUALS.split(charSequence, 5);
                if ((strArr.length == 3 ? 7 : '\'') != 7) {
                    return;
                }
            }
            try {
                map.put(strArr[0], urlDecode(strArr[1]));
                int i2 = isInside + 115;
                length = i2 % 128;
                int i3 = i2 % 2;
            } catch (IllegalArgumentException unused) {
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    static String urlDecode(String str) {
        String intern;
        int i = isInside + 71;
        length = i % 128;
        if ((i % 2 != 0 ? (char) 8 : 15) != 15) {
            try {
                intern = length(new byte[]{-123, -124, -125, -126, -127}, 72 / TextUtils.indexOf("", 2, 1), (int[]) null, (char[]) null).intern();
            } catch (UnsupportedEncodingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            intern = length(new byte[]{-123, -124, -125, -126, -127}, 126 - TextUtils.indexOf("", '0', 0), (int[]) null, (char[]) null).intern();
        }
        return URLDecoder.decode(str, intern);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r4 < 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r4 < 0) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        if ((countPrecedingBackslashes(r12, r4) % 2) == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        r9 = isInside + 1;
        length = r9 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        if ((r9 % 2) == 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0074, code lost:
        r4 = r4 + 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x007a, code lost:
        if (r7 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        r7 = new java.util.ArrayList(3);
        r8 = isInside + 69;
        length = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r8 = unescapeBackslash(r12.substring(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (r14 == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0096, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0099, code lost:
        if (r9 == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        r9 = length + 45;
        isInside = r9 % 128;
        r9 = r9 % 2;
        r8 = r8.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ae, code lost:
        if (r8.isEmpty() != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        r7.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b3, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r3 = length + 37;
        isInside = r3 % 128;
        r3 = r3 % 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String[] matchPrefixedField(java.lang.String r11, java.lang.String r12, char r13, boolean r14) {
        /*
            int r0 = isInside     // Catch:{ Exception -> 0x00e3 }
            int r0 = r0 + 45
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x00e3 }
            int r0 = r0 % 2
            int r0 = r12.length()
            r1 = 0
            r2 = 0
            r4 = r1
            r3 = 0
        L_0x0012:
            r5 = 5
            if (r3 >= r0) goto L_0x00c6
            int r3 = r12.indexOf(r11, r3)
            r6 = 84
            if (r3 < 0) goto L_0x0020
            r7 = 84
            goto L_0x0022
        L_0x0020:
            r7 = 81
        L_0x0022:
            if (r7 == r6) goto L_0x0026
            goto L_0x00c6
        L_0x0026:
            int r6 = r11.length()
            int r3 = r3 + r6
            r6 = 1
            r7 = r4
            r8 = 1
            r4 = r3
        L_0x002f:
            if (r8 == 0) goto L_0x0034
            r9 = 21
            goto L_0x0035
        L_0x0034:
            r9 = 5
        L_0x0035:
            if (r9 == r5) goto L_0x00b8
            int r9 = length
            int r9 = r9 + 109
            int r10 = r9 % 128
            isInside = r10
            int r9 = r9 % 2
            r10 = 99
            if (r9 != 0) goto L_0x0048
            r9 = 99
            goto L_0x0049
        L_0x0048:
            r9 = 7
        L_0x0049:
            if (r9 == r10) goto L_0x0052
            int r4 = r12.indexOf(r13, r4)
            if (r4 >= 0) goto L_0x0061
            goto L_0x005b
        L_0x0052:
            int r4 = r12.indexOf(r13, r4)
            r9 = 14
            int r9 = r9 / r2
            if (r4 >= 0) goto L_0x0061
        L_0x005b:
            int r4 = r12.length()
        L_0x005f:
            r8 = 0
            goto L_0x002f
        L_0x0061:
            int r9 = countPrecedingBackslashes(r12, r4)     // Catch:{ Exception -> 0x00e3 }
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x007a
            int r9 = isInside
            int r9 = r9 + r6
            int r10 = r9 % 128
            length = r10
            int r9 = r9 % 2
            if (r9 == 0) goto L_0x0077
            int r4 = r4 + 18
            goto L_0x002f
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x007a:
            if (r7 != 0) goto L_0x008c
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 3
            r7.<init>(r8)
            int r8 = isInside
            int r8 = r8 + 69
            int r9 = r8 % 128
            length = r9
            int r8 = r8 % 2
        L_0x008c:
            java.lang.String r8 = r12.substring(r3, r4)
            java.lang.String r8 = unescapeBackslash(r8)
            if (r14 == 0) goto L_0x0098
            r9 = 0
            goto L_0x0099
        L_0x0098:
            r9 = 1
        L_0x0099:
            if (r9 == 0) goto L_0x009c
            goto L_0x00aa
        L_0x009c:
            int r9 = length
            int r9 = r9 + 45
            int r10 = r9 % 128
            isInside = r10
            int r9 = r9 % 2
            java.lang.String r8 = r8.trim()
        L_0x00aa:
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x00b3
            r7.add(r8)
        L_0x00b3:
            int r4 = r4 + 1
            goto L_0x005f
        L_0x00b6:
            r11 = move-exception
            throw r11
        L_0x00b8:
            int r3 = length     // Catch:{ Exception -> 0x00e3 }
            int r3 = r3 + 37
            int r5 = r3 % 128
            isInside = r5     // Catch:{ Exception -> 0x00e3 }
            int r3 = r3 % 2
            r3 = r4
            r4 = r7
            goto L_0x0012
        L_0x00c6:
            r11 = 47
            if (r4 == 0) goto L_0x00cc
            r5 = 47
        L_0x00cc:
            if (r5 == r11) goto L_0x00cf
            goto L_0x00d5
        L_0x00cf:
            boolean r11 = r4.isEmpty()
            if (r11 == 0) goto L_0x00d6
        L_0x00d5:
            return r1
        L_0x00d6:
            int r11 = r4.size()
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.Object[] r11 = r4.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            return r11
        L_0x00e3:
            r11 = move-exception
            goto L_0x00e6
        L_0x00e5:
            throw r11
        L_0x00e6:
            goto L_0x00e5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.ResultParser.matchPrefixedField(java.lang.String, java.lang.String, char, boolean):java.lang.String[]");
    }

    private static int countPrecedingBackslashes(CharSequence charSequence, int i) {
        int i2 = i - 1;
        int i3 = 0;
        while (true) {
            if ((i2 >= 0 ? (char) 10 : 23) == 23) {
                break;
            }
            int i4 = length + 113;
            isInside = i4 % 128;
            int i5 = i4 % 2;
            try {
                if (charSequence.charAt(i2) != '\\') {
                    break;
                }
                i3++;
                i2--;
            } catch (Exception e) {
                throw e;
            }
        }
        int i6 = isInside + 101;
        length = i6 % 128;
        int i7 = i6 % 2;
        return i3;
    }

    static String matchSinglePrefixedField(String str, String str2, char c, boolean z) {
        try {
            String[] matchPrefixedField = matchPrefixedField(str, str2, c, z);
            if (!(matchPrefixedField == null)) {
                return matchPrefixedField[0];
            }
            int i = length + 15;
            isInside = i % 128;
            int i2 = i % 2;
            int i3 = length + 75;
            isInside = i3 % 128;
            String str3 = null;
            if ((i3 % 2 == 0 ? JSONLexer.EOI : 31) != 26) {
                return str3;
            }
            super.hashCode();
            return str3;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String length(byte[] bArr, int i, int[] iArr, char[] cArr) {
        char[] cArr2 = getMax;
        int i2 = getMin;
        int i3 = 0;
        if ((setMin ? '5' : 'E') != '5') {
            if (!setMax) {
                int length2 = iArr.length;
                char[] cArr3 = new char[length2];
                while (true) {
                    if ((i3 < length2 ? 7 : ':') == ':') {
                        return new String(cArr3);
                    }
                    int i4 = length + 51;
                    isInside = i4 % 128;
                    int i5 = i4 % 2;
                    cArr3[i3] = (char) (cArr2[iArr[(length2 - 1) - i3] - i] - i2);
                    i3++;
                }
            } else {
                try {
                    int i6 = isInside + 75;
                    length = i6 % 128;
                    int i7 = i6 % 2;
                    int length3 = cArr.length;
                    char[] cArr4 = new char[length3];
                    int i8 = 0;
                    while (true) {
                        if (!(i8 < length3)) {
                            return new String(cArr4);
                        }
                        int i9 = isInside + 27;
                        length = i9 % 128;
                        if ((i9 % 2 != 0 ? 22 : '`') != '`') {
                            cArr4[i8] = (char) (cArr2[cArr[(length3 + 1) >> i8] / i] >> i2);
                            i8 += 107;
                        } else {
                            cArr4[i8] = (char) (cArr2[cArr[(length3 - 1) - i8] - i] - i2);
                            i8++;
                        }
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
        } else {
            int length4 = bArr.length;
            char[] cArr5 = new char[length4];
            while (true) {
                if ((i3 < length4 ? (char) 3 : 6) == 6) {
                    return new String(cArr5);
                }
                try {
                    int i10 = isInside + 63;
                    length = i10 % 128;
                    if ((i10 % 2 != 0 ? Typography.quote : '\\') != '\\') {
                        cArr5[i3] = (char) (cArr2[bArr[(length4 >> 1) - i3] % i] * i2);
                        i3 += 89;
                    } else {
                        cArr5[i3] = (char) (cArr2[bArr[(length4 - 1) - i3] + i] - i2);
                        i3++;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
    }
}
