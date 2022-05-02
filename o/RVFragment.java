package o;

import android.content.Context;
import android.location.Location;
import androidx.annotation.VisibleForTesting;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.danah5.DanaH5;
import id.dana.data.Source;
import id.dana.data.content.SpaceCode;
import id.dana.data.content.mapper.ContentsMapper;
import id.dana.data.globalsearch.source.network.request.AutoCompleteRequestEntity;
import id.dana.data.globalsearch.source.network.request.ContextConditionEntity;
import id.dana.data.globalsearch.source.network.request.SearchConditionEntity;
import id.dana.data.globalsearch.source.network.request.SearchRequestEntity;
import id.dana.data.globalsearch.source.network.result.AutoCompleteResultEntity;
import id.dana.data.globalsearch.source.network.result.DenomEntity;
import id.dana.data.globalsearch.source.network.result.PaginatorEntity;
import id.dana.data.globalsearch.source.network.result.PaySearchInfoEntity;
import id.dana.data.globalsearch.source.network.result.ProductBizIdEntity;
import id.dana.data.globalsearch.source.network.result.SearchResultEntity;
import id.dana.domain.globalsearch.model.AutoCompleteResult;
import id.dana.domain.globalsearch.model.LatLng;
import id.dana.domain.globalsearch.model.Paginator;
import id.dana.domain.globalsearch.model.PaySearchInfo;
import id.dana.domain.globalsearch.model.SearchResultResponse;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.AppMsgReceiver;
import o.DefaultEmbedViewManager;
import o.IPCParameter;
import o.RenderLoadingStatusChangePoint;
import o.TitleBarRightButtonView;
import o.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001uBg\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0(2\u0006\u0010-\u001a\u00020.H\u0002J\u001e\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00104\u001a\u000200H\u0002J\b\u00105\u001a\u000206H\u0002J\u0014\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e020(H\u0002J\u001e\u00108\u001a\b\u0012\u0004\u0012\u0002000(2\u0006\u00104\u001a\u0002002\u0006\u00109\u001a\u00020\u001eH\u0002J&\u0010:\u001a\b\u0012\u0004\u0012\u00020;0(2\u0006\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>H\u0016J\u001a\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d0(H\u0002J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020A0(H\u0016J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J*\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D020(2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001e022\u0006\u0010F\u001a\u00020>H\u0016J\b\u0010G\u001a\u00020HH\u0002J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020.0(H\u0002J\u0014\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e020(H\u0016J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001e0(H\u0016J*\u0010L\u001a$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020N0Mj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020N`O0(H\u0016J6\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0(2\u0006\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u00109\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020)H\u0002JD\u0010P\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Q020(2\u0006\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001e022\b\u0010T\u001a\u0004\u0018\u00010UH\u0016J\u0010\u0010V\u001a\n X*\u0004\u0018\u00010W0WH\u0002J\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020)0(H\u0016J\u001c\u0010Z\u001a\b\u0012\u0004\u0012\u00020[022\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020]02H\u0002J\u0012\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0002J\u001c\u0010b\u001a\b\u0012\u0004\u0012\u00020[022\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020]02H\u0007J\b\u0010c\u001a\u00020dH\u0002J\b\u0010e\u001a\u00020dH\u0002J\u001e\u0010f\u001a\b\u0012\u0004\u0012\u00020\u001e0(2\u0006\u0010-\u001a\u00020.2\u0006\u0010g\u001a\u00020>H\u0002J\u0016\u0010h\u001a\b\u0012\u0004\u0012\u00020i0(2\u0006\u0010j\u001a\u00020)H\u0016J.\u0010k\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010l\u001a\u00020N2\u0006\u0010g\u001a\u00020>2\u000e\u0010m\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u000102H\u0002J\u001e\u0010n\u001a\b\u0012\u0004\u0012\u00020i0(2\u0006\u0010<\u001a\u00020\u001e2\u0006\u0010o\u001a\u00020NH\u0016J\u0016\u0010p\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010q\u001a\u00020)H\u0016J\u0010\u0010r\u001a\u00020;2\u0006\u0010s\u001a\u00020tH\u0007R<\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020%@BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006v"}, d2 = {"Lid/dana/data/globalsearch/GlobalSearchEntityRepository;", "Lid/dana/data/base/AuthenticatedEntityRepository;", "Lid/dana/domain/globalsearch/GlobalSearchRepository;", "context", "Landroid/content/Context;", "globalSearchEntityDataFactory", "Lid/dana/data/globalsearch/source/GlobalSearchEntityDataFactory;", "configEntityDataFactory", "Lid/dana/data/config/source/ConfigEntityDataFactory;", "globalSearchCacheEntityDataFactory", "Lid/dana/data/globalsearch/source/GlobalSearchCacheEntityDataFactory;", "servicesEntityRepository", "Lid/dana/data/services/repository/ServicesEntityRepository;", "preferenceLocationPermissionSuggestionEntityData", "Lid/dana/data/globalsearch/source/local/PreferenceLocationPermissionSuggestionEntityData;", "contentDeliveryEntityDataFactory", "Lid/dana/data/content/source/ContentDeliveryEntityDataFactory;", "contentsMapper", "Lid/dana/data/content/mapper/ContentsMapper;", "accountEntityDataFactory", "Lid/dana/data/account/repository/source/AccountEntityDataFactory;", "errorConfigFactory", "Lid/dana/data/errorconfig/ErrorConfigFactory;", "guardFacade", "Lid/dana/data/foundation/facade/SecurityGuardFacade;", "loginEntityDataFactory", "Lid/dana/data/login/source/LoginEntityDataFactory;", "(Landroid/content/Context;Lid/dana/data/globalsearch/source/GlobalSearchEntityDataFactory;Lid/dana/data/config/source/ConfigEntityDataFactory;Lid/dana/data/globalsearch/source/GlobalSearchCacheEntityDataFactory;Lid/dana/data/services/repository/ServicesEntityRepository;Lid/dana/data/globalsearch/source/local/PreferenceLocationPermissionSuggestionEntityData;Lid/dana/data/content/source/ContentDeliveryEntityDataFactory;Lid/dana/data/content/mapper/ContentsMapper;Lid/dana/data/account/repository/source/AccountEntityDataFactory;Lid/dana/data/errorconfig/ErrorConfigFactory;Lid/dana/data/foundation/facade/SecurityGuardFacade;Lid/dana/data/login/source/LoginEntityDataFactory;)V", "<set-?>", "", "", "Lid/dana/domain/featureconfig/model/GlobalSearchCategory;", "availableCategories", "getAvailableCategories", "()Ljava/util/Map;", "setAvailableCategories", "(Ljava/util/Map;)V", "Lid/dana/domain/globalsearch/model/LatLng;", "latestLocation", "shouldSuggestLocationPermissionDialog", "Lio/reactivex/Observable;", "", "getShouldSuggestLocationPermissionDialog", "()Lio/reactivex/Observable;", "checkPopularSearchPlaceholderLastIndex", "popularSearchCache", "Lid/dana/data/globalsearch/model/PopularSearchCache;", "compareWithConfig", "Lid/dana/data/globalsearch/source/network/result/SearchResultEntity;", "thirdPartyService", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "searchResult", "createContentDelivery", "Lid/dana/data/content/source/ContentDeliveryEntityData;", "fetchPopularSearchFromNetwork", "filterService", "category", "getAutoComplete", "Lid/dana/domain/globalsearch/model/AutoCompleteResult;", "keyword", "page", "", "size", "getGlobalSearchConfig", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "getHintSwipeVisibilityState", "getHistoricalSku", "Lid/dana/domain/globalsearch/model/ProductBizId;", "profileKeys", "profileKeyMaxResult", "getLocalCacheEntityData", "Lid/dana/data/globalsearch/GlobalSearchCacheEntityData;", "getLocalPopularSearchPlaceholder", "getPopularSearch", "getPopularSearchPlaceholder", "getRecentSearch", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getSearchResult", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "requiresLocationPermission", "categories", "location", "Landroid/location/Location;", "getSplitConfigEntityData", "Lid/dana/data/config/source/ConfigEntityData;", "kotlin.jvm.PlatformType", "isFeatureGlobalSearchEnable", "mapAutoCompleteResultList", "Lid/dana/domain/globalsearch/model/PaySearchInfo;", "searchResultList", "Lid/dana/data/globalsearch/source/network/result/PaySearchInfoEntity;", "mapPaginatorResult", "Lid/dana/domain/globalsearch/model/Paginator;", "paginatorEntity", "Lid/dana/data/globalsearch/source/network/result/PaginatorEntity;", "mapSearchResultList", "mockGlobalSearchEntityData", "Lid/dana/data/globalsearch/GlobalSearchEntityData;", "networkGlobalSearchEntityData", "saveAndReturnPopularSearchPlaceholder", "lastIndex", "saveLocationPermissionSuggestionState", "", "neverShow", "savePopularSearchPlaceholder", "lastFetchDate", "popularSearch", "saveRecentSearch", "timeSearch", "setHintSwipeVisibilityState", "isVisible", "transformAutoCompleteResult", "entity", "Lid/dana/data/globalsearch/source/network/result/AutoCompleteResultEntity;", "Companion", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class RVFragment extends setMinProgress implements RenderLoadingStatusChangePoint.LoadingStatusChangeListener {
    @NotNull
    public static final getMin setMin = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public final ContentsMapper FastBitmap$CoordinateSystem;
    private final IPCParameter.AnonymousClass1 IsOverlapping;
    private final getFontBar equals;
    /* access modifiers changed from: private */
    public LatLng getMax = new LatLng(0.0d, 0.0d, 3, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final Context getMin;
    private final setPage isInside;
    private final setShouldResumeWebView length;
    @NotNull
    private Map<String, setVerticalScrollBarEnabled> setMax = MapsKt.emptyMap();
    private final onCallBack toFloatRange;
    private final AnonymousClass2 toIntRange;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012D\u0010\u0005\u001a@\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u001e\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "", "Lid/dana/domain/featureconfig/model/GlobalSearchCategory;", "kotlin.jvm.PlatformType", "it", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping<T, R> implements RedDotDrawable<Map<String, setVerticalScrollBarEnabled>, Map<String, ? extends setVerticalScrollBarEnabled>> {
        final /* synthetic */ RVFragment length;

        IsOverlapping(RVFragment rVFragment) {
            this.length = rVFragment;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            Intrinsics.checkNotNullParameter(map, "it");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (((setVerticalScrollBarEnabled) entry.getValue()).getEnable()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Map map2 = linkedHashMap;
            this.length.getMax((Map<String, setVerticalScrollBarEnabled>) map2);
            return map2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "Lid/dana/domain/globalsearch/model/ProductBizId;", "productBizIds", "Lid/dana/data/globalsearch/source/network/result/ProductBizIdEntity;", "productCode", "", "", "Lid/dana/data/exploredana/repository/source/network/result/ProductMappingEntityResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class equals<T1, T2, R> implements removeNode<List<? extends ProductBizIdEntity>, Map<String, ? extends addDatas2Performance>, List<? extends performRequest>> {
        public static final equals setMin = new equals();

        equals() {
        }

        public final /* synthetic */ Object setMax(Object obj, Object obj2) {
            String str;
            GriverNetworkPermissionExtension griverNetworkPermissionExtension;
            String str2;
            String productDesc;
            List list = (List) obj;
            Map map = (Map) obj2;
            Intrinsics.checkNotNullParameter(list, "productBizIds");
            Intrinsics.checkNotNullParameter(map, "productCode");
            Iterable<ProductBizIdEntity> iterable = list;
            Iterator it = iterable.iterator();
            while (true) {
                str = "";
                if (!it.hasNext()) {
                    break;
                }
                ProductBizIdEntity productBizIdEntity = (ProductBizIdEntity) it.next();
                addDatas2Performance adddatas2performance = (addDatas2Performance) map.get(productBizIdEntity.getProfileKey());
                if (adddatas2performance == null || (str2 = adddatas2performance.getProductCode()) == null) {
                    str2 = str;
                }
                productBizIdEntity.setProductCode(str2);
                addDatas2Performance adddatas2performance2 = (addDatas2Performance) map.get(productBizIdEntity.getProfileKey());
                if (!(adddatas2performance2 == null || (productDesc = adddatas2performance2.getProductDesc()) == null)) {
                    str = productDesc;
                }
                productBizIdEntity.setProductDesc(str);
            }
            Intrinsics.checkNotNullParameter(list, "$this$toProductBizId");
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            for (ProductBizIdEntity productBizIdEntity2 : iterable) {
                Intrinsics.checkNotNullParameter(productBizIdEntity2, "$this$toProductBizId");
                String bizId = productBizIdEntity2.getBizId();
                String str3 = bizId == null ? str : bizId;
                String secondaryBizId = productBizIdEntity2.getSecondaryBizId();
                String str4 = secondaryBizId == null ? str : secondaryBizId;
                String transactionDate = productBizIdEntity2.getTransactionDate();
                String str5 = transactionDate == null ? str : transactionDate;
                String customerName = productBizIdEntity2.getCustomerName();
                String str6 = customerName == null ? str : customerName;
                String goodsId = productBizIdEntity2.getGoodsId();
                String str7 = goodsId == null ? str : goodsId;
                String goodsTitle = productBizIdEntity2.getGoodsTitle();
                String str8 = goodsTitle == null ? str : goodsTitle;
                String goodsType = productBizIdEntity2.getGoodsType();
                String str9 = goodsType == null ? str : goodsType;
                DenomEntity denom = productBizIdEntity2.getDenom();
                if (denom != null) {
                    Intrinsics.checkNotNullParameter(denom, "$this$toDenom");
                    String amount = denom.getAmount();
                    if (amount == null) {
                        amount = str;
                    }
                    String currency = denom.getCurrency();
                    if (currency == null) {
                        currency = str;
                    }
                    griverNetworkPermissionExtension = new GriverNetworkPermissionExtension(amount, currency);
                } else {
                    griverNetworkPermissionExtension = new GriverNetworkPermissionExtension((String) null, (String) null, 3, (DefaultConstructorMarker) null);
                }
                String provider = productBizIdEntity2.getProvider();
                String str10 = provider == null ? str : provider;
                String providerName = productBizIdEntity2.getProviderName();
                String str11 = providerName == null ? str : providerName;
                Boolean isGoodsActive = productBizIdEntity2.isGoodsActive();
                boolean booleanValue = isGoodsActive != null ? isGoodsActive.booleanValue() : false;
                String productCode = productBizIdEntity2.getProductCode();
                String str12 = productCode == null ? str : productCode;
                String productDesc2 = productBizIdEntity2.getProductDesc();
                String str13 = productDesc2 == null ? str : productDesc2;
                String profileKey = productBizIdEntity2.getProfileKey();
                String str14 = profileKey == null ? str : profileKey;
                Map<String, Object> extendInfo = productBizIdEntity2.getExtendInfo();
                if (extendInfo == null) {
                    extendInfo = MapsKt.emptyMap();
                }
                arrayList.add(new performRequest(str3, str4, str5, str6, str7, str8, str9, griverNetworkPermissionExtension, str10, str11, booleanValue, str12, str13, str14, extendInfo));
            }
            return CollectionsKt.sortedWith((List) arrayList, new setMax());
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, k = 3, mv = {1, 4, 2})
        public static final class setMax<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((performRequest) t).getTransactionDate(), ((performRequest) t2).getTransactionDate());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lid/dana/data/globalsearch/source/network/result/SearchResultEntity;", "kotlin.jvm.PlatformType", "it", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class getMax<T, R> implements RedDotDrawable<List<? extends ThirdPartyServiceResponse>, SearchResultEntity> {
        final /* synthetic */ SearchResultEntity getMax;
        final /* synthetic */ RVFragment getMin;

        getMax(RVFragment rVFragment, SearchResultEntity searchResultEntity) {
            this.getMin = rVFragment;
            this.getMax = searchResultEntity;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                if (((ThirdPartyServiceResponse) next).isEnable()) {
                    arrayList.add(next);
                }
            }
            return RVFragment.getMin((List) arrayList, this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "", "kotlin.jvm.PlatformType", "popularSearchCache", "Lid/dana/data/globalsearch/model/PopularSearchCache;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<T, R> implements RedDotDrawable<DefaultEmbedViewManager.Message, TitleBarRightButtonView.AnonymousClass4<? extends String>> {
        final /* synthetic */ RVFragment getMin;

        hashCode(RVFragment rVFragment) {
            this.getMin = rVFragment;
        }

        public final /* synthetic */ Object apply(Object obj) {
            TitleBarRightButtonView.AnonymousClass1 r6;
            DefaultEmbedViewManager.Message message = (DefaultEmbedViewManager.Message) obj;
            Intrinsics.checkNotNullParameter(message, "popularSearchCache");
            if (message.setMin == -1 || PrepareCallback.isPastToday(message.setMin)) {
                r6 = RVFragment.setMin(this.getMin).flatMap(new RedDotDrawable<List<? extends String>, TitleBarRightButtonView.AnonymousClass4<? extends String>>(this) {
                    final /* synthetic */ hashCode length;

                    {
                        this.length = r1;
                    }

                    public final /* synthetic */ Object apply(Object obj) {
                        List list = (List) obj;
                        Intrinsics.checkNotNullParameter(list, "result");
                        this.length.getMin.setMax(System.currentTimeMillis(), 1, list).blockingFirst();
                        return TitleBarRightButtonView.AnonymousClass1.just(list.get(0));
                    }
                });
            } else {
                r6 = RVFragment.length(this.getMin, message);
            }
            return r6;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "Lid/dana/domain/promotion/CdpContent;", "kotlin.jvm.PlatformType", "", "sourceItem", "Lid/dana/data/content/source/network/result/SpaceRpcResult;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class length<T, R> implements RedDotDrawable<setNodeId, List<getDefaultProxy>> {
        final /* synthetic */ RVFragment getMin;

        length(RVFragment rVFragment) {
            this.getMin = rVFragment;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return (List) this.getMin.FastBitmap$CoordinateSystem.apply((setNodeId) obj);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T, R> implements RedDotDrawable<String, List<? extends String>> {
        public static final setMax getMin = new setMax();

        setMax() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            String substring = str.substring(1, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Iterable<String> split$default = StringsKt.split$default((CharSequence) substring, new String[]{","}, false, 0, 6, (Object) null);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
            for (String str2 : split$default) {
                if (str2 != null) {
                    arrayList.add(StringsKt.trim((CharSequence) str2).toString());
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012(\u0010\u0003\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lid/dana/domain/promotion/CdpContent;", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T, R> implements RedDotDrawable<List<getDefaultProxy>, String> {
        public static final setMin length = new setMin();

        setMin() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            Object obj2 = list.get(0);
            Intrinsics.checkNotNullExpressionValue(obj2, "it[0]");
            return ((getDefaultProxy) obj2).getContentValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange<T, R> implements RedDotDrawable<String, List<? extends String>> {
        public static final toDoubleRange getMin = new toDoubleRange();

        toDoubleRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "it");
            String substring = str.substring(1, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            Iterable<String> split$default = StringsKt.split$default((CharSequence) substring, new String[]{","}, false, 0, 6, (Object) null);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
            for (String str2 : split$default) {
                if (str2 != null) {
                    arrayList.add(StringsKt.trim((CharSequence) str2).toString());
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012(\u0010\u0003\u001a$\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u0005 \u0002*\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00050\u00050\u00060\u0004H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "Lid/dana/domain/promotion/CdpContent;", "", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange<T, R> implements RedDotDrawable<List<getDefaultProxy>, String> {
        public static final toFloatRange setMin = new toFloatRange();

        toFloatRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "it");
            Object obj2 = list.get(0);
            Intrinsics.checkNotNullExpressionValue(obj2, "it[0]");
            return ((getDefaultProxy) obj2).getContentValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/data/globalsearch/source/network/result/ProductBizIdEntity;", "it", "Lid/dana/data/globalsearch/source/network/result/HistoricalSkuResultEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange<T, R> implements RedDotDrawable<useSuperSplash, List<? extends ProductBizIdEntity>> {
        public static final toIntRange length = new toIntRange();

        toIntRange() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            useSuperSplash usesupersplash = (useSuperSplash) obj;
            Intrinsics.checkNotNullParameter(usesupersplash, "it");
            return usesupersplash.getBizIds();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "kotlin.jvm.PlatformType", "it", "Lid/dana/data/globalsearch/source/network/result/SearchResultEntity;", "apply"}, k = 3, mv = {1, 4, 2})
    static final class toString<T, R> implements RedDotDrawable<SearchResultEntity, SearchResultResponse> {
        final /* synthetic */ boolean getMin;
        final /* synthetic */ RVFragment setMax;

        toString(RVFragment rVFragment, boolean z) {
            this.setMax = rVFragment;
            this.getMin = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SearchResultEntity searchResultEntity = (SearchResultEntity) obj;
            Intrinsics.checkNotNullParameter(searchResultEntity, "it");
            return new SearchResultResponse(RVFragment.setMin(searchResultEntity.getSearchResultList()), RVFragment.length(searchResultEntity.getPaginator()), this.getMin);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "kotlin.jvm.PlatformType", "responses", "apply"}, k = 3, mv = {1, 4, 2})
    static final class valueOf<T, R> implements RedDotDrawable<List<? extends SearchResultResponse>, List<? extends SearchResultResponse>> {
        public static final valueOf setMin = new valueOf();

        valueOf() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "responses");
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                Collection searchResultList = ((SearchResultResponse) next).getSearchResultList();
                if (!(searchResultList == null || searchResultList.isEmpty())) {
                    arrayList.add(next);
                }
            }
            return (List) arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lio/reactivex/ObservableSource;", "Lid/dana/data/globalsearch/source/network/result/SearchResultEntity;", "kotlin.jvm.PlatformType", "it", "apply"}, k = 3, mv = {1, 4, 2})
    static final class values<T, R> implements RedDotDrawable<SearchResultEntity, TitleBarRightButtonView.AnonymousClass4<? extends SearchResultEntity>> {
        final /* synthetic */ RVFragment getMax;
        final /* synthetic */ String setMin;

        values(RVFragment rVFragment, String str) {
            this.getMax = rVFragment;
            this.setMin = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            SearchResultEntity searchResultEntity = (SearchResultEntity) obj;
            Intrinsics.checkNotNullParameter(searchResultEntity, "it");
            return RVFragment.getMin(this.getMax, searchResultEntity, this.setMin);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public RVFragment(@NotNull Context context, @NotNull setShouldResumeWebView setshouldresumewebview, @NotNull onCallBack oncallback, @NotNull setPage setpage, @NotNull IPCParameter.AnonymousClass1 r6, @NotNull AnonymousClass2 r7, @NotNull getFontBar getfontbar, @NotNull ContentsMapper contentsMapper, @NotNull DialogLayout dialogLayout, @NotNull getAppLaunchParams getapplaunchparams, @NotNull BackKeyDownPoint backKeyDownPoint, @NotNull b.AnonymousClass3 r13) {
        super(dialogLayout, r13, backKeyDownPoint, getapplaunchparams);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(setshouldresumewebview, "globalSearchEntityDataFactory");
        Intrinsics.checkNotNullParameter(oncallback, "configEntityDataFactory");
        Intrinsics.checkNotNullParameter(setpage, "globalSearchCacheEntityDataFactory");
        Intrinsics.checkNotNullParameter(r6, "servicesEntityRepository");
        Intrinsics.checkNotNullParameter(r7, "preferenceLocationPermissionSuggestionEntityData");
        Intrinsics.checkNotNullParameter(getfontbar, "contentDeliveryEntityDataFactory");
        Intrinsics.checkNotNullParameter(contentsMapper, "contentsMapper");
        Intrinsics.checkNotNullParameter(dialogLayout, "accountEntityDataFactory");
        Intrinsics.checkNotNullParameter(getapplaunchparams, "errorConfigFactory");
        Intrinsics.checkNotNullParameter(backKeyDownPoint, "guardFacade");
        Intrinsics.checkNotNullParameter(r13, "loginEntityDataFactory");
        this.getMin = context;
        this.length = setshouldresumewebview;
        this.toFloatRange = oncallback;
        this.isInside = setpage;
        this.IsOverlapping = r6;
        this.toIntRange = r7;
        this.equals = getfontbar;
        this.FastBitmap$CoordinateSystem = contentsMapper;
    }

    @VisibleForTesting
    public final synchronized void getMax(@NotNull Map<String, setVerticalScrollBarEnabled> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.setMax = map;
    }

    /* access modifiers changed from: package-private */
    public static Paginator length(PaginatorEntity paginatorEntity) {
        return new Paginator(paginatorEntity != null ? paginatorEntity.getOffset() : null, paginatorEntity != null ? paginatorEntity.getPageNum() : null, paginatorEntity != null ? paginatorEntity.getTotalCount() : null, paginatorEntity != null ? paginatorEntity.getTotalPage() : null, paginatorEntity != null ? paginatorEntity.getPageSize() : null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
    public static final class invoke<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues((Long) ((Pair) t2).getSecond(), (Long) ((Pair) t).getSecond());
        }
    }

    @NotNull
    @VisibleForTesting
    public static List<PaySearchInfo> setMin(@NotNull List<PaySearchInfoEntity> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        List<PaySearchInfoEntity> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "searchResultList");
        Iterable<PaySearchInfoEntity> iterable = list2;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (PaySearchInfoEntity paySearchInfoEntity : iterable) {
            String address = paySearchInfoEntity.getAddress();
            String str9 = address == null ? "" : address;
            String category = paySearchInfoEntity.getCategory();
            if (category == null) {
                str = "";
            } else {
                str = category;
            }
            String description = paySearchInfoEntity.getDescription();
            if (description == null) {
                str2 = "";
            } else {
                str2 = description;
            }
            String id2 = paySearchInfoEntity.getId();
            if (id2 == null) {
                str3 = "";
            } else {
                str3 = id2;
            }
            Map<String, String> info = paySearchInfoEntity.getInfo();
            if (info == null) {
                info = MapsKt.emptyMap();
            }
            Map<String, String> map = info;
            String infoType = paySearchInfoEntity.getInfoType();
            if (infoType == null) {
                str4 = "";
            } else {
                str4 = infoType;
            }
            String logo = paySearchInfoEntity.getLogo();
            if (logo == null) {
                str5 = "";
            } else {
                str5 = logo;
            }
            List<String> mcc = paySearchInfoEntity.getMcc();
            if (mcc == null) {
                mcc = CollectionsKt.emptyList();
            }
            List<String> list3 = mcc;
            String name = paySearchInfoEntity.getName();
            if (name == null) {
                str6 = "";
            } else {
                str6 = name;
            }
            Double rating = paySearchInfoEntity.getRating();
            double doubleValue = rating != null ? rating.doubleValue() : 0.0d;
            Integer score = paySearchInfoEntity.getScore();
            int intValue = score != null ? score.intValue() : 0;
            String subCategory = paySearchInfoEntity.getSubCategory();
            if (subCategory == null) {
                str7 = "";
            } else {
                str7 = subCategory;
            }
            String tag = paySearchInfoEntity.getTag();
            if (tag == null) {
                str8 = "";
            } else {
                str8 = tag;
            }
            Map<String, String> url = paySearchInfoEntity.getUrl();
            Map<String, String> location = paySearchInfoEntity.getLocation();
            arrayList.add(new PaySearchInfo(str3, str6, list3, str, str7, url, str5, str8, str2, intValue, doubleValue, str9, str4, location != null ? new LatLng(location.get("lat"), location.get("lon")) : null, (LatLng) null, map, 16384, (DefaultConstructorMarker) null));
        }
        return (List) arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lid/dana/domain/globalsearch/model/AutoCompleteResult;", "p1", "Lid/dana/data/globalsearch/source/network/result/AutoCompleteResultEntity;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class isInside extends FunctionReferenceImpl implements Function1<AutoCompleteResultEntity, AutoCompleteResult> {
        isInside(RVFragment rVFragment) {
            super(1, rVFragment, RVFragment.class, "transformAutoCompleteResult", "transformAutoCompleteResult(Lid/dana/data/globalsearch/source/network/result/AutoCompleteResultEntity;)Lid/dana/domain/globalsearch/model/AutoCompleteResult;", 0);
        }

        @NotNull
        public final AutoCompleteResult invoke(@NotNull AutoCompleteResultEntity autoCompleteResultEntity) {
            Intrinsics.checkNotNullParameter(autoCompleteResultEntity, "p1");
            Intrinsics.checkNotNullParameter(autoCompleteResultEntity, "entity");
            return new AutoCompleteResult(RVFragment.getMin(autoCompleteResultEntity.getSearchResultList()), RVFragment.length(autoCompleteResultEntity.getPaginator()), autoCompleteResultEntity.success);
        }
    }

    static List<PaySearchInfo> getMin(List<PaySearchInfoEntity> list) {
        Iterable<PaySearchInfoEntity> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (PaySearchInfoEntity paySearchInfoEntity : iterable) {
            PaySearchInfo paySearchInfo = r3;
            PaySearchInfo paySearchInfo2 = new PaySearchInfo((String) null, (String) null, (List) null, (String) null, (String) null, (Map) null, (String) null, (String) null, (String) null, 0, 0.0d, (String) null, (String) null, (LatLng) null, (LatLng) null, (Map) null, 65535, (DefaultConstructorMarker) null);
            String address = paySearchInfoEntity.getAddress();
            String str = "";
            if (address == null) {
                address = str;
            }
            PaySearchInfo paySearchInfo3 = paySearchInfo;
            paySearchInfo3.setAddress(address);
            String category = paySearchInfoEntity.getCategory();
            if (category == null) {
                category = str;
            }
            paySearchInfo3.setCategory(category);
            String description = paySearchInfoEntity.getDescription();
            if (description == null) {
                description = str;
            }
            paySearchInfo3.setDescription(description);
            String id2 = paySearchInfoEntity.getId();
            if (id2 == null) {
                id2 = str;
            }
            paySearchInfo3.setId(id2);
            Map<String, String> info = paySearchInfoEntity.getInfo();
            if (info == null) {
                info = MapsKt.emptyMap();
            }
            paySearchInfo3.setInfo(info);
            String infoType = paySearchInfoEntity.getInfoType();
            if (infoType == null) {
                infoType = str;
            }
            paySearchInfo3.setInfoType(infoType);
            String logo = paySearchInfoEntity.getLogo();
            if (logo == null) {
                logo = str;
            }
            paySearchInfo3.setLogo(logo);
            List<String> mcc = paySearchInfoEntity.getMcc();
            if (mcc == null) {
                mcc = CollectionsKt.emptyList();
            }
            paySearchInfo3.setMcc(mcc);
            String name = paySearchInfoEntity.getName();
            if (name == null) {
                name = str;
            }
            paySearchInfo3.setName(name);
            Double rating = paySearchInfoEntity.getRating();
            paySearchInfo3.setRating(rating != null ? rating.doubleValue() : 0.0d);
            Integer score = paySearchInfoEntity.getScore();
            paySearchInfo3.setScore(score != null ? score.intValue() : 0);
            String subCategory = paySearchInfoEntity.getSubCategory();
            if (subCategory == null) {
                subCategory = str;
            }
            paySearchInfo3.setSubCategory(subCategory);
            String tag = paySearchInfoEntity.getTag();
            if (tag != null) {
                str = tag;
            }
            paySearchInfo3.setTag(str);
            paySearchInfo3.setUrlMap(paySearchInfoEntity.getUrl());
            arrayList.add(paySearchInfo3);
        }
        return (List) arrayList;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Unit> saveRecentSearch(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        HashMap blockingFirst = getRecentSearch().blockingFirst();
        if (j != -1) {
            Intrinsics.checkNotNullExpressionValue(blockingFirst, "recentSearch");
            blockingFirst.put(str, Long.valueOf(j));
        } else {
            blockingFirst.remove(str);
        }
        Intrinsics.checkNotNullExpressionValue(blockingFirst, "recentSearch");
        return this.isInside.setMax.getMin(new HashMap(MapsKt.toMap(CollectionsKt.take(CollectionsKt.sortedWith(MapsKt.toList(blockingFirst), new invoke()), 5))));
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Unit> saveLocationPermissionSuggestionState(boolean z) {
        TitleBarRightButtonView.AnonymousClass1<Unit> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new AnonymousClass2.length(this.toIntRange, z));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …ION, neverShow)\n        }");
        return fromCallable;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getShouldSuggestLocationPermissionDialog() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> fromCallable = TitleBarRightButtonView.AnonymousClass1.fromCallable(new AnonymousClass2.setMin(this.toIntRange));
        Intrinsics.checkNotNullExpressionValue(fromCallable, "Observable.fromCallable …MISSION, false)\n        }");
        return fromCallable;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/data/globalsearch/GlobalSearchEntityRepository$Companion;", "", "()V", "GLOBAL_SEARCH_HINT_SWIPE_VISIBILITY_KEY", "", "data_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<SearchResultResponse>> getSearchResult(@NotNull String str, int i, int i2, @NotNull List<String> list, @Nullable Location location) {
        TitleBarRightButtonView.AnonymousClass1<R> r0;
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        Intrinsics.checkNotNullParameter(list, "categories");
        if (this.setMax.isEmpty()) {
            AppMsgReceiver.AnonymousClass2 createData = this.toFloatRange.createData(Source.SPLIT);
            Intrinsics.checkNotNullExpressionValue(createData, "getSplitConfigEntityData()");
            r0 = createData.getFeatureGlobalSearchCategories().map(new IsOverlapping(this));
            Intrinsics.checkNotNullExpressionValue(r0, "getSplitConfigEntityData…es = this }\n            }");
        } else {
            r0 = TitleBarRightButtonView.AnonymousClass1.just(this.setMax);
            Intrinsics.checkNotNullExpressionValue(r0, "Observable.just(availableCategories)");
        }
        TitleBarRightButtonView.AnonymousClass1<R> map = r0.flatMap(new RVFragment$Mean$Arithmetic(this, list, str, i, i2, location)).map(valueOf.setMin);
        Intrinsics.checkNotNullExpressionValue(map, "getAvailableCategories()…tList.isNullOrEmpty() } }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<AutoCompleteResult> getAutoComplete(@NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        TitleBarRightButtonView.AnonymousClass1<R> map = this.length.setMin.getMin(new AutoCompleteRequestEntity((List<ContextConditionEntity>) null, "NAME", str, i, i2)).map(new IFragmentManager(new isInside(this)));
        Intrinsics.checkNotNullExpressionValue(map, "networkGlobalSearchEntit…nsformAutoCompleteResult)");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setHintSwipeVisibilityState(boolean z) {
        return this.isInside.setMax.setMax("GLOBAL_SEARCH_HINT_SWIPE_VISIBILITY", Boolean.valueOf(z));
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> getHintSwipeVisibilityState() {
        TitleBarRightButtonView.AnonymousClass1<Boolean> onErrorReturnItem = this.isInside.setMax.setMin("GLOBAL_SEARCH_HINT_SWIPE_VISIBILITY", Boolean.TYPE).onErrorReturnItem(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(onErrorReturnItem, "getLocalCacheEntityData(… .onErrorReturnItem(true)");
        return onErrorReturnItem;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<String>> getPopularSearch() {
        isTaskRoot createData = this.equals.createData("network");
        Intrinsics.checkNotNullExpressionValue(createData, "contentDeliveryEntityDat…reateData(Source.NETWORK)");
        TitleBarRightButtonView.AnonymousClass1<R> map = authenticatedRequest(createData.get(SpaceCode.GLOBAL_SEARCH_POPULAR)).map(new RVFragment$FastBitmap$CoordinateSystem(this)).map(toFloatRange.setMin).map(toDoubleRange.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "spaceResult.map { it[0].…ar.trim() }\n            }");
        return map;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<String> getPopularSearchPlaceholder() {
        TitleBarRightButtonView.AnonymousClass1<R> flatMap = this.isInside.setMax.length().flatMap(new hashCode(this));
        Intrinsics.checkNotNullExpressionValue(flatMap, "getLocalPopularSearchPla…)\n            }\n        }");
        return flatMap;
    }

    private final TitleBarRightButtonView.AnonymousClass1<String> getMin(DefaultEmbedViewManager.Message message, int i) {
        setMax(message.setMin, i + 1, message.length);
        TitleBarRightButtonView.AnonymousClass1<String> just = TitleBarRightButtonView.AnonymousClass1.just(message.length.get(i));
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(popularS…popularSearch[lastIndex])");
        return just;
    }

    /* access modifiers changed from: private */
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> setMax(long j, int i, List<String> list) {
        triggerPreSnapshot triggerpresnapshot = this.isInside.setMax;
        if (list == null) {
            list = CollectionsKt.emptyList();
        }
        return triggerpresnapshot.setMax("POPULAR_SEARCH_PLACEHOLDER", new DefaultEmbedViewManager.Message(j, i, list));
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<HashMap<String, Long>> getRecentSearch() {
        return this.isInside.setMax.setMin();
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<APWebViewClient> getGlobalSearchConfig() {
        AppMsgReceiver.AnonymousClass2 createData = this.toFloatRange.createData(Source.SPLIT);
        Intrinsics.checkNotNullExpressionValue(createData, "getSplitConfigEntityData()");
        TitleBarRightButtonView.AnonymousClass1<APWebViewClient> globalSearchConfig = createData.getGlobalSearchConfig();
        Intrinsics.checkNotNullExpressionValue(globalSearchConfig, "getSplitConfigEntityData().globalSearchConfig");
        return globalSearchConfig;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<List<performRequest>> getHistoricalSku(@NotNull List<String> list, int i) {
        Intrinsics.checkNotNullParameter(list, "profileKeys");
        TitleBarRightButtonView.AnonymousClass1<R> zipWith = this.length.setMin.setMin(list, i).map(toIntRange.length).zipWith(this.length.setMin.length(), equals.setMin);
        Intrinsics.checkNotNullExpressionValue(zipWith, "networkGlobalSearchEntit…ctionDate }\n            }");
        return zipWith;
    }

    @NotNull
    public final TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGlobalSearchEnable() {
        AppMsgReceiver.AnonymousClass2 createData = this.toFloatRange.createData(Source.SPLIT);
        Intrinsics.checkNotNullExpressionValue(createData, "getSplitConfigEntityData()");
        TitleBarRightButtonView.AnonymousClass1<Boolean> isFeatureGlobalSearchEnabled = createData.isFeatureGlobalSearchEnabled();
        Intrinsics.checkNotNullExpressionValue(isFeatureGlobalSearchEnabled, "getSplitConfigEntityData…eatureGlobalSearchEnabled");
        return isFeatureGlobalSearchEnabled;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 getMin(RVFragment rVFragment, SearchResultEntity searchResultEntity, String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "SERVICE")) {
            TitleBarRightButtonView.AnonymousClass1<R> map = rVFragment.IsOverlapping.getRawServices().map(new getMax(rVFragment, searchResultEntity));
            Intrinsics.checkNotNullExpressionValue(map, "servicesEntityRepository…archResult)\n            }");
            return map;
        }
        TitleBarRightButtonView.AnonymousClass1 just = TitleBarRightButtonView.AnonymousClass1.just(searchResultEntity);
        Intrinsics.checkNotNullExpressionValue(just, "Observable.just(searchResult)");
        return just;
    }

    public static final /* synthetic */ SearchResultEntity getMin(List list, SearchResultEntity searchResultEntity) {
        Iterable<ThirdPartyServiceResponse> iterable = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (ThirdPartyServiceResponse key : iterable) {
            arrayList.add(key.getKey());
        }
        List list2 = (List) arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : searchResultEntity.getSearchResultList()) {
            Iterable iterable2 = list2;
            Map<String, String> info = ((PaySearchInfoEntity) next).getInfo();
            if (CollectionsKt.contains(iterable2, info != null ? info.get(DanaH5.SERVICE_KEY) : null)) {
                arrayList2.add(next);
            }
        }
        return searchResultEntity;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 setMin(RVFragment rVFragment, String str, int i, int i2, String str2, boolean z) {
        TitleBarRightButtonView.AnonymousClass1<R> map = rVFragment.length.setMin.getMin(new SearchRequestEntity(CollectionsKt.listOf(new SearchConditionEntity("NAME", CollectionsKt.listOf(str)), new SearchConditionEntity("CATEGORY", CollectionsKt.listOf(str2))), Integer.valueOf(i), Integer.valueOf(i2))).flatMap(new values(rVFragment, str2)).map(new toString(rVFragment, z));
        Intrinsics.checkNotNullExpressionValue(map, "networkGlobalSearchEntit…Permission)\n            }");
        return map;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 setMin(RVFragment rVFragment) {
        isTaskRoot createData = rVFragment.equals.createData("network");
        Intrinsics.checkNotNullExpressionValue(createData, "contentDeliveryEntityDat…reateData(Source.NETWORK)");
        TitleBarRightButtonView.AnonymousClass1<R> map = rVFragment.authenticatedRequest(createData.get(SpaceCode.GLOBAL_SEARCH_POPULAR)).map(new length(rVFragment)).map(setMin.length).map(setMax.getMin);
        Intrinsics.checkNotNullExpressionValue(map, "authenticatedRequest(cre…ar.trim() }\n            }");
        return map;
    }

    public static final /* synthetic */ TitleBarRightButtonView.AnonymousClass1 length(RVFragment rVFragment, DefaultEmbedViewManager.Message message) {
        if (message.setMax >= message.length.size()) {
            return rVFragment.getMin(message, 0);
        }
        return rVFragment.getMin(message, message.setMax);
    }
}
