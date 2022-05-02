package o;

import id.dana.data.Source;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.b;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/data/geocode/repository/config/GeocodeConfigEntityDataFactory;", "Lid/dana/data/AbstractEntityDataFactory;", "Lid/dana/data/geocode/repository/config/GeocodeConfigEntityData;", "splitGeocodeConfigEntityData", "Lid/dana/data/geocode/repository/config/split/SplitGeocodeConfigEntityData;", "localGeocodeConfigEntityData", "Lid/dana/data/geocode/repository/config/local/LocalGeocodeConfigEntityData;", "(Lid/dana/data/geocode/repository/config/split/SplitGeocodeConfigEntityData;Lid/dana/data/geocode/repository/config/local/LocalGeocodeConfigEntityData;)V", "createData", "source", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class EngineInitFailedPoint extends uncheckItems<CreatePromptParam> {
    private final compare localGeocodeConfigEntityData;
    private final onEngineInitFailed splitGeocodeConfigEntityData;

    public final class Action implements getAdapterPosition<onEngineInitFailed> {
        private final b.C0007b<UpdateAppCallback> splitFacadeProvider;

        public Action(b.C0007b<UpdateAppCallback> bVar) {
            this.splitFacadeProvider = bVar;
        }

        public final onEngineInitFailed get() {
            return newInstance(this.splitFacadeProvider.get());
        }

        public static Action create(b.C0007b<UpdateAppCallback> bVar) {
            return new Action(bVar);
        }

        public static onEngineInitFailed newInstance(UpdateAppCallback updateAppCallback) {
            return new onEngineInitFailed(updateAppCallback);
        }
    }

    @Inject
    public EngineInitFailedPoint(@NotNull onEngineInitFailed onengineinitfailed, @NotNull compare compare) {
        Intrinsics.checkNotNullParameter(onengineinitfailed, "splitGeocodeConfigEntityData");
        Intrinsics.checkNotNullParameter(compare, "localGeocodeConfigEntityData");
        this.splitGeocodeConfigEntityData = onengineinitfailed;
        this.localGeocodeConfigEntityData = compare;
    }

    @NotNull
    public final CreatePromptParam createData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "source");
        if (str.hashCode() == 109648666 && str.equals(Source.SPLIT)) {
            return this.splitGeocodeConfigEntityData;
        }
        return this.localGeocodeConfigEntityData;
    }
}
