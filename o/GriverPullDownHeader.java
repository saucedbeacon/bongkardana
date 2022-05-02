package o;

import java.util.LinkedList;
import java.util.List;
import o.GriverProgressBar;

public final class GriverPullDownHeader implements GriverProgressBar.UpdateRunnable, setLoadMoreTips {
    volatile boolean getMax;
    List<GriverProgressBar.UpdateRunnable> setMax;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0017, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r1.hasNext() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.next().dispose();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        o.registerNode.getMax(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        r2.add(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        if (r2.size() != 1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        throw o.utAvaiable.getMin((java.lang.Throwable) r2.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        throw new io.reactivex.exceptions.CompositeException((java.lang.Iterable<? extends java.lang.Throwable>) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r4 = this;
            boolean r0 = r4.getMax
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r4)
            boolean r0 = r4.getMax     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            return
        L_0x000c:
            r0 = 1
            r4.getMax = r0     // Catch:{ all -> 0x0055 }
            java.util.List<o.GriverProgressBar$UpdateRunnable> r1 = r4.setMax     // Catch:{ all -> 0x0055 }
            r2 = 0
            r4.setMax = r2     // Catch:{ all -> 0x0055 }
            monitor-exit(r4)     // Catch:{ all -> 0x0055 }
            if (r1 == 0) goto L_0x0054
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x003a
            java.lang.Object r3 = r1.next()
            o.GriverProgressBar$UpdateRunnable r3 = (o.GriverProgressBar.UpdateRunnable) r3
            r3.dispose()     // Catch:{ all -> 0x002b }
            goto L_0x001b
        L_0x002b:
            r3 = move-exception
            o.registerNode.getMax(r3)
            if (r2 != 0) goto L_0x0036
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0036:
            r2.add(r3)
            goto L_0x001b
        L_0x003a:
            if (r2 == 0) goto L_0x0054
            int r1 = r2.size()
            if (r1 != r0) goto L_0x004e
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.RuntimeException r0 = o.utAvaiable.getMin(r0)
            throw r0
        L_0x004e:
            io.reactivex.exceptions.CompositeException r0 = new io.reactivex.exceptions.CompositeException
            r0.<init>((java.lang.Iterable<? extends java.lang.Throwable>) r2)
            throw r0
        L_0x0054:
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r4)
            goto L_0x0059
        L_0x0058:
            throw r0
        L_0x0059:
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GriverPullDownHeader.dispose():void");
    }

    public final boolean isDisposed() {
        return this.getMax;
    }

    public final boolean getMin(GriverProgressBar.UpdateRunnable updateRunnable) {
        setRefreshAnimation.getMax(updateRunnable, "d is null");
        if (!this.getMax) {
            synchronized (this) {
                if (!this.getMax) {
                    List list = this.setMax;
                    if (list == null) {
                        list = new LinkedList();
                        this.setMax = list;
                    }
                    list.add(updateRunnable);
                    return true;
                }
            }
        }
        updateRunnable.dispose();
        return false;
    }

    public final boolean setMin(GriverProgressBar.UpdateRunnable updateRunnable) {
        if (!setMax(updateRunnable)) {
            return false;
        }
        updateRunnable.dispose();
        return true;
    }

    public final boolean setMax(GriverProgressBar.UpdateRunnable updateRunnable) {
        setRefreshAnimation.getMax(updateRunnable, "Disposable item is null");
        if (this.getMax) {
            return false;
        }
        synchronized (this) {
            if (this.getMax) {
                return false;
            }
            List<GriverProgressBar.UpdateRunnable> list = this.setMax;
            if (list == null || !list.remove(updateRunnable)) {
                return false;
            }
            return true;
        }
    }
}
