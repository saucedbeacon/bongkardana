package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.FeedsFragment;
import id.dana.social.FriendshipBottomSheetOnBoardingActivity;
import id.dana.social.ReciprocalBottomSheetDialog;
import o.AUHorizontalListView;
import o.getTitleText;

public final class IAPIntegrationHelper implements getBindingAdapter<FeedsFragment> {

    /* renamed from: o.IAPIntegrationHelper$2  reason: invalid class name */
    public final class AnonymousClass2 implements getBindingAdapter<ReciprocalBottomSheetDialog> {
        @InjectedFieldSignature("id.dana.social.ReciprocalBottomSheetDialog.presenter")
        public static void getMax(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog, getTitleText.getMin getmin) {
            reciprocalBottomSheetDialog.presenter = getmin;
        }

        @InjectedFieldSignature("id.dana.social.ReciprocalBottomSheetDialog.friendshipAnalyticTracker")
        public static void getMin(ReciprocalBottomSheetDialog reciprocalBottomSheetDialog, AUHorizontalListView.SelectionNotifier selectionNotifier) {
            reciprocalBottomSheetDialog.friendshipAnalyticTracker = selectionNotifier;
        }
    }

    @InjectedFieldSignature("id.dana.social.FeedsFragment.settingPresenter")
    public static void setMax(FeedsFragment feedsFragment, getTitleText.getMin getmin) {
        feedsFragment.settingPresenter = getmin;
    }

    @InjectedFieldSignature("id.dana.social.FeedsFragment.friendshipAnalyticsTracker")
    public static void setMin(FeedsFragment feedsFragment, AUHorizontalListView.SelectionNotifier selectionNotifier) {
        feedsFragment.friendshipAnalyticsTracker = selectionNotifier;
    }

    /* renamed from: o.IAPIntegrationHelper$1  reason: invalid class name */
    public final class AnonymousClass1 implements getBindingAdapter<FriendshipBottomSheetOnBoardingActivity> {
        @InjectedFieldSignature("id.dana.social.FriendshipBottomSheetOnBoardingActivity.friendshipAnalyticTracker")
        public static void setMax(FriendshipBottomSheetOnBoardingActivity friendshipBottomSheetOnBoardingActivity, AUHorizontalListView.SelectionNotifier selectionNotifier) {
            friendshipBottomSheetOnBoardingActivity.friendshipAnalyticTracker = selectionNotifier;
        }
    }
}
