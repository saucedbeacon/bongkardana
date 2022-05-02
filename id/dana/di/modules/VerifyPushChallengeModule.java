package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import id.dana.di.PerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.onOptionPicked;
import o.onPanelDragged;
import o.setShadowDrawable;
import o.showTwoWheelDialog;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/di/modules/VerifyPushChallengeModule;", "", "view", "Lid/dana/challenge/verifypush/VerifyPushContract$View;", "(Lid/dana/challenge/verifypush/VerifyPushContract$View;)V", "provideAnalyticTracker", "Lid/dana/twilio/tracker/TwilioAnalyticTracker;", "twilioMixpanelTracker", "Lid/dana/twilio/tracker/TwilioMixpanelTracker;", "providePresenter", "Lid/dana/challenge/verifypush/VerifyPushContract$Presenter;", "verifyPushLoginPresenter", "Lid/dana/challenge/verifypush/VerifyPushLoginPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class VerifyPushChallengeModule {
    private final setShadowDrawable.setMin length;

    public VerifyPushChallengeModule(@NotNull setShadowDrawable.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.length = setmin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final setShadowDrawable.setMin setMax() {
        return this.length;
    }

    @NotNull
    @PerActivity
    @Provides
    public final setShadowDrawable.getMax getMin(@NotNull onPanelDragged onpaneldragged) {
        Intrinsics.checkNotNullParameter(onpaneldragged, "verifyPushLoginPresenter");
        return onpaneldragged;
    }

    @NotNull
    @PerModule
    @Provides
    public final onOptionPicked setMax(@NotNull showTwoWheelDialog showtwowheeldialog) {
        Intrinsics.checkNotNullParameter(showtwowheeldialog, "twilioMixpanelTracker");
        return showtwowheeldialog;
    }
}
