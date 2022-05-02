package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.fragment.FriendsFeedsFragment;
import o.AUHorizontalListView;
import o.setLeftButtonText;

public final class onKeyMultiple implements getBindingAdapter<FriendsFeedsFragment> {
    @InjectedFieldSignature("id.dana.social.fragment.FriendsFeedsFragment.presenter")
    public static void setMin(FriendsFeedsFragment friendsFeedsFragment, setLeftButtonText.length length) {
        friendsFeedsFragment.presenter = length;
    }

    @InjectedFieldSignature("id.dana.social.fragment.FriendsFeedsFragment.friendshipAnalyticTracker")
    public static void getMax(FriendsFeedsFragment friendsFeedsFragment, AUHorizontalListView.SelectionNotifier selectionNotifier) {
        friendsFeedsFragment.friendshipAnalyticTracker = selectionNotifier;
    }
}
