package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.globalsearch.GlobalSearchModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.globalsearch.view.GlobalSearchFragment;
import kotlin.Metadata;
import o.GriverManifest;
import o.PrepareException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lid/dana/di/component/GlobalSearchComponent;", "", "inject", "", "globalSearchFragment", "Lid/dana/globalsearch/view/GlobalSearchFragment;", "seeAllFragment", "Lid/dana/globalsearch/view/SeeAllFragment;", "globalSearchHintView", "Lid/dana/globalsearch/view/widget/GlobalSearchHintView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {GlobalSearchModule.class, PlayStoreReviewModules.class, CheckoutH5EventModule.class, BottomSheetOnBoardingModule.class, DeepLinkModule.class})
public interface closeAppMonitor {
    void setMax(@NotNull GlobalSearchFragment globalSearchFragment);

    void setMin(@NotNull GriverManifest.AnonymousClass14 r1);
}
