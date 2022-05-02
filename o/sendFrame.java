package o;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.UndeliveredElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0014J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\rH\u0014J\n\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014J\u0016\u0010%\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\b\u001a\u00020\t8TX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8DX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isEmpty", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "value", "", "enqueueReceiveInternal", "receive", "Lkotlinx/coroutines/channels/Receive;", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotent", "wasClosed", "pollInternal", "pollSelectInternal", "updateValueLocked", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class sendFrame<E> extends configureBlocking<E> {
    private final ReentrantLock length = new ReentrantLock();
    private Object setMin = isInboundDone.getMax;

    /* access modifiers changed from: protected */
    public final boolean setMin() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean toFloatRange() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean toIntRange() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean getMax() {
        return this.setMin == isInboundDone.getMax;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final Object setMax(E e) {
        isClosed equals;
        closeBlocking min;
        Lock lock = this.length;
        lock.lock();
        try {
            batch<?> IsOverlapping = IsOverlapping();
            if (IsOverlapping != null) {
                return IsOverlapping;
            }
            if (this.setMin == isInboundDone.getMax) {
                do {
                    equals = equals();
                    if (equals != null) {
                        if (equals instanceof batch) {
                            Intrinsics.checkNotNull(equals);
                            lock.unlock();
                            return equals;
                        }
                        Intrinsics.checkNotNull(equals);
                        min = equals.getMin(e);
                    }
                } while (min == null);
                if (getApdidToken.setMax()) {
                    if (!(min == cy3.getMax)) {
                        throw new AssertionError();
                    }
                }
                Unit unit = Unit.INSTANCE;
                lock.unlock();
                Intrinsics.checkNotNull(equals);
                equals.D_();
                Intrinsics.checkNotNull(equals);
                return equals.setMin();
            }
            UndeliveredElementException min2 = getMin((Object) e);
            if (min2 == null) {
                closeBlocking closeblocking = isInboundDone.length;
                lock.unlock();
                return closeblocking;
            }
            throw min2;
        } finally {
            lock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final Object setMax() {
        Lock lock = this.length;
        lock.lock();
        try {
            if (this.setMin == isInboundDone.getMax) {
                Object IsOverlapping = IsOverlapping();
                if (IsOverlapping == null) {
                    IsOverlapping = isInboundDone.setMax;
                }
                return IsOverlapping;
            }
            Object obj = this.setMin;
            this.setMin = isInboundDone.getMax;
            Unit unit = Unit.INSTANCE;
            lock.unlock();
            return obj;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void getMin(boolean z) {
        Lock lock = this.length;
        lock.lock();
        try {
            UndeliveredElementException min = getMin((Object) isInboundDone.getMax);
            Unit unit = Unit.INSTANCE;
            lock.unlock();
            super.getMin(z);
            if (min != null) {
                throw min;
            }
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    private final UndeliveredElementException getMin(Object obj) {
        Function1 function1;
        Object obj2 = this.setMin;
        UndeliveredElementException undeliveredElementException = null;
        if (!(obj2 == isInboundDone.getMax || (function1 = this.getMax) == null)) {
            undeliveredElementException = AbstractClientProxyChannel.getMax(function1, obj2, (UndeliveredElementException) null);
        }
        this.setMin = obj;
        return undeliveredElementException;
    }

    /* access modifiers changed from: protected */
    public final boolean length(@NotNull getLocalSocketAddress<? super E> getlocalsocketaddress) {
        Lock lock = this.length;
        lock.lock();
        try {
            return super.length(getlocalsocketaddress);
        } finally {
            lock.unlock();
        }
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final String invoke() {
        StringBuilder sb = new StringBuilder("(value=");
        sb.append(this.setMin);
        sb.append(')');
        return sb.toString();
    }
}
