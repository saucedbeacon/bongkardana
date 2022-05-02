package o;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.danah5.DanaH5;
import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.di.PerActivity;
import id.dana.domain.authcode.interactor.GetAuthCode;
import id.dana.domain.globalsearch.model.AutoCompleteResult;
import id.dana.domain.globalsearch.model.SearchResultResponse;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.globalsearch.model.RecentAutoComplete;
import id.dana.globalsearch.model.SearchPerCategoryRequestModel;
import id.dana.globalsearch.model.SearchResultModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.DialogBridgeExtension;
import o.GriverAccount;
import o.ImageLoader;
import o.getAlpha;
import o.getOuterRootPath;
import o.onImage;
import o.unRegisterStatusListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u0000 2\u00020\u0001:\u0003\u0001B\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'¢\u0006\u0002\u0010(J\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u00020I2\u0006\u0010H\u001a\u00020IH\u0002J\u0016\u0010K\u001a\u00020G2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0*H\u0002J\u001e\u0010N\u001a\u00020G2\u0006\u0010O\u001a\u00020?2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0*H\u0002J\u001c\u0010R\u001a\u00020G2\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020G0TH\u0016J\u0010\u0010U\u001a\u00020G2\u0006\u0010O\u001a\u00020?H\u0016J\b\u0010V\u001a\u00020GH\u0016J\b\u0010W\u001a\u00020GH\u0016J\b\u0010X\u001a\u00020GH\u0016J8\u0010Y\u001a\u00020G2\u0006\u0010O\u001a\u00020?2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020[2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020?0*2\b\u0010^\u001a\u0004\u0018\u00010_H\u0016J\u0018\u0010`\u001a\u00020G2\u0006\u0010O\u001a\u00020?2\u0006\u0010a\u001a\u00020?H\u0016J\b\u0010b\u001a\u00020GH\u0016J\b\u0010c\u001a\u00020GH\u0002J\b\u0010\"\u001a\u00020GH\u0016J)\u0010d\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020G0TH\u0001¢\u0006\u0002\bfJ$\u0010\n\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u00020G0TH\u0002J\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020?0*2\f\u0010h\u001a\b\u0012\u0004\u0012\u00020+0*J\u001d\u0010i\u001a\u00020@2\u0006\u0010O\u001a\u00020?2\u0006\u0010a\u001a\u00020?H\u0001¢\u0006\u0002\bjJ\b\u0010k\u001a\u00020GH\u0016J>\u0010l\u001a*\u0012\u0004\u0012\u00020?\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0*0mj\u0014\u0012\u0004\u0012\u00020?\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0*`n2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020+0*H\u0016J\b\u0010p\u001a\u00020GH\u0016J\u0010\u0010q\u001a\u00020G2\u0006\u0010r\u001a\u00020?H\u0016J\u0010\u0010s\u001a\u00020G2\u0006\u0010t\u001a\u00020uH\u0016J\u0018\u0010v\u001a\u00020G2\u0006\u0010w\u001a\u00020+2\u0006\u0010x\u001a\u00020?H\u0007J\b\u0010y\u001a\u00020GH\u0016J\u0010\u0010z\u001a\u00020G2\u0006\u0010O\u001a\u00020?H\u0016J\u0010\u0010\u0016\u001a\u00020G2\u0006\u0010{\u001a\u000203H\u0016J\u0018\u0010\u001e\u001a\u00020G2\u0006\u0010O\u001a\u00020?2\u0006\u0010|\u001a\u00020}H\u0002J\u0010\u0010\u0010\u001a\u00020G2\u0006\u0010~\u001a\u000203H\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R0\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R$\u00104\u001a\u0002032\u0006\u0010)\u001a\u000203@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u00108\u001a\b\u0012\u0004\u0012\u00020:098\u0000X\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010<\u001a\u0004\b=\u0010.R\u0014\u0010>\u001a\b\u0012\u0004\u0012\u00020?0*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R(\u0010A\u001a\u0004\u0018\u00010@2\b\u0010)\u001a\u0004\u0018\u00010@@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchPresenter;", "Lid/dana/contract/globalsearch/GlobalSearchContract$Presenter;", "context", "Landroid/content/Context;", "getSearchByKeyword", "Lid/dana/domain/globalsearch/interactor/GetSearchByKeyword;", "getAutoCompleteByKeyword", "Lid/dana/domain/globalsearch/interactor/GetAutoCompleteByKeyword;", "isFeatureGlobalSearchEnabled", "Lid/dana/domain/globalsearch/interactor/IsFeatureGlobalSearchEnabled;", "getMerchantSubcategories", "Lid/dana/domain/merchant/interactor/GetMerchantSubcategories;", "getRawServices", "Lid/dana/domain/services/interactor/GetRawServices;", "getHintSwipeVisibilityState", "Lid/dana/domain/globalsearch/interactor/GetHintSwipeVisibilityState;", "setHintSwipeVisibilityState", "Lid/dana/domain/globalsearch/interactor/SetHintSwipeVisibilityState;", "getPopularSearch", "Lid/dana/domain/globalsearch/interactor/GetPopularSearch;", "getAuthCode", "Lid/dana/domain/authcode/interactor/GetAuthCode;", "saveLocationPermissionSuggestionState", "Lid/dana/domain/globalsearch/interactor/SaveLocationPermissionSuggestionState;", "checkShouldSuggestLocationPermissionDialog", "Lid/dana/domain/globalsearch/interactor/CheckShouldSuggestLocationPermissionDialog;", "view", "Lid/dana/contract/globalsearch/GlobalSearchContract$View;", "getRecentSearch", "Lid/dana/domain/globalsearch/interactor/GetRecentSearch;", "saveRecentSearch", "Lid/dana/domain/globalsearch/interactor/SaveRecentSearch;", "getPopularSearchPlaceholder", "Lid/dana/domain/globalsearch/interactor/GetPopularSearchPlaceholder;", "getGlobalSearchConfig", "Lid/dana/domain/globalsearch/interactor/GetGlobalSearchConfig;", "getSkuExplore", "Lid/dana/domain/featureconfig/interactor/GetSkuExplore;", "getPrepaidCheckoutUrl", "Lid/dana/domain/merchant/interactor/GetPrepaidCheckoutUrl;", "(Landroid/content/Context;Lid/dana/domain/globalsearch/interactor/GetSearchByKeyword;Lid/dana/domain/globalsearch/interactor/GetAutoCompleteByKeyword;Lid/dana/domain/globalsearch/interactor/IsFeatureGlobalSearchEnabled;Lid/dana/domain/merchant/interactor/GetMerchantSubcategories;Lid/dana/domain/services/interactor/GetRawServices;Lid/dana/domain/globalsearch/interactor/GetHintSwipeVisibilityState;Lid/dana/domain/globalsearch/interactor/SetHintSwipeVisibilityState;Lid/dana/domain/globalsearch/interactor/GetPopularSearch;Lid/dana/domain/authcode/interactor/GetAuthCode;Lid/dana/domain/globalsearch/interactor/SaveLocationPermissionSuggestionState;Lid/dana/domain/globalsearch/interactor/CheckShouldSuggestLocationPermissionDialog;Lid/dana/contract/globalsearch/GlobalSearchContract$View;Lid/dana/domain/globalsearch/interactor/GetRecentSearch;Lid/dana/domain/globalsearch/interactor/SaveRecentSearch;Lid/dana/domain/globalsearch/interactor/GetPopularSearchPlaceholder;Lid/dana/domain/globalsearch/interactor/GetGlobalSearchConfig;Lid/dana/domain/featureconfig/interactor/GetSkuExplore;Lid/dana/domain/merchant/interactor/GetPrepaidCheckoutUrl;)V", "<set-?>", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "currentAvailableServices", "getCurrentAvailableServices", "()Ljava/util/List;", "setCurrentAvailableServices", "(Ljava/util/List;)V", "currentQuery", "Lid/dana/contract/globalsearch/GlobalSearchPresenter$SearchQuery;", "", "isGlobalSearchFetching", "()Z", "setGlobalSearchFetching", "(Z)V", "listOfAvailableMccCode", "", "Lid/dana/domain/merchant/model/MerchantSubcategory;", "getListOfAvailableMccCode$app_productionRelease$annotations", "()V", "getListOfAvailableMccCode$app_productionRelease", "resultRecents", "", "Lid/dana/globalsearch/model/SearchPerCategoryRequestModel;", "searchPerCategoryRequestModel", "getSearchPerCategoryRequestModel", "()Lid/dana/globalsearch/model/SearchPerCategoryRequestModel;", "setSearchPerCategoryRequestModel", "(Lid/dana/globalsearch/model/SearchPerCategoryRequestModel;)V", "assembleAvailableServices", "", "searchResultModel", "Lid/dana/globalsearch/model/SearchResultModel;", "assembleServicesWithStatusMaintenance", "checkIfEmpty", "responseSearchResult", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "combineRecentsAutoComplete", "keyword", "searchResultList", "Lid/dana/domain/globalsearch/model/PaySearchInfo;", "consultLocationPermissionSuggestionDialog", "onShouldSuggest", "Lkotlin/Function1;", "fetchAutoComplete", "fetchPopularSearch", "fetchPopularSearchPlaceholder", "fetchRecentSearch", "fetchSearch", "page", "", "size", "categories", "location", "Landroid/location/Location;", "fetchSearchByCategory", "category", "getAvailableServices", "getDefaultSkuExploreConfig", "getMccName", "onSearchResultModelWithMcc", "getMccName$app_productionRelease", "getProfileKeysFromDefaultSku", "defaultSku", "getRequestModel", "getRequestModel$app_productionRelease", "isFeatureEnabled", "mapPostPaidProfileKey", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "defaultSkuList", "onDestroy", "openPrepaidPage", "checkoutUrl", "openService", "paySearchInfoModel", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "postAuthCode", "thirdPartyService", "url", "refreshSearch", "removeRecentItem", "neverShow", "timeSearch", "", "isVisible", "Companion", "SearchQuery", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@PerActivity
public final class ParcelImpl implements getAlpha.length {
    @NotNull
    public static final getMax IsOverlapping = new getMax((byte) 0);
    private final ImageLoader.AnonymousClass2 FastBitmap$CoordinateSystem;
    private final shouldLoad Grayscale$Algorithm;
    private final getOuterRootPath ICustomTabsCallback;
    private final onLoadingStatusChanged Mean$Arithmetic;
    private final removeInitSuccessListener b;
    private final ShouldLoadUrlPoint create;
    private length equals;
    private final GriverRVTransortServiceImpl extraCallback;
    private final evaluateJavascript getCause;
    final addInitSuccessListener getMax;
    @NotNull
    final List<download> getMin = new ArrayList();
    private final unRegisterStatusListener hashCode;
    private final GetAuthCode invoke;
    private final onImage invokeSuspend;
    private final GriverAccount isInside;
    boolean length;
    /* access modifiers changed from: private */
    public final getAlpha.setMax onNavigationEvent;
    @Nullable
    SearchPerCategoryRequestModel setMax;
    @NotNull
    List<ThirdPartyServiceResponse> setMin = CollectionsKt.emptyList();
    private final didExitRegion toDoubleRange;
    /* access modifiers changed from: private */
    public final Context toFloatRange;
    /* access modifiers changed from: private */
    public List<String> toIntRange = CollectionsKt.emptyList();
    /* access modifiers changed from: private */
    public final createWebViewForNebulaX toString;
    private final ImageLoader.AnonymousClass1 valueOf;
    private final appendAll values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"id/dana/contract/globalsearch/GlobalSearchPresenter$getMerchantSubcategories$1", "Lid/dana/domain/DefaultObserver;", "", "Lid/dana/domain/merchant/model/MerchantSubcategory;", "onError", "", "e", "", "onNext", "response", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class ICustomTabsCallback extends GriverAppVirtualHostProxy<List<? extends download>> {
        final /* synthetic */ ParcelImpl getMax;
        final /* synthetic */ SearchResultModel getMin;
        final /* synthetic */ Function1 setMin;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class Default extends Lambda implements Function1<Throwable, Unit> {
            public static final Default INSTANCE = new Default();

            Default() {
                super(1);
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "it");
                StringBuilder sb = new StringBuilder("setHintSwipeVisibilityState ");
                sb.append(th.getMessage());
                updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, sb.toString());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class Stub extends Lambda implements Function1<Boolean, Unit> {
            public static final Stub INSTANCE = new Stub();

            Stub() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }

            public final void invoke(boolean z) {
                updateActionSheetContent.d(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, "setHintSwipeVisibilityState ".concat(String.valueOf(z)));
            }
        }

        ICustomTabsCallback(ParcelImpl parcelImpl, SearchResultModel searchResultModel, Function1 function1) {
            this.getMax = parcelImpl;
            this.getMin = searchResultModel;
            this.setMin = function1;
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            Intrinsics.checkNotNullParameter(list, "response");
            Collection collection = list;
            if (!collection.isEmpty()) {
                this.getMax.getMin.addAll(collection);
                this.getMax.setMax(this.getMin, (Function1<? super SearchResultModel, Unit>) this.setMin);
            }
            this.getMax.onNavigationEvent.dismissProgress();
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            this.getMax.onNavigationEvent.dismissProgress();
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "", "Lid/dana/domain/globalsearch/model/SearchResultResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class hashCode extends Lambda implements Function1<List<? extends SearchResultResponse>, Unit> {
        final /* synthetic */ String $category;
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        hashCode(ParcelImpl parcelImpl, String str) {
            super(1);
            this.this$0 = parcelImpl;
            this.$category = str;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "newSearchResultModel", "Lid/dana/globalsearch/model/SearchResultModel;", "invoke", "id/dana/contract/globalsearch/GlobalSearchPresenter$fetchSearchByCategory$1$1$1"}, k = 3, mv = {1, 4, 2})
        static final class getMax extends Lambda implements Function1<SearchResultModel, Unit> {
            final /* synthetic */ hashCode this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            getMax(hashCode hashcode) {
                super(1);
                this.this$0 = hashcode;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SearchResultModel) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SearchResultModel searchResultModel) {
                Intrinsics.checkNotNullParameter(searchResultModel, "newSearchResultModel");
                this.this$0.this$0.onNavigationEvent.equals(this.this$0.this$0.getMin(searchResultModel));
            }
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<SearchResultResponse>) (List) obj);
            return Unit.INSTANCE;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004c, code lost:
            r3 = r3.getTotalPage();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void invoke(@org.jetbrains.annotations.NotNull java.util.List<id.dana.domain.globalsearch.model.SearchResultResponse> r5) {
            /*
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                o.ParcelImpl r0 = r4.this$0
                o.getAlpha$setMax r0 = r0.onNavigationEvent
                r0.dismissProgress()
                o.ParcelImpl r0 = r4.this$0
                o.getAlpha$setMax r0 = r0.onNavigationEvent
                r0.length()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Iterator r5 = r5.iterator()
            L_0x001d:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L_0x008d
                java.lang.Object r0 = r5.next()
                id.dana.domain.globalsearch.model.SearchResultResponse r0 = (id.dana.domain.globalsearch.model.SearchResultResponse) r0
                java.lang.String r1 = "$this$toSearchResult"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                id.dana.globalsearch.model.SearchResult r1 = new id.dana.globalsearch.model.SearchResult
                java.util.List r2 = r0.getSearchResultList()
                id.dana.domain.globalsearch.model.Paginator r3 = r0.getPaginator()
                boolean r0 = r0.getRequiresLocationPermission()
                r1.<init>(r2, r3, r0)
                o.ParcelImpl r0 = r4.this$0
                id.dana.globalsearch.model.SearchPerCategoryRequestModel r0 = r0.setMax
                r2 = 0
                if (r0 == 0) goto L_0x005b
                id.dana.domain.globalsearch.model.Paginator r3 = r1.getPaginatorEntity()
                if (r3 == 0) goto L_0x0057
                java.lang.Integer r3 = r3.getTotalPage()
                if (r3 == 0) goto L_0x0057
                int r3 = r3.intValue()
                goto L_0x0058
            L_0x0057:
                r3 = 0
            L_0x0058:
                r0.setMaxPage(r3)
            L_0x005b:
                o.ParcelImpl r0 = r4.this$0
                android.content.Context r0 = r0.toFloatRange
                r3 = 1
                id.dana.globalsearch.model.SearchResultModel r0 = o.getExtensionMap.setMax(r1, r0, r2, r2, r3)
                java.lang.String r1 = r4.$category
                java.lang.String r2 = "OFFLINE_MERCHANT"
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
                if (r1 == 0) goto L_0x007d
                o.ParcelImpl r1 = r4.this$0
                o.ParcelImpl$hashCode$getMax r2 = new o.ParcelImpl$hashCode$getMax
                r2.<init>(r4)
                kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
                o.ParcelImpl.setMin(r1, r0, r2)
                goto L_0x001d
            L_0x007d:
                o.ParcelImpl r1 = r4.this$0
                o.getAlpha$setMax r1 = r1.onNavigationEvent
                o.ParcelImpl r2 = r4.this$0
                id.dana.globalsearch.model.SearchResultModel r0 = r2.getMin((id.dana.globalsearch.model.SearchResultModel) r0)
                r1.equals(r0)
                goto L_0x001d
            L_0x008d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.ParcelImpl.hashCode.invoke(java.util.List):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Throwable, Unit> {
        public static final IsOverlapping INSTANCE = new IsOverlapping();

        IsOverlapping() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "Lkotlin/Exception;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class create extends Lambda implements Function1<Exception, Unit> {
        public static final create INSTANCE = new create();

        create() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, exc.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\"\u0010\u0002\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "resultMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<HashMap<String, Long>, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((HashMap<String, Long>) (HashMap) obj);
            return Unit.INSTANCE;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1"}, k = 3, mv = {1, 4, 2})
        public static final class setMin<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Long) ((Pair) t2).getSecond(), (Long) ((Pair) t).getSecond());
            }
        }

        public final void invoke(@NotNull HashMap<String, Long> hashMap) {
            Intrinsics.checkNotNullParameter(hashMap, HummerConstants.RESULT_MAP);
            ParcelImpl parcelImpl = this.this$0;
            Iterable<Pair> sortedWith = CollectionsKt.sortedWith(MapsKt.toList(hashMap), new setMin());
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
            for (Pair first : sortedWith) {
                arrayList.add((String) first.getFirst());
            }
            parcelImpl.toIntRange = (List) arrayList;
            this.this$0.onNavigationEvent.setMax((List<String>) this.this$0.toIntRange);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class extraCallback extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ThirdPartyServiceResponse $thirdPartyService;
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        extraCallback(ParcelImpl parcelImpl, ThirdPartyServiceResponse thirdPartyServiceResponse) {
            super(1);
            this.this$0 = parcelImpl;
            this.$thirdPartyService = thirdPartyServiceResponse;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.onNavigationEvent.dismissProgress();
            if (th instanceof GetAuthCode.MissingRequiredUserInfoException) {
                String name = this.$thirdPartyService.getName();
                Intrinsics.checkNotNull(name);
                DialogBridgeExtension.AnonymousClass6.getMax((GetAuthCode.MissingRequiredUserInfoException) th, name, this.$thirdPartyService.getIcon());
                return;
            }
            this.this$0.onNavigationEvent.onError("004");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 2})
    static final class extraCallbackWithResult extends Lambda implements Function1<Unit, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        extraCallbackWithResult(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Unit) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "it");
            ParcelImpl parcelImpl = this.this$0;
            parcelImpl.getMax.execute(onReceivedIcon.INSTANCE, new equals(parcelImpl), toFloatRange.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/domain/authcode/AuthCodeResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getCause extends Lambda implements Function1<SplashEntryInfo, Unit> {
        final /* synthetic */ ThirdPartyServiceResponse $thirdPartyService;
        final /* synthetic */ String $url;
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getCause(ParcelImpl parcelImpl, ThirdPartyServiceResponse thirdPartyServiceResponse, String str) {
            super(1);
            this.this$0 = parcelImpl;
            this.$thirdPartyService = thirdPartyServiceResponse;
            this.$url = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((SplashEntryInfo) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull SplashEntryInfo splashEntryInfo) {
            Intrinsics.checkNotNullParameter(splashEntryInfo, "it");
            this.this$0.onNavigationEvent.dismissProgress();
            String authCode = splashEntryInfo.getAuthCode();
            Intrinsics.checkNotNullExpressionValue(authCode, "it.authCode");
            if (authCode.length() > 0) {
                getAlpha.setMax length = this.this$0.onNavigationEvent;
                ThirdPartyServiceResponse thirdPartyServiceResponse = this.$thirdPartyService;
                String str = this.$url;
                String authCode2 = splashEntryInfo.getAuthCode();
                Intrinsics.checkNotNullExpressionValue(authCode2, "it.authCode");
                length.setMin(thirdPartyServiceResponse, str, authCode2);
                return;
            }
            this.this$0.onNavigationEvent.onError("004");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMin extends Lambda implements Function1<Throwable, Unit> {
        public static final getMin INSTANCE = new getMin();

        getMin() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "defaultSkuList", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invoke extends Lambda implements Function1<List<? extends ThirdPartyServiceResponse>, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invoke(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<ThirdPartyServiceResponse>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<ThirdPartyServiceResponse> list) {
            Intrinsics.checkNotNullParameter(list, "defaultSkuList");
            this.this$0.onNavigationEvent.getMin(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend extends Lambda implements Function1<Throwable, Unit> {
        public static final invokeSuspend INSTANCE = new invokeSuspend();

        invokeSuspend() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GET_GLOBAL_SEARCH_CONFIG_TAG, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.onNavigationEvent.setMin((List<String>) CollectionsKt.emptyList());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class onMessageChannelReady extends Lambda implements Function1<Throwable, Unit> {
        public static final onMessageChannelReady INSTANCE = new onMessageChannelReady();

        onMessageChannelReady() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGlobalSearchEnabled", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class onNavigationEvent extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        onNavigationEvent(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final boolean z) {
            this.this$0.toString.execute(onReceivedIcon.INSTANCE, new Function1<Boolean, Unit>(this) {
                final /* synthetic */ onNavigationEvent this$0;

                {
                    this.this$0 = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    invoke(((Boolean) obj).booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    this.this$0.this$0.onNavigationEvent.getMax(z, z);
                }
            }, AnonymousClass5.INSTANCE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class onPostMessage extends Lambda implements Function1<Throwable, Unit> {
        public static final onPostMessage INSTANCE = new onPostMessage();

        onPostMessage() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Lkotlin/Unit;)V"}, k = 3, mv = {1, 4, 2})
    static final class onRelationshipValidationResult extends Lambda implements Function1<Unit, Unit> {
        public static final onRelationshipValidationResult INSTANCE = new onRelationshipValidationResult();

        onRelationshipValidationResult() {
            super(1);
        }

        public final void invoke(@NotNull Unit unit) {
            Intrinsics.checkNotNullParameter(unit, "it");
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Unit) obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<List<? extends String>, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<String>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<String> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            if (this.this$0.equals()) {
                this.this$0.onNavigationEvent.setMin((List<String>) CollectionsKt.emptyList());
            } else {
                this.this$0.onNavigationEvent.setMin((List<String>) CollectionsKt.take(list, 10));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "result", "Lid/dana/domain/globalsearch/model/AutoCompleteResult;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMin extends Lambda implements Function1<AutoCompleteResult, Unit> {
        final /* synthetic */ String $keyword;
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMin(ParcelImpl parcelImpl, String str) {
            super(1);
            this.this$0 = parcelImpl;
            this.$keyword = str;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AutoCompleteResult) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull AutoCompleteResult autoCompleteResult) {
            Intrinsics.checkNotNullParameter(autoCompleteResult, "result");
            if (!autoCompleteResult.getSuccess() || !(!autoCompleteResult.getSearchResultList().isEmpty())) {
                this.this$0.onNavigationEvent.getMin();
            } else {
                ParcelImpl.length(this.this$0, this.$keyword, autoCompleteResult.getSearchResultList());
            }
            updateActionSheetContent.i(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, autoCompleteResult.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toDoubleRange extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toDoubleRange(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.onNavigationEvent.dismissProgress();
            this.this$0.onNavigationEvent.onError(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<Throwable, Unit> {
        public static final toFloatRange INSTANCE = new toFloatRange();

        toFloatRange() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<String, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "it");
            this.this$0.onNavigationEvent.getMax(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toString extends Lambda implements Function1<List<? extends ThirdPartyServiceResponse>, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toString(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<ThirdPartyServiceResponse>) (List) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull List<ThirdPartyServiceResponse> list) {
            Intrinsics.checkNotNullParameter(list, "it");
            ParcelImpl parcelImpl = this.this$0;
            Intrinsics.checkNotNullParameter(list, "<set-?>");
            parcelImpl.setMin = list;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class valueOf extends Lambda implements Function1<Throwable, Unit> {
        public static final valueOf INSTANCE = new valueOf();

        valueOf() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, th.toString());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class values extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ParcelImpl this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        values(ParcelImpl parcelImpl) {
            super(1);
            this.this$0 = parcelImpl;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "it");
            this.this$0.onNavigationEvent.dismissProgress();
            this.this$0.onNavigationEvent.getMax();
            this.this$0.onNavigationEvent.onError(th.getMessage());
            updateActionSheetContent.e(DanaLogConstants.TAG.GLOBAL_SEARCH_TAG, th.toString());
            this.this$0.length = false;
        }
    }

    @Inject
    public ParcelImpl(@NotNull Context context, @NotNull GriverAccount griverAccount, @NotNull unRegisterStatusListener unregisterstatuslistener, @NotNull ImageLoader.AnonymousClass2 r20, @NotNull appendAll appendall, @NotNull didExitRegion didexitregion, @NotNull createWebViewForNebulaX createwebviewfornebulax, @NotNull onImage onimage, @NotNull shouldLoad shouldload, @NotNull GetAuthCode getAuthCode, @NotNull ImageLoader.AnonymousClass1 r27, @NotNull onLoadingStatusChanged onloadingstatuschanged, @NotNull getAlpha.setMax setmax, @NotNull addInitSuccessListener addinitsuccesslistener, @NotNull getOuterRootPath getouterrootpath, @NotNull removeInitSuccessListener removeinitsuccesslistener, @NotNull ShouldLoadUrlPoint shouldLoadUrlPoint, @NotNull evaluateJavascript evaluatejavascript, @NotNull GriverRVTransortServiceImpl griverRVTransortServiceImpl) {
        Context context2 = context;
        GriverAccount griverAccount2 = griverAccount;
        unRegisterStatusListener unregisterstatuslistener2 = unregisterstatuslistener;
        ImageLoader.AnonymousClass2 r4 = r20;
        appendAll appendall2 = appendall;
        didExitRegion didexitregion2 = didexitregion;
        createWebViewForNebulaX createwebviewfornebulax2 = createwebviewfornebulax;
        onImage onimage2 = onimage;
        shouldLoad shouldload2 = shouldload;
        GetAuthCode getAuthCode2 = getAuthCode;
        ImageLoader.AnonymousClass1 r11 = r27;
        onLoadingStatusChanged onloadingstatuschanged2 = onloadingstatuschanged;
        getAlpha.setMax setmax2 = setmax;
        addInitSuccessListener addinitsuccesslistener2 = addinitsuccesslistener;
        removeInitSuccessListener removeinitsuccesslistener2 = removeinitsuccesslistener;
        Intrinsics.checkNotNullParameter(context2, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(griverAccount2, "getSearchByKeyword");
        Intrinsics.checkNotNullParameter(unregisterstatuslistener2, "getAutoCompleteByKeyword");
        Intrinsics.checkNotNullParameter(r4, "isFeatureGlobalSearchEnabled");
        Intrinsics.checkNotNullParameter(appendall2, "getMerchantSubcategories");
        Intrinsics.checkNotNullParameter(didexitregion2, "getRawServices");
        Intrinsics.checkNotNullParameter(createwebviewfornebulax2, "getHintSwipeVisibilityState");
        Intrinsics.checkNotNullParameter(onimage2, "setHintSwipeVisibilityState");
        Intrinsics.checkNotNullParameter(shouldload2, "getPopularSearch");
        Intrinsics.checkNotNullParameter(getAuthCode2, Constants.JS_API_GET_AUTH_CODE);
        Intrinsics.checkNotNullParameter(r11, "saveLocationPermissionSuggestionState");
        Intrinsics.checkNotNullParameter(onloadingstatuschanged2, "checkShouldSuggestLocationPermissionDialog");
        Intrinsics.checkNotNullParameter(setmax2, "view");
        Intrinsics.checkNotNullParameter(addinitsuccesslistener2, "getRecentSearch");
        Intrinsics.checkNotNullParameter(getouterrootpath, "saveRecentSearch");
        Intrinsics.checkNotNullParameter(removeinitsuccesslistener, "getPopularSearchPlaceholder");
        Intrinsics.checkNotNullParameter(shouldLoadUrlPoint, "getGlobalSearchConfig");
        Intrinsics.checkNotNullParameter(evaluatejavascript, "getSkuExplore");
        Intrinsics.checkNotNullParameter(griverRVTransortServiceImpl, "getPrepaidCheckoutUrl");
        this.toFloatRange = context2;
        this.isInside = griverAccount2;
        this.hashCode = unregisterstatuslistener2;
        this.FastBitmap$CoordinateSystem = r4;
        this.values = appendall2;
        this.toDoubleRange = didexitregion2;
        this.toString = createwebviewfornebulax2;
        this.invokeSuspend = onimage2;
        this.Grayscale$Algorithm = shouldload2;
        this.invoke = getAuthCode2;
        this.valueOf = r11;
        this.Mean$Arithmetic = onloadingstatuschanged2;
        this.onNavigationEvent = setmax2;
        this.getMax = addinitsuccesslistener2;
        this.ICustomTabsCallback = getouterrootpath;
        this.b = removeinitsuccesslistener;
        this.create = shouldLoadUrlPoint;
        this.getCause = evaluatejavascript;
        this.extraCallback = griverRVTransortServiceImpl;
    }

    public final boolean equals() {
        return this.length;
    }

    public final void getMax() {
        this.FastBitmap$CoordinateSystem.execute(Unit.INSTANCE, new onNavigationEvent(this), create.INSTANCE);
    }

    public final void setMax(boolean z) {
        this.invokeSuspend.execute(new onImage.length(z), ICustomTabsCallback.Stub.INSTANCE, ICustomTabsCallback.Default.INSTANCE);
    }

    public final void setMin() {
        if (this.setMin.isEmpty()) {
            this.toDoubleRange.execute(onReceivedIcon.INSTANCE, new toString(this), valueOf.INSTANCE);
        }
    }

    public final void setMax() {
        this.FastBitmap$CoordinateSystem.dispose();
        this.isInside.dispose();
        this.hashCode.dispose();
        this.values.dispose();
        this.toDoubleRange.dispose();
        this.invoke.dispose();
        this.valueOf.dispose();
        this.Mean$Arithmetic.dispose();
        this.Grayscale$Algorithm.dispose();
        this.b.dispose();
        this.create.dispose();
        this.getCause.dispose();
        this.extraCallback.dispose();
        DanaH5.dispose();
    }

    public final void setMax(@NotNull String str, int i, int i2, @NotNull List<String> list, @Nullable Location location) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        Intrinsics.checkNotNullParameter(list, "categories");
        this.length = true;
        this.equals = new length(str, i, i2, list);
        this.onNavigationEvent.showProgress();
        this.onNavigationEvent.getMax((List<RecentAutoComplete>) CollectionsKt.emptyList());
        this.isInside.execute(GriverAccount.setMin.Companion.create(str, i, i2, list, location), new ParcelImpl$FastBitmap$CoordinateSystem(this, str), new values(this));
        this.ICustomTabsCallback.execute(getOuterRootPath.getMax.Companion.create(str, System.currentTimeMillis()), onRelationshipValidationResult.INSTANCE, onPostMessage.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final SearchResultModel getMin(SearchResultModel searchResultModel) {
        Object obj;
        for (ThirdPartyServiceResponse thirdPartyServiceResponse : this.setMin) {
            Iterator it = searchResultModel.getPaySearchInfos().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) thirdPartyServiceResponse.getKey(), ((PaySearchInfoModel) obj).getInfo().get(DanaH5.SERVICE_KEY))) {
                    break;
                }
            }
            PaySearchInfoModel paySearchInfoModel = (PaySearchInfoModel) obj;
            if (paySearchInfoModel != null) {
                paySearchInfoModel.setEnable(thirdPartyServiceResponse.isEnable());
            }
        }
        return searchResultModel;
    }

    @VisibleForTesting
    public final void setMax(@NotNull SearchResultModel searchResultModel, @NotNull Function1<? super SearchResultModel, Unit> function1) {
        Object obj;
        String name;
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResultModel");
        Intrinsics.checkNotNullParameter(function1, "onSearchResultModelWithMcc");
        for (PaySearchInfoModel paySearchInfoModel : searchResultModel.getPaySearchInfos()) {
            String str = (String) CollectionsKt.firstOrNull(paySearchInfoModel.getMcc());
            CharSequence charSequence = str;
            String str2 = "Others";
            if (!(charSequence == null || charSequence.length() == 0)) {
                Iterator it = this.getMin.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (Intrinsics.areEqual((Object) ((download) obj).getMcc(), (Object) str)) {
                        break;
                    }
                }
                download download = (download) obj;
                if (!(download == null || (name = download.getName()) == null)) {
                    str2 = name;
                }
            }
            paySearchInfoModel.setMccName(str2);
        }
        function1.invoke(searchResultModel);
    }

    public final void length() {
        this.Grayscale$Algorithm.execute(onReceivedIcon.INSTANCE, new setMax(this), new isInside(this));
    }

    public final void getMin() {
        this.getMax.execute(onReceivedIcon.INSTANCE, new equals(this), toFloatRange.INSTANCE);
    }

    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        this.hashCode.execute(unRegisterStatusListener.getMin.Companion.create(str, 1, 5), new setMin(this, str), getMin.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        if (r0 == null) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getMin(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "keyword"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r1 = "category"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            id.dana.globalsearch.model.SearchPerCategoryRequestModel r2 = r9.setMax
            r3 = 0
            if (r2 == 0) goto L_0x0014
            int r2 = r2.getMaxPage()
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r1)
            id.dana.globalsearch.model.SearchPerCategoryRequestModel r0 = r9.setMax
            if (r0 == 0) goto L_0x003a
            java.lang.String r1 = r0.getKeyword()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r10)
            if (r1 == 0) goto L_0x0034
            java.lang.String r1 = r0.getCategory()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r11)
            if (r1 == 0) goto L_0x0034
            r3 = 1
        L_0x0034:
            if (r3 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            if (r0 != 0) goto L_0x0041
        L_0x003a:
            id.dana.globalsearch.model.SearchPerCategoryRequestModel r0 = new id.dana.globalsearch.model.SearchPerCategoryRequestModel
            r0.<init>(r10, r11)
            r9.setMax = r0
        L_0x0041:
            int r10 = r0.getPage()
            if (r2 == 0) goto L_0x004a
            if (r2 >= r10) goto L_0x004a
            return
        L_0x004a:
            o.getAlpha$setMax r1 = r9.onNavigationEvent
            r1.showProgress()
            o.ParcelImpl$length r1 = new o.ParcelImpl$length
            java.lang.String r4 = r0.getKeyword()
            r6 = 10
            java.lang.String r2 = r0.getCategory()
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r2)
            r8 = 1
            r3 = r1
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            r9.equals = r1
            o.GriverAccount r1 = r9.isInside
            o.GriverAccount$setMin$getMin r3 = o.GriverAccount.setMin.Companion
            java.lang.String r4 = r0.getKeyword()
            java.lang.String r0 = r0.getCategory()
            java.util.List r7 = kotlin.collections.CollectionsKt.listOf(r0)
            r8 = 0
            o.GriverAccount$setMin r10 = r3.create(r4, r5, r6, r7, r8)
            o.ParcelImpl$hashCode r0 = new o.ParcelImpl$hashCode
            r0.<init>(r9, r11)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            o.ParcelImpl$toDoubleRange r11 = new o.ParcelImpl$toDoubleRange
            r11.<init>(r9)
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r1.execute(r10, r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ParcelImpl.getMin(java.lang.String, java.lang.String):void");
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        this.ICustomTabsCallback.execute(getOuterRootPath.getMax.Companion.create(str, -1), new extraCallbackWithResult(this), onMessageChannelReady.INSTANCE);
    }

    public final void IsOverlapping() {
        length length2 = this.equals;
        if (length2 == null) {
            return;
        }
        if (length2.getMax()) {
            getMin(length2.length, (String) CollectionsKt.first(length2.setMax));
            return;
        }
        setRootAlpha.length(this, length2.length, length2.getMax, length2.setMin, length2.setMax, (Location) null, 16);
    }

    public final void setMax(@NotNull PaySearchInfoModel paySearchInfoModel) {
        Object obj;
        Intrinsics.checkNotNullParameter(paySearchInfoModel, "paySearchInfoModel");
        Iterator it = this.setMin.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual((Object) ((ThirdPartyServiceResponse) obj).getKey(), paySearchInfoModel.getInfo().get(DanaH5.SERVICE_KEY))) {
                break;
            }
        }
        ThirdPartyServiceResponse thirdPartyServiceResponse = (ThirdPartyServiceResponse) obj;
        if (thirdPartyServiceResponse == null) {
            return;
        }
        if (!thirdPartyServiceResponse.isEnable()) {
            this.onNavigationEvent.isInside();
            return;
        }
        CharSequence appId = thirdPartyServiceResponse.getAppId();
        if (!(appId == null || appId.length() == 0)) {
            String appId2 = thirdPartyServiceResponse.getAppId();
            Intrinsics.checkNotNull(appId2);
            DanaH5.openApp$default(appId2, (Bundle) null, 2, (Object) null);
            return;
        }
        String str = "";
        if (Intrinsics.areEqual((Object) thirdPartyServiceResponse.getAction(), (Object) "POST")) {
            getStackButtons$core.serviceKey().onNext(thirdPartyServiceResponse.getKey());
            String str2 = paySearchInfoModel.getUrlMap().get("REDIRECT_URL");
            if (str2 == null) {
                str2 = str;
            }
            Intrinsics.checkNotNullParameter(thirdPartyServiceResponse, "thirdPartyService");
            Intrinsics.checkNotNullParameter(str2, "url");
            this.onNavigationEvent.showProgress();
            GetAuthCode getAuthCode = this.invoke;
            GetAuthCode.length.getMin getmin = GetAuthCode.length.Companion;
            String redirectUrl = thirdPartyServiceResponse.getRedirectUrl();
            if (redirectUrl == null) {
                redirectUrl = str;
            }
            String clientId = thirdPartyServiceResponse.getClientId();
            if (clientId == null) {
                clientId = str;
            }
            String scopes = thirdPartyServiceResponse.getScopes();
            if (scopes != null) {
                str = scopes;
            }
            getAuthCode.execute(getmin.forGetAuthCode(redirectUrl, clientId, str, true), new getCause(this, thirdPartyServiceResponse, str2), new extraCallback(this, thirdPartyServiceResponse));
        } else if (Intrinsics.areEqual((Object) thirdPartyServiceResponse.getAction(), (Object) "GET")) {
            getStackButtons$core.serviceKey().onNext(thirdPartyServiceResponse.getKey());
            getAlpha.setMax setmax = this.onNavigationEvent;
            String link = thirdPartyServiceResponse.getLink();
            if (link != null) {
                str = link;
            }
            setmax.setMin(thirdPartyServiceResponse, str);
        }
    }

    public final void setMax(@NotNull Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onShouldSuggest");
        if (getLeftSelectedOption.getMax(this.toFloatRange, "android.permission.ACCESS_FINE_LOCATION")) {
            function1.invoke(Boolean.FALSE);
        } else {
            APWebChromeClient.execute$default(this.Mean$Arithmetic, onReceivedIcon.INSTANCE, function1, (Function1) null, 4, (Object) null);
        }
    }

    public final void toFloatRange() {
        this.b.execute(onReceivedIcon.INSTANCE, new toIntRange(this), IsOverlapping.INSTANCE);
    }

    public final void toIntRange() {
        this.create.execute(onReceivedIcon.INSTANCE, new ParcelImpl$Grayscale$Algorithm(this), invokeSuspend.INSTANCE);
    }

    @NotNull
    public final HashMap<String, List<String>> getMax(@NotNull List<ThirdPartyServiceResponse> list) {
        GriverInnerAmcsLiteConfig skuAttr;
        List<String> postpaidKey;
        Intrinsics.checkNotNullParameter(list, "defaultSkuList");
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (ThirdPartyServiceResponse thirdPartyServiceResponse : list) {
            GriverInnerAmcsLiteConfig skuAttr2 = thirdPartyServiceResponse.getSkuAttr();
            Collection postpaidKey2 = skuAttr2 != null ? skuAttr2.getPostpaidKey() : null;
            if (!((postpaidKey2 == null || postpaidKey2.isEmpty()) || (skuAttr = thirdPartyServiceResponse.getSkuAttr()) == null || (postpaidKey = skuAttr.getPostpaidKey()) == null)) {
                hashMap.put(thirdPartyServiceResponse.getKey(), postpaidKey);
            }
        }
        return hashMap;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"id/dana/contract/globalsearch/GlobalSearchPresenter$openPrepaidPage$1", "Lid/dana/domain/DefaultObserver;", "", "onError", "", "e", "", "onNext", "result", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class b extends GriverAppVirtualHostProxy<String> {
        final /* synthetic */ ParcelImpl setMax;

        b(ParcelImpl parcelImpl) {
            this.setMax = parcelImpl;
        }

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            Intrinsics.checkNotNullParameter(str, "result");
            super.onNext(str);
            if (str.length() > 0) {
                this.setMax.onNavigationEvent.setMax(str);
            }
        }

        public final void onError(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "e");
            updateActionSheetContent.e(DanaLogConstants.TAG.GET_PREPAID_URL, th.toString());
        }
    }

    public final void length(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "checkoutUrl");
        this.extraCallback.execute(new b(this), str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006\u0019"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchPresenter$SearchQuery;", "", "keyword", "", "page", "", "size", "categories", "", "searchByCategory", "", "(Ljava/lang/String;IILjava/util/List;Z)V", "getCategories", "()Ljava/util/List;", "setCategories", "(Ljava/util/List;)V", "getKeyword", "()Ljava/lang/String;", "getPage", "()I", "getSearchByCategory", "()Z", "setSearchByCategory", "(Z)V", "getSize", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        final int getMax;
        private boolean getMin;
        @NotNull
        final String length;
        @NotNull
        List<String> setMax;
        final int setMin;

        public length(@NotNull String str, int i, int i2, @NotNull List<String> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
            Intrinsics.checkNotNullParameter(list, "categories");
            this.length = str;
            this.getMax = i;
            this.setMin = i2;
            this.setMax = list;
            this.getMin = z;
        }

        public /* synthetic */ length(String str, int i, int i2, List list) {
            this(str, i, i2, list, false);
        }

        public final boolean getMax() {
            return this.getMin;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lid/dana/contract/globalsearch/GlobalSearchPresenter$Companion;", "", "()V", "AUTOCOMPLETE_DEFAULT_PAGE_SIZE", "", "DEFAULT_MCC_NAME", "", "ITEMS_CATEGORY_SKU", "ITEMS_PER_CATEGORY", "MAX_POPULAR_ITEM", "MAX_RECENT_AUTOCOMPLETE", "NUMBER_OF_FETCH_PER_CATEGORY", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void setMin(ParcelImpl parcelImpl, SearchResultModel searchResultModel, Function1 function1) {
        if (!parcelImpl.getMin.isEmpty()) {
            parcelImpl.setMax(searchResultModel, (Function1<? super SearchResultModel, Unit>) function1);
            return;
        }
        parcelImpl.onNavigationEvent.showProgress();
        parcelImpl.values.execute(new ICustomTabsCallback(parcelImpl, searchResultModel, function1));
    }

    public static final /* synthetic */ void setMin(ParcelImpl parcelImpl, SearchResultModel searchResultModel) {
        boolean z;
        Collection arrayList = new ArrayList();
        for (Object next : searchResultModel.getPaySearchInfos()) {
            PaySearchInfoModel paySearchInfoModel = (PaySearchInfoModel) next;
            Iterable iterable = parcelImpl.setMin;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Intrinsics.areEqual((Object) ((ThirdPartyServiceResponse) it.next()).getKey(), paySearchInfoModel.getInfo().get(DanaH5.SERVICE_KEY))) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                arrayList.add(next);
            }
        }
        searchResultModel.setPaySearchInfos((List) arrayList);
        parcelImpl.onNavigationEvent.length(parcelImpl.getMin(searchResultModel));
    }

    public static final /* synthetic */ void setMin(ParcelImpl parcelImpl, List list) {
        boolean z;
        Iterable iterable = list;
        boolean z2 = false;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Collection searchResultList = ((SearchResultResponse) it.next()).getSearchResultList();
                if (searchResultList == null || searchResultList.isEmpty()) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    break;
                }
            }
        }
        z2 = true;
        if (z2) {
            parcelImpl.onNavigationEvent.onError("003");
        } else {
            parcelImpl.onNavigationEvent.length();
        }
    }

    public static final /* synthetic */ void length(ParcelImpl parcelImpl, String str, List list) {
        List arrayList = new ArrayList();
        getBridgeManifests.getMin(parcelImpl.toIntRange, str, arrayList);
        getBridgeManifests.getMax(list, arrayList);
        if (!parcelImpl.length) {
            parcelImpl.onNavigationEvent.getMax((List<RecentAutoComplete>) CollectionsKt.take(CollectionsKt.toList(arrayList), 5));
        }
    }
}
