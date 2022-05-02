package id.dana.contract.globalsearch;

import dagger.Module;
import dagger.Provides;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getRootAlpha;
import o.getTranslateY;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchBottomSheetModule;", "", "view", "Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$View;", "(Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$View;)V", "provideGlobalSeachBottomSheetPresenter", "Lid/dana/contract/globalsearch/GlobalSearchBottomSheetContract$Presenter;", "globalSearchBottomSheetPresenter", "Lid/dana/contract/globalsearch/GlobalSearchBottomSheetPresenter;", "provideGlobalSearchBottomSheetView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class GlobalSearchBottomSheetModule {
    private final getTranslateY.getMax length;

    public GlobalSearchBottomSheetModule(@NotNull getTranslateY.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "view");
        this.length = getmax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final getTranslateY.getMax getMax() {
        return this.length;
    }

    @NotNull
    @PerActivity
    @Provides
    public final getTranslateY.setMax setMax(@NotNull getRootAlpha getrootalpha) {
        Intrinsics.checkNotNullParameter(getrootalpha, "globalSearchBottomSheetPresenter");
        return getrootalpha;
    }
}
