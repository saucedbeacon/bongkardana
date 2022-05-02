package o;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import o.DeviceTokenClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", "", "()Z", "afterCompletion", "", "state", "", "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
final class methodToNative<T> extends retryRequest<T> {
    private final DeviceTokenClient.InitResultListener length;
    private final Thread setMax;

    /* access modifiers changed from: protected */
    public final boolean equals() {
        return true;
    }

    public methodToNative(@NotNull CoroutineContext coroutineContext, @NotNull Thread thread, @Nullable DeviceTokenClient.InitResultListener initResultListener) {
        super(coroutineContext, true);
        this.setMax = thread;
        this.length = initResultListener;
    }

    /* access modifiers changed from: protected */
    public final void setMax(@Nullable Object obj) {
        if (!Intrinsics.areEqual((Object) Thread.currentThread(), (Object) this.setMax)) {
            Thread thread = this.setMax;
            if (processHandshake.setMin == null) {
                LockSupport.unpark(thread);
            }
        }
    }

    public final T toFloatRange() {
        DeviceTokenClient.InitResultListener initResultListener = this.length;
        if (initResultListener != null) {
            DeviceTokenClient.InitResultListener.getMin(initResultListener);
        }
        while (!Thread.interrupted()) {
            try {
                DeviceTokenClient.InitResultListener initResultListener2 = this.length;
                long min = initResultListener2 != null ? initResultListener2.setMin() : Long.MAX_VALUE;
                if (invokeSuspend()) {
                    T min2 = onPage.getMin(valueOf());
                    APExpansion aPExpansion = (APExpansion) (!(min2 instanceof APExpansion) ? null : min2);
                    if (aPExpansion == null) {
                        return min2;
                    }
                    throw aPExpansion.setMax;
                } else if (processHandshake.setMin == null) {
                    LockSupport.parkNanos(this, min);
                }
            } finally {
                DeviceTokenClient.InitResultListener initResultListener3 = this.length;
                if (initResultListener3 != null) {
                    initResultListener3.setMax(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        getMin((Throwable) interruptedException);
        throw interruptedException;
    }
}
