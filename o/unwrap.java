package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0014J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\nR\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "savedContext", "savedOldValue", "", "afterResume", "", "state", "clearThreadContext", "", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class unwrap<T> extends WebSocketCallback<T> {
    CoroutineContext length;
    Object setMax;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public unwrap(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext.get(SSLSocketChannel2.getMin) == null ? coroutineContext.plus(SSLSocketChannel2.getMin) : coroutineContext, continuation);
    }

    public final boolean toFloatRange() {
        if (this.length == null) {
            return false;
        }
        this.length = null;
        this.setMax = null;
        return true;
    }

    public final void getMin(@Nullable Object obj) {
        CoroutineContext coroutineContext = this.length;
        unwrap<?> unwrap = null;
        if (coroutineContext != null) {
            WebSocketClient.length(coroutineContext, this.setMax);
            this.length = unwrap;
            this.setMax = unwrap;
        }
        Object min = getDynData.setMin(obj, this.IsOverlapping);
        Continuation continuation = this.IsOverlapping;
        CoroutineContext context = continuation.getContext();
        Object min2 = WebSocketClient.getMin(context, unwrap);
        if (min2 != WebSocketClient.getMax) {
            unwrap = registerLog.getMin(continuation, context, min2);
        }
        try {
            this.IsOverlapping.resumeWith(min);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (unwrap == null || unwrap.toFloatRange()) {
                WebSocketClient.length(context, min2);
            }
        }
    }
}
