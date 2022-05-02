package o;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import o.APSecuritySdk;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020+2\u00020,2\u00020\u001fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ#\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0013\u001a\u00020\n2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0013\u0010\u0017J#\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u001b\u0010\u001a\u001a\u00020\n2\n\u0010\u0019\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010#R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R \u0010&\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\u0007\u001a\u00020\u00038\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lkotlinx/coroutines/scheduling/LimitingDispatcher;", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "dispatcher", "", "parallelism", "", "name", "taskMode", "<init>", "(Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;ILjava/lang/String;I)V", "", "afterTask", "()V", "close", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "tailDispatch", "(Ljava/lang/Runnable;Z)V", "dispatchYield", "command", "execute", "(Ljava/lang/Runnable;)V", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/scheduling/ExperimentalCoroutineDispatcher;", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "executor", "Ljava/lang/String;", "I", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "queue", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "getTaskMode", "()I", "kotlinx-coroutines-core", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lkotlinx/coroutines/scheduling/TaskContext;"}, k = 1, mv = {1, 4, 2})
final class setSocket extends ReportRequest implements translateHandshakeHttp, Executor {
    private static final /* synthetic */ AtomicIntegerFieldUpdater getMax = AtomicIntegerFieldUpdater.newUpdater(setSocket.class, "inFlightTasks");
    private final int IsOverlapping = 1;
    private final String equals;
    private volatile /* synthetic */ int inFlightTasks = 0;
    private final ConcurrentLinkedQueue<Runnable> length = new ConcurrentLinkedQueue<>();
    private final setSslSocketFactory setMin;
    private final int toIntRange;

    public final int getMax() {
        return this.IsOverlapping;
    }

    public setSocket(@NotNull setSslSocketFactory setsslsocketfactory, int i, @Nullable String str) {
        this.setMin = setsslsocketfactory;
        this.toIntRange = i;
        this.equals = str;
    }

    public final void execute(@NotNull Runnable runnable) {
        length(runnable, false);
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public final void getMin(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        length(runnable, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void length(java.lang.Runnable r3, boolean r4) {
        /*
            r2 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = getMax
            int r0 = r0.incrementAndGet(r2)
            int r1 = r2.toIntRange
            if (r0 > r1) goto L_0x0021
            o.setSslSocketFactory r0 = r2.setMin
            r1 = r2
            o.translateHandshakeHttp r1 = (o.translateHandshakeHttp) r1
            kotlinx.coroutines.scheduling.CoroutineScheduler r0 = r0.getMax     // Catch:{ RejectedExecutionException -> 0x0015 }
            r0.getMax(r3, r1, r4)     // Catch:{ RejectedExecutionException -> 0x0015 }
            return
        L_0x0015:
            o.APSecuritySdk$1 r4 = o.APSecuritySdk.AnonymousClass1.getMin
            o.readStringLine r3 = kotlinx.coroutines.scheduling.CoroutineScheduler.length(r3, r1)
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r4.setMin((java.lang.Runnable) r3)
            return
        L_0x0021:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r0 = r2.length
            r0.add(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = getMax
            int r3 = r3.decrementAndGet(r2)
            int r0 = r2.toIntRange
            if (r3 < r0) goto L_0x0031
            return
        L_0x0031:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.Runnable> r3 = r2.length
            java.lang.Object r3 = r3.poll()
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            if (r3 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSocket.length(java.lang.Runnable, boolean):void");
    }

    public final void getMax(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        length(runnable, true);
    }

    @NotNull
    public final String toString() {
        String str = this.equals;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[dispatcher = ");
        sb.append(this.setMin);
        sb.append(']');
        return sb.toString();
    }

    public final void getMin() {
        Runnable poll = this.length.poll();
        if (poll != null) {
            translateHandshakeHttp translatehandshakehttp = this;
            try {
                this.setMin.getMax.getMax(poll, translatehandshakehttp, true);
            } catch (RejectedExecutionException unused) {
                APSecuritySdk.AnonymousClass1.getMin.setMin((Runnable) CoroutineScheduler.length(poll, translatehandshakehttp));
            }
        } else {
            getMax.decrementAndGet(this);
            Runnable poll2 = this.length.poll();
            if (poll2 != null) {
                length(poll2, true);
            }
        }
    }
}
