package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.MixpanelEnableModule;
import id.dana.onboarding.IntroductionActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {MixpanelEnableModule.class})
public interface removeInvalidParams {
    void length(IntroductionActivity introductionActivity);
}
