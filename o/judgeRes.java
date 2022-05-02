package o;

import java.util.ArrayList;
import java.util.List;

public final class judgeRes {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static o.getTypeface setMin(o.getTypefaceByCat r3, java.lang.String r4, o.getPerformanceTracker r5) {
        /*
            int r0 = r4.hashCode()
            r1 = -1381030494(0xffffffffadaf25a2, float:-1.9911909E-11)
            r2 = 1
            if (r0 == r1) goto L_0x0029
            r1 = -1066664664(0xffffffffc06bfd28, float:-3.6873264)
            if (r0 == r1) goto L_0x001f
            r1 = 770434801(0x2debe6f1, float:2.6818965E-11)
            if (r0 == r1) goto L_0x0015
            goto L_0x0033
        L_0x0015:
            java.lang.String r0 = "apssflyer"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "mixpanel"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "branch"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x0044
            if (r4 == r2) goto L_0x003e
            o.BlurFactor r4 = new o.BlurFactor
            r4.<init>(r3, r5)
            return r4
        L_0x003e:
            o.getPx r4 = new o.getPx
            r4.<init>(r3)
            return r4
        L_0x0044:
            o.getColorByValue r4 = new o.getColorByValue
            r4.<init>(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.judgeRes.setMin(o.getTypefaceByCat, java.lang.String, o.getPerformanceTracker):o.getTypeface");
    }

    public static List<getTypeface> getMin(getTypefaceByCat gettypefacebycat, getPerformanceTracker getperformancetracker, String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String min : strArr) {
            arrayList.add(setMin(gettypefacebycat, min, getperformancetracker));
        }
        return arrayList;
    }
}
