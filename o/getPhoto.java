package o;

public class getPhoto {
    public boolean getMax;
    public int getMin;
    private String setMin;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String setMin(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.setMin
            int r1 = r0.hashCode()
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r1) {
                case 68476: goto L_0x002b;
                case 2122871: goto L_0x0021;
                case 2255364: goto L_0x0017;
                case 69916399: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r1 = "Hours"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0017:
            java.lang.String r1 = "Hour"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0035
            r1 = 0
            goto L_0x0036
        L_0x0021:
            java.lang.String r1 = "Days"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0035
            r1 = 3
            goto L_0x0036
        L_0x002b:
            java.lang.String r1 = "Day"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0035
            r1 = 2
            goto L_0x0036
        L_0x0035:
            r1 = -1
        L_0x0036:
            if (r1 == 0) goto L_0x0057
            if (r1 == r4) goto L_0x004f
            if (r1 == r3) goto L_0x0047
            if (r1 == r2) goto L_0x003f
            return r0
        L_0x003f:
            r0 = 2131887004(0x7f12039c, float:1.9408603E38)
            java.lang.String r6 = r6.getString(r0)
            return r6
        L_0x0047:
            r0 = 2131887003(0x7f12039b, float:1.94086E38)
            java.lang.String r6 = r6.getString(r0)
            return r6
        L_0x004f:
            r0 = 2131887006(0x7f12039e, float:1.9408607E38)
            java.lang.String r6 = r6.getString(r0)
            return r6
        L_0x0057:
            r0 = 2131887005(0x7f12039d, float:1.9408605E38)
            java.lang.String r6 = r6.getString(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getPhoto.setMin(android.content.Context):java.lang.String");
    }

    public final void getMax(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(745875621, oncanceled);
            onCancelLoad.getMin(745875621, oncanceled);
        }
        this.setMin = str;
    }

    public final boolean getMax() {
        return this.getMax;
    }
}
