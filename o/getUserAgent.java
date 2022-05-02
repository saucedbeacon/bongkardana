package o;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.BaseGriverNetwork;
import o.BaseGriverRpcRequest;
import o.TitleBarRightButtonView;
import o.goBack;
import o.runExit;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u000fH\u0016J$\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u0014j\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0015`\u0016H\u0002J,\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u000f2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0015H\u0016JT\u0010\u001f\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012  *\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f0\f  *\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012  *\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f0\f\u0018\u00010\u000f0\u000f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u000fH\u0002JT\u0010!\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012  *\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f0\f  *\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012  *\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f0\f\u0018\u00010\u000f0\u000f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u000fH\u0002JT\u0010\"\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012  *\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f0\f  *\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012  *\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f0\f\u0018\u00010\u000f0\u000f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\f0\u000fH\u0002JT\u0010#\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012  *\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f0\f  *\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0012  *\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f0\f\u0018\u00010\u000f0\u000f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\f0\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lid/dana/data/miniprogram/source/MiniProgramEntityRepository;", "Lid/dana/domain/miniprogram/MiniProgramRepository;", "preference", "Lid/dana/data/miniprogram/source/local/PreferenceStoreMiniProgramsEntityData;", "amcsConfigStoreStateEntityData", "Lid/dana/data/miniprogram/source/amcs/AmcsConfigStoreStateEntityData;", "miniProgramData", "Lid/dana/data/miniprogram/source/network/NetworkMiniPrograms;", "(Lid/dana/data/miniprogram/source/local/PreferenceStoreMiniProgramsEntityData;Lid/dana/data/miniprogram/source/amcs/AmcsConfigStoreStateEntityData;Lid/dana/data/miniprogram/source/network/NetworkMiniPrograms;)V", "getConfigStoreState", "Lid/dana/data/miniprogram/model/StoreStateConfigData;", "getFavoriteAppIds", "", "", "getMiniProgramScenario", "Lio/reactivex/Observable;", "Lid/dana/domain/miniprogram/model/DeeplinkServiceEntity;", "getMiniPrograms", "Lid/dana/domain/miniprogram/model/MiniProgram;", "getRecentMiniPrograms", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "setFavoriteMiniPrograms", "", "appId", "isFavorite", "", "allMiniProgramAppIds", "setRecentMiniProgram", "lastOpen", "addLastOpen", "kotlin.jvm.PlatformType", "modifyIsFav", "sortByTitle", "toMiniPrograms", "Lid/dana/data/miniprogram/model/MiniProgramEntity;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getUserAgent implements getFacade {
    @NotNull
    public static final getMin getMax = new getMin((byte) 0);
    private final runExit getMin;
    private final getEngine length;
    /* access modifiers changed from: private */
    public final goBack setMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/miniprogram/model/MiniProgram;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<List<? extends BaseGriverRpcRequest.DeviceInfo>, List<? extends BaseGriverRpcRequest.DeviceInfo>> {
        public static final IsOverlapping getMin = new IsOverlapping();

        IsOverlapping() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            return CollectionsKt.sortedWith(list, new getMin());
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
        public static final class getMin<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((BaseGriverRpcRequest.DeviceInfo) t).getTitle(), ((BaseGriverRpcRequest.DeviceInfo) t2).getTitle());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/miniprogram/model/DeeplinkServiceEntity;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/miniprogram/provider/model/DeeplinkServiceModel;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<getBackPerform, BaseGriverNetwork.FacadeProcessor> {
        public static final getMax getMin = new getMax();

        getMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            getBackPerform getbackperform = (getBackPerform) obj;
            Intrinsics.checkNotNullParameter(getbackperform, "it");
            return new BaseGriverNetwork.FacadeProcessor(getbackperform.getMin, getbackperform.setMax, getbackperform.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "", "", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class isInside<T, R> implements RedDotDrawable<Map<String, ? extends Long>, TitleBarRightButtonView.AnonymousClass4<? extends Unit>> {
        final /* synthetic */ getUserAgent length;

        isInside(getUserAgent getuseragent) {
            this.length = getuseragent;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            Intrinsics.checkNotNullParameter(map, "it");
            goBack min = this.length.setMin;
            HashMap hashMap = new HashMap(map);
            Intrinsics.checkNotNullParameter(hashMap, "hashMap");
            TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new goBack.setMin(min, hashMap));
            Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ograms(hashMap)\n        }");
            return fromCallable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/miniprogram/model/MiniProgram;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<List<? extends BaseGriverRpcRequest.DeviceInfo>, List<? extends BaseGriverRpcRequest.DeviceInfo>> {
        final /* synthetic */ getUserAgent length;

        length(getUserAgent getuseragent) {
            this.length = getuseragent;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<BaseGriverRpcRequest.DeviceInfo> list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            HashMap max = getUserAgent.setMax(this.length);
            for (BaseGriverRpcRequest.DeviceInfo deviceInfo : list) {
                if (max.keySet().contains(deviceInfo.getAppId())) {
                    Object obj2 = max.get(deviceInfo.getAppId());
                    Intrinsics.checkNotNull(obj2);
                    deviceInfo.setLastOpen(((Number) obj2).longValue());
                }
            }
            return list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/miniprogram/model/MiniProgram;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<List<? extends BaseGriverRpcRequest.DeviceInfo>, List<? extends BaseGriverRpcRequest.DeviceInfo>> {
        final /* synthetic */ getUserAgent length;

        setMax(getUserAgent getuseragent) {
            this.length = getuseragent;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List<BaseGriverRpcRequest.DeviceInfo> list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            List length2 = getUserAgent.length(this.length);
            for (BaseGriverRpcRequest.DeviceInfo deviceInfo : list) {
                deviceInfo.setFavorite(length2.contains(deviceInfo.getAppId()));
            }
            return list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/miniprogram/model/StoreStateConfigData;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<Throwable, getTopRender> {
        public static final setMin setMin = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Intrinsics.checkNotNullParameter((Throwable) obj, "it");
            return new getTopRender();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "it", "", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<List<String>, TitleBarRightButtonView.AnonymousClass4<? extends Unit>> {
        final /* synthetic */ getUserAgent length;

        toFloatRange(getUserAgent getuseragent) {
            this.length = getuseragent;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            goBack min = this.length.setMin;
            Intrinsics.checkNotNullParameter(list, "appIds");
            TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new goBack.length(min, list));
            Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …rograms(appIds)\n        }");
            return fromCallable;
        }
    }

    @Inject
    public getUserAgent(@NotNull goBack goback, @NotNull runExit runexit, @NotNull getEngine getengine) {
        Intrinsics.checkNotNullParameter(goback, "preference");
        Intrinsics.checkNotNullParameter(runexit, "amcsConfigStoreStateEntityData");
        Intrinsics.checkNotNullParameter(getengine, "miniProgramData");
        this.setMin = goback;
        this.getMin = runexit;
        this.length = getengine;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<BaseGriverRpcRequest.DeviceInfo>> getMiniPrograms() {
        TitleBarRightButtonView.AnonymousClass1<R> take = getEngine.length().map(getUserAgent$FastBitmap$CoordinateSystem.getMax).take(10);
        Intrinsics.checkNotNullExpressionValue(take, "miniProgramData.getMiniP… .take(MAX_MINI_PROGRAMS)");
        TitleBarRightButtonView.AnonymousClass1<R> map = take.map(IsOverlapping.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "miniProgramData.getMiniP…           .sortByTitle()");
        TitleBarRightButtonView.AnonymousClass1<R> map2 = map.map(new setMax(this));
        Intrinsics.checkNotNullExpressionValue(map2, "miniProgramData.getMiniP…           .modifyIsFav()");
        TitleBarRightButtonView.AnonymousClass1<R> map3 = map2.map(new length(this));
        Intrinsics.checkNotNullExpressionValue(map3, "miniProgramData.getMiniP…           .addLastOpen()");
        return map3;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<BaseGriverNetwork.FacadeProcessor> getMiniProgramScenario() {
        TitleBarRightButtonView.AnonymousClass1<R> map = this.length.length.map(getMax.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "miniProgramData.getMiniP…lue, it.source)\n        }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Unit> setFavoriteMiniPrograms(@NotNull String str, boolean z, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "appId");
        Intrinsics.checkNotNullParameter(list, "allMiniProgramAppIds");
        TitleBarRightButtonView.AnonymousClass1<Unit> flatMap = TitleBarRightButtonView.AnonymousClass1.fromCallable(new equals(this, z, list, str)).flatMap(new toFloatRange(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "Observable.fromCallable …iniPrograms(it)\n        }");
        return flatMap;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Unit> setRecentMiniProgram(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "appId");
        TitleBarRightButtonView.AnonymousClass1<Unit> flatMap = TitleBarRightButtonView.AnonymousClass1.fromCallable(new toIntRange(this, j, str)).flatMap(new isInside(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "Observable.fromCallable …ms(HashMap(it))\n        }");
        return flatMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lid/dana/data/miniprogram/source/MiniProgramEntityRepository$Companion;", "", "()V", "MAX_FAVORITE", "", "MAX_LAST_OPEN", "MAX_MINI_PROGRAMS", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<V> implements Callable<Map<String, ? extends Long>> {
        final /* synthetic */ String getMax;
        final /* synthetic */ getUserAgent getMin;
        final /* synthetic */ long length;

        toIntRange(getUserAgent getuseragent, long j, String str) {
            this.getMin = getuseragent;
            this.length = j;
            this.getMax = str;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMin<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Long) ((Pair) t2).getSecond(), (Long) ((Pair) t).getSecond());
            }
        }

        public final /* synthetic */ Object call() {
            Map max = getUserAgent.setMax(this.getMin);
            max.put(this.getMax, Long.valueOf(this.length));
            return MapsKt.toMap(CollectionsKt.take(CollectionsKt.sortedWith(MapsKt.toList(max), new setMin()), 4));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 4, 2})
    static final class equals<V> implements Callable<List<String>> {
        final /* synthetic */ List getMin;
        final /* synthetic */ getUserAgent length;
        final /* synthetic */ boolean setMax;
        final /* synthetic */ String setMin;

        equals(getUserAgent getuseragent, boolean z, List list, String str) {
            this.length = getuseragent;
            this.setMax = z;
            this.getMin = list;
            this.setMin = str;
        }

        public final /* synthetic */ Object call() {
            List mutableList = CollectionsKt.toMutableList(getUserAgent.length(this.length));
            if (this.setMax) {
                if (!this.getMin.isEmpty()) {
                    CollectionsKt.removeAll(mutableList, new Function1<String, Boolean>(this) {
                        final /* synthetic */ equals this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final /* synthetic */ Object invoke(Object obj) {
                            return Boolean.valueOf(invoke((String) obj));
                        }

                        public final boolean invoke(@NotNull String str) {
                            Intrinsics.checkNotNullParameter(str, "it");
                            return !this.this$0.getMin.contains(str);
                        }
                    });
                }
                if (mutableList.size() < getUserAgent.setMin(this.length).length) {
                    mutableList.add(this.setMin);
                } else {
                    throw new Exception();
                }
            } else {
                mutableList.remove(this.setMin);
            }
            return mutableList;
        }
    }

    public static final /* synthetic */ List length(getUserAgent getuseragent) {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new goBack.setMax(getuseragent.setMin));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …tFavoriteMiniPrograms() }");
        Object blockingFirst = fromCallable.blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "preference.getFavoriteMi…rograms().blockingFirst()");
        return (List) blockingFirst;
    }

    public static final /* synthetic */ getTopRender setMin(getUserAgent getuseragent) {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new runExit.setMax(getuseragent.getMin));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ta::class.java)\n        }");
        Object blockingFirst = fromCallable.onErrorReturn(setMin.setMin).blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "amcsConfigStoreStateEnti…         .blockingFirst()");
        return (getTopRender) blockingFirst;
    }

    public static final /* synthetic */ HashMap setMax(getUserAgent getuseragent) {
        TitleBarRightButtonView.AnonymousClass1 fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new goBack.getMax(getuseragent.setMin));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …getRecentMiniPrograms() }");
        Object blockingFirst = fromCallable.blockingFirst();
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "preference.getRecentMiniPrograms().blockingFirst()");
        return (HashMap) blockingFirst;
    }
}
