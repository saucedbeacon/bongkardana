package o;

import android.location.Location;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0002J,\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\f2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lid/dana/data/nearbyplaces/repository/NearbyPlaceEntityRepository;", "Lid/dana/domain/nearbyplaces/NearbyPlaceRepository;", "nearbyPlaceEntityDataFactory", "Lid/dana/data/nearbyplaces/repository/source/NearbyPlaceEntityDataFactory;", "geocodeEntityDataFactory", "Lid/dana/data/geocode/repository/source/GeocodeEntityDataFactory;", "(Lid/dana/data/nearbyplaces/repository/source/NearbyPlaceEntityDataFactory;Lid/dana/data/geocode/repository/source/GeocodeEntityDataFactory;)V", "createGeocodeLocalEntityData", "Lid/dana/data/geocode/repository/source/GeocodeEntityData;", "createNearbyPlaceEntityData", "Lid/dana/data/nearbyplaces/NearbyPlaceEntityData;", "getListNearbyLocations", "Lio/reactivex/Observable;", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "keyword", "", "location", "Landroid/location/Location;", "uuid", "getPlaceDetail", "locationName", "placeId", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class callMode implements GriverWebViewUtils {
    private final EngineInitSuccessPoint geocodeEntityDataFactory;
    private final dispatcherOnWorkerThread nearbyPlaceEntityDataFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMin<T, R> implements RedDotDrawable<Throwable, TitleBarRightButtonView.AnonymousClass1<Location>> {
        final /* synthetic */ callMode getMax;
        final /* synthetic */ String setMax;

        getMin(callMode callmode, String str) {
            this.getMax = callmode;
            this.setMax = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return this.getMax.createGeocodeLocalEntityData().getLocationFromLocationName(this.setMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "t", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlaceComponentResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<print, Location> {
        public static final setMin setMax = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            print print = (print) obj;
            Intrinsics.checkNotNullParameter(print, SecurityConstants.KEY_TEXT);
            Location location = new Location("");
            location.setLongitude(print.getGeometry().getLocation().getLng());
            location.setLatitude(print.getGeometry().getLocation().getLat());
            return location;
        }
    }

    @Inject
    public callMode(@NotNull dispatcherOnWorkerThread dispatcheronworkerthread, @NotNull EngineInitSuccessPoint engineInitSuccessPoint) {
        Intrinsics.checkNotNullParameter(dispatcheronworkerthread, "nearbyPlaceEntityDataFactory");
        Intrinsics.checkNotNullParameter(engineInitSuccessPoint, "geocodeEntityDataFactory");
        this.nearbyPlaceEntityDataFactory = dispatcheronworkerthread;
        this.geocodeEntityDataFactory = engineInitSuccessPoint;
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [o.generateLegacyNativeId] */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final o.TitleBarRightButtonView.AnonymousClass1<java.util.List<o.getCreateTime>> getListNearbyLocations(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull android.location.Location r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
        /*
            r8 = this;
            java.lang.String r0 = "keyword"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "uuid"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            o.source r1 = r8.createNearbyPlaceEntityData()
            double r3 = r10.getLatitude()
            double r5 = r10.getLongitude()
            r2 = r9
            r7 = r11
            o.TitleBarRightButtonView$1 r9 = r1.getListNearbyLocations(r2, r3, r5, r7)
            o.callMode$getMax r10 = o.callMode.getMax.INSTANCE
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            if (r10 == 0) goto L_0x002e
            o.generateLegacyNativeId r11 = new o.generateLegacyNativeId
            r11.<init>(r10)
            r10 = r11
        L_0x002e:
            o.RedDotDrawable r10 = (o.RedDotDrawable) r10
            o.TitleBarRightButtonView$1 r9 = r9.map(r10)
            java.lang.String r10 = "createNearbyPlaceEntityD…t>::toListNearbyLocation)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.callMode.getListNearbyLocations(java.lang.String, android.location.Location, java.lang.String):o.TitleBarRightButtonView$1");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "p1", "Lid/dana/data/nearbyplaces/repository/source/network/result/PlacePredictionResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class getMax extends FunctionReferenceImpl implements Function1<List<? extends getAction>, List<? extends getCreateTime>> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(1, build.class, "toListNearbyLocation", "toListNearbyLocation(Ljava/util/List;)Ljava/util/List;", 1);
        }

        @NotNull
        public final List<getCreateTime> invoke(@NotNull List<getAction> list) {
            Intrinsics.checkNotNullParameter(list, "p1");
            return build.toListNearbyLocation(list);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Location> getPlaceDetail(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "locationName");
        Intrinsics.checkNotNullParameter(str2, "placeId");
        Intrinsics.checkNotNullParameter(str3, HeaderConstant.HEADER_KEY_UUID);
        TitleBarRightButtonView.AnonymousClass1<R> onErrorResumeNext = createNearbyPlaceEntityData().getDetailLocation(str2, str3).map(setMin.setMax).onErrorResumeNext(new getMin(this, str));
        Intrinsics.checkNotNullExpressionValue(onErrorResumeNext, "createNearbyPlaceEntityD…ationName)\n            })");
        return onErrorResumeNext;
    }

    private final source createNearbyPlaceEntityData() {
        return this.nearbyPlaceEntityDataFactory.createData("network");
    }

    /* access modifiers changed from: private */
    public final onInitSuccess createGeocodeLocalEntityData() {
        return this.geocodeEntityDataFactory.createData("local");
    }
}
