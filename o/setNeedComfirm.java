package o;

import o.SecureQwertyKeyboard;
import org.mozilla.javascript.EvaluatorException;

public abstract class setNeedComfirm extends onInit {
    static final long serialVersionUID = 8713897114082216401L;

    public paintSquare getDebuggableView() {
        return null;
    }

    public String getEncodedSource() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract int getLanguageVersion();

    /* access modifiers changed from: protected */
    public abstract int getParamAndVarCount();

    /* access modifiers changed from: protected */
    public abstract int getParamCount();

    /* access modifiers changed from: protected */
    public boolean getParamOrVarConst(int i) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract String getParamOrVarName(int i);

    public final void initScriptFunction(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils) {
        LogItem.getMax((onInit) this, logUtils);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0264, code lost:
        if (r7 != 167) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0373, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0537, code lost:
        if (r0.charAt(o.StatisticInterface.setMax(r0, r13 + 2, false, (java.lang.StringBuilder) null)) == 'h') goto L_0x0539;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x017f, code lost:
        r2 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String decompile(int r20, int r21) {
        /*
            r19 = this;
            java.lang.String r0 = r19.getEncodedSource()
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = super.decompile(r20, r21)
            return r0
        L_0x000b:
            o.switchOff r1 = new o.switchOff
            r2 = 1
            r1.<init>(r2)
            r3 = r20
            r1.put((int) r2, (int) r3)
            int r3 = r0.length()
            if (r3 != 0) goto L_0x001f
            java.lang.String r0 = ""
            return r0
        L_0x001f:
            r4 = 0
            int r5 = r1.getInt(r2, r4)
            if (r5 < 0) goto L_0x0571
            r6 = 4
            r7 = 2
            int r8 = r1.getInt(r7, r6)
            if (r8 < 0) goto L_0x056b
            r9 = 3
            int r1 = r1.getInt(r9, r7)
            if (r1 < 0) goto L_0x0565
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = r21 & 1
            if (r10 == 0) goto L_0x0040
            r10 = 1
            goto L_0x0041
        L_0x0040:
            r10 = 0
        L_0x0041:
            r11 = r21 & 2
            if (r11 == 0) goto L_0x0047
            r11 = 1
            goto L_0x0048
        L_0x0047:
            r11 = 0
        L_0x0048:
            char r12 = r0.charAt(r4)
            r13 = 137(0x89, float:1.92E-43)
            if (r12 != r13) goto L_0x0053
            r12 = -1
            r13 = 1
            goto L_0x0058
        L_0x0053:
            char r12 = r0.charAt(r2)
            r13 = 0
        L_0x0058:
            r14 = 40
            r15 = 10
            r4 = 32
            if (r11 != 0) goto L_0x006c
            r9.append(r15)
            r15 = 0
        L_0x0064:
            if (r15 >= r5) goto L_0x0071
            r9.append(r4)
            int r15 = r15 + 1
            goto L_0x0064
        L_0x006c:
            if (r12 != r7) goto L_0x0071
            r9.append(r14)
        L_0x0071:
            r15 = 0
            r16 = 0
        L_0x0074:
            if (r13 >= r3) goto L_0x054e
            char r14 = r0.charAt(r13)
            r7 = 39
            if (r14 == r2) goto L_0x04f7
            if (r14 == r6) goto L_0x04de
            r6 = 50
            if (r14 == r6) goto L_0x04d5
            r6 = 67
            if (r14 == r6) goto L_0x04cc
            r6 = 73
            if (r14 == r6) goto L_0x04c3
            r6 = 161(0xa1, float:2.26E-43)
            if (r14 == r6) goto L_0x04ba
            r6 = 167(0xa7, float:2.34E-43)
            if (r14 == r6) goto L_0x0549
            r2 = 52
            if (r14 == r2) goto L_0x04b1
            r2 = 53
            if (r14 == r2) goto L_0x04a8
            r2 = 144(0x90, float:2.02E-43)
            if (r14 == r2) goto L_0x049f
            r2 = 145(0x91, float:2.03E-43)
            if (r14 == r2) goto L_0x0496
            r2 = 147(0x93, float:2.06E-43)
            if (r14 == r2) goto L_0x048d
            r2 = 148(0x94, float:2.07E-43)
            if (r14 == r2) goto L_0x0484
            r2 = 164(0xa4, float:2.3E-43)
            if (r14 == r2) goto L_0x00ed
            r2 = 165(0xa5, float:2.31E-43)
            if (r14 == r2) goto L_0x0451
            switch(r14) {
                case 9: goto L_0x0448;
                case 10: goto L_0x043f;
                case 11: goto L_0x0436;
                case 12: goto L_0x042d;
                case 13: goto L_0x0424;
                case 14: goto L_0x041b;
                case 15: goto L_0x0412;
                case 16: goto L_0x0409;
                case 17: goto L_0x0400;
                case 18: goto L_0x03f7;
                case 19: goto L_0x03ee;
                case 20: goto L_0x03e5;
                case 21: goto L_0x03dc;
                case 22: goto L_0x03d3;
                case 23: goto L_0x03ca;
                case 24: goto L_0x03c1;
                case 25: goto L_0x03b8;
                case 26: goto L_0x03af;
                case 27: goto L_0x03a6;
                case 28: goto L_0x039d;
                case 29: goto L_0x0394;
                case 30: goto L_0x038b;
                case 31: goto L_0x0382;
                case 32: goto L_0x0379;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            switch(r14) {
                case 39: goto L_0x036a;
                case 40: goto L_0x02ff;
                case 41: goto L_0x02f4;
                case 42: goto L_0x02eb;
                case 43: goto L_0x02e2;
                case 44: goto L_0x02d9;
                case 45: goto L_0x02d0;
                case 46: goto L_0x02c7;
                case 47: goto L_0x02be;
                case 48: goto L_0x036a;
                default: goto L_0x00ba;
            }
        L_0x00ba:
            switch(r14) {
                case 82: goto L_0x02b5;
                case 83: goto L_0x029c;
                case 84: goto L_0x0293;
                case 85: goto L_0x028a;
                case 86: goto L_0x0271;
                case 87: goto L_0x0242;
                case 88: goto L_0x023b;
                case 89: goto L_0x0223;
                case 90: goto L_0x021c;
                case 91: goto L_0x0215;
                case 92: goto L_0x020e;
                case 93: goto L_0x0207;
                case 94: goto L_0x0200;
                case 95: goto L_0x01f9;
                case 96: goto L_0x01f2;
                case 97: goto L_0x01eb;
                case 98: goto L_0x01e4;
                case 99: goto L_0x01dd;
                case 100: goto L_0x01d6;
                case 101: goto L_0x01cf;
                case 102: goto L_0x01c8;
                case 103: goto L_0x01c1;
                case 104: goto L_0x01a6;
                case 105: goto L_0x019f;
                case 106: goto L_0x0198;
                case 107: goto L_0x0191;
                case 108: goto L_0x018a;
                case 109: goto L_0x0183;
                case 110: goto L_0x0178;
                default: goto L_0x00bd;
            }
        L_0x00bd:
            switch(r14) {
                case 113: goto L_0x0171;
                case 114: goto L_0x016a;
                case 115: goto L_0x0163;
                case 116: goto L_0x015c;
                case 117: goto L_0x0155;
                case 118: goto L_0x014e;
                case 119: goto L_0x0147;
                case 120: goto L_0x0140;
                case 121: goto L_0x012a;
                case 122: goto L_0x0114;
                case 123: goto L_0x010d;
                case 124: goto L_0x0106;
                case 125: goto L_0x00ff;
                case 126: goto L_0x00f8;
                case 127: goto L_0x00f1;
                default: goto L_0x00c0;
            }
        L_0x00c0:
            switch(r14) {
                case 152: goto L_0x00ed;
                case 153: goto L_0x00ed;
                case 154: goto L_0x00e6;
                case 155: goto L_0x00df;
                default: goto L_0x00c3;
            }
        L_0x00c3:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Token: "
            r2.<init>(r3)
            char r0 = r0.charAt(r13)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x00df:
            java.lang.String r2 = "const "
            r9.append(r2)
            goto L_0x0549
        L_0x00e6:
            java.lang.String r2 = "let "
            r9.append(r2)
            goto L_0x0549
        L_0x00ed:
            r17 = r3
            goto L_0x045a
        L_0x00f1:
            java.lang.String r2 = "void "
            r9.append(r2)
            goto L_0x0549
        L_0x00f8:
            java.lang.String r2 = "finally "
            r9.append(r2)
            goto L_0x0549
        L_0x00ff:
            java.lang.String r2 = "catch "
            r9.append(r2)
            goto L_0x0549
        L_0x0106:
            java.lang.String r2 = "with "
            r9.append(r2)
            goto L_0x0549
        L_0x010d:
            java.lang.String r2 = "var "
            r9.append(r2)
            goto L_0x0549
        L_0x0114:
            java.lang.String r2 = "continue"
            r9.append(r2)
            int r2 = r13 + 1
            if (r2 >= r3) goto L_0x0122
            char r2 = r0.charAt(r2)
            goto L_0x0123
        L_0x0122:
            r2 = 0
        L_0x0123:
            if (r7 != r2) goto L_0x0549
            r9.append(r4)
            goto L_0x0549
        L_0x012a:
            java.lang.String r2 = "break"
            r9.append(r2)
            int r2 = r13 + 1
            if (r2 >= r3) goto L_0x0138
            char r2 = r0.charAt(r2)
            goto L_0x0139
        L_0x0138:
            r2 = 0
        L_0x0139:
            if (r7 != r2) goto L_0x0549
            r9.append(r4)
            goto L_0x0549
        L_0x0140:
            java.lang.String r2 = "for "
            r9.append(r2)
            goto L_0x0549
        L_0x0147:
            java.lang.String r2 = "do "
            r9.append(r2)
            goto L_0x0549
        L_0x014e:
            java.lang.String r2 = "while "
            r9.append(r2)
            goto L_0x0549
        L_0x0155:
            java.lang.String r2 = "default"
            r9.append(r2)
            goto L_0x0549
        L_0x015c:
            java.lang.String r2 = "case "
            r9.append(r2)
            goto L_0x0549
        L_0x0163:
            java.lang.String r2 = "switch "
            r9.append(r2)
            goto L_0x0549
        L_0x016a:
            java.lang.String r2 = "else "
            r9.append(r2)
            goto L_0x0549
        L_0x0171:
            java.lang.String r2 = "if "
            r9.append(r2)
            goto L_0x0549
        L_0x0178:
            int r13 = r13 + 1
            java.lang.String r2 = "function "
            r9.append(r2)
        L_0x017f:
            r2 = 1
        L_0x0180:
            r7 = 0
            goto L_0x054b
        L_0x0183:
            r2 = 46
            r9.append(r2)
            goto L_0x0549
        L_0x018a:
            java.lang.String r2 = "--"
            r9.append(r2)
            goto L_0x0549
        L_0x0191:
            java.lang.String r2 = "++"
            r9.append(r2)
            goto L_0x0549
        L_0x0198:
            java.lang.String r2 = " && "
            r9.append(r2)
            goto L_0x0549
        L_0x019f:
            java.lang.String r2 = " || "
            r9.append(r2)
            goto L_0x0549
        L_0x01a6:
            int r2 = r13 + 1
            if (r2 >= r3) goto L_0x01af
            char r2 = r0.charAt(r2)
            goto L_0x01b0
        L_0x01af:
            r2 = 0
        L_0x01b0:
            r6 = 1
            if (r6 != r2) goto L_0x01ba
            r2 = 58
            r9.append(r2)
            goto L_0x0549
        L_0x01ba:
            java.lang.String r2 = " : "
            r9.append(r2)
            goto L_0x0549
        L_0x01c1:
            java.lang.String r2 = " ? "
            r9.append(r2)
            goto L_0x0549
        L_0x01c8:
            java.lang.String r2 = " %= "
            r9.append(r2)
            goto L_0x0549
        L_0x01cf:
            java.lang.String r2 = " /= "
            r9.append(r2)
            goto L_0x0549
        L_0x01d6:
            java.lang.String r2 = " *= "
            r9.append(r2)
            goto L_0x0549
        L_0x01dd:
            java.lang.String r2 = " -= "
            r9.append(r2)
            goto L_0x0549
        L_0x01e4:
            java.lang.String r2 = " += "
            r9.append(r2)
            goto L_0x0549
        L_0x01eb:
            java.lang.String r2 = " >>>= "
            r9.append(r2)
            goto L_0x0549
        L_0x01f2:
            java.lang.String r2 = " >>= "
            r9.append(r2)
            goto L_0x0549
        L_0x01f9:
            java.lang.String r2 = " <<= "
            r9.append(r2)
            goto L_0x0549
        L_0x0200:
            java.lang.String r2 = " &= "
            r9.append(r2)
            goto L_0x0549
        L_0x0207:
            java.lang.String r2 = " ^= "
            r9.append(r2)
            goto L_0x0549
        L_0x020e:
            java.lang.String r2 = " |= "
            r9.append(r2)
            goto L_0x0549
        L_0x0215:
            java.lang.String r2 = " = "
            r9.append(r2)
            goto L_0x0549
        L_0x021c:
            java.lang.String r2 = ", "
            r9.append(r2)
            goto L_0x0549
        L_0x0223:
            r2 = 41
            r9.append(r2)
            r2 = 86
            int r6 = r13 + 1
            if (r6 >= r3) goto L_0x0233
            char r6 = r0.charAt(r6)
            goto L_0x0234
        L_0x0233:
            r6 = 0
        L_0x0234:
            if (r2 != r6) goto L_0x0549
            r9.append(r4)
            goto L_0x0549
        L_0x023b:
            r2 = 40
            r9.append(r2)
            goto L_0x0549
        L_0x0242:
            r2 = 40
            int r15 = r15 + -1
            if (r10 == 0) goto L_0x024a
            if (r15 == 0) goto L_0x017f
        L_0x024a:
            r7 = 125(0x7d, float:1.75E-43)
            r9.append(r7)
            int r7 = r13 + 1
            if (r7 >= r3) goto L_0x0258
            char r7 = r0.charAt(r7)
            goto L_0x0259
        L_0x0258:
            r7 = 0
        L_0x0259:
            r14 = 1
            if (r7 == r14) goto L_0x026e
            r14 = 114(0x72, float:1.6E-43)
            if (r7 == r14) goto L_0x0268
            r14 = 118(0x76, float:1.65E-43)
            if (r7 == r14) goto L_0x0268
            if (r7 == r6) goto L_0x026e
            goto L_0x017f
        L_0x0268:
            int r5 = r5 - r8
            r9.append(r4)
            goto L_0x017f
        L_0x026e:
            int r5 = r5 - r8
            goto L_0x017f
        L_0x0271:
            r2 = 40
            int r15 = r15 + 1
            int r6 = r13 + 1
            if (r6 >= r3) goto L_0x027e
            char r6 = r0.charAt(r6)
            goto L_0x027f
        L_0x027e:
            r6 = 0
        L_0x027f:
            r7 = 1
            if (r7 != r6) goto L_0x0283
            int r5 = r5 + r8
        L_0x0283:
            r6 = 123(0x7b, float:1.72E-43)
            r9.append(r6)
            goto L_0x017f
        L_0x028a:
            r2 = 40
            r6 = 93
            r9.append(r6)
            goto L_0x0549
        L_0x0293:
            r2 = 40
            r6 = 91
            r9.append(r6)
            goto L_0x0549
        L_0x029c:
            r2 = 40
            r6 = 59
            r9.append(r6)
            int r6 = r13 + 1
            if (r6 >= r3) goto L_0x02ac
            char r6 = r0.charAt(r6)
            goto L_0x02ad
        L_0x02ac:
            r6 = 0
        L_0x02ad:
            r7 = 1
            if (r7 == r6) goto L_0x0549
            r9.append(r4)
            goto L_0x0549
        L_0x02b5:
            r2 = 40
            java.lang.String r6 = "try "
            r9.append(r6)
            goto L_0x0549
        L_0x02be:
            r2 = 40
            java.lang.String r6 = " !== "
            r9.append(r6)
            goto L_0x0549
        L_0x02c7:
            r2 = 40
            java.lang.String r6 = " === "
            r9.append(r6)
            goto L_0x0549
        L_0x02d0:
            r2 = 40
            java.lang.String r6 = "true"
            r9.append(r6)
            goto L_0x0549
        L_0x02d9:
            r2 = 40
            java.lang.String r6 = "false"
            r9.append(r6)
            goto L_0x0549
        L_0x02e2:
            r2 = 40
            java.lang.String r6 = "this"
            r9.append(r6)
            goto L_0x0549
        L_0x02eb:
            r2 = 40
            java.lang.String r6 = "null"
            r9.append(r6)
            goto L_0x0549
        L_0x02f4:
            r2 = 40
            int r13 = r13 + 1
            r6 = 1
            int r13 = o.StatisticInterface.setMax(r0, r13, r6, r9)
            goto L_0x0373
        L_0x02ff:
            r2 = 40
            r6 = 1
            int r13 = r13 + 1
            char r7 = r0.charAt(r13)
            int r13 = r13 + r6
            r6 = 83
            if (r7 != r6) goto L_0x0319
            char r6 = r0.charAt(r13)
            double r6 = (double) r6
            int r13 = r13 + 1
            r17 = r3
        L_0x0316:
            r2 = 10
            goto L_0x0360
        L_0x0319:
            r6 = 74
            if (r7 == r6) goto L_0x0328
            r14 = 68
            if (r7 != r14) goto L_0x0322
            goto L_0x0328
        L_0x0322:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L_0x0328:
            char r14 = r0.charAt(r13)
            r17 = r3
            long r2 = (long) r14
            r14 = 48
            long r2 = r2 << r14
            int r14 = r13 + 1
            char r14 = r0.charAt(r14)
            r18 = r7
            long r6 = (long) r14
            long r6 = r6 << r4
            long r2 = r2 | r6
            int r6 = r13 + 2
            char r6 = r0.charAt(r6)
            long r6 = (long) r6
            r14 = 16
            long r6 = r6 << r14
            long r2 = r2 | r6
            int r6 = r13 + 3
            char r6 = r0.charAt(r6)
            long r6 = (long) r6
            long r2 = r2 | r6
            r6 = r18
            r7 = 74
            if (r6 != r7) goto L_0x0358
            double r2 = (double) r2
            goto L_0x035c
        L_0x0358:
            double r2 = java.lang.Double.longBitsToDouble(r2)
        L_0x035c:
            r6 = r2
            int r13 = r13 + 4
            goto L_0x0316
        L_0x0360:
            java.lang.String r3 = o.LogItem.getMin((double) r6, (int) r2)
            r9.append(r3)
            r3 = r17
            goto L_0x0373
        L_0x036a:
            r17 = r3
            int r13 = r13 + 1
            r2 = 0
            int r13 = o.StatisticInterface.setMax(r0, r13, r2, r9)
        L_0x0373:
            r2 = 1
        L_0x0374:
            r6 = 4
            r14 = 40
            goto L_0x0074
        L_0x0379:
            r17 = r3
            java.lang.String r2 = "typeof "
            r9.append(r2)
            goto L_0x0549
        L_0x0382:
            r17 = r3
            java.lang.String r2 = "delete "
            r9.append(r2)
            goto L_0x0549
        L_0x038b:
            r17 = r3
            java.lang.String r2 = "new "
            r9.append(r2)
            goto L_0x0549
        L_0x0394:
            r17 = r3
            r2 = 45
            r9.append(r2)
            goto L_0x0549
        L_0x039d:
            r17 = r3
            r2 = 43
            r9.append(r2)
            goto L_0x0549
        L_0x03a6:
            r17 = r3
            r2 = 126(0x7e, float:1.77E-43)
            r9.append(r2)
            goto L_0x0549
        L_0x03af:
            r17 = r3
            r2 = 33
            r9.append(r2)
            goto L_0x0549
        L_0x03b8:
            r17 = r3
            java.lang.String r2 = " % "
            r9.append(r2)
            goto L_0x0549
        L_0x03c1:
            r17 = r3
            java.lang.String r2 = " / "
            r9.append(r2)
            goto L_0x0549
        L_0x03ca:
            r17 = r3
            java.lang.String r2 = " * "
            r9.append(r2)
            goto L_0x0549
        L_0x03d3:
            r17 = r3
            java.lang.String r2 = " - "
            r9.append(r2)
            goto L_0x0549
        L_0x03dc:
            r17 = r3
            java.lang.String r2 = " + "
            r9.append(r2)
            goto L_0x0549
        L_0x03e5:
            r17 = r3
            java.lang.String r2 = " >>> "
            r9.append(r2)
            goto L_0x0549
        L_0x03ee:
            r17 = r3
            java.lang.String r2 = " >> "
            r9.append(r2)
            goto L_0x0549
        L_0x03f7:
            r17 = r3
            java.lang.String r2 = " << "
            r9.append(r2)
            goto L_0x0549
        L_0x0400:
            r17 = r3
            java.lang.String r2 = " >= "
            r9.append(r2)
            goto L_0x0549
        L_0x0409:
            r17 = r3
            java.lang.String r2 = " > "
            r9.append(r2)
            goto L_0x0549
        L_0x0412:
            r17 = r3
            java.lang.String r2 = " <= "
            r9.append(r2)
            goto L_0x0549
        L_0x041b:
            r17 = r3
            java.lang.String r2 = " < "
            r9.append(r2)
            goto L_0x0549
        L_0x0424:
            r17 = r3
            java.lang.String r2 = " != "
            r9.append(r2)
            goto L_0x0549
        L_0x042d:
            r17 = r3
            java.lang.String r2 = " == "
            r9.append(r2)
            goto L_0x0549
        L_0x0436:
            r17 = r3
            java.lang.String r2 = " & "
            r9.append(r2)
            goto L_0x0549
        L_0x043f:
            r17 = r3
            java.lang.String r2 = " ^ "
            r9.append(r2)
            goto L_0x0549
        L_0x0448:
            r17 = r3
            java.lang.String r2 = " | "
            r9.append(r2)
            goto L_0x0549
        L_0x0451:
            r17 = r3
            java.lang.String r2 = " => "
            r9.append(r2)
            goto L_0x0549
        L_0x045a:
            char r2 = r0.charAt(r13)
            r3 = 152(0x98, float:2.13E-43)
            if (r2 != r3) goto L_0x0468
            java.lang.String r2 = "get "
            r9.append(r2)
            goto L_0x0475
        L_0x0468:
            char r2 = r0.charAt(r13)
            r3 = 153(0x99, float:2.14E-43)
            if (r2 != r3) goto L_0x0475
            java.lang.String r2 = "set "
            r9.append(r2)
        L_0x0475:
            int r13 = r13 + 1
            r2 = 1
            int r13 = r13 + r2
            r3 = 0
            int r6 = o.StatisticInterface.setMax(r0, r13, r3, r9)
            int r13 = r6 + 1
            r3 = r17
            goto L_0x0180
        L_0x0484:
            r17 = r3
            r2 = 64
            r9.append(r2)
            goto L_0x0549
        L_0x048d:
            r17 = r3
            java.lang.String r2 = ".("
            r9.append(r2)
            goto L_0x0549
        L_0x0496:
            r17 = r3
            java.lang.String r2 = "::"
            r9.append(r2)
            goto L_0x0549
        L_0x049f:
            r17 = r3
            java.lang.String r2 = ".."
            r9.append(r2)
            goto L_0x0549
        L_0x04a8:
            r17 = r3
            java.lang.String r2 = " instanceof "
            r9.append(r2)
            goto L_0x0549
        L_0x04b1:
            r17 = r3
            java.lang.String r2 = " in "
            r9.append(r2)
            goto L_0x0549
        L_0x04ba:
            r17 = r3
            java.lang.String r2 = "debugger;\n"
            r9.append(r2)
            goto L_0x0549
        L_0x04c3:
            r17 = r3
            java.lang.String r2 = "yield "
            r9.append(r2)
            goto L_0x0549
        L_0x04cc:
            r17 = r3
            java.lang.String r2 = ": "
            r9.append(r2)
            goto L_0x0549
        L_0x04d5:
            r17 = r3
            java.lang.String r2 = "throw "
            r9.append(r2)
            goto L_0x0549
        L_0x04de:
            r17 = r3
            java.lang.String r2 = "return"
            r9.append(r2)
            int r2 = r13 + 1
            if (r2 >= r3) goto L_0x04ee
            char r2 = r0.charAt(r2)
            goto L_0x04ef
        L_0x04ee:
            r2 = 0
        L_0x04ef:
            r6 = 83
            if (r6 == r2) goto L_0x0549
            r9.append(r4)
            goto L_0x0549
        L_0x04f7:
            if (r11 != 0) goto L_0x0549
            if (r16 != 0) goto L_0x0508
            if (r10 == 0) goto L_0x0504
            r2 = 0
            r9.setLength(r2)
            int r5 = r5 - r8
            r6 = 0
            goto L_0x0505
        L_0x0504:
            r6 = 1
        L_0x0505:
            r16 = 1
            goto L_0x0509
        L_0x0508:
            r6 = 1
        L_0x0509:
            if (r6 == 0) goto L_0x0510
            r2 = 10
            r9.append(r2)
        L_0x0510:
            int r2 = r13 + 1
            if (r2 >= r3) goto L_0x0549
            char r2 = r0.charAt(r2)
            r6 = 116(0x74, float:1.63E-43)
            if (r2 == r6) goto L_0x053e
            r6 = 117(0x75, float:1.64E-43)
            if (r2 != r6) goto L_0x0521
            goto L_0x053e
        L_0x0521:
            r6 = 87
            if (r2 != r6) goto L_0x0527
            r7 = 0
            goto L_0x0539
        L_0x0527:
            if (r2 != r7) goto L_0x053b
            int r2 = r13 + 2
            r6 = 0
            r7 = 0
            int r2 = o.StatisticInterface.setMax(r0, r2, r7, r6)
            char r2 = r0.charAt(r2)
            r6 = 104(0x68, float:1.46E-43)
            if (r2 != r6) goto L_0x053c
        L_0x0539:
            r2 = r8
            goto L_0x0541
        L_0x053b:
            r7 = 0
        L_0x053c:
            r2 = 0
            goto L_0x0541
        L_0x053e:
            r7 = 0
            int r2 = r8 - r1
        L_0x0541:
            if (r2 >= r5) goto L_0x054a
            r9.append(r4)
            int r2 = r2 + 1
            goto L_0x0541
        L_0x0549:
            r7 = 0
        L_0x054a:
            r2 = 1
        L_0x054b:
            int r13 = r13 + r2
            goto L_0x0374
        L_0x054e:
            if (r11 != 0) goto L_0x0558
            if (r10 != 0) goto L_0x0560
            r0 = 10
            r9.append(r0)
            goto L_0x0560
        L_0x0558:
            r0 = 2
            if (r12 != r0) goto L_0x0560
            r0 = 41
            r9.append(r0)
        L_0x0560:
            java.lang.String r0 = r9.toString()
            return r0
        L_0x0565:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x056b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0571:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            goto L_0x0578
        L_0x0577:
            throw r0
        L_0x0578:
            goto L_0x0577
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setNeedComfirm.decompile(int, int):java.lang.String");
    }

    public int getLength() {
        doAutoSubmit length;
        int paramCount = getParamCount();
        if (getLanguageVersion() == 120 && (length = LogItem.length(SecureQwertyKeyboard.AnonymousClass1.toFloatRange(), (doCheck) this)) != null) {
            return length.originalArgs.length;
        }
        return paramCount;
    }

    public int getArity() {
        return getParamCount();
    }

    @Deprecated
    public String jsGet_name() {
        return getFunctionName();
    }

    public Object resumeGenerator(SecureQwertyKeyboard.AnonymousClass1 r1, LogUtils logUtils, int i, Object obj, Object obj2) {
        throw new EvaluatorException("resumeGenerator() not implemented");
    }
}
