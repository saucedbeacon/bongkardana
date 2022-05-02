package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import id.dana.contract.payasset.QueryPayMethodModule;
import id.dana.contract.staticqr.GetStaticQrModule;
import id.dana.contract.user.GetBalanceModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.ChangePhoneNumberH5EventModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.InvestmentModule;
import id.dana.di.modules.MissionSummaryModule;
import id.dana.di.modules.MoreForYouModule;
import id.dana.di.modules.MyProfileModule;
import id.dana.di.modules.SavingModule;
import id.dana.di.modules.UserStatementModule;
import id.dana.myprofile.MyProfileFragment;
import id.dana.promoquest.views.MissionSummaryView;
import id.dana.richview.moreforyou.MoreForYouView;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/MoreForYouComponent;", "", "inject", "", "view", "Lid/dana/richview/moreforyou/MoreForYouView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MoreForYouModule.class, DeepLinkModule.class})
public interface SubPackageDownloader {

    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MissionSummaryModule.class})
    /* renamed from: o.SubPackageDownloader$1  reason: invalid class name */
    public interface AnonymousClass1 {
        void getMax(MissionSummaryView missionSummaryView);
    }

    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MyProfileModule.class, GetBalanceModule.class, GetStaticQrModule.class, GenerateDeepLinkModule.class, ChangePhoneNumberH5EventModule.class, QueryPayMethodModule.class, BottomSheetOnBoardingModule.class, GlobalNetworkModule.class, UserStatementModule.class, SavingModule.class, InvestmentModule.class})
    public interface Callback {
        void getMin(MyProfileFragment myProfileFragment);
    }

    void setMax(@NotNull MoreForYouView moreForYouView);
}
