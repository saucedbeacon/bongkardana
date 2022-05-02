package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.social.AddReactionBottomSheetDialog;
import o.AUHorizontalListView;
import o.setLeftButtonFont;

public final class getLogProductId implements getBindingAdapter<AddReactionBottomSheetDialog> {
    @InjectedFieldSignature("id.dana.social.AddReactionBottomSheetDialog.presenter")
    public static void getMin(AddReactionBottomSheetDialog addReactionBottomSheetDialog, setLeftButtonFont.getMin getmin) {
        addReactionBottomSheetDialog.presenter = getmin;
    }

    @InjectedFieldSignature("id.dana.social.AddReactionBottomSheetDialog.friendshipAnalyticTracker")
    public static void getMin(AddReactionBottomSheetDialog addReactionBottomSheetDialog, AUHorizontalListView.SelectionNotifier selectionNotifier) {
        addReactionBottomSheetDialog.friendshipAnalyticTracker = selectionNotifier;
    }
}
