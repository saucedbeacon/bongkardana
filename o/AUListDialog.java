package o;

import android.content.Intent;
import android.view.View;
import dagger.internal.InjectedFieldSignature;
import id.dana.R;
import id.dana.domain.social.ModifyRelationOperationType;
import id.dana.social.RestrictedContactActivity;
import id.dana.social.base.FriendshipListBaseFragment;
import id.dana.social.state.FeedCommentModelState;
import id.dana.social.view.activity.SocialProfileActivity;
import id.dana.social.view.activity.detail.SocialActivityDetail;
import id.dana.social.view.activity.notification.FeedNotificationActivity;
import id.dana.social.view.fragment.ActivityReactionsListFragment;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.AUSegment;
import o.getLeftButton;
import o.getRightButtonIconView;
import o.setLeftButtonEnabled;
import o.setRightButtonStyle;
import org.jetbrains.annotations.NotNull;

public final class AUListDialog implements getBindingAdapter<SocialProfileActivity> {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class ListDialogItem {
        public static final /* synthetic */ int[] length;

        static {
            int[] iArr = new int[FeedCommentModelState.values().length];
            length = iArr;
            iArr[FeedCommentModelState.SENDING.ordinal()] = 1;
            length[FeedCommentModelState.FAILED.ordinal()] = 2;
            length[FeedCommentModelState.SUCCESS.ordinal()] = 3;
            length[FeedCommentModelState.DEFAULT.ordinal()] = 4;
            length[FeedCommentModelState.DIM.ordinal()] = 5;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\bH\u0016J\b\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0016¨\u0006\u0017"}, d2 = {"Lid/dana/social/view/fragment/FollowerListFragment;", "Lid/dana/social/base/FriendshipListBaseFragment;", "ShowSnackbarInterface", "Lid/dana/social/base/FriendshipListBaseFragment$ShowSnackbarInterface;", "(Lid/dana/social/base/FriendshipListBaseFragment$ShowSnackbarInterface;)V", "callModifyRelationship", "", "userId", "", "operationType", "Lid/dana/domain/social/ModifyRelationOperationType;", "checkRelationshipType", "getActiveButton", "getActiveButtonSnackbarText", "getInactiveButton", "getInactiveButtonSnackbarText", "getOnRestrictedContactButtonClicked", "Landroid/view/View$OnClickListener;", "getRelationshipStatusLabelText", "initFetchingProcess", "onResume", "trackMixpanelModifyRelationship", "status", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class OnItemClickListener extends FriendshipListBaseFragment {
        private HashMap setMin;

        public final View getMax(int i) {
            if (this.setMin == null) {
                this.setMin = new HashMap();
            }
            View view = (View) this.setMin.get(Integer.valueOf(i));
            if (view != null) {
                return view;
            }
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            View findViewById = view2.findViewById(i);
            this.setMin.put(Integer.valueOf(i), findViewById);
            return findViewById;
        }

        public final void invokeSuspend() {
            HashMap hashMap = this.setMin;
            if (hashMap != null) {
                hashMap.clear();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OnItemClickListener(@NotNull FriendshipListBaseFragment.getMax getmax) {
            super(getmax);
            Intrinsics.checkNotNullParameter(getmax, "ShowSnackbarInterface");
        }

        public final void onResume() {
            super.onResume();
            getLeftButton.getMin getmin = this.friendshipPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipPresenter");
            }
            getmin.getMax();
        }

        @NotNull
        public final String toDoubleRange() {
            String string = getString(R.string.block_friendship);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.block_friendship)");
            return string;
        }

        @NotNull
        public final String values() {
            String string = getString(R.string.unblock_friendship);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.unblock_friendship)");
            return string;
        }

        @NotNull
        public final String FastBitmap$CoordinateSystem() {
            String string = getString(R.string.friendship_block);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.friendship_block)");
            return string;
        }

        @NotNull
        public final String Grayscale$Algorithm() {
            String string = getString(R.string.friendship_unblock);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.friendship_unblock)");
            return string;
        }

        @NotNull
        public final String Mean$Arithmetic() {
            String string = getResources().getString(R.string.blocked_contacts_label);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(\n   …g.blocked_contacts_label)");
            return string;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
        static final class getMin implements View.OnClickListener {
            final /* synthetic */ OnItemClickListener getMin;

            getMin(OnItemClickListener onItemClickListener) {
                this.getMin = onItemClickListener;
            }

            public final void onClick(View view) {
                Intent intent = new Intent(this.getMin.getContext(), RestrictedContactActivity.class);
                intent.putExtra(RestrictedContactActivity.EXTRA_RELATIONSHIP_TYPE, RestrictedContactActivity.RELATIONSHIP_TYPE_FOLLOWER);
                this.getMin.startActivity(intent);
            }
        }

        @NotNull
        public final View.OnClickListener invoke() {
            return new getMin(this);
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "status");
            AUHorizontalListView.SelectionNotifier selectionNotifier = this.friendshipAnalyticTracker;
            if (selectionNotifier == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipAnalyticTracker");
            }
            selectionNotifier.getMin(str);
        }

        public final void getMax() {
            getLeftButton.getMin getmin = this.friendshipPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipPresenter");
            }
            getmin.length();
        }

        public final void equals() {
            getLeftButton.getMin getmin = this.friendshipPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipPresenter");
            }
            getmin.getMax();
        }

        public final void length(@NotNull String str, @NotNull ModifyRelationOperationType modifyRelationOperationType) {
            Intrinsics.checkNotNullParameter(str, "userId");
            Intrinsics.checkNotNullParameter(modifyRelationOperationType, "operationType");
            getLeftButton.getMin getmin = this.friendshipPresenter;
            if (getmin == null) {
                Intrinsics.throwUninitializedPropertyAccessException("friendshipPresenter");
            }
            getmin.setMax(str, modifyRelationOperationType);
        }

        public final /* synthetic */ void onDestroyView() {
            super.onDestroyView();
            HashMap hashMap = this.setMin;
            if (hashMap != null) {
                hashMap.clear();
            }
        }
    }

    /* renamed from: o.AUListDialog$2  reason: invalid class name */
    public final class AnonymousClass2 implements getBindingAdapter<ActivityReactionsListFragment> {
        @InjectedFieldSignature("id.dana.social.view.fragment.ActivityReactionsListFragment.activityReactionsPresenter")
        public static void getMin(ActivityReactionsListFragment activityReactionsListFragment, AUSegment.TabSwitchListener.getMin getmin) {
            activityReactionsListFragment.activityReactionsPresenter = getmin;
        }
    }

    public final class ListAdapter implements getBindingAdapter<FeedNotificationActivity> {
        @InjectedFieldSignature("id.dana.social.view.activity.notification.FeedNotificationActivity.feedNotificationPresenter")
        public static void setMax(FeedNotificationActivity feedNotificationActivity, setLeftButtonEnabled.setMin setmin) {
            feedNotificationActivity.feedNotificationPresenter = setmin;
        }
    }

    @InjectedFieldSignature("id.dana.social.view.activity.SocialProfileActivity.socialProfilePresenter")
    public static void setMin(SocialProfileActivity socialProfileActivity, getRightButtonIconView.setMax setmax) {
        socialProfileActivity.socialProfilePresenter = setmax;
    }

    /* renamed from: o.AUListDialog$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<SocialActivityDetail> {
        @InjectedFieldSignature("id.dana.social.view.activity.detail.SocialActivityDetail.feedCommentPresenter")
        public static void setMax(SocialActivityDetail socialActivityDetail, setRightButtonStyle.getMin getmin) {
            socialActivityDetail.feedCommentPresenter = getmin;
        }

        @InjectedFieldSignature("id.dana.social.view.activity.detail.SocialActivityDetail.friendshipAnalyticTracker")
        public static void getMin(SocialActivityDetail socialActivityDetail, AUHorizontalListView.SelectionNotifier selectionNotifier) {
            socialActivityDetail.friendshipAnalyticTracker = selectionNotifier;
        }

        @InjectedFieldSignature("id.dana.social.view.activity.detail.SocialActivityDetail.feedsContentAction")
        public static void setMax(SocialActivityDetail socialActivityDetail, AUIconDrawable aUIconDrawable) {
            socialActivityDetail.feedsContentAction = aUIconDrawable;
        }
    }

    @InjectedFieldSignature("id.dana.social.view.activity.SocialProfileActivity.friendshipAnalyticTracker")
    public static void setMin(SocialProfileActivity socialProfileActivity, AUHorizontalListView.SelectionNotifier selectionNotifier) {
        socialProfileActivity.friendshipAnalyticTracker = selectionNotifier;
    }
}
