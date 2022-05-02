package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u0010\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\b*\u00020\t\u001a\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\b*\b\u0012\u0004\u0012\u00020\u00070\b\u001a\n\u0010\n\u001a\u00020\u0007*\u00020\u000b\u001a\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\b*\b\u0012\u0004\u0012\u00020\u000b0\b\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\f\u001a\u00020\r\u001a\n\u0010\u000e\u001a\u00020\u000b*\u00020\u0007\u001a\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b*\u00020\t\u001a\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\b*\b\u0012\u0004\u0012\u00020\u00070\b¨\u0006\u000f"}, d2 = {"toPoiNotificationInfo", "Lid/dana/data/geofence/model/PoiNotificationInfo;", "poiId", "", "requestId", "toPoi", "Lid/dana/domain/geofence/model/Poi;", "Lid/dana/data/geofence/model/PoiInfoEntity;", "", "Lid/dana/data/geofence/repository/source/network/result/PoiFetchResult;", "toPoiInfoEntity", "Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "toRecentPoiEntity", "data_productionRelease"}, k = 2, mv = {1, 4, 2})
public final class onBackPerformed {
    @NotNull
    public static final List<H5Data> toPoi(@NotNull List<onBlankScreen> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toPoi");
        Iterable<onBlankScreen> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (onBlankScreen poi : iterable) {
            arrayList.add(toPoi(poi));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final List<PageShowLoadingPoint> toRecentPoiEntity(@NotNull List<onBlankScreen> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toRecentPoiEntity");
        Iterable<onBlankScreen> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (onBlankScreen recentPoiEntity : iterable) {
            arrayList.add(toRecentPoiEntity(recentPoiEntity));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final List<onBlankScreen> toPoiInfoEntity(@NotNull List<PageShowLoadingPoint> list) {
        Intrinsics.checkNotNullParameter(list, "$this$toPoiInfoEntity");
        Iterable<PageShowLoadingPoint> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (PageShowLoadingPoint poiInfoEntity : iterable) {
            arrayList.add(toPoiInfoEntity(poiInfoEntity));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final onBlankScreen toPoiInfoEntity(@NotNull PageShowLoadingPoint pageShowLoadingPoint) {
        Intrinsics.checkNotNullParameter(pageShowLoadingPoint, "$this$toPoiInfoEntity");
        return new onBlankScreen(pageShowLoadingPoint.getPoiId(), pageShowLoadingPoint.getLongitude(), pageShowLoadingPoint.getLatitude(), pageShowLoadingPoint.getRadius());
    }

    @NotNull
    public static final List<H5Data> toPoi(@NotNull onPageResume onpageresume) {
        Intrinsics.checkNotNullParameter(onpageresume, "$this$toPoi");
        return toPoi(onpageresume.getPois());
    }

    @NotNull
    public static final List<PageShowLoadingPoint> toRecentPoiEntity(@NotNull onPageResume onpageresume) {
        Intrinsics.checkNotNullParameter(onpageresume, "$this$toRecentPoiEntity");
        return toRecentPoiEntity(onpageresume.getPois());
    }

    @NotNull
    public static final H5Data toPoi(@NotNull onBlankScreen onblankscreen) {
        Intrinsics.checkNotNullParameter(onblankscreen, "$this$toPoi");
        return new H5Data(onblankscreen.getPoiId(), onblankscreen.getLatitude(), onblankscreen.getLongitude(), onblankscreen.getRadius());
    }

    @NotNull
    public static final PageShowLoadingPoint toRecentPoiEntity(@NotNull onBlankScreen onblankscreen) {
        Intrinsics.checkNotNullParameter(onblankscreen, "$this$toRecentPoiEntity");
        return new PageShowLoadingPoint(onblankscreen.getPoiId(), onblankscreen.getRadius(), onblankscreen.getLongitude(), onblankscreen.getLatitude(), (Long) null, 16, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final List<handleBackPressed> toPoiNotificationInfo(@NotNull List<String> list, @NotNull getPerformanceTracker getperformancetracker) {
        Intrinsics.checkNotNullParameter(list, "$this$toPoiNotificationInfo");
        Intrinsics.checkNotNullParameter(getperformancetracker, "deviceInformationProvider");
        Iterable<String> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (String poiNotificationInfo : iterable) {
            String deviceUUID = getperformancetracker.getDeviceUUID();
            Intrinsics.checkNotNullExpressionValue(deviceUUID, "deviceInformationProvider.deviceUUID");
            arrayList.add(toPoiNotificationInfo(poiNotificationInfo, deviceUUID));
        }
        return (List) arrayList;
    }

    @NotNull
    public static final handleBackPressed toPoiNotificationInfo(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        Intrinsics.checkNotNullParameter(str2, "requestId");
        return new handleBackPressed(str, str2);
    }
}
