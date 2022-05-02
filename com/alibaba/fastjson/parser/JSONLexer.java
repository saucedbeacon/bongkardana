package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.google.android.exoplayer2.C;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import id.dana.sendmoney.summary.SummaryActivity;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.text.Typography;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public final class JSONLexer {
    public static final char[] CA = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    public static final int END = 4;
    public static final char EOI = '\u001a';
    static final int[] IA;
    public static final int NOT_MATCH = -1;
    public static final int NOT_MATCH_NAME = -2;
    public static final int UNKNOWN = 0;
    private static boolean V6 = false;
    public static final int VALUE = 3;
    protected static final int[] digits = new int[103];
    public static final boolean[] firstIdentifierFlags = new boolean[256];
    public static final boolean[] identifierFlags = new boolean[256];
    private static final ThreadLocal<char[]> sbufLocal = new ThreadLocal<>();
    protected int bp;
    public Calendar calendar;
    protected char ch;
    public boolean disableCircularReferenceDetect;
    protected int eofPos;
    protected boolean exp;
    public int features;
    protected long fieldHash;
    protected boolean hasSpecial;
    protected boolean isDouble;
    protected final int len;
    public Locale locale;
    public int matchStat;
    protected int np;
    protected int pos;
    protected char[] sbuf;
    protected int sp;
    protected String stringDefaultValue;
    protected final String text;
    public TimeZone timeZone;
    protected int token;

    static boolean checkDate(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
        if (c >= '1' && c <= '3' && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            if (c5 == '0') {
                if (c6 < '1' || c6 > '9') {
                    return false;
                }
            } else if (!(c5 == '1' && (c6 == '0' || c6 == '1' || c6 == '2'))) {
                return false;
            }
            return i == 48 ? i2 >= 49 && i2 <= 57 : (i == 49 || i == 50) ? i2 >= 48 && i2 <= 57 : i == 51 && (i2 == 48 || i2 == 49);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        if (r5 <= '4') goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean checkTime(char r4, char r5, char r6, char r7, char r8, char r9) {
        /*
            r0 = 57
            r1 = 0
            r2 = 48
            if (r4 != r2) goto L_0x000c
            if (r5 < r2) goto L_0x000b
            if (r5 <= r0) goto L_0x0020
        L_0x000b:
            return r1
        L_0x000c:
            r3 = 49
            if (r4 != r3) goto L_0x0015
            if (r5 < r2) goto L_0x0014
            if (r5 <= r0) goto L_0x0020
        L_0x0014:
            return r1
        L_0x0015:
            r3 = 50
            if (r4 != r3) goto L_0x0042
            if (r5 < r2) goto L_0x0042
            r4 = 52
            if (r5 <= r4) goto L_0x0020
            goto L_0x0042
        L_0x0020:
            r4 = 53
            r5 = 54
            if (r6 < r2) goto L_0x002d
            if (r6 > r4) goto L_0x002d
            if (r7 < r2) goto L_0x002c
            if (r7 <= r0) goto L_0x0032
        L_0x002c:
            return r1
        L_0x002d:
            if (r6 != r5) goto L_0x0042
            if (r7 == r2) goto L_0x0032
            return r1
        L_0x0032:
            if (r8 < r2) goto L_0x003b
            if (r8 > r4) goto L_0x003b
            if (r9 < r2) goto L_0x003a
            if (r9 <= r0) goto L_0x0040
        L_0x003a:
            return r1
        L_0x003b:
            if (r8 != r5) goto L_0x0042
            if (r9 == r2) goto L_0x0040
            return r1
        L_0x0040:
            r4 = 1
            return r4
        L_0x0042:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.checkTime(char, char, char, char, char, char):boolean");
    }

    static {
        int i;
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt((Object) null);
        } catch (Exception unused) {
            i = -1;
        }
        char c = 0;
        V6 = i >= 23;
        for (int i2 = 48; i2 <= 57; i2++) {
            digits[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            digits[i3] = (i3 - 97) + 10;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            digits[i4] = (i4 - 65) + 10;
        }
        int[] iArr = new int[256];
        IA = iArr;
        Arrays.fill(iArr, -1);
        int length = CA.length;
        for (int i5 = 0; i5 < length; i5++) {
            IA[CA[i5]] = i5;
        }
        IA[61] = 0;
        char c2 = 0;
        while (true) {
            boolean[] zArr = firstIdentifierFlags;
            if (c2 >= zArr.length) {
                break;
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                zArr[c2] = true;
            } else if (c2 >= 'a' && c2 <= 'z') {
                firstIdentifierFlags[c2] = true;
            } else if (c2 == '_') {
                firstIdentifierFlags[c2] = true;
            }
            c2 = (char) (c2 + 1);
        }
        while (true) {
            boolean[] zArr2 = identifierFlags;
            if (c < zArr2.length) {
                if (c >= 'A' && c <= 'Z') {
                    zArr2[c] = true;
                } else if (c >= 'a' && c <= 'z') {
                    identifierFlags[c] = true;
                } else if (c == '_') {
                    identifierFlags[c] = true;
                } else if (c >= '0' && c <= '9') {
                    identifierFlags[c] = true;
                }
                c = (char) (c + 1);
            } else {
                return;
            }
        }
    }

    public JSONLexer(String str) {
        this(str, JSON.DEFAULT_PARSER_FEATURE);
    }

    public JSONLexer(char[] cArr, int i) {
        this(cArr, i, JSON.DEFAULT_PARSER_FEATURE);
    }

    public JSONLexer(char[] cArr, int i, int i2) {
        this(new String(cArr, 0, i), i2);
    }

    public JSONLexer(String str, int i) {
        char c;
        this.features = JSON.DEFAULT_PARSER_FEATURE;
        boolean z = false;
        this.exp = false;
        this.isDouble = false;
        this.timeZone = JSON.defaultTimeZone;
        this.locale = JSON.defaultLocale;
        String str2 = null;
        this.calendar = null;
        this.matchStat = 0;
        char[] cArr = sbufLocal.get();
        this.sbuf = cArr;
        if (cArr == null) {
            this.sbuf = new char[512];
        }
        this.features = i;
        this.text = str;
        int length = str.length();
        this.len = length;
        this.bp = -1;
        int i2 = -1 + 1;
        this.bp = i2;
        if (i2 >= length) {
            c = EOI;
        } else {
            c = this.text.charAt(i2);
        }
        this.ch = c;
        if (c == 65279) {
            next();
        }
        this.stringDefaultValue = (Feature.InitStringFieldAsEmpty.mask & i) != 0 ? "" : str2;
        this.disableCircularReferenceDetect = (Feature.DisableCircularReferenceDetect.mask & i) != 0 ? true : z;
    }

    public final int token() {
        return this.token;
    }

    public final void close() {
        char[] cArr = this.sbuf;
        if (cArr.length <= 8196) {
            sbufLocal.set(cArr);
        }
        this.sbuf = null;
    }

    public final char next() {
        char c;
        int i = this.bp + 1;
        this.bp = i;
        if (i >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i);
        }
        this.ch = c;
        return c;
    }

    public final void config(Feature feature, boolean z) {
        if (z) {
            this.features |= feature.mask;
        } else {
            this.features &= feature.mask ^ -1;
        }
        if (feature == Feature.InitStringFieldAsEmpty) {
            this.stringDefaultValue = z ? "" : null;
        }
        this.disableCircularReferenceDetect = (this.features & Feature.DisableCircularReferenceDetect.mask) != 0;
    }

    public final boolean isEnabled(Feature feature) {
        return (feature.mask & this.features) != 0;
    }

    public final void nextTokenWithChar(char c) {
        char c2;
        this.sp = 0;
        while (true) {
            char c3 = this.ch;
            if (c3 == c) {
                int i = this.bp + 1;
                this.bp = i;
                if (i >= this.len) {
                    c2 = EOI;
                } else {
                    c2 = this.text.charAt(i);
                }
                this.ch = c2;
                nextToken();
                return;
            } else if (c3 == ' ' || c3 == 10 || c3 == 13 || c3 == 9 || c3 == 12 || c3 == 8) {
                next();
            } else {
                StringBuilder sb = new StringBuilder("not match ");
                sb.append(c);
                sb.append(" - ");
                sb.append(this.ch);
                throw new JSONException(sb.toString());
            }
        }
    }

    public final String numberString() {
        char charAt = this.text.charAt((this.np + this.sp) - 1);
        int i = this.sp;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i--;
        }
        return subString(this.np, i);
    }

    /* access modifiers changed from: protected */
    public final char charAt(int i) {
        if (i >= this.len) {
            return EOI;
        }
        return this.text.charAt(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        scanNumber();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void nextToken() {
        /*
            r15 = this;
            r0 = 0
            r15.sp = r0
        L_0x0003:
            int r1 = r15.bp
            r15.pos = r1
            char r1 = r15.ch
            r2 = 47
            if (r1 != r2) goto L_0x0011
            r15.skipComment()
            goto L_0x0003
        L_0x0011:
            r2 = 34
            if (r1 != r2) goto L_0x0019
            r15.scanString()
            return
        L_0x0019:
            r2 = 48
            if (r1 < r2) goto L_0x0021
            r2 = 57
            if (r1 <= r2) goto L_0x0027
        L_0x0021:
            char r1 = r15.ch
            r2 = 45
            if (r1 != r2) goto L_0x002b
        L_0x0027:
            r15.scanNumber()
            return
        L_0x002b:
            r2 = 44
            if (r1 != r2) goto L_0x0037
            r15.next()
            r0 = 16
            r15.token = r0
            return
        L_0x0037:
            r3 = 12
            if (r1 == r3) goto L_0x01eb
            r4 = 13
            if (r1 == r4) goto L_0x01eb
            r5 = 32
            if (r1 == r5) goto L_0x01eb
            r6 = 58
            if (r1 == r6) goto L_0x01e3
            r7 = 91
            r8 = 1
            r9 = 26
            if (r1 == r7) goto L_0x01cc
            r7 = 93
            if (r1 == r7) goto L_0x01c4
            r10 = 102(0x66, float:1.43E-43)
            r11 = 9
            r12 = 8
            r13 = 10
            r14 = 125(0x7d, float:1.75E-43)
            if (r1 == r10) goto L_0x018a
            r10 = 110(0x6e, float:1.54E-43)
            if (r1 == r10) goto L_0x0138
            r10 = 123(0x7b, float:1.72E-43)
            if (r1 == r10) goto L_0x0123
            if (r1 == r14) goto L_0x010e
            r10 = 83
            if (r1 == r10) goto L_0x010a
            r10 = 84
            if (r1 == r10) goto L_0x010a
            r10 = 116(0x74, float:1.63E-43)
            if (r1 == r10) goto L_0x00cf
            r2 = 117(0x75, float:1.64E-43)
            if (r1 == r2) goto L_0x010a
            switch(r1) {
                case 8: goto L_0x01eb;
                case 9: goto L_0x01eb;
                case 10: goto L_0x01eb;
                default: goto L_0x007b;
            }
        L_0x007b:
            switch(r1) {
                case 39: goto L_0x00cb;
                case 40: goto L_0x00c5;
                case 41: goto L_0x00bd;
                default: goto L_0x007e;
            }
        L_0x007e:
            int r2 = r15.bp
            int r3 = r15.len
            if (r2 == r3) goto L_0x008d
            if (r1 != r9) goto L_0x008b
            int r2 = r2 + 1
            if (r2 != r3) goto L_0x008b
            goto L_0x008d
        L_0x008b:
            r1 = 0
            goto L_0x008e
        L_0x008d:
            r1 = 1
        L_0x008e:
            if (r1 == 0) goto L_0x00a7
            int r0 = r15.token
            r1 = 20
            if (r0 == r1) goto L_0x009f
            r15.token = r1
            int r0 = r15.eofPos
            r15.bp = r0
            r15.pos = r0
            return
        L_0x009f:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "EOF error"
            r0.<init>(r1)
            throw r0
        L_0x00a7:
            char r1 = r15.ch
            r2 = 31
            if (r1 <= r2) goto L_0x00b8
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 != r2) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            r15.token = r8
            r15.next()
            return
        L_0x00b8:
            r15.next()
            goto L_0x0003
        L_0x00bd:
            r15.next()
            r0 = 11
            r15.token = r0
            return
        L_0x00c5:
            r15.next()
            r15.token = r13
            return
        L_0x00cb:
            r15.scanString()
            return
        L_0x00cf:
            java.lang.String r0 = r15.text
            int r1 = r15.bp
            java.lang.String r8 = "true"
            boolean r0 = r0.startsWith(r8, r1)
            if (r0 == 0) goto L_0x0102
            int r0 = r15.bp
            int r0 = r0 + 4
            r15.bp = r0
            char r0 = r15.charAt(r0)
            r15.ch = r0
            if (r0 == r5) goto L_0x00fe
            if (r0 == r2) goto L_0x00fe
            if (r0 == r14) goto L_0x00fe
            if (r0 == r7) goto L_0x00fe
            if (r0 == r13) goto L_0x00fe
            if (r0 == r4) goto L_0x00fe
            if (r0 == r11) goto L_0x00fe
            if (r0 == r9) goto L_0x00fe
            if (r0 == r3) goto L_0x00fe
            if (r0 == r12) goto L_0x00fe
            if (r0 != r6) goto L_0x0102
        L_0x00fe:
            r0 = 6
            r15.token = r0
            return
        L_0x0102:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "scan true error"
            r0.<init>(r1)
            throw r0
        L_0x010a:
            r15.scanIdent()
            return
        L_0x010e:
            int r0 = r15.bp
            int r0 = r0 + r8
            r15.bp = r0
            int r1 = r15.len
            if (r0 < r1) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            java.lang.String r1 = r15.text
            char r9 = r1.charAt(r0)
        L_0x011e:
            r15.ch = r9
            r15.token = r4
            return
        L_0x0123:
            int r0 = r15.bp
            int r0 = r0 + r8
            r15.bp = r0
            int r1 = r15.len
            if (r0 < r1) goto L_0x012d
            goto L_0x0133
        L_0x012d:
            java.lang.String r1 = r15.text
            char r9 = r1.charAt(r0)
        L_0x0133:
            r15.ch = r9
            r15.token = r3
            return
        L_0x0138:
            java.lang.String r1 = r15.text
            int r6 = r15.bp
            java.lang.String r8 = "null"
            boolean r1 = r1.startsWith(r8, r6)
            if (r1 == 0) goto L_0x014d
            int r0 = r15.bp
            int r0 = r0 + 4
            r15.bp = r0
            r0 = 8
            goto L_0x0161
        L_0x014d:
            java.lang.String r1 = r15.text
            int r6 = r15.bp
            java.lang.String r8 = "new"
            boolean r1 = r1.startsWith(r8, r6)
            if (r1 == 0) goto L_0x0161
            int r0 = r15.bp
            int r0 = r0 + 3
            r15.bp = r0
            r0 = 9
        L_0x0161:
            if (r0 == 0) goto L_0x0182
            int r1 = r15.bp
            char r1 = r15.charAt(r1)
            r15.ch = r1
            if (r1 == r5) goto L_0x017f
            if (r1 == r2) goto L_0x017f
            if (r1 == r14) goto L_0x017f
            if (r1 == r7) goto L_0x017f
            if (r1 == r13) goto L_0x017f
            if (r1 == r4) goto L_0x017f
            if (r1 == r11) goto L_0x017f
            if (r1 == r9) goto L_0x017f
            if (r1 == r3) goto L_0x017f
            if (r1 != r12) goto L_0x0182
        L_0x017f:
            r15.token = r0
            return
        L_0x0182:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "scan null/new error"
            r0.<init>(r1)
            throw r0
        L_0x018a:
            java.lang.String r0 = r15.text
            int r1 = r15.bp
            java.lang.String r8 = "false"
            boolean r0 = r0.startsWith(r8, r1)
            if (r0 == 0) goto L_0x01bc
            int r0 = r15.bp
            int r0 = r0 + 5
            r15.bp = r0
            char r0 = r15.charAt(r0)
            r15.ch = r0
            if (r0 == r5) goto L_0x01b8
            if (r0 == r2) goto L_0x01b8
            if (r0 == r14) goto L_0x01b8
            if (r0 == r7) goto L_0x01b8
            if (r0 == r13) goto L_0x01b8
            if (r0 == r4) goto L_0x01b8
            if (r0 == r11) goto L_0x01b8
            if (r0 == r9) goto L_0x01b8
            if (r0 == r3) goto L_0x01b8
            if (r0 == r12) goto L_0x01b8
            if (r0 != r6) goto L_0x01bc
        L_0x01b8:
            r0 = 7
            r15.token = r0
            return
        L_0x01bc:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.String r1 = "scan false error"
            r0.<init>(r1)
            throw r0
        L_0x01c4:
            r15.next()
            r0 = 15
            r15.token = r0
            return
        L_0x01cc:
            int r0 = r15.bp
            int r0 = r0 + r8
            r15.bp = r0
            int r1 = r15.len
            if (r0 < r1) goto L_0x01d6
            goto L_0x01dc
        L_0x01d6:
            java.lang.String r1 = r15.text
            char r9 = r1.charAt(r0)
        L_0x01dc:
            r15.ch = r9
            r0 = 14
            r15.token = r0
            return
        L_0x01e3:
            r15.next()
            r0 = 17
            r15.token = r0
            return
        L_0x01eb:
            r15.next()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.nextToken():void");
    }

    public final void nextToken(int i) {
        this.sp = 0;
        while (true) {
            if (i != 2) {
                char c = EOI;
                if (i == 4) {
                    char c2 = this.ch;
                    if (c2 == '\"') {
                        this.pos = this.bp;
                        scanString();
                        return;
                    } else if (c2 >= '0' && c2 <= '9') {
                        this.pos = this.bp;
                        scanNumber();
                        return;
                    } else if (this.ch == '{') {
                        this.token = 12;
                        int i2 = this.bp + 1;
                        this.bp = i2;
                        if (i2 < this.len) {
                            c = this.text.charAt(i2);
                        }
                        this.ch = c;
                        return;
                    }
                } else if (i == 12) {
                    char c3 = this.ch;
                    if (c3 == '{') {
                        this.token = 12;
                        int i3 = this.bp + 1;
                        this.bp = i3;
                        if (i3 < this.len) {
                            c = this.text.charAt(i3);
                        }
                        this.ch = c;
                        return;
                    } else if (c3 == '[') {
                        this.token = 14;
                        int i4 = this.bp + 1;
                        this.bp = i4;
                        if (i4 < this.len) {
                            c = this.text.charAt(i4);
                        }
                        this.ch = c;
                        return;
                    }
                } else if (i != 18) {
                    if (i != 20) {
                        switch (i) {
                            case 14:
                                char c4 = this.ch;
                                if (c4 == '[') {
                                    this.token = 14;
                                    next();
                                    return;
                                } else if (c4 == '{') {
                                    this.token = 12;
                                    next();
                                    return;
                                }
                                break;
                            case 15:
                                if (this.ch == ']') {
                                    this.token = 15;
                                    next();
                                    return;
                                }
                                break;
                            case 16:
                                char c5 = this.ch;
                                if (c5 == ',') {
                                    this.token = 16;
                                    int i5 = this.bp + 1;
                                    this.bp = i5;
                                    if (i5 < this.len) {
                                        c = this.text.charAt(i5);
                                    }
                                    this.ch = c;
                                    return;
                                } else if (c5 == '}') {
                                    this.token = 13;
                                    int i6 = this.bp + 1;
                                    this.bp = i6;
                                    if (i6 < this.len) {
                                        c = this.text.charAt(i6);
                                    }
                                    this.ch = c;
                                    return;
                                } else if (c5 == ']') {
                                    this.token = 15;
                                    int i7 = this.bp + 1;
                                    this.bp = i7;
                                    if (i7 < this.len) {
                                        c = this.text.charAt(i7);
                                    }
                                    this.ch = c;
                                    return;
                                } else if (c5 == 26) {
                                    this.token = 20;
                                    return;
                                }
                                break;
                        }
                    }
                    if (this.ch == 26) {
                        this.token = 20;
                        return;
                    }
                } else {
                    nextIdent();
                    return;
                }
            } else {
                char c6 = this.ch;
                if (c6 < '0' || c6 > '9') {
                    char c7 = this.ch;
                    if (c7 == '\"') {
                        this.pos = this.bp;
                        scanString();
                        return;
                    } else if (c7 == '[') {
                        this.token = 14;
                        next();
                        return;
                    } else if (c7 == '{') {
                        this.token = 12;
                        next();
                        return;
                    }
                } else {
                    this.pos = this.bp;
                    scanNumber();
                    return;
                }
            }
            char c8 = this.ch;
            if (c8 == ' ' || c8 == 10 || c8 == 13 || c8 == 9 || c8 == 12 || c8 == 8) {
                next();
            } else {
                nextToken();
                return;
            }
        }
    }

    public final void nextIdent() {
        while (true) {
            char c = this.ch;
            if (!(c <= ' ' && (c == ' ' || c == 10 || c == 13 || c == 9 || c == 12 || c == 8))) {
                break;
            }
            next();
        }
        char c2 = this.ch;
        if (c2 == '_' || Character.isLetter(c2)) {
            scanIdent();
        } else {
            nextToken();
        }
    }

    public final Number integerValue() throws NumberFormatException {
        char c;
        char c2;
        char c3;
        boolean z;
        long j;
        long j2;
        char c4;
        char c5;
        int i = this.np;
        int i2 = this.sp + i;
        int i3 = i2 - 1;
        if (i3 >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i3);
        }
        if (c == 'B') {
            i2--;
            c2 = 'B';
        } else if (c == 'L') {
            i2--;
            c2 = 'L';
        } else if (c != 'S') {
            c2 = ' ';
        } else {
            i2--;
            c2 = 'S';
        }
        int i4 = this.np;
        if (i4 >= this.len) {
            c3 = EOI;
        } else {
            c3 = this.text.charAt(i4);
        }
        if (c3 == '-') {
            j = Long.MIN_VALUE;
            i++;
            z = true;
        } else {
            j = C.TIME_UNSET;
            z = false;
        }
        if (i < i2) {
            int i5 = i + 1;
            if (i >= this.len) {
                c5 = EOI;
            } else {
                c5 = this.text.charAt(i);
            }
            j2 = (long) (-(c5 - '0'));
            i = i5;
        } else {
            j2 = 0;
        }
        while (i < i2) {
            int i6 = i + 1;
            if (i >= this.len) {
                c4 = EOI;
            } else {
                c4 = this.text.charAt(i);
            }
            int i7 = c4 - '0';
            if (j2 < -922337203685477580L) {
                return new BigInteger(numberString());
            }
            long j3 = j2 * 10;
            long j4 = (long) i7;
            if (j3 < j + j4) {
                return new BigInteger(numberString());
            }
            j2 = j3 - j4;
            i = i6;
        }
        if (!z) {
            long j5 = -j2;
            if (j5 > 2147483647L || c2 == 'L') {
                return Long.valueOf(j5);
            }
            if (c2 == 'S') {
                return Short.valueOf((short) ((int) j5));
            }
            if (c2 == 'B') {
                return Byte.valueOf((byte) ((int) j5));
            }
            return Integer.valueOf((int) j5);
        } else if (i <= this.np + 1) {
            throw new NumberFormatException(numberString());
        } else if (j2 < -2147483648L || c2 == 'L') {
            return Long.valueOf(j2);
        } else {
            if (c2 == 'S') {
                return Short.valueOf((short) ((int) j2));
            }
            if (c2 == 'B') {
                return Byte.valueOf((byte) ((int) j2));
            }
            return Integer.valueOf((int) j2);
        }
    }

    public final String scanSymbol(SymbolTable symbolTable) {
        char c;
        while (true) {
            c = this.ch;
            if (c != ' ' && c != 10 && c != 13 && c != 9 && c != 12 && c != 8) {
                break;
            }
            next();
        }
        if (c == '\"') {
            return scanSymbol(symbolTable, Typography.quote);
        }
        if (c == '\'') {
            return scanSymbol(symbolTable, '\'');
        }
        if (c == '}') {
            next();
            this.token = 13;
            return null;
        } else if (c == ',') {
            next();
            this.token = 16;
            return null;
        } else if (c != 26) {
            return scanSymbolUnQuoted(symbolTable);
        } else {
            this.token = 20;
            return null;
        }
    }

    public final String scanSymbol(SymbolTable symbolTable, char c) {
        String str;
        char c2;
        int i = this.bp + 1;
        int indexOf = this.text.indexOf(c, i);
        if (indexOf != -1) {
            int i2 = indexOf - i;
            char[] sub_chars = sub_chars(this.bp + 1, i2);
            boolean z = false;
            while (i2 > 0 && sub_chars[i2 - 1] == '\\') {
                int i3 = i2 - 2;
                int i4 = 1;
                while (i3 >= 0 && sub_chars[i3] == '\\') {
                    i4++;
                    i3--;
                }
                if (i4 % 2 == 0) {
                    break;
                }
                int indexOf2 = this.text.indexOf(c, indexOf + 1);
                int i5 = (indexOf2 - indexOf) + i2;
                if (i5 >= sub_chars.length) {
                    int length = (sub_chars.length * 3) / 2;
                    if (length < i5) {
                        length = i5;
                    }
                    char[] cArr = new char[length];
                    System.arraycopy(sub_chars, 0, cArr, 0, sub_chars.length);
                    sub_chars = cArr;
                }
                this.text.getChars(indexOf, indexOf2, sub_chars, i2);
                indexOf = indexOf2;
                i2 = i5;
                z = true;
            }
            if (!z) {
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    char c3 = sub_chars[i7];
                    i6 = (i6 * 31) + c3;
                    if (c3 == '\\') {
                        z = true;
                    }
                }
                if (z) {
                    str = readString(sub_chars, i2);
                } else {
                    str = i2 < 20 ? symbolTable.addSymbol(sub_chars, 0, i2, i6) : new String(sub_chars, 0, i2);
                }
            } else {
                str = readString(sub_chars, i2);
            }
            int i8 = indexOf + 1;
            this.bp = i8;
            if (i8 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i8);
            }
            this.ch = c2;
            return str;
        }
        StringBuilder sb = new StringBuilder("unclosed str, ");
        sb.append(info());
        throw new JSONException(sb.toString());
    }

    private static String readString(char[] cArr, int i) {
        int i2;
        int i3;
        char[] cArr2 = new char[i];
        int i4 = 0;
        int i5 = 0;
        while (i2 < i) {
            char c = cArr[i2];
            if (c != '\\') {
                cArr2[i5] = c;
                i5++;
            } else {
                i2++;
                char c2 = cArr[i2];
                if (c2 == '\"') {
                    i3 = i5 + 1;
                    cArr2[i5] = Typography.quote;
                } else if (c2 != '\'') {
                    if (c2 != 'F') {
                        if (c2 == '\\') {
                            i3 = i5 + 1;
                            cArr2[i5] = '\\';
                        } else if (c2 == 'b') {
                            i3 = i5 + 1;
                            cArr2[i5] = 8;
                        } else if (c2 != 'f') {
                            if (c2 == 'n') {
                                i3 = i5 + 1;
                                cArr2[i5] = 10;
                            } else if (c2 == 'r') {
                                i3 = i5 + 1;
                                cArr2[i5] = 13;
                            } else if (c2 != 'x') {
                                switch (c2) {
                                    case '/':
                                        i3 = i5 + 1;
                                        cArr2[i5] = '/';
                                        break;
                                    case '0':
                                        i3 = i5 + 1;
                                        cArr2[i5] = 0;
                                        break;
                                    case '1':
                                        i3 = i5 + 1;
                                        cArr2[i5] = 1;
                                        break;
                                    case '2':
                                        i3 = i5 + 1;
                                        cArr2[i5] = 2;
                                        break;
                                    case '3':
                                        i3 = i5 + 1;
                                        cArr2[i5] = 3;
                                        break;
                                    case '4':
                                        i3 = i5 + 1;
                                        cArr2[i5] = 4;
                                        break;
                                    case '5':
                                        i3 = i5 + 1;
                                        cArr2[i5] = 5;
                                        break;
                                    case '6':
                                        i3 = i5 + 1;
                                        cArr2[i5] = 6;
                                        break;
                                    case '7':
                                        i3 = i5 + 1;
                                        cArr2[i5] = 7;
                                        break;
                                    default:
                                        switch (c2) {
                                            case 't':
                                                i3 = i5 + 1;
                                                cArr2[i5] = 9;
                                                break;
                                            case 'u':
                                                i3 = i5 + 1;
                                                int i6 = i2 + 1;
                                                int i7 = i6 + 1;
                                                int i8 = i7 + 1;
                                                i2 = i8 + 1;
                                                cArr2[i5] = (char) Integer.parseInt(new String(new char[]{cArr[i6], cArr[i7], cArr[i8], cArr[i2]}), 16);
                                                break;
                                            case 'v':
                                                i3 = i5 + 1;
                                                cArr2[i5] = 11;
                                                break;
                                            default:
                                                throw new JSONException("unclosed.str.lit");
                                        }
                                }
                            } else {
                                i3 = i5 + 1;
                                int[] iArr = digits;
                                int i9 = i2 + 1;
                                i2 = i9 + 1;
                                cArr2[i5] = (char) ((iArr[cArr[i9]] * 16) + iArr[cArr[i2]]);
                            }
                        }
                    }
                    i3 = i5 + 1;
                    cArr2[i5] = 12;
                } else {
                    i3 = i5 + 1;
                    cArr2[i5] = '\'';
                }
                i5 = i3;
            }
            i4 = i2 + 1;
        }
        return new String(cArr2, 0, i5);
    }

    public final String info() {
        String str;
        StringBuilder sb = new StringBuilder("pos ");
        sb.append(this.bp);
        sb.append(", json : ");
        if (this.len < 65536) {
            str = this.text;
        } else {
            str = this.text.substring(0, 65536);
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final void skipComment() {
        next();
        char c = this.ch;
        if (c == '/') {
            do {
                next();
            } while (this.ch != 10);
            next();
        } else if (c == '*') {
            next();
            while (true) {
                char c2 = this.ch;
                if (c2 == 26) {
                    return;
                }
                if (c2 == '*') {
                    next();
                    if (this.ch == '/') {
                        next();
                        return;
                    }
                } else {
                    next();
                }
            }
        } else {
            throw new JSONException("invalid comment");
        }
    }

    public final String scanSymbolUnQuoted(SymbolTable symbolTable) {
        int i = this.ch;
        boolean[] zArr = firstIdentifierFlags;
        if (i >= zArr.length || zArr[i]) {
            this.np = this.bp;
            this.sp = 1;
            while (true) {
                char next = next();
                boolean[] zArr2 = identifierFlags;
                if (next < zArr2.length && !zArr2[next]) {
                    break;
                }
                i = (i * 31) + next;
                this.sp++;
            }
            this.ch = charAt(this.bp);
            this.token = 18;
            if (this.sp != 4 || !this.text.startsWith("null", this.np)) {
                return symbolTable.addSymbol(this.text, this.np, this.sp, i);
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("illegal identifier : ");
        sb.append(this.ch);
        sb.append(", ");
        sb.append(info());
        throw new JSONException(sb.toString());
    }

    public final void scanString() {
        char c;
        char c2 = this.ch;
        int i = this.bp + 1;
        int indexOf = this.text.indexOf(c2, i);
        if (indexOf != -1) {
            int i2 = indexOf - i;
            char[] sub_chars = sub_chars(this.bp + 1, i2);
            boolean z = false;
            while (i2 > 0 && sub_chars[i2 - 1] == '\\') {
                int i3 = i2 - 2;
                int i4 = 1;
                while (i3 >= 0 && sub_chars[i3] == '\\') {
                    i4++;
                    i3--;
                }
                if (i4 % 2 == 0) {
                    break;
                }
                int indexOf2 = this.text.indexOf(c2, indexOf + 1);
                int i5 = (indexOf2 - indexOf) + i2;
                if (i5 >= sub_chars.length) {
                    int length = (sub_chars.length * 3) / 2;
                    if (length < i5) {
                        length = i5;
                    }
                    char[] cArr = new char[length];
                    System.arraycopy(sub_chars, 0, cArr, 0, sub_chars.length);
                    sub_chars = cArr;
                }
                this.text.getChars(indexOf, indexOf2, sub_chars, i2);
                indexOf = indexOf2;
                i2 = i5;
                z = true;
            }
            if (!z) {
                for (int i6 = 0; i6 < i2; i6++) {
                    if (sub_chars[i6] == '\\') {
                        z = true;
                    }
                }
            }
            this.sbuf = sub_chars;
            this.sp = i2;
            this.np = this.bp;
            this.hasSpecial = z;
            int i7 = indexOf + 1;
            this.bp = i7;
            if (i7 >= this.len) {
                c = EOI;
            } else {
                c = this.text.charAt(i7);
            }
            this.ch = c;
            this.token = 4;
            return;
        }
        StringBuilder sb = new StringBuilder("unclosed str, ");
        sb.append(info());
        throw new JSONException(sb.toString());
    }

    public final String scanStringValue(char c) {
        String str;
        char c2;
        int i = this.bp + 1;
        int indexOf = this.text.indexOf(c, i);
        if (indexOf != -1) {
            if (V6) {
                str = this.text.substring(i, indexOf);
            } else {
                int i2 = indexOf - i;
                str = new String(sub_chars(this.bp + 1, i2), 0, i2);
            }
            if (str.indexOf(92) != -1) {
                while (true) {
                    int i3 = indexOf - 1;
                    int i4 = 0;
                    while (i3 >= 0 && this.text.charAt(i3) == '\\') {
                        i4++;
                        i3--;
                    }
                    if (i4 % 2 == 0) {
                        break;
                    }
                    indexOf = this.text.indexOf(c, indexOf + 1);
                }
                int i5 = indexOf - i;
                str = readString(sub_chars(this.bp + 1, i5), i5);
            }
            int i6 = indexOf + 1;
            this.bp = i6;
            if (i6 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i6);
            }
            this.ch = c2;
            return str;
        }
        StringBuilder sb = new StringBuilder("unclosed str, ");
        sb.append(info());
        throw new JSONException(sb.toString());
    }

    public final int intValue() {
        char c;
        boolean z;
        int i;
        char c2;
        char c3;
        int i2 = this.np;
        int i3 = this.sp + i2;
        if (i2 >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i2);
        }
        int i4 = 0;
        if (c == '-') {
            i = Integer.MIN_VALUE;
            i2++;
            z = true;
        } else {
            i = -2147483647;
            z = false;
        }
        if (i2 < i3) {
            int i5 = i2 + 1;
            if (i2 >= this.len) {
                c3 = EOI;
            } else {
                c3 = this.text.charAt(i2);
            }
            int i6 = i5;
            i4 = -(c3 - '0');
            i2 = i6;
        }
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int i7 = i2 + 1;
            if (i2 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i2);
            }
            if (c2 == 'L' || c2 == 'S' || c2 == 'B') {
                i2 = i7;
            } else {
                int i8 = c2 - '0';
                if (i4 >= -214748364) {
                    int i9 = i4 * 10;
                    if (i9 >= i + i8) {
                        i4 = i9 - i8;
                        i2 = i7;
                    } else {
                        throw new NumberFormatException(numberString());
                    }
                } else {
                    throw new NumberFormatException(numberString());
                }
            }
        }
        if (!z) {
            return -i4;
        }
        if (i2 > this.np + 1) {
            return i4;
        }
        throw new NumberFormatException(numberString());
    }

    public final byte[] bytesValue() {
        return decodeFast(this.text, this.np + 1, this.sp);
    }

    private void scanIdent() {
        this.np = this.bp - 1;
        this.hasSpecial = false;
        do {
            this.sp++;
            next();
        } while (Character.isLetterOrDigit(this.ch));
        String stringVal = stringVal();
        if (stringVal.equals("null")) {
            this.token = 8;
        } else if (stringVal.equals(SummaryActivity.CHECKED)) {
            this.token = 6;
        } else if (stringVal.equals("false")) {
            this.token = 7;
        } else if (stringVal.equals(AppSettingsData.STATUS_NEW)) {
            this.token = 9;
        } else if (stringVal.equals("undefined")) {
            this.token = 23;
        } else if (stringVal.equals("Set")) {
            this.token = 21;
        } else if (stringVal.equals("TreeSet")) {
            this.token = 22;
        } else {
            this.token = 18;
        }
    }

    public final String stringVal() {
        if (this.hasSpecial) {
            return readString(this.sbuf, this.sp);
        }
        return subString(this.np + 1, this.sp);
    }

    private final String subString(int i, int i2) {
        char[] cArr = this.sbuf;
        if (i2 < cArr.length) {
            this.text.getChars(i, i + i2, cArr, 0);
            return new String(this.sbuf, 0, i2);
        }
        char[] cArr2 = new char[i2];
        this.text.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    /* access modifiers changed from: package-private */
    public final char[] sub_chars(int i, int i2) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1758719896, oncanceled);
            onCancelLoad.getMin(-1758719896, oncanceled);
        }
        char[] cArr = this.sbuf;
        if (i2 < cArr.length) {
            this.text.getChars(i, i2 + i, cArr, 0);
            return this.sbuf;
        }
        char[] cArr2 = new char[i2];
        this.sbuf = cArr2;
        this.text.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    public final boolean isBlankInput() {
        int i = 0;
        while (true) {
            char charAt = charAt(i);
            boolean z = true;
            if (charAt == 26) {
                return true;
            }
            if (charAt > ' ' || !(charAt == ' ' || charAt == 10 || charAt == 13 || charAt == 9 || charAt == 12 || charAt == 8)) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public final void skipWhitespace() {
        while (true) {
            char c = this.ch;
            if (c > '/') {
                return;
            }
            if (c == ' ' || c == 13 || c == 10 || c == 9 || c == 12 || c == 8) {
                next();
            } else if (c == '/') {
                skipComment();
            } else {
                return;
            }
        }
    }

    public final void scanNumber() {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        int i = this.bp;
        this.np = i;
        this.exp = false;
        if (this.ch == '-') {
            this.sp++;
            int i2 = i + 1;
            this.bp = i2;
            if (i2 >= this.len) {
                c7 = EOI;
            } else {
                c7 = this.text.charAt(i2);
            }
            this.ch = c7;
        }
        while (true) {
            char c8 = this.ch;
            if (c8 < '0' || c8 > '9') {
                this.isDouble = false;
            } else {
                this.sp++;
                int i3 = this.bp + 1;
                this.bp = i3;
                if (i3 >= this.len) {
                    c6 = EOI;
                } else {
                    c6 = this.text.charAt(i3);
                }
                this.ch = c6;
            }
        }
        this.isDouble = false;
        if (this.ch == '.') {
            this.sp++;
            int i4 = this.bp + 1;
            this.bp = i4;
            if (i4 >= this.len) {
                c4 = EOI;
            } else {
                c4 = this.text.charAt(i4);
            }
            this.ch = c4;
            this.isDouble = true;
            while (true) {
                char c9 = this.ch;
                if (c9 < '0' || c9 > '9') {
                    break;
                }
                this.sp++;
                int i5 = this.bp + 1;
                this.bp = i5;
                if (i5 >= this.len) {
                    c5 = EOI;
                } else {
                    c5 = this.text.charAt(i5);
                }
                this.ch = c5;
            }
        }
        char c10 = this.ch;
        if (c10 == 'L') {
            this.sp++;
            next();
        } else if (c10 == 'S') {
            this.sp++;
            next();
        } else if (c10 == 'B') {
            this.sp++;
            next();
        } else if (c10 == 'F') {
            this.sp++;
            next();
            this.isDouble = true;
        } else if (c10 == 'D') {
            this.sp++;
            next();
            this.isDouble = true;
        } else if (c10 == 'e' || c10 == 'E') {
            this.sp++;
            int i6 = this.bp + 1;
            this.bp = i6;
            if (i6 >= this.len) {
                c = EOI;
            } else {
                c = this.text.charAt(i6);
            }
            this.ch = c;
            if (c == '+' || c == '-') {
                this.sp++;
                int i7 = this.bp + 1;
                this.bp = i7;
                if (i7 >= this.len) {
                    c3 = EOI;
                } else {
                    c3 = this.text.charAt(i7);
                }
                this.ch = c3;
            }
            while (true) {
                char c11 = this.ch;
                if (c11 < '0' || c11 > '9') {
                    char c12 = this.ch;
                } else {
                    this.sp++;
                    int i8 = this.bp + 1;
                    this.bp = i8;
                    if (i8 >= this.len) {
                        c2 = EOI;
                    } else {
                        c2 = this.text.charAt(i8);
                    }
                    this.ch = c2;
                }
            }
            char c122 = this.ch;
            if (c122 == 'D' || c122 == 'F') {
                this.sp++;
                next();
            }
            this.exp = true;
            this.isDouble = true;
        }
        if (this.isDouble) {
            this.token = 3;
        } else {
            this.token = 2;
        }
    }

    public final boolean scanBoolean() {
        boolean z = false;
        int i = 1;
        if (this.text.startsWith("false", this.bp)) {
            i = 5;
        } else if (this.text.startsWith(SummaryActivity.CHECKED, this.bp)) {
            z = true;
            i = 4;
        } else {
            char c = this.ch;
            if (c == '1') {
                z = true;
            } else if (c != '0') {
                this.matchStat = -1;
                return false;
            }
        }
        int i2 = this.bp + i;
        this.bp = i2;
        this.ch = charAt(i2);
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0211 A[Catch:{ NumberFormatException -> 0x025d }] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0229 A[Catch:{ NumberFormatException -> 0x025d }] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Number scanNumberValue() {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.bp
            r2 = 0
            r1.np = r2
            char r3 = r1.ch
            r4 = 45
            r6 = 1
            if (r3 != r4) goto L_0x0029
            r7 = -9223372036854775808
            r3 = 0
            int r3 = r3 + r6
            r1.np = r3
            int r3 = r0 + 1
            r1.bp = r3
            int r9 = r1.len
            if (r3 < r9) goto L_0x001f
            r3 = 26
            goto L_0x0025
        L_0x001f:
            java.lang.String r9 = r1.text
            char r3 = r9.charAt(r3)
        L_0x0025:
            r1.ch = r3
            r3 = 1
            goto L_0x002f
        L_0x0029:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 0
        L_0x002f:
            r9 = 0
            r11 = 0
        L_0x0032:
            char r12 = r1.ch
            r13 = 57
            r14 = 48
            if (r12 < r14) goto L_0x006f
            if (r12 > r13) goto L_0x006f
            int r12 = r12 + -48
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x0048
            r11 = 1
        L_0x0048:
            r13 = 10
            long r9 = r9 * r13
            long r12 = (long) r12
            long r14 = r7 + r12
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0054
            r11 = 1
        L_0x0054:
            long r9 = r9 - r12
            int r12 = r1.np
            int r12 = r12 + r6
            r1.np = r12
            int r12 = r1.bp
            int r12 = r12 + r6
            r1.bp = r12
            int r13 = r1.len
            if (r12 < r13) goto L_0x0066
            r12 = 26
            goto L_0x006c
        L_0x0066:
            java.lang.String r13 = r1.text
            char r12 = r13.charAt(r12)
        L_0x006c:
            r1.ch = r12
            goto L_0x0032
        L_0x006f:
            if (r3 != 0) goto L_0x0072
            long r9 = -r9
        L_0x0072:
            char r7 = r1.ch
            r8 = 76
            r12 = 68
            r15 = 70
            if (r7 != r8) goto L_0x0089
            int r7 = r1.np
            int r7 = r7 + r6
            r1.np = r7
            r17.next()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            goto L_0x00d0
        L_0x0089:
            r8 = 83
            if (r7 != r8) goto L_0x009c
            int r7 = r1.np
            int r7 = r7 + r6
            r1.np = r7
            r17.next()
            int r7 = (int) r9
            short r7 = (short) r7
            java.lang.Short r7 = java.lang.Short.valueOf(r7)
            goto L_0x00d0
        L_0x009c:
            r8 = 66
            if (r7 != r8) goto L_0x00af
            int r7 = r1.np
            int r7 = r7 + r6
            r1.np = r7
            r17.next()
            int r7 = (int) r9
            byte r7 = (byte) r7
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            goto L_0x00d0
        L_0x00af:
            if (r7 != r15) goto L_0x00bf
            int r7 = r1.np
            int r7 = r7 + r6
            r1.np = r7
            r17.next()
            float r7 = (float) r9
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            goto L_0x00d0
        L_0x00bf:
            if (r7 != r12) goto L_0x00cf
            int r7 = r1.np
            int r7 = r7 + r6
            r1.np = r7
            r17.next()
            double r7 = (double) r9
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            goto L_0x00d0
        L_0x00cf:
            r7 = 0
        L_0x00d0:
            char r8 = r1.ch
            r5 = 46
            if (r8 != r5) goto L_0x0111
            int r8 = r1.np
            int r8 = r8 + r6
            r1.np = r8
            int r8 = r1.bp
            int r8 = r8 + r6
            r1.bp = r8
            int r5 = r1.len
            if (r8 < r5) goto L_0x00e7
            r5 = 26
            goto L_0x00ed
        L_0x00e7:
            java.lang.String r5 = r1.text
            char r5 = r5.charAt(r8)
        L_0x00ed:
            r1.ch = r5
        L_0x00ef:
            char r5 = r1.ch
            if (r5 < r14) goto L_0x010f
            if (r5 > r13) goto L_0x010f
            int r5 = r1.np
            int r5 = r5 + r6
            r1.np = r5
            int r5 = r1.bp
            int r5 = r5 + r6
            r1.bp = r5
            int r8 = r1.len
            if (r5 < r8) goto L_0x0106
            r5 = 26
            goto L_0x010c
        L_0x0106:
            java.lang.String r8 = r1.text
            char r5 = r8.charAt(r5)
        L_0x010c:
            r1.ch = r5
            goto L_0x00ef
        L_0x010f:
            r5 = 1
            goto L_0x0112
        L_0x0111:
            r5 = 0
        L_0x0112:
            char r8 = r1.ch
            r2 = 101(0x65, float:1.42E-43)
            r15 = 43
            if (r8 == r2) goto L_0x0123
            r2 = 69
            if (r8 != r2) goto L_0x011f
            goto L_0x0123
        L_0x011f:
            r2 = 0
            r8 = 0
            goto L_0x018f
        L_0x0123:
            int r2 = r1.np
            int r2 = r2 + r6
            r1.np = r2
            int r2 = r1.bp
            int r2 = r2 + r6
            r1.bp = r2
            int r8 = r1.len
            if (r2 < r8) goto L_0x0134
            r2 = 26
            goto L_0x013a
        L_0x0134:
            java.lang.String r8 = r1.text
            char r2 = r8.charAt(r2)
        L_0x013a:
            r1.ch = r2
            if (r2 == r15) goto L_0x0140
            if (r2 != r4) goto L_0x0159
        L_0x0140:
            int r2 = r1.np
            int r2 = r2 + r6
            r1.np = r2
            int r2 = r1.bp
            int r2 = r2 + r6
            r1.bp = r2
            int r8 = r1.len
            if (r2 < r8) goto L_0x0151
            r2 = 26
            goto L_0x0157
        L_0x0151:
            java.lang.String r8 = r1.text
            char r2 = r8.charAt(r2)
        L_0x0157:
            r1.ch = r2
        L_0x0159:
            char r2 = r1.ch
            if (r2 < r14) goto L_0x0179
            if (r2 > r13) goto L_0x0179
            int r2 = r1.np
            int r2 = r2 + r6
            r1.np = r2
            int r2 = r1.bp
            int r2 = r2 + r6
            r1.bp = r2
            int r8 = r1.len
            if (r2 < r8) goto L_0x0170
            r2 = 26
            goto L_0x0176
        L_0x0170:
            java.lang.String r8 = r1.text
            char r2 = r8.charAt(r2)
        L_0x0176:
            r1.ch = r2
            goto L_0x0159
        L_0x0179:
            char r2 = r1.ch
            if (r2 == r12) goto L_0x0184
            r8 = 70
            if (r2 != r8) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r2 = 0
            goto L_0x018e
        L_0x0184:
            int r2 = r1.np
            int r2 = r2 + r6
            r1.np = r2
            char r2 = r1.ch
            r17.next()
        L_0x018e:
            r8 = 1
        L_0x018f:
            if (r5 != 0) goto L_0x01c6
            if (r8 != 0) goto L_0x01c6
            if (r11 == 0) goto L_0x01ab
            int r2 = r1.bp
            int r3 = r2 - r0
            char[] r3 = new char[r3]
            java.lang.String r4 = r1.text
            r5 = 0
            r4.getChars(r0, r2, r3, r5)
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            java.math.BigInteger r7 = new java.math.BigInteger
            r7.<init>(r0)
        L_0x01ab:
            if (r7 != 0) goto L_0x01c5
            r2 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x01c1
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x01c1
            int r0 = (int) r9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            goto L_0x01c5
        L_0x01c1:
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
        L_0x01c5:
            return r7
        L_0x01c6:
            int r5 = r1.bp
            int r5 = r5 - r0
            if (r2 == 0) goto L_0x01cd
            int r5 = r5 + -1
        L_0x01cd:
            char[] r7 = r1.sbuf
            int r9 = r7.length
            if (r5 >= r9) goto L_0x01dd
            java.lang.String r9 = r1.text
            int r10 = r0 + r5
            r11 = 0
            r9.getChars(r0, r10, r7, r11)
            char[] r0 = r1.sbuf
            goto L_0x01e8
        L_0x01dd:
            r11 = 0
            char[] r7 = new char[r5]
            java.lang.String r9 = r1.text
            int r10 = r0 + r5
            r9.getChars(r0, r10, r7, r11)
            r0 = r7
        L_0x01e8:
            if (r8 != 0) goto L_0x01f9
            int r7 = r1.features
            com.alibaba.fastjson.parser.Feature r9 = com.alibaba.fastjson.parser.Feature.UseBigDecimal
            int r9 = r9.mask
            r7 = r7 & r9
            if (r7 == 0) goto L_0x01f9
            java.math.BigDecimal r2 = new java.math.BigDecimal
            r2.<init>(r0, r11, r5)
            goto L_0x025c
        L_0x01f9:
            r7 = 9
            if (r5 > r7) goto L_0x0245
            if (r8 != 0) goto L_0x0245
            char r7 = r0[r11]     // Catch:{ NumberFormatException -> 0x025d }
            if (r7 == r4) goto L_0x0208
            if (r7 != r15) goto L_0x0206
            goto L_0x0208
        L_0x0206:
            r4 = 1
            goto L_0x020b
        L_0x0208:
            r4 = 2
            char r7 = r0[r6]     // Catch:{ NumberFormatException -> 0x025d }
        L_0x020b:
            int r7 = r7 - r14
            r8 = r7
            r7 = r4
            r4 = 0
        L_0x020f:
            if (r7 >= r5) goto L_0x0225
            char r9 = r0[r7]     // Catch:{ NumberFormatException -> 0x025d }
            r10 = 46
            if (r9 != r10) goto L_0x0219
            r4 = 1
            goto L_0x0222
        L_0x0219:
            int r9 = r9 + -48
            int r8 = r8 * 10
            int r8 = r8 + r9
            if (r4 == 0) goto L_0x0222
            int r4 = r4 * 10
        L_0x0222:
            int r7 = r7 + 1
            goto L_0x020f
        L_0x0225:
            r0 = 70
            if (r2 != r0) goto L_0x0234
            float r0 = (float) r8     // Catch:{ NumberFormatException -> 0x025d }
            float r2 = (float) r4     // Catch:{ NumberFormatException -> 0x025d }
            float r0 = r0 / r2
            if (r3 == 0) goto L_0x022f
            float r0 = -r0
        L_0x022f:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ NumberFormatException -> 0x025d }
            return r0
        L_0x0234:
            double r5 = (double) r8
            double r7 = (double) r4
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r7)
            double r5 = r5 / r7
            if (r3 == 0) goto L_0x0240
            double r5 = -r5
        L_0x0240:
            java.lang.Double r0 = java.lang.Double.valueOf(r5)     // Catch:{ NumberFormatException -> 0x025d }
            return r0
        L_0x0245:
            java.lang.String r3 = new java.lang.String     // Catch:{ NumberFormatException -> 0x025d }
            r4 = 0
            r3.<init>(r0, r4, r5)     // Catch:{ NumberFormatException -> 0x025d }
            r0 = 70
            if (r2 != r0) goto L_0x0254
            java.lang.Float r2 = java.lang.Float.valueOf(r3)     // Catch:{ NumberFormatException -> 0x025d }
            goto L_0x025c
        L_0x0254:
            double r2 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x025d }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ NumberFormatException -> 0x025d }
        L_0x025c:
            return r2
        L_0x025d:
            r0 = move-exception
            com.alibaba.fastjson.JSONException r2 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            java.lang.String r4 = r17.info()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3, r0)
            goto L_0x0281
        L_0x0280:
            throw r2
        L_0x0281:
            goto L_0x0280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanNumberValue():java.lang.Number");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long scanLongValue() {
        /*
            r13 = this;
            r0 = 0
            r13.np = r0
            char r1 = r13.ch
            r2 = 1
            r3 = 45
            if (r1 != r3) goto L_0x003d
            r0 = -9223372036854775808
            r3 = 0
            int r3 = r3 + r2
            r13.np = r3
            int r3 = r13.bp
            int r3 = r3 + r2
            r13.bp = r3
            int r4 = r13.len
            if (r3 >= r4) goto L_0x0024
            java.lang.String r4 = r13.text
            char r3 = r4.charAt(r3)
            r13.ch = r3
            r3 = r0
            r0 = 1
            goto L_0x0042
        L_0x0024:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "syntax error, "
            r1.<init>(r2)
            java.lang.String r2 = r13.info()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x003d:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0042:
            r5 = 0
        L_0x0044:
            char r1 = r13.ch
            r7 = 48
            if (r1 < r7) goto L_0x00bb
            r7 = 57
            if (r1 > r7) goto L_0x00bb
            int r1 = r1 + -48
            r7 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            java.lang.String r9 = ", "
            java.lang.String r10 = "error long value, "
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x009f
            r7 = 10
            long r5 = r5 * r7
            long r7 = (long) r1
            long r11 = r3 + r7
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            long r5 = r5 - r7
            int r1 = r13.np
            int r1 = r1 + r2
            r13.np = r1
            int r1 = r13.bp
            int r1 = r1 + r2
            r13.bp = r1
            int r7 = r13.len
            if (r1 < r7) goto L_0x007a
            r1 = 26
            goto L_0x0080
        L_0x007a:
            java.lang.String r7 = r13.text
            char r1 = r7.charAt(r1)
        L_0x0080:
            r13.ch = r1
            goto L_0x0044
        L_0x0083:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r5)
            r1.append(r9)
            java.lang.String r2 = r13.info()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009f:
            com.alibaba.fastjson.JSONException r0 = new com.alibaba.fastjson.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r5)
            r1.append(r9)
            java.lang.String r2 = r13.info()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00bb:
            if (r0 != 0) goto L_0x00be
            long r5 = -r5
        L_0x00be:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanLongValue():long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long longValue() throws java.lang.NumberFormatException {
        /*
            r13 = this;
            int r0 = r13.np
            int r1 = r13.sp
            int r1 = r1 + r0
            char r2 = r13.charAt(r0)
            r3 = 1
            r4 = 45
            if (r2 != r4) goto L_0x0014
            r4 = -9223372036854775808
            int r0 = r0 + 1
            r2 = 1
            goto L_0x001a
        L_0x0014:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r2 = 0
        L_0x001a:
            if (r0 >= r1) goto L_0x0028
            int r6 = r0 + 1
            char r0 = r13.charAt(r0)
            int r0 = r0 + -48
            int r0 = -r0
            long r7 = (long) r0
        L_0x0026:
            r0 = r6
            goto L_0x002a
        L_0x0028:
            r7 = 0
        L_0x002a:
            if (r0 >= r1) goto L_0x0074
            int r6 = r0 + 1
            int r9 = r13.len
            if (r0 < r9) goto L_0x0035
            r0 = 26
            goto L_0x003b
        L_0x0035:
            java.lang.String r9 = r13.text
            char r0 = r9.charAt(r0)
        L_0x003b:
            r9 = 76
            if (r0 == r9) goto L_0x0073
            r9 = 83
            if (r0 == r9) goto L_0x0073
            r9 = 66
            if (r0 == r9) goto L_0x0073
            int r0 = r0 + -48
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0069
            r9 = 10
            long r7 = r7 * r9
            long r9 = (long) r0
            long r11 = r4 + r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x005f
            long r7 = r7 - r9
            goto L_0x0026
        L_0x005f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L_0x0069:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L_0x0073:
            r0 = r6
        L_0x0074:
            if (r2 == 0) goto L_0x0086
            int r1 = r13.np
            int r1 = r1 + r3
            if (r0 <= r1) goto L_0x007c
            return r7
        L_0x007c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L_0x0086:
            long r0 = -r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.longValue():long");
    }

    public final Number decimalValue(boolean z) {
        char c;
        char[] cArr;
        boolean z2;
        int i = (this.np + this.sp) - 1;
        if (i >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i);
        }
        if (c == 'F') {
            try {
                return Float.valueOf(Float.parseFloat(numberString()));
            } catch (NumberFormatException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.getMessage());
                sb.append(", ");
                sb.append(info());
                throw new JSONException(sb.toString());
            }
        } else if (c == 'D') {
            return Double.valueOf(Double.parseDouble(numberString()));
        } else {
            if (z) {
                return decimalValue();
            }
            char charAt = this.text.charAt((this.np + this.sp) - 1);
            int i2 = this.sp;
            if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
                i2--;
            }
            int i3 = this.np;
            int i4 = 0;
            if (i2 < this.sbuf.length) {
                this.text.getChars(i3, i3 + i2, this.sbuf, 0);
                cArr = this.sbuf;
            } else {
                char[] cArr2 = new char[i2];
                this.text.getChars(i3, i3 + i2, cArr2, 0);
                cArr = cArr2;
            }
            if (i2 > 9 || this.exp) {
                return Double.valueOf(Double.parseDouble(new String(cArr, 0, i2)));
            }
            char c2 = cArr[0];
            int i5 = 2;
            if (c2 == '-') {
                c2 = cArr[1];
                z2 = true;
            } else if (c2 == '+') {
                c2 = cArr[1];
                z2 = false;
            } else {
                z2 = false;
                i5 = 1;
            }
            int i6 = c2 - '0';
            while (i5 < i2) {
                char c3 = cArr[i5];
                if (c3 == '.') {
                    i4 = 1;
                } else {
                    i6 = (i6 * 10) + (c3 - '0');
                    if (i4 != 0) {
                        i4 *= 10;
                    }
                }
                i5++;
            }
            double d = (double) i6;
            double d2 = (double) i4;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            if (z2) {
                d3 = -d3;
            }
            return Double.valueOf(d3);
        }
    }

    public final BigDecimal decimalValue() {
        char charAt = this.text.charAt((this.np + this.sp) - 1);
        int i = this.sp;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i--;
        }
        int i2 = this.np;
        char[] cArr = this.sbuf;
        if (i < cArr.length) {
            this.text.getChars(i2, i2 + i, cArr, 0);
            return new BigDecimal(this.sbuf, 0, i);
        }
        char[] cArr2 = new char[i];
        this.text.getChars(i2, i + i2, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x010e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchField(long r18) {
        /*
            r17 = this;
            r0 = r17
            char r1 = r0.ch
            int r2 = r0.bp
            r3 = 1
            int r2 = r2 + r3
            r4 = 1
        L_0x0009:
            r5 = 34
            r6 = 8
            r7 = 9
            r8 = 13
            r9 = 10
            r10 = 0
            r11 = -2
            r12 = 12
            r13 = 32
            if (r1 == r5) goto L_0x0048
            r5 = 39
            if (r1 == r5) goto L_0x0048
            if (r1 > r13) goto L_0x0041
            if (r1 == r13) goto L_0x002d
            if (r1 == r9) goto L_0x002d
            if (r1 == r8) goto L_0x002d
            if (r1 == r7) goto L_0x002d
            if (r1 == r12) goto L_0x002d
            if (r1 != r6) goto L_0x0041
        L_0x002d:
            int r1 = r0.bp
            int r5 = r4 + 1
            int r1 = r1 + r4
            int r4 = r0.len
            if (r1 < r4) goto L_0x0039
            r1 = 26
            goto L_0x003f
        L_0x0039:
            java.lang.String r4 = r0.text
            char r1 = r4.charAt(r1)
        L_0x003f:
            r4 = r5
            goto L_0x0009
        L_0x0041:
            r1 = 0
            r0.fieldHash = r1
            r0.matchStat = r11
            return r10
        L_0x0048:
            r15 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r5 = r2
            r14 = r15
        L_0x004f:
            int r6 = r0.len
            if (r5 >= r6) goto L_0x006f
            java.lang.String r6 = r0.text
            char r6 = r6.charAt(r5)
            if (r6 != r1) goto L_0x005f
            int r5 = r5 - r2
            int r5 = r5 + r3
            int r4 = r4 + r5
            goto L_0x006f
        L_0x005f:
            long r7 = (long) r6
            long r7 = r7 ^ r14
            r14 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            long r14 = r14 * r7
            int r5 = r5 + 1
            r7 = 9
            r8 = 13
            goto L_0x004f
        L_0x006f:
            int r1 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x0078
            r0.matchStat = r11
            r0.fieldHash = r14
            return r10
        L_0x0078:
            int r1 = r0.bp
            int r2 = r4 + 1
            int r1 = r1 + r4
            int r4 = r0.len
            if (r1 < r4) goto L_0x0084
            r1 = 26
            goto L_0x008a
        L_0x0084:
            java.lang.String r4 = r0.text
            char r1 = r4.charAt(r1)
        L_0x008a:
            r4 = 58
            if (r1 != r4) goto L_0x00e7
            int r1 = r0.bp
            int r1 = r1 + r2
            int r2 = r0.len
            if (r1 < r2) goto L_0x0098
            r2 = 26
            goto L_0x009e
        L_0x0098:
            java.lang.String r2 = r0.text
            char r2 = r2.charAt(r1)
        L_0x009e:
            r4 = 123(0x7b, float:1.72E-43)
            if (r2 != r4) goto L_0x00b7
            int r1 = r1 + r3
            r0.bp = r1
            int r2 = r0.len
            if (r1 < r2) goto L_0x00ac
            r14 = 26
            goto L_0x00b2
        L_0x00ac:
            java.lang.String r2 = r0.text
            char r14 = r2.charAt(r1)
        L_0x00b2:
            r0.ch = r14
            r0.token = r12
            goto L_0x00e6
        L_0x00b7:
            r4 = 91
            if (r2 != r4) goto L_0x00d2
            int r1 = r1 + r3
            r0.bp = r1
            int r2 = r0.len
            if (r1 < r2) goto L_0x00c5
            r14 = 26
            goto L_0x00cb
        L_0x00c5:
            java.lang.String r2 = r0.text
            char r14 = r2.charAt(r1)
        L_0x00cb:
            r0.ch = r14
            r1 = 14
            r0.token = r1
            goto L_0x00e6
        L_0x00d2:
            r0.bp = r1
            int r2 = r0.len
            if (r1 < r2) goto L_0x00db
            r14 = 26
            goto L_0x00e1
        L_0x00db:
            java.lang.String r2 = r0.text
            char r14 = r2.charAt(r1)
        L_0x00e1:
            r0.ch = r14
            r17.nextToken()
        L_0x00e6:
            return r3
        L_0x00e7:
            if (r1 > r13) goto L_0x0117
            if (r1 == r13) goto L_0x00fc
            if (r1 == r9) goto L_0x00fc
            r4 = 13
            r5 = 9
            if (r1 == r4) goto L_0x0100
            if (r1 == r5) goto L_0x0100
            if (r1 == r12) goto L_0x0100
            r6 = 8
            if (r1 != r6) goto L_0x0117
            goto L_0x0102
        L_0x00fc:
            r4 = 13
            r5 = 9
        L_0x0100:
            r6 = 8
        L_0x0102:
            int r1 = r0.bp
            int r7 = r2 + 1
            int r1 = r1 + r2
            int r2 = r0.len
            if (r1 < r2) goto L_0x010e
            r1 = 26
            goto L_0x0114
        L_0x010e:
            java.lang.String r2 = r0.text
            char r1 = r2.charAt(r1)
        L_0x0114:
            r2 = r7
            goto L_0x008a
        L_0x0117:
            com.alibaba.fastjson.JSONException r1 = new com.alibaba.fastjson.JSONException
            java.lang.String r2 = "match feild error expect ':'"
            r1.<init>(r2)
            goto L_0x0120
        L_0x011f:
            throw r1
        L_0x0120:
            goto L_0x011f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.matchField(long):boolean");
    }

    private int matchFieldHash(long j) {
        char c;
        char charAt;
        char c2 = this.ch;
        int i = 1;
        while (c2 != '\"' && c2 != '\'') {
            if (c2 == ' ' || c2 == 10 || c2 == 13 || c2 == 9 || c2 == 12 || c2 == 8) {
                int i2 = i + 1;
                int i3 = this.bp + i;
                if (i3 >= this.len) {
                    c2 = EOI;
                } else {
                    c2 = this.text.charAt(i3);
                }
                i = i2;
            } else {
                this.fieldHash = 0;
                this.matchStat = -2;
                return 0;
            }
        }
        long j2 = -3750763034362895579L;
        int i4 = this.bp + i;
        while (true) {
            if (i4 >= this.len) {
                break;
            }
            char charAt2 = this.text.charAt(i4);
            if (charAt2 == c2) {
                i += (i4 - this.bp) - i;
                break;
            }
            j2 = 1099511628211L * (((long) charAt2) ^ j2);
            i4++;
        }
        if (j2 != j) {
            this.fieldHash = j2;
            this.matchStat = -2;
            return 0;
        }
        int i5 = i + 1;
        int i6 = this.bp + i5;
        if (i6 >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i6);
        }
        while (c != ':') {
            if (c <= ' ') {
                if (c != ' ' && c != 10 && c != 13 && c != 9) {
                    if (!(c == 12 || c == 8)) {
                    }
                }
                int i7 = i5 + 1;
                int i8 = this.bp + i5;
                if (i8 >= this.len) {
                    charAt = EOI;
                } else {
                    charAt = this.text.charAt(i8);
                }
                i5 = i7;
            }
            throw new JSONException("match feild error expect ':'");
        }
        return i5 + 1;
    }

    public final int scanFieldInt(long j) {
        char c;
        int i;
        char c2;
        char c3;
        char c4;
        char charAt;
        char charAt2;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0;
        }
        int i2 = matchFieldHash + 1;
        int i3 = this.bp + matchFieldHash;
        int i4 = this.len;
        char c5 = EOI;
        if (i3 >= i4) {
            c = EOI;
        } else {
            c = this.text.charAt(i3);
        }
        boolean z = c == '\"';
        if (z) {
            int i5 = i2 + 1;
            int i6 = this.bp + i2;
            if (i6 >= this.len) {
                charAt2 = EOI;
            } else {
                charAt2 = this.text.charAt(i6);
            }
            i2 = i5;
            z = true;
        }
        boolean z2 = c == '-';
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.bp + i2;
            if (i8 >= this.len) {
                charAt = EOI;
            } else {
                charAt = this.text.charAt(i8);
            }
            i2 = i7;
        }
        if (c < '0' || c > '9') {
            this.matchStat = -1;
            return 0;
        }
        int i9 = c - '0';
        while (true) {
            i = i2 + 1;
            int i10 = this.bp + i2;
            if (i10 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i10);
            }
            if (c2 >= '0' && c2 <= '9') {
                i9 = (i9 * 10) + (c2 - '0');
                i2 = i;
            }
        }
        if (c2 == '.') {
            this.matchStat = -1;
            return 0;
        }
        if (c2 == '\"') {
            if (!z) {
                this.matchStat = -1;
                return 0;
            }
            int i11 = i + 1;
            int i12 = this.bp + i;
            if (i12 >= this.len) {
                c4 = EOI;
            } else {
                c4 = this.text.charAt(i12);
            }
            i = i11;
            c2 = c4;
        }
        if (i9 < 0) {
            this.matchStat = -1;
            return 0;
        }
        while (c2 != ',') {
            if (c2 <= ' ' && (c2 == ' ' || c2 == 10 || c2 == 13 || c2 == 9 || c2 == 12 || c2 == 8)) {
                int i13 = i + 1;
                int i14 = this.bp + i;
                if (i14 >= this.len) {
                    c3 = EOI;
                } else {
                    c3 = this.text.charAt(i14);
                }
                i = i13;
                c2 = c3;
            } else if (c2 == '}') {
                int i15 = i + 1;
                char charAt3 = charAt(this.bp + i);
                if (charAt3 == ',') {
                    this.token = 16;
                    int i16 = this.bp + (i15 - 1);
                    this.bp = i16;
                    int i17 = i16 + 1;
                    this.bp = i17;
                    if (i17 < this.len) {
                        c5 = this.text.charAt(i17);
                    }
                    this.ch = c5;
                } else if (charAt3 == ']') {
                    this.token = 15;
                    int i18 = this.bp + (i15 - 1);
                    this.bp = i18;
                    int i19 = i18 + 1;
                    this.bp = i19;
                    if (i19 < this.len) {
                        c5 = this.text.charAt(i19);
                    }
                    this.ch = c5;
                } else if (charAt3 == '}') {
                    this.token = 13;
                    int i20 = this.bp + (i15 - 1);
                    this.bp = i20;
                    int i21 = i20 + 1;
                    this.bp = i21;
                    if (i21 < this.len) {
                        c5 = this.text.charAt(i21);
                    }
                    this.ch = c5;
                } else if (charAt3 == 26) {
                    this.token = 20;
                    this.bp += i15 - 1;
                    this.ch = EOI;
                } else {
                    this.matchStat = -1;
                    return 0;
                }
                this.matchStat = 4;
                return z2 ? -i9 : i9;
            } else {
                this.matchStat = -1;
                return 0;
            }
        }
        int i22 = this.bp + (i - 1);
        this.bp = i22;
        int i23 = i22 + 1;
        this.bp = i23;
        if (i23 < this.len) {
            c5 = this.text.charAt(i23);
        }
        this.ch = c5;
        this.matchStat = 3;
        this.token = 16;
        return z2 ? -i9 : i9;
    }

    public final int[] scanFieldIntArray(long j) {
        char c;
        char c2;
        int i;
        int i2;
        char c3;
        boolean z;
        int[] iArr;
        int i3;
        int i4;
        char c4;
        char c5;
        char charAt;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        int[] iArr2 = null;
        if (matchFieldHash == 0) {
            return null;
        }
        int i5 = matchFieldHash + 1;
        int i6 = this.bp + matchFieldHash;
        if (i6 >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i6);
        }
        if (c != '[') {
            this.matchStat = -1;
            return null;
        }
        int i7 = i5 + 1;
        int i8 = this.bp + i5;
        if (i8 >= this.len) {
            c2 = EOI;
        } else {
            c2 = this.text.charAt(i8);
        }
        int[] iArr3 = new int[16];
        if (c2 == ']') {
            i = i7 + 1;
            int i9 = this.bp + i7;
            if (i9 >= this.len) {
                c3 = EOI;
            } else {
                c3 = this.text.charAt(i9);
            }
            i2 = 0;
        } else {
            int i10 = 0;
            while (true) {
                if (c2 == '-') {
                    int i11 = i7 + 1;
                    int i12 = this.bp + i7;
                    if (i12 >= this.len) {
                        charAt = EOI;
                    } else {
                        charAt = this.text.charAt(i12);
                    }
                    i7 = i11;
                    z = true;
                } else {
                    z = false;
                }
                if (c2 >= '0') {
                    if (c2 > '9') {
                        i3 = -1;
                        iArr = null;
                        break;
                    }
                    int i13 = c2 - '0';
                    while (true) {
                        i4 = i7 + 1;
                        int i14 = this.bp + i7;
                        if (i14 >= this.len) {
                            c4 = EOI;
                        } else {
                            c4 = this.text.charAt(i14);
                        }
                        if (c4 >= '0' && c4 <= '9') {
                            i13 = (i13 * 10) + (c4 - '0');
                            i7 = i4;
                        }
                    }
                    if (i10 >= iArr3.length) {
                        int[] iArr4 = new int[((iArr3.length * 3) / 2)];
                        System.arraycopy(iArr3, 0, iArr4, 0, i10);
                        iArr3 = iArr4;
                    }
                    i2 = i10 + 1;
                    if (z) {
                        i13 = -i13;
                    }
                    iArr3[i10] = i13;
                    if (c4 == ',') {
                        i7 = i4 + 1;
                        int i15 = this.bp + i4;
                        if (i15 >= this.len) {
                            c5 = EOI;
                        } else {
                            c5 = this.text.charAt(i15);
                        }
                        i10 = i2;
                    } else if (c4 == ']') {
                        i = i4 + 1;
                        int i16 = this.bp + i4;
                        if (i16 >= this.len) {
                            c3 = EOI;
                        } else {
                            c3 = this.text.charAt(i16);
                        }
                    } else {
                        i10 = i2;
                        c5 = c4;
                        i7 = i4;
                    }
                    iArr2 = null;
                } else {
                    iArr = iArr2;
                    i3 = -1;
                    break;
                }
            }
            this.matchStat = i3;
            return iArr;
        }
        if (i2 != iArr3.length) {
            int[] iArr5 = new int[i2];
            System.arraycopy(iArr3, 0, iArr5, 0, i2);
            iArr3 = iArr5;
        }
        if (c3 == ',') {
            this.bp += i - 1;
            next();
            this.matchStat = 3;
            this.token = 16;
            return iArr3;
        } else if (c3 == '}') {
            int i17 = i + 1;
            char charAt2 = charAt(this.bp + i);
            if (charAt2 == ',') {
                this.token = 16;
                this.bp += i17 - 1;
                next();
            } else if (charAt2 == ']') {
                this.token = 15;
                this.bp += i17 - 1;
                next();
            } else if (charAt2 == '}') {
                this.token = 13;
                this.bp += i17 - 1;
                next();
            } else if (charAt2 == 26) {
                this.bp += i17 - 1;
                this.token = 20;
                this.ch = EOI;
            } else {
                this.matchStat = -1;
                return null;
            }
            this.matchStat = 4;
            return iArr3;
        } else {
            this.matchStat = -1;
            return null;
        }
    }

    public final long scanFieldLong(long j) {
        char c;
        int i;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char charAt;
        char charAt2;
        char charAt3;
        boolean z = false;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0;
        }
        int i2 = matchFieldHash + 1;
        int i3 = this.bp + matchFieldHash;
        if (i3 >= this.len) {
            c = EOI;
        } else {
            c = this.text.charAt(i3);
        }
        boolean z2 = c == '\"';
        if (z2) {
            int i4 = i2 + 1;
            int i5 = this.bp + i2;
            if (i5 >= this.len) {
                charAt3 = EOI;
            } else {
                charAt3 = this.text.charAt(i5);
            }
            i2 = i4;
        }
        if (c == '-') {
            z = true;
        }
        if (z) {
            int i6 = i2 + 1;
            int i7 = this.bp + i2;
            if (i7 >= this.len) {
                charAt2 = EOI;
            } else {
                charAt2 = this.text.charAt(i7);
            }
            i2 = i6;
        }
        if (c < '0' || c > '9') {
            this.matchStat = -1;
            return 0;
        }
        long j2 = (long) (c - '0');
        while (true) {
            i = i2 + 1;
            int i8 = this.bp + i2;
            if (i8 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i8);
            }
            if (c2 >= '0' && c2 <= '9') {
                j2 = (j2 * 10) + ((long) (c2 - '0'));
                i2 = i;
            }
        }
        if (c2 == '.') {
            this.matchStat = -1;
            return 0;
        }
        if (c2 == '\"') {
            if (!z2) {
                this.matchStat = -1;
                return 0;
            }
            int i9 = i + 1;
            int i10 = this.bp + i;
            if (i10 >= this.len) {
                charAt = EOI;
            } else {
                charAt = this.text.charAt(i10);
            }
            i = i9;
        }
        if (j2 < 0) {
            this.matchStat = -1;
            return 0;
        } else if (c2 == ',') {
            int i11 = this.bp + (i - 1);
            this.bp = i11;
            int i12 = i11 + 1;
            this.bp = i12;
            if (i12 >= this.len) {
                c6 = EOI;
            } else {
                c6 = this.text.charAt(i12);
            }
            this.ch = c6;
            this.matchStat = 3;
            this.token = 16;
            return z ? -j2 : j2;
        } else if (c2 == '}') {
            int i13 = i + 1;
            char charAt4 = charAt(this.bp + i);
            if (charAt4 == ',') {
                this.token = 16;
                int i14 = this.bp + (i13 - 1);
                this.bp = i14;
                int i15 = i14 + 1;
                this.bp = i15;
                if (i15 >= this.len) {
                    c5 = EOI;
                } else {
                    c5 = this.text.charAt(i15);
                }
                this.ch = c5;
            } else if (charAt4 == ']') {
                this.token = 15;
                int i16 = this.bp + (i13 - 1);
                this.bp = i16;
                int i17 = i16 + 1;
                this.bp = i17;
                if (i17 >= this.len) {
                    c4 = EOI;
                } else {
                    c4 = this.text.charAt(i17);
                }
                this.ch = c4;
            } else if (charAt4 == '}') {
                this.token = 13;
                int i18 = this.bp + (i13 - 1);
                this.bp = i18;
                int i19 = i18 + 1;
                this.bp = i19;
                if (i19 >= this.len) {
                    c3 = EOI;
                } else {
                    c3 = this.text.charAt(i19);
                }
                this.ch = c3;
            } else if (charAt4 == 26) {
                this.token = 20;
                this.bp += i13 - 1;
                this.ch = EOI;
            } else {
                this.matchStat = -1;
                return 0;
            }
            this.matchStat = 4;
            return z ? -j2 : j2;
        } else {
            this.matchStat = -1;
            return 0;
        }
    }

    public final String scanFieldString(long j) {
        String str;
        char c;
        char c2;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return null;
        }
        int i = matchFieldHash + 1;
        int i2 = this.bp + matchFieldHash;
        if (i2 >= this.len) {
            StringBuilder sb = new StringBuilder("unclosed str, ");
            sb.append(info());
            throw new JSONException(sb.toString());
        } else if (this.text.charAt(i2) != '\"') {
            this.matchStat = -1;
            return this.stringDefaultValue;
        } else {
            int i3 = this.bp + i;
            int indexOf = this.text.indexOf(34, i3);
            if (indexOf != -1) {
                if (V6) {
                    str = this.text.substring(i3, indexOf);
                } else {
                    int i4 = indexOf - i3;
                    str = new String(sub_chars(this.bp + i, i4), 0, i4);
                }
                if (str.indexOf(92) != -1) {
                    boolean z = false;
                    while (true) {
                        int i5 = indexOf - 1;
                        int i6 = 0;
                        while (i5 >= 0 && this.text.charAt(i5) == '\\') {
                            i6++;
                            i5--;
                            z = true;
                        }
                        if (i6 % 2 == 0) {
                            break;
                        }
                        indexOf = this.text.indexOf(34, indexOf + 1);
                    }
                    int i7 = indexOf - i3;
                    char[] sub_chars = sub_chars(this.bp + i, i7);
                    if (z) {
                        str = readString(sub_chars, i7);
                    } else {
                        str = new String(sub_chars, 0, i7);
                        if (str.indexOf(92) != -1) {
                            str = readString(sub_chars, i7);
                        }
                    }
                }
                int i8 = indexOf + 1;
                int i9 = this.len;
                char c3 = EOI;
                if (i8 >= i9) {
                    c = EOI;
                } else {
                    c = this.text.charAt(i8);
                }
                if (c == ',') {
                    this.bp = i8;
                    int i10 = i8 + 1;
                    this.bp = i10;
                    if (i10 < this.len) {
                        c3 = this.text.charAt(i10);
                    }
                    this.ch = c3;
                    this.matchStat = 3;
                    this.token = 16;
                    return str;
                } else if (c == '}') {
                    int i11 = i8 + 1;
                    if (i11 >= this.len) {
                        c2 = EOI;
                    } else {
                        c2 = this.text.charAt(i11);
                    }
                    if (c2 == ',') {
                        this.token = 16;
                        this.bp = i11;
                        next();
                    } else if (c2 == ']') {
                        this.token = 15;
                        this.bp = i11;
                        next();
                    } else if (c2 == '}') {
                        this.token = 13;
                        this.bp = i11;
                        next();
                    } else if (c2 == 26) {
                        this.token = 20;
                        this.bp = i11;
                        this.ch = EOI;
                    } else {
                        this.matchStat = -1;
                        return this.stringDefaultValue;
                    }
                    this.matchStat = 4;
                    return str;
                } else {
                    this.matchStat = -1;
                    return this.stringDefaultValue;
                }
            } else {
                StringBuilder sb2 = new StringBuilder("unclosed str, ");
                sb2.append(info());
                throw new JSONException(sb2.toString());
            }
        }
    }

    public final Date scanFieldDate(long j) {
        char c;
        int i;
        char c2;
        Date date;
        int i2;
        char c3;
        char c4;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return null;
        }
        int i3 = this.bp;
        char c5 = this.ch;
        int i4 = matchFieldHash + 1;
        int i5 = matchFieldHash + i3;
        int i6 = this.len;
        char c6 = EOI;
        if (i5 >= i6) {
            c = EOI;
        } else {
            c = this.text.charAt(i5);
        }
        if (c == '\"') {
            int i7 = this.bp;
            int i8 = i7 + i4;
            int i9 = i4 + 1;
            int indexOf = this.text.indexOf(34, i7 + i9);
            if (indexOf != -1) {
                int i10 = indexOf - i8;
                this.bp = i8;
                if (scanISO8601DateIfMatch(false, i10)) {
                    date = this.calendar.getTime();
                    int i11 = i9 + i10;
                    i = i11 + 1;
                    c2 = charAt(i11 + i3);
                    this.bp = i3;
                } else {
                    this.bp = i3;
                    this.matchStat = -1;
                    return null;
                }
            } else {
                throw new JSONException("unclosed str");
            }
        } else if (c < '0' || c > '9') {
            this.matchStat = -1;
            return null;
        } else {
            long j2 = (long) (c - '0');
            while (true) {
                i2 = i4 + 1;
                int i12 = this.bp + i4;
                if (i12 >= this.len) {
                    c3 = EOI;
                } else {
                    c3 = this.text.charAt(i12);
                }
                if (c3 >= '0' && c3 <= '9') {
                    j2 = (j2 * 10) + ((long) (c3 - '0'));
                    i4 = i2;
                }
            }
            if (c3 == '.') {
                this.matchStat = -1;
                return null;
            }
            if (c3 == '\"') {
                int i13 = i2 + 1;
                int i14 = this.bp + i2;
                if (i14 >= this.len) {
                    c4 = EOI;
                } else {
                    c4 = this.text.charAt(i14);
                }
                c2 = c4;
                i = i13;
            } else {
                c2 = c3;
                i = i2;
            }
            if (j2 < 0) {
                this.matchStat = -1;
                return null;
            }
            date = new Date(j2);
        }
        if (c2 == ',') {
            int i15 = this.bp + (i - 1);
            this.bp = i15;
            int i16 = i15 + 1;
            this.bp = i16;
            if (i16 < this.len) {
                c6 = this.text.charAt(i16);
            }
            this.ch = c6;
            this.matchStat = 3;
            this.token = 16;
            return date;
        } else if (c2 == '}') {
            int i17 = i + 1;
            char charAt = charAt(this.bp + i);
            if (charAt == ',') {
                this.token = 16;
                int i18 = this.bp + (i17 - 1);
                this.bp = i18;
                int i19 = i18 + 1;
                this.bp = i19;
                if (i19 < this.len) {
                    c6 = this.text.charAt(i19);
                }
                this.ch = c6;
            } else if (charAt == ']') {
                this.token = 15;
                int i20 = this.bp + (i17 - 1);
                this.bp = i20;
                int i21 = i20 + 1;
                this.bp = i21;
                if (i21 < this.len) {
                    c6 = this.text.charAt(i21);
                }
                this.ch = c6;
            } else if (charAt == '}') {
                this.token = 13;
                int i22 = this.bp + (i17 - 1);
                this.bp = i22;
                int i23 = i22 + 1;
                this.bp = i23;
                if (i23 < this.len) {
                    c6 = this.text.charAt(i23);
                }
                this.ch = c6;
            } else if (charAt == 26) {
                this.token = 20;
                this.bp += i17 - 1;
                this.ch = EOI;
            } else {
                this.bp = i3;
                this.ch = c5;
                this.matchStat = -1;
                return null;
            }
            this.matchStat = 4;
            return date;
        } else {
            this.bp = i3;
            this.ch = c5;
            this.matchStat = -1;
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean scanFieldBoolean(long r13) {
        /*
            r12 = this;
            r0 = 0
            r12.matchStat = r0
            int r13 = r12.matchFieldHash(r13)
            if (r13 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.String r14 = r12.text
            int r1 = r12.bp
            int r1 = r1 + r13
            java.lang.String r2 = "false"
            boolean r14 = r14.startsWith(r2, r1)
            r1 = 4
            r2 = -1
            r3 = 3
            r4 = 1
            if (r14 == 0) goto L_0x0020
            int r13 = r13 + 5
        L_0x001d:
            r14 = 0
            goto L_0x008d
        L_0x0020:
            java.lang.String r14 = r12.text
            int r5 = r12.bp
            int r5 = r5 + r13
            java.lang.String r6 = "true"
            boolean r14 = r14.startsWith(r6, r5)
            if (r14 == 0) goto L_0x0031
            int r13 = r13 + r1
        L_0x002f:
            r14 = 1
            goto L_0x008d
        L_0x0031:
            java.lang.String r14 = r12.text
            int r5 = r12.bp
            int r5 = r5 + r13
            java.lang.String r6 = "\"false\""
            boolean r14 = r14.startsWith(r6, r5)
            if (r14 == 0) goto L_0x0041
            int r13 = r13 + 7
            goto L_0x001d
        L_0x0041:
            java.lang.String r14 = r12.text
            int r5 = r12.bp
            int r5 = r5 + r13
            java.lang.String r6 = "\"true\""
            boolean r14 = r14.startsWith(r6, r5)
            if (r14 == 0) goto L_0x0051
            int r13 = r13 + 6
            goto L_0x002f
        L_0x0051:
            java.lang.String r14 = r12.text
            int r5 = r12.bp
            int r5 = r5 + r13
            char r14 = r14.charAt(r5)
            r5 = 49
            if (r14 != r5) goto L_0x0060
            int r13 = r13 + r4
            goto L_0x002f
        L_0x0060:
            java.lang.String r14 = r12.text
            int r5 = r12.bp
            int r5 = r5 + r13
            char r14 = r14.charAt(r5)
            r5 = 48
            if (r14 != r5) goto L_0x006f
            int r13 = r13 + r4
            goto L_0x001d
        L_0x006f:
            java.lang.String r14 = r12.text
            int r5 = r12.bp
            int r5 = r5 + r13
            java.lang.String r6 = "\"1\""
            boolean r14 = r14.startsWith(r6, r5)
            if (r14 == 0) goto L_0x007e
            int r13 = r13 + r3
            goto L_0x002f
        L_0x007e:
            java.lang.String r14 = r12.text
            int r5 = r12.bp
            int r5 = r5 + r13
            java.lang.String r6 = "\"0\""
            boolean r14 = r14.startsWith(r6, r5)
            if (r14 == 0) goto L_0x0169
            int r13 = r13 + r3
            goto L_0x001d
        L_0x008d:
            int r5 = r12.bp
            int r6 = r13 + 1
            int r5 = r5 + r13
            int r13 = r12.len
            r7 = 26
            if (r5 < r13) goto L_0x009b
            r13 = 26
            goto L_0x00a1
        L_0x009b:
            java.lang.String r13 = r12.text
            char r13 = r13.charAt(r5)
        L_0x00a1:
            r5 = 16
            r8 = 44
            if (r13 != r8) goto L_0x00c2
            int r13 = r12.bp
            int r6 = r6 - r4
            int r13 = r13 + r6
            r12.bp = r13
            int r13 = r13 + r4
            r12.bp = r13
            int r0 = r12.len
            if (r13 < r0) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            java.lang.String r0 = r12.text
            char r7 = r0.charAt(r13)
        L_0x00bb:
            r12.ch = r7
            r12.matchStat = r3
            r12.token = r5
            return r14
        L_0x00c2:
            r9 = 13
            r10 = 125(0x7d, float:1.75E-43)
            if (r13 == r10) goto L_0x00f2
            r11 = 32
            if (r13 == r11) goto L_0x00de
            r11 = 10
            if (r13 == r11) goto L_0x00de
            if (r13 == r9) goto L_0x00de
            r11 = 9
            if (r13 == r11) goto L_0x00de
            r11 = 12
            if (r13 == r11) goto L_0x00de
            r11 = 8
            if (r13 != r11) goto L_0x00f2
        L_0x00de:
            int r13 = r12.bp
            int r5 = r6 + 1
            int r13 = r13 + r6
            int r6 = r12.len
            if (r13 < r6) goto L_0x00ea
            r13 = 26
            goto L_0x00f0
        L_0x00ea:
            java.lang.String r6 = r12.text
            char r13 = r6.charAt(r13)
        L_0x00f0:
            r6 = r5
            goto L_0x00a1
        L_0x00f2:
            if (r13 != r10) goto L_0x0166
            int r13 = r12.bp
            int r3 = r6 + 1
            int r13 = r13 + r6
            char r13 = r12.charAt(r13)
            if (r13 != r8) goto L_0x0118
            r12.token = r5
            int r13 = r12.bp
            int r3 = r3 - r4
            int r13 = r13 + r3
            r12.bp = r13
            int r13 = r13 + r4
            r12.bp = r13
            int r0 = r12.len
            if (r13 < r0) goto L_0x010f
            goto L_0x0115
        L_0x010f:
            java.lang.String r0 = r12.text
            char r7 = r0.charAt(r13)
        L_0x0115:
            r12.ch = r7
            goto L_0x0160
        L_0x0118:
            r5 = 93
            if (r13 != r5) goto L_0x0137
            r13 = 15
            r12.token = r13
            int r13 = r12.bp
            int r3 = r3 - r4
            int r13 = r13 + r3
            r12.bp = r13
            int r13 = r13 + r4
            r12.bp = r13
            int r0 = r12.len
            if (r13 < r0) goto L_0x012e
            goto L_0x0134
        L_0x012e:
            java.lang.String r0 = r12.text
            char r7 = r0.charAt(r13)
        L_0x0134:
            r12.ch = r7
            goto L_0x0160
        L_0x0137:
            if (r13 != r10) goto L_0x0152
            r12.token = r9
            int r13 = r12.bp
            int r3 = r3 - r4
            int r13 = r13 + r3
            r12.bp = r13
            int r13 = r13 + r4
            r12.bp = r13
            int r0 = r12.len
            if (r13 < r0) goto L_0x0149
            goto L_0x014f
        L_0x0149:
            java.lang.String r0 = r12.text
            char r7 = r0.charAt(r13)
        L_0x014f:
            r12.ch = r7
            goto L_0x0160
        L_0x0152:
            if (r13 != r7) goto L_0x0163
            r13 = 20
            r12.token = r13
            int r13 = r12.bp
            int r3 = r3 - r4
            int r13 = r13 + r3
            r12.bp = r13
            r12.ch = r7
        L_0x0160:
            r12.matchStat = r1
            return r14
        L_0x0163:
            r12.matchStat = r2
            return r0
        L_0x0166:
            r12.matchStat = r2
            return r0
        L_0x0169:
            r12.matchStat = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldBoolean(long):boolean");
    }

    public final float scanFieldFloat(long j) {
        int i;
        int i2;
        char charAt;
        int i3;
        char c;
        JSONLexer jSONLexer;
        float f;
        JSONLexer jSONLexer2;
        int i4;
        char charAt2;
        boolean z = false;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0.0f;
        }
        int i5 = matchFieldHash + 1;
        char charAt3 = charAt(this.bp + matchFieldHash);
        int i6 = (this.bp + i5) - 1;
        boolean z2 = charAt3 == '-';
        if (z2) {
            charAt3 = charAt(this.bp + i5);
            i5++;
        }
        if (charAt3 < '0' || charAt3 > '9') {
            this.matchStat = -1;
            return 0.0f;
        }
        int i7 = charAt3 - '0';
        while (true) {
            i2 = i5 + 1;
            charAt = charAt(this.bp + i5);
            if (charAt >= '0' && charAt <= '9') {
                i7 = (i * 10) + (charAt - '0');
                i5 = i2;
            }
        }
        if (charAt == '.') {
            int i8 = i2 + 1;
            char charAt4 = charAt(this.bp + i2);
            if (charAt4 < '0' || charAt4 > '9') {
                this.matchStat = -1;
                return 0.0f;
            }
            i = (i * 10) + (charAt4 - '0');
            int i9 = 10;
            while (true) {
                i4 = i8 + 1;
                charAt2 = charAt(this.bp + i8);
                if (charAt2 < '0' || charAt2 > '9') {
                    i2 = i4;
                    char c2 = charAt2;
                    i3 = i9;
                    charAt = c2;
                } else {
                    i = (i * 10) + (charAt2 - '0');
                    i9 *= 10;
                    i8 = i4;
                }
            }
            i2 = i4;
            char c22 = charAt2;
            i3 = i9;
            charAt = c22;
        } else {
            i3 = 1;
        }
        if (c == 'e' || c == 'E') {
            z = true;
        }
        if (z) {
            int i10 = i2 + 1;
            c = charAt(this.bp + i2);
            if (c == '+' || c == '-') {
                jSONLexer2 = this;
            } else {
                jSONLexer = this;
                if (c >= '0' || c > '9') {
                    i2 = i10;
                } else {
                    jSONLexer2 = jSONLexer;
                }
            }
            i10++;
            jSONLexer = jSONLexer2;
            c = jSONLexer2.charAt(jSONLexer2.bp + i10);
            if (c >= '0') {
            }
            i2 = i10;
        } else {
            jSONLexer = this;
        }
        int i11 = ((jSONLexer.bp + i2) - i6) - 1;
        if (z || i11 >= 10) {
            f = Float.parseFloat(jSONLexer.subString(i6, i11));
        } else {
            f = ((float) i) / ((float) i3);
            if (z2) {
                f = -f;
            }
        }
        if (c == ',') {
            jSONLexer.bp += i2 - 1;
            jSONLexer.next();
            jSONLexer.matchStat = 3;
            jSONLexer.token = 16;
            return f;
        } else if (c == '}') {
            int i12 = i2 + 1;
            char charAt5 = jSONLexer.charAt(jSONLexer.bp + i2);
            if (charAt5 == ',') {
                jSONLexer.token = 16;
                jSONLexer.bp += i12 - 1;
                jSONLexer.next();
            } else if (charAt5 == ']') {
                jSONLexer.token = 15;
                jSONLexer.bp += i12 - 1;
                jSONLexer.next();
            } else if (charAt5 == '}') {
                jSONLexer.token = 13;
                jSONLexer.bp += i12 - 1;
                jSONLexer.next();
            } else if (charAt5 == 26) {
                jSONLexer.bp += i12 - 1;
                jSONLexer.token = 20;
                jSONLexer.ch = EOI;
            } else {
                jSONLexer.matchStat = -1;
                return 0.0f;
            }
            jSONLexer.matchStat = 4;
            return f;
        } else {
            jSONLexer.matchStat = -1;
            return 0.0f;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d2, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0112 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float[] scanFieldFloatArray(long r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r0.matchStat = r1
            int r2 = r18.matchFieldHash(r19)
            r3 = 0
            if (r2 != 0) goto L_0x000d
            return r3
        L_0x000d:
            int r4 = r0.bp
            int r5 = r2 + 1
            int r4 = r4 + r2
            int r2 = r0.len
            if (r4 < r2) goto L_0x0019
            r2 = 26
            goto L_0x001f
        L_0x0019:
            java.lang.String r2 = r0.text
            char r2 = r2.charAt(r4)
        L_0x001f:
            r4 = 91
            r7 = -1
            if (r2 == r4) goto L_0x0027
            r0.matchStat = r7
            return r3
        L_0x0027:
            int r2 = r0.bp
            int r4 = r5 + 1
            int r2 = r2 + r5
            int r5 = r0.len
            if (r2 < r5) goto L_0x0033
            r2 = 26
            goto L_0x0039
        L_0x0033:
            java.lang.String r5 = r0.text
            char r2 = r5.charAt(r2)
        L_0x0039:
            r5 = 16
            float[] r8 = new float[r5]
            r9 = 0
        L_0x003e:
            int r10 = r0.bp
            int r10 = r10 + r4
            r11 = 1
            int r10 = r10 - r11
            r12 = 45
            if (r2 != r12) goto L_0x0049
            r13 = 1
            goto L_0x004a
        L_0x0049:
            r13 = 0
        L_0x004a:
            if (r13 == 0) goto L_0x005f
            int r2 = r0.bp
            int r14 = r4 + 1
            int r2 = r2 + r4
            int r4 = r0.len
            if (r2 < r4) goto L_0x0058
            r2 = 26
            goto L_0x005e
        L_0x0058:
            java.lang.String r4 = r0.text
            char r2 = r4.charAt(r2)
        L_0x005e:
            r4 = r14
        L_0x005f:
            r14 = 48
            if (r2 < r14) goto L_0x0213
            r15 = 57
            if (r2 > r15) goto L_0x0213
            int r2 = r2 + -48
        L_0x0069:
            int r6 = r0.bp
            int r16 = r4 + 1
            int r6 = r6 + r4
            int r4 = r0.len
            if (r6 < r4) goto L_0x0075
            r4 = 26
            goto L_0x007b
        L_0x0075:
            java.lang.String r4 = r0.text
            char r4 = r4.charAt(r6)
        L_0x007b:
            if (r4 < r14) goto L_0x0087
            if (r4 > r15) goto L_0x0087
            int r2 = r2 * 10
            int r4 = r4 + -48
            int r2 = r2 + r4
            r4 = r16
            goto L_0x0069
        L_0x0087:
            r6 = 46
            if (r4 != r6) goto L_0x008d
            r6 = 1
            goto L_0x008e
        L_0x008d:
            r6 = 0
        L_0x008e:
            r5 = 10
            if (r6 == 0) goto L_0x00d3
            int r4 = r0.bp
            int r6 = r16 + 1
            int r4 = r4 + r16
            int r1 = r0.len
            if (r4 < r1) goto L_0x009f
            r1 = 26
            goto L_0x00a5
        L_0x009f:
            java.lang.String r1 = r0.text
            char r1 = r1.charAt(r4)
        L_0x00a5:
            if (r1 < r14) goto L_0x00d0
            if (r1 > r15) goto L_0x00d0
            int r2 = r2 * 10
            int r1 = r1 + -48
            int r2 = r2 + r1
            r1 = 10
        L_0x00b0:
            int r4 = r0.bp
            int r16 = r6 + 1
            int r4 = r4 + r6
            int r6 = r0.len
            if (r4 < r6) goto L_0x00bc
            r4 = 26
            goto L_0x00c2
        L_0x00bc:
            java.lang.String r6 = r0.text
            char r4 = r6.charAt(r4)
        L_0x00c2:
            if (r4 < r14) goto L_0x00d4
            if (r4 > r15) goto L_0x00d4
            int r2 = r2 * 10
            int r4 = r4 + -48
            int r2 = r2 + r4
            int r1 = r1 * 10
            r6 = r16
            goto L_0x00b0
        L_0x00d0:
            r0.matchStat = r7
            return r3
        L_0x00d3:
            r1 = 1
        L_0x00d4:
            r6 = 101(0x65, float:1.42E-43)
            if (r4 == r6) goto L_0x00df
            r6 = 69
            if (r4 != r6) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r6 = 0
            goto L_0x00e0
        L_0x00df:
            r6 = 1
        L_0x00e0:
            if (r6 == 0) goto L_0x0129
            int r4 = r0.bp
            int r17 = r16 + 1
            int r4 = r4 + r16
            int r3 = r0.len
            if (r4 < r3) goto L_0x00ef
            r3 = 26
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r3 = r0.text
            char r3 = r3.charAt(r4)
        L_0x00f5:
            r4 = 43
            if (r3 == r4) goto L_0x00fb
            if (r3 != r12) goto L_0x0110
        L_0x00fb:
            int r3 = r0.bp
            int r4 = r17 + 1
            int r3 = r3 + r17
            int r12 = r0.len
            if (r3 < r12) goto L_0x0108
        L_0x0105:
            r3 = 26
            goto L_0x010e
        L_0x0108:
            java.lang.String r12 = r0.text
            char r3 = r12.charAt(r3)
        L_0x010e:
            r17 = r4
        L_0x0110:
            if (r3 < r14) goto L_0x0126
            if (r3 > r15) goto L_0x0126
            int r3 = r0.bp
            int r4 = r17 + 1
            int r3 = r3 + r17
            int r12 = r0.len
            if (r3 < r12) goto L_0x011f
            goto L_0x0105
        L_0x011f:
            java.lang.String r12 = r0.text
            char r3 = r12.charAt(r3)
            goto L_0x010e
        L_0x0126:
            r4 = r17
            goto L_0x012c
        L_0x0129:
            r3 = r4
            r4 = r16
        L_0x012c:
            int r12 = r0.bp
            int r12 = r12 + r4
            int r12 = r12 - r10
            int r12 = r12 - r11
            if (r6 != 0) goto L_0x013c
            if (r12 >= r5) goto L_0x013c
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            if (r13 == 0) goto L_0x0144
            float r2 = -r2
            goto L_0x0144
        L_0x013c:
            java.lang.String r1 = r0.subString(r10, r12)
            float r2 = java.lang.Float.parseFloat(r1)
        L_0x0144:
            int r1 = r8.length
            r5 = 3
            if (r9 < r1) goto L_0x0154
            int r1 = r8.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            float[] r1 = new float[r1]
            r6 = 0
            java.lang.System.arraycopy(r8, r6, r1, r6, r9)
            r8 = r1
        L_0x0154:
            int r6 = r9 + 1
            r8[r9] = r2
            r1 = 44
            if (r3 != r1) goto L_0x0177
            int r1 = r0.bp
            int r2 = r4 + 1
            int r1 = r1 + r4
            int r3 = r0.len
            if (r1 < r3) goto L_0x0168
            r1 = 26
            goto L_0x016e
        L_0x0168:
            java.lang.String r3 = r0.text
            char r1 = r3.charAt(r1)
        L_0x016e:
            r4 = r2
            r9 = r6
            r3 = 0
            r5 = 16
            r2 = r1
            r1 = 0
            goto L_0x003e
        L_0x0177:
            r2 = 93
            if (r3 != r2) goto L_0x020b
            int r3 = r0.bp
            int r9 = r4 + 1
            int r3 = r3 + r4
            int r4 = r0.len
            if (r3 < r4) goto L_0x0187
            r3 = 26
            goto L_0x018d
        L_0x0187:
            java.lang.String r4 = r0.text
            char r3 = r4.charAt(r3)
        L_0x018d:
            int r4 = r8.length
            if (r6 == r4) goto L_0x0197
            float[] r4 = new float[r6]
            r10 = 0
            java.lang.System.arraycopy(r8, r10, r4, r10, r6)
            r8 = r4
        L_0x0197:
            if (r3 != r1) goto L_0x01a9
            int r1 = r0.bp
            int r9 = r9 - r11
            int r1 = r1 + r9
            r0.bp = r1
            r18.next()
            r0.matchStat = r5
            r1 = 16
            r0.token = r1
            return r8
        L_0x01a9:
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 != r4) goto L_0x0207
            int r3 = r0.bp
            int r5 = r9 + 1
            int r3 = r3 + r9
            int r6 = r0.len
            if (r3 < r6) goto L_0x01b9
            r3 = 26
            goto L_0x01bf
        L_0x01b9:
            java.lang.String r6 = r0.text
            char r3 = r6.charAt(r3)
        L_0x01bf:
            if (r3 != r1) goto L_0x01cf
            r1 = 16
            r0.token = r1
            int r1 = r0.bp
            int r5 = r5 - r11
            int r1 = r1 + r5
            r0.bp = r1
            r18.next()
            goto L_0x01ff
        L_0x01cf:
            if (r3 != r2) goto L_0x01df
            r1 = 15
            r0.token = r1
            int r1 = r0.bp
            int r5 = r5 - r11
            int r1 = r1 + r5
            r0.bp = r1
            r18.next()
            goto L_0x01ff
        L_0x01df:
            if (r3 != r4) goto L_0x01ef
            r1 = 13
            r0.token = r1
            int r1 = r0.bp
            int r5 = r5 - r11
            int r1 = r1 + r5
            r0.bp = r1
            r18.next()
            goto L_0x01ff
        L_0x01ef:
            r2 = 26
            if (r3 != r2) goto L_0x0203
            int r1 = r0.bp
            int r5 = r5 - r11
            int r1 = r1 + r5
            r0.bp = r1
            r1 = 20
            r0.token = r1
            r0.ch = r2
        L_0x01ff:
            r1 = 4
            r0.matchStat = r1
            return r8
        L_0x0203:
            r0.matchStat = r7
            r5 = 0
            return r5
        L_0x0207:
            r5 = 0
            r0.matchStat = r7
            return r5
        L_0x020b:
            r2 = r3
            r9 = r6
            r1 = 0
            r3 = 0
            r5 = 16
            goto L_0x003e
        L_0x0213:
            r5 = r3
            r0.matchStat = r7
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldFloatArray(long):float[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x017b, code lost:
        r6 = r17 + 1;
        r1 = r0.bp + r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0183, code lost:
        if (r1 < r0.len) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0185, code lost:
        r1 = EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0188, code lost:
        r1 = r0.text.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x018f, code lost:
        if (r2 == r10.length) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0191, code lost:
        r11 = new float[r2];
        r12 = 0;
        java.lang.System.arraycopy(r10, 0, r11, 0, r2);
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0199, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x019b, code lost:
        if (r9 < r8.length) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x019d, code lost:
        r8 = new float[((r8.length * 3) / 2)][];
        java.lang.System.arraycopy(r10, r12, r8, r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01a7, code lost:
        r2 = r9 + 1;
        r8[r9] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ab, code lost:
        if (r1 != ',') goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01ad, code lost:
        r5 = r6 + 1;
        r9 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01b7, code lost:
        if (r1 != ']') goto L_0x0243;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01b9, code lost:
        r9 = r6 + 1;
        r1 = r0.bp + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01c0, code lost:
        if (r1 < r0.len) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01c2, code lost:
        r1 = EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01c5, code lost:
        r1 = r0.text.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01cc, code lost:
        if (r2 == r8.length) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01ce, code lost:
        r6 = new float[r2][];
        java.lang.System.arraycopy(r8, 0, r6, 0, r2);
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01d5, code lost:
        if (r1 != ',') goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01d7, code lost:
        r0.bp += r9 - 1;
        next();
        r0.matchStat = 3;
        r0.token = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01e7, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ec, code lost:
        if (r1 != '}') goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01ee, code lost:
        r6 = r9 + 1;
        r1 = charAt(r0.bp + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01f7, code lost:
        if (r1 != ',') goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01f9, code lost:
        r0.token = 16;
        r0.bp += r6 - 1;
        next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0207, code lost:
        if (r1 != ']') goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0209, code lost:
        r0.token = 15;
        r0.bp += r6 - 1;
        next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0217, code lost:
        if (r1 != '}') goto L_0x0227;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0219, code lost:
        r0.token = 13;
        r0.bp += r6 - 1;
        next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0229, code lost:
        if (r1 != 26) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x022b, code lost:
        r0.bp += r6 - 1;
        r0.token = 20;
        r0.ch = EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0237, code lost:
        r0.matchStat = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x023a, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x023b, code lost:
        r0.matchStat = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x023e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x023f, code lost:
        r0.matchStat = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0242, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0243, code lost:
        r9 = r2;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0255, code lost:
        return r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0116 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float[][] scanFieldFloatArray2(long r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 0
            r0.matchStat = r1
            int r2 = r20.matchFieldHash(r21)
            r3 = 0
            if (r2 != 0) goto L_0x000d
            return r3
        L_0x000d:
            int r4 = r0.bp
            int r5 = r2 + 1
            int r4 = r4 + r2
            int r2 = r0.len
            if (r4 < r2) goto L_0x0019
            r2 = 26
            goto L_0x001f
        L_0x0019:
            java.lang.String r2 = r0.text
            char r2 = r2.charAt(r4)
        L_0x001f:
            r4 = 91
            r7 = -1
            if (r2 == r4) goto L_0x0027
            r0.matchStat = r7
            return r3
        L_0x0027:
            r2 = 1
            int r5 = r5 + r2
            r4 = 16
            float[][] r8 = new float[r4][]
            r9 = 0
        L_0x002e:
            int r10 = r0.bp
            int r11 = r5 + 1
            int r10 = r10 + r5
            int r5 = r0.len
            if (r10 < r5) goto L_0x003a
            r5 = 26
            goto L_0x0040
        L_0x003a:
            java.lang.String r5 = r0.text
            char r5 = r5.charAt(r10)
        L_0x0040:
            float[] r10 = new float[r4]
            r12 = 0
        L_0x0043:
            int r13 = r0.bp
            int r13 = r13 + r11
            int r13 = r13 - r2
            r14 = 45
            if (r5 != r14) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            if (r15 == 0) goto L_0x0064
            int r5 = r0.bp
            int r16 = r11 + 1
            int r5 = r5 + r11
            int r11 = r0.len
            if (r5 < r11) goto L_0x005c
            r5 = 26
            goto L_0x0062
        L_0x005c:
            java.lang.String r11 = r0.text
            char r5 = r11.charAt(r5)
        L_0x0062:
            r11 = r16
        L_0x0064:
            r6 = 48
            if (r5 < r6) goto L_0x0252
            r4 = 57
            if (r5 > r4) goto L_0x0252
            int r5 = r5 + -48
        L_0x006e:
            int r1 = r0.bp
            int r17 = r11 + 1
            int r1 = r1 + r11
            int r11 = r0.len
            if (r1 < r11) goto L_0x007a
            r1 = 26
            goto L_0x0080
        L_0x007a:
            java.lang.String r11 = r0.text
            char r1 = r11.charAt(r1)
        L_0x0080:
            if (r1 < r6) goto L_0x008c
            if (r1 > r4) goto L_0x008c
            int r5 = r5 * 10
            int r1 = r1 + -48
            int r5 = r5 + r1
            r11 = r17
            goto L_0x006e
        L_0x008c:
            r11 = 46
            if (r1 != r11) goto L_0x00d7
            int r1 = r0.bp
            int r11 = r17 + 1
            int r1 = r1 + r17
            int r2 = r0.len
            if (r1 < r2) goto L_0x009d
            r1 = 26
            goto L_0x00a3
        L_0x009d:
            java.lang.String r2 = r0.text
            char r1 = r2.charAt(r1)
        L_0x00a3:
            if (r1 < r6) goto L_0x00d4
            if (r1 > r4) goto L_0x00d4
            int r5 = r5 * 10
            int r1 = r1 + -48
            int r5 = r5 + r1
            r1 = 10
        L_0x00ae:
            int r2 = r0.bp
            int r17 = r11 + 1
            int r2 = r2 + r11
            int r11 = r0.len
            if (r2 < r11) goto L_0x00ba
            r2 = 26
            goto L_0x00c0
        L_0x00ba:
            java.lang.String r11 = r0.text
            char r2 = r11.charAt(r2)
        L_0x00c0:
            if (r2 < r6) goto L_0x00ce
            if (r2 > r4) goto L_0x00ce
            int r5 = r5 * 10
            int r2 = r2 + -48
            int r5 = r5 + r2
            int r1 = r1 * 10
            r11 = r17
            goto L_0x00ae
        L_0x00ce:
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x00d8
        L_0x00d4:
            r0.matchStat = r7
            return r3
        L_0x00d7:
            r2 = 1
        L_0x00d8:
            r11 = 101(0x65, float:1.42E-43)
            if (r1 == r11) goto L_0x00e3
            r11 = 69
            if (r1 != r11) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r11 = 0
            goto L_0x00e4
        L_0x00e3:
            r11 = 1
        L_0x00e4:
            if (r11 == 0) goto L_0x012c
            int r1 = r0.bp
            int r18 = r17 + 1
            int r1 = r1 + r17
            int r3 = r0.len
            if (r1 < r3) goto L_0x00f3
            r1 = 26
            goto L_0x00f9
        L_0x00f3:
            java.lang.String r3 = r0.text
            char r1 = r3.charAt(r1)
        L_0x00f9:
            r3 = 43
            if (r1 == r3) goto L_0x00ff
            if (r1 != r14) goto L_0x0114
        L_0x00ff:
            int r1 = r0.bp
            int r3 = r18 + 1
            int r1 = r1 + r18
            int r14 = r0.len
            if (r1 < r14) goto L_0x010c
        L_0x0109:
            r1 = 26
            goto L_0x0112
        L_0x010c:
            java.lang.String r14 = r0.text
            char r1 = r14.charAt(r1)
        L_0x0112:
            r18 = r3
        L_0x0114:
            if (r1 < r6) goto L_0x012a
            if (r1 > r4) goto L_0x012a
            int r1 = r0.bp
            int r3 = r18 + 1
            int r1 = r1 + r18
            int r14 = r0.len
            if (r1 < r14) goto L_0x0123
            goto L_0x0109
        L_0x0123:
            java.lang.String r14 = r0.text
            char r1 = r14.charAt(r1)
            goto L_0x0112
        L_0x012a:
            r17 = r18
        L_0x012c:
            int r3 = r0.bp
            int r3 = r3 + r17
            int r3 = r3 - r13
            r4 = 1
            int r3 = r3 - r4
            if (r11 != 0) goto L_0x0140
            r4 = 10
            if (r3 >= r4) goto L_0x0140
            float r3 = (float) r5
            float r2 = (float) r2
            float r3 = r3 / r2
            if (r15 == 0) goto L_0x0148
            float r3 = -r3
            goto L_0x0148
        L_0x0140:
            java.lang.String r2 = r0.subString(r13, r3)
            float r3 = java.lang.Float.parseFloat(r2)
        L_0x0148:
            int r2 = r10.length
            r4 = 3
            if (r12 < r2) goto L_0x0158
            int r2 = r10.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            float[] r2 = new float[r2]
            r5 = 0
            java.lang.System.arraycopy(r10, r5, r2, r5, r12)
            r10 = r2
        L_0x0158:
            int r2 = r12 + 1
            r10[r12] = r3
            r3 = 44
            if (r1 != r3) goto L_0x0177
            int r1 = r0.bp
            int r11 = r17 + 1
            int r1 = r1 + r17
            int r3 = r0.len
            if (r1 < r3) goto L_0x016d
            r5 = 26
            goto L_0x0174
        L_0x016d:
            java.lang.String r3 = r0.text
            char r1 = r3.charAt(r1)
            r5 = r1
        L_0x0174:
            r12 = r2
            goto L_0x024b
        L_0x0177:
            r5 = 93
            if (r1 != r5) goto L_0x0247
            int r1 = r0.bp
            int r6 = r17 + 1
            int r1 = r1 + r17
            int r11 = r0.len
            if (r1 < r11) goto L_0x0188
            r1 = 26
            goto L_0x018e
        L_0x0188:
            java.lang.String r11 = r0.text
            char r1 = r11.charAt(r1)
        L_0x018e:
            int r11 = r10.length
            if (r2 == r11) goto L_0x0199
            float[] r11 = new float[r2]
            r12 = 0
            java.lang.System.arraycopy(r10, r12, r11, r12, r2)
            r10 = r11
            goto L_0x019a
        L_0x0199:
            r12 = 0
        L_0x019a:
            int r11 = r8.length
            if (r9 < r11) goto L_0x01a7
            int r8 = r8.length
            int r8 = r8 * 3
            int r8 = r8 / 2
            float[][] r8 = new float[r8][]
            java.lang.System.arraycopy(r10, r12, r8, r12, r2)
        L_0x01a7:
            int r2 = r9 + 1
            r8[r9] = r10
            if (r1 != r3) goto L_0x01b7
            int r5 = r6 + 1
            r9 = r2
        L_0x01b0:
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 16
            goto L_0x002e
        L_0x01b7:
            if (r1 != r5) goto L_0x0243
            int r1 = r0.bp
            int r9 = r6 + 1
            int r1 = r1 + r6
            int r6 = r0.len
            if (r1 < r6) goto L_0x01c5
            r1 = 26
            goto L_0x01cb
        L_0x01c5:
            java.lang.String r6 = r0.text
            char r1 = r6.charAt(r1)
        L_0x01cb:
            int r6 = r8.length
            if (r2 == r6) goto L_0x01d5
            float[][] r6 = new float[r2][]
            r11 = 0
            java.lang.System.arraycopy(r8, r11, r6, r11, r2)
            r8 = r6
        L_0x01d5:
            if (r1 != r3) goto L_0x01e8
            int r1 = r0.bp
            r2 = 1
            int r9 = r9 - r2
            int r1 = r1 + r9
            r0.bp = r1
            r20.next()
            r0.matchStat = r4
            r4 = 16
            r0.token = r4
            return r8
        L_0x01e8:
            r4 = 16
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x023f
            int r1 = r0.bp
            int r6 = r9 + 1
            int r1 = r1 + r9
            char r1 = r0.charAt(r1)
            if (r1 != r3) goto L_0x0206
            r0.token = r4
            int r1 = r0.bp
            r3 = 1
            int r6 = r6 - r3
            int r1 = r1 + r6
            r0.bp = r1
            r20.next()
            goto L_0x0237
        L_0x0206:
            r3 = 1
            if (r1 != r5) goto L_0x0217
            r1 = 15
            r0.token = r1
            int r1 = r0.bp
            int r6 = r6 - r3
            int r1 = r1 + r6
            r0.bp = r1
            r20.next()
            goto L_0x0237
        L_0x0217:
            if (r1 != r2) goto L_0x0227
            r1 = 13
            r0.token = r1
            int r1 = r0.bp
            int r6 = r6 - r3
            int r1 = r1 + r6
            r0.bp = r1
            r20.next()
            goto L_0x0237
        L_0x0227:
            r5 = 26
            if (r1 != r5) goto L_0x023b
            int r1 = r0.bp
            int r6 = r6 - r3
            int r1 = r1 + r6
            r0.bp = r1
            r1 = 20
            r0.token = r1
            r0.ch = r5
        L_0x0237:
            r1 = 4
            r0.matchStat = r1
            return r8
        L_0x023b:
            r0.matchStat = r7
            r12 = 0
            return r12
        L_0x023f:
            r12 = 0
            r0.matchStat = r7
            return r12
        L_0x0243:
            r9 = r2
            r5 = r6
            goto L_0x01b0
        L_0x0247:
            r5 = r1
            r12 = r2
            r11 = r17
        L_0x024b:
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 16
            goto L_0x0043
        L_0x0252:
            r12 = r3
            r0.matchStat = r7
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldFloatArray2(long):float[][]");
    }

    public final double scanFieldDouble(long j) {
        int i;
        int i2;
        char charAt;
        int i3;
        char c;
        JSONLexer jSONLexer;
        double d;
        JSONLexer jSONLexer2;
        int i4;
        char charAt2;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0.0d;
        }
        int i5 = matchFieldHash + 1;
        char charAt3 = charAt(this.bp + matchFieldHash);
        int i6 = (this.bp + i5) - 1;
        boolean z = charAt3 == '-';
        if (z) {
            charAt3 = charAt(this.bp + i5);
            i5++;
        }
        if (charAt3 < '0' || charAt3 > '9') {
            this.matchStat = -1;
            return 0.0d;
        }
        int i7 = charAt3 - '0';
        while (true) {
            i2 = i5 + 1;
            charAt = charAt(this.bp + i5);
            if (charAt >= '0' && charAt <= '9') {
                i7 = (i * 10) + (charAt - '0');
                i5 = i2;
            }
        }
        if (charAt == '.') {
            int i8 = i2 + 1;
            char charAt4 = charAt(this.bp + i2);
            if (charAt4 < '0' || charAt4 > '9') {
                this.matchStat = -1;
                return 0.0d;
            }
            i = (i * 10) + (charAt4 - '0');
            int i9 = 10;
            while (true) {
                i4 = i8 + 1;
                charAt2 = charAt(this.bp + i8);
                if (charAt2 < '0' || charAt2 > '9') {
                    i2 = i4;
                    char c2 = charAt2;
                    i3 = i9;
                    charAt = c2;
                } else {
                    i = (i * 10) + (charAt2 - '0');
                    i9 *= 10;
                    i8 = i4;
                }
            }
            i2 = i4;
            char c22 = charAt2;
            i3 = i9;
            charAt = c22;
        } else {
            i3 = 1;
        }
        boolean z2 = c == 'e' || c == 'E';
        if (z2) {
            int i10 = i2 + 1;
            c = charAt(this.bp + i2);
            if (c == '+' || c == '-') {
                jSONLexer2 = this;
            } else {
                jSONLexer = this;
                if (c >= '0' || c > '9') {
                    i2 = i10;
                } else {
                    jSONLexer2 = jSONLexer;
                }
            }
            i10++;
            jSONLexer = jSONLexer2;
            c = jSONLexer2.charAt(jSONLexer2.bp + i10);
            if (c >= '0') {
            }
            i2 = i10;
        } else {
            jSONLexer = this;
        }
        int i11 = ((jSONLexer.bp + i2) - i6) - 1;
        if (z2 || i11 >= 10) {
            d = Double.parseDouble(jSONLexer.subString(i6, i11));
        } else {
            double d2 = (double) i;
            double d3 = (double) i3;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 / d3;
            if (z) {
                d = -d;
            }
        }
        if (c == ',') {
            jSONLexer.bp += i2 - 1;
            jSONLexer.next();
            jSONLexer.matchStat = 3;
            jSONLexer.token = 16;
            return d;
        } else if (c == '}') {
            int i12 = i2 + 1;
            char charAt5 = jSONLexer.charAt(jSONLexer.bp + i2);
            if (charAt5 == ',') {
                jSONLexer.token = 16;
                jSONLexer.bp += i12 - 1;
                jSONLexer.next();
            } else if (charAt5 == ']') {
                jSONLexer.token = 15;
                jSONLexer.bp += i12 - 1;
                jSONLexer.next();
            } else if (charAt5 == '}') {
                jSONLexer.token = 13;
                jSONLexer.bp += i12 - 1;
                jSONLexer.next();
            } else if (charAt5 == 26) {
                jSONLexer.bp += i12 - 1;
                jSONLexer.token = 20;
                jSONLexer.ch = EOI;
            } else {
                jSONLexer.matchStat = -1;
                return 0.0d;
            }
            jSONLexer.matchStat = 4;
            return d;
        } else {
            jSONLexer.matchStat = -1;
            return 0.0d;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d2, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0112 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double[] scanFieldDoubleArray(long r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r0.matchStat = r1
            int r2 = r18.matchFieldHash(r19)
            r3 = 0
            if (r2 != 0) goto L_0x000d
            return r3
        L_0x000d:
            int r4 = r0.bp
            int r5 = r2 + 1
            int r4 = r4 + r2
            int r2 = r0.len
            if (r4 < r2) goto L_0x0019
            r2 = 26
            goto L_0x001f
        L_0x0019:
            java.lang.String r2 = r0.text
            char r2 = r2.charAt(r4)
        L_0x001f:
            r4 = 91
            r7 = -1
            if (r2 == r4) goto L_0x0027
            r0.matchStat = r7
            return r3
        L_0x0027:
            int r2 = r0.bp
            int r4 = r5 + 1
            int r2 = r2 + r5
            int r5 = r0.len
            if (r2 < r5) goto L_0x0033
            r2 = 26
            goto L_0x0039
        L_0x0033:
            java.lang.String r5 = r0.text
            char r2 = r5.charAt(r2)
        L_0x0039:
            r5 = 16
            double[] r8 = new double[r5]
            r9 = 0
        L_0x003e:
            int r10 = r0.bp
            int r10 = r10 + r4
            r11 = 1
            int r10 = r10 - r11
            r12 = 45
            if (r2 != r12) goto L_0x0049
            r13 = 1
            goto L_0x004a
        L_0x0049:
            r13 = 0
        L_0x004a:
            if (r13 == 0) goto L_0x005f
            int r2 = r0.bp
            int r14 = r4 + 1
            int r2 = r2 + r4
            int r4 = r0.len
            if (r2 < r4) goto L_0x0058
            r2 = 26
            goto L_0x005e
        L_0x0058:
            java.lang.String r4 = r0.text
            char r2 = r4.charAt(r2)
        L_0x005e:
            r4 = r14
        L_0x005f:
            r14 = 48
            if (r2 < r14) goto L_0x0219
            r15 = 57
            if (r2 > r15) goto L_0x0219
            int r2 = r2 + -48
        L_0x0069:
            int r6 = r0.bp
            int r16 = r4 + 1
            int r6 = r6 + r4
            int r4 = r0.len
            if (r6 < r4) goto L_0x0075
            r4 = 26
            goto L_0x007b
        L_0x0075:
            java.lang.String r4 = r0.text
            char r4 = r4.charAt(r6)
        L_0x007b:
            if (r4 < r14) goto L_0x0087
            if (r4 > r15) goto L_0x0087
            int r2 = r2 * 10
            int r4 = r4 + -48
            int r2 = r2 + r4
            r4 = r16
            goto L_0x0069
        L_0x0087:
            r6 = 46
            if (r4 != r6) goto L_0x008d
            r6 = 1
            goto L_0x008e
        L_0x008d:
            r6 = 0
        L_0x008e:
            r5 = 10
            if (r6 == 0) goto L_0x00d3
            int r4 = r0.bp
            int r6 = r16 + 1
            int r4 = r4 + r16
            int r1 = r0.len
            if (r4 < r1) goto L_0x009f
            r1 = 26
            goto L_0x00a5
        L_0x009f:
            java.lang.String r1 = r0.text
            char r1 = r1.charAt(r4)
        L_0x00a5:
            if (r1 < r14) goto L_0x00d0
            if (r1 > r15) goto L_0x00d0
            int r2 = r2 * 10
            int r1 = r1 + -48
            int r2 = r2 + r1
            r1 = 10
        L_0x00b0:
            int r4 = r0.bp
            int r16 = r6 + 1
            int r4 = r4 + r6
            int r6 = r0.len
            if (r4 < r6) goto L_0x00bc
            r4 = 26
            goto L_0x00c2
        L_0x00bc:
            java.lang.String r6 = r0.text
            char r4 = r6.charAt(r4)
        L_0x00c2:
            if (r4 < r14) goto L_0x00d4
            if (r4 > r15) goto L_0x00d4
            int r2 = r2 * 10
            int r4 = r4 + -48
            int r2 = r2 + r4
            int r1 = r1 * 10
            r6 = r16
            goto L_0x00b0
        L_0x00d0:
            r0.matchStat = r7
            return r3
        L_0x00d3:
            r1 = 1
        L_0x00d4:
            r6 = 101(0x65, float:1.42E-43)
            if (r4 == r6) goto L_0x00df
            r6 = 69
            if (r4 != r6) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            r6 = 0
            goto L_0x00e0
        L_0x00df:
            r6 = 1
        L_0x00e0:
            if (r6 == 0) goto L_0x0129
            int r4 = r0.bp
            int r17 = r16 + 1
            int r4 = r4 + r16
            int r3 = r0.len
            if (r4 < r3) goto L_0x00ef
            r3 = 26
            goto L_0x00f5
        L_0x00ef:
            java.lang.String r3 = r0.text
            char r3 = r3.charAt(r4)
        L_0x00f5:
            r4 = 43
            if (r3 == r4) goto L_0x00fb
            if (r3 != r12) goto L_0x0110
        L_0x00fb:
            int r3 = r0.bp
            int r4 = r17 + 1
            int r3 = r3 + r17
            int r12 = r0.len
            if (r3 < r12) goto L_0x0108
        L_0x0105:
            r3 = 26
            goto L_0x010e
        L_0x0108:
            java.lang.String r12 = r0.text
            char r3 = r12.charAt(r3)
        L_0x010e:
            r17 = r4
        L_0x0110:
            if (r3 < r14) goto L_0x0126
            if (r3 > r15) goto L_0x0126
            int r3 = r0.bp
            int r4 = r17 + 1
            int r3 = r3 + r17
            int r12 = r0.len
            if (r3 < r12) goto L_0x011f
            goto L_0x0105
        L_0x011f:
            java.lang.String r12 = r0.text
            char r3 = r12.charAt(r3)
            goto L_0x010e
        L_0x0126:
            r4 = r17
            goto L_0x012c
        L_0x0129:
            r3 = r4
            r4 = r16
        L_0x012c:
            int r12 = r0.bp
            int r12 = r12 + r4
            int r12 = r12 - r10
            int r12 = r12 - r11
            if (r6 != 0) goto L_0x0142
            if (r12 >= r5) goto L_0x0142
            double r5 = (double) r2
            double r1 = (double) r1
            java.lang.Double.isNaN(r5)
            java.lang.Double.isNaN(r1)
            double r5 = r5 / r1
            if (r13 == 0) goto L_0x014a
            double r5 = -r5
            goto L_0x014a
        L_0x0142:
            java.lang.String r1 = r0.subString(r10, r12)
            double r5 = java.lang.Double.parseDouble(r1)
        L_0x014a:
            int r1 = r8.length
            r2 = 3
            if (r9 < r1) goto L_0x015a
            int r1 = r8.length
            int r1 = r1 * 3
            int r1 = r1 / 2
            double[] r1 = new double[r1]
            r10 = 0
            java.lang.System.arraycopy(r8, r10, r1, r10, r9)
            r8 = r1
        L_0x015a:
            int r10 = r9 + 1
            r8[r9] = r5
            r1 = 44
            if (r3 != r1) goto L_0x017d
            int r1 = r0.bp
            int r2 = r4 + 1
            int r1 = r1 + r4
            int r3 = r0.len
            if (r1 < r3) goto L_0x016e
            r1 = 26
            goto L_0x0174
        L_0x016e:
            java.lang.String r3 = r0.text
            char r1 = r3.charAt(r1)
        L_0x0174:
            r4 = r2
            r9 = r10
            r3 = 0
            r5 = 16
            r2 = r1
            r1 = 0
            goto L_0x003e
        L_0x017d:
            r5 = 93
            if (r3 != r5) goto L_0x0211
            int r3 = r0.bp
            int r6 = r4 + 1
            int r3 = r3 + r4
            int r4 = r0.len
            if (r3 < r4) goto L_0x018d
            r3 = 26
            goto L_0x0193
        L_0x018d:
            java.lang.String r4 = r0.text
            char r3 = r4.charAt(r3)
        L_0x0193:
            int r4 = r8.length
            if (r10 == r4) goto L_0x019d
            double[] r4 = new double[r10]
            r9 = 0
            java.lang.System.arraycopy(r8, r9, r4, r9, r10)
            r8 = r4
        L_0x019d:
            if (r3 != r1) goto L_0x01af
            int r1 = r0.bp
            int r6 = r6 - r11
            int r1 = r1 + r6
            r0.bp = r1
            r18.next()
            r0.matchStat = r2
            r1 = 16
            r0.token = r1
            return r8
        L_0x01af:
            r2 = 125(0x7d, float:1.75E-43)
            if (r3 != r2) goto L_0x020d
            int r3 = r0.bp
            int r4 = r6 + 1
            int r3 = r3 + r6
            int r6 = r0.len
            if (r3 < r6) goto L_0x01bf
            r3 = 26
            goto L_0x01c5
        L_0x01bf:
            java.lang.String r6 = r0.text
            char r3 = r6.charAt(r3)
        L_0x01c5:
            if (r3 != r1) goto L_0x01d5
            r1 = 16
            r0.token = r1
            int r1 = r0.bp
            int r4 = r4 - r11
            int r1 = r1 + r4
            r0.bp = r1
            r18.next()
            goto L_0x0205
        L_0x01d5:
            if (r3 != r5) goto L_0x01e5
            r1 = 15
            r0.token = r1
            int r1 = r0.bp
            int r4 = r4 - r11
            int r1 = r1 + r4
            r0.bp = r1
            r18.next()
            goto L_0x0205
        L_0x01e5:
            if (r3 != r2) goto L_0x01f5
            r1 = 13
            r0.token = r1
            int r1 = r0.bp
            int r4 = r4 - r11
            int r1 = r1 + r4
            r0.bp = r1
            r18.next()
            goto L_0x0205
        L_0x01f5:
            r2 = 26
            if (r3 != r2) goto L_0x0209
            int r1 = r0.bp
            int r4 = r4 - r11
            int r1 = r1 + r4
            r0.bp = r1
            r1 = 20
            r0.token = r1
            r0.ch = r2
        L_0x0205:
            r1 = 4
            r0.matchStat = r1
            return r8
        L_0x0209:
            r0.matchStat = r7
            r5 = 0
            return r5
        L_0x020d:
            r5 = 0
            r0.matchStat = r7
            return r5
        L_0x0211:
            r2 = r3
            r9 = r10
            r1 = 0
            r3 = 0
            r5 = 16
            goto L_0x003e
        L_0x0219:
            r5 = r3
            r0.matchStat = r7
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldDoubleArray(long):double[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0181, code lost:
        r6 = r17 + 1;
        r1 = r0.bp + r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0189, code lost:
        if (r1 < r0.len) goto L_0x018e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x018b, code lost:
        r1 = EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x018e, code lost:
        r1 = r0.text.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0195, code lost:
        if (r2 == r10.length) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0197, code lost:
        r11 = new double[r2];
        r12 = 0;
        java.lang.System.arraycopy(r10, 0, r11, 0, r2);
        r10 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x019f, code lost:
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01a1, code lost:
        if (r9 < r8.length) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01a3, code lost:
        r8 = new double[((r8.length * 3) / 2)][];
        java.lang.System.arraycopy(r10, r12, r8, r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ad, code lost:
        r2 = r9 + 1;
        r8[r9] = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01b1, code lost:
        if (r1 != ',') goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b3, code lost:
        r5 = r6 + 1;
        r9 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01bd, code lost:
        if (r1 != ']') goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01bf, code lost:
        r9 = r6 + 1;
        r1 = r0.bp + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01c6, code lost:
        if (r1 < r0.len) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01c8, code lost:
        r1 = EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01cb, code lost:
        r1 = r0.text.charAt(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d2, code lost:
        if (r2 == r8.length) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01d4, code lost:
        r6 = new double[r2][];
        java.lang.System.arraycopy(r8, 0, r6, 0, r2);
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01db, code lost:
        if (r1 != ',') goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01dd, code lost:
        r0.bp += r9 - 1;
        next();
        r0.matchStat = 3;
        r0.token = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01ed, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01f2, code lost:
        if (r1 != '}') goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x01f4, code lost:
        r6 = r9 + 1;
        r1 = charAt(r0.bp + r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01fd, code lost:
        if (r1 != ',') goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01ff, code lost:
        r0.token = 16;
        r0.bp += r6 - 1;
        next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x020d, code lost:
        if (r1 != ']') goto L_0x021d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x020f, code lost:
        r0.token = 15;
        r0.bp += r6 - 1;
        next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x021d, code lost:
        if (r1 != '}') goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x021f, code lost:
        r0.token = 13;
        r0.bp += r6 - 1;
        next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x022f, code lost:
        if (r1 != 26) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0231, code lost:
        r0.bp += r6 - 1;
        r0.token = 20;
        r0.ch = EOI;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x023d, code lost:
        r0.matchStat = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0240, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0241, code lost:
        r0.matchStat = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0244, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0245, code lost:
        r0.matchStat = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0248, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0249, code lost:
        r9 = r2;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x025b, code lost:
        return r12;
     */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0116 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double[][] scanFieldDoubleArray2(long r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 0
            r0.matchStat = r1
            int r2 = r20.matchFieldHash(r21)
            r3 = 0
            if (r2 != 0) goto L_0x000d
            return r3
        L_0x000d:
            int r4 = r0.bp
            int r5 = r2 + 1
            int r4 = r4 + r2
            int r2 = r0.len
            if (r4 < r2) goto L_0x0019
            r2 = 26
            goto L_0x001f
        L_0x0019:
            java.lang.String r2 = r0.text
            char r2 = r2.charAt(r4)
        L_0x001f:
            r4 = 91
            r7 = -1
            if (r2 == r4) goto L_0x0027
            r0.matchStat = r7
            return r3
        L_0x0027:
            r2 = 1
            int r5 = r5 + r2
            r4 = 16
            double[][] r8 = new double[r4][]
            r9 = 0
        L_0x002e:
            int r10 = r0.bp
            int r11 = r5 + 1
            int r10 = r10 + r5
            int r5 = r0.len
            if (r10 < r5) goto L_0x003a
            r5 = 26
            goto L_0x0040
        L_0x003a:
            java.lang.String r5 = r0.text
            char r5 = r5.charAt(r10)
        L_0x0040:
            double[] r10 = new double[r4]
            r12 = 0
        L_0x0043:
            int r13 = r0.bp
            int r13 = r13 + r11
            int r13 = r13 - r2
            r14 = 45
            if (r5 != r14) goto L_0x004d
            r15 = 1
            goto L_0x004e
        L_0x004d:
            r15 = 0
        L_0x004e:
            if (r15 == 0) goto L_0x0064
            int r5 = r0.bp
            int r16 = r11 + 1
            int r5 = r5 + r11
            int r11 = r0.len
            if (r5 < r11) goto L_0x005c
            r5 = 26
            goto L_0x0062
        L_0x005c:
            java.lang.String r11 = r0.text
            char r5 = r11.charAt(r5)
        L_0x0062:
            r11 = r16
        L_0x0064:
            r6 = 48
            if (r5 < r6) goto L_0x0258
            r4 = 57
            if (r5 > r4) goto L_0x0258
            int r5 = r5 + -48
        L_0x006e:
            int r1 = r0.bp
            int r17 = r11 + 1
            int r1 = r1 + r11
            int r11 = r0.len
            if (r1 < r11) goto L_0x007a
            r1 = 26
            goto L_0x0080
        L_0x007a:
            java.lang.String r11 = r0.text
            char r1 = r11.charAt(r1)
        L_0x0080:
            if (r1 < r6) goto L_0x008c
            if (r1 > r4) goto L_0x008c
            int r5 = r5 * 10
            int r1 = r1 + -48
            int r5 = r5 + r1
            r11 = r17
            goto L_0x006e
        L_0x008c:
            r11 = 46
            if (r1 != r11) goto L_0x00d7
            int r1 = r0.bp
            int r11 = r17 + 1
            int r1 = r1 + r17
            int r2 = r0.len
            if (r1 < r2) goto L_0x009d
            r1 = 26
            goto L_0x00a3
        L_0x009d:
            java.lang.String r2 = r0.text
            char r1 = r2.charAt(r1)
        L_0x00a3:
            if (r1 < r6) goto L_0x00d4
            if (r1 > r4) goto L_0x00d4
            int r5 = r5 * 10
            int r1 = r1 + -48
            int r5 = r5 + r1
            r1 = 10
        L_0x00ae:
            int r2 = r0.bp
            int r17 = r11 + 1
            int r2 = r2 + r11
            int r11 = r0.len
            if (r2 < r11) goto L_0x00ba
            r2 = 26
            goto L_0x00c0
        L_0x00ba:
            java.lang.String r11 = r0.text
            char r2 = r11.charAt(r2)
        L_0x00c0:
            if (r2 < r6) goto L_0x00ce
            if (r2 > r4) goto L_0x00ce
            int r5 = r5 * 10
            int r2 = r2 + -48
            int r5 = r5 + r2
            int r1 = r1 * 10
            r11 = r17
            goto L_0x00ae
        L_0x00ce:
            r19 = r2
            r2 = r1
            r1 = r19
            goto L_0x00d8
        L_0x00d4:
            r0.matchStat = r7
            return r3
        L_0x00d7:
            r2 = 1
        L_0x00d8:
            r11 = 101(0x65, float:1.42E-43)
            if (r1 == r11) goto L_0x00e3
            r11 = 69
            if (r1 != r11) goto L_0x00e1
            goto L_0x00e3
        L_0x00e1:
            r11 = 0
            goto L_0x00e4
        L_0x00e3:
            r11 = 1
        L_0x00e4:
            if (r11 == 0) goto L_0x012c
            int r1 = r0.bp
            int r18 = r17 + 1
            int r1 = r1 + r17
            int r3 = r0.len
            if (r1 < r3) goto L_0x00f3
            r1 = 26
            goto L_0x00f9
        L_0x00f3:
            java.lang.String r3 = r0.text
            char r1 = r3.charAt(r1)
        L_0x00f9:
            r3 = 43
            if (r1 == r3) goto L_0x00ff
            if (r1 != r14) goto L_0x0114
        L_0x00ff:
            int r1 = r0.bp
            int r3 = r18 + 1
            int r1 = r1 + r18
            int r14 = r0.len
            if (r1 < r14) goto L_0x010c
        L_0x0109:
            r1 = 26
            goto L_0x0112
        L_0x010c:
            java.lang.String r14 = r0.text
            char r1 = r14.charAt(r1)
        L_0x0112:
            r18 = r3
        L_0x0114:
            if (r1 < r6) goto L_0x012a
            if (r1 > r4) goto L_0x012a
            int r1 = r0.bp
            int r3 = r18 + 1
            int r1 = r1 + r18
            int r14 = r0.len
            if (r1 < r14) goto L_0x0123
            goto L_0x0109
        L_0x0123:
            java.lang.String r14 = r0.text
            char r1 = r14.charAt(r1)
            goto L_0x0112
        L_0x012a:
            r17 = r18
        L_0x012c:
            int r3 = r0.bp
            int r3 = r3 + r17
            int r3 = r3 - r13
            r4 = 1
            int r3 = r3 - r4
            if (r11 != 0) goto L_0x0146
            r4 = 10
            if (r3 >= r4) goto L_0x0146
            double r3 = (double) r5
            double r5 = (double) r2
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r5)
            double r3 = r3 / r5
            if (r15 == 0) goto L_0x014e
            double r3 = -r3
            goto L_0x014e
        L_0x0146:
            java.lang.String r2 = r0.subString(r13, r3)
            double r3 = java.lang.Double.parseDouble(r2)
        L_0x014e:
            int r2 = r10.length
            r5 = 3
            if (r12 < r2) goto L_0x015e
            int r2 = r10.length
            int r2 = r2 * 3
            int r2 = r2 / 2
            double[] r2 = new double[r2]
            r6 = 0
            java.lang.System.arraycopy(r10, r6, r2, r6, r12)
            r10 = r2
        L_0x015e:
            int r2 = r12 + 1
            r10[r12] = r3
            r3 = 44
            if (r1 != r3) goto L_0x017d
            int r1 = r0.bp
            int r11 = r17 + 1
            int r1 = r1 + r17
            int r3 = r0.len
            if (r1 < r3) goto L_0x0173
            r5 = 26
            goto L_0x017a
        L_0x0173:
            java.lang.String r3 = r0.text
            char r1 = r3.charAt(r1)
            r5 = r1
        L_0x017a:
            r12 = r2
            goto L_0x0251
        L_0x017d:
            r4 = 93
            if (r1 != r4) goto L_0x024d
            int r1 = r0.bp
            int r6 = r17 + 1
            int r1 = r1 + r17
            int r11 = r0.len
            if (r1 < r11) goto L_0x018e
            r1 = 26
            goto L_0x0194
        L_0x018e:
            java.lang.String r11 = r0.text
            char r1 = r11.charAt(r1)
        L_0x0194:
            int r11 = r10.length
            if (r2 == r11) goto L_0x019f
            double[] r11 = new double[r2]
            r12 = 0
            java.lang.System.arraycopy(r10, r12, r11, r12, r2)
            r10 = r11
            goto L_0x01a0
        L_0x019f:
            r12 = 0
        L_0x01a0:
            int r11 = r8.length
            if (r9 < r11) goto L_0x01ad
            int r8 = r8.length
            int r8 = r8 * 3
            int r8 = r8 / 2
            double[][] r8 = new double[r8][]
            java.lang.System.arraycopy(r10, r12, r8, r12, r2)
        L_0x01ad:
            int r2 = r9 + 1
            r8[r9] = r10
            if (r1 != r3) goto L_0x01bd
            int r5 = r6 + 1
            r9 = r2
        L_0x01b6:
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 16
            goto L_0x002e
        L_0x01bd:
            if (r1 != r4) goto L_0x0249
            int r1 = r0.bp
            int r9 = r6 + 1
            int r1 = r1 + r6
            int r6 = r0.len
            if (r1 < r6) goto L_0x01cb
            r1 = 26
            goto L_0x01d1
        L_0x01cb:
            java.lang.String r6 = r0.text
            char r1 = r6.charAt(r1)
        L_0x01d1:
            int r6 = r8.length
            if (r2 == r6) goto L_0x01db
            double[][] r6 = new double[r2][]
            r11 = 0
            java.lang.System.arraycopy(r8, r11, r6, r11, r2)
            r8 = r6
        L_0x01db:
            if (r1 != r3) goto L_0x01ee
            int r1 = r0.bp
            r2 = 1
            int r9 = r9 - r2
            int r1 = r1 + r9
            r0.bp = r1
            r20.next()
            r0.matchStat = r5
            r5 = 16
            r0.token = r5
            return r8
        L_0x01ee:
            r5 = 16
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 != r2) goto L_0x0245
            int r1 = r0.bp
            int r6 = r9 + 1
            int r1 = r1 + r9
            char r1 = r0.charAt(r1)
            if (r1 != r3) goto L_0x020c
            r0.token = r5
            int r1 = r0.bp
            r3 = 1
            int r6 = r6 - r3
            int r1 = r1 + r6
            r0.bp = r1
            r20.next()
            goto L_0x023d
        L_0x020c:
            r3 = 1
            if (r1 != r4) goto L_0x021d
            r1 = 15
            r0.token = r1
            int r1 = r0.bp
            int r6 = r6 - r3
            int r1 = r1 + r6
            r0.bp = r1
            r20.next()
            goto L_0x023d
        L_0x021d:
            if (r1 != r2) goto L_0x022d
            r1 = 13
            r0.token = r1
            int r1 = r0.bp
            int r6 = r6 - r3
            int r1 = r1 + r6
            r0.bp = r1
            r20.next()
            goto L_0x023d
        L_0x022d:
            r4 = 26
            if (r1 != r4) goto L_0x0241
            int r1 = r0.bp
            int r6 = r6 - r3
            int r1 = r1 + r6
            r0.bp = r1
            r1 = 20
            r0.token = r1
            r0.ch = r4
        L_0x023d:
            r1 = 4
            r0.matchStat = r1
            return r8
        L_0x0241:
            r0.matchStat = r7
            r12 = 0
            return r12
        L_0x0245:
            r12 = 0
            r0.matchStat = r7
            return r12
        L_0x0249:
            r9 = r2
            r5 = r6
            goto L_0x01b6
        L_0x024d:
            r5 = r1
            r12 = r2
            r11 = r17
        L_0x0251:
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 16
            goto L_0x0043
        L_0x0258:
            r12 = r3
            r0.matchStat = r7
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanFieldDoubleArray2(long):double[][]");
    }

    public final long scanFieldSymbol(long j) {
        char c;
        char c2;
        char c3;
        char c4;
        this.matchStat = 0;
        int matchFieldHash = matchFieldHash(j);
        if (matchFieldHash == 0) {
            return 0;
        }
        int i = matchFieldHash + 1;
        int i2 = this.bp + matchFieldHash;
        int i3 = this.len;
        char c5 = EOI;
        if (i2 >= i3) {
            c = EOI;
        } else {
            c = this.text.charAt(i2);
        }
        if (c != '\"') {
            this.matchStat = -1;
            return 0;
        }
        long j2 = -3750763034362895579L;
        while (true) {
            int i4 = i + 1;
            int i5 = this.bp + i;
            if (i5 >= this.len) {
                c2 = EOI;
            } else {
                c2 = this.text.charAt(i5);
            }
            if (c2 == '\"') {
                int i6 = i4 + 1;
                int i7 = this.bp + i4;
                if (i7 >= this.len) {
                    c3 = EOI;
                } else {
                    c3 = this.text.charAt(i7);
                }
                if (c3 == ',') {
                    int i8 = this.bp + (i6 - 1);
                    this.bp = i8;
                    int i9 = i8 + 1;
                    this.bp = i9;
                    if (i9 < this.len) {
                        c5 = this.text.charAt(i9);
                    }
                    this.ch = c5;
                    this.matchStat = 3;
                    return j2;
                } else if (c3 == '}') {
                    int i10 = i6 + 1;
                    int i11 = this.bp + i6;
                    if (i11 >= this.len) {
                        c4 = EOI;
                    } else {
                        c4 = this.text.charAt(i11);
                    }
                    if (c4 == ',') {
                        this.token = 16;
                        this.bp += i10 - 1;
                        next();
                    } else if (c4 == ']') {
                        this.token = 15;
                        this.bp += i10 - 1;
                        next();
                    } else if (c4 == '}') {
                        this.token = 13;
                        this.bp += i10 - 1;
                        next();
                    } else if (c4 == 26) {
                        this.token = 20;
                        this.bp += i10 - 1;
                        this.ch = EOI;
                    } else {
                        this.matchStat = -1;
                        return 0;
                    }
                    this.matchStat = 4;
                    return j2;
                } else {
                    this.matchStat = -1;
                    return 0;
                }
            } else {
                j2 = (j2 ^ ((long) c2)) * 1099511628211L;
                if (c2 == '\\') {
                    this.matchStat = -1;
                    return 0;
                }
                i = i4;
            }
        }
    }

    public final boolean scanISO8601DateIfMatch(boolean z) {
        return scanISO8601DateIfMatch(z, this.len - this.bp);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean scanISO8601DateIfMatch(boolean r36, int r37) {
        /*
            r35 = this;
            r9 = r35
            r10 = r37
            r0 = 47
            r11 = 13
            r12 = 57
            r13 = 6
            r14 = 3
            r15 = 2
            r8 = 5
            r16 = 1
            r7 = 48
            r6 = 0
            if (r36 != 0) goto L_0x00a8
            if (r10 <= r11) goto L_0x00a8
            int r1 = r9.bp
            char r1 = r9.charAt(r1)
            int r2 = r9.bp
            int r2 = r2 + 1
            char r2 = r9.charAt(r2)
            int r3 = r9.bp
            int r3 = r3 + r15
            char r3 = r9.charAt(r3)
            int r4 = r9.bp
            int r4 = r4 + r14
            char r4 = r9.charAt(r4)
            int r5 = r9.bp
            int r5 = r5 + 4
            char r5 = r9.charAt(r5)
            int r11 = r9.bp
            int r11 = r11 + r8
            char r11 = r9.charAt(r11)
            int r14 = r9.bp
            int r14 = r14 + r10
            int r14 = r14 + -1
            char r14 = r9.charAt(r14)
            int r8 = r9.bp
            int r8 = r8 + r10
            int r8 = r8 - r15
            char r8 = r9.charAt(r8)
            if (r1 != r0) goto L_0x00a8
            r1 = 68
            if (r2 != r1) goto L_0x00a8
            r1 = 97
            if (r3 != r1) goto L_0x00a8
            r1 = 116(0x74, float:1.63E-43)
            if (r4 != r1) goto L_0x00a8
            r1 = 101(0x65, float:1.42E-43)
            if (r5 != r1) goto L_0x00a8
            r1 = 40
            if (r11 != r1) goto L_0x00a8
            if (r14 != r0) goto L_0x00a8
            r1 = 41
            if (r8 != r1) goto L_0x00a8
            r0 = -1
            r1 = 6
        L_0x0071:
            if (r1 >= r10) goto L_0x0087
            int r2 = r9.bp
            int r2 = r2 + r1
            char r2 = r9.charAt(r2)
            r3 = 43
            if (r2 != r3) goto L_0x0080
            r0 = r1
            goto L_0x0084
        L_0x0080:
            if (r2 < r7) goto L_0x0087
            if (r2 > r12) goto L_0x0087
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x0071
        L_0x0087:
            r1 = -1
            if (r0 != r1) goto L_0x008b
            return r6
        L_0x008b:
            int r1 = r9.bp
            int r1 = r1 + r13
            int r0 = r0 - r1
            java.lang.String r0 = r9.subString(r1, r0)
            long r0 = java.lang.Long.parseLong(r0)
            java.util.TimeZone r2 = r9.timeZone
            java.util.Locale r3 = r9.locale
            java.util.Calendar r2 = java.util.Calendar.getInstance(r2, r3)
            r9.calendar = r2
            r2.setTimeInMillis(r0)
            r0 = 5
            r9.token = r0
            return r16
        L_0x00a8:
            r11 = 84
            r14 = 16
            r4 = 8
            r3 = 9
            r2 = 14
            r1 = 45
            r20 = 10
            if (r10 == r4) goto L_0x04ab
            if (r10 == r2) goto L_0x04ab
            if (r10 != r14) goto L_0x00ca
            int r2 = r9.bp
            int r2 = r2 + 10
            char r2 = r9.charAt(r2)
            if (r2 == r11) goto L_0x04ab
            r5 = 32
            if (r2 == r5) goto L_0x04ab
        L_0x00ca:
            r2 = 17
            if (r10 != r2) goto L_0x00d9
            int r2 = r9.bp
            int r2 = r2 + r13
            char r2 = r9.charAt(r2)
            if (r2 == r1) goto L_0x00d9
            goto L_0x04ab
        L_0x00d9:
            if (r10 >= r3) goto L_0x00dc
            return r6
        L_0x00dc:
            int r2 = r9.bp
            char r2 = r9.charAt(r2)
            int r5 = r9.bp
            int r5 = r5 + 1
            char r5 = r9.charAt(r5)
            int r14 = r9.bp
            int r14 = r14 + r15
            char r14 = r9.charAt(r14)
            int r7 = r9.bp
            r18 = 3
            int r7 = r7 + 3
            char r7 = r9.charAt(r7)
            int r8 = r9.bp
            int r8 = r8 + 4
            char r8 = r9.charAt(r8)
            int r12 = r9.bp
            r19 = 5
            int r12 = r12 + 5
            char r12 = r9.charAt(r12)
            int r15 = r9.bp
            int r15 = r15 + r13
            char r15 = r9.charAt(r15)
            int r13 = r9.bp
            int r13 = r13 + 7
            char r13 = r9.charAt(r13)
            int r11 = r9.bp
            int r11 = r11 + r4
            char r11 = r9.charAt(r11)
            int r4 = r9.bp
            int r4 = r4 + r3
            char r4 = r9.charAt(r4)
            r6 = 26085(0x65e5, float:3.6553E-41)
            if (r8 != r1) goto L_0x0130
            if (r13 == r1) goto L_0x0134
        L_0x0130:
            if (r8 != r0) goto L_0x0141
            if (r13 != r0) goto L_0x0141
        L_0x0134:
            r8 = 51068(0xc77c, float:7.1562E-41)
            r13 = 10
        L_0x0139:
            r34 = r11
            r11 = r4
            r4 = r7
            r7 = r34
            goto L_0x01e2
        L_0x0141:
            if (r8 != r1) goto L_0x0163
            if (r15 != r1) goto L_0x0163
            r0 = 32
            if (r11 != r0) goto L_0x0157
            r4 = r7
            r15 = r12
            r11 = r13
            r7 = 48
            r8 = 51068(0xc77c, float:7.1562E-41)
            r12 = 48
            r13 = 8
            goto L_0x01e2
        L_0x0157:
            r4 = r7
            r15 = r12
            r7 = r13
            r8 = 51068(0xc77c, float:7.1562E-41)
            r12 = 48
            r13 = 9
            goto L_0x01e2
        L_0x0163:
            r0 = 46
            if (r14 != r0) goto L_0x016b
            r0 = 46
            if (r12 == r0) goto L_0x016f
        L_0x016b:
            if (r14 != r1) goto L_0x017d
            if (r12 != r1) goto L_0x017d
        L_0x016f:
            r12 = r7
            r14 = r11
            r7 = r2
            r11 = r5
            r5 = r13
            r2 = r15
            r13 = 10
            r15 = r8
            r8 = 51068(0xc77c, float:7.1562E-41)
            goto L_0x01e2
        L_0x017d:
            r0 = 24180(0x5e74, float:3.3883E-41)
            if (r8 == r0) goto L_0x0189
            r0 = 45380(0xb144, float:6.3591E-41)
            if (r8 != r0) goto L_0x0187
            goto L_0x0189
        L_0x0187:
            r0 = 0
            return r0
        L_0x0189:
            r0 = 26376(0x6708, float:3.696E-41)
            if (r13 == r0) goto L_0x01ba
            r0 = 50900(0xc6d4, float:7.1326E-41)
            if (r13 != r0) goto L_0x0193
            goto L_0x01ba
        L_0x0193:
            r0 = 26376(0x6708, float:3.696E-41)
            if (r15 == r0) goto L_0x019f
            r0 = 50900(0xc6d4, float:7.1326E-41)
            if (r15 != r0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r0 = 0
            return r0
        L_0x019f:
            r0 = 0
            r8 = 51068(0xc77c, float:7.1562E-41)
            if (r11 == r6) goto L_0x01b2
            if (r11 != r8) goto L_0x01a8
            goto L_0x01b2
        L_0x01a8:
            if (r4 == r6) goto L_0x01ae
            if (r4 != r8) goto L_0x01ad
            goto L_0x01ae
        L_0x01ad:
            return r0
        L_0x01ae:
            r4 = r7
            r15 = r12
            r7 = r13
            goto L_0x01b7
        L_0x01b2:
            r4 = r7
            r15 = r12
            r11 = r13
            r7 = 48
        L_0x01b7:
            r12 = 48
            goto L_0x01e0
        L_0x01ba:
            r8 = 51068(0xc77c, float:7.1562E-41)
            if (r4 == r6) goto L_0x01dd
            if (r4 != r8) goto L_0x01c2
            goto L_0x01dd
        L_0x01c2:
            int r0 = r9.bp
            int r0 = r0 + 10
            char r0 = r9.charAt(r0)
            if (r0 == r6) goto L_0x01d9
            int r0 = r9.bp
            int r0 = r0 + 10
            char r0 = r9.charAt(r0)
            if (r0 != r8) goto L_0x01d7
            goto L_0x01d9
        L_0x01d7:
            r0 = 0
            return r0
        L_0x01d9:
            r13 = 11
            goto L_0x0139
        L_0x01dd:
            r4 = r7
            r7 = 48
        L_0x01e0:
            r13 = 10
        L_0x01e2:
            r26 = r2
            r27 = r5
            r28 = r14
            r29 = r4
            r30 = r12
            r31 = r15
            r32 = r7
            r33 = r11
            boolean r0 = checkDate(r26, r27, r28, r29, r30, r31, r32, r33)
            if (r0 != 0) goto L_0x01fb
            r25 = 0
            return r25
        L_0x01fb:
            r25 = 0
            r0 = r35
            r10 = 45
            r1 = r2
            r2 = r5
            r21 = 9
            r3 = r14
            r14 = 8
            r14 = 58
            r5 = r12
            r12 = 0
            r14 = 26085(0x65e5, float:3.6553E-41)
            r6 = r15
            r15 = 48
            r15 = 51068(0xc77c, float:7.1562E-41)
            r8 = r11
            r0.setCalendar(r1, r2, r3, r4, r5, r6, r7, r8)
            int r0 = r9.bp
            int r0 = r0 + r13
            char r7 = r9.charAt(r0)
            r0 = 84
            if (r7 == r0) goto L_0x02c6
            r0 = 32
            if (r7 != r0) goto L_0x022b
            if (r36 != 0) goto L_0x022b
            goto L_0x02c6
        L_0x022b:
            r0 = 34
            if (r7 == r0) goto L_0x029b
            r0 = 26
            if (r7 == r0) goto L_0x029b
            if (r7 == r14) goto L_0x029b
            if (r7 != r15) goto L_0x0238
            goto L_0x029b
        L_0x0238:
            r0 = 43
            if (r7 == r0) goto L_0x0240
            if (r7 != r10) goto L_0x023f
            goto L_0x0240
        L_0x023f:
            return r12
        L_0x0240:
            int r0 = r9.len
            int r1 = r13 + 6
            if (r0 != r1) goto L_0x029a
            int r0 = r9.bp
            int r0 = r0 + r13
            r1 = 3
            int r0 = r0 + r1
            char r0 = r9.charAt(r0)
            r1 = 58
            if (r0 != r1) goto L_0x029a
            int r0 = r9.bp
            int r0 = r0 + r13
            int r0 = r0 + 4
            char r0 = r9.charAt(r0)
            r1 = 48
            if (r0 != r1) goto L_0x029a
            int r0 = r9.bp
            int r0 = r0 + r13
            r11 = 5
            int r0 = r0 + r11
            char r0 = r9.charAt(r0)
            if (r0 == r1) goto L_0x026c
            goto L_0x029a
        L_0x026c:
            r1 = 48
            r2 = 48
            r3 = 48
            r4 = 48
            r5 = 48
            r6 = 48
            r0 = r35
            r0.setTime(r1, r2, r3, r4, r5, r6)
            java.util.Calendar r0 = r9.calendar
            r14 = 14
            r0.set(r14, r12)
            int r0 = r9.bp
            int r0 = r0 + r13
            int r0 = r0 + 1
            char r0 = r9.charAt(r0)
            int r1 = r9.bp
            int r1 = r1 + r13
            r2 = 2
            int r1 = r1 + r2
            char r1 = r9.charAt(r1)
            r9.setTimeZone(r7, r0, r1)
            return r16
        L_0x029a:
            return r12
        L_0x029b:
            r11 = 5
            r14 = 14
            java.util.Calendar r0 = r9.calendar
            r15 = 11
            r0.set(r15, r12)
            java.util.Calendar r0 = r9.calendar
            r1 = 12
            r0.set(r1, r12)
            java.util.Calendar r0 = r9.calendar
            r1 = 13
            r0.set(r1, r12)
            java.util.Calendar r0 = r9.calendar
            r0.set(r14, r12)
            int r0 = r9.bp
            int r0 = r0 + r13
            r9.bp = r0
            char r0 = r9.charAt(r0)
            r9.ch = r0
            r9.token = r11
            return r16
        L_0x02c6:
            r11 = 5
            r14 = 14
            r15 = 11
            int r7 = r13 + 9
            r10 = r37
            r8 = 45
            if (r10 >= r7) goto L_0x02d4
            return r12
        L_0x02d4:
            int r0 = r9.bp
            int r0 = r0 + r13
            r1 = 3
            int r0 = r0 + r1
            char r0 = r9.charAt(r0)
            r1 = 58
            if (r0 == r1) goto L_0x02e2
            return r12
        L_0x02e2:
            int r0 = r9.bp
            int r0 = r0 + r13
            r2 = 6
            int r0 = r0 + r2
            char r0 = r9.charAt(r0)
            if (r0 == r1) goto L_0x02ee
            return r12
        L_0x02ee:
            int r0 = r9.bp
            int r0 = r0 + r13
            int r0 = r0 + 1
            char r17 = r9.charAt(r0)
            int r0 = r9.bp
            int r0 = r0 + r13
            r1 = 2
            int r0 = r0 + r1
            char r19 = r9.charAt(r0)
            int r0 = r9.bp
            int r0 = r0 + r13
            int r0 = r0 + 4
            char r22 = r9.charAt(r0)
            int r0 = r9.bp
            int r0 = r0 + r13
            int r0 = r0 + r11
            char r23 = r9.charAt(r0)
            int r0 = r9.bp
            int r0 = r0 + r13
            int r0 = r0 + 7
            char r25 = r9.charAt(r0)
            int r0 = r9.bp
            int r0 = r0 + r13
            r1 = 8
            int r0 = r0 + r1
            char r24 = r9.charAt(r0)
            r1 = r17
            r2 = r19
            r3 = r22
            r4 = r23
            r5 = r25
            r6 = r24
            boolean r0 = checkTime(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x0337
            return r12
        L_0x0337:
            r0 = r35
            r1 = r17
            r2 = r19
            r3 = r22
            r4 = r23
            r5 = r25
            r6 = r24
            r0.setTime(r1, r2, r3, r4, r5, r6)
            int r0 = r9.bp
            int r0 = r0 + r13
            int r0 = r0 + 9
            char r0 = r9.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L_0x0476
            int r0 = r13 + 11
            if (r10 >= r0) goto L_0x035a
            return r12
        L_0x035a:
            int r1 = r9.bp
            int r1 = r1 + r13
            int r1 = r1 + 10
            char r1 = r9.charAt(r1)
            r2 = 48
            if (r1 < r2) goto L_0x0475
            r3 = 57
            if (r1 <= r3) goto L_0x036d
            goto L_0x0475
        L_0x036d:
            int r1 = r1 - r2
            if (r10 <= r0) goto L_0x0382
            int r0 = r9.bp
            int r0 = r0 + r13
            int r0 = r0 + r15
            char r0 = r9.charAt(r0)
            if (r0 < r2) goto L_0x0382
            if (r0 > r3) goto L_0x0382
            int r1 = r1 * 10
            int r0 = r0 - r2
            int r1 = r1 + r0
            r0 = 2
            goto L_0x0383
        L_0x0382:
            r0 = 1
        L_0x0383:
            r2 = 2
            if (r0 != r2) goto L_0x039c
            int r2 = r9.bp
            int r2 = r2 + r13
            int r2 = r2 + 12
            char r2 = r9.charAt(r2)
            r3 = 48
            if (r2 < r3) goto L_0x039c
            r4 = 57
            if (r2 > r4) goto L_0x039c
            int r1 = r1 * 10
            int r2 = r2 - r3
            int r1 = r1 + r2
            r0 = 3
        L_0x039c:
            java.util.Calendar r2 = r9.calendar
            r2.set(r14, r1)
            int r1 = r9.bp
            int r1 = r1 + r13
            int r1 = r1 + 10
            int r1 = r1 + r0
            char r1 = r9.charAt(r1)
            r2 = 43
            if (r1 == r2) goto L_0x03da
            if (r1 != r8) goto L_0x03b2
            goto L_0x03da
        L_0x03b2:
            r2 = 90
            if (r1 != r2) goto L_0x03d7
            java.util.Calendar r1 = r9.calendar
            java.util.TimeZone r1 = r1.getTimeZone()
            int r1 = r1.getRawOffset()
            if (r1 == 0) goto L_0x03d4
            java.lang.String[] r1 = java.util.TimeZone.getAvailableIDs(r12)
            int r2 = r1.length
            if (r2 <= 0) goto L_0x03d4
            r1 = r1[r12]
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            java.util.Calendar r2 = r9.calendar
            r2.setTimeZone(r1)
        L_0x03d4:
            r6 = 1
            goto L_0x0453
        L_0x03d7:
            r6 = 0
            goto L_0x0453
        L_0x03da:
            int r2 = r9.bp
            int r2 = r2 + r13
            int r2 = r2 + 10
            int r2 = r2 + r0
            int r2 = r2 + 1
            char r2 = r9.charAt(r2)
            r3 = 48
            if (r2 < r3) goto L_0x0475
            r4 = 49
            if (r2 <= r4) goto L_0x03f0
            goto L_0x0475
        L_0x03f0:
            int r4 = r9.bp
            int r4 = r4 + r13
            int r4 = r4 + 10
            int r4 = r4 + r0
            r5 = 2
            int r4 = r4 + r5
            char r4 = r9.charAt(r4)
            if (r4 < r3) goto L_0x0475
            r3 = 57
            if (r4 <= r3) goto L_0x0404
            goto L_0x0475
        L_0x0404:
            int r3 = r9.bp
            int r3 = r3 + r13
            int r3 = r3 + 10
            int r3 = r3 + r0
            r5 = 3
            int r3 = r3 + r5
            char r3 = r9.charAt(r3)
            r5 = 58
            if (r3 != r5) goto L_0x0436
            int r3 = r9.bp
            int r3 = r3 + r13
            int r3 = r3 + 10
            int r3 = r3 + r0
            int r3 = r3 + 4
            char r3 = r9.charAt(r3)
            r5 = 48
            if (r3 == r5) goto L_0x0425
            return r12
        L_0x0425:
            int r3 = r9.bp
            int r3 = r3 + r13
            int r3 = r3 + 10
            int r3 = r3 + r0
            int r3 = r3 + r11
            char r3 = r9.charAt(r3)
            if (r3 == r5) goto L_0x0433
            return r12
        L_0x0433:
            r18 = 6
            goto L_0x044e
        L_0x0436:
            r5 = 48
            if (r3 != r5) goto L_0x044c
            int r3 = r9.bp
            int r3 = r3 + r13
            int r3 = r3 + 10
            int r3 = r3 + r0
            int r3 = r3 + 4
            char r3 = r9.charAt(r3)
            if (r3 == r5) goto L_0x0449
            return r12
        L_0x0449:
            r18 = 5
            goto L_0x044e
        L_0x044c:
            r18 = 3
        L_0x044e:
            r9.setTimeZone(r1, r2, r4)
            r6 = r18
        L_0x0453:
            int r1 = r9.bp
            int r13 = r13 + 10
            int r13 = r13 + r0
            int r13 = r13 + r6
            int r1 = r1 + r13
            char r0 = r9.charAt(r1)
            r1 = 26
            if (r0 == r1) goto L_0x0467
            r1 = 34
            if (r0 == r1) goto L_0x0467
            return r12
        L_0x0467:
            int r0 = r9.bp
            int r0 = r0 + r13
            r9.bp = r0
            char r0 = r9.charAt(r0)
            r9.ch = r0
            r9.token = r11
            return r16
        L_0x0475:
            return r12
        L_0x0476:
            java.util.Calendar r1 = r9.calendar
            r1.set(r14, r12)
            int r1 = r9.bp
            int r1 = r1 + r7
            r9.bp = r1
            char r1 = r9.charAt(r1)
            r9.ch = r1
            r9.token = r11
            r1 = 90
            if (r0 != r1) goto L_0x04aa
            java.util.Calendar r0 = r9.calendar
            java.util.TimeZone r0 = r0.getTimeZone()
            int r0 = r0.getRawOffset()
            if (r0 == 0) goto L_0x04aa
            java.lang.String[] r0 = java.util.TimeZone.getAvailableIDs(r12)
            int r1 = r0.length
            if (r1 <= 0) goto L_0x04aa
            r0 = r0[r12]
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r1 = r9.calendar
            r1.setTimeZone(r0)
        L_0x04aa:
            return r16
        L_0x04ab:
            r7 = 8
            r8 = 45
            r11 = 5
            r12 = 0
            r13 = 16
            r14 = 14
            r15 = 11
            r21 = 9
            if (r36 == 0) goto L_0x04bc
            return r12
        L_0x04bc:
            int r0 = r9.bp
            char r1 = r9.charAt(r0)
            int r0 = r9.bp
            int r0 = r0 + 1
            char r2 = r9.charAt(r0)
            int r0 = r9.bp
            r3 = 2
            int r0 = r0 + r3
            char r3 = r9.charAt(r0)
            int r0 = r9.bp
            r4 = 3
            int r0 = r0 + r4
            char r4 = r9.charAt(r0)
            int r0 = r9.bp
            int r0 = r0 + 4
            char r0 = r9.charAt(r0)
            int r5 = r9.bp
            int r5 = r5 + r11
            char r5 = r9.charAt(r5)
            int r6 = r9.bp
            r18 = 6
            int r6 = r6 + 6
            char r6 = r9.charAt(r6)
            int r11 = r9.bp
            int r11 = r11 + 7
            char r11 = r9.charAt(r11)
            int r14 = r9.bp
            int r14 = r14 + r7
            char r14 = r9.charAt(r14)
            if (r0 != r8) goto L_0x0508
            if (r11 != r8) goto L_0x0508
            r8 = 1
            goto L_0x0509
        L_0x0508:
            r8 = 0
        L_0x0509:
            if (r8 == 0) goto L_0x0510
            if (r10 != r13) goto L_0x0510
            r18 = 1
            goto L_0x0512
        L_0x0510:
            r18 = 0
        L_0x0512:
            if (r8 == 0) goto L_0x051b
            r8 = 17
            if (r10 != r8) goto L_0x051b
            r19 = 1
            goto L_0x051d
        L_0x051b:
            r19 = 0
        L_0x051d:
            if (r19 != 0) goto L_0x0526
            if (r18 == 0) goto L_0x0522
            goto L_0x0526
        L_0x0522:
            r8 = r6
            r6 = r5
            r5 = r0
            goto L_0x0530
        L_0x0526:
            int r0 = r9.bp
            int r0 = r0 + 9
            char r0 = r9.charAt(r0)
            r11 = r0
            r8 = r14
        L_0x0530:
            r24 = r1
            r25 = r2
            r26 = r3
            r27 = r4
            r28 = r5
            r29 = r6
            r30 = r8
            r31 = r11
            boolean r0 = checkDate(r24, r25, r26, r27, r28, r29, r30, r31)
            if (r0 != 0) goto L_0x0547
            return r12
        L_0x0547:
            r0 = r35
            r12 = 8
            r7 = r8
            r8 = r11
            r0.setCalendar(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 == r12) goto L_0x0624
            int r0 = r9.bp
            int r0 = r0 + 9
            char r0 = r9.charAt(r0)
            int r1 = r9.bp
            int r1 = r1 + 10
            char r1 = r9.charAt(r1)
            int r2 = r9.bp
            int r2 = r2 + r15
            char r2 = r9.charAt(r2)
            int r3 = r9.bp
            int r3 = r3 + 12
            char r7 = r9.charAt(r3)
            int r3 = r9.bp
            r4 = 13
            int r3 = r3 + r4
            char r3 = r9.charAt(r3)
            if (r19 == 0) goto L_0x058f
            r4 = 84
            if (r1 != r4) goto L_0x058f
            r4 = 58
            if (r3 != r4) goto L_0x058f
            int r4 = r9.bp
            int r4 = r4 + r13
            char r4 = r9.charAt(r4)
            r5 = 90
            if (r4 == r5) goto L_0x059d
        L_0x058f:
            if (r18 == 0) goto L_0x05b5
            r4 = 32
            if (r1 == r4) goto L_0x0599
            r4 = 84
            if (r1 != r4) goto L_0x05b5
        L_0x0599:
            r4 = 58
            if (r3 != r4) goto L_0x05b5
        L_0x059d:
            int r0 = r9.bp
            r1 = 14
            int r0 = r0 + r1
            char r1 = r9.charAt(r0)
            int r0 = r9.bp
            int r0 = r0 + 15
            char r0 = r9.charAt(r0)
            r14 = r2
            r3 = 48
            r2 = r0
            r0 = r7
            r7 = 48
        L_0x05b5:
            r26 = r14
            r27 = r0
            r28 = r1
            r29 = r2
            r30 = r7
            r31 = r3
            boolean r4 = checkTime(r26, r27, r28, r29, r30, r31)
            if (r4 != 0) goto L_0x05c9
            r4 = 0
            return r4
        L_0x05c9:
            r4 = 17
            if (r10 != r4) goto L_0x060d
            if (r19 != 0) goto L_0x060d
            int r4 = r9.bp
            r5 = 14
            int r4 = r4 + r5
            char r4 = r9.charAt(r4)
            int r5 = r9.bp
            int r5 = r5 + 15
            char r5 = r9.charAt(r5)
            int r6 = r9.bp
            int r6 = r6 + r13
            char r6 = r9.charAt(r6)
            r8 = 48
            if (r4 < r8) goto L_0x060b
            r10 = 57
            if (r4 <= r10) goto L_0x05f0
            goto L_0x060b
        L_0x05f0:
            if (r5 < r8) goto L_0x0609
            if (r5 <= r10) goto L_0x05f5
            goto L_0x0609
        L_0x05f5:
            if (r6 < r8) goto L_0x0607
            if (r6 <= r10) goto L_0x05fa
            goto L_0x0607
        L_0x05fa:
            int r4 = r4 - r8
            int r4 = r4 * 100
            int r5 = r5 - r8
            int r5 = r5 * 10
            int r4 = r4 + r5
            int r6 = r6 - r8
            int r4 = r4 + r6
            r6 = r4
            r4 = 48
            goto L_0x0611
        L_0x0607:
            r4 = 0
            return r4
        L_0x0609:
            r4 = 0
            return r4
        L_0x060b:
            r4 = 0
            return r4
        L_0x060d:
            r4 = 0
            r4 = 48
            r6 = 0
        L_0x0611:
            int r14 = r14 - r4
            int r14 = r14 * 10
            int r0 = r0 - r4
            int r0 = r0 + r14
            int r1 = r1 - r4
            int r1 = r1 * 10
            int r2 = r2 - r4
            int r1 = r1 + r2
            int r7 = r7 - r4
            int r7 = r7 * 10
            int r3 = r3 - r4
            int r2 = r7 + r3
            r4 = r6
            r6 = r0
            goto L_0x0628
        L_0x0624:
            r4 = 0
            r1 = 0
            r2 = 0
            r6 = 0
        L_0x0628:
            java.util.Calendar r0 = r9.calendar
            r0.set(r15, r6)
            java.util.Calendar r0 = r9.calendar
            r3 = 12
            r0.set(r3, r1)
            java.util.Calendar r0 = r9.calendar
            r1 = 13
            r0.set(r1, r2)
            java.util.Calendar r0 = r9.calendar
            r1 = 14
            r0.set(r1, r4)
            r0 = 5
            r9.token = r0
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.parser.JSONLexer.scanISO8601DateIfMatch(boolean, int):boolean");
    }

    /* access modifiers changed from: protected */
    public final void setTime(char c, char c2, char c3, char c4, char c5, char c6) {
        this.calendar.set(11, ((c - '0') * 10) + (c2 - '0'));
        this.calendar.set(12, ((c3 - '0') * 10) + (c4 - '0'));
        this.calendar.set(13, ((c5 - '0') * 10) + (c6 - '0'));
    }

    /* access modifiers changed from: protected */
    public final void setTimeZone(char c, char c2, char c3) {
        int i = (((c2 - '0') * 10) + (c3 - '0')) * 3600 * 1000;
        if (c == '-') {
            i = -i;
        }
        if (this.calendar.getTimeZone().getRawOffset() != i) {
            String[] availableIDs = TimeZone.getAvailableIDs(i);
            if (availableIDs.length > 0) {
                this.calendar.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
            }
        }
    }

    private void setCalendar(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
        Calendar instance = Calendar.getInstance(this.timeZone, this.locale);
        this.calendar = instance;
        instance.set(1, ((c - '0') * 1000) + ((c2 - '0') * 100) + ((c3 - '0') * 10) + (c4 - '0'));
        this.calendar.set(2, (((c5 - '0') * 10) + (c6 - '0')) - 1);
        this.calendar.set(5, ((c7 - '0') * 10) + (c8 - '0'));
    }

    public static final byte[] decodeFast(String str, int i, int i2) {
        int i3;
        int i4 = 0;
        if (i2 == 0) {
            return new byte[0];
        }
        int i5 = (i + i2) - 1;
        while (r13 < i5 && IA[str.charAt(r13)] < 0) {
            i = r13 + 1;
        }
        while (i5 > 0 && IA[str.charAt(i5)] < 0) {
            i5--;
        }
        int i6 = str.charAt(i5) == '=' ? str.charAt(i5 + -1) == '=' ? 2 : 1 : 0;
        int i7 = (i5 - r13) + 1;
        if (i2 > 76) {
            i3 = (str.charAt(76) == 13 ? i7 / 78 : 0) << 1;
        } else {
            i3 = 0;
        }
        int i8 = (((i7 - i3) * 6) >> 3) - i6;
        byte[] bArr = new byte[i8];
        int i9 = (i8 / 3) * 3;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int i12 = r13 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            int i16 = (IA[str.charAt(r13)] << 18) | (IA[str.charAt(i12)] << 12) | (IA[str.charAt(i13)] << 6) | IA[str.charAt(i14)];
            int i17 = i10 + 1;
            bArr[i10] = (byte) (i16 >> 16);
            int i18 = i17 + 1;
            bArr[i17] = (byte) (i16 >> 8);
            int i19 = i18 + 1;
            bArr[i18] = (byte) i16;
            if (i3 <= 0 || (i11 = i11 + 1) != 19) {
                r13 = i15;
            } else {
                r13 = i15 + 2;
                i11 = 0;
            }
            i10 = i19;
        }
        if (i10 < i8) {
            int i20 = 0;
            while (r13 <= i5 - i6) {
                i4 |= IA[str.charAt(r13)] << (18 - (i20 * 6));
                i20++;
                r13++;
            }
            int i21 = 16;
            while (i10 < i8) {
                bArr[i10] = (byte) (i4 >> i21);
                i21 -= 8;
                i10++;
            }
        }
        return bArr;
    }
}
