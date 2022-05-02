package o;

import id.dana.domain.foundation.logger.PerformanceConstant;
import java.util.HashMap;

public final class StackBlurManager {
    private static long getMax = 0;
    private static boolean getMin = true;
    protected static HashMap<String, Long> length = new HashMap<>();
    private static boolean setMax = false;
    private static boolean setMin = true;

    /* JADX WARNING: Removed duplicated region for block: B:39:0x007f A[Catch:{ Exception -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0082 A[Catch:{ Exception -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c A[Catch:{ Exception -> 0x00ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void setMin(java.lang.String r9) {
        /*
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = length
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            r1 = -1
            int r2 = r9.hashCode()     // Catch:{ Exception -> 0x00ba }
            r3 = -523526006(0xffffffffe0cba08a, float:-1.17383035E20)
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == r3) goto L_0x0032
            r3 = 494451022(0x1d78b94e, float:3.2918327E-21)
            if (r2 == r3) goto L_0x0028
            r3 = 1805471694(0x6b9d4fce, float:3.8035644E26)
            if (r2 == r3) goto L_0x001e
            goto L_0x003b
        L_0x001e:
            java.lang.String r2 = "splashtochallengestarttime"
            boolean r9 = r9.equals(r2)     // Catch:{ Exception -> 0x00ba }
            if (r9 == 0) goto L_0x003b
            r1 = 1
            goto L_0x003b
        L_0x0028:
            java.lang.String r2 = "splashtohometime"
            boolean r9 = r9.equals(r2)     // Catch:{ Exception -> 0x00ba }
            if (r9 == 0) goto L_0x003b
            r1 = 0
            goto L_0x003b
        L_0x0032:
            java.lang.String r2 = "splashtointroducetime"
            boolean r9 = r9.equals(r2)     // Catch:{ Exception -> 0x00ba }
            if (r9 == 0) goto L_0x003b
            r1 = 2
        L_0x003b:
            r2 = 0
            java.lang.String r9 = "startUpEnd"
            if (r1 == 0) goto L_0x0068
            if (r1 == r5) goto L_0x005a
            if (r1 == r4) goto L_0x0047
            r4 = r2
            goto L_0x007b
        L_0x0047:
            boolean r0 = setMax     // Catch:{ Exception -> 0x00ba }
            if (r0 != 0) goto L_0x004c
            return
        L_0x004c:
            setMax = r6     // Catch:{ Exception -> 0x00ba }
            long r0 = getMax     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = "introduceRenderEnd"
            long r4 = setMin(r9, r4)     // Catch:{ Exception -> 0x00ba }
            long r0 = r0 + r4
            java.lang.String r9 = "introduce"
            goto L_0x0065
        L_0x005a:
            long r0 = getMax     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = "riskChallengStart"
            long r4 = setMin(r9, r4)     // Catch:{ Exception -> 0x00ba }
            long r0 = r0 + r4
            java.lang.String r9 = "challenge"
        L_0x0065:
            r4 = r0
            r0 = r9
            goto L_0x007b
        L_0x0068:
            boolean r0 = getMin     // Catch:{ Exception -> 0x00ba }
            if (r0 != 0) goto L_0x006d
            return
        L_0x006d:
            getMin = r6     // Catch:{ Exception -> 0x00ba }
            long r0 = getMax     // Catch:{ Exception -> 0x00ba }
            java.lang.String r4 = "homePageRenderEnd"
            long r4 = setMin(r9, r4)     // Catch:{ Exception -> 0x00ba }
            long r0 = r0 + r4
            java.lang.String r9 = "home"
            goto L_0x0065
        L_0x007b:
            boolean r9 = setMin     // Catch:{ Exception -> 0x00ba }
            if (r9 == 0) goto L_0x0082
            java.lang.String r9 = "coldstarttime"
            goto L_0x0084
        L_0x0082:
            java.lang.String r9 = "hotstarttime3"
        L_0x0084:
            java.lang.String r1 = "icon"
            long r6 = getMax     // Catch:{ Exception -> 0x00ba }
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x00b9
            r2 = 20000(0x4e20, double:9.8813E-320)
            int r8 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r8 < 0) goto L_0x0093
            goto L_0x00b9
        L_0x0093:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x00ba }
            r2.<init>()     // Catch:{ Exception -> 0x00ba }
            java.lang.String r3 = "from"
            r2.put(r3, r1)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r1 = "to"
            r2.put(r1, r0)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r0 = "costTime"
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00ba }
            r2.put(r0, r1)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r0 = "systemCost"
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x00ba }
            r2.put(r0, r1)     // Catch:{ Exception -> 0x00ba }
            java.lang.String r0 = "performance"
            o.VisitUrlPoint.performance(r0, r9, r2)     // Catch:{ Exception -> 0x00ba }
        L_0x00b9:
            return
        L_0x00ba:
            r9 = move-exception
            java.lang.String r0 = "PerformanceTracker"
            o.updateActionSheetContent.w((java.lang.String) r0, (java.lang.Throwable) r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.StackBlurManager.setMin(java.lang.String):void");
    }

    private static long setMin(String str, String str2) {
        try {
            return length.get(str2).longValue() - length.get(str).longValue();
        } catch (Exception e) {
            updateActionSheetContent.w("PerformanceTracker", (Throwable) e);
            return 0;
        }
    }

    public static void length() {
        if (setMin) {
            getMax = setMin(PerformanceConstant.COLD_START_BEGIN, PerformanceConstant.SPLASH_RENDER_END);
        } else {
            getMax = setMin(PerformanceConstant.HOT_START_BEGIN, PerformanceConstant.SPLASH_RENDER_END);
        }
    }

    public static void getMin() {
        getMin = true;
    }

    public static void setMax() {
        setMax = true;
    }

    public static void toFloatRange() {
        setMin = false;
    }

    public static void toDoubleRange() {
        length.clear();
    }

    public static void setMin() {
        if (length.get(PerformanceConstant.HOME_PAGE_RENDER_END) == null) {
            length.put(PerformanceConstant.HOME_PAGE_RENDER_END, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void getMax() {
        if (length.get(PerformanceConstant.RISK_CHALLENGE_START) == null) {
            length.put(PerformanceConstant.RISK_CHALLENGE_START, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void IsOverlapping() {
        if (length.get(PerformanceConstant.INTRODUCE_RENDER_END) == null) {
            length.put(PerformanceConstant.INTRODUCE_RENDER_END, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void isInside() {
        if (length.get(PerformanceConstant.SPLASH_RENDER_END) == null) {
            length.put(PerformanceConstant.SPLASH_RENDER_END, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void equals() {
        getMin = false;
        setMax = false;
        if (length.get(PerformanceConstant.HOT_START_BEGIN) == null) {
            length.put(PerformanceConstant.HOT_START_BEGIN, Long.valueOf(System.currentTimeMillis()));
        }
    }

    public static void toIntRange() {
        if (length.get(PerformanceConstant.COLD_START_BEGIN) == null) {
            length.put(PerformanceConstant.COLD_START_BEGIN, Long.valueOf(System.currentTimeMillis()));
        }
    }
}
