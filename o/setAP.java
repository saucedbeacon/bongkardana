package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.social.model.RelationshipItemModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lid/dana/social/adapter/ReciprocalFriendListAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/RelationshipItemModel;", "interaction", "Lid/dana/social/adapter/FriendshipListInteraction;", "(Lid/dana/social/adapter/FriendshipListInteraction;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "updateRelationshipStatus", "", "relationshipItemModel", "newStatus", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setAP extends IMultiInstanceInvalidationCallback.Stub<Ignore<RelationshipItemModel>, RelationshipItemModel> {
    private final getAuthCodeForSecurityGuard getMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/social/model/RelationshipItemModel;", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Integer, RelationshipItemModel> {
        final /* synthetic */ setAP this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(setAP setap) {
            super(1);
            this.this$0 = setap;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        @NotNull
        public final RelationshipItemModel invoke(int i) {
            Object min = this.this$0.setMin(i);
            Intrinsics.checkNotNullExpressionValue(min, "getItem(it)");
            return (RelationshipItemModel) min;
        }
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new setCurrentSelTab(viewGroup, this.getMax, new setMax(this));
    }

    public setAP(@NotNull getAuthCodeForSecurityGuard getauthcodeforsecurityguard) {
        Intrinsics.checkNotNullParameter(getauthcodeforsecurityguard, "interaction");
        this.getMax = getauthcodeforsecurityguard;
    }

    public final void length(@NotNull RelationshipItemModel relationshipItemModel, @NotNull String str) {
        Object obj;
        Intrinsics.checkNotNullParameter(relationshipItemModel, "relationshipItemModel");
        Intrinsics.checkNotNullParameter(str, "newStatus");
        List max = getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        Iterator it = max.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) (RelationshipItemModel) obj, (Object) relationshipItemModel)) {
                break;
            }
        }
        RelationshipItemModel relationshipItemModel2 = (RelationshipItemModel) obj;
        if (relationshipItemModel2 != null) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            relationshipItemModel2.getMax = str;
            if (Intrinsics.areEqual((Object) str, (Object) "BLOCKING")) {
                getMin(relationshipItemModel);
                notifyDataSetChanged();
                return;
            }
            notifyItemChanged(getMax().indexOf(relationshipItemModel), relationshipItemModel2);
        }
    }
}
