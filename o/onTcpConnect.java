package o;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/internal/ContextScope;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class onTcpConnect implements initToken {
    @NotNull
    private final CoroutineContext setMin;

    public onTcpConnect(@NotNull CoroutineContext coroutineContext) {
        this.setMin = coroutineContext;
    }

    @NotNull
    public final CoroutineContext getCoroutineContext() {
        return this.setMin;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineScope(coroutineContext=");
        sb.append(getCoroutineContext());
        sb.append(')');
        return sb.toString();
    }
}
