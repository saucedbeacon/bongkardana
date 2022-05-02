package o;

import dagger.Component;
import id.dana.contract.payasset.ChangePayMethodModule;
import id.dana.contract.payqr.GetPaymentResultModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.contract.user.GetUserInfoModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.pay.BalancePayFragment;
import id.dana.pay.BalanceQrisPayFragment;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {GetPaymentResultModule.class, PayQrModule.class, GetUserInfoModule.class, ChangePayMethodModule.class, OfflinePayModule.class, GlobalNetworkModule.class})
public interface toReqMode {
    void getMax(BalancePayFragment balancePayFragment);

    void getMax(BalanceQrisPayFragment balanceQrisPayFragment);
}
