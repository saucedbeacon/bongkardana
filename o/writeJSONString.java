package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.PromoClaimModule;
import id.dana.richview.promoclaim.PromoClaimView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PromoClaimModule.class})
public interface writeJSONString {
    void getMin(PromoClaimView promoClaimView);
}
