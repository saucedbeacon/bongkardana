package o;

import android.location.Location;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/domain/miniprogram/interactor/GetReverseGeocodeByLocation;", "Lid/dana/domain/core/usecase/BaseUseCase;", "Lid/dana/domain/miniprogram/model/Address;", "Lid/dana/domain/miniprogram/interactor/GetReverseGeocodeByLocation$Params;", "geocodeRepository", "Lid/dana/domain/geocode/GeocodeRepository;", "(Lid/dana/domain/geocode/GeocodeRepository;)V", "buildUseCase", "Lio/reactivex/Observable;", "params", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class RVFileAbilityProxy extends APWebChromeClient<processFacade, setMin> {
    private final APWebViewPerformance geocodeRepository;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public RVFileAbilityProxy(@NotNull APWebViewPerformance aPWebViewPerformance) {
        super((hasCornerMarking) null, (hasCornerMarking) null, 3, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(aPWebViewPerformance, "geocodeRepository");
        this.geocodeRepository = aPWebViewPerformance;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lid/dana/domain/miniprogram/interactor/GetReverseGeocodeByLocation$Params;", "", "location", "Landroid/location/Location;", "(Landroid/location/Location;)V", "getLocation$domain_release", "()Landroid/location/Location;", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        @NotNull
        public static final getMax Companion = new getMax((DefaultConstructorMarker) null);
        @NotNull
        private final Location location;

        @JvmStatic
        @NotNull
        public static final setMin create(@NotNull Location location2) {
            return Companion.create(location2);
        }

        private setMin(Location location2) {
            this.location = location2;
        }

        public /* synthetic */ setMin(Location location2, DefaultConstructorMarker defaultConstructorMarker) {
            this(location2);
        }

        @NotNull
        public final Location getLocation$domain_release() {
            return this.location;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lid/dana/domain/miniprogram/interactor/GetReverseGeocodeByLocation$Params$Companion;", "", "()V", "create", "Lid/dana/domain/miniprogram/interactor/GetReverseGeocodeByLocation$Params;", "location", "Landroid/location/Location;", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMax {
            private getMax() {
            }

            public /* synthetic */ getMax(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            public final setMin create(@NotNull Location location) {
                Intrinsics.checkNotNullParameter(location, "location");
                return new setMin(location, (DefaultConstructorMarker) null);
            }
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<processFacade> buildUseCase(@NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "params");
        return this.geocodeRepository.getReverseGeocodeByLoc(setmin.getLocation$domain_release());
    }
}
