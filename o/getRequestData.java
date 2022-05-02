package o;

import id.dana.data.saving.model.MainEmptyStateEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toMainEmptyState", "Lid/dana/domain/saving/model/MainEmptyState;", "Lid/dana/data/saving/model/MainEmptyStateEntity;", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class getRequestData {
    @NotNull
    public static final BeaconIntentProcessor toMainEmptyState(@NotNull MainEmptyStateEntity mainEmptyStateEntity) {
        Intrinsics.checkNotNullParameter(mainEmptyStateEntity, "$this$toMainEmptyState");
        return new BeaconIntentProcessor(mainEmptyStateEntity.getIcon(), mainEmptyStateEntity.getTitle(), mainEmptyStateEntity.getSubtitle());
    }
}
