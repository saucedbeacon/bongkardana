package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.social.model.RelationshipItemModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00152\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0010\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\fH\u0002J\u001e\u0010\u000f\u001a\u00020\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/social/adapter/friendsheader/FriendsFeedsHeaderAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/FriendModel;", "seeAllClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "onAvatarClick", "Lkotlin/Function1;", "Lid/dana/social/model/RelationshipItemModel;", "", "(Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class resetTabView extends IMultiInstanceInvalidationCallback.Stub<Ignore<performItemClick>, performItemClick> {
    @NotNull
    public static final getMin getMax = new getMin((byte) 0);
    private final Ignore.setMin length;
    private final Function1<RelationshipItemModel, Unit> setMin;

    public final int getItemViewType(int i) {
        return i != 0 ? 1 : 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class length extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        length(resetTabView resettabview) {
            super(1, resettabview, resetTabView.class, "onAvatarClick", "onAvatarClick(I)V", 0);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            resetTabView.setMin((resetTabView) this.receiver, i);
        }
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        onBindViewHolder((Ignore) valueof, i);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i != 0) {
            ignore = new getBottomLine(viewGroup, new length(this));
        } else {
            ignore = new getTextViews(viewGroup, this.length);
        }
        return ignore;
    }

    public resetTabView(@NotNull Ignore.setMin setmin, @NotNull Function1<? super RelationshipItemModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(setmin, "seeAllClickListener");
        Intrinsics.checkNotNullParameter(function1, "onAvatarClick");
        this.length = setmin;
        this.setMin = function1;
    }

    public final int getItemCount() {
        return super.getItemCount() + 1;
    }

    public final void getMax(@NotNull Ignore<performItemClick> ignore, int i) {
        Intrinsics.checkNotNullParameter(ignore, "holder");
        if (i != 0) {
            ignore.setMax(setMin(i - 1));
        } else {
            ignore.setMax(new performItemClick((byte) 0));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/social/adapter/friendsheader/FriendsFeedsHeaderAdapter$Companion;", "", "()V", "FRIEND_AVATAR", "", "SEE_ALL_AVATAR", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void setMin(resetTabView resettabview, int i) {
        performItemClick performitemclick;
        List max = resettabview.getMax();
        if (max != null && (performitemclick = (performItemClick) max.get(i)) != null) {
            Function1<RelationshipItemModel, Unit> function1 = resettabview.setMin;
            Intrinsics.checkNotNullParameter(performitemclick, "$this$toRelationshipItemModel");
            function1.invoke(new RelationshipItemModel(performitemclick.length, "", performitemclick.getMax, "ACTIVE", performitemclick.setMax, (String) null, 96));
        }
    }
}
