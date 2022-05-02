package o;

public final class ContactActivityResultPoint {
    public String IsOverlapping;
    public String getMax;
    public long getMin;
    public String length;
    public String setMax;
    public boolean setMin;
    public getShortName toFloatRange;
    public String toIntRange;

    public final boolean getMin() {
        return this.setMin;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getMax() {
        /*
            r6 = this;
            java.lang.String r0 = r6.toIntRange
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            switch(r1) {
                case -2035039290: goto L_0x002c;
                case -805752590: goto L_0x0022;
                case 66575: goto L_0x0018;
                case 191796002: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0036
        L_0x000e:
            java.lang.String r1 = "VOUCHER_DETAIL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0018:
            java.lang.String r1 = "CDP"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "TRANSACTION_DETAIL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "INNER_URL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 3
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            java.lang.String r1 = "https://m.dana.id"
            if (r0 == 0) goto L_0x007d
            if (r0 == r5) goto L_0x006c
            if (r0 == r3) goto L_0x0053
            if (r0 == r2) goto L_0x0044
            java.lang.String r0 = r6.IsOverlapping
            return r0
        L_0x0044:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r1 = r6.IsOverlapping
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0053:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = r6.IsOverlapping
            r1[r4] = r2
            java.lang.String r2 = "/m/notifications/detail?spaceCode=%s&isClosable=true"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x006c:
            o.getShortName r0 = r6.toFloatRange
            java.lang.String r0 = r0.getVoucherDetail()
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = r6.IsOverlapping
            r1[r4] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
        L_0x007d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = r6.IsOverlapping
            r1[r4] = r2
            java.lang.String r2 = "/m/portal/transaction?bizOrderId=%s&isClosable=true"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ContactActivityResultPoint.getMax():java.lang.String");
    }
}
