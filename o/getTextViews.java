package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lid/dana/social/adapter/friendsheader/SeeAllFriendsHeaderViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FriendModel;", "parent", "Landroid/view/ViewGroup;", "seeAllClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "(Landroid/view/ViewGroup;Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTextViews extends Ignore<performItemClick> {
    @NotNull
    private final ViewGroup setMin;

    public final /* synthetic */ void setMax(Object obj) {
        Intrinsics.checkNotNullParameter((performItemClick) obj, "data");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getTextViews(@NotNull ViewGroup viewGroup, @NotNull final Ignore.setMin setmin) {
        super(viewGroup.getContext(), R.layout.viewholder_see_all_header, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(setmin, "seeAllClickListener");
        this.setMin = viewGroup;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.safeSizeOf);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new View.OnClickListener(this) {
                final /* synthetic */ getTextViews length;

                {
                    this.length = r1;
                }

                public final void onClick(View view) {
                    setmin.length(this.length.getAdapterPosition());
                }
            });
        }
    }
}
