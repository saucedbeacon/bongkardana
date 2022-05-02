package id.dana.base.extension;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/base/extension/WorkManagerFailure;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "", "(Ljava/lang/Throwable;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class WorkManagerFailure extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WorkManagerFailure(@NotNull Throwable th) {
        super(th);
        Intrinsics.checkNotNullParameter(th, "cause");
    }
}
