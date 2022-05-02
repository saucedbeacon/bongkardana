package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.globalsearch.GlobalSearchModule;
import id.dana.contract.homeinfo.HomeInfoModule;
import id.dana.contract.inbox.UnreadInboxModule;
import id.dana.contract.ott.OttVerifyModule;
import id.dana.contract.payasset.QueryPayMethodModule;
import id.dana.contract.permission.PermissionStateModule;
import id.dana.contract.user.GetBalanceModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.GeofenceModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.HomeReferralModule;
import id.dana.di.modules.LogoutModule;
import id.dana.di.modules.MissionSummaryModule;
import id.dana.explore.popularplaces.PopularPlacesModule;
import id.dana.explore.view.ExploreDanaFragment;
import id.dana.home.HomeFragment;
import id.dana.home.NewHomeFragment;
import id.dana.richview.homereferral.HomeReferralView;
import id.dana.sendmoney.di.module.SendMoneyV2Module;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/ExploreDanaFragmentComponent;", "", "inject", "", "exploreDanaFragment", "Lid/dana/explore/view/ExploreDanaFragment;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {DeepLinkModule.class, GlobalSearchModule.class, PopularPlacesModule.class})
public interface GriverResourceLoadExtension {

    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {GetBalanceModule.class, UnreadInboxModule.class, PermissionStateModule.class, QueryPayMethodModule.class, HomeInfoModule.class, BottomSheetOnBoardingModule.class, GeofenceModule.class, GlobalNetworkModule.class, LogoutModule.class, OttVerifyModule.class, GlobalSearchModule.class, SendMoneyV2Module.class})
    /* renamed from: o.GriverResourceLoadExtension$1  reason: invalid class name */
    public interface AnonymousClass1 {
        void getMax(NewHomeFragment newHomeFragment);

        void setMin(HomeFragment homeFragment);
    }

    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {HomeReferralModule.class, DeepLinkModule.class, MissionSummaryModule.class})
    /* renamed from: o.GriverResourceLoadExtension$2  reason: invalid class name */
    public interface AnonymousClass2 {
        void getMax(HomeReferralView homeReferralView);
    }

    void setMax(@NotNull ExploreDanaFragment exploreDanaFragment);
}
