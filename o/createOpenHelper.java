package o;

import android.view.ViewGroup;
import id.dana.R;
import id.dana.model.ThirdPartyService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/bottomsheet/BottomSheetSpaceItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/ThirdPartyService;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class createOpenHelper extends Ignore<ThirdPartyService> {
    @NotNull
    private final ViewGroup getMax;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public createOpenHelper(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.viewholder_bottomsheet_space_item, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMax = viewGroup;
    }
}
