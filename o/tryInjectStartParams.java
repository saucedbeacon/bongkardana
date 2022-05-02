package o;

import dagger.Component;
import id.dana.contract.payasset.ChangePayMethodModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.di.PerActivity;
import id.dana.pay.CardPayFragment;
import id.dana.pay.CardQrisPayFragment;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PayQrModule.class, ChangePayMethodModule.class, OfflinePayModule.class})
public interface tryInjectStartParams {
    void getMin(CardPayFragment cardPayFragment);

    void length(CardQrisPayFragment cardQrisPayFragment);
}
