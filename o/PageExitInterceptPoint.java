package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/geofence/repository/source/GeoFenceDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/geofence/repository/GeoFenceEntityData;", "networkPoiEntityData", "Lid/dana/data/geofence/repository/source/network/NetworkPoiEntityData;", "localPoiEntityData", "Lid/dana/data/geofence/repository/source/cache/LocalPoiEntityData;", "(Lid/dana/data/geofence/repository/source/network/NetworkPoiEntityData;Lid/dana/data/geofence/repository/source/cache/LocalPoiEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PageExitInterceptPoint extends uncheckItems<interceptPageExit> {
    private final PageExitPoint localPoiEntityData;
    private final onPageInit networkPoiEntityData;

    @Inject
    public PageExitInterceptPoint(@NotNull onPageInit onpageinit, @NotNull PageExitPoint pageExitPoint) {
        Intrinsics.checkNotNullParameter(onpageinit, "networkPoiEntityData");
        Intrinsics.checkNotNullParameter(pageExitPoint, "localPoiEntityData");
        this.networkPoiEntityData = onpageinit;
        this.localPoiEntityData = pageExitPoint;
    }

    @NotNull
    public final interceptPageExit createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        int hashCode = str.hashCode();
        if (hashCode != 103145323) {
            if (hashCode == 1843485230 && str.equals("network")) {
                return this.networkPoiEntityData;
            }
        } else if (str.equals("local")) {
            return this.localPoiEntityData;
        }
        return this.networkPoiEntityData;
    }
}
