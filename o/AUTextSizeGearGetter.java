package o;

import dagger.Subcomponent;
import id.dana.di.PerModule;
import id.dana.social.di.module.SocialWidgetModule;
import id.dana.social.view.NewSocialWidgetView;
import id.dana.social.view.SocialWidgetView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lid/dana/social/di/component/SocialWidgetComponent;", "", "inject", "", "socialWidgetView", "Lid/dana/social/view/SocialWidgetView;", "injectNewSocialWidget", "Lid/dana/social/view/NewSocialWidgetView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Subcomponent(modules = {SocialWidgetModule.class})
@PerModule
public interface AUTextSizeGearGetter {
    void getMin(@NotNull NewSocialWidgetView newSocialWidgetView);

    void length(@NotNull SocialWidgetView socialWidgetView);
}
