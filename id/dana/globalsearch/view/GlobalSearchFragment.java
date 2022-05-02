package id.dana.globalsearch.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.griver.core.jsapi.device.location.RequestPermission;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.contract.globalsearch.AbstractGlobalSearchView;
import id.dana.danah5.DanaH5;
import id.dana.domain.homeinfo.ThirdPartyServiceResponse;
import id.dana.globalsearch.basecategory.CategoryVerticalView;
import id.dana.globalsearch.constants.GlobalSearchErrorCode;
import id.dana.globalsearch.model.PaySearchInfoModel;
import id.dana.globalsearch.model.RecentAutoComplete;
import id.dana.globalsearch.model.SearchResultModel;
import id.dana.globalsearch.tracker.model.SearchResultOpenTrackerModel;
import id.dana.globalsearch.view.sku.CategorySKUView;
import id.dana.globalsearch.view.widget.GlobalSearchErrorStateView;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import id.dana.richview.globalsearch.ToolbarGlobalSearchView;
import id.dana.tracker.TrackerKey;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.APWebViewClient;
import o.GriverDecodeUrl;
import o.GriverExtensionDelegate;
import o.GriverManifest;
import o.GriverProgressBar;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.MyBeaconServiceImpl;
import o.RedDotDrawable;
import o.RedDotManager;
import o.TinyAppActionStateManager;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.WindowBridgeExtension;
import o.appendAppLog;
import o.ensureCollapseButtonView;
import o.ensureNavButtonView;
import o.getAlpha;
import o.getDuration;
import o.getEventManifests;
import o.getLeftSelectedOption;
import o.getOriginStartParams;
import o.getProgressViewStartOffset;
import o.isShowMenu;
import o.layoutChildLeft;
import o.layoutChildRight;
import o.measureChildCollapseMargins;
import o.resetInternal;
import o.setH5MenuList;
import o.setOnWheelViewListener;
import o.setPublishStatus;
import o.setRootAlpha;
import o.uploadCoreByStartService;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001uB\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020#H\u0016J\b\u0010(\u001a\u00020#H\u0002J\u0006\u0010)\u001a\u00020#J\b\u0010*\u001a\u00020\u0002H\u0016J\b\u0010+\u001a\u00020,H\u0014J\b\u0010-\u001a\u00020#H\u0002J\b\u0010.\u001a\u00020#H\u0014J\u001e\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020%2\f\u00101\u001a\b\u0012\u0004\u0012\u00020%02H\u0002J\b\u00103\u001a\u00020#H\u0002J\u0010\u00104\u001a\u00020#2\u0006\u00100\u001a\u00020%H\u0002J\"\u00105\u001a\u00020#2\u0006\u00106\u001a\u00020,2\u0006\u00107\u001a\u00020,2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\b\u0010:\u001a\u00020#H\u0016J\u0012\u0010;\u001a\u00020#2\b\u0010<\u001a\u0004\u0018\u00010%H\u0016J\u0016\u0010=\u001a\u00020#2\f\u00101\u001a\b\u0012\u0004\u0012\u00020?0>H\u0016J\u0010\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020#2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010D\u001a\u00020#2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010E\u001a\u00020#2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010F\u001a\u00020#2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010G\u001a\u00020#2\u0006\u0010H\u001a\u00020,H\u0002J\u0010\u0010I\u001a\u00020#2\u0006\u0010H\u001a\u00020,H\u0002J\u0010\u0010J\u001a\u00020#2\u0006\u0010H\u001a\u00020,H\u0002J\b\u0010K\u001a\u00020#H\u0016J\u0018\u0010L\u001a\u00020#2\u0006\u0010M\u001a\u00020N2\u0006\u0010$\u001a\u00020%H\u0016J \u0010O\u001a\u00020#2\u0006\u0010M\u001a\u00020N2\u0006\u0010$\u001a\u00020%2\u0006\u0010P\u001a\u00020%H\u0016J\b\u0010Q\u001a\u00020#H\u0016J\u0010\u0010R\u001a\u00020#2\u0006\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020#H\u0002J\u0006\u0010V\u001a\u00020#J\b\u0010W\u001a\u00020#H\u0002J\b\u0010X\u001a\u00020#H\u0016J\u000e\u0010Y\u001a\u00020#2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010Z\u001a\u00020#2\b\u0010[\u001a\u0004\u0018\u00010%J\b\u0010\\\u001a\u00020#H\u0002J\u0010\u0010]\u001a\u00020#2\u0006\u0010^\u001a\u00020%H\u0002J\b\u0010_\u001a\u00020#H\u0002J\b\u0010`\u001a\u00020#H\u0002J\u0016\u0010a\u001a\u00020#2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020c02H\u0016J\b\u0010d\u001a\u00020#H\u0016J\b\u0010e\u001a\u00020#H\u0002J\u0010\u0010f\u001a\u00020#2\u0006\u0010<\u001a\u00020%H\u0002J\u0010\u0010g\u001a\u00020#2\u0006\u00100\u001a\u00020%H\u0016J\u0010\u0010h\u001a\u00020#2\u0006\u0010i\u001a\u00020\rH\u0002J\u0016\u0010j\u001a\u00020#2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020%02H\u0016J\b\u0010l\u001a\u00020#H\u0016J\u0016\u0010m\u001a\u00020#2\f\u0010n\u001a\b\u0012\u0004\u0012\u00020%02H\u0016J\u001c\u0010o\u001a\u00020#2\u0006\u00100\u001a\u00020%2\n\b\u0002\u0010^\u001a\u0004\u0018\u00010%H\u0002J\u0010\u0010p\u001a\u00020#2\u0006\u0010q\u001a\u00020\rH\u0002J\u0006\u0010r\u001a\u00020#J\b\u0010s\u001a\u00020#H\u0002J\u0010\u0010t\u001a\u00020\r2\u0006\u00100\u001a\u00020%H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000¨\u0006v"}, d2 = {"Lid/dana/globalsearch/view/GlobalSearchFragment;", "Lid/dana/contract/globalsearch/AbstractGlobalSearchView;", "Lid/dana/contract/globalsearch/GlobalSearchContract$View;", "()V", "autoCompleteAdapter", "Lid/dana/globalsearch/adapter/AutoCompleteAdapter;", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "danaLoadingDialog$delegate", "Lkotlin/Lazy;", "fromExplorePopularSearch", "", "globalSearchAnalyticTracker", "Lid/dana/globalsearch/tracker/GlobalSearchAnalyticTracker;", "getGlobalSearchAnalyticTracker", "()Lid/dana/globalsearch/tracker/GlobalSearchAnalyticTracker;", "setGlobalSearchAnalyticTracker", "(Lid/dana/globalsearch/tracker/GlobalSearchAnalyticTracker;)V", "isAutocompleteShowing", "isSearchFromButton", "isShowLoadingDialog", "locationRequestDisposable", "Lio/reactivex/disposables/Disposable;", "locationUpdateObserver", "permissionRequest", "Lcom/anggrayudi/storage/permission/FragmentPermissionRequest;", "popularSearchAdapter", "Lid/dana/globalsearch/adapter/PopularSearchAdapter;", "recentSearchAdapter", "Lid/dana/globalsearch/adapter/RecentSearchAdapter;", "searchResultOpenTrackerModel", "Lid/dana/globalsearch/tracker/model/SearchResultOpenTrackerModel;", "checkIsUrlDeepLink", "", "url", "", "clearView", "dismissProgress", "disposeLocationUpdateObserver", "fetchPopularAndRecentSearch", "getGlobalSearchView", "getLayout", "", "hideAllCategory", "init", "initLocationUpdate", "keyword", "categories", "", "initToolbar", "keywordEmptyState", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroyView", "onError", "errorMessage", "onGetAvailableCategories", "", "Lcom/alibaba/fastjson/JSONObject;", "onGetDFRestaurant", "searchResult", "Lid/dana/globalsearch/model/SearchResultModel;", "onGetDFSku", "onGetOfflineMerchantCategory", "onGetOnlineMerchantCategory", "onGetServiceCategory", "onItemClickedAutoComplete", "position", "onItemClickedPopularSearch", "onItemClickedRecentSearch", "onMaintenanceAction", "onOpenServiceGet", "thirdPartyService", "Lid/dana/domain/homeinfo/ThirdPartyServiceResponse;", "onOpenServicePost", "authCode", "onSuccess", "openNearbyBottomSheet", "paySearchInfo", "Lid/dana/globalsearch/model/PaySearchInfoModel;", "requestLocationService", "resetAllView", "resetTracker", "resetView", "setFromExplorePopularSearch", "setSearchParam", "searchParam", "setupLocationCallback", "setupOnClickSeeAll", "category", "setupRecyclerView", "setupSeeAllHeader", "showAutoCompleteData", "recentAutoCompleteList", "Lid/dana/globalsearch/model/RecentAutoComplete;", "showAutoCompleteNotFound", "showErrorServiceDialog", "showErrorState", "showKeyword", "showPopularRecentSearch", "show", "showPopularSearch", "populars", "showProgress", "showRecentSearch", "recents", "suggestEnableLocation", "toggleAutoCompleteView", "state", "trackGlobalSearchOpen", "trackGlobalSearchResultStatus", "validateFetchAutocomplete", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GlobalSearchFragment extends AbstractGlobalSearchView implements getAlpha.setMax {
    @NotNull
    public static final getMin setMin = new getMin((byte) 0);
    /* access modifiers changed from: private */
    public final ensureCollapseButtonView FastBitmap$CoordinateSystem;
    private GriverExtensionDelegate IsOverlapping;
    private GriverDecodeUrl.AnonymousClass1.AnonymousClass1 equals;
    /* access modifiers changed from: package-private */
    public boolean getMin;
    @Inject
    public GriverManifest.AnonymousClass11 globalSearchAnalyticTracker;
    /* access modifiers changed from: private */
    public boolean hashCode;
    private GriverProgressBar.UpdateRunnable isInside;
    /* access modifiers changed from: package-private */
    public SearchResultOpenTrackerModel setMax = new SearchResultOpenTrackerModel();
    private final Lazy toDoubleRange = LazyKt.lazy(new length(this));
    private GriverProgressBar.UpdateRunnable toFloatRange;
    private getEventManifests toIntRange;
    /* access modifiers changed from: private */
    public boolean toString;
    private HashMap valueOf;
    /* access modifiers changed from: private */
    public boolean values;

    public final void Grayscale$Algorithm() {
        HashMap hashMap = this.valueOf;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @JvmDefault
    public final void equals(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
    }

    public final View getMax(int i) {
        if (this.valueOf == null) {
            this.valueOf = new HashMap();
        }
        View view = (View) this.valueOf.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.valueOf.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @JvmDefault
    public final void getMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "popularSearchPlaceholder");
    }

    @JvmDefault
    public final void getMax(boolean z, boolean z2) {
    }

    @JvmDefault
    public final void getMin(@NotNull List<ThirdPartyServiceResponse> list) {
        Intrinsics.checkNotNullParameter(list, "defaultSkuList");
    }

    @JvmDefault
    public final void setMax(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "result");
    }

    @JvmDefault
    public final void setMax(@NotNull APWebViewClient aPWebViewClient) {
        Intrinsics.checkNotNullParameter(aPWebViewClient, "globalSearchConfig");
    }

    public final int setMin() {
        return R.layout.fragment_global_search;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "shouldShow", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class ICustomTabsCallback extends Lambda implements Function1<Boolean, Unit> {
        final /* synthetic */ String $category;
        final /* synthetic */ String $keyword;
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ICustomTabsCallback(GlobalSearchFragment globalSearchFragment, String str, String str2) {
            super(1);
            this.this$0 = globalSearchFragment;
            this.$keyword = str;
            this.$category = str2;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                Context requireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                getProgressViewStartOffset.getMax getmax = new getProgressViewStartOffset.getMax(requireContext);
                getmax.toFloatRange = this.this$0.getString(R.string.allow_location_access);
                getProgressViewStartOffset.getMax getmax2 = getmax;
                getmax2.isInside = this.this$0.getString(R.string.allow_location_for_experience);
                getProgressViewStartOffset.getMax getmax3 = getmax2;
                getmax3.setMax = R.drawable.ic_location_permission_icon;
                getProgressViewStartOffset.getMax getmax4 = getmax3;
                getmax4.toIntRange = 0;
                getmax4.IsOverlapping().setMax(false);
                getmax4.setMin(this.this$0.getString(R.string.allow_access), new Function1<View, Unit>(this) {
                    final /* synthetic */ ICustomTabsCallback this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((View) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull View view) {
                        Intrinsics.checkNotNullParameter(view, "it");
                        this.this$0.this$0.FastBitmap$CoordinateSystem.setMax();
                    }
                }).getMax(this.this$0.getString(17039360), new Function1<View, Unit>(this) {
                    final /* synthetic */ ICustomTabsCallback this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((View) obj);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull View view) {
                        Intrinsics.checkNotNullParameter(view, "it");
                        getAlpha.length min = this.this$0.this$0.m_();
                        String str = this.this$0.$keyword;
                        String str2 = this.this$0.$category;
                        List listOf = str2 != null ? CollectionsKt.listOf(str2) : null;
                        if (listOf == null) {
                            listOf = CollectionsKt.emptyList();
                        }
                        setRootAlpha.length(min, str, 0, 0, listOf, (Location) null, 22);
                    }
                }).equals();
                return;
            }
            GlobalSearchFragment globalSearchFragment = this.this$0;
            String str = this.$keyword;
            String str2 = this.$category;
            List listOf = str2 != null ? CollectionsKt.listOf(str2) : null;
            if (listOf == null) {
                listOf = CollectionsKt.emptyList();
            }
            GlobalSearchFragment.length(globalSearchFragment, str, listOf);
            this.this$0.setMax.setKeywordUsage(TrackerKey.KeywordType.CUSTOM);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "indexNearby", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$onGetOfflineMerchantCategory$1$1"}, k = 3, mv = {1, 4, 2})
    static final class IsOverlapping extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ SearchResultModel $searchResult$inlined;
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IsOverlapping(GlobalSearchFragment globalSearchFragment, SearchResultModel searchResultModel) {
            super(1);
            this.this$0 = globalSearchFragment;
            this.$searchResult$inlined = searchResultModel;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            GlobalSearchFragment.length(this.this$0, this.$searchResult$inlined.getPaySearchInfos().get(i));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "indexServices", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$onGetServiceCategory$1$1"}, k = 3, mv = {1, 4, 2})
    static final class equals extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ SearchResultModel $searchResult$inlined;
        final /* synthetic */ CategoryVerticalView $this_run;
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        equals(CategoryVerticalView categoryVerticalView, GlobalSearchFragment globalSearchFragment, SearchResultModel searchResultModel) {
            super(1);
            this.$this_run = categoryVerticalView;
            this.this$0 = globalSearchFragment;
            this.$searchResult$inlined = searchResultModel;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            PaySearchInfoModel paySearchInfoModel = this.$searchResult$inlined.getPaySearchInfos().get(i);
            BaseActivity baseActivity = this.$this_run.getBaseActivity();
            Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
            if (getOriginStartParams.isNetworkAvailable(baseActivity)) {
                this.this$0.m_().setMax(paySearchInfoModel);
            } else {
                this.this$0.getMax.showWarningDialog(this.this$0.getString(R.string.global_search_error_message_dialog));
            }
            GriverManifest.AnonymousClass11 r0 = this.this$0.globalSearchAnalyticTracker;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
            }
            r0.getMax(paySearchInfoModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "indexMerchant", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$onGetOnlineMerchantCategory$1$1"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ SearchResultModel $searchResult$inlined;
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(GlobalSearchFragment globalSearchFragment, SearchResultModel searchResultModel) {
            super(1);
            this.this$0 = globalSearchFragment;
            this.$searchResult$inlined = searchResultModel;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            PaySearchInfoModel paySearchInfoModel = this.$searchResult$inlined.getPaySearchInfos().get(i);
            GlobalSearchFragment.setMax(this.this$0, paySearchInfoModel.getUrlMap().get("REDIRECT_URL"));
            GriverManifest.AnonymousClass11 r0 = this.this$0.globalSearchAnalyticTracker;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
            }
            r0.getMax(paySearchInfoModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMax<T> implements RedDotManager<Location> {
        final /* synthetic */ GlobalSearchFragment getMax;
        final /* synthetic */ String length;
        final /* synthetic */ List setMax;

        setMax(GlobalSearchFragment globalSearchFragment, String str, List list) {
            this.getMax = globalSearchFragment;
            this.length = str;
            this.setMax = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            setRootAlpha.length(this.getMax.m_(), this.length, 0, 0, this.setMax, (Location) obj, 6);
            GlobalSearchFragment.getMin(this.getMax);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "indexSKU", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$onGetDFSku$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toFloatRange extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ SearchResultModel $searchResult$inlined;
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toFloatRange(GlobalSearchFragment globalSearchFragment, SearchResultModel searchResultModel) {
            super(1);
            this.this$0 = globalSearchFragment;
            this.$searchResult$inlined = searchResultModel;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            PaySearchInfoModel paySearchInfoModel = this.$searchResult$inlined.getPaySearchInfos().get(i);
            GlobalSearchFragment.setMax(this.this$0, paySearchInfoModel.getUrlMap().get("DETAIL"));
            GriverManifest.AnonymousClass11 r0 = this.this$0.globalSearchAnalyticTracker;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
            }
            r0.getMax(paySearchInfoModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "indexRestaurant", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$onGetDFRestaurant$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ SearchResultModel $searchResult$inlined;
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(GlobalSearchFragment globalSearchFragment, SearchResultModel searchResultModel) {
            super(1);
            this.this$0 = globalSearchFragment;
            this.$searchResult$inlined = searchResultModel;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            PaySearchInfoModel paySearchInfoModel = this.$searchResult$inlined.getPaySearchInfos().get(i);
            GlobalSearchFragment.setMax(this.this$0, paySearchInfoModel.getUrlMap().get("DETAIL"));
            GriverManifest.AnonymousClass11 r0 = this.this$0.globalSearchAnalyticTracker;
            if (r0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
            }
            r0.getMax(paySearchInfoModel);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/location/LocationSettingsResult;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class values<T> implements RedDotManager<LocationSettingsResult> {
        final /* synthetic */ GlobalSearchFragment length;

        values(GlobalSearchFragment globalSearchFragment) {
            this.length = globalSearchFragment;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
            r0 = r0.getResolution();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r10) {
            /*
                r9 = this;
                com.google.android.gms.location.LocationSettingsResult r10 = (com.google.android.gms.location.LocationSettingsResult) r10
                java.lang.String r0 = "it"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r0)
                com.google.android.gms.common.api.Status r0 = r10.getStatus()
                if (r0 == 0) goto L_0x0018
                android.app.PendingIntent r0 = r0.getResolution()
                if (r0 == 0) goto L_0x0018
                android.content.IntentSender r0 = r0.getIntentSender()
                goto L_0x0019
            L_0x0018:
                r0 = 0
            L_0x0019:
                r2 = r0
                if (r2 == 0) goto L_0x0036
                com.google.android.gms.common.api.Status r10 = r10.getStatus()
                if (r10 == 0) goto L_0x0036
                int r10 = r10.getStatusCode()
                r0 = 6
                if (r10 != r0) goto L_0x0036
                id.dana.globalsearch.view.GlobalSearchFragment r1 = r9.length     // Catch:{ SendIntentException -> 0x0036 }
                r3 = 10
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r1.startIntentSenderForResult(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ SendIntentException -> 0x0036 }
                return
            L_0x0036:
                id.dana.globalsearch.view.GlobalSearchFragment r10 = r9.length
                o.getAlpha$length r10 = r10.m_()
                r10.IsOverlapping()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: id.dana.globalsearch.view.GlobalSearchFragment.values.accept(java.lang.Object):void");
        }
    }

    public GlobalSearchFragment() {
        ensureCollapseButtonView.getMax getmax = new ensureCollapseButtonView.getMax(this);
        String[] strArr = {"android.permission.ACCESS_FINE_LOCATION"};
        Intrinsics.checkNotNullParameter(strArr, RequestPermission.PERMISSIONS);
        ensureCollapseButtonView.getMax getmax2 = getmax;
        getmax2.setMax = ArraysKt.toSet((T[]) strArr);
        measureChildCollapseMargins todoublerange = new toDoubleRange(this);
        Intrinsics.checkNotNullParameter(todoublerange, "callback");
        ensureCollapseButtonView.getMax getmax3 = getmax2;
        getmax3.getMax = todoublerange;
        this.FastBitmap$CoordinateSystem = getmax3.setMin();
    }

    public static final /* synthetic */ GriverExtensionDelegate hashCode(GlobalSearchFragment globalSearchFragment) {
        GriverExtensionDelegate griverExtensionDelegate = globalSearchFragment.IsOverlapping;
        if (griverExtensionDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentSearchAdapter");
        }
        return griverExtensionDelegate;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/DanaLoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<setPublishStatus> {
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(GlobalSearchFragment globalSearchFragment) {
            super(0);
            this.this$0 = globalSearchFragment;
        }

        @NotNull
        public final setPublishStatus invoke() {
            return new setPublishStatus(this.this$0.requireActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¨\u0006\u000f"}, d2 = {"id/dana/globalsearch/view/GlobalSearchFragment$permissionRequest$1", "Lcom/anggrayudi/storage/permission/PermissionCallback;", "onDisplayConsentDialog", "", "request", "Lcom/anggrayudi/storage/permission/PermissionRequest;", "onPermissionsChecked", "result", "Lcom/anggrayudi/storage/permission/PermissionResult;", "fromSystemDialog", "", "onShouldRedirectToSystemSettings", "blockedPermissions", "", "Lcom/anggrayudi/storage/permission/PermissionReport;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toDoubleRange implements measureChildCollapseMargins {
        final /* synthetic */ GlobalSearchFragment getMax;

        toDoubleRange(GlobalSearchFragment globalSearchFragment) {
            this.getMax = globalSearchFragment;
        }

        public final void onPermissionsChecked(@NotNull layoutChildRight layoutchildright, boolean z) {
            Intrinsics.checkNotNullParameter(layoutchildright, "result");
            if (layoutchildright.getMax()) {
                GlobalSearchFragment.FastBitmap$CoordinateSystem(this.getMax);
            }
        }

        public final void onShouldRedirectToSystemSettings(@NotNull List<ensureNavButtonView> list) {
            Intrinsics.checkNotNullParameter(list, "blockedPermissions");
            Context requireContext = this.getMax.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            TinyAppActionStateManager.setMax(requireContext);
        }

        public final void onDisplayConsentDialog(@NotNull layoutChildLeft layoutchildleft) {
            Intrinsics.checkNotNullParameter(layoutchildleft, RequestPermissionsEvent.REQUEST);
            Context requireContext = this.getMax.requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            TinyAppActionStateManager.getMax(requireContext, layoutchildleft);
            GriverManifest.AnonymousClass11 r3 = this.getMax.globalSearchAnalyticTracker;
            if (r3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
            }
            r3.getMin();
        }
    }

    public final void setMax() {
        invokeSuspend().setMax(this);
        getMin(m_(), values(), FastBitmap$CoordinateSystem(), Mean$Arithmetic(), equals());
        b();
        ToolbarGlobalSearchView toolbarGlobalSearchView = (ToolbarGlobalSearchView) getMax(resetInternal.setMax.dispatchDraw);
        toolbarGlobalSearchView.setPointerFocus();
        toolbarGlobalSearchView.setMenuButtonListener();
        toolbarGlobalSearchView.setListener(new getMax(this));
        GriverDecodeUrl.AnonymousClass1.AnonymousClass1 r0 = new IMultiInstanceInvalidationCallback.Stub<GriverDecodeUrl.AnonymousClass1.AnonymousClass1.setMax, RecentAutoComplete>() {
            public static final setMin getMin;

            public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.valueOf onCreateViewHolder(
/*
Method generation error in method: o.GriverDecodeUrl.1.1.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$valueOf, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverDecodeUrl.1.1.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$valueOf, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            public final int getItemViewType(
/*
Method generation error in method: o.GriverDecodeUrl.1.1.getItemViewType(int):int, dex: classes3.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverDecodeUrl.1.1.getItemViewType(int):int, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/

            /* renamed from: o.GriverDecodeUrl$1$1$setMax */
            public static final class setMax extends Ignore<RecentAutoComplete> {
                private final int setMax;

                public final /* synthetic */ void setMax(
/*
Method generation error in method: o.GriverDecodeUrl.1.1.setMax.setMax(java.lang.Object):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverDecodeUrl.1.1.setMax.setMax(java.lang.Object):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public setMax(
/*
Method generation error in method: o.GriverDecodeUrl.1.1.setMax.<init>(android.view.ViewGroup, int):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverDecodeUrl.1.1.setMax.<init>(android.view.ViewGroup, int):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }

            /* renamed from: o.GriverDecodeUrl$1$1$setMin */
            public static final class setMin {
                private setMin(
/*
Method generation error in method: o.GriverDecodeUrl.1.1.setMin.<init>():void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverDecodeUrl.1.1.setMin.<init>():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public /* synthetic */ setMin(
/*
Method generation error in method: o.GriverDecodeUrl.1.1.setMin.<init>(byte):void, dex: classes3.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.GriverDecodeUrl.1.1.setMin.<init>(byte):void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }
        };
        r0.getMax((Ignore.setMin) new GlobalSearchFragment$FastBitmap$CoordinateSystem(this));
        Unit unit = Unit.INSTANCE;
        this.equals = r0;
        RecyclerView recyclerView = (RecyclerView) getMax(resetInternal.setMax.setSupportImageTintList);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            GriverDecodeUrl.AnonymousClass1.AnonymousClass1 r1 = this.equals;
            if (r1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("autoCompleteAdapter");
            }
            recyclerView.setAdapter(r1);
        }
        getEventManifests geteventmanifests = new getEventManifests();
        geteventmanifests.getMax((Ignore.setMin) new GlobalSearchFragment$Mean$Arithmetic(this));
        Unit unit2 = Unit.INSTANCE;
        this.toIntRange = geteventmanifests;
        RecyclerView recyclerView2 = (RecyclerView) getMax(resetInternal.setMax.setDropDownBackgroundResource);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new FlexboxLayoutManager(recyclerView2.getContext(), 0));
            getEventManifests geteventmanifests2 = this.toIntRange;
            if (geteventmanifests2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popularSearchAdapter");
            }
            recyclerView2.setAdapter(geteventmanifests2);
        }
        GriverExtensionDelegate griverExtensionDelegate = new GriverExtensionDelegate(new invoke(this));
        griverExtensionDelegate.getMax((Ignore.setMin) new valueOf(this));
        Unit unit3 = Unit.INSTANCE;
        this.IsOverlapping = griverExtensionDelegate;
        RecyclerView recyclerView3 = (RecyclerView) getMax(resetInternal.setMax.AppCompatAutoCompleteTextView);
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(recyclerView3.getContext(), 1, false));
            GriverExtensionDelegate griverExtensionDelegate2 = this.IsOverlapping;
            if (griverExtensionDelegate2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentSearchAdapter");
            }
            recyclerView3.setAdapter(griverExtensionDelegate2);
        }
        CategoryVerticalView categoryVerticalView = (CategoryVerticalView) getMax(resetInternal.setMax.onVolumeInfoChanged);
        Intrinsics.checkNotNullExpressionValue(categoryVerticalView, "category_offline_merchant");
        CategorySKUView categorySKUView = (CategorySKUView) getMax(resetInternal.setMax.onExtrasChanged);
        Intrinsics.checkNotNullExpressionValue(categorySKUView, "category_dfsku");
        CategoryVerticalView categoryVerticalView2 = (CategoryVerticalView) getMax(resetInternal.setMax.onShuffleModeChangedRemoved);
        Intrinsics.checkNotNullExpressionValue(categoryVerticalView2, "category_restaurant");
        View[] viewArr = {categoryVerticalView, categorySKUView, categoryVerticalView2};
        for (int i = 0; i < 3; i++) {
            viewArr[i].findViewById(R.id.f36572131362109).setOnClickListener(new toString(this));
        }
        CategoryVerticalView categoryVerticalView3 = (CategoryVerticalView) getMax(resetInternal.setMax.onVolumeInfoChanged);
        if (categoryVerticalView3 != null) {
            categoryVerticalView3.setSeeAllClickListener(new invokeSuspend(this));
        }
        CategoryVerticalView categoryVerticalView4 = (CategoryVerticalView) getMax(resetInternal.setMax.onShuffleModeChanged);
        if (categoryVerticalView4 != null) {
            categoryVerticalView4.setSeeAllClickListener(new GlobalSearchFragment$Grayscale$Algorithm(this));
        }
        CategoryVerticalView categoryVerticalView5 = (CategoryVerticalView) getMax(resetInternal.setMax.onShuffleModeChangedRemoved);
        if (categoryVerticalView5 != null) {
            categoryVerticalView5.setSeeAllClickListener(new b(this));
        }
        CategoryVerticalView categoryVerticalView6 = (CategoryVerticalView) getMax(resetInternal.setMax.onCaptioningEnabledChanged);
        if (categoryVerticalView6 != null) {
            categoryVerticalView6.setSeeAllClickListener(new create(this));
        }
        m_().setMin();
        m_().length();
        m_().getMin();
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("SEARCH_PARAMS")) {
            String string = arguments.getString("SEARCH_PARAMS");
            if (string == null) {
                string = "";
            }
            m_().setMax((Function1<? super Boolean, Unit>) new ICustomTabsCallback(this, string, (String) null));
        }
    }

    @NotNull
    public final getAlpha.setMax invoke() {
        return this;
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (i != 10) {
            if (i == 24 && intent != null && i2 == 29) {
                String stringExtra = intent.getStringExtra(SeeAllActivity.GLOBAL_SEARCH_KEYWORD);
                if (stringExtra == null) {
                    stringExtra = "";
                }
                ToolbarGlobalSearchView toolbarGlobalSearchView = (ToolbarGlobalSearchView) getMax(resetInternal.setMax.dispatchDraw);
                if (toolbarGlobalSearchView != null) {
                    toolbarGlobalSearchView.showKeyword(stringExtra);
                }
                m_().setMax((Function1<? super Boolean, Unit>) new ICustomTabsCallback(this, stringExtra, (String) null));
            }
        } else if (i2 == -1) {
            m_().IsOverlapping();
        }
    }

    public final void onDestroyView() {
        GriverProgressBar.UpdateRunnable updateRunnable = this.toFloatRange;
        if (updateRunnable != null) {
            updateRunnable.dispose();
        }
        super.onDestroyView();
        HashMap hashMap = this.valueOf;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$setupSeeAllHeader$1$1"}, k = 3, mv = {1, 4, 2})
    static final class invokeSuspend extends Lambda implements Function0<Unit> {
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        invokeSuspend(GlobalSearchFragment globalSearchFragment) {
            super(0);
            this.this$0 = globalSearchFragment;
        }

        public final void invoke() {
            GlobalSearchFragment.setMin(this.this$0, "OFFLINE_MERCHANT");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$setupSeeAllHeader$3$1"}, k = 3, mv = {1, 4, 2})
    static final class b extends Lambda implements Function0<Unit> {
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(GlobalSearchFragment globalSearchFragment) {
            super(0);
            this.this$0 = globalSearchFragment;
        }

        public final void invoke() {
            GlobalSearchFragment.setMin(this.this$0, "DF");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$setupSeeAllHeader$4$1"}, k = 3, mv = {1, 4, 2})
    static final class create extends Lambda implements Function0<Unit> {
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        create(GlobalSearchFragment globalSearchFragment) {
            super(0);
            this.this$0 = globalSearchFragment;
        }

        public final void invoke() {
            GlobalSearchFragment.setMin(this.this$0, "ONLINE_MERCHANT");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"id/dana/globalsearch/view/GlobalSearchFragment$initToolbar$1$1", "Lid/dana/richview/globalsearch/ToolbarGlobalSearchView$Listener;", "onBackPressed", "", "onBackToPreviousFragment", "onClickClearButton", "onClickSearchButton", "text", "", "onSearchTextChanged", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements ToolbarGlobalSearchView.setMin {
        final /* synthetic */ GlobalSearchFragment length;

        public final void getMax() {
        }

        getMax(GlobalSearchFragment globalSearchFragment) {
            this.length = globalSearchFragment;
        }

        public final void getMin(@Nullable CharSequence charSequence) {
            GlobalSearchErrorStateView globalSearchErrorStateView;
            this.length.getMax((List<RecentAutoComplete>) CollectionsKt.emptyList());
            String obj = charSequence != null ? charSequence.toString() : null;
            if (obj == null) {
                obj = "";
            }
            if (obj != null) {
                String obj2 = StringsKt.trim((CharSequence) obj).toString();
                if (GlobalSearchFragment.length(obj2)) {
                    this.length.m_().setMax(obj2);
                    this.length.ICustomTabsCallback();
                    if (!this.length.hashCode && (globalSearchErrorStateView = (GlobalSearchErrorStateView) this.length.getMax(resetInternal.setMax.createCount)) != null) {
                        globalSearchErrorStateView.setErrorState("success");
                    }
                    if (!this.length.getMin) {
                        RecyclerView recyclerView = (RecyclerView) this.length.getMax(resetInternal.setMax.setSupportImageTintList);
                        if (recyclerView != null) {
                            recyclerView.setVisibility(0);
                        }
                        NestedScrollView nestedScrollView = (NestedScrollView) this.length.getMax(resetInternal.setMax.getTitle);
                        if (nestedScrollView != null) {
                            nestedScrollView.setVisibility(0);
                        }
                    }
                } else {
                    this.length.values = false;
                    GlobalSearchErrorStateView globalSearchErrorStateView2 = (GlobalSearchErrorStateView) this.length.getMax(resetInternal.setMax.createCount);
                    if (globalSearchErrorStateView2 != null && !globalSearchErrorStateView2.isShown()) {
                        this.length.b();
                    }
                    RecyclerView recyclerView2 = (RecyclerView) this.length.getMax(resetInternal.setMax.setSupportImageTintList);
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(8);
                    }
                    NestedScrollView nestedScrollView2 = (NestedScrollView) this.length.getMax(resetInternal.setMax.getTitle);
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.setVisibility(8);
                    }
                    if (!this.length.toString) {
                        GlobalSearchFragment.getMin(this.length, obj2);
                    }
                }
                if (this.length.hashCode) {
                    this.length.hashCode = false;
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }

        public final void setMin() {
            this.length.values = false;
            this.length.b();
            NestedScrollView nestedScrollView = (NestedScrollView) this.length.getMax(resetInternal.setMax.getTitle);
            if (nestedScrollView != null) {
                nestedScrollView.setVisibility(8);
            }
            RecyclerView recyclerView = (RecyclerView) this.length.getMax(resetInternal.setMax.setSupportImageTintList);
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            GlobalSearchFragment globalSearchFragment = this.length;
            globalSearchFragment.m_().length();
            globalSearchFragment.m_().getMin();
        }

        public final void length() {
            this.length.values = false;
            this.length.create();
            this.length.requireActivity().onBackPressed();
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "text");
            this.length.values = false;
            this.length.hashCode = true;
            if (GlobalSearchFragment.length(str)) {
                this.length.m_().setMax((Function1<? super Boolean, Unit>) new ICustomTabsCallback(this.length, str, (String) null));
            }
            this.length.setMax.setKeywordUsage(TrackerKey.KeywordType.CUSTOM);
            this.length.setMax.setKeywordResult(str);
        }
    }

    public final void getMax(@NotNull List<RecentAutoComplete> list) {
        Intrinsics.checkNotNullParameter(list, "recentAutoCompleteList");
        getMax(false);
        this.values = true;
        GriverDecodeUrl.AnonymousClass1.AnonymousClass1 r0 = this.equals;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autoCompleteAdapter");
        }
        r0.getMin(list);
    }

    public final void getMin() {
        this.values = false;
        toFloatRange("003");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "onItemClick"}, k = 3, mv = {1, 4, 2})
    static final class invoke implements Ignore.setMin {
        final /* synthetic */ GlobalSearchFragment setMax;

        invoke(GlobalSearchFragment globalSearchFragment) {
            this.setMax = globalSearchFragment;
        }

        public final void length(int i) {
            getAlpha.length min = this.setMax.m_();
            Object min2 = GlobalSearchFragment.hashCode(this.setMax).setMin(i);
            Intrinsics.checkNotNullExpressionValue(min2, "recentSearchAdapter.getItem(it)");
            min.setMin((String) min2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "onItemClick", "id/dana/globalsearch/view/GlobalSearchFragment$setupRecyclerView$6$1"}, k = 3, mv = {1, 4, 2})
    static final class valueOf implements Ignore.setMin {
        final /* synthetic */ GlobalSearchFragment getMax;

        valueOf(GlobalSearchFragment globalSearchFragment) {
            this.getMax = globalSearchFragment;
        }

        public final void length(int i) {
            GlobalSearchFragment.length(this.getMax, i);
        }
    }

    /* access modifiers changed from: private */
    public static boolean length(String str) {
        return str.length() >= 3;
    }

    /* access modifiers changed from: private */
    public final void b() {
        View max = getMax(resetInternal.setMax.StyleRes);
        if (max != null) {
            Intrinsics.checkNotNullParameter(max, "<this>");
            max.setVisibility(8);
        }
        GlobalSearchErrorStateView globalSearchErrorStateView = (GlobalSearchErrorStateView) getMax(resetInternal.setMax.createCount);
        if (globalSearchErrorStateView != null) {
            globalSearchErrorStateView.setErrorState(GlobalSearchErrorCode.INITIAL_STATE);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/globalsearch/view/GlobalSearchFragment$setupLocationCallback$1$1"}, k = 3, mv = {1, 4, 2})
    static final class toString implements View.OnClickListener {
        final /* synthetic */ GlobalSearchFragment getMin;

        toString(GlobalSearchFragment globalSearchFragment) {
            this.getMin = globalSearchFragment;
        }

        public final void onClick(View view) {
            this.getMin.FastBitmap$CoordinateSystem.setMax();
        }
    }

    public final void getMax(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        CategoryVerticalView categoryVerticalView = (CategoryVerticalView) getMax(resetInternal.setMax.onVolumeInfoChanged);
        if (categoryVerticalView != null) {
            categoryVerticalView.setData(searchResultModel);
            categoryVerticalView.setItemClickCallback(new IsOverlapping(this, searchResultModel));
        }
    }

    public final void setMin(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        CategoryVerticalView categoryVerticalView = (CategoryVerticalView) getMax(resetInternal.setMax.onCaptioningEnabledChanged);
        if (categoryVerticalView != null) {
            categoryVerticalView.setData(searchResultModel);
            categoryVerticalView.setItemClickCallback(new isInside(this, searchResultModel));
        }
    }

    public final void length(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        CategoryVerticalView categoryVerticalView = (CategoryVerticalView) getMax(resetInternal.setMax.onShuffleModeChanged);
        if (categoryVerticalView != null) {
            categoryVerticalView.setData(searchResultModel);
            categoryVerticalView.setItemClickCallback(new equals(categoryVerticalView, this, searchResultModel));
        }
    }

    public final void getMin(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        CategorySKUView categorySKUView = (CategorySKUView) getMax(resetInternal.setMax.onExtrasChanged);
        if (categorySKUView != null) {
            categorySKUView.setData(searchResultModel);
            categorySKUView.setItemClickCallback(new toFloatRange(this, searchResultModel));
        }
    }

    public final void setMax(@NotNull SearchResultModel searchResultModel) {
        Intrinsics.checkNotNullParameter(searchResultModel, "searchResult");
        CategoryVerticalView categoryVerticalView = (CategoryVerticalView) getMax(resetInternal.setMax.onShuffleModeChangedRemoved);
        if (categoryVerticalView != null) {
            categoryVerticalView.setData(searchResultModel);
            categoryVerticalView.setItemClickCallback(new toIntRange(this, searchResultModel));
        }
    }

    public final void setMin(@NotNull ThirdPartyServiceResponse thirdPartyServiceResponse, @NotNull String str) {
        Intrinsics.checkNotNullParameter(thirdPartyServiceResponse, "thirdPartyService");
        Intrinsics.checkNotNullParameter(str, "url");
        if (isShowMenu.length(str)) {
            toDoubleRange().setMax(str);
            return;
        }
        String min = isShowMenu.setMin(str);
        Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(url)");
        setMin(thirdPartyServiceResponse, min, (String) null, (String) null);
    }

    public final void setMin(@NotNull ThirdPartyServiceResponse thirdPartyServiceResponse, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(thirdPartyServiceResponse, "thirdPartyService");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(str2, "authCode");
        String min = isShowMenu.setMin(str);
        Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(url)");
        setMin(thirdPartyServiceResponse, min, str2, valueOf().getDeviceUUID());
    }

    public final void setMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
        ToolbarGlobalSearchView toolbarGlobalSearchView = (ToolbarGlobalSearchView) getMax(resetInternal.setMax.dispatchDraw);
        if (toolbarGlobalSearchView != null) {
            toolbarGlobalSearchView.showKeyword(str);
        }
        NestedScrollView nestedScrollView = (NestedScrollView) getMax(resetInternal.setMax.getTitle);
        if (nestedScrollView != null) {
            nestedScrollView.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) getMax(resetInternal.setMax.setSupportImageTintList);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    public final void showProgress() {
        this.toString = true;
        setPublishStatus setpublishstatus = (setPublishStatus) this.toDoubleRange.getValue();
        if (!setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
        RecyclerView recyclerView = (RecyclerView) getMax(resetInternal.setMax.setSupportImageTintList);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rv_result_auto_complete");
        recyclerView.setVisibility(8);
        GlobalSearchErrorStateView globalSearchErrorStateView = (GlobalSearchErrorStateView) getMax(resetInternal.setMax.createCount);
        if (globalSearchErrorStateView != null) {
            globalSearchErrorStateView.setErrorState("success");
        }
    }

    public final void getMax() {
        ICustomTabsCallback();
        setOnWheelViewListener.getMax((Activity) getActivity());
        b();
    }

    public final void setMin(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "populars");
        if (!list.isEmpty()) {
            getEventManifests geteventmanifests = this.toIntRange;
            if (geteventmanifests == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popularSearchAdapter");
            }
            geteventmanifests.getMin(list);
            LinearLayout linearLayout = (LinearLayout) getMax(resetInternal.setMax.removeItemAt);
            if (linearLayout != null) {
                linearLayout.setVisibility(0);
            }
            getMax(true);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) getMax(resetInternal.setMax.removeItemAt);
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    private final void getMax(boolean z) {
        if (!z || this.values) {
            View max = getMax(resetInternal.setMax.ComponentActivity$5);
            if (max != null) {
                max.setVisibility(8);
                return;
            }
            return;
        }
        View max2 = getMax(resetInternal.setMax.ComponentActivity$5);
        if (max2 != null) {
            max2.setVisibility(0);
        }
        RecyclerView recyclerView = (RecyclerView) getMax(resetInternal.setMax.setSupportImageTintList);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        GlobalSearchErrorStateView globalSearchErrorStateView = (GlobalSearchErrorStateView) getMax(resetInternal.setMax.createCount);
        if (globalSearchErrorStateView != null) {
            globalSearchErrorStateView.setErrorState(GlobalSearchErrorCode.INITIAL_STATE);
        }
    }

    public final void setMax(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "recents");
        if (!list.isEmpty()) {
            GriverExtensionDelegate griverExtensionDelegate = this.IsOverlapping;
            if (griverExtensionDelegate == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recentSearchAdapter");
            }
            griverExtensionDelegate.getMin(list);
            GlobalSearchErrorStateView globalSearchErrorStateView = (GlobalSearchErrorStateView) getMax(resetInternal.setMax.createCount);
            if (globalSearchErrorStateView != null && !globalSearchErrorStateView.isShown()) {
                LinearLayout linearLayout = (LinearLayout) getMax(resetInternal.setMax.removeItemAtInt);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                getMax(true);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) getMax(resetInternal.setMax.removeItemAtInt);
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void ICustomTabsCallback() {
        CategoryVerticalView categoryVerticalView = (CategoryVerticalView) getMax(resetInternal.setMax.onVolumeInfoChanged);
        if (categoryVerticalView != null) {
            categoryVerticalView.setVisibility(8);
        }
        CategoryVerticalView categoryVerticalView2 = (CategoryVerticalView) getMax(resetInternal.setMax.onCaptioningEnabledChanged);
        if (categoryVerticalView2 != null) {
            categoryVerticalView2.setVisibility(8);
        }
        CategoryVerticalView categoryVerticalView3 = (CategoryVerticalView) getMax(resetInternal.setMax.onShuffleModeChanged);
        if (categoryVerticalView3 != null) {
            categoryVerticalView3.setVisibility(8);
        }
        CategorySKUView categorySKUView = (CategorySKUView) getMax(resetInternal.setMax.onExtrasChanged);
        if (categorySKUView != null) {
            categorySKUView.setVisibility(8);
        }
        CategoryVerticalView categoryVerticalView4 = (CategoryVerticalView) getMax(resetInternal.setMax.onShuffleModeChangedRemoved);
        if (categoryVerticalView4 != null) {
            categoryVerticalView4.setVisibility(8);
        }
    }

    private final void toFloatRange(String str) {
        GlobalSearchErrorStateView globalSearchErrorStateView = (GlobalSearchErrorStateView) getMax(resetInternal.setMax.createCount);
        if (globalSearchErrorStateView != null) {
            globalSearchErrorStateView.setErrorState(str);
            globalSearchErrorStateView.setTryAgainClickListener(new onNavigationEvent(this, str));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/globalsearch/view/GlobalSearchFragment$showErrorState$1$1"}, k = 3, mv = {1, 4, 2})
    static final class onNavigationEvent extends Lambda implements Function0<Unit> {
        final /* synthetic */ String $errorMessage$inlined;
        final /* synthetic */ GlobalSearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        onNavigationEvent(GlobalSearchFragment globalSearchFragment, String str) {
            super(0);
            this.this$0 = globalSearchFragment;
            this.$errorMessage$inlined = str;
        }

        public final void invoke() {
            GlobalSearchFragment globalSearchFragment = this.this$0;
            ToolbarGlobalSearchView toolbarGlobalSearchView = (ToolbarGlobalSearchView) globalSearchFragment.getMax(resetInternal.setMax.dispatchDraw);
            String valueOf = String.valueOf(toolbarGlobalSearchView != null ? toolbarGlobalSearchView.getKeyword() : null);
            if (valueOf != null) {
                globalSearchFragment.m_().setMax((Function1<? super Boolean, Unit>) new ICustomTabsCallback(globalSearchFragment, StringsKt.trim((CharSequence) valueOf).toString(), (String) null));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/globalsearch/view/GlobalSearchFragment$Companion;", "", "()V", "FROM_POPULAR_SEARCH_PARAMS", "", "REQUEST_CODE_LOCATION_SETTINGS", "", "REQUEST_CODE_PERMISSION_REQUEST", "SEARCH_PARAMS", "newInstance", "Lid/dana/globalsearch/view/GlobalSearchFragment;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin {
        private getMin() {
        }

        public /* synthetic */ getMin(byte b) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class setMin<T> implements RedDotManager<Throwable> {
        final /* synthetic */ String getMax;
        final /* synthetic */ List setMax;
        final /* synthetic */ GlobalSearchFragment setMin;

        setMin(GlobalSearchFragment globalSearchFragment, String str, List list) {
            this.setMin = globalSearchFragment;
            this.getMax = str;
            this.setMax = list;
        }

        public final /* synthetic */ void accept(Object obj) {
            setRootAlpha.length(this.setMin.m_(), this.getMax, 0, 0, this.setMax, (Location) null, 22);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class hashCode<T> implements RedDotManager<Throwable> {
        final /* synthetic */ GlobalSearchFragment setMin;

        hashCode(GlobalSearchFragment globalSearchFragment) {
            this.setMin = globalSearchFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.setMin.m_().IsOverlapping();
        }
    }

    public final void isInside() {
        this.getMax.showWarningDialog(getString(R.string.global_search_error_message_dialog));
    }

    public final void dismissProgress() {
        ((setPublishStatus) this.toDoubleRange.getValue()).getMax();
        this.toString = false;
    }

    public final void onError(@Nullable String str) {
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        if (getOriginStartParams.isNetworkAvailable(baseActivity)) {
            if (Intrinsics.areEqual((Object) str, (Object) "004")) {
                this.getMax.showWarningDialog(getString(R.string.global_search_error_message_dialog));
            } else if (str != null) {
                toFloatRange(str);
            }
            if (Intrinsics.areEqual((Object) str, (Object) "003")) {
                ((ToolbarGlobalSearchView) getMax(resetInternal.setMax.dispatchDraw)).hideClearSearchButton();
                ((ToolbarGlobalSearchView) getMax(resetInternal.setMax.dispatchDraw)).clearPointerFocus();
            }
        } else {
            toFloatRange("002");
        }
        LinearLayout linearLayout = (LinearLayout) getMax(resetInternal.setMax.removeItemAtInt);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "llContainerRecent");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) getMax(resetInternal.setMax.removeItemAt);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "llContainerPopular");
        linearLayout2.setVisibility(8);
        this.setMax.setResultStatusType(str);
        GriverManifest.AnonymousClass11 r4 = this.globalSearchAnalyticTracker;
        if (r4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
        }
        r4.setMax(this.setMax);
        this.setMax = new SearchResultOpenTrackerModel();
    }

    public final void length() {
        this.setMax.setResultStatusType(getLeftSelectedOption.getMax(getContext(), "android.permission.ACCESS_FINE_LOCATION"));
        GriverManifest.AnonymousClass11 r0 = this.globalSearchAnalyticTracker;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
        }
        r0.setMax(this.setMax);
        this.setMax = new SearchResultOpenTrackerModel();
    }

    public final void create() {
        ICustomTabsCallback();
        setOnWheelViewListener.getMax((Activity) getActivity());
        b();
        ((ToolbarGlobalSearchView) getMax(resetInternal.setMax.dispatchDraw)).clearSearch();
        RecyclerView recyclerView = (RecyclerView) getMax(resetInternal.setMax.setSupportImageTintList);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        this.values = false;
    }

    public static final /* synthetic */ void length(GlobalSearchFragment globalSearchFragment, String str, List list) {
        GriverProgressBar.UpdateRunnable updateRunnable = globalSearchFragment.isInside;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            globalSearchFragment.isInside = null;
        }
        globalSearchFragment.isInside = new WheelView.ScrollerTask.getMax(globalSearchFragment.getContext()).getMin().subscribe(new setMax(globalSearchFragment, str, list), new setMin(globalSearchFragment, str, list));
    }

    public static final /* synthetic */ void getMin(GlobalSearchFragment globalSearchFragment) {
        GriverProgressBar.UpdateRunnable updateRunnable = globalSearchFragment.isInside;
        if (updateRunnable != null) {
            updateRunnable.dispose();
            globalSearchFragment.isInside = null;
        }
    }

    public static final /* synthetic */ void setMin(GlobalSearchFragment globalSearchFragment, String str) {
        Intent putExtra = new Intent(globalSearchFragment.getContext(), SeeAllActivity.class).putExtra(SeeAllActivity.GLOBAL_SEARCH_CATEGORY, str);
        ToolbarGlobalSearchView toolbarGlobalSearchView = (ToolbarGlobalSearchView) globalSearchFragment.getMax(resetInternal.setMax.dispatchDraw);
        String valueOf2 = String.valueOf(toolbarGlobalSearchView != null ? toolbarGlobalSearchView.getKeyword() : null);
        if (valueOf2 != null) {
            Intent putExtra2 = putExtra.putExtra(SeeAllActivity.GLOBAL_SEARCH_KEYWORD, StringsKt.trim((CharSequence) valueOf2).toString());
            Intrinsics.checkNotNullExpressionValue(putExtra2, "Intent(context, SeeAllAc…ng().trim()\n            )");
            globalSearchFragment.startActivityForResult(putExtra2, 24);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public static final /* synthetic */ void getMin(GlobalSearchFragment globalSearchFragment, String str) {
        if (str.length() > 0) {
            GlobalSearchErrorStateView globalSearchErrorStateView = (GlobalSearchErrorStateView) globalSearchFragment.getMax(resetInternal.setMax.createCount);
            if (globalSearchErrorStateView != null) {
                globalSearchErrorStateView.setErrorState(GlobalSearchErrorCode.EMPTY_KEYWORD);
                return;
            }
            return;
        }
        globalSearchFragment.getMax(true);
    }

    public static final /* synthetic */ void setMax(GlobalSearchFragment globalSearchFragment, int i) {
        GriverDecodeUrl.AnonymousClass1.AnonymousClass1 r0 = globalSearchFragment.equals;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("autoCompleteAdapter");
        }
        RecentAutoComplete recentAutoComplete = (RecentAutoComplete) r0.setMin(i);
        if (recentAutoComplete != null) {
            globalSearchFragment.m_().setMax((Function1<? super Boolean, Unit>) new ICustomTabsCallback(globalSearchFragment, recentAutoComplete.getName(), recentAutoComplete.getCategory()));
            globalSearchFragment.setMax.setKeywordUsageType(recentAutoComplete.getBelongTo(), i);
            globalSearchFragment.setMax.setKeywordResult(recentAutoComplete.getName());
        }
    }

    public static final /* synthetic */ void setMin(GlobalSearchFragment globalSearchFragment, int i) {
        getEventManifests geteventmanifests = globalSearchFragment.toIntRange;
        if (geteventmanifests == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popularSearchAdapter");
        }
        String str = (String) geteventmanifests.setMin(i);
        if (str != null) {
            globalSearchFragment.m_().setMax((Function1<? super Boolean, Unit>) new ICustomTabsCallback(globalSearchFragment, str, (String) null));
            globalSearchFragment.setMax.setKeywordUsage(TrackerKey.KeywordType.POPULAR);
            globalSearchFragment.setMax.setKeywordResult(str);
        }
    }

    public static final /* synthetic */ void length(GlobalSearchFragment globalSearchFragment, int i) {
        GriverExtensionDelegate griverExtensionDelegate = globalSearchFragment.IsOverlapping;
        if (griverExtensionDelegate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recentSearchAdapter");
        }
        String str = (String) griverExtensionDelegate.setMin(i);
        if (str != null) {
            globalSearchFragment.m_().setMax((Function1<? super Boolean, Unit>) new ICustomTabsCallback(globalSearchFragment, str, (String) null));
            globalSearchFragment.setMax.setKeywordUsage(TrackerKey.KeywordType.HISTORY);
            globalSearchFragment.setMax.setKeywordResult(str);
        }
    }

    public static final /* synthetic */ void length(GlobalSearchFragment globalSearchFragment, PaySearchInfoModel paySearchInfoModel) {
        GlobalSearchBottomSheetDialog globalSearchBottomSheetDialog = new GlobalSearchBottomSheetDialog();
        Intrinsics.checkNotNullParameter(paySearchInfoModel, "paySearchInfo");
        globalSearchBottomSheetDialog.getMin = paySearchInfoModel;
        BaseActivity baseActivity = globalSearchFragment.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        globalSearchBottomSheetDialog.show(baseActivity.getSupportFragmentManager(), "Show Nearby Bottom Sheet for Global Search");
        GriverManifest.AnonymousClass11 r0 = globalSearchFragment.globalSearchAnalyticTracker;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
        }
        r0.setMax();
        GriverManifest.AnonymousClass11 r3 = globalSearchFragment.globalSearchAnalyticTracker;
        if (r3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("globalSearchAnalyticTracker");
        }
        r3.getMax(paySearchInfoModel);
    }

    public static final /* synthetic */ void setMax(GlobalSearchFragment globalSearchFragment, String str) {
        if (str == null) {
            return;
        }
        if (StringsKt.contains$default((CharSequence) MyBeaconServiceImpl.length(str), (CharSequence) "https://link.dana.id/", false, 2, (Object) null)) {
            getDuration.length doubleRange = globalSearchFragment.toDoubleRange();
            String max = setH5MenuList.setMax(str, "");
            Intrinsics.checkNotNullExpressionValue(max, "TextUtil.composeSceneDeeplinkUrl(this, \"\")");
            doubleRange.setMax(max);
        } else if (!WindowBridgeExtension.AnonymousClass1.getMin()) {
            String min = isShowMenu.setMin(str);
            Intrinsics.checkNotNullExpressionValue(min, "UrlUtil.getCleanUrl(this)");
            DanaH5.startContainerFullUrl(min);
        }
    }

    public static final /* synthetic */ void FastBitmap$CoordinateSystem(GlobalSearchFragment globalSearchFragment) {
        LocationRequest create2 = LocationRequest.create();
        create2.setPriority(102);
        create2.setNumUpdates(1);
        LocationSettingsRequest build = new LocationSettingsRequest.Builder().addLocationRequest(create2).setAlwaysShow(true).build();
        uploadCoreByStartService uploadcorebystartservice = new uploadCoreByStartService(globalSearchFragment.requireContext());
        globalSearchFragment.toFloatRange = appendAppLog.setMax(uploadcorebystartservice.setMin, uploadcorebystartservice.setMax, LocationServices.API).flatMap(new RedDotDrawable<GoogleApiClient, TitleBarRightButtonView.AnonymousClass1<LocationSettingsResult>>(build) {
            final /* synthetic */ LocationSettingsRequest getMin;

            public final /* synthetic */ java.lang.Object apply(
/*
Method generation error in method: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, dex: classes4.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.uploadCoreByStartService.4.apply(java.lang.Object):java.lang.Object, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        }).subscribe(new values(globalSearchFragment), new hashCode(globalSearchFragment));
    }

    @JvmStatic
    @NotNull
    public static final GlobalSearchFragment onNavigationEvent() {
        return new GlobalSearchFragment();
    }
}
