package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.social.model.RelationshipItemModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/social/adapter/RestrictedContactAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/RelationshipItemModel;", "interaction", "Lid/dana/social/adapter/FriendshipListInteraction;", "(Lid/dana/social/adapter/FriendshipListInteraction;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class initAttrStyle extends IMultiInstanceInvalidationCallback.Stub<Ignore<RelationshipItemModel>, RelationshipItemModel> {
    private final getAuthCodeForSecurityGuard setMin;

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setWindowMaxWidth(viewGroup, this.setMin);
    }

    public initAttrStyle(@NotNull getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
        Intrinsics.checkNotNullParameter(getauthcodeforsecurityguard, "interaction");
        this.setMin = getauthcodeforsecurityguard;
    }
}
