package id.dana.googleplay.updates;

import id.dana.googleplay.updates.DanaUpdateManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.isBaselineAligned;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/afollestad/materialdialogs/MaterialDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
final class DanaUpdateManager$FastBitmap$CoordinateSystem extends Lambda implements Function1<isBaselineAligned, Unit> {
    final /* synthetic */ DanaUpdateManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DanaUpdateManager$FastBitmap$CoordinateSystem(DanaUpdateManager danaUpdateManager) {
        super(1);
        this.this$0 = danaUpdateManager;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((isBaselineAligned) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull isBaselineAligned isbaselinealigned) {
        Intrinsics.checkNotNullParameter(isbaselinealigned, "it");
        DanaUpdateManager.setMin setmin = this.this$0.setMax;
        if (setmin != null) {
            setmin.setMin();
        }
    }
}
