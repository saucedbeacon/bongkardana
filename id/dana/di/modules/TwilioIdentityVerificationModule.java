package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import id.dana.di.PerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.GriverPageContainer;
import o.TinyAppBackHomeExtension;
import o.onOptionPicked;
import o.showTwoWheelDialog;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/di/modules/TwilioIdentityVerificationModule;", "", "view", "Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract$View;", "(Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract$View;)V", "provideAnalyticTracker", "Lid/dana/twilio/tracker/TwilioAnalyticTracker;", "twilioMixpanelTracker", "Lid/dana/twilio/tracker/TwilioMixpanelTracker;", "providePresenter", "Lid/dana/twilio/identityverification/TwilioIdentityVerificationContract$Presenter;", "twilioIdentityVerificationPresenter", "Lid/dana/twilio/identityverification/TwilioIdentityVerificationPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class TwilioIdentityVerificationModule {
    private final GriverPageContainer.H5CloseHandler.setMin setMax;

    public TwilioIdentityVerificationModule(@NotNull GriverPageContainer.H5CloseHandler.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.setMax = setmin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final GriverPageContainer.H5CloseHandler.setMin length() {
        return this.setMax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final GriverPageContainer.H5CloseHandler.getMin setMax(@NotNull TinyAppBackHomeExtension tinyAppBackHomeExtension) {
        Intrinsics.checkNotNullParameter(tinyAppBackHomeExtension, "twilioIdentityVerificationPresenter");
        return tinyAppBackHomeExtension;
    }

    @NotNull
    @PerModule
    @Provides
    public final onOptionPicked setMin(@NotNull showTwoWheelDialog showtwowheeldialog) {
        Intrinsics.checkNotNullParameter(showtwowheeldialog, "twilioMixpanelTracker");
        return showtwowheeldialog;
    }
}
