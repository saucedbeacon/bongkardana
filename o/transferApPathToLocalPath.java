package o;

import android.location.Location;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetDistrictNameByLocation;", "Lid/dana/domain/UseCase;", "", "Lid/dana/domain/nearbyme/interactor/GetDistrictNameByLocation$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "geocodeRepository", "Lid/dana/domain/geocode/GeocodeRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/geocode/GeocodeRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class transferApPathToLocalPath extends parseFailed<String, setMax> {
    private final APWebViewPerformance geocodeRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public transferApPathToLocalPath(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull APWebViewPerformance aPWebViewPerformance) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(aPWebViewPerformance, "geocodeRepository");
        this.geocodeRepository = aPWebViewPerformance;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        return this.geocodeRepository.getDistrictNameByLocation(setmax.getLocation());
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lid/dana/domain/nearbyme/interactor/GetDistrictNameByLocation$Params;", "", "location", "Landroid/location/Location;", "(Landroid/location/Location;)V", "getLocation", "()Landroid/location/Location;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        private final Location location;

        public static /* synthetic */ setMax copy$default(setMax setmax, Location location2, int i, Object obj) {
            if ((i & 1) != 0) {
                location2 = setmax.location;
            }
            return setmax.copy(location2);
        }

        @NotNull
        public final Location component1() {
            return this.location;
        }

        @NotNull
        public final setMax copy(@NotNull Location location2) {
            Intrinsics.checkNotNullParameter(location2, "location");
            return new setMax(location2);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this != obj) {
                return (obj instanceof setMax) && Intrinsics.areEqual((Object) this.location, (Object) ((setMax) obj).location);
            }
            return true;
        }

        public final int hashCode() {
            Location location2 = this.location;
            if (location2 != null) {
                return location2.hashCode();
            }
            return 0;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(location=");
            sb.append(this.location);
            sb.append(")");
            return sb.toString();
        }

        public setMax(@NotNull Location location2) {
            Intrinsics.checkNotNullParameter(location2, "location");
            this.location = location2;
        }

        @NotNull
        public final Location getLocation() {
            return this.location;
        }
    }
}
