package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R5\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lid/dana/social/adapter/TopFriendsAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FeedViewHolderModel;", "()V", "setEnableRefresh", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "b", "", "getSetEnableRefresh", "()Lkotlin/jvm/functions/Function1;", "setSetEnableRefresh", "(Lkotlin/jvm/functions/Function1;)V", "showReciprocalRelationshipList", "getShowReciprocalRelationshipList", "()Z", "setShowReciprocalRelationshipList", "(Z)V", "onCreateViewHolder", "Lid/dana/social/adapter/friendsheader/TopFriendViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setLoadingText extends IMultiInstanceInvalidationCallback.Stub<Ignore<setEmptyView>, setEmptyView> {
    public Function1<? super Boolean, Unit> getMin;
    public boolean setMax;

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Function1<? super Boolean, Unit> function1 = this.getMin;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("setEnableRefresh");
        }
        return new selectTabAndAdjustLine(viewGroup, function1, this.setMax);
    }
}
