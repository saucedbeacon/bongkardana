package id.dana.nearbyme.di.module;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AndroidWebView;
import o.addError;
import o.getPrimaryError;
import o.j;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyme/di/module/MerchantReviewFormModule;", "", "()V", "providePresenter", "Lid/dana/nearbyme/merchantreview/MerchantReviewFormContract$Presenter;", "formPresenter", "Lid/dana/nearbyme/merchantreview/MerchantReviewFormPresenter;", "provideReviewFormTracker", "Lid/dana/nearbyme/merchantreview/tracker/MerchantReviewFormAnalyticTracker;", "mixpanelTracker", "Lid/dana/nearbyme/merchantreview/tracker/MerchantReviewFormMixpanelTracker;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MerchantReviewFormModule {
    @NotNull
    @PerActivity
    @Provides
    public final j.AnonymousClass1.length setMax(@NotNull AndroidWebView androidWebView) {
        Intrinsics.checkNotNullParameter(androidWebView, "formPresenter");
        return androidWebView;
    }

    @NotNull
    @PerActivity
    @Provides
    public final addError getMin(@NotNull getPrimaryError getprimaryerror) {
        Intrinsics.checkNotNullParameter(getprimaryerror, "mixpanelTracker");
        return getprimaryerror;
    }
}
