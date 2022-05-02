package o;

import dagger.Component;
import id.dana.challenge.pin.PinChallengeFragment;
import id.dana.di.PerActivity;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.PinChallengeModule;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PinChallengeModule.class, AuthenticationModule.class})
public interface ConnectSocketInterceptPoint {
    void setMax(PinChallengeFragment pinChallengeFragment);
}
