package id.dana.social.di.module;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.setRightButtonUnicode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lid/dana/social/di/module/BlockedFragmentModule;", "", "view", "Lid/dana/social/contract/BlockedFragmentContract$View;", "(Lid/dana/social/contract/BlockedFragmentContract$View;)V", "getView", "()Lid/dana/social/contract/BlockedFragmentContract$View;", "providePresenter", "Lid/dana/social/contract/BlockedFragmentContract$Presenter;", "presenter", "Lid/dana/social/presenter/BlockedFragmentPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class BlockedFragmentModule {
    @NotNull
    private final setRightButtonUnicode.length getMax;

    public BlockedFragmentModule(@NotNull setRightButtonUnicode.length length) {
        Intrinsics.checkNotNullParameter(length, "view");
        this.getMax = length;
    }

    @NotNull
    @Provides
    public final setRightButtonUnicode.getMin setMax(@NotNull AUHorizontalListView.PerformClick performClick) {
        Intrinsics.checkNotNullParameter(performClick, "presenter");
        return performClick;
    }

    @NotNull
    @Provides
    public final setRightButtonUnicode.length setMin() {
        return this.getMax;
    }
}
