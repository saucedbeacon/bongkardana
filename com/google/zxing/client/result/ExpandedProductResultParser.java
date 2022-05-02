package com.google.zxing.client.result;

public final class ExpandedProductResultParser extends ResultParser {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01fb, code lost:
        if (r1.equals(com.iap.ac.android.acs.plugin.utils.MonitorUtil.ERROR_CODE_EMPTY) != false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x023c, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x024e, code lost:
        r12 = r2;
        r3 = r21;
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0261, code lost:
        r3 = r21;
        r15 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0265, code lost:
        r14 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0267, code lost:
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0260  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.zxing.client.result.ExpandedProductParsedResult parse(com.google.zxing.Result r25) {
        /*
            r24 = this;
            com.google.zxing.BarcodeFormat r0 = r25.getBarcodeFormat()
            com.google.zxing.BarcodeFormat r1 = com.google.zxing.BarcodeFormat.RSS_EXPANDED
            r2 = 0
            if (r0 == r1) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r4 = getMassagedText(r25)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r5 = r2
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r3 = 0
        L_0x0023:
            int r1 = r4.length()
            if (r3 >= r1) goto L_0x026a
            java.lang.String r1 = findAIvalue(r3, r4)
            if (r1 != 0) goto L_0x0030
            return r2
        L_0x0030:
            int r18 = r1.length()
            r19 = 2
            int r18 = r18 + 2
            int r3 = r3 + r18
            java.lang.String r2 = findValue(r3, r4)
            int r20 = r2.length()
            int r3 = r3 + r20
            r20 = -1
            r21 = r3
            int r3 = r1.hashCode()
            r22 = r15
            r15 = 1536(0x600, float:2.152E-42)
            r23 = r14
            r14 = 3
            if (r3 == r15) goto L_0x0209
            r15 = 1537(0x601, float:2.154E-42)
            if (r3 == r15) goto L_0x01fe
            r15 = 1567(0x61f, float:2.196E-42)
            if (r3 == r15) goto L_0x01f5
            r15 = 1568(0x620, float:2.197E-42)
            if (r3 == r15) goto L_0x01ea
            r15 = 1570(0x622, float:2.2E-42)
            if (r3 == r15) goto L_0x01df
            r15 = 1572(0x624, float:2.203E-42)
            if (r3 == r15) goto L_0x01d4
            r15 = 1574(0x626, float:2.206E-42)
            if (r3 == r15) goto L_0x01c9
            switch(r3) {
                case 1567966: goto L_0x01be;
                case 1567967: goto L_0x01b3;
                case 1567968: goto L_0x01a7;
                case 1567969: goto L_0x019b;
                case 1567970: goto L_0x018f;
                case 1567971: goto L_0x0183;
                case 1567972: goto L_0x0177;
                case 1567973: goto L_0x016b;
                case 1567974: goto L_0x015f;
                case 1567975: goto L_0x0153;
                default: goto L_0x0070;
            }
        L_0x0070:
            switch(r3) {
                case 1568927: goto L_0x0147;
                case 1568928: goto L_0x013b;
                case 1568929: goto L_0x012f;
                case 1568930: goto L_0x0123;
                case 1568931: goto L_0x0117;
                case 1568932: goto L_0x010b;
                case 1568933: goto L_0x00ff;
                case 1568934: goto L_0x00f3;
                case 1568935: goto L_0x00e7;
                case 1568936: goto L_0x00db;
                default: goto L_0x0073;
            }
        L_0x0073:
            switch(r3) {
                case 1575716: goto L_0x00cf;
                case 1575717: goto L_0x00c3;
                case 1575718: goto L_0x00b7;
                case 1575719: goto L_0x00ab;
                default: goto L_0x0076;
            }
        L_0x0076:
            switch(r3) {
                case 1575747: goto L_0x009f;
                case 1575748: goto L_0x0093;
                case 1575749: goto L_0x0087;
                case 1575750: goto L_0x007b;
                default: goto L_0x0079;
            }
        L_0x0079:
            goto L_0x0214
        L_0x007b:
            java.lang.String r3 = "3933"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 34
            goto L_0x0216
        L_0x0087:
            java.lang.String r3 = "3932"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 33
            goto L_0x0216
        L_0x0093:
            java.lang.String r3 = "3931"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 32
            goto L_0x0216
        L_0x009f:
            java.lang.String r3 = "3930"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 31
            goto L_0x0216
        L_0x00ab:
            java.lang.String r3 = "3923"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 30
            goto L_0x0216
        L_0x00b7:
            java.lang.String r3 = "3922"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 29
            goto L_0x0216
        L_0x00c3:
            java.lang.String r3 = "3921"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 28
            goto L_0x0216
        L_0x00cf:
            java.lang.String r3 = "3920"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 27
            goto L_0x0216
        L_0x00db:
            java.lang.String r3 = "3209"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 26
            goto L_0x0216
        L_0x00e7:
            java.lang.String r3 = "3208"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 25
            goto L_0x0216
        L_0x00f3:
            java.lang.String r3 = "3207"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 24
            goto L_0x0216
        L_0x00ff:
            java.lang.String r3 = "3206"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 23
            goto L_0x0216
        L_0x010b:
            java.lang.String r3 = "3205"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 22
            goto L_0x0216
        L_0x0117:
            java.lang.String r3 = "3204"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 21
            goto L_0x0216
        L_0x0123:
            java.lang.String r3 = "3203"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 20
            goto L_0x0216
        L_0x012f:
            java.lang.String r3 = "3202"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 19
            goto L_0x0216
        L_0x013b:
            java.lang.String r3 = "3201"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 18
            goto L_0x0216
        L_0x0147:
            java.lang.String r3 = "3200"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 17
            goto L_0x0216
        L_0x0153:
            java.lang.String r3 = "3109"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 16
            goto L_0x0216
        L_0x015f:
            java.lang.String r3 = "3108"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 15
            goto L_0x0216
        L_0x016b:
            java.lang.String r3 = "3107"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 14
            goto L_0x0216
        L_0x0177:
            java.lang.String r3 = "3106"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 13
            goto L_0x0216
        L_0x0183:
            java.lang.String r3 = "3105"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 12
            goto L_0x0216
        L_0x018f:
            java.lang.String r3 = "3104"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 11
            goto L_0x0216
        L_0x019b:
            java.lang.String r3 = "3103"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 10
            goto L_0x0216
        L_0x01a7:
            java.lang.String r3 = "3102"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 9
            goto L_0x0216
        L_0x01b3:
            java.lang.String r3 = "3101"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 8
            goto L_0x0216
        L_0x01be:
            java.lang.String r3 = "3100"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 7
            goto L_0x0216
        L_0x01c9:
            java.lang.String r3 = "17"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 6
            goto L_0x0216
        L_0x01d4:
            java.lang.String r3 = "15"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 5
            goto L_0x0216
        L_0x01df:
            java.lang.String r3 = "13"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 4
            goto L_0x0216
        L_0x01ea:
            java.lang.String r3 = "11"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 3
            goto L_0x0216
        L_0x01f5:
            java.lang.String r3 = "10"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            goto L_0x0216
        L_0x01fe:
            java.lang.String r3 = "01"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 1
            goto L_0x0216
        L_0x0209:
            java.lang.String r3 = "00"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0214
            r19 = 0
            goto L_0x0216
        L_0x0214:
            r19 = -1
        L_0x0216:
            switch(r19) {
                case 0: goto L_0x0260;
                case 1: goto L_0x025e;
                case 2: goto L_0x025c;
                case 3: goto L_0x025a;
                case 4: goto L_0x0258;
                case 5: goto L_0x0256;
                case 6: goto L_0x0254;
                case 7: goto L_0x0247;
                case 8: goto L_0x0247;
                case 9: goto L_0x0247;
                case 10: goto L_0x0247;
                case 11: goto L_0x0247;
                case 12: goto L_0x0247;
                case 13: goto L_0x0247;
                case 14: goto L_0x0247;
                case 15: goto L_0x0247;
                case 16: goto L_0x0247;
                case 17: goto L_0x023f;
                case 18: goto L_0x023f;
                case 19: goto L_0x023f;
                case 20: goto L_0x023f;
                case 21: goto L_0x023f;
                case 22: goto L_0x023f;
                case 23: goto L_0x023f;
                case 24: goto L_0x023f;
                case 25: goto L_0x023f;
                case 26: goto L_0x023f;
                case 27: goto L_0x0236;
                case 28: goto L_0x0236;
                case 29: goto L_0x0236;
                case 30: goto L_0x0236;
                case 31: goto L_0x021e;
                case 32: goto L_0x021e;
                case 33: goto L_0x021e;
                case 34: goto L_0x021e;
                default: goto L_0x0219;
            }
        L_0x0219:
            r3 = 0
            r0.put(r1, r2)
            goto L_0x0261
        L_0x021e:
            int r3 = r2.length()
            r15 = 4
            if (r3 >= r15) goto L_0x0227
            r3 = 0
            return r3
        L_0x0227:
            r3 = 0
            java.lang.String r15 = r2.substring(r14)
            r3 = 0
            java.lang.String r17 = r2.substring(r3, r14)
            java.lang.String r16 = r1.substring(r14)
            goto L_0x023c
        L_0x0236:
            r3 = 0
            java.lang.String r16 = r1.substring(r14)
            r15 = r2
        L_0x023c:
            r3 = r21
            goto L_0x0265
        L_0x023f:
            r3 = 0
            java.lang.String r14 = r1.substring(r14)
            java.lang.String r13 = "LB"
            goto L_0x024e
        L_0x0247:
            r3 = 0
            java.lang.String r14 = r1.substring(r14)
            java.lang.String r13 = "KG"
        L_0x024e:
            r12 = r2
            r3 = r21
            r15 = r22
            goto L_0x0267
        L_0x0254:
            r11 = r2
            goto L_0x0261
        L_0x0256:
            r10 = r2
            goto L_0x0261
        L_0x0258:
            r9 = r2
            goto L_0x0261
        L_0x025a:
            r8 = r2
            goto L_0x0261
        L_0x025c:
            r7 = r2
            goto L_0x0261
        L_0x025e:
            r5 = r2
            goto L_0x0261
        L_0x0260:
            r6 = r2
        L_0x0261:
            r3 = r21
            r15 = r22
        L_0x0265:
            r14 = r23
        L_0x0267:
            r2 = 0
            goto L_0x0023
        L_0x026a:
            r23 = r14
            r22 = r15
            com.google.zxing.client.result.ExpandedProductParsedResult r1 = new com.google.zxing.client.result.ExpandedProductParsedResult
            r3 = r1
            r18 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.client.result.ExpandedProductResultParser.parse(com.google.zxing.Result):com.google.zxing.client.result.ExpandedProductParsedResult");
    }

    private static String findAIvalue(int i, String str) {
        if (str.charAt(i) != '(') {
            return null;
        }
        String substring = str.substring(i + 1);
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == ')') {
                return sb.toString();
            }
            if (charAt < '0' || charAt > '9') {
                return null;
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    private static String findValue(int i, String str) {
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(i);
        for (int i2 = 0; i2 < substring.length(); i2++) {
            char charAt = substring.charAt(i2);
            if (charAt == '(') {
                if (findAIvalue(i2, substring) != null) {
                    break;
                }
                sb.append('(');
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
