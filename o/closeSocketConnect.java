package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.PaymentAuthenticationModule;
import id.dana.richview.profile.paymentauth.PaymentAuthenticationView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PaymentAuthenticationModule.class})
public interface closeSocketConnect {
    void setMax(PaymentAuthenticationView paymentAuthenticationView);
}
