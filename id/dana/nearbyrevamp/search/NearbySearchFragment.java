package id.dana.nearbyrevamp.search;

import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseActivity;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.di.modules.NearbyMerchantLocationSearchModule;
import id.dana.di.modules.NearbySearchModule;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.search.searchresult.MerchantSearchResultFragment;
import id.dana.nearbyrevamp.search.searchresult.NearbySearchResultErrorView;
import id.dana.nearbyrevamp.view.NearbySearchToolbar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o.AppCompatActivity;
import o.BaseResourcePackage;
import o.FtsOptions$Order;
import o.GriverDefaultOpenSettingExtension;
import o.OpenUserIdBridgeExtension;
import o.PrepareException;
import o.ProgramSettingExtension;
import o.dispatchOnCancelled;
import o.getCreateTime;
import o.getInsetDodgeRect;
import o.getSetting;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.openSetting;
import o.processFacade;
import o.resetInternal;
import o.setOnWheelViewListener;
import o.setPublishStatus;
import o.setTextColor;
import o.showAuthGuide;
import o.showOpenSettingView;
import o.stopIgnoring;
import o.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014*\u0003369\u0018\u0000 `2\u00020\u00012\u00020\u0002:\u0001`B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0014J\u0010\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020(H\u0002J\u0010\u0010-\u001a\u00020$2\u0006\u0010,\u001a\u00020(H\u0002J\n\u0010.\u001a\u0004\u0018\u00010/H\u0002J\n\u00100\u001a\u0004\u0018\u000101H\u0002J\r\u00102\u001a\u000203H\u0002¢\u0006\u0002\u00104J\r\u00105\u001a\u000206H\u0002¢\u0006\u0002\u00107J\r\u00108\u001a\u000209H\u0002¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020$H\u0002J\b\u0010<\u001a\u00020$H\u0014J\b\u0010=\u001a\u00020$H\u0002J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020(H\u0002J\u0016\u0010@\u001a\u00020$2\u0006\u0010,\u001a\u00020(2\u0006\u0010A\u001a\u00020*J\b\u0010B\u001a\u00020\"H\u0016J\b\u0010C\u001a\u00020$H\u0002J\u0010\u0010D\u001a\u00020$2\u0006\u0010E\u001a\u00020\u0005H\u0016J\u0010\u0010F\u001a\u00020$2\u0006\u0010G\u001a\u00020HH\u0016J\b\u0010I\u001a\u00020$H\u0016J\u001e\u0010J\u001a\u00020$2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010N\u001a\u00020\"H\u0016J&\u0010O\u001a\u00020$2\u0006\u0010K\u001a\u00020M2\f\u0010P\u001a\b\u0012\u0004\u0012\u00020M0L2\u0006\u0010N\u001a\u00020\"H\u0016J\b\u0010Q\u001a\u00020$H\u0016J\b\u0010R\u001a\u00020$H\u0002J\u0006\u0010S\u001a\u00020$J\u0010\u0010T\u001a\u00020$2\u0006\u0010,\u001a\u00020(H\u0002J\u0010\u0010U\u001a\u00020$2\u0006\u0010,\u001a\u00020(H\u0002J\u0010\u0010V\u001a\u00020$2\u0006\u0010,\u001a\u00020(H\u0002J\u0010\u0010W\u001a\u00020$2\u0006\u0010X\u001a\u00020(H\u0002J\u000e\u0010Y\u001a\u00020$2\u0006\u0010\u0012\u001a\u00020\u0002J\b\u0010Z\u001a\u00020$H\u0002J\b\u0010[\u001a\u00020$H\u0002J\b\u0010\\\u001a\u00020$H\u0002J\b\u0010]\u001a\u00020$H\u0002J\u0010\u0010^\u001a\u00020$2\u0006\u0010_\u001a\u00020\"H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000¨\u0006a"}, d2 = {"Lid/dana/nearbyrevamp/search/NearbySearchFragment;", "Lid/dana/base/BaseFragment;", "Lid/dana/nearbyrevamp/search/NearbySearchResultListener;", "()V", "currentLocation", "Landroid/location/Location;", "danaLoadingDialog", "Lid/dana/dialog/DanaLoadingDialog;", "getDanaLoadingDialog", "()Lid/dana/dialog/DanaLoadingDialog;", "danaLoadingDialog$delegate", "Lkotlin/Lazy;", "nearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "getNearbyAnalyticTracker", "()Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "setNearbyAnalyticTracker", "(Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;)V", "nearbySearchResultListener", "nearbySearchSectionAdapter", "Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter;", "presenter", "Lid/dana/nearbyrevamp/search/NearbySearchContract$Presenter;", "getPresenter", "()Lid/dana/nearbyrevamp/search/NearbySearchContract$Presenter;", "setPresenter", "(Lid/dana/nearbyrevamp/search/NearbySearchContract$Presenter;)V", "searchPresenter", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$Presenter;", "getSearchPresenter", "()Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$Presenter;", "setSearchPresenter", "(Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$Presenter;)V", "shouldFilterIrrelevantMerchant", "", "getBundle", "", "getFragment", "Landroidx/fragment/app/Fragment;", "key", "", "getLayout", "", "getListLocations", "keyword", "getListShop", "getLocationSearchResultFragment", "Lid/dana/nearbyrevamp/search/searchresult/LocationSearchResultFragment;", "getMerchantSearchResultFragment", "Lid/dana/nearbyrevamp/search/searchresult/MerchantSearchResultFragment;", "getNearbyMerchantLocationView", "id/dana/nearbyrevamp/search/NearbySearchFragment$getNearbyMerchantLocationView$1", "()Lid/dana/nearbyrevamp/search/NearbySearchFragment$getNearbyMerchantLocationView$1;", "getNearbySearchView", "id/dana/nearbyrevamp/search/NearbySearchFragment$getNearbySearchView$1", "()Lid/dana/nearbyrevamp/search/NearbySearchFragment$getNearbySearchView$1;", "getNearbySectionListener", "id/dana/nearbyrevamp/search/NearbySearchFragment$getNearbySectionListener$1", "()Lid/dana/nearbyrevamp/search/NearbySearchFragment$getNearbySectionListener$1;", "hideKeyboard", "init", "injectComponent", "isSearchQueryLengthValid", "text", "loadNextPage", "lastRanking", "onBackPressed", "onCancelSearchBox", "onLocationSelected", "location", "onPlaceSelected", "nearbyLocation", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "onResume", "onSeeOnMapClicked", "shopModel", "", "Lid/dana/nearbyme/model/ShopModel;", "hasMore", "onShopSelected", "allShops", "onStop", "resetKeyword", "resetMerchantSearchState", "searchKeyword", "searchLocation", "searchMerchant", "setCurrentTabSelected", "tag", "setListener", "setupExploreContent", "setupStatusBar", "setupToolbar", "setupViewPager", "showSearchResult", "show", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NearbySearchFragment extends FtsOptions$Order implements GriverDefaultOpenSettingExtension {
    @NotNull
    public static final setMin setMax = new setMin((byte) 0);
    private getSetting IsOverlapping;
    public Location getMin;
    private HashMap isInside;
    @Inject
    public t nearbyAnalyticTracker;
    @Inject
    public showOpenSettingView.length presenter;
    @Inject
    public setTextColor.length searchPresenter;
    public GriverDefaultOpenSettingExtension setMin;
    private final Lazy toFloatRange = LazyKt.lazy(new setMax(this));

    @JvmDefault
    public final void q_() {
    }

    public final int setMin() {
        return R.layout.fragment_explore_nearby;
    }

    public final View setMin(int i) {
        if (this.isInside == null) {
            this.isInside = new HashMap();
        }
        View view = (View) this.isInside.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.isInside.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public NearbySearchFragment() {
        Location location = new Location("");
        location.setLatitude(-6.17476d);
        location.setLongitude(106.827072d);
        Intrinsics.checkNotNullExpressionValue(location, "LocationUtil.getDefaultLocation()");
        this.getMin = location;
    }

    public static final /* synthetic */ getSetting toIntRange(NearbySearchFragment nearbySearchFragment) {
        getSetting getsetting = nearbySearchFragment.IsOverlapping;
        if (getsetting == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbySearchSectionAdapter");
        }
        return getsetting;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lid/dana/dialog/DanaLoadingDialog;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<setPublishStatus> {
        final /* synthetic */ NearbySearchFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(NearbySearchFragment nearbySearchFragment) {
            super(0);
            this.this$0 = nearbySearchFragment;
        }

        @NotNull
        public final setPublishStatus invoke() {
            return new setPublishStatus(this.this$0.getMax);
        }
    }

    public final void onResume() {
        super.onResume();
        BaseActivity baseActivity = this.getMax;
        Intrinsics.checkNotNullExpressionValue(baseActivity, "baseActivity");
        Window window = baseActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "baseActivity.window");
        ViewCompat.setMax(window.getDecorView(), (AppCompatActivity) new isInside(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u00042\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/core/view/WindowInsetsCompat;", "kotlin.jvm.PlatformType", "v", "Landroid/view/View;", "insets", "onApplyWindowInsets"}, k = 3, mv = {1, 4, 2})
    static final class isInside implements AppCompatActivity {
        final /* synthetic */ NearbySearchFragment length;

        isInside(NearbySearchFragment nearbySearchFragment) {
            this.length = nearbySearchFragment;
        }

        public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
            NearbySearchToolbar nearbySearchToolbar;
            if (windowInsetsCompat.length(WindowInsetsCompat.Type.getMax()).length > 0 && (nearbySearchToolbar = (NearbySearchToolbar) this.length.setMin(resetInternal.setMax.measureHeightOfChildrenCompat)) != null) {
                nearbySearchToolbar.setTopPadding(windowInsetsCompat.length(WindowInsetsCompat.Type.getMax()).length);
            }
            return WindowInsetsCompat.getMax;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/search/NearbySearchFragment$setupToolbar$1$1", "Lid/dana/nearbyrevamp/view/NearbySearchToolbar$Listener;", "onBackPressed", "", "onCancel", "onClear", "onSearch", "keyword", "", "onSearchTextChanged", "text", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toFloatRange implements NearbySearchToolbar.setMin {
        final /* synthetic */ NearbySearchToolbar setMax;
        final /* synthetic */ NearbySearchFragment setMin;

        toFloatRange(NearbySearchToolbar nearbySearchToolbar, NearbySearchFragment nearbySearchFragment) {
            this.setMax = nearbySearchToolbar;
            this.setMin = nearbySearchFragment;
        }

        public final void setMax() {
            NearbySearchFragment.setMax(this.setMin);
        }

        public final void setMin() {
            setOnWheelViewListener.length((View) (EditText) this.setMax._$_findCachedViewById(resetInternal.setMax.mask));
            FragmentActivity activity = this.setMin.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }

        public final void length(@NotNull String str) {
            int length = str != null ? str.length() : 0;
            int max = dispatchOnCancelled.setMax(length);
            if (length != max) {
                onCanceled oncanceled = new onCanceled(length, max, 1);
                onCancelLoad.setMax(-920940325, oncanceled);
                onCancelLoad.getMin(-920940325, oncanceled);
            }
            Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
            NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) this.setMin.setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
            if (nearbySearchToolbar != null) {
                nearbySearchToolbar.clearFocusFromSearchBox();
            }
            NearbySearchFragment.getMax(this.setMin, str);
        }

        public final void length() {
            this.setMin.getMax();
            this.setMin.getMax(false);
            NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) this.setMin.setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
            if (nearbySearchToolbar != null) {
                nearbySearchToolbar.focusEditText();
            }
            GriverDefaultOpenSettingExtension length = this.setMin.setMin;
            if (length != null) {
                length.q_();
            }
        }

        public final void getMin(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "text");
            String obj = StringsKt.trim((CharSequence) str).toString();
            if (NearbySearchFragment.getMax(obj)) {
                NearbySearchFragment.getMax(this.setMin, obj);
                return;
            }
            if (obj.length() == 0) {
                this.setMin.getMax(false);
            }
        }
    }

    /* access modifiers changed from: private */
    public static boolean getMax(String str) {
        return str.length() >= 3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/search/NearbySearchFragment$setupExploreContent$2$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class toIntRange extends RecyclerView.toIntRange {
        final /* synthetic */ NearbySearchFragment length;

        toIntRange(NearbySearchFragment nearbySearchFragment) {
            this.length = nearbySearchFragment;
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            NearbySearchFragment.getMin(this.length);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"id/dana/nearbyrevamp/search/NearbySearchFragment$getNearbySectionListener$1", "Lid/dana/nearbyrevamp/search/adapter/NearbySearchSectionAdapter$NearbySectionListener;", "onKeywordClicked", "", "keyword", "", "tag", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin implements getSetting.setMax {
        final /* synthetic */ NearbySearchFragment length;

        getMin(NearbySearchFragment nearbySearchFragment) {
            this.length = nearbySearchFragment;
        }

        public final void getMin(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
            Intrinsics.checkNotNullParameter(str2, "tag");
            NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) this.length.setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
            if (nearbySearchToolbar != null) {
                nearbySearchToolbar.setText(str);
            }
            NearbySearchToolbar nearbySearchToolbar2 = (NearbySearchToolbar) this.length.setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
            if (nearbySearchToolbar2 != null) {
                nearbySearchToolbar2.clearFocusFromSearchBox();
            }
            NearbySearchFragment.setMax(this.length, str2);
        }
    }

    /* access modifiers changed from: private */
    public final void getMax(boolean z) {
        ConstraintLayout constraintLayout = (ConstraintLayout) setMin(resetInternal.setMax.playFromUri);
        int i = 0;
        if (constraintLayout != null) {
            View view = constraintLayout;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z ? 0 : 8);
        }
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.getListPopupWindow);
        if (recyclerView != null) {
            View view2 = recyclerView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            if (!z2) {
                i = 8;
            }
            view2.setVisibility(i);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\f"}, d2 = {"id/dana/nearbyrevamp/search/NearbySearchFragment$setupViewPager$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "onPageScrollStateChanged", "", "state", "", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements ViewPager.setMax {
        final /* synthetic */ NearbySearchFragment getMin;

        public final void onPageScrollStateChanged(int i) {
        }

        public final void onPageScrolled(int i, float f, int i2) {
        }

        equals(NearbySearchFragment nearbySearchFragment) {
            this.getMin = nearbySearchFragment;
        }

        public final void onPageSelected(int i) {
            this.getMin.getMax(true);
            NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) this.getMin.setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
            String keyword = nearbySearchToolbar != null ? nearbySearchToolbar.getKeyword() : null;
            if (keyword == null) {
                keyword = "";
            }
            if (i != 1) {
                this.getMin.length(keyword);
            } else {
                this.getMin.isInside(keyword);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void length(String str) {
        String str2;
        t tVar = this.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        tVar.length(str, "Merchant");
        if (str.length() > 0) {
            Fragment max = setMax("merchant");
            MerchantSearchResultFragment merchantSearchResultFragment = null;
            if (!(max instanceof MerchantSearchResultFragment)) {
                max = null;
            }
            MerchantSearchResultFragment merchantSearchResultFragment2 = (MerchantSearchResultFragment) max;
            if (merchantSearchResultFragment2 != null) {
                str2 = merchantSearchResultFragment2.getMin;
            } else {
                str2 = null;
            }
            if (true ^ Intrinsics.areEqual((Object) str, (Object) str2)) {
                Fragment max2 = setMax("merchant");
                if (max2 instanceof MerchantSearchResultFragment) {
                    merchantSearchResultFragment = max2;
                }
                MerchantSearchResultFragment merchantSearchResultFragment3 = merchantSearchResultFragment;
                if (merchantSearchResultFragment3 != null) {
                    Intrinsics.checkNotNullParameter(str, "newKeyword");
                    merchantSearchResultFragment3.getMin = str;
                }
                setMin(str);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void isInside(String str) {
        String str2;
        t tVar = this.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        tVar.length(str, "Location");
        if (str.length() > 0) {
            Fragment max = setMax("location");
            openSetting opensetting = null;
            if (!(max instanceof openSetting)) {
                max = null;
            }
            openSetting opensetting2 = (openSetting) max;
            if (opensetting2 != null) {
                str2 = opensetting2.getMin;
            } else {
                str2 = null;
            }
            if (true ^ Intrinsics.areEqual((Object) str, (Object) str2)) {
                Fragment max2 = setMax("location");
                if (max2 instanceof openSetting) {
                    opensetting = max2;
                }
                openSetting opensetting3 = opensetting;
                if (opensetting3 != null) {
                    Intrinsics.checkNotNullParameter(str, "newKeyword");
                    opensetting3.getMin = str;
                }
                toIntRange(str);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.fragment.app.Fragment setMax(java.lang.String r6) {
        /*
            r5 = this;
            androidx.fragment.app.FragmentManager r0 = r5.getChildFragmentManager()
            java.lang.String r1 = "childFragmentManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            o.scheduleDrawable r0 = r0.getMin
            java.util.List r0 = r0.getMin()
            java.lang.String r1 = "childFragmentManager.fragments"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r0.next()
            r3 = r1
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            java.lang.String r4 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            android.os.Bundle r3 = r3.getArguments()
            if (r3 == 0) goto L_0x0039
            java.lang.String r2 = "key"
            java.lang.String r2 = r3.getString(r2)
        L_0x0039:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r6)
            if (r2 == 0) goto L_0x001a
            r2 = r1
        L_0x0040:
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.nearbyrevamp.search.NearbySearchFragment.setMax(java.lang.String):androidx.fragment.app.Fragment");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016J\u001e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bH\u0016¨\u0006\u0015"}, d2 = {"id/dana/nearbyrevamp/search/NearbySearchFragment$getNearbyMerchantLocationView$1", "Lid/dana/contract/nearbyme/NearbyMerchantLocationSearchContract$View;", "onErrorGetDetailLocation", "", "onErrorGetListLocations", "onErrorGetNearbyMerchantList", "onSuccessGetDetailLocation", "location", "Landroid/location/Location;", "onSuccessGetListLocations", "nearbyLocations", "", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "onSuccessGetMerchantListPromo", "shopsWithPromo", "Lid/dana/nearbyme/model/ShopModel;", "onSuccessLoadMoreNearbyMerchantList", "hasMore", "", "shops", "onSuccessSearchNearbyMerchantList", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements setTextColor.getMin {
        final /* synthetic */ NearbySearchFragment setMax;

        @JvmDefault
        public final void getMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
        }

        @JvmDefault
        public final void onSuccessGetReverseGeocodeByLocation(@NotNull processFacade processfacade) {
            Intrinsics.checkNotNullParameter(processfacade, "address");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        /* renamed from: id.dana.nearbyrevamp.search.NearbySearchFragment$getMax$getMax  reason: collision with other inner class name */
        static final class C0046getMax extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ getMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0046getMax(getMax getmax) {
                super(1);
                this.this$0 = getmax;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "it");
                this.this$0.setMax.toIntRange(str);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
        static final class length extends Lambda implements Function1<String, Unit> {
            final /* synthetic */ getMax this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            length(getMax getmax) {
                super(1);
                this.this$0 = getmax;
            }

            public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "it");
                this.this$0.setMax.setMin(str);
            }
        }

        getMax(NearbySearchFragment nearbySearchFragment) {
            this.setMax = nearbySearchFragment;
        }

        public final void onSuccessGetListLocations(@NotNull List<getCreateTime> list) {
            Intrinsics.checkNotNullParameter(list, "nearbyLocations");
            openSetting min = NearbySearchFragment.setMin(this.setMax);
            if (min != null) {
                Intrinsics.checkNotNullParameter(list, "nearbyLocations");
                getInsetDodgeRect getinsetdodgerect = min.setMin;
                if (getinsetdodgerect != null) {
                    getinsetdodgerect.length();
                }
                if (list.isEmpty()) {
                    min.setMax(true);
                    NearbySearchResultErrorView nearbySearchResultErrorView = (NearbySearchResultErrorView) min.setMin(resetInternal.setMax.setMinimumHeight);
                    if (nearbySearchResultErrorView != null) {
                        NearbySearchResultErrorView.show$default(nearbySearchResultErrorView, NearbySearchResultErrorView.ErrorType.NO_RESULT_ERROR, min.getMin, (Function0) null, 4, (Object) null);
                        return;
                    }
                    return;
                }
                min.setMax(false);
                ((OpenUserIdBridgeExtension) min.isInside.getValue()).getMin(list);
            }
        }

        public final void onErrorGetListLocations() {
            openSetting min = NearbySearchFragment.setMin(this.setMax);
            if (min != null) {
                Function1 getmax = new C0046getMax(this);
                Intrinsics.checkNotNullParameter(getmax, "onTryAgain");
                getInsetDodgeRect getinsetdodgerect = min.setMin;
                if (getinsetdodgerect != null) {
                    getinsetdodgerect.length();
                }
                min.setMax(true);
                NearbySearchResultErrorView nearbySearchResultErrorView = (NearbySearchResultErrorView) min.setMin(resetInternal.setMax.setMinimumHeight);
                if (nearbySearchResultErrorView != null) {
                    NearbySearchResultErrorView.show$default(nearbySearchResultErrorView, NearbySearchResultErrorView.ErrorType.NETWORK_ERROR, (String) null, new openSetting.getMax(min, getmax), 2, (Object) null);
                }
            }
        }

        public final void onSuccessGetDetailLocation(@NotNull Location location) {
            Intrinsics.checkNotNullParameter(location, "location");
            NearbySearchFragment.isInside(this.setMax).getMax();
            NearbySearchFragment nearbySearchFragment = this.setMax;
            Intrinsics.checkNotNullParameter(location, "location");
            GriverDefaultOpenSettingExtension griverDefaultOpenSettingExtension = nearbySearchFragment.setMin;
            if (griverDefaultOpenSettingExtension != null) {
                griverDefaultOpenSettingExtension.setMin(location);
            }
        }

        public final void onErrorGetDetailLocation() {
            NearbySearchFragment.isInside(this.setMax).getMax();
            NearbySearchFragment nearbySearchFragment = this.setMax;
            Toast.makeText(nearbySearchFragment.getActivity(), nearbySearchFragment.getContext().getString(R.string.general_error_msg), 0).show();
        }

        public final void getMin(boolean z, @NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
            MerchantSearchResultFragment equals = NearbySearchFragment.equals(this.setMax);
            if (equals != null) {
                Intrinsics.checkNotNullParameter(list, "shops");
                equals.getMax(true);
                onDetachedFromLayoutParams ondetachedfromlayoutparams = equals.toFloatRange;
                if (ondetachedfromlayoutparams != null) {
                    ondetachedfromlayoutparams.length();
                }
                equals.toIntRange = z;
                equals.equals = false;
                if (!list.isEmpty()) {
                    equals.setMax(false);
                    Iterable<ShopModel> take = CollectionsKt.take(list, 3);
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
                    for (ShopModel shopModel : take) {
                        shopModel.ICustomTabsCallback$Default = true;
                        arrayList.add(Unit.INSTANCE);
                    }
                    GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver = equals.setMin;
                    if (settingChangeReceiver == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
                    }
                    settingChangeReceiver.getMin(list);
                    equals.isInside = ((ShopModel) CollectionsKt.last(list)).getInterfaceDescriptor;
                    return;
                }
                equals.setMax(true);
                GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver2 = equals.setMin;
                if (settingChangeReceiver2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
                }
                settingChangeReceiver2.getMin();
                NearbySearchResultErrorView nearbySearchResultErrorView = (NearbySearchResultErrorView) equals.setMin(resetInternal.setMax.setMinimumHeight);
                if (nearbySearchResultErrorView != null) {
                    NearbySearchResultErrorView.show$default(nearbySearchResultErrorView, NearbySearchResultErrorView.ErrorType.NO_RESULT_ERROR, equals.getMin, (Function0) null, 4, (Object) null);
                }
            }
        }

        public final void setMin(boolean z, @NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shops");
            MerchantSearchResultFragment equals = NearbySearchFragment.equals(this.setMax);
            if (equals != null) {
                Intrinsics.checkNotNullParameter(list, "shops");
                equals.toIntRange = z;
                equals.equals = false;
                if (!list.isEmpty()) {
                    equals.isInside = ((ShopModel) CollectionsKt.last(list)).getInterfaceDescriptor;
                    GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver = equals.setMin;
                    if (settingChangeReceiver == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
                    }
                    settingChangeReceiver.setMax();
                    GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver2 = equals.setMin;
                    if (settingChangeReceiver2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
                    }
                    settingChangeReceiver2.length(list);
                }
            }
        }

        public final void setMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shopsWithPromo");
            MerchantSearchResultFragment equals = NearbySearchFragment.equals(this.setMax);
            if (equals != null) {
                Intrinsics.checkNotNullParameter(list, "shopsWithPromo");
                GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver = equals.setMin;
                if (settingChangeReceiver == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
                }
                Intrinsics.checkNotNullParameter(list, "shopsWithPromo");
                Collection max = settingChangeReceiver.getMax();
                if (!(max == null || max.isEmpty())) {
                    for (ShopModel shopModel : list) {
                        List max2 = settingChangeReceiver.getMax();
                        Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
                        Iterator it = max2.iterator();
                        int i = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i = -1;
                                break;
                            }
                            ShopModel shopModel2 = (ShopModel) it.next();
                            Intrinsics.checkNotNullExpressionValue(shopModel2, "it");
                            if (Intrinsics.areEqual((Object) shopModel2.b, (Object) shopModel.b)) {
                                break;
                            }
                            i++;
                        }
                        if (i != -1) {
                            Object obj = settingChangeReceiver.getMax().get(i);
                            Intrinsics.checkNotNullExpressionValue(obj, "items[currentShopIndex]");
                            ((ShopModel) obj).length(shopModel.Mean$Arithmetic);
                            settingChangeReceiver.notifyItemChanged(i);
                        }
                    }
                }
            }
        }

        public final void setMax() {
            setTextColor.length length2 = this.setMax.searchPresenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchPresenter");
            }
            if (length2.setMin() == 1) {
                MerchantSearchResultFragment equals = NearbySearchFragment.equals(this.setMax);
                if (equals != null) {
                    Function1 length3 = new length(this);
                    Intrinsics.checkNotNullParameter(length3, "onTryAgain");
                    equals.equals = false;
                    equals.getMax(true);
                    onDetachedFromLayoutParams ondetachedfromlayoutparams = equals.toFloatRange;
                    if (ondetachedfromlayoutparams != null) {
                        ondetachedfromlayoutparams.length();
                    }
                    equals.setMax(true);
                    GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver = equals.setMin;
                    if (settingChangeReceiver == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
                    }
                    settingChangeReceiver.getMin();
                    NearbySearchResultErrorView nearbySearchResultErrorView = (NearbySearchResultErrorView) equals.setMin(resetInternal.setMax.setMinimumHeight);
                    if (nearbySearchResultErrorView != null) {
                        NearbySearchResultErrorView.show$default(nearbySearchResultErrorView, NearbySearchResultErrorView.ErrorType.NETWORK_ERROR, (String) null, new MerchantSearchResultFragment.length(equals, length3), 2, (Object) null);
                        return;
                    }
                    return;
                }
                return;
            }
            MerchantSearchResultFragment equals2 = NearbySearchFragment.equals(this.setMax);
            if (equals2 != null) {
                equals2.equals = false;
                GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver2 = equals2.setMin;
                if (settingChangeReceiver2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
                }
                settingChangeReceiver2.setMax();
                GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver3 = equals2.setMin;
                if (settingChangeReceiver3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
                }
                ShopModel shopModel = new ShopModel();
                shopModel.asBinder = 3;
                Unit unit = Unit.INSTANCE;
                settingChangeReceiver3.getMax(shopModel);
            }
        }
    }

    public final void setMin(@NotNull Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        GriverDefaultOpenSettingExtension griverDefaultOpenSettingExtension = this.setMin;
        if (griverDefaultOpenSettingExtension != null) {
            griverDefaultOpenSettingExtension.setMin(location);
        }
    }

    public final void setMax(@NotNull List<? extends ShopModel> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "shopModel");
        GriverDefaultOpenSettingExtension griverDefaultOpenSettingExtension = this.setMin;
        if (griverDefaultOpenSettingExtension != null) {
            griverDefaultOpenSettingExtension.setMax(list, z);
        }
    }

    public final void length(@NotNull ShopModel shopModel, @NotNull List<? extends ShopModel> list, boolean z) {
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        Intrinsics.checkNotNullParameter(list, "allShops");
        GriverDefaultOpenSettingExtension griverDefaultOpenSettingExtension = this.setMin;
        if (griverDefaultOpenSettingExtension != null) {
            griverDefaultOpenSettingExtension.length(shopModel, list, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¨\u0006\b"}, d2 = {"id/dana/nearbyrevamp/search/NearbySearchFragment$getNearbySearchView$1", "Lid/dana/nearbyrevamp/search/NearbySearchContract$View;", "onErrorGetNearbySearchTrendingKeyword", "", "onGetNearbySearchTrendingKeyword", "keywords", "", "Lid/dana/nearbyrevamp/search/model/NearbySearchItemModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements showOpenSettingView.getMax {
        final /* synthetic */ NearbySearchFragment setMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void showProgress() {
        }

        length(NearbySearchFragment nearbySearchFragment) {
            this.setMax = nearbySearchFragment;
        }

        public final void length(@NotNull List<ProgramSettingExtension.AnonymousClass2> list) {
            Intrinsics.checkNotNullParameter(list, "keywords");
            getSetting intRange = NearbySearchFragment.toIntRange(this.setMax);
            Intrinsics.checkNotNullParameter(list, "sectionItemModel");
            intRange.getMax(new showAuthGuide(ExploreSectionType.TRENDING_SEARCH, list));
        }

        public final void getMax() {
            getSetting intRange = NearbySearchFragment.toIntRange(this.setMax);
            List max = intRange.getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            Iterator it = max.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((showAuthGuide) it.next()).getMax == ExploreSectionType.TRENDING_SEARCH) {
                    break;
                }
                i++;
            }
            if (i != -1) {
                intRange.getMax(i);
            }
        }
    }

    public final boolean n_() {
        FragmentManager supportFragmentManager;
        ConstraintLayout constraintLayout = (ConstraintLayout) setMin(resetInternal.setMax.playFromUri);
        if (constraintLayout != null) {
            if (constraintLayout.getVisibility() == 0) {
                getMax(false);
                return super.n_();
            }
        }
        BaseActivity baseActivity = this.getMax;
        if (!(baseActivity == null || (supportFragmentManager = baseActivity.getSupportFragmentManager()) == null)) {
            supportFragmentManager.getMax((FragmentManager.getMax) new FragmentManager.length(-1, 0), false);
        }
        return super.n_();
    }

    public final void onStop() {
        EditText editText;
        NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
        if (!(nearbySearchToolbar == null || (editText = (EditText) nearbySearchToolbar._$_findCachedViewById(resetInternal.setMax.mask)) == null)) {
            setOnWheelViewListener.length((View) editText);
        }
        super.onStop();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/nearbyrevamp/search/NearbySearchFragment$Companion;", "", "()V", "BUNDLE_LATITUDE", "", "BUNDLE_LONGITUDE", "LOCATION", "MERCHANT", "TAG", "newInstance", "Lid/dana/nearbyrevamp/search/NearbySearchFragment;", "location", "Landroid/location/Location;", "nearbySearchResultListener", "Lid/dana/nearbyrevamp/search/NearbySearchResultListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r3;
        NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
        if (nearbySearchToolbar != null) {
            nearbySearchToolbar.focusEditText();
            nearbySearchToolbar.setListener(new toFloatRange(nearbySearchToolbar, this));
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        ProgramSettingExtension programSettingExtension = new ProgramSettingExtension(childFragmentManager);
        programSettingExtension.getMin(new MerchantSearchResultFragment(), "merchant", getString(R.string.nearby_search_merchant_page_title));
        programSettingExtension.getMin(new openSetting(), "location", getString(R.string.nearby_search_location_page_title));
        ViewPager viewPager = (ViewPager) setMin(resetInternal.setMax.loadLayoutDescription);
        if (viewPager != null) {
            viewPager.setAdapter(programSettingExtension);
        }
        ViewPager viewPager2 = (ViewPager) setMin(resetInternal.setMax.loadLayoutDescription);
        if (viewPager2 != null) {
            viewPager2.setOffscreenPageLimit(2);
        }
        ViewPager viewPager3 = (ViewPager) setMin(resetInternal.setMax.loadLayoutDescription);
        if (viewPager3 != null) {
            viewPager3.addOnPageChangeListener(new equals(this));
        }
        TabLayout tabLayout = (TabLayout) setMin(resetInternal.setMax.getMinWidthMinor);
        if (tabLayout != null) {
            tabLayout.setupWithViewPager((ViewPager) setMin(resetInternal.setMax.loadLayoutDescription));
        }
        Fragment max = setMax("location");
        if (!(max instanceof openSetting)) {
            max = null;
        }
        openSetting opensetting = (openSetting) max;
        if (opensetting != null) {
            opensetting.setMax = this;
        }
        Fragment max2 = setMax("merchant");
        if (!(max2 instanceof MerchantSearchResultFragment)) {
            max2 = null;
        }
        MerchantSearchResultFragment merchantSearchResultFragment = (MerchantSearchResultFragment) max2;
        if (merchantSearchResultFragment != null) {
            merchantSearchResultFragment.setMax = this;
        }
        getSetting getsetting = new getSetting();
        getsetting.length = new getMin(this);
        Unit unit = Unit.INSTANCE;
        this.IsOverlapping = getsetting;
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.getListPopupWindow);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setNestedScrollingEnabled(false);
            getSetting getsetting2 = this.IsOverlapping;
            if (getsetting2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbySearchSectionAdapter");
            }
            recyclerView.setAdapter(getsetting2);
            recyclerView.addOnScrollListener(new toIntRange(this));
        }
        BaseResourcePackage.AnonymousClass1.getMin getmin = new BaseResourcePackage.AnonymousClass1.getMin((byte) 0);
        if (this.getMax != null) {
            r3 = this.getMax.getApplicationComponent();
        } else {
            r3 = null;
        }
        if (r3 != null) {
            getmin.setMin = r3;
            getmin.length = new NearbySearchModule(new length(this));
            getmin.getMax = new NearbyMerchantLocationSearchModule(new getMax(this));
            stopIgnoring.setMin(getmin.length, NearbySearchModule.class);
            stopIgnoring.setMin(getmin.getMax, NearbyMerchantLocationSearchModule.class);
            stopIgnoring.setMin(getmin.setMin, PrepareException.AnonymousClass1.class);
            new BaseResourcePackage.AnonymousClass1(getmin.length, getmin.getMax, getmin.setMin, (byte) 0).setMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[2];
            showOpenSettingView.length length2 = this.presenter;
            if (length2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            getminArr[0] = length2;
            setTextColor.length length3 = this.searchPresenter;
            if (length3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchPresenter");
            }
            getminArr[1] = length3;
            getMin(getminArr);
            Bundle arguments = getArguments();
            if (arguments != null) {
                double d = arguments.getDouble("latitude", 0.0d);
                double d2 = arguments.getDouble("longitude", 0.0d);
                if (!(d == 0.0d || d2 == 0.0d)) {
                    Location location = new Location("");
                    location.setLatitude(d);
                    location.setLongitude(d2);
                    Intrinsics.checkNotNullExpressionValue(location, "LocationUtil.latLonToLocation(latitude, longitude)");
                    this.getMin = location;
                }
            }
            showOpenSettingView.length length4 = this.presenter;
            if (length4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("presenter");
            }
            length4.getMin();
            setTextColor.length length5 = this.searchPresenter;
            if (length5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("searchPresenter");
            }
            length5.length();
            t tVar = this.nearbyAnalyticTracker;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
            }
            tVar.getMax();
            return;
        }
        throw null;
    }

    /* access modifiers changed from: private */
    public final void getMax() {
        Fragment max = setMax("location");
        MerchantSearchResultFragment merchantSearchResultFragment = null;
        if (!(max instanceof openSetting)) {
            max = null;
        }
        openSetting opensetting = (openSetting) max;
        if (opensetting != null) {
            opensetting.getMax();
        }
        Fragment max2 = setMax("merchant");
        if (max2 instanceof MerchantSearchResultFragment) {
            merchantSearchResultFragment = max2;
        }
        MerchantSearchResultFragment merchantSearchResultFragment2 = merchantSearchResultFragment;
        if (merchantSearchResultFragment2 != null) {
            merchantSearchResultFragment2.getMax();
        }
        setTextColor.length length2 = this.searchPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchPresenter");
        }
        length2.getMax();
    }

    /* access modifiers changed from: private */
    public final void setMin(String str) {
        Fragment max = setMax("merchant");
        if (!(max instanceof MerchantSearchResultFragment)) {
            max = null;
        }
        MerchantSearchResultFragment merchantSearchResultFragment = (MerchantSearchResultFragment) max;
        if (merchantSearchResultFragment != null) {
            merchantSearchResultFragment.values();
        }
        setTextColor.length length2 = this.searchPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchPresenter");
        }
        length2.getMax();
        setTextColor.length length3 = this.searchPresenter;
        if (length3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchPresenter");
        }
        length3.setMin(str, this.getMin, 0);
    }

    /* access modifiers changed from: private */
    public final void toIntRange(String str) {
        Fragment max = setMax("location");
        if (!(max instanceof openSetting)) {
            max = null;
        }
        openSetting opensetting = (openSetting) max;
        if (opensetting != null) {
            opensetting.FastBitmap$CoordinateSystem();
        }
        setTextColor.length length2 = this.searchPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchPresenter");
        }
        length2.length(str, this.getMin);
    }

    public final void getMin(@NotNull getCreateTime getcreatetime) {
        Intrinsics.checkNotNullParameter(getcreatetime, "nearbyLocation");
        setPublishStatus setpublishstatus = (setPublishStatus) this.toFloatRange.getValue();
        if (!setpublishstatus.length.isShowing()) {
            setpublishstatus.length.show();
            setpublishstatus.getMax.startRefresh();
        }
        setTextColor.length length2 = this.searchPresenter;
        if (length2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("searchPresenter");
        }
        length2.setMin(getcreatetime.getPlaceId(), getcreatetime.getName());
    }

    public static final /* synthetic */ void setMax(NearbySearchFragment nearbySearchFragment) {
        ConstraintLayout constraintLayout = (ConstraintLayout) nearbySearchFragment.setMin(resetInternal.setMax.playFromUri);
        if (constraintLayout != null) {
            if (constraintLayout.getVisibility() == 0) {
                nearbySearchFragment.getMax(false);
                nearbySearchFragment.getMax();
            }
        }
        NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) nearbySearchFragment.setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
        if (nearbySearchToolbar != null) {
            nearbySearchToolbar.clearText();
        }
    }

    public static final /* synthetic */ void getMax(NearbySearchFragment nearbySearchFragment, String str) {
        nearbySearchFragment.getMax(true);
        ViewPager viewPager = (ViewPager) nearbySearchFragment.setMin(resetInternal.setMax.loadLayoutDescription);
        if (viewPager == null || viewPager.getCurrentItem() != 1) {
            nearbySearchFragment.length(str);
        } else {
            nearbySearchFragment.isInside(str);
        }
    }

    public static final /* synthetic */ void getMin(NearbySearchFragment nearbySearchFragment) {
        NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) nearbySearchFragment.setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
        setOnWheelViewListener.length((View) nearbySearchToolbar != null ? (EditText) nearbySearchToolbar._$_findCachedViewById(resetInternal.setMax.mask) : null);
    }

    public static final /* synthetic */ void setMax(NearbySearchFragment nearbySearchFragment, String str) {
        NearbySearchToolbar nearbySearchToolbar = (NearbySearchToolbar) nearbySearchFragment.setMin(resetInternal.setMax.measureHeightOfChildrenCompat);
        String keyword = nearbySearchToolbar != null ? nearbySearchToolbar.getKeyword() : null;
        if (keyword == null) {
            keyword = "";
        }
        nearbySearchFragment.getMax(true);
        if (StringsKt.equals(str, "Location", true)) {
            ViewPager viewPager = (ViewPager) nearbySearchFragment.setMin(resetInternal.setMax.loadLayoutDescription);
            if (viewPager != null) {
                viewPager.setCurrentItem(1);
            }
            nearbySearchFragment.isInside(keyword);
            return;
        }
        ViewPager viewPager2 = (ViewPager) nearbySearchFragment.setMin(resetInternal.setMax.loadLayoutDescription);
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(0);
        }
        nearbySearchFragment.length(keyword);
    }

    public static final /* synthetic */ openSetting setMin(NearbySearchFragment nearbySearchFragment) {
        Fragment max = nearbySearchFragment.setMax("location");
        if (!(max instanceof openSetting)) {
            max = null;
        }
        return (openSetting) max;
    }

    public static final /* synthetic */ setPublishStatus isInside(NearbySearchFragment nearbySearchFragment) {
        return (setPublishStatus) nearbySearchFragment.toFloatRange.getValue();
    }

    public static final /* synthetic */ MerchantSearchResultFragment equals(NearbySearchFragment nearbySearchFragment) {
        Fragment max = nearbySearchFragment.setMax("merchant");
        if (!(max instanceof MerchantSearchResultFragment)) {
            max = null;
        }
        return (MerchantSearchResultFragment) max;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.isInside;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
