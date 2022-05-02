package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultEmbedViewManager;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/data/globalsearch/source/GlobalSearchEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/globalsearch/GlobalSearchEntityData;", "networkGlobalSearchEntityData", "Lid/dana/data/globalsearch/source/network/NetworkGlobalSearchEntityData;", "(Lid/dana/data/globalsearch/source/network/NetworkGlobalSearchEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setShouldResumeWebView extends uncheckItems<DefaultEmbedViewManager.Render> {
    public final SplashView setMin;

    @Inject
    public setShouldResumeWebView(@NotNull SplashView splashView) {
        Intrinsics.checkNotNullParameter(splashView, "networkGlobalSearchEntityData");
        this.setMin = splashView;
    }

    public final /* bridge */ /* synthetic */ Object createData(String str) {
        return this.setMin;
    }
}
