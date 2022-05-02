package id.dana.contract.services;

import dagger.Module;
import dagger.Provides;
import id.dana.model.ThirdPartyService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.internal.Intrinsics;
import o.BindInt;
import o.style;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/contract/services/ServicesModule;", "", "view", "Lid/dana/contract/services/ServicesContract$View;", "(Lid/dana/contract/services/ServicesContract$View;)V", "providePresenter", "Lid/dana/contract/services/ServicesContract$Presenter;", "presenter", "Lid/dana/contract/services/ServicesPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class ServicesModule {
    private final style.getMin setMax;

    public ServicesModule() {
        this((byte) 0);
    }

    public /* synthetic */ ServicesModule(byte b) {
        this((style.getMin) new style.getMin() {
            @JvmDefault
            public final void dismissProgress() {
            }

            @JvmDefault
            public final void getMax(@NotNull ThirdPartyService thirdPartyService) {
                Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            }

            @JvmDefault
            public final void getMax(@NotNull ThirdPartyService thirdPartyService, @NotNull String str) {
                Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
                Intrinsics.checkNotNullParameter(str, "authCode");
            }

            @JvmDefault
            public final void getMax(@NotNull List<ThirdPartyService> list) {
                Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
            }

            @JvmDefault
            public final void getMin(@NotNull List<ThirdPartyService> list) {
                Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
            }

            @JvmDefault
            public final void length() {
            }

            @JvmDefault
            public final void onError(@Nullable String str) {
            }

            @JvmDefault
            public final void setMax(@NotNull List<ThirdPartyService> list) {
                Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
            }

            @JvmDefault
            public final void setMax(boolean z) {
            }

            @JvmDefault
            public final void setMin() {
            }

            @JvmDefault
            public final void setMin(@NotNull ThirdPartyService thirdPartyService) {
                Intrinsics.checkNotNullParameter(thirdPartyService, "thirdPartyService");
            }

            @JvmDefault
            public final void setMin(@NotNull List<ThirdPartyService> list) {
                Intrinsics.checkNotNullParameter(list, "thirdPartyServices");
            }

            @JvmDefault
            public final void showProgress() {
            }
        });
    }

    public ServicesModule(@NotNull style.getMin getmin) {
        Intrinsics.checkNotNullParameter(getmin, "view");
        this.setMax = getmin;
    }

    @NotNull
    @Provides
    public final style.getMin length() {
        return this.setMax;
    }

    @NotNull
    @Provides
    public final style.length setMax(@NotNull BindInt bindInt) {
        Intrinsics.checkNotNullParameter(bindInt, "presenter");
        return bindInt;
    }
}
