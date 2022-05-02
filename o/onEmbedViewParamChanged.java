package o;

import android.location.Location;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001e\u001fB\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0014J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0003H\u0002J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010\u001b\u001a\u00020\u0017*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation;", "Lid/dana/domain/UseCase;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation$Params;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "postExecutionThread", "Lid/dana/domain/PostExecutionThread;", "geocodeRepository", "Lid/dana/domain/geocode/GeocodeRepository;", "(Lid/dana/domain/ThreadExecutor;Lid/dana/domain/PostExecutionThread;Lid/dana/domain/geocode/GeocodeRepository;)V", "buildUseCaseObservable", "Lio/reactivex/Observable;", "params", "compareWithLocal", "config", "Lid/dana/domain/geocode/model/GeocodeReverseConfig;", "localLocationSubdisivision", "Lid/dana/domain/geocode/model/LocationSubdisivision;", "getIndoSubdivision", "location", "Landroid/location/Location;", "shouldCallGoogleGeocodeAPI", "", "isGpsMockedForUnderLollipop", "getSubdivisionByDistanceDiffer", "getSubdivisionByTimeDiffer", "isAlreadyPast", "", "time", "Companion", "Params", "domain_release"}, k = 1, mv = {1, 4, 2})
public final class onEmbedViewParamChanged extends parseFailed<onUpdateResult, setMax> {
    @NotNull
    public static final length Companion = new length((DefaultConstructorMarker) null);
    public static final long HOUR_IN_MILLIS = 3600000;
    /* access modifiers changed from: private */
    public final APWebViewPerformance geocodeRepository;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "kotlin.jvm.PlatformType", "indoSubdivision", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<onUpdateResult, TitleBarRightButtonView.AnonymousClass4<? extends onUpdateResult>> {
        final /* synthetic */ onEmbedViewParamChanged length;
        final /* synthetic */ Location setMax;

        getMax(onEmbedViewParamChanged onembedviewparamchanged, Location location) {
            this.length = onembedviewparamchanged;
            this.setMax = location;
        }

        public final /* synthetic */ Object apply(Object obj) {
            onUpdateResult onupdateresult = (onUpdateResult) obj;
            Intrinsics.checkNotNullParameter(onupdateresult, "indoSubdivision");
            this.length.geocodeRepository.saveLatestSubdivisions(new GriverPerformanceStages(String.valueOf(this.setMax.getLatitude()), String.valueOf(this.setMax.getLongitude()), onupdateresult, System.currentTimeMillis())).blockingFirst();
            return TitleBarRightButtonView.AnonymousClass1.just(onupdateresult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "kotlin.jvm.PlatformType", "config", "Lid/dana/domain/geocode/model/GeocodeReverseConfig;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<H5BridgeContext, TitleBarRightButtonView.AnonymousClass4<? extends onUpdateResult>> {
        final /* synthetic */ onEmbedViewParamChanged setMax;
        final /* synthetic */ setMax setMin;

        getMin(onEmbedViewParamChanged onembedviewparamchanged, setMax setmax) {
            this.setMax = onembedviewparamchanged;
            this.setMin = setmax;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final H5BridgeContext h5BridgeContext = (H5BridgeContext) obj;
            Intrinsics.checkNotNullParameter(h5BridgeContext, "config");
            return this.setMax.geocodeRepository.getLatestSubdivisions().switchMap(new RedDotDrawable<GriverPerformanceStages, TitleBarRightButtonView.AnonymousClass4<? extends onUpdateResult>>(this) {
                final /* synthetic */ getMin setMin;

                {
                    this.setMin = r1;
                }

                public final /* synthetic */ Object apply(Object obj) {
                    TitleBarRightButtonView.AnonymousClass1 r4;
                    GriverPerformanceStages griverPerformanceStages = (GriverPerformanceStages) obj;
                    Intrinsics.checkNotNullParameter(griverPerformanceStages, "cachedIndoSubdivisions");
                    if (griverPerformanceStages.isEmpty()) {
                        r4 = this.setMin.setMax.getIndoSubdivision(this.setMin.setMin.getLocation$domain_release(), h5BridgeContext.getShouldCallGoogleGeocodeAPI(), this.setMin.setMin.isGpsMockedForUnderLollipop$domain_release());
                    } else {
                        onEmbedViewParamChanged onembedviewparamchanged = this.setMin.setMax;
                        H5BridgeContext h5BridgeContext = h5BridgeContext;
                        Intrinsics.checkNotNullExpressionValue(h5BridgeContext, "config");
                        r4 = onembedviewparamchanged.compareWithLocal(h5BridgeContext, griverPerformanceStages, this.setMin.setMin);
                    }
                    return r4;
                }
            });
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public onEmbedViewParamChanged(@NotNull appxLoadFailed appxloadfailed, @NotNull getScheme getscheme, @NotNull APWebViewPerformance aPWebViewPerformance) {
        super(appxloadfailed, getscheme);
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(getscheme, "postExecutionThread");
        Intrinsics.checkNotNullParameter(aPWebViewPerformance, "geocodeRepository");
        this.geocodeRepository = aPWebViewPerformance;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onUpdateResult> buildUseCaseObservable(@NotNull setMax setmax) {
        Intrinsics.checkNotNullParameter(setmax, "params");
        TitleBarRightButtonView.AnonymousClass1<R> switchMap = this.geocodeRepository.getGeocodeReverseConfig().switchMap(new getMin(this, setmax));
        Intrinsics.checkNotNullExpressionValue(switchMap, "geocodeRepository\n      …          }\n            }");
        return switchMap;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<onUpdateResult> compareWithLocal(H5BridgeContext h5BridgeContext, GriverPerformanceStages griverPerformanceStages, setMax setmax) {
        if (!setmax.getUseTimeDiffer$domain_release()) {
            return getSubdivisionByDistanceDiffer(setmax, griverPerformanceStages, h5BridgeContext);
        }
        return getSubdivisionByTimeDiffer(griverPerformanceStages, setmax, h5BridgeContext);
    }

    private final TitleBarRightButtonView.AnonymousClass1<onUpdateResult> getSubdivisionByTimeDiffer(GriverPerformanceStages griverPerformanceStages, setMax setmax, H5BridgeContext h5BridgeContext) {
        if (h5BridgeContext.getIntervalInHours() <= 0) {
            return getSubdivisionByDistanceDiffer(setmax, griverPerformanceStages, h5BridgeContext);
        }
        if (isAlreadyPast(griverPerformanceStages.getTimestamp(), h5BridgeContext.getIntervalInHours())) {
            return getIndoSubdivision(setmax.getLocation$domain_release(), h5BridgeContext.getShouldCallGoogleGeocodeAPI(), setmax.isGpsMockedForUnderLollipop$domain_release());
        }
        TitleBarRightButtonView.AnonymousClass1<onUpdateResult> just = TitleBarRightButtonView.AnonymousClass1.just(griverPerformanceStages.getIndoSubdivisions());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(localLoc…ivision.indoSubdivisions)");
        return just;
    }

    private final TitleBarRightButtonView.AnonymousClass1<onUpdateResult> getSubdivisionByDistanceDiffer(setMax setmax, GriverPerformanceStages griverPerformanceStages, H5BridgeContext h5BridgeContext) {
        if (Float.parseFloat(h5BridgeContext.getDistanceInMeters()) < setmax.getLocation$domain_release().distanceTo(stopBluetoothDevicesDiscovery.latLonToLocation(Double.parseDouble(griverPerformanceStages.getLatitude()), Double.parseDouble(griverPerformanceStages.getLongitude())))) {
            return getIndoSubdivision(setmax.getLocation$domain_release(), h5BridgeContext.getShouldCallGoogleGeocodeAPI(), setmax.isGpsMockedForUnderLollipop$domain_release());
        }
        TitleBarRightButtonView.AnonymousClass1<onUpdateResult> just = TitleBarRightButtonView.AnonymousClass1.just(griverPerformanceStages.getIndoSubdivisions());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(localLoc…ivision.indoSubdivisions)");
        return just;
    }

    private final boolean isAlreadyPast(long j, long j2) {
        return (System.currentTimeMillis() - j) / HOUR_IN_MILLIS > j2;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<onUpdateResult> getIndoSubdivision(Location location, boolean z, boolean z2) {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.geocodeRepository.getIndoSubdivisionsNameByLocation(location, z, z2).flatMap(new getMax(this, location));
        Intrinsics.checkNotNullExpressionValue(flatMap, "geocodeRepository.getInd…ndoSubdivision)\n        }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation$Companion;", "", "()V", "HOUR_IN_MILLIS", "", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \r2\u00020\u0001:\u0001\rB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation$Params;", "", "location", "Landroid/location/Location;", "useTimeDiffer", "", "isGpsMockedForUnderLollipop", "(Landroid/location/Location;ZZ)V", "isGpsMockedForUnderLollipop$domain_release", "()Z", "getLocation$domain_release", "()Landroid/location/Location;", "getUseTimeDiffer$domain_release", "Companion", "domain_release"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        @NotNull
        public static final getMin Companion = new getMin((DefaultConstructorMarker) null);
        private final boolean isGpsMockedForUnderLollipop;
        @NotNull
        private final Location location;
        private final boolean useTimeDiffer;

        @JvmStatic
        @NotNull
        public static final setMax forLocation(@NotNull Location location2, boolean z, boolean z2) {
            return Companion.forLocation(location2, z, z2);
        }

        private setMax(Location location2, boolean z, boolean z2) {
            this.location = location2;
            this.useTimeDiffer = z;
            this.isGpsMockedForUnderLollipop = z2;
        }

        public /* synthetic */ setMax(Location location2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
            this(location2, z, z2);
        }

        @NotNull
        public final Location getLocation$domain_release() {
            return this.location;
        }

        public final boolean getUseTimeDiffer$domain_release() {
            return this.useTimeDiffer;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        /* synthetic */ setMax(Location location2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(location2, z, (i & 4) != 0 ? false : z2);
        }

        public final boolean isGpsMockedForUnderLollipop$domain_release() {
            return this.isGpsMockedForUnderLollipop;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation$Params$Companion;", "", "()V", "forLocation", "Lid/dana/domain/geocode/interactor/GetIndoSubdivisionsByLocation$Params;", "location", "Landroid/location/Location;", "useTimeDiffer", "", "isGpsMockedForUnderLollipop", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin {
            private getMin() {
            }

            public /* synthetic */ getMin(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ setMax forLocation$default(getMin getmin, Location location, boolean z, boolean z2, int i, Object obj) {
                if ((i & 2) != 0) {
                    z = false;
                }
                if ((i & 4) != 0) {
                    z2 = false;
                }
                return getmin.forLocation(location, z, z2);
            }

            @JvmStatic
            @NotNull
            public final setMax forLocation(@NotNull Location location, boolean z, boolean z2) {
                Intrinsics.checkNotNullParameter(location, "location");
                return new setMax(location, z, z2, (DefaultConstructorMarker) null);
            }
        }
    }
}
