package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import o.DeviceTokenClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobCancellingNode;", "child", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class vir1 extends getHeader {
    @NotNull
    @JvmField
    public final getNativeProp<?> getMin;

    public final /* synthetic */ Object invoke(Object obj) {
        setMin((Throwable) obj);
        return Unit.INSTANCE;
    }

    public vir1(@NotNull getNativeProp<?> getnativeprop) {
        this.getMin = getnativeprop;
    }

    public final void setMin(@Nullable Throwable th) {
        getNativeProp<?> getnativeprop = this.getMin;
        onPageEndAndZip onpageendandzip = this.length;
        if (onpageendandzip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("job");
        }
        Throwable length = getNativeProp.length((DictionaryKeys) onpageendandzip);
        if (!getnativeprop.getMin(length)) {
            getnativeprop.setMax(length);
            if (!getnativeprop.getMax()) {
                DeviceTokenClient.AnonymousClass1 r0 = (DeviceTokenClient.AnonymousClass1) getnativeprop._parentHandle;
                if (r0 != null) {
                    r0.y_();
                }
                getnativeprop._parentHandle = AbstractWrappedByteChannel.getMax;
            }
        }
    }
}
