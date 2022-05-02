package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.FriendshipBottomSheetHelpActivity;
import o.AUHorizontalListView;

public final class getBizCode implements getBindingAdapter<FriendshipBottomSheetHelpActivity> {
    @InjectedFieldSignature("id.dana.social.FriendshipBottomSheetHelpActivity.friendshipAnalyticTracker")
    public static void setMin(FriendshipBottomSheetHelpActivity friendshipBottomSheetHelpActivity, AUHorizontalListView.SelectionNotifier selectionNotifier) {
        friendshipBottomSheetHelpActivity.friendshipAnalyticTracker = selectionNotifier;
    }
}
