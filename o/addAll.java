package o;

import dagger.Component;
import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import id.dana.contract.staticqr.GetStaticQrModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.RequestMoneyQrModule;
import id.dana.requestmoney.balance.RequestMoneyBalanceQrCardFragment;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RequestMoneyQrModule.class, GetStaticQrModule.class, GenerateDeepLinkModule.class})
public interface addAll {
    void setMax(RequestMoneyBalanceQrCardFragment requestMoneyBalanceQrCardFragment);
}
