package id.dana.social.di.module;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getTitleText;
import o.markChildrenDirty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/social/di/module/RelationshipBottomSheetModule;", "", "view", "Lid/dana/social/contract/RelationshipBottomSheetContract$View;", "(Lid/dana/social/contract/RelationshipBottomSheetContract$View;)V", "providePresenter", "Lid/dana/social/contract/RelationshipBottomSheetContract$Presenter;", "presenter", "Lid/dana/social/presenter/RelationshipBottomSheetPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class RelationshipBottomSheetModule {
    private final getTitleText.length getMin;

    public RelationshipBottomSheetModule(@NotNull getTitleText.length length) {
        Intrinsics.checkNotNullParameter(length, "view");
        this.getMin = length;
    }

    @NotNull
    @Provides
    public final getTitleText.length setMax() {
        return this.getMin;
    }

    @NotNull
    @Provides
    public final getTitleText.getMin length(@NotNull markChildrenDirty markchildrendirty) {
        Intrinsics.checkNotNullParameter(markchildrendirty, "presenter");
        return markchildrendirty;
    }
}
