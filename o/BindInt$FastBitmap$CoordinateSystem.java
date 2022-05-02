package o;

import id.dana.model.ThirdPartyService;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.NullBeaconDataFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/services/model/ThirdPartyCategoryService;", "invoke"}, k = 3, mv = {1, 4, 2})
final class BindInt$FastBitmap$CoordinateSystem extends Lambda implements Function1<List<? extends NullBeaconDataFactory.AnonymousClass1>, Unit> {
    final /* synthetic */ BindInt this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BindInt$FastBitmap$CoordinateSystem(BindInt bindInt) {
        super(1);
        this.this$0 = bindInt;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends NullBeaconDataFactory.AnonymousClass1>) (List) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(@NotNull List<? extends NullBeaconDataFactory.AnonymousClass1> list) {
        Intrinsics.checkNotNullParameter(list, "it");
        this.this$0.length.dismissProgress();
        BindInt.setMax(this.this$0, CollectionsKt.toMutableList(list), false, "", false);
        this.this$0.length.getMax((List<ThirdPartyService>) CollectionsKt.toMutableList(this.this$0.toIntRange.getMax(list, true, false)));
    }
}
