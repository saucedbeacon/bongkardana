package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.SightCameraView;
import o.notifyMicError;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/di/modules/SavingCreateModule;", "", "view", "Lid/dana/savings/contract/SavingCreateContract$View;", "(Lid/dana/savings/contract/SavingCreateContract$View;)V", "provideSavingCreateView", "provideSavingPresenter", "Lid/dana/savings/contract/SavingCreateContract$Presenter;", "presenter", "Lid/dana/savings/presenter/SavingCreatePresenter;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class SavingCreateModule {
    private final notifyMicError.setMax getMax;

    public SavingCreateModule(@NotNull notifyMicError.setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "view");
        this.getMax = setmax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final notifyMicError.setMax getMax() {
        return this.getMax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final notifyMicError.getMin setMax(@NotNull SightCameraView.APTakePictureListener aPTakePictureListener) {
        Intrinsics.checkNotNullParameter(aPTakePictureListener, "presenter");
        return aPTakePictureListener;
    }
}
