package o;

import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.EngineInitFailedPoint;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/geocode/repository/source/GeocodeEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/geocode/repository/source/GeocodeEntityData;", "networkGeocodeEntityData", "Lid/dana/data/here/source/network/NetworkHereGeocodeEntityData;", "localGeocodeEntityData", "Lid/dana/data/geocode/repository/source/local/LocalGeocodeEntityData;", "(Lid/dana/data/here/source/network/NetworkHereGeocodeEntityData;Lid/dana/data/geocode/repository/source/local/LocalGeocodeEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EngineInitSuccessPoint extends uncheckItems<onInitSuccess> {
    private final EngineInitFailedPoint.AnonymousClass2 localGeocodeEntityData;
    private final getSelectedColor networkGeocodeEntityData;

    @Inject
    public EngineInitSuccessPoint(@NotNull getSelectedColor getselectedcolor, @NotNull EngineInitFailedPoint.AnonymousClass2 r3) {
        Intrinsics.checkNotNullParameter(getselectedcolor, "networkGeocodeEntityData");
        Intrinsics.checkNotNullParameter(r3, "localGeocodeEntityData");
        this.networkGeocodeEntityData = getselectedcolor;
        this.localGeocodeEntityData = r3;
    }

    @NotNull
    public final onInitSuccess createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        int hashCode = str.hashCode();
        if (hashCode != 103145323) {
            if (hashCode == 1843485230 && str.equals("network")) {
                return this.networkGeocodeEntityData;
            }
        } else if (str.equals("local")) {
            return this.localGeocodeEntityData;
        }
        return this.localGeocodeEntityData;
    }
}
