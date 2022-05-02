package o;

public final class putTypeface {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<o.convertSpToPx> setMin(android.content.Context r13, java.lang.String r14, o.UIPropUtil r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r14.hashCode()
            r3 = 3
            r4 = -1
            r5 = 0
            r6 = 2
            r7 = 1
            switch(r2) {
                case -1811999097: goto L_0x003f;
                case -1161171580: goto L_0x0035;
                case -594018245: goto L_0x002b;
                case 599603983: goto L_0x0021;
                case 1920498033: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x0049
        L_0x0017:
            java.lang.String r2 = "Pay QR Open"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0049
            r2 = 3
            goto L_0x004a
        L_0x0021:
            java.lang.String r2 = "unsafe_device"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0049
            r2 = 0
            goto L_0x004a
        L_0x002b:
            java.lang.String r2 = "Request Money Open"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0049
            r2 = 2
            goto L_0x004a
        L_0x0035:
            java.lang.String r2 = "Pay QR Result"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0049
            r2 = 4
            goto L_0x004a
        L_0x003f:
            java.lang.String r2 = "Splash"
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x0049
            r2 = 1
            goto L_0x004a
        L_0x0049:
            r2 = -1
        L_0x004a:
            java.lang.String r8 = "mixpanel"
            java.lang.String r9 = "branch"
            java.lang.String r10 = "firebase"
            java.lang.String r11 = "apssflyer"
            if (r2 == 0) goto L_0x0058
            r1.add(r8)
            goto L_0x0061
        L_0x0058:
            r1.add(r11)
            r1.add(r10)
            r1.add(r9)
        L_0x0061:
            java.util.Iterator r1 = r1.iterator()
        L_0x0065:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e1
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r12 = r2.hashCode()
            switch(r12) {
                case -1381030494: goto L_0x0091;
                case -1066664664: goto L_0x0089;
                case -563351033: goto L_0x0081;
                case 770434801: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x0099
        L_0x0079:
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L_0x0099
            r2 = 0
            goto L_0x009a
        L_0x0081:
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x0099
            r2 = 1
            goto L_0x009a
        L_0x0089:
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0099
            r2 = 3
            goto L_0x009a
        L_0x0091:
            boolean r2 = r2.equals(r9)
            if (r2 == 0) goto L_0x0099
            r2 = 2
            goto L_0x009a
        L_0x0099:
            r2 = -1
        L_0x009a:
            if (r2 == 0) goto L_0x00d2
            if (r2 == r7) goto L_0x00c3
            if (r2 == r6) goto L_0x00b4
            o.Blur$getMax r2 = new o.Blur$getMax
            r2.<init>(r13)
            r2.getMax = r14
            org.json.JSONObject r12 = r15.getMax
            r2.setMax = r12
            o.Blur r12 = new o.Blur
            r12.<init>(r2, r5)
            r0.add(r12)
            goto L_0x0065
        L_0x00b4:
            o.AUBubbleDrawable r2 = new o.AUBubbleDrawable
            org.json.JSONObject r12 = r15.getMax
            java.util.Map r12 = o.setSelectedItem.getMin(r12)
            r2.<init>(r13, r14, r12)
            r0.add(r2)
            goto L_0x0065
        L_0x00c3:
            o.getActivityByContext r2 = new o.getActivityByContext
            org.json.JSONObject r12 = r15.getMax
            android.os.Bundle r12 = o.setSelectedItem.setMin(r12)
            r2.<init>(r13, r14, r12)
            r0.add(r2)
            goto L_0x0065
        L_0x00d2:
            o.setWidth r2 = new o.setWidth
            org.json.JSONObject r12 = r15.getMax
            java.util.Map r12 = o.setSelectedItem.getMin(r12)
            r2.<init>(r13, r14, r12)
            r0.add(r2)
            goto L_0x0065
        L_0x00e1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.putTypeface.setMin(android.content.Context, java.lang.String, o.UIPropUtil):java.util.List");
    }
}
