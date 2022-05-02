package o;

public class createLoadingDialog {
    private static final String TAG = "SplitSDK";
    private static createLoadingDialog instance;
    private boolean _debugLevel = false;

    private void log(int i, String str, Throwable th) {
    }

    private createLoadingDialog() {
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized o.createLoadingDialog instance() {
        /*
            java.lang.Class<o.createLoadingDialog> r0 = o.createLoadingDialog.class
            monitor-enter(r0)
            o.createLoadingDialog r1 = instance     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            o.createLoadingDialog r1 = instance     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            o.createLoadingDialog r1 = new o.createLoadingDialog     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            instance = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1     // Catch:{ all -> 0x001c }
        L_0x0018:
            o.createLoadingDialog r1 = instance     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r1
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.createLoadingDialog.instance():o.createLoadingDialog");
    }

    public synchronized void debugLevel(boolean z) {
        this._debugLevel = z;
    }

    private static String formatMessage(String str, Object[] objArr) {
        return (objArr == null || objArr.length <= 0) ? str : String.format(str, objArr);
    }

    public static void v(String str, Object... objArr) {
        v(formatMessage(str, objArr));
    }

    public static void v(String str) {
        instance().log(2, str, (Throwable) null);
    }

    public static void v(String str, Throwable th) {
        instance().log(2, str, th);
    }

    public static void d(String str, Object... objArr) {
        d(formatMessage(str, objArr));
    }

    public static void d(String str) {
        instance().log(3, str, (Throwable) null);
    }

    public static void d(String str, Throwable th) {
        instance().log(3, str, th);
    }

    public static void i(String str, Object... objArr) {
        i(formatMessage(str, objArr));
    }

    public static void i(String str) {
        instance().log(4, str, (Throwable) null);
    }

    public static void i(String str, Throwable th) {
        instance().log(4, str, th);
    }

    public static void w(String str, Object... objArr) {
        w(formatMessage(str, objArr));
    }

    public static void w(Throwable th, String str, Object... objArr) {
        w(formatMessage(str, objArr), th);
    }

    public static void w(String str) {
        instance().log(5, str, (Throwable) null);
    }

    public static void w(String str, Throwable th) {
        instance().log(5, str, th);
    }

    public static void e(String str, Object... objArr) {
        e(formatMessage(str, objArr));
    }

    public static void e(Throwable th, String str, Object... objArr) {
        e(formatMessage(str, objArr), th);
    }

    public static void e(String str) {
        instance().log(6, str, (Throwable) null);
    }

    public static void e(String str, Throwable th) {
        instance().log(6, str, th);
    }

    public static void e(Throwable th) {
        instance().log(6, "", th);
    }

    public static void wtf(String str, Object... objArr) {
        wtf(formatMessage(str, objArr));
    }

    public static void wtf(String str) {
        instance().log(7, str, (Throwable) null);
    }

    public static void wtf(String str, Throwable th) {
        instance().log(7, str, th);
    }
}
