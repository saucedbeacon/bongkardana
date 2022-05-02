package o;

import android.view.View;
import android.view.ViewGroup;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonPrimaryView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lid/dana/social/adapter/EmptyStateViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "socialFeedClickListener", "Lid/dana/social/adapter/SocialFeedClickListener;", "(Landroid/view/ViewGroup;Lid/dana/social/adapter/SocialFeedClickListener;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverRpcUtils extends Ignore<setEmptyView> {
    @NotNull
    private final ViewGroup getMax;

    public final /* bridge */ /* synthetic */ void setMax(Object obj) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GriverRpcUtils(@NotNull ViewGroup viewGroup, @NotNull initContent initcontent) {
        super(viewGroup.getContext(), R.layout.view_social_feeds_empty_state, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(initcontent, "socialFeedClickListener");
        this.getMax = viewGroup;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        DanaButtonPrimaryView danaButtonPrimaryView = (DanaButtonPrimaryView) view.findViewById(resetInternal.setMax.toString);
        if (danaButtonPrimaryView != null) {
            danaButtonPrimaryView.setOnClickListener(new setMin(initcontent));
            danaButtonPrimaryView.setVisibility(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/social/adapter/EmptyStateViewHolder$1$1"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ initContent getMax;

        setMin(initContent initcontent) {
            this.getMax = initcontent;
        }

        public final void onClick(View view) {
            this.getMax.setMax();
        }
    }
}
