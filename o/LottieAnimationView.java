package o;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/autoroute/repository/source/AutoRouteDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/autoroute/repository/AutoRouteEntityData;", "networkAutoRouteEntityData", "Lid/dana/data/autoroute/repository/source/network/NetworkAutoRouteEntityData;", "mockAutoRouteEntityData", "Lid/dana/data/autoroute/repository/source/mock/MockAutoRouteEntityData;", "(Lid/dana/data/autoroute/repository/source/network/NetworkAutoRouteEntityData;Lid/dana/data/autoroute/repository/source/mock/MockAutoRouteEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LottieAnimationView extends uncheckItems<onVisibilityChanged> {
    private final setComposition mockAutoRouteEntityData;
    private final hasMasks networkAutoRouteEntityData;

    @Inject
    public LottieAnimationView(@NotNull hasMasks hasmasks, @NotNull setComposition setcomposition) {
        Intrinsics.checkNotNullParameter(hasmasks, "networkAutoRouteEntityData");
        Intrinsics.checkNotNullParameter(setcomposition, "mockAutoRouteEntityData");
        this.networkAutoRouteEntityData = hasmasks;
        this.mockAutoRouteEntityData = setcomposition;
    }

    @NotNull
    public final onVisibilityChanged createData(@Nullable String str) {
        if (str != null && str.hashCode() == 1843485230 && str.equals("network")) {
            return this.networkAutoRouteEntityData;
        }
        return this.mockAutoRouteEntityData;
    }

    public class SavedState extends setSpeed<List<getExtensionManager>, List<setDownloadListener>> {
        /* access modifiers changed from: protected */
        public List<setDownloadListener> map(List<getExtensionManager> list) {
            ArrayList arrayList = new ArrayList();
            for (getExtensionManager transfrom : list) {
                arrayList.add(transfrom(transfrom));
            }
            return arrayList;
        }

        private setDownloadListener transfrom(getExtensionManager getextensionmanager) {
            if (getextensionmanager == null) {
                return null;
            }
            setDownloadListener setdownloadlistener = new setDownloadListener();
            setdownloadlistener.setExpiryNumber(getextensionmanager.getExpiryNumber());
            setdownloadlistener.setExpiryUnit(getextensionmanager.getExpiryUnit());
            setdownloadlistener.setExpiryDefault(getextensionmanager.isExpiryDefault());
            return setdownloadlistener;
        }
    }
}
