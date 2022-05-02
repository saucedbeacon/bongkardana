package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.view.ReactionSectionView;
import o.AUHorizontalListView;
import o.setLeftButtonFont;

public final class addHorizonButtonView implements getBindingAdapter<ReactionSectionView> {
    @InjectedFieldSignature("id.dana.social.view.ReactionSectionView.presenter")
    public static void getMin(ReactionSectionView reactionSectionView, setLeftButtonFont.getMin getmin) {
        reactionSectionView.presenter = getmin;
    }

    @InjectedFieldSignature("id.dana.social.view.ReactionSectionView.friendshipAnalyticTracker")
    public static void getMin(ReactionSectionView reactionSectionView, AUHorizontalListView.SelectionNotifier selectionNotifier) {
        reactionSectionView.friendshipAnalyticTracker = selectionNotifier;
    }
}
