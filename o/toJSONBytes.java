package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.PromoCenterModule;
import id.dana.promocenter.views.PromoCenterActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PromoCenterModule.class, DeepLinkModule.class})
public interface toJSONBytes {
    void length(PromoCenterActivity promoCenterActivity);
}
