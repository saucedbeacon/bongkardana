package o;

import android.content.Context;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.alipayplus.mobile.component.common.facade.base.MobileEnvInfo;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.gson.JsonElement;
import id.dana.data.globalsearch.source.network.request.AutoCompleteRequestEntity;
import id.dana.data.globalsearch.source.network.request.SearchRequestEntity;
import id.dana.data.globalsearch.source.network.result.AutoCompleteResultEntity;
import id.dana.data.globalsearch.source.network.result.SearchResultEntity;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.DefaultEmbedViewManager;
import o.TitleBarRightButtonView;
import o.addAnimatorUpdateListener;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Singleton
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0014J$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001f0\u001e0\u0010H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00102\u0006\u0010\"\u001a\u00020#H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lid/dana/data/globalsearch/source/network/NetworkGlobalSearchEntityData;", "Lid/dana/data/base/SecureBaseNetwork;", "Lid/dana/data/globalsearch/source/network/SearchFacade;", "Lid/dana/data/globalsearch/GlobalSearchEntityData;", "rpcConnector", "Lid/dana/data/rpc/RpcConnector;", "threadExecutor", "Lid/dana/domain/ThreadExecutor;", "apSecurityFacade", "Lid/dana/data/foundation/facade/ApSecurityFacade;", "context", "Landroid/content/Context;", "exploreDanaApi", "Lid/dana/data/exploredana/repository/source/network/ExploreDanaApi;", "(Lid/dana/data/rpc/RpcConnector;Lid/dana/domain/ThreadExecutor;Lid/dana/data/foundation/facade/ApSecurityFacade;Landroid/content/Context;Lid/dana/data/exploredana/repository/source/network/ExploreDanaApi;)V", "getAutoCompleteResult", "Lio/reactivex/Observable;", "Lid/dana/data/globalsearch/source/network/result/AutoCompleteResultEntity;", "autoCompleteRequestEntity", "Lid/dana/data/globalsearch/source/network/request/AutoCompleteRequestEntity;", "getFacadeClass", "Ljava/lang/Class;", "getHistoricalSku", "Lid/dana/data/globalsearch/source/network/result/HistoricalSkuResultEntity;", "profileKeys", "", "", "profileKeyMaxResult", "", "getProductCode", "", "Lid/dana/data/exploredana/repository/source/network/result/ProductMappingEntityResult;", "getSearchResult", "Lid/dana/data/globalsearch/source/network/result/SearchResultEntity;", "searchRequestEntity", "Lid/dana/data/globalsearch/source/network/request/SearchRequestEntity;", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SplashView extends setRepeatCount<LoadingView> implements DefaultEmbedViewManager.Render {
    private final addEvent2Performance getMin;

    final class ExitListener implements TitleBarRightButtonView.AnonymousClass2.AnonymousClass1 {
        public static final ExitListener length = new ExitListener();

        public final void subscribe(TitleBarRightButtonView.AnonymousClass2 r1) {
            SwitchTabPoint.setChangePhoneFinishCallback(new setSelectedPage(r1));
        }
    }

    final class Status implements Callable {
        public static final Status length = new Status();

        public final Object call() {
            return TitleBarRightButtonView.AnonymousClass1.create(ExitListener.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/globalsearch/source/network/result/AutoCompleteResultEntity;", "it", "Lid/dana/data/globalsearch/source/network/SearchFacade;", "kotlin.jvm.PlatformType", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMax<F, S> implements addAnimatorUpdateListener.getMax<LoadingView, AutoCompleteResultEntity> {
        final /* synthetic */ AutoCompleteRequestEntity getMax;

        getMax(AutoCompleteRequestEntity autoCompleteRequestEntity) {
            this.getMax = autoCompleteRequestEntity;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((LoadingView) obj).autoCompleteQuery(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/globalsearch/source/network/result/HistoricalSkuResultEntity;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/globalsearch/source/network/SearchFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class getMin<F, S> implements addAnimatorUpdateListener.getMax<LoadingView, useSuperSplash> {
        final /* synthetic */ int length;
        final /* synthetic */ List setMax;
        final /* synthetic */ SplashView setMin;

        getMin(SplashView splashView, List list, int i) {
            this.setMin = splashView;
            this.setMax = list;
            this.length = i;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            SplashUtils splashUtils = new SplashUtils(this.setMax, this.length);
            splashUtils.envInfo = this.setMin.generateMobileEnvInfo();
            Unit unit = Unit.INSTANCE;
            return ((LoadingView) obj).getHistoricalSku(splashUtils);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/data/globalsearch/source/network/result/SearchResultEntity;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/globalsearch/source/network/SearchFacade;", "processFacade"}, k = 3, mv = {1, 4, 2})
    static final class setMax<F, S> implements addAnimatorUpdateListener.getMax<LoadingView, SearchResultEntity> {
        final /* synthetic */ SearchRequestEntity setMin;

        setMax(SearchRequestEntity searchRequestEntity) {
            this.setMin = searchRequestEntity;
        }

        public final /* synthetic */ Object processFacade(Object obj) {
            return ((LoadingView) obj).searchQuery(this.setMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "Lid/dana/data/exploredana/repository/source/network/result/ProductMappingEntityResult;", "kotlin.jvm.PlatformType", "it", "Lcom/google/gson/JsonElement;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<JsonElement, Map<String, ? extends addDatas2Performance>> {
        public static final setMin getMin = new setMin();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001¨\u0006\u0004¸\u0006\u0000"}, d2 = {"id/dana/domain/extension/JSONExtKt$toMap$2", "Lcom/alibaba/fastjson/TypeReference;", "", "", "domain_release"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends TypeReference<Map<String, ? extends addDatas2Performance>> {
        }

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return getMin((JsonElement) obj);
        }

        private static Map<String, addDatas2Performance> getMin(@NotNull JsonElement jsonElement) {
            Intrinsics.checkNotNullParameter(jsonElement, "it");
            String obj = jsonElement.toString();
            if (obj == null) {
                try {
                    return MapsKt.emptyMap();
                } catch (Exception unused) {
                    return MapsKt.emptyMap();
                }
            } else {
                Object parseObject = JSON.parseObject(new JSONObject(obj).toString(), new getMin(), new Feature[0]);
                Intrinsics.checkNotNullExpressionValue(parseObject, "JSON.parseObject(json.to…nce<Map<String, V>>() {})");
                return (Map) parseObject;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public SplashView(@NotNull setIsUrgentResource setisurgentresource, @NotNull appxLoadFailed appxloadfailed, @NotNull onAppResume onappresume, @NotNull Context context, @NotNull addEvent2Performance addevent2performance) {
        super(setisurgentresource, appxloadfailed, onappresume, context);
        Intrinsics.checkNotNullParameter(setisurgentresource, "rpcConnector");
        Intrinsics.checkNotNullParameter(appxloadfailed, "threadExecutor");
        Intrinsics.checkNotNullParameter(onappresume, "apSecurityFacade");
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(addevent2performance, "exploreDanaApi");
        this.getMin = addevent2performance;
    }

    @NotNull
    public final Class<LoadingView> getFacadeClass() {
        return LoadingView.class;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<SearchResultEntity> getMin(@NotNull SearchRequestEntity searchRequestEntity) {
        Intrinsics.checkNotNullParameter(searchRequestEntity, "searchRequestEntity");
        SearchRequestEntity searchRequestEntity2 = new SearchRequestEntity((List) null, (Integer) null, (Integer) null, 7, (DefaultConstructorMarker) null);
        searchRequestEntity2.setSearchConditionList(searchRequestEntity.getSearchConditionList());
        searchRequestEntity2.setPage(searchRequestEntity.getPage());
        searchRequestEntity2.setSize(searchRequestEntity.getSize());
        searchRequestEntity2.envInfo = generateMobileEnvInfo();
        TitleBarRightButtonView.AnonymousClass1<SearchResultEntity> wrapper = wrapper(new setMax(searchRequestEntity2));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper { it.searchQuery(request) }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AutoCompleteResultEntity> getMin(@NotNull AutoCompleteRequestEntity autoCompleteRequestEntity) {
        Intrinsics.checkNotNullParameter(autoCompleteRequestEntity, "autoCompleteRequestEntity");
        AutoCompleteRequestEntity autoCompleteRequestEntity2 = new AutoCompleteRequestEntity(autoCompleteRequestEntity.getContextConditions(), autoCompleteRequestEntity.getSearchType(), autoCompleteRequestEntity.getSuggestKeyword(), autoCompleteRequestEntity.getPage(), autoCompleteRequestEntity.getSize());
        MobileEnvInfo generateMobileEnvInfo = generateMobileEnvInfo();
        generateMobileEnvInfo.locationInfo = null;
        Intrinsics.checkNotNullExpressionValue(generateMobileEnvInfo, "generateMobileEnvInfo().…tionInfo = null\n        }");
        autoCompleteRequestEntity2.envInfo = generateMobileEnvInfo;
        TitleBarRightButtonView.AnonymousClass1<AutoCompleteResultEntity> wrapper = wrapper(new getMax(autoCompleteRequestEntity2));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n            it…eQuery(request)\n        }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<useSuperSplash> setMin(@NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "profileKeys");
        TitleBarRightButtonView.AnonymousClass1<useSuperSplash> wrapper = wrapper(new getMin(this, list, i));
        Intrinsics.checkNotNullExpressionValue(wrapper, "wrapper {\n        it.get…nvInfo()\n        })\n    }");
        return wrapper;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Map<String, addDatas2Performance>> length() {
        TitleBarRightButtonView.AnonymousClass1<R> map = this.getMin.getProductCode().map(setMin.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "exploreDanaApi.getProduc…{ it.toString().toMap() }");
        return map;
    }
}
