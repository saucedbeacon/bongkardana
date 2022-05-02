package o;

import android.location.Location;
import id.dana.data.Source;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.CreateDialogParam;
import o.TitleBarRightButtonView;
import o.onUpdateResult;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/data/geocode/repository/config/GeocodeConfigEntityData;", "", "getGeocodeReverseConfig", "Lio/reactivex/Observable;", "Lid/dana/data/geocode/model/GeocodeReverseConfigResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface CreatePromptParam {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<CreateDialogParam.AgreementClickListener> getGeocodeReverseConfig();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\bH\u0016J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\bH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u0019H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\"\u001a\u00020\u001cH\u0016J\f\u0010#\u001a\u00020\u0016*\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/data/geocode/repository/GeocodeEntityRepository;", "Lid/dana/domain/geocode/GeocodeRepository;", "geocodeEntityDataFactory", "Lid/dana/data/geocode/repository/source/GeocodeEntityDataFactory;", "geocodeConfigEntityDataFactory", "Lid/dana/data/geocode/repository/config/GeocodeConfigEntityDataFactory;", "(Lid/dana/data/geocode/repository/source/GeocodeEntityDataFactory;Lid/dana/data/geocode/repository/config/GeocodeConfigEntityDataFactory;)V", "addIndoSubdivisionDataFromNetworkGeocoder", "Lio/reactivex/Observable;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "location", "Landroid/location/Location;", "indoSubdivisions", "createGeocodeConfigLocalEntityData", "Lid/dana/data/geocode/repository/config/GeocodeConfigEntityData;", "createGeocodeConfigSplitEntityData", "createLocalGeocodeEntityData", "Lid/dana/data/geocode/repository/source/GeocodeEntityData;", "createNetworkGeocodeEntityData", "getDistrictNameByLocation", "", "getGeocodeReverseConfig", "Lid/dana/domain/geocode/model/GeocodeReverseConfig;", "getIndoSubdivisionsNameByLocation", "shouldCallGoogleGeocodeAPI", "", "isGpsMockedForUnderLollipop", "getLatestSubdivisions", "Lid/dana/domain/geocode/model/LocationSubdisivision;", "getReverseGeocodeByLoc", "Lid/dana/domain/miniprogram/model/Address;", "isGpsMocked", "isMockGpsForUnderLollipop", "saveLatestSubdivisions", "locationSubdisivision", "toGeocodeReverseConfig", "Lid/dana/data/geocode/model/GeocodeReverseConfigResult;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class PositiveListener implements APWebViewPerformance {
        private final EngineInitFailedPoint geocodeConfigEntityDataFactory;
        private final EngineInitSuccessPoint geocodeEntityDataFactory;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "kotlin.jvm.PlatformType", "indoSubdivisions", "apply"}, k = 3, mv = {1, 4, 2})
        static final class getMax<T, R> implements RedDotDrawable<onUpdateResult, TitleBarRightButtonView.AnonymousClass4<? extends onUpdateResult>> {
            final /* synthetic */ Location getMax;
            final /* synthetic */ PositiveListener length;
            final /* synthetic */ boolean setMax;
            final /* synthetic */ boolean setMin;

            getMax(PositiveListener positiveListener, boolean z, Location location, boolean z2) {
                this.length = positiveListener;
                this.setMin = z;
                this.getMax = location;
                this.setMax = z2;
            }

            public final /* synthetic */ Object apply(Object obj) {
                onUpdateResult onupdateresult = (onUpdateResult) obj;
                Intrinsics.checkNotNullParameter(onupdateresult, "indoSubdivisions");
                if (this.setMin && onupdateresult.isThereAnyEmptyField()) {
                    return this.length.addIndoSubdivisionDataFromNetworkGeocoder(this.getMax, onupdateresult).map(new RedDotDrawable<onUpdateResult, onUpdateResult>(this) {
                        final /* synthetic */ getMax setMin;

                        {
                            this.setMin = r1;
                        }

                        public final /* synthetic */ Object apply(Object obj) {
                            onUpdateResult onupdateresult = (onUpdateResult) obj;
                            Intrinsics.checkNotNullParameter(onupdateresult, "it");
                            onupdateresult.setMockLocation(this.setMin.length.isGpsMocked(this.setMin.getMax, this.setMin.setMax));
                            return onupdateresult;
                        }
                    });
                }
                onupdateresult.setMockLocation(this.length.isGpsMocked(this.getMax, this.setMax));
                return TitleBarRightButtonView.AnonymousClass1.just(onupdateresult);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/geocode/model/GeocodeReverseConfig;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/geocode/model/GeocodeReverseConfigResult;", "apply"}, k = 3, mv = {1, 4, 2})
        static final class getMin<T, R> implements RedDotDrawable<CreateDialogParam.AgreementClickListener, H5BridgeContext> {
            final /* synthetic */ PositiveListener getMax;

            getMin(PositiveListener positiveListener) {
                this.getMax = positiveListener;
            }

            public final /* synthetic */ Object apply(Object obj) {
                CreateDialogParam.AgreementClickListener agreementClickListener = (CreateDialogParam.AgreementClickListener) obj;
                Intrinsics.checkNotNullParameter(agreementClickListener, "it");
                return this.getMax.toGeocodeReverseConfig(agreementClickListener);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
        static final class length<T, R> implements RedDotDrawable<String, TitleBarRightButtonView.AnonymousClass4<? extends String>> {
            final /* synthetic */ PositiveListener getMax;
            final /* synthetic */ Location setMax;

            length(PositiveListener positiveListener, Location location) {
                this.getMax = positiveListener;
                this.setMax = location;
            }

            public final /* synthetic */ Object apply(Object obj) {
                TitleBarRightButtonView.AnonymousClass1<String> r2;
                String str = (String) obj;
                Intrinsics.checkNotNullParameter(str, "it");
                if (str.length() == 0) {
                    r2 = this.getMax.createNetworkGeocodeEntityData().getDistrictNameByLocation(this.setMax);
                } else {
                    r2 = TitleBarRightButtonView.AnonymousClass1.just(str);
                    Intrinsics.checkNotNullExpressionValue(r2, "Observable.just(it)");
                }
                return r2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/geocode/model/LocationSubdisivision;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
        static final class setMax<T, R> implements RedDotDrawable<Throwable, GriverPerformanceStages> {
            public static final setMax getMin = new setMax();

            setMax() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                Intrinsics.checkNotNullParameter((Throwable) obj, "it");
                return GriverPerformanceStages.Companion.empty();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/domain/geocode/model/IndoSubdivisions;", "kotlin.jvm.PlatformType", "result", "apply"}, k = 3, mv = {1, 4, 2})
        static final class setMin<T, R> implements RedDotDrawable<onUpdateResult, onUpdateResult> {
            final /* synthetic */ onUpdateResult setMin;

            setMin(onUpdateResult onupdateresult) {
                this.setMin = onupdateresult;
            }

            public final /* synthetic */ Object apply(Object obj) {
                onUpdateResult onupdateresult = (onUpdateResult) obj;
                Intrinsics.checkNotNullParameter(onupdateresult, "result");
                onUpdateResult.length length = new onUpdateResult.length(this.setMin);
                boolean z = true;
                if (this.setMin.getCountryCode().length() == 0) {
                    length.withCountryCode(onupdateresult.getCountryCode());
                }
                if (this.setMin.getCountryName().length() == 0) {
                    length.withCountryName(onupdateresult.getCountryName());
                }
                if (this.setMin.getProviceName().length() == 0) {
                    length.withProvinceName(onupdateresult.getProviceName());
                }
                if (this.setMin.getCityName().length() == 0) {
                    length.withCityName(onupdateresult.getCityName());
                }
                if (this.setMin.getDistrictName().length() == 0) {
                    length.withDistrictName(onupdateresult.getDistrictName());
                }
                if (this.setMin.getSubdistrictName().length() != 0) {
                    z = false;
                }
                if (z) {
                    length.withSubdistrictName(onupdateresult.getSubdistrictName());
                }
                return length.create();
            }
        }

        @Inject
        public PositiveListener(@NotNull EngineInitSuccessPoint engineInitSuccessPoint, @NotNull EngineInitFailedPoint engineInitFailedPoint) {
            Intrinsics.checkNotNullParameter(engineInitSuccessPoint, "geocodeEntityDataFactory");
            Intrinsics.checkNotNullParameter(engineInitFailedPoint, "geocodeConfigEntityDataFactory");
            this.geocodeEntityDataFactory = engineInitSuccessPoint;
            this.geocodeConfigEntityDataFactory = engineInitFailedPoint;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<String> getDistrictNameByLocation(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            TitleBarRightButtonView.AnonymousClass1<R> flatMap = createLocalGeocodeEntityData().getDistrictNameByLocation(location).flatMap(new length(this, location));
            Intrinsics.checkNotNullExpressionValue(flatMap, "createLocalGeocodeEntity…          }\n            }");
            return flatMap;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<onUpdateResult> getIndoSubdivisionsNameByLocation(@NotNull Location location, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(location, "location");
            TitleBarRightButtonView.AnonymousClass1<R> flatMap = createLocalGeocodeEntityData().getSubdivisionsFromGeocoder(location).flatMap(new getMax(this, z, location, z2));
            Intrinsics.checkNotNullExpressionValue(flatMap, "createLocalGeocodeEntity…         })\n            }");
            return flatMap;
        }

        /* access modifiers changed from: private */
        public final boolean isGpsMocked(Location location, boolean z) {
            return (location.isFromMockProvider() || z) && !PrepareCallbackParam.isDebugMode();
        }

        /* access modifiers changed from: private */
        public final TitleBarRightButtonView.AnonymousClass1<onUpdateResult> addIndoSubdivisionDataFromNetworkGeocoder(Location location, onUpdateResult onupdateresult) {
            TitleBarRightButtonView.AnonymousClass1<R> map = createNetworkGeocodeEntityData().getSubdivisionsFromGeocoder(location).map(new setMin(onupdateresult));
            Intrinsics.checkNotNullExpressionValue(map, "createNetworkGeocodeEnti…ns.create()\n            }");
            return map;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<H5BridgeContext> getGeocodeReverseConfig() {
            TitleBarRightButtonView.AnonymousClass1<R> map = createGeocodeConfigSplitEntityData().getGeocodeReverseConfig().onErrorResumeNext(createGeocodeConfigLocalEntityData().getGeocodeReverseConfig()).map(new getMin(this));
            Intrinsics.checkNotNullExpressionValue(map, "createGeocodeConfigSplit…oGeocodeReverseConfig() }");
            return map;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<Boolean> saveLatestSubdivisions(@NotNull GriverPerformanceStages griverPerformanceStages) {
            Intrinsics.checkNotNullParameter(griverPerformanceStages, "locationSubdisivision");
            return createLocalGeocodeEntityData().saveLatestLocationSubdisivision(griverPerformanceStages);
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<GriverPerformanceStages> getLatestSubdivisions() {
            TitleBarRightButtonView.AnonymousClass1<GriverPerformanceStages> onErrorReturn = createLocalGeocodeEntityData().getLatestLocationSubdisivision().onErrorReturn(setMax.getMin);
            Intrinsics.checkNotNullExpressionValue(onErrorReturn, "createLocalGeocodeEntity…ion.empty()\n            }");
            return onErrorReturn;
        }

        @NotNull
        public final TitleBarRightButtonView.AnonymousClass1<processFacade> getReverseGeocodeByLoc(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            return createLocalGeocodeEntityData().getReverseGeocodeByLoc(location);
        }

        /* access modifiers changed from: private */
        public final H5BridgeContext toGeocodeReverseConfig(CreateDialogParam.AgreementClickListener agreementClickListener) {
            return new H5BridgeContext(agreementClickListener.getDistanceInMeters(), agreementClickListener.getIntervalInHours(), agreementClickListener.getShouldCallGoogleGeocodeAPI());
        }

        /* access modifiers changed from: private */
        public final onInitSuccess createNetworkGeocodeEntityData() {
            return this.geocodeEntityDataFactory.createData("network");
        }

        private final onInitSuccess createLocalGeocodeEntityData() {
            return this.geocodeEntityDataFactory.createData("local");
        }

        private final CreatePromptParam createGeocodeConfigSplitEntityData() {
            return this.geocodeConfigEntityDataFactory.createData(Source.SPLIT);
        }

        private final CreatePromptParam createGeocodeConfigLocalEntityData() {
            return this.geocodeConfigEntityDataFactory.createData("local");
        }
    }
}
