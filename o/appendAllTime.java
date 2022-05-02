package o;

public final class appendAllTime extends appendUpMsgCount {
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[LOOP:1: B:26:0x008e->B:28:0x0093, LOOP_START, PHI: r2 
      PHI: (r2v4 int) = (r2v1 int), (r2v5 int) binds: [B:25:0x008c, B:28:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] setMin(o.appendUpMsgLens r11, java.lang.String[] r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0008:
            int r4 = r12.length
            if (r2 >= r4) goto L_0x009c
            r4 = r12[r2]
            java.lang.String r5 = "--"
            boolean r6 = r5.equals(r4)
            r7 = 1
            if (r6 == 0) goto L_0x001c
            r0.add(r5)
        L_0x0019:
            r3 = 1
            goto L_0x008c
        L_0x001c:
            java.lang.String r5 = "-"
            boolean r6 = r5.equals(r4)
            if (r6 == 0) goto L_0x0028
            r0.add(r5)
            goto L_0x008c
        L_0x0028:
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0089
            java.lang.String r5 = o.appendErrMsg.length(r4)
            boolean r6 = r11.hasOption(r5)
            if (r6 == 0) goto L_0x003c
            r0.add(r4)
            goto L_0x008c
        L_0x003c:
            r6 = 61
            int r8 = r5.indexOf(r6)
            r9 = -1
            if (r8 == r9) goto L_0x006b
            int r8 = r5.indexOf(r6)
            java.lang.String r5 = r5.substring(r1, r8)
            boolean r5 = r11.hasOption(r5)
            if (r5 == 0) goto L_0x006b
            int r5 = r4.indexOf(r6)
            java.lang.String r5 = r4.substring(r1, r5)
            r0.add(r5)
            int r5 = r4.indexOf(r6)
            int r5 = r5 + r7
            java.lang.String r4 = r4.substring(r5)
            r0.add(r4)
            goto L_0x008c
        L_0x006b:
            r5 = 2
            java.lang.String r6 = r4.substring(r1, r5)
            boolean r6 = r11.hasOption(r6)
            if (r6 == 0) goto L_0x0085
            java.lang.String r6 = r4.substring(r1, r5)
            r0.add(r6)
            java.lang.String r4 = r4.substring(r5)
            r0.add(r4)
            goto L_0x008c
        L_0x0085:
            r0.add(r4)
            goto L_0x0019
        L_0x0089:
            r0.add(r4)
        L_0x008c:
            if (r3 == 0) goto L_0x0099
        L_0x008e:
            int r2 = r2 + 1
            int r4 = r12.length
            if (r2 >= r4) goto L_0x0099
            r4 = r12[r2]
            r0.add(r4)
            goto L_0x008e
        L_0x0099:
            int r2 = r2 + r7
            goto L_0x0008
        L_0x009c:
            int r11 = r0.size()
            java.lang.String[] r11 = new java.lang.String[r11]
            java.lang.Object[] r11 = r0.toArray(r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: o.appendAllTime.setMin(o.appendUpMsgLens, java.lang.String[]):java.lang.String[]");
    }
}
