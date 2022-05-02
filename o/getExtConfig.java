package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.NearbyMeModule;
import id.dana.nearbyme.NearbyMeView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {NearbyMeModule.class})
public interface getExtConfig {
    void getMin(NearbyMeView nearbyMeView);
}
