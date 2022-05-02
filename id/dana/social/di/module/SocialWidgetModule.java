package id.dana.social.di.module;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerModule;
import javax.inject.Named;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DistanceConfigFetcher;
import o.RVGroup;
import o.addSubTitleView;
import o.getException;
import o.getScrapView;
import o.setIsvAppId;
import o.setViewTypeCount;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/social/di/module/SocialWidgetModule;", "", "view", "Lid/dana/social/contract/SocialWidgetContract$View;", "(Lid/dana/social/contract/SocialWidgetContract$View;)V", "provideNewSocialWidgetPresenter", "Lid/dana/social/presenter/NewSocialWidgetPresenter;", "presenter", "provideSociaWidgetRepository", "Lid/dana/domain/social/SocialWidgetRepository;", "socialWidgetEntityRepository", "Lid/dana/data/social/repository/SocialWidgetEntityRepository;", "provideSocialMediaRepository", "Lid/dana/domain/social/SocialMediaRepository;", "socialMediaEntityRepository", "Lid/dana/data/social/SocialMediaEntityRepository;", "provideSocialWidgetPresenter", "Lid/dana/social/contract/SocialWidgetContract$Presenter;", "Lid/dana/social/presenter/SocialWidgetPresenter;", "provideSocialWidgetView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class SocialWidgetModule {
    private final addSubTitleView.length setMax;

    @NotNull
    @Provides
    @Named("newSocialWidgetPresenter")
    public final setViewTypeCount setMax(@NotNull setViewTypeCount setviewtypecount) {
        Intrinsics.checkNotNullParameter(setviewtypecount, "presenter");
        return setviewtypecount;
    }

    public SocialWidgetModule(@NotNull addSubTitleView.length length) {
        Intrinsics.checkNotNullParameter(length, "view");
        this.setMax = length;
    }

    @NotNull
    @Provides
    public final addSubTitleView.length setMin() {
        return this.setMax;
    }

    @NotNull
    @Provides
    @Named("oldSocialWidgetPresenter")
    public final addSubTitleView.getMin setMin(@NotNull getScrapView getscrapview) {
        Intrinsics.checkNotNullParameter(getscrapview, "presenter");
        return getscrapview;
    }

    @NotNull
    @PerModule
    @Provides
    public final DistanceConfigFetcher length(@NotNull RVGroup rVGroup) {
        Intrinsics.checkNotNullParameter(rVGroup, "socialMediaEntityRepository");
        return rVGroup;
    }

    @NotNull
    @PerModule
    @Provides
    public final getException getMax(@NotNull setIsvAppId setisvappid) {
        Intrinsics.checkNotNullParameter(setisvappid, "socialWidgetEntityRepository");
        return setisvappid;
    }
}
