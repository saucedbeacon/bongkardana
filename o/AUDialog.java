package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.AUHorizontalListView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J$\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\tH\u0016J$\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017J$\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lid/dana/social/view/activity/detail/FeedCommentAdapter;", "Lid/dana/social/view/BaseFeedRecyclerViewAdapter;", "Lid/dana/social/model/FeedCommentModel;", "isOwnActivity", "", "feedCommentInteraction", "Lid/dana/social/view/activity/detail/FeedCommentInteraction;", "(ZLid/dana/social/view/activity/detail/FeedCommentInteraction;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/state/ViewHolderState;", "onCreateViewHolderChild", "parent", "Landroid/view/ViewGroup;", "viewType", "showDim", "commentId", "", "updateFeedCommentModel", "feedCommentModel", "addActivityCommentModel", "Lid/dana/social/model/AddActivityCommentModel;", "isRetry", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUDialog extends initCustomView<resurrectSelectionIfNeeded> {
    private final updateData length;
    private final boolean setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ AUDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(AUDialog aUDialog) {
            super(1);
            this.this$0 = aUDialog;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            this.this$0.getMax(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/social/model/FeedCommentModel;", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<Integer, resurrectSelectionIfNeeded> {
        final /* synthetic */ AUDialog this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(AUDialog aUDialog) {
            super(1);
            this.this$0 = aUDialog;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return invoke(((Number) obj).intValue());
        }

        @NotNull
        public final resurrectSelectionIfNeeded invoke(int i) {
            Object min = this.this$0.setMin(i);
            if (min != null) {
                return (resurrectSelectionIfNeeded) ((AUHorizontalListView.RecyclerListener.length) min).length;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.social.state.ViewHolderState.Item<id.dana.social.model.FeedCommentModel>");
        }
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        Ignore ignore = (Ignore) valueof;
        Intrinsics.checkNotNullParameter(ignore, "holder");
        ignore.setMax(setMin(i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AUDialog(boolean z, @NotNull final updateData updatedata) {
        super(new Function0<Unit>() {
            public final void invoke() {
                updatedata.getMax();
            }
        });
        Intrinsics.checkNotNullParameter(updatedata, "feedCommentInteraction");
        this.setMax = z;
        this.length = updatedata;
    }

    public final int getItemViewType(int i) {
        Object min = setMin(i);
        Intrinsics.checkNotNullExpressionValue(min, "getItem(position)");
        return scrapActiveViews.getMin((AUHorizontalListView.RecyclerListener) min);
    }

    @NotNull
    public final Ignore<AUHorizontalListView.RecyclerListener<resurrectSelectionIfNeeded>> setMax(@NotNull ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new AUEmptyGoneTextView(viewGroup, new setMin(this), this.length, new setMax(this), this.setMax);
    }

    public final void getMax(@NotNull Ignore<AUHorizontalListView.RecyclerListener<resurrectSelectionIfNeeded>> ignore, int i) {
        Intrinsics.checkNotNullParameter(ignore, "holder");
        ignore.setMax(setMin(i));
    }

    public final int getItemCount() {
        List max = getMax();
        if (max != null) {
            return max.size();
        }
        return 0;
    }
}
