package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.fragment.MyFeedsFragment;
import o.AUHorizontalListView;
import o.getBackButton;

public final class getArrowScrollPreviewLength implements getBindingAdapter<MyFeedsFragment> {
    @InjectedFieldSignature("id.dana.social.fragment.MyFeedsFragment.presenter")
    public static void getMax(MyFeedsFragment myFeedsFragment, getBackButton.length length) {
        myFeedsFragment.presenter = length;
    }

    @InjectedFieldSignature("id.dana.social.fragment.MyFeedsFragment.friendshipAnalyticTracker")
    public static void getMax(MyFeedsFragment myFeedsFragment, AUHorizontalListView.SelectionNotifier selectionNotifier) {
        myFeedsFragment.friendshipAnalyticTracker = selectionNotifier;
    }
}
