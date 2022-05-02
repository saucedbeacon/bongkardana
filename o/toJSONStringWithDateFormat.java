package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.PromoBannerModule;
import id.dana.richview.PromoBannerView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PromoBannerModule.class})
public interface toJSONStringWithDateFormat {
    void getMax(PromoBannerView promoBannerView);
}
