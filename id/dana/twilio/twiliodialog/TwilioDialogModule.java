package id.dana.twilio.twiliodialog;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.MultilevelSelectActivity;
import o.MultilevelSelectAdapter;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/twilio/twiliodialog/TwilioDialogModule;", "", "view", "Lid/dana/twilio/twiliodialog/TwilioDialogContract$View;", "(Lid/dana/twilio/twiliodialog/TwilioDialogContract$View;)V", "providePresenter", "Lid/dana/twilio/twiliodialog/TwilioDialogContract$Presenter;", "twilioDialogPresenter", "Lid/dana/twilio/twiliodialog/TwilioDialogPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class TwilioDialogModule {
    private final MultilevelSelectActivity.AnonymousClass1.setMin setMax;

    public TwilioDialogModule(@NotNull MultilevelSelectActivity.AnonymousClass1.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.setMax = setmin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final MultilevelSelectActivity.AnonymousClass1.setMin getMax() {
        return this.setMax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final MultilevelSelectActivity.AnonymousClass1.length setMin(@NotNull MultilevelSelectAdapter multilevelSelectAdapter) {
        Intrinsics.checkNotNullParameter(multilevelSelectAdapter, "twilioDialogPresenter");
        return multilevelSelectAdapter;
    }
}
