package o;

import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\b\u0007\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0012H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0016¨\u0006\u001b"}, d2 = {"Lid/dana/data/geofence/repository/source/cache/LocalPoiEntityData;", "Lid/dana/data/base/BasePersistence;", "Lid/dana/data/geofence/repository/GeoFenceEntityData;", "persistenceDao", "Ldagger/Lazy;", "Lid/dana/data/base/BasePersistenceDao;", "(Ldagger/Lazy;)V", "getListPoi", "Lio/reactivex/Observable;", "Lid/dana/data/geofence/repository/source/network/result/PoiFetchResult;", "name", "", "hasNotifiedToday", "", "poiId", "notifyPois", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "poiNotificationInfos", "", "Lid/dana/data/geofence/model/PoiNotificationInfo;", "saveLastPoiNotificationDate", "", "poiIds", "saveListPoi", "", "pois", "Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PageExitPoint extends reverseAnimationSpeed implements interceptPageExit {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lid/dana/data/geofence/repository/source/network/result/PoiFetchResult;", "kotlin.jvm.PlatformType", "it", "", "Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<List<? extends PageShowLoadingPoint>, onPageResume> {
        public static final setMax setMax = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            return new onPageResume(onBackPerformed.toPoiInfoEntity((List<PageShowLoadingPoint>) list));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public PageExitPoint(@NotNull Lazy<BasePersistenceDao> lazy) {
        super(lazy);
        Intrinsics.checkNotNullParameter(lazy, "persistenceDao");
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> notifyPois(@NotNull List<handleBackPressed> list) {
        Intrinsics.checkNotNullParameter(list, "poiNotificationInfos");
        TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> just = TitleBarRightButtonView.AnonymousClass1.just(new BaseRpcResult());
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(BaseRpcResult())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<long[]> saveListPoi(@NotNull List<PageShowLoadingPoint> list) {
        Intrinsics.checkNotNullParameter(list, "pois");
        TitleBarRightButtonView.AnonymousClass1<long[]> just = TitleBarRightButtonView.AnonymousClass1.just(getDb().geofenceDao().insertPois(list));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(db.geofenceDao().insertPois(pois))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onPageResume> getListPoi(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        TitleBarRightButtonView.AnonymousClass1<R> map = TitleBarRightButtonView.AnonymousClass1.just(getDb().geofenceDao().getAllPois()).map(setMax.setMax);
        Intrinsics.checkNotNullExpressionValue(map, "Observable.just(db.geofe…t(it.toPoiInfoEntity()) }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> saveLastPoiNotificationDate(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "poiIds");
        TitleBarRightButtonView.AnonymousClass1<Integer> just = TitleBarRightButtonView.AnonymousClass1.just(Integer.valueOf(getDb().geofenceDao().updateLastNotification(list, PageStartedPoint.getTime())));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(db.geofe…ation(poiIds, getTime()))");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> hasNotifiedToday(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.valueOf(!getDb().geofenceDao().hasNotifiedToday(str, PageStartedPoint.getTime()).isEmpty()));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(db.geofe… getTime()).isNotEmpty())");
        return just;
    }
}
