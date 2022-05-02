package id.dana.nearbyrevamp.otherstore;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.Location;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.di.module.OtherStoreListModule;
import id.dana.nearbyme.enums.SearchType;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.merchantfilter.MerchantFilterView;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.BaseResourcePackage;
import o.InternalApiBridgeExtension;
import o.PrepareException;
import o.SimpleListAdapter;
import o.containsFavoriteMenuItem;
import o.dispatchOnCancelled;
import o.distanceInfluenceForSnapDuration;
import o.g;
import o.getAppIdList;
import o.onCancelLoad;
import o.onCanceled;
import o.onDelete;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.stopIgnoring;
import o.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 X2\u00020\u0001:\u0001XB%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010?\u001a\u00020!H\u0002J\b\u0010@\u001a\u00020\u0007H\u0016J\b\u0010A\u001a\u00020BH\u0002J\u0010\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020!H\u0002J\u0010\u0010G\u001a\u00020!2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020!2\u0006\u0010K\u001a\u00020\u000eH\u0014J\b\u0010L\u001a\u00020!H\u0002J\u0006\u0010M\u001a\u00020!J\b\u0010N\u001a\u00020!H\u0002J\b\u0010O\u001a\u00020!H\u0002J&\u0010P\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010D\u001a\u00020E2\u0006\u0010>\u001a\u00020\u0011J\b\u0010Q\u001a\u00020!H\u0002J\b\u0010R\u001a\u00020!H\u0002J\b\u0010S\u001a\u00020!H\u0016J\b\u0010T\u001a\u00020!H\u0002J\b\u0010U\u001a\u00020!H\u0002J\u0006\u0010V\u001a\u00020!J\u0018\u0010W\u001a\u00020!2\u0006\u0010>\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0011H\u0002R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR4\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 @FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R^\u0010,\u001a\u001f\u0012\u0013\u0012\u00110(¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020!\u0018\u00010'2#\u0010\u001f\u001a\u001f\u0012\u0013\u0012\u00110(¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020!\u0018\u00010'@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R=\u00101\u001a%\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020(02¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(3\u0012\u0004\u0012\u00020!\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010.\"\u0004\b5\u00100R\u001e\u00106\u001a\u0002078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Lid/dana/nearbyrevamp/otherstore/OtherStoreResultView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "currentLocation", "Landroid/location/Location;", "fetching", "", "isFirstGetShopList", "merchantId", "", "merchantListAdapter", "Lid/dana/nearbyrevamp/merchantlist/adapter/NewMerchantListAdapter;", "merchantName", "getMerchantName", "()Ljava/lang/String;", "setMerchantName", "(Ljava/lang/String;)V", "nearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "getNearbyAnalyticTracker", "()Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "setNearbyAnalyticTracker", "(Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;)V", "value", "Lkotlin/Function0;", "", "onMerchantSearchClosed", "getOnMerchantSearchClosed", "()Lkotlin/jvm/functions/Function0;", "setOnMerchantSearchClosed", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Lid/dana/nearbyme/model/ShopModel;", "Lkotlin/ParameterName;", "name", "shopModel", "onOtherStoreClickedListener", "getOnOtherStoreClickedListener", "()Lkotlin/jvm/functions/Function1;", "setOnOtherStoreClickedListener", "(Lkotlin/jvm/functions/Function1;)V", "onShopLoaded", "", "shopModels", "getOnShopLoaded", "setOnShopLoaded", "otherStorePresenter", "Lid/dana/contract/nearbyme/OtherStoreListContract$Presenter;", "getOtherStorePresenter", "()Lid/dana/contract/nearbyme/OtherStoreListContract$Presenter;", "setOtherStorePresenter", "(Lid/dana/contract/nearbyme/OtherStoreListContract$Presenter;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "source", "clearSearchResults", "getLayout", "getOnScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "getOtherShopList", "searchType", "Lid/dana/nearbyme/enums/SearchType;", "hideShimmer", "injectComponent", "applicationComponent", "Lid/dana/di/component/ApplicationComponent;", "injected", "isInjected", "loadMoreOtherStore", "onMerchantOtherStoreClosed", "onTouchBottom", "removeLoading", "searchOtherMerchantByMerchantId", "setCloseListener", "setOtherStoreClickListener", "setup", "setupMerchantCategories", "showEmptyState", "showShimmer", "trackOtherStoreOpen", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OtherStoreResultView extends BaseRichView {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    public static final int DEFAULT_NUMBER_OF_ITEM = 20;
    @NotNull
    public static final String DEFAULT_TRACKER_NO_RESULT = "No Result";
    /* access modifiers changed from: private */
    public String IsOverlapping;
    /* access modifiers changed from: private */
    public boolean equals;
    @Nullable
    private Function1<? super ShopModel, Unit> getMax;
    @NotNull
    private String getMin;
    private String isInside;
    @Nullable
    private Function0<Unit> length;
    @Inject
    public t nearbyAnalyticTracker;
    @Inject
    public distanceInfluenceForSnapDuration.getMax otherStorePresenter;
    private Location setMax;
    @Nullable
    private Function1<? super List<? extends ShopModel>, Unit> setMin;
    /* access modifiers changed from: private */
    public SimpleListAdapter.SimpleViewHolder toFloatRange;
    private onDetachedFromLayoutParams toIntRange;
    /* access modifiers changed from: private */
    public boolean toString;
    private HashMap values;

    @JvmOverloads
    public OtherStoreResultView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public OtherStoreResultView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.values;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.values == null) {
            this.values = new HashMap();
        }
        View view = (View) this.values.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.values.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_merchant_search_result;
    }

    public static final /* synthetic */ SimpleListAdapter.SimpleViewHolder access$getMerchantListAdapter$p(OtherStoreResultView otherStoreResultView) {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = otherStoreResultView.toFloatRange;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        return simpleViewHolder;
    }

    public static final /* synthetic */ String access$getSource$p(OtherStoreResultView otherStoreResultView) {
        String str = otherStoreResultView.IsOverlapping;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        return str;
    }

    public static final /* synthetic */ void access$trackOtherStoreOpen(OtherStoreResultView otherStoreResultView, String str, String str2) {
        int i;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(154426803, oncanceled);
            onCancelLoad.getMin(154426803, oncanceled);
        }
        t tVar = otherStoreResultView.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        tVar.setMin(str, str2);
    }

    @Nullable
    public final Function1<List<? extends ShopModel>, Unit> getOnShopLoaded() {
        return this.setMin;
    }

    public final void setOnShopLoaded(@Nullable Function1<? super List<? extends ShopModel>, Unit> function1) {
        this.setMin = function1;
    }

    @Nullable
    public final Function0<Unit> getOnMerchantSearchClosed() {
        return this.length;
    }

    public final void setOnMerchantSearchClosed(@Nullable Function0<Unit> function0) {
        this.length = function0;
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(resetInternal.setMax.attachBaseContext);
        if (appCompatImageView != null) {
            appCompatImageView.setOnClickListener(new setMin(this));
        }
    }

    @Nullable
    public final Function1<ShopModel, Unit> getOnOtherStoreClickedListener() {
        return this.getMax;
    }

    public final void setOnOtherStoreClickedListener(@Nullable Function1<? super ShopModel, Unit> function1) {
        this.getMax = function1;
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.toFloatRange;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        simpleViewHolder.setMax = this.getMax;
        Function0<Unit> length2 = new length(this);
        Intrinsics.checkNotNullParameter(length2, "<set-?>");
        simpleViewHolder.getMax = length2;
    }

    @NotNull
    public final String getMerchantName() {
        return this.getMin;
    }

    public final void setMerchantName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.getMin = str;
    }

    @NotNull
    public final distanceInfluenceForSnapDuration.getMax getOtherStorePresenter() {
        distanceInfluenceForSnapDuration.getMax getmax = this.otherStorePresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherStorePresenter");
        }
        return getmax;
    }

    public final void setOtherStorePresenter(@NotNull distanceInfluenceForSnapDuration.getMax getmax) {
        Intrinsics.checkNotNullParameter(getmax, "<set-?>");
        this.otherStorePresenter = getmax;
    }

    @NotNull
    public final t getNearbyAnalyticTracker() {
        t tVar = this.nearbyAnalyticTracker;
        if (tVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
        }
        return tVar;
    }

    public final void setNearbyAnalyticTracker(@NotNull t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.nearbyAnalyticTracker = tVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OtherStoreResultView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OtherStoreResultView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = "";
        this.toString = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public OtherStoreResultView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        this.getMin = "";
        this.toString = true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/nearbyrevamp/otherstore/OtherStoreResultView$setupMerchantCategories$1", "Lid/dana/nearbyme/OnCategoryCheckedListener;", "onMulitpleCategorySelected", "", "checkedCategories", "", "Lid/dana/nearbyme/model/MerchantCategoryModel;", "checked", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class equals implements getAppIdList {
        final /* synthetic */ OtherStoreResultView getMin;

        @JvmDefault
        public final void onCategoryClick(@NotNull g.AnonymousClass1 r2) {
            Intrinsics.checkNotNullParameter(r2, "selectedCategory");
        }

        @JvmDefault
        public final void onMulitpleCategorySelected(@NotNull List<g.AnonymousClass1> list) {
            Intrinsics.checkNotNullParameter(list, "checkedCategories");
        }

        equals(OtherStoreResultView otherStoreResultView) {
            this.getMin = otherStoreResultView;
        }

        public final void length(@NotNull List<g.AnonymousClass1> list, boolean z) {
            Intrinsics.checkNotNullParameter(list, "checkedCategories");
            this.getMin.getOtherStorePresenter().getMin(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ OtherStoreResultView getMax;

        setMin(OtherStoreResultView otherStoreResultView) {
            this.getMax = otherStoreResultView;
        }

        public final void onClick(View view) {
            Function0<Unit> onMerchantSearchClosed = this.getMax.getOnMerchantSearchClosed();
            if (onMerchantSearchClosed != null) {
                onMerchantSearchClosed.invoke();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"id/dana/nearbyrevamp/otherstore/OtherStoreResultView$getOnScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends RecyclerView.toIntRange {
        final /* synthetic */ OtherStoreResultView getMin;

        getMin(OtherStoreResultView otherStoreResultView) {
            this.getMin = otherStoreResultView;
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            if (!recyclerView.canScrollVertically(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                OtherStoreResultView.access$onTouchBottom(this.getMin);
            }
        }
    }

    public final void injected(boolean z) {
        if (z) {
            distanceInfluenceForSnapDuration.getMax getmax = this.otherStorePresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otherStorePresenter");
            }
            getmax.setMin();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/nearbyrevamp/otherstore/OtherStoreResultView$injectComponent$1", "Lid/dana/contract/nearbyme/OtherStoreListContract$View;", "onGetPromo", "", "shopModelsWithPromo", "", "Lid/dana/nearbyme/model/ShopModel;", "onGetShopListFail", "onGetShopListSuccess", "shopModels", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax implements distanceInfluenceForSnapDuration.setMin {
        final /* synthetic */ OtherStoreResultView getMax;

        @JvmDefault
        public final void dismissProgress() {
        }

        @JvmDefault
        public final void onError(@Nullable String str) {
        }

        @JvmDefault
        public final void setMax(@NotNull InternalApiBridgeExtension internalApiBridgeExtension) {
            Intrinsics.checkNotNullParameter(internalApiBridgeExtension, "result");
        }

        @JvmDefault
        public final void showProgress() {
        }

        getMax(OtherStoreResultView otherStoreResultView) {
            this.getMax = otherStoreResultView;
        }

        public final void getMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shopModels");
            this.getMax.equals = false;
            OtherStoreResultView.access$hideShimmer(this.getMax);
            if (list.isEmpty()) {
                OtherStoreResultView.access$showEmptyState(this.getMax);
            } else {
                OtherStoreResultView otherStoreResultView = this.getMax;
                String str = ((ShopModel) CollectionsKt.first(list)).asInterface;
                Intrinsics.checkNotNullExpressionValue(str, "shopModels.first().merchantName");
                otherStoreResultView.setMerchantName(str);
                OtherStoreResultView.access$getMerchantListAdapter$p(this.getMax).getMin(list);
                TextView textView = (TextView) this.getMax._$_findCachedViewById(resetInternal.setMax.SearchView);
                if (textView != null) {
                    textView.setText(this.getMax.getMerchantName());
                }
            }
            if (this.getMax.toString) {
                OtherStoreResultView otherStoreResultView2 = this.getMax;
                OtherStoreResultView.access$trackOtherStoreOpen(otherStoreResultView2, OtherStoreResultView.access$getSource$p(otherStoreResultView2), this.getMax.getMerchantName().length() > 0 ? this.getMax.getMerchantName() : OtherStoreResultView.DEFAULT_TRACKER_NO_RESULT);
                this.getMax.toString = false;
            }
            Function1<List<? extends ShopModel>, Unit> onShopLoaded = this.getMax.getOnShopLoaded();
            if (onShopLoaded != null) {
                onShopLoaded.invoke(list);
            }
        }

        public final void length() {
            this.getMax.equals = false;
            OtherStoreResultView.access$hideShimmer(this.getMax);
            if (this.getMax.getOtherStorePresenter().length() == 1) {
                OtherStoreResultView.access$showEmptyState(this.getMax);
            } else {
                OtherStoreResultView.access$removeLoading(this.getMax);
            }
            if (this.getMax.toString) {
                OtherStoreResultView otherStoreResultView = this.getMax;
                OtherStoreResultView.access$trackOtherStoreOpen(otherStoreResultView, OtherStoreResultView.access$getSource$p(otherStoreResultView), OtherStoreResultView.DEFAULT_TRACKER_NO_RESULT);
                this.getMax.toString = false;
            }
        }

        public final void setMin(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "shopModelsWithPromo");
            OtherStoreResultView.access$getMerchantListAdapter$p(this.getMax).setMax(list);
        }
    }

    public final void searchOtherMerchantByMerchantId(@NotNull Location location, @NotNull String str, @NotNull SearchType searchType, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(location, "currentLocation");
        Intrinsics.checkNotNullParameter(str, "merchantId");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        Intrinsics.checkNotNullParameter(str2, "source");
        getMin();
        showShimmer();
        this.setMax = location;
        this.isInside = str;
        this.IsOverlapping = str2;
        setMin(searchType);
    }

    private final void setMin(SearchType searchType) {
        String str = this.isInside;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantId");
        }
        if (!(str.length() == 0) && this.setMax != null) {
            this.equals = true;
            distanceInfluenceForSnapDuration.getMax getmax = this.otherStorePresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otherStorePresenter");
            }
            String str2 = this.isInside;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantId");
            }
            Location location = this.setMax;
            Intrinsics.checkNotNull(location);
            double latitude = location.getLatitude();
            Location location2 = this.setMax;
            Intrinsics.checkNotNull(location2);
            getmax.getMin(str2, latitude, location2.getLongitude(), "", searchType.getValue());
        }
    }

    public final void showShimmer() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.toIntRange;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
            return;
        }
        OtherStoreResultView otherStoreResultView = this;
        otherStoreResultView.toIntRange = containsFavoriteMenuItem.getMin((RecyclerView) otherStoreResultView._$_findCachedViewById(resetInternal.setMax.setDefaultActionButtonContentDescription), R.layout.view_new_merchant_list_skeleton);
    }

    public final void onMerchantOtherStoreClosed() {
        getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "id/dana/nearbyrevamp/otherstore/OtherStoreResultView$setOtherStoreClickListener$1$1"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<Unit> {
        final /* synthetic */ OtherStoreResultView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(OtherStoreResultView otherStoreResultView) {
            super(0);
            this.this$0 = otherStoreResultView;
        }

        public final void invoke() {
            OtherStoreResultView.access$loadMoreOtherStore(this.this$0);
        }
    }

    private final void getMin() {
        distanceInfluenceForSnapDuration.getMax getmax = this.otherStorePresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherStorePresenter");
        }
        getmax.getMin();
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.toFloatRange;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        simpleViewHolder.getMin();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lid/dana/nearbyrevamp/otherstore/OtherStoreResultView$Companion;", "", "()V", "DEFAULT_NUMBER_OF_ITEM", "", "DEFAULT_TRACKER_NO_RESULT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void setup() {
        MerchantFilterView merchantFilterView = (MerchantFilterView) _$_findCachedViewById(resetInternal.setMax.drawableStateChanged);
        if (merchantFilterView != null) {
            merchantFilterView.setOnCategoryCheckedListener(new equals(this));
        }
        this.toFloatRange = new SimpleListAdapter.SimpleViewHolder();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.setDefaultActionButtonContentDescription);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.addOnScrollListener(new getMin(this));
            SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.toFloatRange;
            if (simpleViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
            }
            recyclerView.setAdapter(simpleViewHolder);
        }
    }

    public final void injectComponent(@NotNull PrepareException.AnonymousClass1 r4) {
        Intrinsics.checkNotNullParameter(r4, "applicationComponent");
        BaseResourcePackage.HotUpdatePackageInstallCallback.setMax setmax = new BaseResourcePackage.HotUpdatePackageInstallCallback.setMax((byte) 0);
        if (r4 != null) {
            setmax.setMax = r4;
            setmax.getMin = new OtherStoreListModule(new getMax(this));
            stopIgnoring.setMin(setmax.getMin, OtherStoreListModule.class);
            stopIgnoring.setMin(setmax.setMax, PrepareException.AnonymousClass1.class);
            new BaseResourcePackage.HotUpdatePackageInstallCallback(setmax.getMin, setmax.setMax, (byte) 0).getMax(this);
            onDelete.getMin[] getminArr = new onDelete.getMin[1];
            distanceInfluenceForSnapDuration.getMax getmax = this.otherStorePresenter;
            if (getmax == null) {
                Intrinsics.throwUninitializedPropertyAccessException("otherStorePresenter");
            }
            getminArr[0] = getmax;
            registerPresenter(getminArr);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void access$onTouchBottom(OtherStoreResultView otherStoreResultView) {
        distanceInfluenceForSnapDuration.getMax getmax = otherStoreResultView.otherStorePresenter;
        if (getmax == null) {
            Intrinsics.throwUninitializedPropertyAccessException("otherStorePresenter");
        }
        if (getmax.getMax() && !otherStoreResultView.equals) {
            SimpleListAdapter.SimpleViewHolder simpleViewHolder = otherStoreResultView.toFloatRange;
            if (simpleViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
            }
            if (simpleViewHolder.setMax()) {
                SimpleListAdapter.SimpleViewHolder simpleViewHolder2 = otherStoreResultView.toFloatRange;
                if (simpleViewHolder2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
                }
                ShopModel shopModel = new ShopModel();
                shopModel.asBinder = 3;
                Unit unit = Unit.INSTANCE;
                simpleViewHolder2.getMax(shopModel);
            }
        }
    }

    public static final /* synthetic */ void access$hideShimmer(OtherStoreResultView otherStoreResultView) {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = otherStoreResultView.toIntRange;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public static final /* synthetic */ void access$showEmptyState(OtherStoreResultView otherStoreResultView) {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = otherStoreResultView.toFloatRange;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        simpleViewHolder.toIntRange();
    }

    public static final /* synthetic */ void access$removeLoading(OtherStoreResultView otherStoreResultView) {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = otherStoreResultView.toFloatRange;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        Collection max = simpleViewHolder.getMax();
        if (!(max == null || max.isEmpty())) {
            SimpleListAdapter.SimpleViewHolder simpleViewHolder2 = otherStoreResultView.toFloatRange;
            if (simpleViewHolder2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
            }
            if (simpleViewHolder2.getItemCount() > 0 && simpleViewHolder2.getItemViewType(simpleViewHolder2.getItemCount() - 1) == 2) {
                simpleViewHolder2.getMax(simpleViewHolder2.getItemCount() - 1);
            }
        }
    }

    public static final /* synthetic */ void access$loadMoreOtherStore(OtherStoreResultView otherStoreResultView) {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = otherStoreResultView.toFloatRange;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        if (simpleViewHolder.getItemCount() > 0 && simpleViewHolder.getItemViewType(simpleViewHolder.getItemCount() - 1) == 3) {
            simpleViewHolder.getMax(simpleViewHolder.getItemCount() - 1);
        }
        SimpleListAdapter.SimpleViewHolder simpleViewHolder2 = otherStoreResultView.toFloatRange;
        if (simpleViewHolder2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        ShopModel shopModel = new ShopModel();
        shopModel.asBinder = 2;
        Unit unit = Unit.INSTANCE;
        simpleViewHolder2.getMax(shopModel);
        otherStoreResultView.setMin(SearchType.MERCHANTID_SORTED_BY_DISTANCE);
        otherStoreResultView.equals = true;
    }
}
