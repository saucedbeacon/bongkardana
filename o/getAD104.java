package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/ChildHandleNode;", "Lkotlinx/coroutines/JobCancellingNode;", "Lkotlinx/coroutines/ChildHandle;", "childJob", "Lkotlinx/coroutines/ChildJob;", "(Lkotlinx/coroutines/ChildJob;)V", "childCancelled", "", "cause", "", "invoke", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
public final class getAD104 extends getHeader implements zipAndEncryptData {
    @NotNull
    @JvmField
    public final getAA13 setMax;

    public getAD104(@NotNull getAA13 getaa13) {
        this.setMax = getaa13;
    }

    public final void setMin(@Nullable Throwable th) {
        getAA13 getaa13 = this.setMax;
        onPageEndAndZip onpageendandzip = this.length;
        if (onpageendandzip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("job");
        }
        getaa13.getMax(onpageendandzip);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        getAA13 getaa13 = this.setMax;
        onPageEndAndZip onpageendandzip = this.length;
        if (onpageendandzip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("job");
        }
        getaa13.getMax(onpageendandzip);
        return Unit.INSTANCE;
    }

    public final boolean getMin(@NotNull Throwable th) {
        onPageEndAndZip onpageendandzip = this.length;
        if (onpageendandzip == null) {
            Intrinsics.throwUninitializedPropertyAccessException("job");
        }
        return onpageendandzip.setMin(th);
    }
}
