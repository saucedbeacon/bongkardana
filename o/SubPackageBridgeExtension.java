package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.MerchantDetailReviewModule;
import id.dana.di.modules.MerchantLatestReviewModule;
import id.dana.di.modules.MerchantManagementModule;
import id.dana.merchantmanagement.view.MerchantManagementActivity;
import id.dana.myprofile.ShareQrDialog;
import id.dana.nearbyme.merchantdetail.merchantreviewdetail.MerchantReviewDetailActivity;
import id.dana.nearbyme.merchantdetail.viewcomponent.MerchantLatestReviewView;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/MerchantDetailReviewComponent;", "", "inject", "", "merchantReviewDetailActivity", "Lid/dana/nearbyme/merchantdetail/merchantreviewdetail/MerchantReviewDetailActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MerchantDetailReviewModule.class})
public interface SubPackageBridgeExtension {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/MerchantLatestReviewComponent;", "", "inject", "", "merchantLatestReviewView", "Lid/dana/nearbyme/merchantdetail/viewcomponent/MerchantLatestReviewView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MerchantLatestReviewModule.class})
    /* renamed from: o.SubPackageBridgeExtension$2  reason: invalid class name */
    public interface AnonymousClass2 {
        void getMin(@NotNull MerchantLatestReviewView merchantLatestReviewView);
    }

    public final class ResultDispatchFuture implements RedDotManager {
        private final ShareQrDialog getMax;

        public ResultDispatchFuture(ShareQrDialog shareQrDialog) {
            this.getMax = shareQrDialog;
        }

        public final void accept(Object obj) {
            ShareQrDialog.getMin(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/MerchantManagementComponent;", "", "inject", "", "merchantManagementActivity", "Lid/dana/merchantmanagement/view/MerchantManagementActivity;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MerchantManagementModule.class})
    public interface a {
        void getMin(@NotNull MerchantManagementActivity merchantManagementActivity);
    }

    void getMax(@NotNull MerchantReviewDetailActivity merchantReviewDetailActivity);
}
