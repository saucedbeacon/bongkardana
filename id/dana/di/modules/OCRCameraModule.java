package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import id.dana.ocr.OCRCameraContract;
import id.dana.ocr.OCRCameraPresenter;
import id.dana.ocr.model.OCRRequestModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0001¢\u0006\u0002\b\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\b\rJ\r\u0010\u000e\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/di/modules/OCRCameraModule;", "", "view", "Lid/dana/ocr/OCRCameraContract$View;", "ocrRequestModel", "Lid/dana/ocr/model/OCRRequestModel;", "(Lid/dana/ocr/OCRCameraContract$View;Lid/dana/ocr/model/OCRRequestModel;)V", "provideOcrRequestModel", "provideOcrRequestModel$app_productionRelease", "providePresenter", "Lid/dana/ocr/OCRCameraContract$Presenter;", "presenter", "Lid/dana/ocr/OCRCameraPresenter;", "providePresenter$app_productionRelease", "provideView", "provideView$app_productionRelease", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class OCRCameraModule {
    private final OCRCameraContract.View getMax;
    private final OCRRequestModel getMin;

    public OCRCameraModule(@NotNull OCRCameraContract.View view, @Nullable OCRRequestModel oCRRequestModel) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.getMax = view;
        this.getMin = oCRRequestModel;
    }

    @NotNull
    @PerActivity
    @Provides
    public final OCRCameraContract.View getMin() {
        return this.getMax;
    }

    @PerActivity
    @Nullable
    @Provides
    public final OCRRequestModel setMax() {
        return this.getMin;
    }

    @NotNull
    @PerActivity
    @Provides
    public final OCRCameraContract.Presenter getMin(@NotNull OCRCameraPresenter oCRCameraPresenter) {
        Intrinsics.checkNotNullParameter(oCRCameraPresenter, "presenter");
        return oCRCameraPresenter;
    }
}
