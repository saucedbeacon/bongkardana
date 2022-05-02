package id.dana.social.di.module;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.DistanceConfigFetcher;
import o.RVGroup;
import o.getSelectedIndex;
import o.rememberWindowAttachCount;
import o.setOnOptionPickListener;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0003H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, d2 = {"Lid/dana/social/di/module/SocialCommonModule;", "", "view", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "(Lid/dana/usereducation/BottomSheetOnBoardingContract$View;)V", "getView", "()Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "provideBottomSheetOnBoardingPresenter", "Lid/dana/usereducation/BottomSheetOnBoardingContract$Presenter;", "bottomSheetOnBoardingPresenter", "Lid/dana/usereducation/BottomSheetOnBoardingPresenter;", "provideBottomSheetOnBoardingView", "provideFriendshipAnalyticTracker", "Lid/dana/social/tracker/FriendshipAnalyticTracker;", "friendshipMixpanelTracker", "Lid/dana/social/tracker/FriendshipMixpanelTracker;", "provideSocialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "socialMediaEntityRepository", "Lid/dana/data/social/SocialMediaEntityRepository;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class SocialCommonModule {
    @NotNull
    private final getSelectedIndex.setMax length;

    public SocialCommonModule(@NotNull getSelectedIndex.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "view");
        this.length = setmax;
    }

    @NotNull
    @PerModule
    @Provides
    public final AUHorizontalListView.SelectionNotifier getMin(@NotNull rememberWindowAttachCount rememberwindowattachcount) {
        Intrinsics.checkNotNullParameter(rememberwindowattachcount, "friendshipMixpanelTracker");
        return rememberwindowattachcount;
    }

    @NotNull
    @PerModule
    @Provides
    public final getSelectedIndex.length setMin(@NotNull setOnOptionPickListener setonoptionpicklistener) {
        Intrinsics.checkNotNullParameter(setonoptionpicklistener, "bottomSheetOnBoardingPresenter");
        return setonoptionpicklistener;
    }

    @NotNull
    @PerModule
    @Provides
    public final getSelectedIndex.setMax setMax() {
        return this.length;
    }

    @NotNull
    @PerModule
    @Provides
    public final DistanceConfigFetcher setMin(@NotNull RVGroup rVGroup) {
        Intrinsics.checkNotNullParameter(rVGroup, "socialMediaEntityRepository");
        return rVGroup;
    }
}
