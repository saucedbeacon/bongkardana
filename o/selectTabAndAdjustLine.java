package o;

import android.view.View;
import android.view.ViewGroup;
import id.dana.R;
import id.dana.social.view.FriendsFeedsHeaderView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B8\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lid/dana/social/adapter/friendsheader/TopFriendViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "setEnableRefresh", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "b", "", "showReciprocalList", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;Z)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class selectTabAndAdjustLine extends Ignore<setEmptyView> {
    @NotNull
    private final ViewGroup getMin;

    public final /* synthetic */ void setMax(Object obj) {
        List<performItemClick> list;
        setEmptyView setemptyview = (setEmptyView) obj;
        if (setemptyview != null && (list = setemptyview.length) != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ((FriendsFeedsHeaderView) view.findViewById(resetInternal.setMax.setMaxElementsWrap)).setItems(list);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public selectTabAndAdjustLine(@NotNull ViewGroup viewGroup, @NotNull Function1<? super Boolean, Unit> function1, boolean z) {
        super(viewGroup.getContext(), R.layout.viewholder_top_friends, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function1, "setEnableRefresh");
        this.getMin = viewGroup;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        FriendsFeedsHeaderView friendsFeedsHeaderView = (FriendsFeedsHeaderView) view.findViewById(resetInternal.setMax.setMaxElementsWrap);
        if (friendsFeedsHeaderView != null) {
            friendsFeedsHeaderView.setSetEnableRefresh(function1);
        }
        View view2 = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        FriendsFeedsHeaderView friendsFeedsHeaderView2 = (FriendsFeedsHeaderView) view2.findViewById(resetInternal.setMax.setMaxElementsWrap);
        if (friendsFeedsHeaderView2 != null) {
            friendsFeedsHeaderView2.setShowReciprocalRelationship(z);
        }
    }
}
