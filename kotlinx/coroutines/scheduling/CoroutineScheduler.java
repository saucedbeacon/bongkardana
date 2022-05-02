package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import o.Draft;
import o.WebSocketClient;
import o.basicAccept;
import o.closeBlocking;
import o.createFrames;
import o.createHandshake;
import o.getApdidToken;
import o.readLine;
import o.readStringLine;
import o.translateHandshakeHttp;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 X2\u00020\\2\u00020]:\u0003XYZB+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\b¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u00020\n2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\b¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010!\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013H\b¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\u0001H\b¢\u0006\u0004\b$\u0010\u0017J-\u0010&\u001a\u00020\u00132\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u00132\n\u0010(\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004H\b¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0001H\b¢\u0006\u0004\b-\u0010\u0017J\u001b\u0010/\u001a\u00020\u00012\n\u0010.\u001a\u00060 R\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b1\u0010\"J\u0019\u00102\u001a\u00020\f2\n\u0010.\u001a\u00060 R\u00020\u0000¢\u0006\u0004\b2\u00103J)\u00106\u001a\u00020\u00132\n\u0010.\u001a\u00060 R\u00020\u00002\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004H\b¢\u0006\u0004\b8\u0010,J\u0015\u00109\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0013¢\u0006\u0004\bA\u0010\u0015J\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\fH\b¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010EJ+\u0010I\u001a\u0004\u0018\u00010\n*\b\u0018\u00010 R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\bI\u0010JR\u0017\u0010\u0010\u001a\u00020\u00018Â\u0002@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010LR\u0017\u0010\u001f\u001a\u00020\u00018Â\u0002@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0016\u0010O\u001a\u00020N8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020N8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0013\u0010S\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0016\u0010\u0003\u001a\u00020\u00018\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR\"\u0010V\u001a\u000e\u0012\n\u0012\b\u0018\u00010 R\u00020\u00000U8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "addToGlobalQueue", "(Lkotlinx/coroutines/scheduling/Task;)Z", "state", "availableCpuPermits", "(J)I", "blockingTasks", "", "close", "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "createTask", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingTasks", "decrementCreatedWorkers", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingTasks", "()J", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "releaseCpuPermit", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "skipUnpark", "signalBlockingWork", "(Z)V", "signalCpuWork", "toString", "()Ljava/lang/String;", "tryAcquireCpuPermit", "()Z", "tryCreateWorker", "(J)Z", "tryUnpark", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "getAvailableCpuPermits", "I", "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "J", "isTerminated", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "workers", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, k = 1, mv = {1, 4, 2})
public final class CoroutineScheduler implements Executor, Closeable {
    @NotNull
    @JvmField
    public static final closeBlocking equals = new closeBlocking("NOT_IN_STACK");
    static final /* synthetic */ AtomicLongFieldUpdater setMax;
    private static final /* synthetic */ AtomicLongFieldUpdater toDoubleRange;
    @NotNull
    public static final getMax toFloatRange = new getMax((byte) 0);
    private static final /* synthetic */ AtomicIntegerFieldUpdater toString;
    @JvmField
    public final int IsOverlapping;
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;
    @NotNull
    @JvmField
    public final AtomicReferenceArray<setMin> getMax;
    @NotNull
    @JvmField
    public final WebSocketClient.WebsocketWriteThread getMin;
    @JvmField
    public final long isInside;
    @NotNull
    @JvmField
    public final WebSocketClient.WebsocketWriteThread length;
    private volatile /* synthetic */ long parkedWorkersStack;
    @JvmField
    public final int setMin;
    @NotNull
    @JvmField
    public final String toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public CoroutineScheduler(int i, int i2, long j, @NotNull String str) {
        this.setMin = i;
        this.IsOverlapping = i2;
        this.isInside = j;
        this.toIntRange = str;
        if (i > 0) {
            if (this.IsOverlapping >= this.setMin) {
                if (this.IsOverlapping <= 2097150) {
                    if (this.isInside > 0) {
                        this.length = new WebSocketClient.WebsocketWriteThread();
                        this.getMin = new WebSocketClient.WebsocketWriteThread();
                        this.parkedWorkersStack = 0;
                        this.getMax = new AtomicReferenceArray<>(this.IsOverlapping + 1);
                        this.controlState = ((long) this.setMin) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Idle worker keep alive time ");
                    sb.append(this.isInside);
                    sb.append(" must be positive");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder("Max pool size ");
                sb2.append(this.IsOverlapping);
                sb2.append(" should not exceed maximal supported number of threads 2097150");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            StringBuilder sb3 = new StringBuilder("Max pool size ");
            sb3.append(this.IsOverlapping);
            sb3.append(" should be greater than or equals to core pool size ");
            sb3.append(this.setMin);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        StringBuilder sb4 = new StringBuilder("Core pool size ");
        sb4.append(this.setMin);
        sb4.append(" should be at least 1");
        throw new IllegalArgumentException(sb4.toString().toString());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean setMin() {
        return this._isTerminated;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    static {
        Class<CoroutineScheduler> cls = CoroutineScheduler.class;
        toDoubleRange = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        setMax = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        toString = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public static /* synthetic */ void setMax(CoroutineScheduler coroutineScheduler, Runnable runnable, translateHandshakeHttp translatehandshakehttp, boolean z, int i) {
        if ((i & 2) != 0) {
            translatehandshakehttp = readLine.setMin;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.getMax(runnable, translatehandshakehttp, z);
    }

    public final void getMax(@NotNull Runnable runnable, @NotNull translateHandshakeHttp translatehandshakehttp, boolean z) {
        readStringLine readstringline;
        readStringLine length2 = length(runnable, translatehandshakehttp);
        setMin max = setMax();
        boolean z2 = true;
        if (max == null || max.setMin == WorkerState.TERMINATED || (length2.toIntRange.getMax() == 0 && max.setMin == WorkerState.BLOCKING)) {
            readstringline = length2;
        } else {
            max.getMin = true;
            readstringline = max.setMax.getMin(length2, z);
        }
        if (readstringline == null || setMax(readstringline)) {
            if (!z || max == null) {
                z2 = false;
            }
            if (length2.toIntRange.getMax() != 0) {
                long addAndGet = setMax.addAndGet(this, 2097152);
                if (!z2 && !length() && !setMax(addAndGet)) {
                    length();
                }
            } else if (!z2 && !length() && !setMax(this.controlState)) {
                length();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.toIntRange);
            sb.append(" was terminated");
            throw new RejectedExecutionException(sb.toString());
        }
    }

    @NotNull
    public static readStringLine length(@NotNull Runnable runnable, @NotNull translateHandshakeHttp translatehandshakehttp) {
        long max = createHandshake.equals.getMax();
        if (!(runnable instanceof readStringLine)) {
            return new basicAccept(runnable, max, translatehandshakehttp);
        }
        readStringLine readstringline = (readStringLine) runnable;
        readstringline.equals = max;
        readstringline.toIntRange = translatehandshakehttp;
        return readstringline;
    }

    /* access modifiers changed from: private */
    public final boolean setMax(long j) {
        if (RangesKt.coerceAtLeast(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.setMin) {
            int min = getMin();
            if (min == 1 && this.setMin > 1) {
                getMin();
            }
            if (min > 0) {
                return true;
            }
        }
        return false;
    }

    private final int getMin() {
        synchronized (this.getMax) {
            if (setMin()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z = false;
            int coerceAtLeast = RangesKt.coerceAtLeast(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (coerceAtLeast >= this.setMin) {
                return 0;
            }
            if (i >= this.IsOverlapping) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.getMax.get(i2) == null) {
                setMin setmin = new setMin(this, i2);
                this.getMax.set(i2, setmin);
                if (i2 == ((int) (2097151 & setMax.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    setmin.start();
                    int i3 = coerceAtLeast + 1;
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private final setMin setMax() {
        Thread currentThread = Thread.currentThread();
        if (!(currentThread instanceof setMin)) {
            currentThread = null;
        }
        setMin setmin = (setMin) currentThread;
        if (setmin == null || !Intrinsics.areEqual((Object) CoroutineScheduler.this, (Object) this)) {
            return null;
        }
        return setmin;
    }

    @NotNull
    public final String toString() {
        int i;
        ArrayList arrayList = new ArrayList();
        int length2 = this.getMax.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < length2; i7++) {
            setMin setmin = this.getMax.get(i7);
            if (setmin != null) {
                createFrames createframes = setmin.setMax;
                if (createframes.lastScheduledTask != null) {
                    i = (createframes.producerIndex - createframes.consumerIndex) + 1;
                } else {
                    i = createframes.producerIndex - createframes.consumerIndex;
                }
                int i8 = Draft.length[setmin.setMin.ordinal()];
                if (i8 == 1) {
                    i4++;
                } else if (i8 == 2) {
                    i3++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(i));
                    sb.append("b");
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(String.valueOf(i));
                    sb2.append("c");
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i5++;
                    if (i > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(String.valueOf(i));
                        sb3.append("d");
                        arrayList.add(sb3.toString());
                    }
                } else if (i8 == 5) {
                    i6++;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.toIntRange);
        sb4.append('@');
        sb4.append(Integer.toHexString(System.identityHashCode(this)));
        sb4.append('[');
        sb4.append("Pool Size {core = ");
        sb4.append(this.setMin);
        sb4.append(", max = ");
        sb4.append(this.IsOverlapping);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.length.setMax());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.getMin.setMax());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.setMin - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public static void getMin(@NotNull readStringLine readstringline) {
        try {
            readstringline.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0004\u0018\u00002\u00020GB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u001cR*\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018\u0006@FX\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\tR\u0016\u00100\u001a\u00020/8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010+R\u0014\u0010B\u001a\u00020?8Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020#8\u0006@\u0006X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0002048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u00106¨\u0006F"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "", "index", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "taskMode", "", "afterTask", "(I)V", "beforeTask", "Lkotlinx/coroutines/scheduling/Task;", "task", "executeTask", "(Lkotlinx/coroutines/scheduling/Task;)V", "", "scanLocalQueue", "findAnyTask", "(Z)Lkotlinx/coroutines/scheduling/Task;", "findTask", "mode", "idleReset", "inStack", "()Z", "upperBound", "nextInt", "(I)I", "park", "()V", "pollGlobalQueues", "()Lkotlinx/coroutines/scheduling/Task;", "run", "runWorker", "tryAcquireCpuPermit", "tryPark", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "tryReleaseCpu", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "blockingOnly", "trySteal", "tryTerminateWorker", "indexInArray", "I", "getIndexInArray", "()I", "setIndexInArray", "Lkotlinx/coroutines/scheduling/WorkQueue;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "Z", "", "minDelayUntilStealableTaskNs", "J", "", "nextParkedWorker", "Ljava/lang/Object;", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "terminationDeadline", "kotlinx-coroutines-core", "Ljava/lang/Thread;"}, k = 1, mv = {1, 4, 2})
    public final class setMin extends Thread {
        static final /* synthetic */ AtomicIntegerFieldUpdater getMax = AtomicIntegerFieldUpdater.newUpdater(setMin.class, "workerCtl");
        private int IsOverlapping;
        @JvmField
        public boolean getMin;
        volatile int indexInArray;
        private long isInside;
        @Nullable
        volatile Object nextParkedWorker;
        @NotNull
        @JvmField
        public final createFrames setMax;
        @NotNull
        @JvmField
        public WorkerState setMin;
        private long toIntRange;
        @NotNull
        volatile /* synthetic */ int workerCtl;

        private setMin() {
            setDaemon(true);
            this.setMax = new createFrames();
            this.setMin = WorkerState.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.equals;
            this.IsOverlapping = Random.Default.nextInt();
        }

        private void length(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.toIntRange);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public setMin(CoroutineScheduler coroutineScheduler, int i) {
            this();
            length(i);
        }

        private final boolean setMin() {
            boolean z;
            if (this.setMin == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            while (true) {
                long j = coroutineScheduler.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                    if (CoroutineScheduler.setMax.compareAndSet(coroutineScheduler, j, j - 4398046511104L)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.setMin = WorkerState.CPU_ACQUIRED;
            return true;
        }

        public final boolean length(@NotNull WorkerState workerState) {
            WorkerState workerState2 = this.setMin;
            boolean z = workerState2 == WorkerState.CPU_ACQUIRED;
            if (z) {
                CoroutineScheduler.setMax.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.setMin = workerState;
            }
            return z;
        }

        private final void length() {
            int i;
            if (!getMin()) {
                CoroutineScheduler.this.setMax(this);
                return;
            }
            if (getApdidToken.setMax()) {
                createFrames createframes = this.setMax;
                if (createframes.lastScheduledTask != null) {
                    i = (createframes.producerIndex - createframes.consumerIndex) + 1;
                } else {
                    i = createframes.producerIndex - createframes.consumerIndex;
                }
                if (!(i == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (getMin() && this.workerCtl == -1 && !CoroutineScheduler.this.setMin() && this.setMin != WorkerState.TERMINATED) {
                length(WorkerState.PARKING);
                Thread.interrupted();
                if (this.toIntRange == 0) {
                    this.toIntRange = System.nanoTime() + CoroutineScheduler.this.isInside;
                }
                LockSupport.parkNanos(CoroutineScheduler.this.isInside);
                if (System.nanoTime() - this.toIntRange >= 0) {
                    this.toIntRange = 0;
                    synchronized (CoroutineScheduler.this.getMax) {
                        if (!CoroutineScheduler.this.setMin()) {
                            if (CoroutineScheduler.length(CoroutineScheduler.this) > CoroutineScheduler.this.setMin) {
                                if (getMax.compareAndSet(this, -1, 1)) {
                                    int i2 = this.indexInArray;
                                    length(0);
                                    CoroutineScheduler.this.length(this, i2, 0);
                                    int andDecrement = (int) (CoroutineScheduler.setMax.getAndDecrement(CoroutineScheduler.this) & 2097151);
                                    if (andDecrement != i2) {
                                        setMin setmin = CoroutineScheduler.this.getMax.get(andDecrement);
                                        Intrinsics.checkNotNull(setmin);
                                        setMin setmin2 = setmin;
                                        CoroutineScheduler.this.getMax.set(i2, setmin2);
                                        setmin2.length(i2);
                                        CoroutineScheduler.this.length(setmin2, andDecrement, i2);
                                    }
                                    CoroutineScheduler.this.getMax.set(andDecrement, (Object) null);
                                    Unit unit = Unit.INSTANCE;
                                    this.setMin = WorkerState.TERMINATED;
                                }
                            }
                        }
                    }
                }
            }
        }

        private final boolean getMin() {
            return this.nextParkedWorker != CoroutineScheduler.equals;
        }

        private int getMax(int i) {
            int i2 = this.IsOverlapping;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.IsOverlapping = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: o.readStringLine} */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
            if (r0 == null) goto L_0x0020;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final o.readStringLine getMin(boolean r3) {
            /*
                r2 = this;
                boolean r0 = r2.setMin()
                if (r0 == 0) goto L_0x000b
                o.readStringLine r3 = r2.length((boolean) r3)
                return r3
            L_0x000b:
                if (r3 == 0) goto L_0x0020
                o.createFrames r3 = r2.setMax
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = o.createFrames.setMin
                r1 = 0
                java.lang.Object r0 = r0.getAndSet(r3, r1)
                o.readStringLine r0 = (o.readStringLine) r0
                if (r0 != 0) goto L_0x001e
                o.readStringLine r0 = r3.getMin()
            L_0x001e:
                if (r0 != 0) goto L_0x002b
            L_0x0020:
                kotlinx.coroutines.scheduling.CoroutineScheduler r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.this
                o.WebSocketClient$WebsocketWriteThread r3 = r3.getMin
                java.lang.Object r3 = r3.setMin()
                r0 = r3
                o.readStringLine r0 = (o.readStringLine) r0
            L_0x002b:
                if (r0 != 0) goto L_0x0032
                r3 = 1
                o.readStringLine r0 = r2.setMax(r3)
            L_0x0032:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.setMin.getMin(boolean):o.readStringLine");
        }

        private final readStringLine length(boolean z) {
            readStringLine max;
            readStringLine max2;
            if (z) {
                boolean z2 = getMax(CoroutineScheduler.this.setMin * 2) == 0;
                if (z2 && (max2 = getMax()) != null) {
                    return max2;
                }
                createFrames createframes = this.setMax;
                readStringLine readstringline = (readStringLine) createFrames.setMin.getAndSet(createframes, (Object) null);
                if (readstringline == null) {
                    readstringline = createframes.getMin();
                }
                if (readstringline != null) {
                    return readstringline;
                }
                if (!z2 && (max = getMax()) != null) {
                    return max;
                }
            } else {
                readStringLine max3 = getMax();
                if (max3 != null) {
                    return max3;
                }
            }
            return setMax(false);
        }

        private final readStringLine getMax() {
            if (getMax(2) == 0) {
                readStringLine readstringline = (readStringLine) CoroutineScheduler.this.length.setMin();
                if (readstringline != null) {
                    return readstringline;
                }
                return (readStringLine) CoroutineScheduler.this.getMin.setMin();
            }
            readStringLine readstringline2 = (readStringLine) CoroutineScheduler.this.getMin.setMin();
            if (readstringline2 != null) {
                return readstringline2;
            }
            return (readStringLine) CoroutineScheduler.this.length.setMin();
        }

        private final readStringLine setMax(boolean z) {
            long j;
            int i;
            int i2;
            if (getApdidToken.setMax()) {
                createFrames createframes = this.setMax;
                if (createframes.lastScheduledTask != null) {
                    i2 = (createframes.producerIndex - createframes.consumerIndex) + 1;
                } else {
                    i2 = createframes.producerIndex - createframes.consumerIndex;
                }
                if (!(i2 == 0)) {
                    throw new AssertionError();
                }
            }
            int length2 = CoroutineScheduler.length(CoroutineScheduler.this);
            if (length2 < 2) {
                return null;
            }
            int max = getMax(length2);
            long j2 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < length2; i3++) {
                max++;
                if (max > length2) {
                    max = 1;
                }
                setMin setmin = CoroutineScheduler.this.getMax.get(max);
                if (!(setmin == null || setmin == this)) {
                    if (getApdidToken.setMax()) {
                        createFrames createframes2 = this.setMax;
                        if (createframes2.lastScheduledTask != null) {
                            i = (createframes2.producerIndex - createframes2.consumerIndex) + 1;
                        } else {
                            i = createframes2.producerIndex - createframes2.consumerIndex;
                        }
                        if (!(i == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        j = this.setMax.getMin(setmin.setMax);
                    } else {
                        j = this.setMax.setMax(setmin.setMax);
                    }
                    if (j == -1) {
                        return this.setMax.setMin();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.isInside = j2;
            return null;
        }

        public final void run() {
            loop0:
            while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.setMin() && this.setMin != WorkerState.TERMINATED) {
                    readStringLine min = getMin(this.getMin);
                    if (min != null) {
                        this.isInside = 0;
                        int max = min.toIntRange.getMax();
                        this.toIntRange = 0;
                        if (this.setMin == WorkerState.PARKING) {
                            if (getApdidToken.setMax()) {
                                if (!(max == 1)) {
                                    throw new AssertionError();
                                }
                            }
                            this.setMin = WorkerState.BLOCKING;
                        }
                        if (max != 0 && length(WorkerState.BLOCKING)) {
                            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                            if (!coroutineScheduler.length() && !coroutineScheduler.setMax(coroutineScheduler.controlState)) {
                                coroutineScheduler.length();
                            }
                        }
                        CoroutineScheduler.getMin(min);
                        if (max != 0) {
                            CoroutineScheduler.setMax.addAndGet(CoroutineScheduler.this, -2097152);
                            WorkerState workerState = this.setMin;
                            if (workerState == WorkerState.TERMINATED) {
                                continue;
                            } else {
                                if (getApdidToken.setMax()) {
                                    if (!(workerState == WorkerState.BLOCKING)) {
                                        throw new AssertionError();
                                    }
                                }
                                this.setMin = WorkerState.DORMANT;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        this.getMin = false;
                        if (this.isInside == 0) {
                            length();
                        } else if (!z) {
                            z = true;
                        } else {
                            length(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.isInside);
                            this.isInside = 0;
                        }
                    }
                }
            }
            length(WorkerState.TERMINATED);
        }
    }

    private final boolean setMax(readStringLine readstringline) {
        boolean z = true;
        if (readstringline.toIntRange.getMax() != 1) {
            z = false;
        }
        if (z) {
            return this.getMin.length(readstringline);
        }
        return this.length.length(readstringline);
    }

    public final void length(@NotNull setMin setmin, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? setMin(setmin) : i2;
            }
            if (i3 >= 0) {
                if (toDoubleRange.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    public final boolean setMax(@NotNull setMin setmin) {
        long j;
        long j2;
        int i;
        if (setmin.nextParkedWorker != equals) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i2 = (int) (2097151 & j);
            j2 = (2097152 + j) & -2097152;
            i = setmin.indexInArray;
            if (getApdidToken.setMax()) {
                if (!(i != 0)) {
                    throw new AssertionError();
                }
            }
            setmin.nextParkedWorker = this.getMax.get(i2);
        } while (!toDoubleRange.compareAndSet(this, j, ((long) i) | j2));
        return true;
    }

    private static int setMin(setMin setmin) {
        Object obj = setmin.nextParkedWorker;
        while (obj != equals) {
            if (obj == null) {
                return 0;
            }
            setMin setmin2 = (setMin) obj;
            int i = setmin2.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = setmin2.nextParkedWorker;
        }
        return -1;
    }

    public final void execute(@NotNull Runnable runnable) {
        getMax(runnable, readLine.setMin, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (r3 == null) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = toString
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 == 0) goto L_0x00cd
            kotlinx.coroutines.scheduling.CoroutineScheduler$setMin r0 = r8.setMax()
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.CoroutineScheduler$setMin> r3 = r8.getMax
            monitor-enter(r3)
            long r4 = r8.controlState     // Catch:{ all -> 0x00ca }
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r3)
            if (r5 <= 0) goto L_0x0061
            r3 = 1
        L_0x001c:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.CoroutineScheduler$setMin> r4 = r8.getMax
            java.lang.Object r4 = r4.get(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            kotlinx.coroutines.scheduling.CoroutineScheduler$setMin r4 = (kotlinx.coroutines.scheduling.CoroutineScheduler.setMin) r4
            if (r4 == r0) goto L_0x005c
        L_0x0029:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L_0x003b
            r6 = r4
            java.lang.Thread r6 = (java.lang.Thread) r6
            java.util.concurrent.locks.LockSupport.unpark(r6)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L_0x0029
        L_0x003b:
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r6 = r4.setMin
            boolean r7 = o.getApdidToken.setMax()
            if (r7 == 0) goto L_0x0055
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r7 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            if (r6 != r7) goto L_0x0049
            r6 = 1
            goto L_0x004a
        L_0x0049:
            r6 = 0
        L_0x004a:
            if (r6 == 0) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0055:
            o.createFrames r4 = r4.setMax
            o.WebSocketClient$WebsocketWriteThread r6 = r8.getMin
            r4.getMax((o.WebSocketClient.WebsocketWriteThread) r6)
        L_0x005c:
            if (r3 == r5) goto L_0x0061
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0061:
            o.WebSocketClient$WebsocketWriteThread r3 = r8.getMin
            r3.length()
            o.WebSocketClient$WebsocketWriteThread r3 = r8.length
            r3.length()
        L_0x006b:
            if (r0 == 0) goto L_0x0073
            o.readStringLine r3 = r0.getMin(r2)
            if (r3 != 0) goto L_0x007b
        L_0x0073:
            o.WebSocketClient$WebsocketWriteThread r3 = r8.length
            java.lang.Object r3 = r3.setMin()
            o.readStringLine r3 = (o.readStringLine) r3
        L_0x007b:
            if (r3 != 0) goto L_0x0085
            o.WebSocketClient$WebsocketWriteThread r3 = r8.getMin
            java.lang.Object r3 = r3.setMin()
            o.readStringLine r3 = (o.readStringLine) r3
        L_0x0085:
            if (r3 != 0) goto L_0x00b7
            if (r0 == 0) goto L_0x008e
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED
            r0.length((kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState) r3)
        L_0x008e:
            boolean r0 = o.getApdidToken.setMax()
            if (r0 == 0) goto L_0x00b0
            long r3 = r8.controlState
            r5 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r3 = r3 & r5
            r0 = 42
            long r3 = r3 >> r0
            int r0 = (int) r3
            int r3 = r8.setMin
            if (r0 != r3) goto L_0x00a5
            r1 = 1
        L_0x00a5:
            if (r1 == 0) goto L_0x00a8
            goto L_0x00b0
        L_0x00a8:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x00b0:
            r0 = 0
            r8.parkedWorkersStack = r0
            r8.controlState = r0
            goto L_0x00cd
        L_0x00b7:
            r3.run()     // Catch:{ all -> 0x00bb }
            goto L_0x006b
        L_0x00bb:
            r3 = move-exception
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00c8 }
            java.lang.Thread$UncaughtExceptionHandler r5 = r4.getUncaughtExceptionHandler()     // Catch:{ all -> 0x00c8 }
            r5.uncaughtException(r4, r3)     // Catch:{ all -> 0x00c8 }
            goto L_0x006b
        L_0x00c8:
            r0 = move-exception
            throw r0
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.close():void");
    }

    /* access modifiers changed from: package-private */
    public final boolean length() {
        while (true) {
            long j = this.parkedWorkersStack;
            setMin setmin = this.getMax.get((int) (2097151 & j));
            if (setmin == null) {
                setmin = null;
            } else {
                long j2 = (2097152 + j) & -2097152;
                int min = setMin(setmin);
                if (min >= 0) {
                    if (toDoubleRange.compareAndSet(this, j, ((long) min) | j2)) {
                        setmin.nextParkedWorker = equals;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (setmin == null) {
                return false;
            }
            if (setMin.getMax.compareAndSet(setmin, -1, 0)) {
                LockSupport.unpark(setmin);
                return true;
            }
        }
    }

    public static final /* synthetic */ int length(CoroutineScheduler coroutineScheduler) {
        return (int) (coroutineScheduler.controlState & 2097151);
    }
}
