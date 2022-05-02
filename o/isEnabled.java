package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.MerchantModule;
import id.dana.nearbyme.summary.MerchantListView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MerchantModule.class})
public interface isEnabled {
    void getMin(MerchantListView merchantListView);
}
