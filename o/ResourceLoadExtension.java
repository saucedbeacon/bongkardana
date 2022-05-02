package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.InvestmentModule;
import id.dana.di.modules.IpgModule;
import id.dana.di.modules.KycAmlEddModule;
import id.dana.di.modules.LazadaModule;
import id.dana.home.KycAmlEddActivity;
import id.dana.investment.view.HomeInvestmentView;
import id.dana.ipg.IpgGuideActivity;
import id.dana.lazada.LazadaGuideActivity;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/IpgComponent;", "", "inject", "", "ipgGuideActivity", "Lid/dana/ipg/IpgGuideActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {IpgModule.class})
public interface ResourceLoadExtension {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/InvestmentComponent;", "", "inject", "", "homeInvestmentView", "Lid/dana/investment/view/HomeInvestmentView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {InvestmentModule.class})
    /* renamed from: o.ResourceLoadExtension$1  reason: invalid class name */
    public interface AnonymousClass1 {
        void setMax(@NotNull HomeInvestmentView homeInvestmentView);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/KycAmlEddActivityComponent;", "", "inject", "", "kycAmlEddActivity", "Lid/dana/home/KycAmlEddActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {KycAmlEddModule.class})
    /* renamed from: o.ResourceLoadExtension$2  reason: invalid class name */
    public interface AnonymousClass2 {
        void setMax(@NotNull KycAmlEddActivity kycAmlEddActivity);
    }

    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {LazadaModule.class})
    /* renamed from: o.ResourceLoadExtension$3  reason: invalid class name */
    public interface AnonymousClass3 {
        void getMax(LazadaGuideActivity lazadaGuideActivity);
    }

    void setMin(@NotNull IpgGuideActivity ipgGuideActivity);
}
