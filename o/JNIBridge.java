package o;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000\u001a3\u0010\u0005\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HHø\u0001\u0000¢\u0006\u0002\u0010\n\u001a3\u0010\u000b\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u00022\u001a\b\u0004\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HHø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u0018\u0010\u000f\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"getOrCreateCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "delegate", "Lkotlin/coroutines/Continuation;", "suspendCancellableCoroutine", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "suspendCancellableCoroutineReusable", "disposeOnCancellation", "handle", "Lkotlinx/coroutines/DisposableHandle;", "removeOnCancellation", "node", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 4, 2})
public final class JNIBridge {
    @NotNull
    public static final <T> getNativeProp<T> getMax(@NotNull Continuation<? super T> continuation) {
        getNativeProp<T> getnativeprop;
        getNativeProp<T> getnativeprop2;
        if (!(continuation instanceof onSSLHandshake)) {
            return new getNativeProp<>(continuation, 2);
        }
        onSSLHandshake onsslhandshake = (onSSLHandshake) continuation;
        while (true) {
            Object obj = onsslhandshake._reusableCancellableContinuation;
            getnativeprop = null;
            if (obj == null) {
                onsslhandshake._reusableCancellableContinuation = onClose.setMin;
                getnativeprop2 = null;
                break;
            } else if (obj instanceof getNativeProp) {
                if (onSSLHandshake.setMin.compareAndSet(onsslhandshake, obj, onClose.setMin)) {
                    getnativeprop2 = (getNativeProp) obj;
                    break;
                }
            } else {
                throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
            }
        }
        if (getnativeprop2 != null) {
            if (getnativeprop2.setMax()) {
                getnativeprop = getnativeprop2;
            }
            if (getnativeprop != null) {
                return getnativeprop;
            }
        }
        return new getNativeProp<>(continuation, 2);
    }
}
