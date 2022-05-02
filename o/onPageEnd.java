package o;

import kotlin.Metadata;
import kotlinx.coroutines.InternalCoroutinesApi;
import o.APExpansion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0005R\u0012\u0010\u0003\u001a\u00020\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "toString", "", "toStringInternalImpl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public abstract class onPageEnd extends APExpansion.AnonymousClass1 {
    @NotNull
    public abstract onPageEnd length();

    @NotNull
    public String toString() {
        String min = setMin();
        if (min != null) {
            return min;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    @Nullable
    @InternalCoroutinesApi
    public final String setMin() {
        onPageEnd onpageend;
        onPageEnd length = DeviceTokenClient.length();
        onPageEnd onpageend2 = this;
        if (onpageend2 == length) {
            return "Dispatchers.Main";
        }
        try {
            onpageend = length.length();
        } catch (UnsupportedOperationException unused) {
            onpageend = null;
        }
        if (onpageend2 == onpageend) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }
}
