package o;

import android.content.Context;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import com.ap.zoloz.hummer.biz.HummerConstants;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0014J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u001aH\u0016J\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u001aH\u0016¨\u0006#"}, d2 = {"Lid/dana/data/geofence/repository/source/network/NetworkPoiEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/geofence/repository/source/network/PoiFacade;", "Lid/dana/data/geofence/repository/GeoFenceEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "securityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;)V", "getFacadeClass", "Ljava/lang/Class;", "getListPoi", "Lio/reactivex/Observable;", "Lid/dana/data/geofence/repository/source/network/result/PoiFetchResult;", "name", "", "hasNotifiedToday", "", "poiId", "notifyPois", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "poiNotificationInfos", "", "Lid/dana/data/geofence/model/PoiNotificationInfo;", "saveLastPoiNotificationDate", "", "poiIds", "saveListPoi", "", "pois", "Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class onPageInit extends setRepeatCount<onPagePause> implements interceptPageExit {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/geofence/repository/source/network/result/PoiFetchResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/geofence/repository/source/network/PoiFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<onPagePause, onPageResume> {
        final /* synthetic */ String setMax;

        getMin(String str) {
            this.setMax = str;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((onPagePause) obj).getPois(new interceptPushPage(this.setMax));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/geofence/repository/source/network/PoiFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMin<F, S> implements addAnimatorUpdateListener.getMax<onPagePause, BaseRpcResult> {
        final /* synthetic */ onPageInit getMin;
        final /* synthetic */ List setMin;

        setMin(onPageInit onpageinit, List list) {
            this.getMin = onpageinit;
            this.setMin = list;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            PagePushInterceptPoint pagePushInterceptPoint = new PagePushInterceptPoint(this.setMin);
            pagePushInterceptPoint.envInfo = this.getMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((onPagePause) obj).notify(pagePushInterceptPoint);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public onPageInit(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "securityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    @NotNull
    public final Class<onPagePause> getFacadeClass() {
        return onPagePause.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<onPageResume> getListPoi(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        TitleBarRightButtonView.AnonymousClass1<onPageResume> wrapper = wrapper(new getMin(str));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.getPois(PoiFetchRequest(name)) }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> notifyPois(@NotNull List<handleBackPressed> list) {
        Intrinsics.checkNotNullParameter(list, "poiNotificationInfos");
        TitleBarRightButtonView.AnonymousClass1<BaseRpcResult> wrapper = wrapper(new setMin(this, list));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.notify(PoiN…nvInfo()\n            }) }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<long[]> saveListPoi(@NotNull List<PageShowLoadingPoint> list) {
        Intrinsics.checkNotNullParameter(list, "pois");
        TitleBarRightButtonView.AnonymousClass1<long[]> just = TitleBarRightButtonView.AnonymousClass1.just(new long[0]);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(\n            longArrayOf())");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Integer> saveLastPoiNotificationDate(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "poiIds");
        TitleBarRightButtonView.AnonymousClass1<Integer> just = TitleBarRightButtonView.AnonymousClass1.just(0);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(0)");
        return just;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> hasNotifiedToday(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "poiId");
        TitleBarRightButtonView.AnonymousClass1<Boolean> just = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(false)");
        return just;
    }
}
