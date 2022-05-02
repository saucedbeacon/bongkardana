package o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import o.APExpansion;
import o.APSecuritySdk;
import o.DeviceTokenClient;
import o.TMNTokenClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u0002092\u00020::\u00044567B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0002J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0002J\u000f\u0010\u0018\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0002J\u001d\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00142\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0014¢\u0006\u0004\b+\u0010\u0002R$\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00118T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0016\u00103\u001a\u00020\u00148T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016¨\u00068"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "<init>", "()V", "", "closeQueue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dequeue", "()Ljava/lang/Runnable;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", "", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "", "processNextEvent", "()J", "rescheduleAllDelayed", "resetAll", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "", "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "shutdown", "value", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "getNextTime", "nextTime", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;"}, k = 1, mv = {1, 4, 2})
public abstract class ReportResult extends BugTrackMessageService implements Configuration {
    private static final /* synthetic */ AtomicReferenceFieldUpdater getMin;
    private static final /* synthetic */ AtomicReferenceFieldUpdater toIntRange;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    static {
        Class<ReportResult> cls = ReportResult.class;
        getMin = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_queue");
        toIntRange = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_delayed");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    public final boolean toDoubleRange() {
        return this._isCompleted;
    }

    /* access modifiers changed from: protected */
    public final boolean getMax() {
        if (!isInside()) {
            return false;
        }
        length length2 = (length) this._delayed;
        if (length2 != null && !length2.getMin()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof afterConnect) {
            return ((afterConnect) obj).setMin();
        }
        if (obj == TMNTokenClient.AnonymousClass1.setMax) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final long getMin() {
        getMax getmax;
        if (super.getMin() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof afterConnect) {
                if (!((afterConnect) obj).setMin()) {
                    return 0;
                }
            } else if (obj == TMNTokenClient.AnonymousClass1.setMax) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        length length2 = (length) this._delayed;
        if (length2 == null || (getmax = (getMax) length2.getMax()) == null) {
            return Long.MAX_VALUE;
        }
        long j = getmax.getMin;
        isBlocking isblocking = processHandshake.setMin;
        return RangesKt.coerceAtLeast(j - (isblocking != null ? isblocking.setMax() : System.nanoTime()), 0);
    }

    /* access modifiers changed from: protected */
    public final void IsOverlapping() {
        isNeedRead isneedread = isNeedRead.setMin;
        isNeedRead.getMax();
        this._isCompleted = 1;
        if (!getApdidToken.setMax() || toDoubleRange()) {
            while (true) {
                Object obj = this._queue;
                if (obj != null) {
                    if (!(obj instanceof afterConnect)) {
                        if (obj == TMNTokenClient.AnonymousClass1.setMax) {
                            break;
                        }
                        afterConnect afterconnect = new afterConnect(8, true);
                        if (obj != null) {
                            afterconnect.setMin((Runnable) obj);
                            if (getMin.compareAndSet(this, obj, afterconnect)) {
                                break;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                        }
                    } else {
                        ((afterConnect) obj).setMax();
                        break;
                    }
                } else if (getMin.compareAndSet(this, (Object) null, TMNTokenClient.AnonymousClass1.setMax)) {
                    break;
                }
            }
            do {
            } while (setMin() <= 0);
            valueOf();
            return;
        }
        throw new AssertionError();
    }

    public final void setMin(long j, @NotNull cy1<? super Unit> cy1) {
        long max = TMNTokenClient.AnonymousClass1.setMax(j);
        if (max < 4611686018427387903L) {
            isBlocking isblocking = processHandshake.setMin;
            long max2 = isblocking != null ? isblocking.setMax() : System.nanoTime();
            setMax setmax = new setMax(max + max2, cy1);
            cy1.getMin(new TMNTokenClient(setmax));
            length(max2, setmax);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0096 A[EDGE_INSN: B:65:0x0096->B:52:0x0096 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long setMin() {
        /*
            r10 = this;
            boolean r0 = r10.toFloatRange()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r10._delayed
            o.ReportResult$length r0 = (o.ReportResult.length) r0
            r3 = 0
            if (r0 == 0) goto L_0x0056
            boolean r4 = r0.getMin()
            if (r4 != 0) goto L_0x0056
            o.isBlocking r4 = o.processHandshake.setMin
            if (r4 == 0) goto L_0x001f
            long r4 = r4.setMax()
            goto L_0x0023
        L_0x001f:
            long r4 = java.lang.System.nanoTime()
        L_0x0023:
            r6 = r0
            o.getConnection r6 = (o.getConnection) r6
            monitor-enter(r6)
            T[] r7 = r6.length     // Catch:{ all -> 0x0053 }
            r8 = 0
            if (r7 == 0) goto L_0x002f
            r7 = r7[r8]     // Catch:{ all -> 0x0053 }
            goto L_0x0030
        L_0x002f:
            r7 = r3
        L_0x0030:
            if (r7 != 0) goto L_0x0035
            monitor-exit(r6)
            r7 = r3
            goto L_0x004e
        L_0x0035:
            o.ReportResult$getMax r7 = (o.ReportResult.getMax) r7     // Catch:{ all -> 0x0053 }
            boolean r9 = r7.setMin(r4)     // Catch:{ all -> 0x0053 }
            if (r9 == 0) goto L_0x0044
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch:{ all -> 0x0053 }
            boolean r7 = r10.getMax(r7)     // Catch:{ all -> 0x0053 }
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x004c
            o.getPort r7 = r6.length(r8)     // Catch:{ all -> 0x0053 }
            goto L_0x004d
        L_0x004c:
            r7 = r3
        L_0x004d:
            monitor-exit(r6)
        L_0x004e:
            o.ReportResult$getMax r7 = (o.ReportResult.getMax) r7
            if (r7 != 0) goto L_0x0023
            goto L_0x0056
        L_0x0053:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0056:
            java.lang.Object r0 = r10._queue
            if (r0 != 0) goto L_0x005b
            goto L_0x0096
        L_0x005b:
            boolean r4 = r0 instanceof o.afterConnect
            if (r4 == 0) goto L_0x0082
            if (r0 == 0) goto L_0x007a
            r4 = r0
            o.afterConnect r4 = (o.afterConnect) r4
            java.lang.Object r5 = r4.getMin()
            o.closeBlocking r6 = o.afterConnect.setMax
            if (r5 == r6) goto L_0x0070
            r3 = r5
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            goto L_0x0096
        L_0x0070:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = getMin
            o.afterConnect r4 = r4.length()
            r5.compareAndSet(r10, r0, r4)
            goto L_0x0056
        L_0x007a:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */"
            r0.<init>(r1)
            throw r0
        L_0x0082:
            o.closeBlocking r4 = o.TMNTokenClient.AnonymousClass1.setMax
            if (r0 != r4) goto L_0x0089
            goto L_0x0096
        L_0x0089:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = getMin
            boolean r4 = r4.compareAndSet(r10, r0, r3)
            if (r4 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x00a1
            r3 = r0
            java.lang.Runnable r3 = (java.lang.Runnable) r3
        L_0x0096:
            if (r3 == 0) goto L_0x009c
            r3.run()
            return r1
        L_0x009c:
            long r0 = r10.getMin()
            return r0
        L_0x00a1:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */"
            r0.<init>(r1)
            goto L_0x00aa
        L_0x00a9:
            throw r0
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ReportResult.setMin():long");
    }

    public final void setMin(@NotNull Runnable runnable) {
        ReportResult reportResult = this;
        while (!reportResult.getMax(runnable)) {
            reportResult = APSecuritySdk.AnonymousClass1.getMin;
        }
        reportResult.values();
    }

    public final void length(long j, @NotNull getMax getmax) {
        int min = setMin(j, getmax);
        if (min != 0) {
            if (min == 1) {
                getMax(j, getmax);
            } else if (min != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (setMin(getmax)) {
            values();
        }
    }

    private final boolean setMin(getMax getmax) {
        length length2 = (length) this._delayed;
        return (length2 != null ? (getMax) length2.getMax() : null) == getmax;
    }

    private final int setMin(long j, getMax getmax) {
        if (toDoubleRange()) {
            return 1;
        }
        length length2 = (length) this._delayed;
        if (length2 == null) {
            ReportResult reportResult = this;
            toIntRange.compareAndSet(reportResult, (Object) null, new length(j));
            Object obj = reportResult._delayed;
            Intrinsics.checkNotNull(obj);
            length2 = (length) obj;
        }
        return getmax.length(j, length2, this);
    }

    /* access modifiers changed from: protected */
    public final void FastBitmap$CoordinateSystem() {
        this._queue = null;
        this._delayed = null;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010$\u001a\u00020%H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "nanoTime", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static abstract class getMax implements Runnable, Comparable<getMax>, DeviceTokenClient.AnonymousClass1, getPort {
        private Object getMax;
        @JvmField
        public long getMin;
        private int setMax = -1;

        public getMax(long j) {
            this.getMin = j;
        }

        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            long j = this.getMin - ((getMax) obj).getMin;
            if (j > 0) {
                return 1;
            }
            return j < 0 ? -1 : 0;
        }

        @Nullable
        public final getConnection<?> length() {
            Object obj = this.getMax;
            if (!(obj instanceof getConnection)) {
                obj = null;
            }
            return (getConnection) obj;
        }

        public final void length(@Nullable getConnection<?> getconnection) {
            if (this.getMax != TMNTokenClient.AnonymousClass1.length) {
                this.getMax = getconnection;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        public final void getMin(int i) {
            this.setMax = i;
        }

        public final int setMin() {
            return this.setMax;
        }

        public final boolean setMin(long j) {
            return j - this.getMin >= 0;
        }

        public final synchronized int length(long j, @NotNull length length, @NotNull ReportResult reportResult) {
            long j2 = j;
            length length2 = length;
            synchronized (this) {
                if (this.getMax == TMNTokenClient.AnonymousClass1.length) {
                    return 2;
                }
                getConnection getconnection = length2;
                T t = this;
                synchronized (getconnection) {
                    T[] tArr = getconnection.length;
                    getMax getmax = (getMax) (tArr != null ? tArr[0] : null);
                    boolean z = true;
                    if (reportResult.toDoubleRange()) {
                        return 1;
                    }
                    if (getmax == null) {
                        length2.getMax = j2;
                    } else {
                        long j3 = getmax.getMin;
                        if (j3 - j2 >= 0) {
                            j3 = j2;
                        }
                        if (j3 - length2.getMax > 0) {
                            length2.getMax = j3;
                        }
                    }
                    if (this.getMin - length2.getMax < 0) {
                        this.getMin = length2.getMax;
                    }
                    if (getApdidToken.setMax()) {
                        if (t.length() != null) {
                            z = false;
                        }
                        if (!z) {
                            throw new AssertionError();
                        }
                    }
                    t.length(getconnection);
                    T[] tArr2 = getconnection.length;
                    if (tArr2 == null) {
                        tArr2 = new getPort[4];
                        getconnection.length = tArr2;
                    } else if (getconnection._size >= tArr2.length) {
                        T[] copyOf = Arrays.copyOf(tArr2, getconnection._size * 2);
                        Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                        getconnection.length = (getPort[]) copyOf;
                        tArr2 = (getPort[]) copyOf;
                    }
                    int i = getconnection._size;
                    getconnection._size = i + 1;
                    tArr2[i] = t;
                    t.getMin(i);
                    getconnection.setMax(i);
                    return 0;
                }
            }
        }

        public final synchronized void y_() {
            Object obj = this.getMax;
            if (obj != TMNTokenClient.AnonymousClass1.length) {
                if (!(obj instanceof length)) {
                    obj = null;
                }
                length length = (length) obj;
                if (length != null) {
                    length.getMin(this);
                }
                this.getMax = TMNTokenClient.AnonymousClass1.length;
            }
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Delayed[nanos=");
            sb.append(this.getMin);
            sb.append(']');
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    final class setMax extends getMax {
        private final cy1<Unit> getMax;

        public setMax(long j, @NotNull cy1<? super Unit> cy1) {
            super(j);
            this.getMax = cy1;
        }

        public final void run() {
            this.getMax.setMax((APExpansion.AnonymousClass1) ReportResult.this, Unit.INSTANCE);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(this.getMax.toString());
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class length extends getConnection<getMax> {
        @JvmField
        public long getMax;

        public length(long j) {
            this.getMax = j;
        }
    }

    private final boolean getMax(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (toDoubleRange()) {
                return false;
            }
            if (obj == null) {
                if (getMin.compareAndSet(this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof afterConnect) {
                if (obj != null) {
                    afterConnect afterconnect = (afterConnect) obj;
                    int min = afterconnect.setMin(runnable);
                    if (min == 0) {
                        return true;
                    }
                    if (min == 1) {
                        getMin.compareAndSet(this, obj, afterconnect.length());
                    } else if (min == 2) {
                        return false;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.Queue<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> /* = kotlinx.coroutines.internal.LockFreeTaskQueueCore<kotlinx.coroutines.Runnable /* = java.lang.Runnable */> */");
                }
            } else if (obj == TMNTokenClient.AnonymousClass1.setMax) {
                return false;
            } else {
                afterConnect afterconnect2 = new afterConnect(8, true);
                if (obj != null) {
                    afterconnect2.setMin((Runnable) obj);
                    afterconnect2.setMin(runnable);
                    if (getMin.compareAndSet(this, obj, afterconnect2)) {
                        return true;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.Runnable /* = java.lang.Runnable */");
                }
            }
        }
    }

    public final void getMin(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        if (getMax(runnable)) {
            values();
            return;
        }
        APSecuritySdk.AnonymousClass1 r2 = APSecuritySdk.AnonymousClass1.getMin;
        while (!r2.getMax(runnable)) {
            r2 = APSecuritySdk.AnonymousClass1.getMin;
        }
        r2.values();
    }

    private final void valueOf() {
        getMax getmax;
        isBlocking isblocking = processHandshake.setMin;
        long max = isblocking != null ? isblocking.setMax() : System.nanoTime();
        while (true) {
            length length2 = (length) this._delayed;
            if (length2 != null && (getmax = (getMax) length2.length()) != null) {
                getMax(max, getmax);
            } else {
                return;
            }
        }
    }
}
