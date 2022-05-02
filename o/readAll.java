package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.login.HoldLoginModule;
import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.LogoutModule;
import id.dana.di.modules.MixpanelEnableModule;
import id.dana.di.modules.SplashModule;
import id.dana.onboarding.splash.SplashActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SplashModule.class, HoldLoginModule.class, DeepLinkModule.class, LogoutModule.class, FaceAuthPopUpConsultationModule.class, MixpanelEnableModule.class})
public interface readAll {
    void length(SplashActivity splashActivity);
}
