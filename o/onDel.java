package o;

final class onDel implements Runnable, initializeKeyboard {
    private final onInput eventBus;
    private volatile boolean executorRunning;
    private final isShowKeyboard queue = new isShowKeyboard();

    onDel(onInput oninput) {
        this.eventBus = oninput;
    }

    public final void enqueue(initializeNoneKeyboard initializenonekeyboard, Object obj) {
        switchKeyboard obtainPendingPost = switchKeyboard.obtainPendingPost(initializenonekeyboard, obj);
        synchronized (this) {
            this.queue.enqueue(obtainPendingPost);
            if (!this.executorRunning) {
                this.executorRunning = true;
                this.eventBus.getExecutorService().execute(this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2 = r6.eventBus.getLogger();
        r3 = java.util.logging.Level.WARNING;
        r4 = new java.lang.StringBuilder();
        r4.append(java.lang.Thread.currentThread().getName());
        r4.append(" was interruppted");
        r2.log(r3, r4.toString(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        r6.executorRunning = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        throw r1;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            r0 = 0
            o.isShowKeyboard r1 = r6.queue     // Catch:{ InterruptedException -> 0x0027 }
            r2 = 1000(0x3e8, float:1.401E-42)
            o.switchKeyboard r1 = r1.poll(r2)     // Catch:{ InterruptedException -> 0x0027 }
            if (r1 != 0) goto L_0x001f
            monitor-enter(r6)     // Catch:{ InterruptedException -> 0x0027 }
            o.isShowKeyboard r1 = r6.queue     // Catch:{ all -> 0x001c }
            o.switchKeyboard r1 = r1.poll()     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x001a
            r6.executorRunning = r0     // Catch:{ all -> 0x001c }
            monitor-exit(r6)     // Catch:{ all -> 0x001c }
            r6.executorRunning = r0
            return
        L_0x001a:
            monitor-exit(r6)     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x001f
        L_0x001c:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ InterruptedException -> 0x0027 }
            throw r1     // Catch:{ InterruptedException -> 0x0027 }
        L_0x001f:
            o.onInput r2 = r6.eventBus     // Catch:{ InterruptedException -> 0x0027 }
            r2.invokeSubscriber(r1)     // Catch:{ InterruptedException -> 0x0027 }
            goto L_0x0000
        L_0x0025:
            r1 = move-exception
            goto L_0x004f
        L_0x0027:
            r1 = move-exception
            o.onInput r2 = r6.eventBus     // Catch:{ all -> 0x0025 }
            o.AliKeyboardType r2 = r2.getLogger()     // Catch:{ all -> 0x0025 }
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0025 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0025 }
            r4.<init>()     // Catch:{ all -> 0x0025 }
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0025 }
            java.lang.String r5 = r5.getName()     // Catch:{ all -> 0x0025 }
            r4.append(r5)     // Catch:{ all -> 0x0025 }
            java.lang.String r5 = " was interruppted"
            r4.append(r5)     // Catch:{ all -> 0x0025 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0025 }
            r2.log(r3, r4, r1)     // Catch:{ all -> 0x0025 }
            r6.executorRunning = r0
            return
        L_0x004f:
            r6.executorRunning = r0
            goto L_0x0053
        L_0x0052:
            throw r1
        L_0x0053:
            goto L_0x0052
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onDel.run():void");
    }
}
