package o;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.UndeliveredElementException;
import o.socket;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0014¢\u0006\u0002\u0010\u0015J/\u0010\u0016\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\t8DX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8DX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8DX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\t8DX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class isConnecting<E> extends configureBlocking<E> {
    /* access modifiers changed from: protected */
    public final boolean getMax() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean setMin() {
        return true;
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
    @NotNull
    public final Object setMax(E e) {
        isClosed<?> length;
        do {
            Object max = super.setMax(e);
            if (max == isInboundDone.length) {
                return isInboundDone.length;
            }
            if (max == isInboundDone.getMin) {
                length = length(e);
                if (length == null) {
                    return isInboundDone.length;
                }
            } else if (max instanceof batch) {
                return max;
            } else {
                throw new IllegalStateException("Invalid offerInternal result ".concat(String.valueOf(max)).toString());
            }
        } while (!(length instanceof batch));
        return length;
    }

    /* access modifiers changed from: protected */
    public final void setMin(@NotNull Object obj, @NotNull batch<?> batch) {
        UndeliveredElementException undeliveredElementException = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                getDraft getdraft = (getDraft) obj;
                if (getdraft instanceof socket.getMax) {
                    Function1 function1 = this.getMax;
                    if (function1 != null) {
                        undeliveredElementException = AbstractClientProxyChannel.getMax(function1, ((socket.getMax) getdraft).getMax, (UndeliveredElementException) null);
                    }
                } else {
                    getdraft.getMin(batch);
                }
            } else if (obj != null) {
                ArrayList arrayList = (ArrayList) obj;
                UndeliveredElementException undeliveredElementException2 = null;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    getDraft getdraft2 = (getDraft) arrayList.get(size);
                    if (getdraft2 instanceof socket.getMax) {
                        Function1 function12 = this.getMax;
                        undeliveredElementException2 = function12 != null ? AbstractClientProxyChannel.getMax(function12, ((socket.getMax) getdraft2).getMax, undeliveredElementException2) : null;
                    } else {
                        getdraft2.getMin(batch);
                    }
                }
                undeliveredElementException = undeliveredElementException2;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.ArrayList<E> /* = java.util.ArrayList<E> */");
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }
}
