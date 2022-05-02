package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.SightCameraView;
import o.enableEventbus;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/di/modules/SavingDetailModule;", "", "view", "Lid/dana/savings/contract/SavingDetailContract$View;", "(Lid/dana/savings/contract/SavingDetailContract$View;)V", "provideSavingDetailPresenter", "Lid/dana/savings/contract/SavingDetailContract$Presenter;", "presenter", "Lid/dana/savings/presenter/SavingDetailPresenter;", "provideSavingDetailView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class SavingDetailModule {
    private final enableEventbus.setMax length;

    public SavingDetailModule(@NotNull enableEventbus.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "view");
        this.length = setmax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final enableEventbus.setMax getMin() {
        return this.length;
    }

    @NotNull
    @PerActivity
    @Provides
    public final enableEventbus.getMin getMin(@NotNull SightCameraView.BufferType bufferType) {
        Intrinsics.checkNotNullParameter(bufferType, "presenter");
        return bufferType;
    }
}
