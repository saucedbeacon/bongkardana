package id.dana.social.di.module;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.clearTransientStateViews;
import o.getRightButtonIconView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/social/di/module/SocialProfileModule;", "", "view", "Lid/dana/social/contract/SocialProfileContract$View;", "(Lid/dana/social/contract/SocialProfileContract$View;)V", "provideSocialProfilePresenter", "Lid/dana/social/contract/SocialProfileContract$Presenter;", "presenter", "Lid/dana/social/presenter/SocialProfilePresenter;", "provideSocialProfileView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class SocialProfileModule {
    private final getRightButtonIconView.length length;

    public SocialProfileModule(@NotNull getRightButtonIconView.length length2) {
        Intrinsics.checkNotNullParameter(length2, "view");
        this.length = length2;
    }

    @NotNull
    @Provides
    public final getRightButtonIconView.length setMin() {
        return this.length;
    }

    @NotNull
    @Provides
    public final getRightButtonIconView.setMax setMin(@NotNull clearTransientStateViews cleartransientstateviews) {
        Intrinsics.checkNotNullParameter(cleartransientstateviews, "presenter");
        return cleartransientstateviews;
    }
}
