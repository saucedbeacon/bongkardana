package o;

import android.location.Location;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.globalsearch.model.RecentAutoComplete;
import id.dana.globalsearch.model.SearchResultModel;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import o.parentColumns;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchContract;", "", "Companion", "Presenter", "View", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface getAlpha {
    @NotNull
    public static final setMin getMin = setMin.setMax;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J@\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\fH\u0016J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u0003H&J\b\u0010\u001c\u001a\u00020\u0003H&J>\u0010\u001d\u001a*\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00150\u001ej\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0015`\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0015H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\fH&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0003H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0006H&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u0006H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006-À\u0006\u0001"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchContract$Presenter;", "Lid/dana/base/AbstractContractKt$AbstractPresenter;", "consultLocationPermissionSuggestionDialog", "", "onShouldSuggest", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "shouldSuggest", "fetchAutoComplete", "keyword", "", "fetchPopularSearch", "fetchPopularSearchPlaceholder", "fetchRecentSearch", "fetchSearch", "page", "", "size", "categories", "", "location", "Landroid/location/Location;", "fetchSearchByCategory", "category", "getAvailableServices", "getGlobalSearchConfig", "isFeatureEnabled", "mapPostPaidProfileKey", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "defaultSkuList", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "openPrepaidPage", "checkoutUrl", "openService", "paySearchInfoModel", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "refreshSearch", "removeRecentItem", "saveLocationPermissionSuggestionState", "neverShow", "setHintSwipeVisibilityState", "isVisible", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface length extends parentColumns.setMin {
        void IsOverlapping();

        @NotNull
        HashMap<String, List<String>> getMax(@NotNull List<ThirdPartyServiceResponse> list);

        void getMax();

        void getMin();

        void getMin(@NotNull String str, @NotNull String str2);

        void length();

        void length(@NotNull String str);

        void setMax(@NotNull PaySearchInfoModel paySearchInfoModel);

        void setMax(@NotNull String str);

        void setMax(@NotNull String str, int i, int i2, @NotNull List<String> list, @Nullable Location location);

        void setMax(@NotNull Function1<? super Boolean, Unit> function1);

        void setMax(boolean z);

        void setMin();

        void setMin(@NotNull String str);

        void toFloatRange();

        void toIntRange();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0017J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0017J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0017J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0017J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0017J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0017J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0016H\u0017J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0017J\b\u0010\u001a\u001a\u00020\u0003H\u0017J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0017J\u0016\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0017J\b\u0010 \u001a\u00020\u0003H\u0017J\u0018\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0016H\u0017J \u0010$\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010%\u001a\u00020\u0016H\u0017J\b\u0010&\u001a\u00020\u0003H\u0017J\b\u0010'\u001a\u00020\u0003H\u0017J\u0016\u0010(\u001a\u00020\u00032\f\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u001eH\u0017J\b\u0010+\u001a\u00020\u0003H\u0017J\u0010\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0016H\u0017J\u0016\u0010.\u001a\u00020\u00032\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0017J\u0016\u00100\u001a\u00020\u00032\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u00062À\u0006\u0001"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchContract$View;", "Lid/dana/base/AbstractContractKt$AbstractView;", "onGetAvailableCategories", "", "categories", "", "Lcom/alibaba/fastjson/JSONObject;", "onGetDFRestaurant", "searchResult", "Lid/dana/globalsearch/model/SearchResultModel;", "onGetDFSku", "onGetFeatureEnableSuccess", "enable", "", "isHintSwipeVisible", "onGetGlobalSearchConfig", "globalSearchConfig", "Lid/dana/domain/featureconfig/model/GlobalSearchConfig;", "onGetOfflineMerchantCategory", "onGetOnlineMerchantCategory", "onGetPopularSearchPlaceholder", "popularSearchPlaceholder", "", "onGetPrepaidCheckoutUrl", "result", "onGetSearchByCategory", "onGetSeeAll", "onGetServiceCategory", "onGetSkuServices", "defaultSkuList", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "onMaintenanceAction", "onOpenServiceGet", "thirdPartyService", "url", "onOpenServicePost", "authCode", "onSuccess", "resetView", "showAutoCompleteData", "recentAutoCompleteList", "Lid/dana/globalsearch/model/RecentAutoComplete;", "showAutoCompleteNotFound", "showKeyword", "keyword", "showPopularSearch", "populars", "showRecentSearch", "recents", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public interface setMax extends parentColumns.getMax {
        @JvmDefault
        void equals(@NotNull SearchResultModel searchResultModel);

        @JvmDefault
        void getMax();

        @JvmDefault
        void getMax(@NotNull SearchResultModel searchResultModel);

        @JvmDefault
        void getMax(@NotNull String str);

        @JvmDefault
        void getMax(@NotNull List<RecentAutoComplete> list);

        @JvmDefault
        void getMax(boolean z, boolean z2);

        @JvmDefault
        void getMin();

        @JvmDefault
        void getMin(@NotNull SearchResultModel searchResultModel);

        @JvmDefault
        void getMin(@NotNull List<ThirdPartyServiceResponse> list);

        @JvmDefault
        void isInside();

        @JvmDefault
        void length();

        @JvmDefault
        void length(@NotNull SearchResultModel searchResultModel);

        @JvmDefault
        void setMax(@NotNull SearchResultModel searchResultModel);

        @JvmDefault
        void setMax(@NotNull String str);

        @JvmDefault
        void setMax(@NotNull List<String> list);

        @JvmDefault
        void setMax(@NotNull APWebViewClient aPWebViewClient);

        @JvmDefault
        void setMin(@NotNull ThirdPartyServiceResponse thirdPartyServiceResponse, @NotNull String str);

        @JvmDefault
        void setMin(@NotNull ThirdPartyServiceResponse thirdPartyServiceResponse, @NotNull String str, @NotNull String str2);

        @JvmDefault
        void setMin(@NotNull SearchResultModel searchResultModel);

        @JvmDefault
        void setMin(@NotNull String str);

        @JvmDefault
        void setMin(@NotNull List<String> list);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchContract$Companion;", "", "()V", "DEFAULT_PAGE", "", "SEARCH_DEFAULT_PAGE_SIZE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        static final /* synthetic */ setMin setMax = new setMin();

        private setMin() {
        }
    }
}
