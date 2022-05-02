package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.richview.leaderboardentry.LeaderboardEntryView;
import o.getDataType;

public final class setKeepPreview implements getBindingAdapter<LeaderboardEntryView> {
    @InjectedFieldSignature("id.dana.richview.leaderboardentry.LeaderboardEntryView.presenter")
    public static void setMax(LeaderboardEntryView leaderboardEntryView, getDataType.setMax setmax) {
        leaderboardEntryView.presenter = setmax;
    }
}
