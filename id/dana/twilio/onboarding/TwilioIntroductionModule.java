package id.dana.twilio.onboarding;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarExtension;
import o.showBackHome;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/twilio/onboarding/TwilioIntroductionModule;", "", "view", "Lid/dana/twilio/onboarding/TwilioIntroductionContract$View;", "(Lid/dana/twilio/onboarding/TwilioIntroductionContract$View;)V", "providePresenter", "Lid/dana/twilio/onboarding/TwilioIntroductionContract$Presenter;", "twilioIntroductionPresenter", "Lid/dana/twilio/onboarding/TwilioIntroductionPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class TwilioIntroductionModule {
    private final TitleBarExtension.AnonymousClass1.length setMax;

    public TwilioIntroductionModule(@NotNull TitleBarExtension.AnonymousClass1.length length) {
        Intrinsics.checkNotNullParameter(length, "view");
        this.setMax = length;
    }

    @NotNull
    @PerActivity
    @Provides
    public final TitleBarExtension.AnonymousClass1.length setMin() {
        return this.setMax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final TitleBarExtension.AnonymousClass1.getMin length(@NotNull showBackHome showbackhome) {
        Intrinsics.checkNotNullParameter(showbackhome, "twilioIntroductionPresenter");
        return showbackhome;
    }
}
