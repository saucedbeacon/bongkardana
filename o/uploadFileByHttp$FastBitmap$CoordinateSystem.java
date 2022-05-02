package o;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
final class uploadFileByHttp$FastBitmap$CoordinateSystem extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ uploadFileByHttp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    uploadFileByHttp$FastBitmap$CoordinateSystem(uploadFileByHttp uploadfilebyhttp) {
        super(1);
        this.this$0 = uploadfilebyhttp;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "it");
        this.this$0.setMin.dismissProgress();
        this.this$0.setMin.setMax();
    }
}
