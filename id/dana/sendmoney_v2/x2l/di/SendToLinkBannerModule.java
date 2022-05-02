package id.dana.sendmoney_v2.x2l.di;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.PhotoBrowseView;
import o.access$2602;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/sendmoney_v2/x2l/di/SendToLinkBannerModule;", "", "view", "Lid/dana/sendmoney_v2/x2l/contract/SendToLinkBannerContract$View;", "(Lid/dana/sendmoney_v2/x2l/contract/SendToLinkBannerContract$View;)V", "providePresenter", "Lid/dana/sendmoney_v2/x2l/contract/SendToLinkBannerContract$Presenter;", "presenter", "Lid/dana/sendmoney_v2/x2l/contract/SendToLinkBannerPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class SendToLinkBannerModule {
    private final access$2602.setMin getMin;

    public SendToLinkBannerModule(@NotNull access$2602.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.getMin = setmin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final access$2602.setMin getMin() {
        return this.getMin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final access$2602.length getMin(@NotNull PhotoBrowseView.AnonymousClass4 r2) {
        Intrinsics.checkNotNullParameter(r2, "presenter");
        return r2;
    }
}
