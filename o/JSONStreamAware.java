package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.SwitchFaceAuthenticationModule;
import id.dana.richview.profile.switchfaceauth.SwitchFaceAuthenticationView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SwitchFaceAuthenticationModule.class, AuthenticationModule.class})
public interface JSONStreamAware {
    void getMin(SwitchFaceAuthenticationView switchFaceAuthenticationView);
}
