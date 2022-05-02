package o;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
final class setLeftButtonIcon$Mean$Arithmetic extends Lambda implements Function1<Exception, Unit> {
    final /* synthetic */ setLeftButtonIcon this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    setLeftButtonIcon$Mean$Arithmetic(setLeftButtonIcon setleftbuttonicon) {
        super(1);
        this.this$0 = setleftbuttonicon;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Exception) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "it");
        updateActionSheetContent.e(DanaLogConstants.TAG.RELATIONSHIP, makeCenterView.getMax(isStatePreservationOn.class, this.this$0.getClass(), String.valueOf(exc.getCause())));
    }
}
