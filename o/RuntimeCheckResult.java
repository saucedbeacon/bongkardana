package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.LeaderboardEntryModule;
import id.dana.richview.leaderboardentry.LeaderboardEntryView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {LeaderboardEntryModule.class})
public interface RuntimeCheckResult {
    void setMin(LeaderboardEntryView leaderboardEntryView);
}
