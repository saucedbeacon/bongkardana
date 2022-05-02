package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.List;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\t\u001a\u00020\u0006H&J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH&J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\rH&J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\rH&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lid/dana/data/geofence/repository/GeoFenceEntityData;", "", "getListPoi", "Lio/reactivex/Observable;", "Lid/dana/data/geofence/repository/source/network/result/PoiFetchResult;", "name", "", "hasNotifiedToday", "", "poiId", "notifyPois", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "poiNotificationInfos", "", "Lid/dana/data/geofence/model/PoiNotificationInfo;", "saveLastPoiNotificationDate", "", "poiIds", "saveListPoi", "", "pois", "Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface interceptPageExit {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<onPageResume> getListPoi(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Boolean> hasNotifiedToday(@NotNull String str);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> notifyPois(@NotNull List<handleBackPressed> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<Integer> saveLastPoiNotificationDate(@NotNull List<String> list);

    @NotNull
    TitleBarRightButtonView.AnonymousClass1<long[]> saveListPoi(@NotNull List<PageShowLoadingPoint> list);
}
