package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import dagger.internal.InjectedFieldSignature;
import id.dana.social.base.FriendshipListBaseFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.IMultiInstanceInvalidationCallback;
import o.getLeftButton;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lid/dana/social/adapter/SocialWidgetFeedAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/social/model/SocialFeedModel;", "()V", "listener", "Lid/dana/social/adapter/SocialFeedClickListener;", "getListener", "()Lid/dana/social/adapter/SocialFeedClickListener;", "setListener", "(Lid/dana/social/adapter/SocialFeedClickListener;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class AUSegment extends IMultiInstanceInvalidationCallback.Stub<Ignore<access$2502>, access$2502> {
    public initContent getMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/social/common/FeedInputCommentListener;", "", "onSubmitButtonClicked", "", "content", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.AUSegment$4  reason: invalid class name */
    public interface AnonymousClass4 {
        void setMax(@NotNull String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/social/common/FeedOnboardingListener;", "", "onActivateClick", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* renamed from: o.AUSegment$5  reason: invalid class name */
    public interface AnonymousClass5 {
        void setMax();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lid/dana/social/contract/ActivityReactionsContract;", "", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface TabSwitchListener {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/social/contract/ActivityReactionsContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetActivityReactions", "", "users", "", "Lid/dana/social/model/ActivityReactionsUserModel;", "onGetMyActivityReactionInfo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface getMax extends parentColumns.getMax {
            void getMax();

            void setMin(@Nullable List<recycleOnMeasure> list);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\bH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lid/dana/social/contract/ActivityReactionsContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "getActivityReactions", "", "activityId", "", "kind", "forPagination", "", "getActivityReactionsPagination", "getCurrentUserSize", "", "getMyActivityReactionInfo", "setSelectedKind", "selectedKind", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public interface getMin extends parentColumns.setMin {
            void getMax(@NotNull String str, @NotNull String str2);

            int getMin();

            void length();

            void setMin(@NotNull String str, @NotNull String str2, boolean z);

            void setMin(boolean z);
        }
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        int size = getMax().size();
        initContent initcontent = this.getMax;
        if (initcontent == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
        return new upDateTheme(viewGroup, size, initcontent);
    }

    /* renamed from: o.AUSegment$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<FriendshipListBaseFragment> {
        @InjectedFieldSignature("id.dana.social.base.FriendshipListBaseFragment.friendshipPresenter")
        public static void getMin(FriendshipListBaseFragment friendshipListBaseFragment, getLeftButton.getMin getmin) {
            friendshipListBaseFragment.friendshipPresenter = getmin;
        }

        @InjectedFieldSignature("id.dana.social.base.FriendshipListBaseFragment.friendshipAnalyticTracker")
        public static void getMin(FriendshipListBaseFragment friendshipListBaseFragment, AUHorizontalListView.SelectionNotifier selectionNotifier) {
            friendshipListBaseFragment.friendshipAnalyticTracker = selectionNotifier;
        }
    }
}
