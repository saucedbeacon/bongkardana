package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.ocr.PreprocessingAndOcrContract;
import id.dana.ocr.PreprocessingAndOcrPresenter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IRedDotManager;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u0003H\u0001¢\u0006\u0002\b\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/di/modules/PreprocessingAndOcrModule;", "", "view", "Lid/dana/ocr/PreprocessingAndOcrContract$View;", "(Lid/dana/ocr/PreprocessingAndOcrContract$View;)V", "provideCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "provideCompositeDisposable$app_productionRelease", "providePresenter", "Lid/dana/ocr/PreprocessingAndOcrContract$Presenter;", "presenter", "Lid/dana/ocr/PreprocessingAndOcrPresenter;", "providePresenter$app_productionRelease", "provideView", "provideView$app_productionRelease", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class PreprocessingAndOcrModule {
    private final PreprocessingAndOcrContract.View setMin;

    public PreprocessingAndOcrModule(@NotNull PreprocessingAndOcrContract.View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.setMin = view;
    }

    @NotNull
    @Provides
    public final PreprocessingAndOcrContract.View length() {
        return this.setMin;
    }

    @NotNull
    @Provides
    public final IRedDotManager setMin() {
        return new IRedDotManager();
    }

    @NotNull
    @Provides
    public final PreprocessingAndOcrContract.Presenter setMax(@NotNull PreprocessingAndOcrPresenter preprocessingAndOcrPresenter) {
        Intrinsics.checkNotNullParameter(preprocessingAndOcrPresenter, "presenter");
        return preprocessingAndOcrPresenter;
    }
}
