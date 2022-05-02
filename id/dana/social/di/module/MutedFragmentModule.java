package id.dana.social.di.module;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.setOnBackListener;
import o.shouldRecycleViewType;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lid/dana/social/di/module/MutedFragmentModule;", "", "view", "Lid/dana/social/contract/MutedFragmentContract$View;", "(Lid/dana/social/contract/MutedFragmentContract$View;)V", "getView", "()Lid/dana/social/contract/MutedFragmentContract$View;", "providePresenter", "Lid/dana/social/contract/MutedFragmentContract$Presenter;", "presenter", "Lid/dana/social/presenter/MutedFragmentPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class MutedFragmentModule {
    @NotNull
    private final setOnBackListener.length setMin;

    public MutedFragmentModule(@NotNull setOnBackListener.length length) {
        Intrinsics.checkNotNullParameter(length, "view");
        this.setMin = length;
    }

    @NotNull
    @Provides
    public final setOnBackListener.setMax getMin(@NotNull shouldRecycleViewType shouldrecycleviewtype) {
        Intrinsics.checkNotNullParameter(shouldrecycleviewtype, "presenter");
        return shouldrecycleviewtype;
    }

    @NotNull
    @Provides
    public final setOnBackListener.length length() {
        return this.setMin;
    }
}
