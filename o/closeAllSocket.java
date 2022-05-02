package o;

import dagger.Component;
import id.dana.contract.payasset.QueryPayMethodModule;
import id.dana.contract.payqr.GetPaymentResultModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.pay.PayActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {GetPaymentResultModule.class, QueryPayMethodModule.class, PayQrModule.class, OfflinePayModule.class, PlayStoreReviewModules.class, GlobalNetworkModule.class})
public interface closeAllSocket {
    void setMin(PayActivity payActivity);
}
