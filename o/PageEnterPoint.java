package o;

import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import com.alipayplus.mobile.component.domain.model.result.BaseRpcResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;
import o.PackageDownloadRequest;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\"\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cH\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0018H\u0016J\u001c\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001c0\u00182\u0006\u0010!\u001a\u00020\u001aH\u0016J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cH\u0016J\u0016\u0010%\u001a\u00020&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u001cH\u0002J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020#0\u00182\u0006\u0010*\u001a\u00020+H\u0016R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lid/dana/data/geofence/repository/source/GeoFenceEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/geofence/GeoFenceRepository;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "geoFenceDataFactory", "Lid/dana/data/geofence/repository/source/GeoFenceDataFactory;", "deviceInformationProvider", "Lid/dana/data/config/DeviceInformationProvider;", "securedAccountPreferences", "Lid/dana/data/account/repository/source/SecuredAccountPreferences;", "generalPreferences", "Lid/dana/data/storage/GeneralPreferences;", "(Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/login/source/LoginEntityDataFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/geofence/repository/source/GeoFenceDataFactory;Lid/dana/data/config/DeviceInformationProvider;Lid/dana/data/account/repository/source/SecuredAccountPreferences;Lid/dana/data/storage/GeneralPreferences;)V", "createLocalPoiData", "Lid/dana/data/geofence/repository/GeoFenceEntityData;", "createNetworkPoiData", "filterOutTodayNotifiedPoiId", "Lio/reactivex/Observable;", "", "", "poiIds", "", "getCurrentPOICacheTime", "", "getListPoi", "Lid/dana/domain/geofence/model/Poi;", "location", "notifyByPoiIds", "", "notifyPOIs", "savelistPOIs", "", "newPOIs", "Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "setRetryInterval", "maxRetry", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PageEnterPoint extends setMinProgress implements onDownloadResult {
    private final getPerformanceTracker deviceInformationProvider;
    /* access modifiers changed from: private */
    public final PackageDownloadRequest.AnonymousClass1 generalPreferences;
    private final PageExitInterceptPoint geoFenceDataFactory;
    /* access modifiers changed from: private */
    public final getFrameMarginVerticalLess$core securedAccountPreferences;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "t", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "apply", "(Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<BaseRpcResult, Boolean> {
        public static final IsOverlapping getMin = new IsOverlapping();

        IsOverlapping() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            BaseRpcResult baseRpcResult = (BaseRpcResult) obj;
            Intrinsics.checkNotNullParameter(baseRpcResult, SecurityConstants.KEY_TEXT);
            return Boolean.valueOf(baseRpcResult.success);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/alipayplus/mobile/component/domain/model/result/BaseRpcResult;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T> implements RedDotManager<BaseRpcResult> {
        final /* synthetic */ List length;
        final /* synthetic */ PageEnterPoint setMin;

        getMax(PageEnterPoint pageEnterPoint, List list) {
            this.setMin = pageEnterPoint;
            this.length = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            if (((BaseRpcResult) obj).success) {
                this.setMin.createLocalPoiData().saveLastPoiNotificationDate(this.length);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newPoi", "Lid/dana/data/geofence/repository/source/persistence/entity/RecentPoiEntity;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<PageShowLoadingPoint, Boolean> {
        final /* synthetic */ List $oldPOIs;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(List list) {
            super(1);
            this.$oldPOIs = list;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((PageShowLoadingPoint) obj));
        }

        public final boolean invoke(@NotNull PageShowLoadingPoint pageShowLoadingPoint) {
            Intrinsics.checkNotNullParameter(pageShowLoadingPoint, "newPoi");
            Iterable<String> iterable = this.$oldPOIs;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            for (String areEqual : iterable) {
                if (Intrinsics.areEqual((Object) areEqual, (Object) pageShowLoadingPoint.getPoiId())) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lid/dana/data/geofence/repository/source/network/result/PoiFetchResult;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class length<T> implements RedDotManager<onPageResume> {
        final /* synthetic */ PageEnterPoint length;

        length(PageEnterPoint pageEnterPoint) {
            this.length = pageEnterPoint;
        }

        public final /* synthetic */ void accept(Object obj) {
            onPageResume onpageresume = (onPageResume) obj;
            this.length.securedAccountPreferences.saveLastUpdatePOI(Long.valueOf(System.currentTimeMillis()));
            PageEnterPoint pageEnterPoint = this.length;
            Intrinsics.checkNotNullExpressionValue(onpageresume, "it");
            pageEnterPoint.savelistPOIs(onBackPerformed.toRecentPoiEntity(onpageresume));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "Lid/dana/domain/geofence/model/Poi;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/geofence/repository/source/network/result/PoiFetchResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<onPageResume, List<? extends H5Data>> {
        public static final setMax setMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            onPageResume onpageresume = (onPageResume) obj;
            Intrinsics.checkNotNullParameter(onpageresume, "it");
            return onBackPerformed.toPoi(onpageresume);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/SingleSource;", "", "", "kotlin.jvm.PlatformType", "poiId", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<String, setMinDuration<? extends List<String>>> {
        final /* synthetic */ PageEnterPoint length;

        setMin(PageEnterPoint pageEnterPoint) {
            this.length = pageEnterPoint;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [o.PagePausePoint] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r3) {
            /*
                r2 = this;
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r0 = "poiId"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                o.PageEnterPoint r0 = r2.length
                o.interceptPageExit r0 = r0.createLocalPoiData()
                o.TitleBarRightButtonView$1 r0 = r0.hasNotifiedToday(r3)
                o.PageEnterPoint$setMin$3 r1 = new o.PageEnterPoint$setMin$3
                r1.<init>(r3)
                o.RedDotDrawable r1 = (o.RedDotDrawable) r1
                o.TitleBarRightButtonView$1 r3 = r0.map(r1)
                o.PageEnterPoint$setMin$1 r0 = o.PageEnterPoint.setMin.AnonymousClass1.getMin
                o.getChildren r0 = (o.getChildren) r0
                o.TitleBarRightButtonView$1 r3 = r3.filter(r0)
                kotlin.reflect.KProperty1 r0 = o.PageDestroyPoint.INSTANCE
                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                if (r0 == 0) goto L_0x0030
                o.PagePausePoint r1 = new o.PagePausePoint
                r1.<init>(r0)
                r0 = r1
            L_0x0030:
                o.RedDotDrawable r0 = (o.RedDotDrawable) r0
                o.TitleBarRightButtonView$1 r3 = r3.map(r0)
                o.TitleBarRightButtonView$CornerMarkingUIController$1 r3 = r3.toList()
                o.setMinDuration r3 = (o.setMinDuration) r3
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: o.PageEnterPoint.setMin.apply(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "filteredPoiIds", "", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<List<String>, TitleBarRightButtonView.AnonymousClass4<? extends Boolean>> {
        final /* synthetic */ PageEnterPoint getMax;

        toFloatRange(PageEnterPoint pageEnterPoint) {
            this.getMax = pageEnterPoint;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r2;
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "filteredPoiIds");
            if (list.isEmpty()) {
                r2 = TitleBarRightButtonView.AnonymousClass1.just(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(r2, "Observable.just(false)");
            } else {
                r2 = this.getMax.notifyByPoiIds(list);
            }
            return r2;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public PageEnterPoint(@NotNull DialogLayout dialogLayout, @NotNull b.AnonymousClass3 r3, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull getAppLaunchParams getapplaunchparams, @NotNull PageExitInterceptPoint pageExitInterceptPoint, @NotNull getPerformanceTracker getperformancetracker, @NotNull getFrameMarginVerticalLess$core getframemarginverticalless_core, @NotNull PackageDownloadRequest.AnonymousClass1 r9) {
        super(dialogLayout, r3, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(r3, "loginEntityDataFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(pageExitInterceptPoint, "geoFenceDataFactory");
        Intrinsics.checkNotNullParameter(getperformancetracker, "deviceInformationProvider");
        Intrinsics.checkNotNullParameter(getframemarginverticalless_core, "securedAccountPreferences");
        Intrinsics.checkNotNullParameter(r9, "generalPreferences");
        this.geoFenceDataFactory = pageExitInterceptPoint;
        this.deviceInformationProvider = getperformancetracker;
        this.securedAccountPreferences = getframemarginverticalless_core;
        this.generalPreferences = r9;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setRetryInterval(int i) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new toIntRange(this, i));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …RetryInterval(maxRetry) }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Long> getCurrentPOICacheTime() {
        TitleBarRightButtonView.AnonymousClass1<Long> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new getMin(this));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …s.lastUpdatePOI\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<H5Data>> getListPoi(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "location");
        TitleBarRightButtonView.AnonymousClass1<R> map = authenticatedRequest(createNetworkPoiData().getListPoi(str)).doOnNext(new length(this)).map(setMax.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "authenticatedRequest(cre…      .map { it.toPoi() }");
        return map;
    }

    /* access modifiers changed from: private */
    public final void savelistPOIs(List<PageShowLoadingPoint> list) {
        onPageResume blockingSingle = createLocalPoiData().getListPoi("").blockingSingle();
        Intrinsics.checkNotNullExpressionValue(blockingSingle, "createLocalPoiData().get…tPoi(\"\").blockingSingle()");
        Iterable<PageShowLoadingPoint> recentPoiEntity = onBackPerformed.toRecentPoiEntity(blockingSingle);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(recentPoiEntity, 10));
        for (PageShowLoadingPoint poiId : recentPoiEntity) {
            arrayList.add(poiId.getPoiId());
        }
        List list2 = (List) arrayList;
        if (list2.isEmpty()) {
            createLocalPoiData().saveListPoi(list);
            return;
        }
        List list3 = SequencesKt.toList(SequencesKt.filter(CollectionsKt.asSequence(list), new isInside(list2)));
        if (!list3.isEmpty()) {
            createLocalPoiData().saveListPoi(list3);
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> notifyPOIs(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "poiIds");
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = filterOutTodayNotifiedPoiId(list).flatMap(new toFloatRange(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "filterOutTodayNotifiedPo…          }\n            }");
        return flatMap;
    }

    private final TitleBarRightButtonView.AnonymousClass1<List<String>> filterOutTodayNotifiedPoiId(List<String> list) {
        TitleBarRightButtonView.AnonymousClass1<List<String>> flatMapSingle = TitleBarRightButtonView.AnonymousClass1.fromIterable(list).flatMapSingle(new setMin(this));
        Intrinsics.checkNotNullExpressionValue(flatMapSingle, "Observable.fromIterable(…  .toList()\n            }");
        return flatMapSingle;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> notifyByPoiIds(List<String> list) {
        TitleBarRightButtonView.AnonymousClass1<R> map = authenticatedRequest(createNetworkPoiData().notifyPois(onBackPerformed.toPoiNotificationInfo(list, this.deviceInformationProvider))).retryWhen(new getStartContext(this.generalPreferences.getGeofenceRetryInterval(), 1500)).doOnNext(new getMax(this, list)).map(IsOverlapping.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "authenticatedRequest(cre… }.map { t -> t.success }");
        return map;
    }

    private final interceptPageExit createNetworkPoiData() {
        return this.geoFenceDataFactory.createData("network");
    }

    /* access modifiers changed from: private */
    public final interceptPageExit createLocalPoiData() {
        return this.geoFenceDataFactory.createData("local");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<V> implements Callable<Boolean> {
        final /* synthetic */ int getMax;
        final /* synthetic */ PageEnterPoint getMin;

        toIntRange(PageEnterPoint pageEnterPoint, int i) {
            this.getMin = pageEnterPoint;
            this.getMax = i;
        }

        public final /* synthetic */ Object call() {
            return this.getMin.generalPreferences.setGeofenceRetryInterval(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "call", "()Ljava/lang/Long;"}, k = 3, mv = {1, 4, 2})
    static final class getMin<V> implements Callable<Long> {
        final /* synthetic */ PageEnterPoint length;

        getMin(PageEnterPoint pageEnterPoint) {
            this.length = pageEnterPoint;
        }

        public final /* synthetic */ Object call() {
            if (this.length.securedAccountPreferences.getLastUpdatePOI() == null) {
                this.length.securedAccountPreferences.saveLastUpdatePOI(Long.valueOf(System.currentTimeMillis()));
            }
            return this.length.securedAccountPreferences.getLastUpdatePOI();
        }
    }
}
