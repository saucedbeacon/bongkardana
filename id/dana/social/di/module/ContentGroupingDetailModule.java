package id.dana.social.di.module;

import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.AUHorizontalListView;
import o.setLeftButtonUnicode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\u0003H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lid/dana/social/di/module/ContentGroupingDetailModule;", "", "view", "Lid/dana/social/contract/ContentGroupingDetailContract$View;", "(Lid/dana/social/contract/ContentGroupingDetailContract$View;)V", "provideContentGroupingDetailPresenter", "Lid/dana/social/contract/ContentGroupingDetailContract$Presenter;", "presenter", "Lid/dana/social/presenter/ContentGroupingDetailPresenter;", "provideContentGroupingDetailView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class ContentGroupingDetailModule {
    private final setLeftButtonUnicode.setMin setMin;

    public ContentGroupingDetailModule(@NotNull setLeftButtonUnicode.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "view");
        this.setMin = setmin;
    }

    @NotNull
    @Provides
    public final setLeftButtonUnicode.setMin length() {
        return this.setMin;
    }

    @NotNull
    @Provides
    public final setLeftButtonUnicode.length getMin(@NotNull AUHorizontalListView.ListItemAccessibilityDelegate listItemAccessibilityDelegate) {
        Intrinsics.checkNotNullParameter(listItemAccessibilityDelegate, "presenter");
        return listItemAccessibilityDelegate;
    }
}
