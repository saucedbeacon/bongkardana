package o;

public final class isActivityLandscape {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.findBestPreviewSizeValue length(android.content.Context r2, java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 0
            switch(r0) {
                case -1436108013: goto L_0x005a;
                case -1360467711: goto L_0x0050;
                case -791770330: goto L_0x0046;
                case 3321844: goto L_0x003c;
                case 28903346: goto L_0x0031;
                case 109518736: goto L_0x0027;
                case 133862058: goto L_0x001d;
                case 497130182: goto L_0x0013;
                case 1934780818: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x0064
        L_0x0009:
            java.lang.String r0 = "whatsapp"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            r3 = 0
            goto L_0x0065
        L_0x0013:
            java.lang.String r0 = "facebook"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            r3 = 3
            goto L_0x0065
        L_0x001d:
            java.lang.String r0 = "dingtalk"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            r3 = 6
            goto L_0x0065
        L_0x0027:
            java.lang.String r0 = "slack"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            r3 = 5
            goto L_0x0065
        L_0x0031:
            java.lang.String r0 = "instagram"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            r3 = 8
            goto L_0x0065
        L_0x003c:
            java.lang.String r0 = "line"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            r3 = 2
            goto L_0x0065
        L_0x0046:
            java.lang.String r0 = "wechat"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            r3 = 7
            goto L_0x0065
        L_0x0050:
            java.lang.String r0 = "telegram"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            r3 = 4
            goto L_0x0065
        L_0x005a:
            java.lang.String r0 = "messenger"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0064
            r3 = 1
            goto L_0x0065
        L_0x0064:
            r3 = -1
        L_0x0065:
            switch(r3) {
                case 0: goto L_0x015b;
                case 1: goto L_0x013e;
                case 2: goto L_0x0118;
                case 3: goto L_0x00fb;
                case 4: goto L_0x00de;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00a4;
                case 7: goto L_0x0087;
                case 8: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            r2 = 0
            return r2
        L_0x006a:
            o.findBestPreviewSizeValue$getMin r3 = new o.findBestPreviewSizeValue$getMin
            r3.<init>()
            r0 = 2131887606(0x7f1205f6, float:1.9409824E38)
            java.lang.String r2 = r2.getString(r0)
            r3.getMax = r2
            java.lang.String r2 = "com.instagram.android"
            r3.getMin = r2
            r2 = 2131232318(0x7f08063e, float:1.8080742E38)
            r3.setMax = r2
            o.findBestPreviewSizeValue r2 = new o.findBestPreviewSizeValue
            r2.<init>(r3, r1)
            return r2
        L_0x0087:
            o.findBestPreviewSizeValue$getMin r3 = new o.findBestPreviewSizeValue$getMin
            r3.<init>()
            r0 = 2131889371(0x7f120cdb, float:1.9413404E38)
            java.lang.String r2 = r2.getString(r0)
            r3.getMax = r2
            java.lang.String r2 = "com.tencent.mm"
            r3.getMin = r2
            r2 = 2131232324(0x7f080644, float:1.8080754E38)
            r3.setMax = r2
            o.findBestPreviewSizeValue r2 = new o.findBestPreviewSizeValue
            r2.<init>(r3, r1)
            return r2
        L_0x00a4:
            o.findBestPreviewSizeValue$getMin r3 = new o.findBestPreviewSizeValue$getMin
            r3.<init>()
            r0 = 2131886834(0x7f1202f2, float:1.9408258E38)
            java.lang.String r2 = r2.getString(r0)
            r3.getMax = r2
            java.lang.String r2 = "com.alibaba.android.rimet"
            r3.getMin = r2
            r2 = 2131232316(0x7f08063c, float:1.8080738E38)
            r3.setMax = r2
            o.findBestPreviewSizeValue r2 = new o.findBestPreviewSizeValue
            r2.<init>(r3, r1)
            return r2
        L_0x00c1:
            o.findBestPreviewSizeValue$getMin r3 = new o.findBestPreviewSizeValue$getMin
            r3.<init>()
            r0 = 2131888910(0x7f120b0e, float:1.9412469E38)
            java.lang.String r2 = r2.getString(r0)
            r3.getMax = r2
            java.lang.String r2 = "com.Slack"
            r3.getMin = r2
            r2 = 2131232322(0x7f080642, float:1.808075E38)
            r3.setMax = r2
            o.findBestPreviewSizeValue r2 = new o.findBestPreviewSizeValue
            r2.<init>(r3, r1)
            return r2
        L_0x00de:
            o.findBestPreviewSizeValue$getMin r3 = new o.findBestPreviewSizeValue$getMin
            r3.<init>()
            r0 = 2131889038(0x7f120b8e, float:1.9412728E38)
            java.lang.String r2 = r2.getString(r0)
            r3.getMax = r2
            java.lang.String r2 = "org.telegram.messenger"
            r3.getMin = r2
            r2 = 2131232323(0x7f080643, float:1.8080752E38)
            r3.setMax = r2
            o.findBestPreviewSizeValue r2 = new o.findBestPreviewSizeValue
            r2.<init>(r3, r1)
            return r2
        L_0x00fb:
            o.findBestPreviewSizeValue$getMin r3 = new o.findBestPreviewSizeValue$getMin
            r3.<init>()
            r0 = 2131887032(0x7f1203b8, float:1.940866E38)
            java.lang.String r2 = r2.getString(r0)
            r3.getMax = r2
            java.lang.String r2 = "com.facebook.katana"
            r3.getMin = r2
            r2 = 2131232317(0x7f08063d, float:1.808074E38)
            r3.setMax = r2
            o.findBestPreviewSizeValue r2 = new o.findBestPreviewSizeValue
            r2.<init>(r3, r1)
            return r2
        L_0x0118:
            o.findBestPreviewSizeValue$getMin r3 = new o.findBestPreviewSizeValue$getMin
            r3.<init>()
            r0 = 2131887831(0x7f1206d7, float:1.941028E38)
            java.lang.String r0 = r2.getString(r0)
            r3.getMax = r0
            java.lang.String r0 = "jp.naver.line.android"
            r3.getMin = r0
            r0 = 2131886492(0x7f12019c, float:1.9407564E38)
            java.lang.String r2 = r2.getString(r0)
            r3.setMin = r2
            r2 = 2131232319(0x7f08063f, float:1.8080744E38)
            r3.setMax = r2
            o.findBestPreviewSizeValue r2 = new o.findBestPreviewSizeValue
            r2.<init>(r3, r1)
            return r2
        L_0x013e:
            o.findBestPreviewSizeValue$getMin r3 = new o.findBestPreviewSizeValue$getMin
            r3.<init>()
            r0 = 2131887963(0x7f12075b, float:1.9410548E38)
            java.lang.String r2 = r2.getString(r0)
            r3.getMax = r2
            java.lang.String r2 = "com.facebook.orca"
            r3.getMin = r2
            r2 = 2131232320(0x7f080640, float:1.8080746E38)
            r3.setMax = r2
            o.findBestPreviewSizeValue r2 = new o.findBestPreviewSizeValue
            r2.<init>(r3, r1)
            return r2
        L_0x015b:
            o.findBestPreviewSizeValue$getMin r3 = new o.findBestPreviewSizeValue$getMin
            r3.<init>()
            r0 = 2131889374(0x7f120cde, float:1.941341E38)
            java.lang.String r0 = r2.getString(r0)
            r3.getMax = r0
            java.lang.String r0 = "com.whatsapp"
            r3.getMin = r0
            r0 = 2131886494(0x7f12019e, float:1.9407568E38)
            java.lang.String r2 = r2.getString(r0)
            r3.setMin = r2
            r2 = 2131232325(0x7f080645, float:1.8080756E38)
            r3.setMax = r2
            o.findBestPreviewSizeValue r2 = new o.findBestPreviewSizeValue
            r2.<init>(r3, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isActivityLandscape.length(android.content.Context, java.lang.String):o.findBestPreviewSizeValue");
    }
}
