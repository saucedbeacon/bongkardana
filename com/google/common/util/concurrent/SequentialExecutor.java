package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

@GwtIncompatible
final class SequentialExecutor implements Executor {
    /* access modifiers changed from: private */
    public static final Logger log = Logger.getLogger(SequentialExecutor.class.getName());
    private final Executor executor;
    /* access modifiers changed from: private */
    @GuardedBy("queue")
    public final Deque<Runnable> queue = new ArrayDeque();
    private final QueueWorker worker = new QueueWorker();
    @GuardedBy("queue")
    private long workerRunCount = 0;
    /* access modifiers changed from: private */
    @GuardedBy("queue")
    public WorkerRunningState workerRunningState = WorkerRunningState.IDLE;

    enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    static /* synthetic */ long access$308(SequentialExecutor sequentialExecutor) {
        long j = sequentialExecutor.workerRunCount;
        sequentialExecutor.workerRunCount = 1 + j;
        return j;
    }

    SequentialExecutor(Executor executor2) {
        this.executor = (Executor) Preconditions.checkNotNull(executor2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6.executor.execute(r6.worker);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        if (r6.workerRunningState == com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r7 == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        r7 = r6.queue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        monitor-enter(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r6.workerRunCount != r1) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r6.workerRunningState != com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        r6.workerRunningState = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        monitor-exit(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0050, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        monitor-enter(r6.queue);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (r6.workerRunningState == com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x006b, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if ((r1 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0073, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0074, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(final java.lang.Runnable r7) {
        /*
            r6 = this;
            com.google.common.base.Preconditions.checkNotNull(r7)
            java.util.Deque<java.lang.Runnable> r0 = r6.queue
            monitor-enter(r0)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r6.workerRunningState     // Catch:{ all -> 0x007f }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x007f }
            if (r1 == r2) goto L_0x0078
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = r6.workerRunningState     // Catch:{ all -> 0x007f }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r2 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED     // Catch:{ all -> 0x007f }
            if (r1 != r2) goto L_0x0013
            goto L_0x0078
        L_0x0013:
            long r1 = r6.workerRunCount     // Catch:{ all -> 0x007f }
            com.google.common.util.concurrent.SequentialExecutor$1 r3 = new com.google.common.util.concurrent.SequentialExecutor$1     // Catch:{ all -> 0x007f }
            r3.<init>(r7)     // Catch:{ all -> 0x007f }
            java.util.Deque<java.lang.Runnable> r7 = r6.queue     // Catch:{ all -> 0x007f }
            r7.add(r3)     // Catch:{ all -> 0x007f }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r7 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x007f }
            r6.workerRunningState = r7     // Catch:{ all -> 0x007f }
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            r7 = 1
            r0 = 0
            java.util.concurrent.Executor r4 = r6.executor     // Catch:{ RuntimeException -> 0x0052, Error -> 0x0050 }
            com.google.common.util.concurrent.SequentialExecutor$QueueWorker r5 = r6.worker     // Catch:{ RuntimeException -> 0x0052, Error -> 0x0050 }
            r4.execute(r5)     // Catch:{ RuntimeException -> 0x0052, Error -> 0x0050 }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = r6.workerRunningState
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r4 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING
            if (r3 == r4) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            if (r7 == 0) goto L_0x0038
            return
        L_0x0038:
            java.util.Deque<java.lang.Runnable> r7 = r6.queue
            monitor-enter(r7)
            long r3 = r6.workerRunCount     // Catch:{ all -> 0x004d }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004b
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r6.workerRunningState     // Catch:{ all -> 0x004d }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r1 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x004d }
            if (r0 != r1) goto L_0x004b
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUED     // Catch:{ all -> 0x004d }
            r6.workerRunningState = r0     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r7)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0050:
            r1 = move-exception
            goto L_0x0053
        L_0x0052:
            r1 = move-exception
        L_0x0053:
            java.util.Deque<java.lang.Runnable> r2 = r6.queue
            monitor-enter(r2)
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r4 = r6.workerRunningState     // Catch:{ all -> 0x0075 }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r5 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch:{ all -> 0x0075 }
            if (r4 == r5) goto L_0x0062
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r4 = r6.workerRunningState     // Catch:{ all -> 0x0075 }
            com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r5 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.QUEUING     // Catch:{ all -> 0x0075 }
            if (r4 != r5) goto L_0x006b
        L_0x0062:
            java.util.Deque<java.lang.Runnable> r4 = r6.queue     // Catch:{ all -> 0x0075 }
            boolean r3 = r4.removeLastOccurrence(r3)     // Catch:{ all -> 0x0075 }
            if (r3 == 0) goto L_0x006b
            goto L_0x006c
        L_0x006b:
            r7 = 0
        L_0x006c:
            boolean r0 = r1 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0074
            if (r7 != 0) goto L_0x0074
            monitor-exit(r2)     // Catch:{ all -> 0x0075 }
            return
        L_0x0074:
            throw r1     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0078:
            java.util.Deque<java.lang.Runnable> r1 = r6.queue     // Catch:{ all -> 0x007f }
            r1.add(r7)     // Catch:{ all -> 0x007f }
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            return
        L_0x007f:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.execute(java.lang.Runnable):void");
    }

    final class QueueWorker implements Runnable {
        private QueueWorker() {
        }

        public final void run() {
            try {
                workOnQueue();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.queue) {
                    WorkerRunningState unused = SequentialExecutor.this.workerRunningState = WorkerRunningState.IDLE;
                    throw e;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0052, code lost:
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            r3.run();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            com.google.common.util.concurrent.SequentialExecutor.access$400().log(java.util.logging.Level.SEVERE, "Exception while executing runnable ".concat(java.lang.String.valueOf(r3)), r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
            if (r1 != false) goto L_0x0072;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x007a, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r1 == false) goto L_?;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void workOnQueue() {
            /*
                r7 = this;
                r0 = 0
                r1 = 0
            L_0x0002:
                com.google.common.util.concurrent.SequentialExecutor r2 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x006f }
                java.util.Deque r2 = r2.queue     // Catch:{ all -> 0x006f }
                monitor-enter(r2)     // Catch:{ all -> 0x006f }
                if (r0 != 0) goto L_0x002d
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x006c }
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = r0.workerRunningState     // Catch:{ all -> 0x006c }
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x006c }
                if (r0 != r3) goto L_0x0020
                monitor-exit(r2)     // Catch:{ all -> 0x006c }
                if (r1 == 0) goto L_0x001f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x001f:
                return
            L_0x0020:
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x006c }
                com.google.common.util.concurrent.SequentialExecutor.access$308(r0)     // Catch:{ all -> 0x006c }
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x006c }
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch:{ all -> 0x006c }
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState unused = r0.workerRunningState = r3     // Catch:{ all -> 0x006c }
                r0 = 1
            L_0x002d:
                com.google.common.util.concurrent.SequentialExecutor r3 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x006c }
                java.util.Deque r3 = r3.queue     // Catch:{ all -> 0x006c }
                java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x006c }
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch:{ all -> 0x006c }
                if (r3 != 0) goto L_0x004d
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch:{ all -> 0x006c }
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch:{ all -> 0x006c }
                com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState unused = r0.workerRunningState = r3     // Catch:{ all -> 0x006c }
                monitor-exit(r2)     // Catch:{ all -> 0x006c }
                if (r1 == 0) goto L_0x004c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L_0x004c:
                return
            L_0x004d:
                monitor-exit(r2)     // Catch:{ all -> 0x006f }
                boolean r2 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x006f }
                r1 = r1 | r2
                r3.run()     // Catch:{ RuntimeException -> 0x0057 }
                goto L_0x0002
            L_0x0057:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.SequentialExecutor.log     // Catch:{ all -> 0x006f }
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x006f }
                java.lang.String r6 = "Exception while executing runnable "
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x006f }
                java.lang.String r3 = r6.concat(r3)     // Catch:{ all -> 0x006f }
                r4.log(r5, r3, r2)     // Catch:{ all -> 0x006f }
                goto L_0x0002
            L_0x006c:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x006f }
                throw r0     // Catch:{ all -> 0x006f }
            L_0x006f:
                r0 = move-exception
                if (r1 == 0) goto L_0x0079
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L_0x0079:
                goto L_0x007b
            L_0x007a:
                throw r0
            L_0x007b:
                goto L_0x007a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.QueueWorker.workOnQueue():void");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SequentialExecutor@");
        sb.append(System.identityHashCode(this));
        sb.append("{");
        sb.append(this.executor);
        sb.append("}");
        return sb.toString();
    }
}
