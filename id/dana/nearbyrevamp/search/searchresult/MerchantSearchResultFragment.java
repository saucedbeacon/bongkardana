package id.dana.nearbyrevamp.search.searchresult;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.contract.deeplink.path.FeatureParams;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.search.NearbySearchFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.GriverDefaultOpenSettingExtension;
import o.GriverUcServiceProxy;
import o.IntRange;
import o.PrepareException;
import o.ProgramSettingExtension;
import o.containsFavoriteMenuItem;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import o.setOnWheelViewListener;
import o.setTextColor;
import o.t;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\b\u0010\u0017\u001a\u00020\u0007H\u0014J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u0006\u0010\u001e\u001a\u00020\u0013J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0004H\u0002J\b\u0010!\u001a\u00020\u0013H\u0002J\u001c\u0010\"\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J\b\u0010#\u001a\u00020\u0013H\u0002J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0004H\u0002J\u0006\u0010&\u001a\u00020\u0013J)\u0010'\u001a\u00020\u00132!\u0010(\u001a\u001d\u0012\u0013\u0012\u00110*¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00130)J\u0006\u0010.\u001a\u00020\u0013J\b\u0010/\u001a\u00020\u0013H\u0002J\u0014\u00100\u001a\u00020\u00132\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lid/dana/nearbyrevamp/search/searchresult/MerchantSearchResultFragment;", "Lid/dana/nearbyrevamp/search/searchresult/BaseNearbySearchResultFragment;", "()V", "fetching", "", "hasMore", "lastRankingShop", "", "merchantSearchResultAdapter", "Lid/dana/nearbyrevamp/search/adapter/MerchantSearchResultAdapter;", "nearbyAnalyticTracker", "Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "getNearbyAnalyticTracker", "()Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;", "setNearbyAnalyticTracker", "(Lid/dana/nearbyme/tracker/NearbyAnalyticTracker;)V", "skeletonScreenMerchant", "Lcom/ethanhua/skeleton/SkeletonScreen;", "appendData", "", "shops", "", "Lid/dana/nearbyme/model/ShopModel;", "getLayout", "hideProgress", "init", "initInjection", "loadNextPage", "onTouchBottom", "reset", "resetFirstPage", "setSeeOnMapEnabled", "enabled", "setupRecyclerView", "showData", "showEmptyState", "showErrorComponent", "error", "showErrorLoadMore", "showErrorState", "onTryAgain", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "keyword", "showProgress", "showShimmerMerchantList", "updatePromoInfo", "shopsWithPromo", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class MerchantSearchResultFragment extends ProgramSettingExtension.AnonymousClass1 {
    private HashMap IsOverlapping;
    public boolean equals;
    public int isInside;
    @Inject
    public t nearbyAnalyticTracker;
    public GriverDefaultOpenSettingExtension.SettingChangeReceiver setMin;
    public onDetachedFromLayoutParams toFloatRange;
    public boolean toIntRange;

    public final void equals() {
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final int setMin() {
        return R.layout.fragment_merchant_search_result;
    }

    public final View setMin(int i) {
        if (this.IsOverlapping == null) {
            this.IsOverlapping = new HashMap();
        }
        View view = (View) this.IsOverlapping.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.IsOverlapping.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lid/dana/nearbyme/model/ShopModel;", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<ShopModel, Unit> {
        final /* synthetic */ MerchantSearchResultFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(MerchantSearchResultFragment merchantSearchResultFragment) {
            super(1);
            this.this$0 = merchantSearchResultFragment;
        }

        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ShopModel) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(@NotNull ShopModel shopModel) {
            Intrinsics.checkNotNullParameter(shopModel, "it");
            GriverDefaultOpenSettingExtension griverDefaultOpenSettingExtension = this.this$0.setMax;
            if (griverDefaultOpenSettingExtension != null) {
                List max = MerchantSearchResultFragment.setMax(this.this$0).getMax();
                Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
                Collection arrayList = new ArrayList();
                for (Object next : max) {
                    ShopModel shopModel2 = (ShopModel) next;
                    Intrinsics.checkNotNullExpressionValue(shopModel2, "it");
                    if (shopModel2.asBinder == 0) {
                        arrayList.add(next);
                    }
                }
                griverDefaultOpenSettingExtension.length(shopModel, (List) arrayList, this.this$0.toIntRange);
            }
        }
    }

    public static final /* synthetic */ GriverDefaultOpenSettingExtension.SettingChangeReceiver setMax(MerchantSearchResultFragment merchantSearchResultFragment) {
        GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver = merchantSearchResultFragment.setMin;
        if (settingChangeReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
        }
        return settingChangeReceiver;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMin implements View.OnClickListener {
        final /* synthetic */ MerchantSearchResultFragment getMax;

        setMin(MerchantSearchResultFragment merchantSearchResultFragment) {
            this.getMax = merchantSearchResultFragment;
        }

        public final void onClick(View view) {
            GriverDefaultOpenSettingExtension griverDefaultOpenSettingExtension = this.getMax.setMax;
            if (griverDefaultOpenSettingExtension != null) {
                List max = MerchantSearchResultFragment.setMax(this.getMax).getMax();
                Intrinsics.checkNotNullExpressionValue(max, "merchantSearchResultAdapter.items");
                griverDefaultOpenSettingExtension.setMax(CollectionsKt.take(max, 20), this.getMax.toIntRange);
            }
            t tVar = this.getMax.nearbyAnalyticTracker;
            if (tVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("nearbyAnalyticTracker");
            }
            tVar.getMin();
        }
    }

    private final void FastBitmap$CoordinateSystem() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.toFloatRange;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
            return;
        }
        MerchantSearchResultFragment merchantSearchResultFragment = this;
        merchantSearchResultFragment.toFloatRange = containsFavoriteMenuItem.getMin((RecyclerView) merchantSearchResultFragment.setMin(resetInternal.setMax.setDefaultActionButtonContentDescription), R.layout.view_new_merchant_list_skeleton);
    }

    public final void getMax(boolean z) {
        Context context = getContext();
        if (context != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) setMin(resetInternal.setMax.fastForward);
            if (constraintLayout != null) {
                constraintLayout.setEnabled(z);
                constraintLayout.setVisibility(0);
            }
            if (z) {
                AppCompatTextView appCompatTextView = (AppCompatTextView) setMin(resetInternal.setMax.onSearchClicked);
                if (appCompatTextView != null) {
                    appCompatTextView.setTextColor(IntRange.setMax(context, R.color.f20392131099953));
                }
                AppCompatImageView appCompatImageView = (AppCompatImageView) setMin(resetInternal.setMax.setSupportProgressBarVisibility);
                if (appCompatImageView != null) {
                    appCompatImageView.setImageResource(R.drawable.ic_location_filled);
                    return;
                }
                return;
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) setMin(resetInternal.setMax.onSearchClicked);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextColor(IntRange.setMax(context, R.color.f21892131100108));
            }
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) setMin(resetInternal.setMax.setSupportProgressBarVisibility);
            if (appCompatImageView2 != null) {
                appCompatImageView2.setImageResource(R.drawable.ic_location_grey30);
            }
        }
    }

    public final void values() {
        getMax(false);
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.setDefaultActionButtonContentDescription);
        if (recyclerView != null) {
            View view = recyclerView;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(0);
        }
        NearbySearchResultErrorView nearbySearchResultErrorView = (NearbySearchResultErrorView) setMin(resetInternal.setMax.setMinimumHeight);
        if (nearbySearchResultErrorView != null) {
            View view2 = nearbySearchResultErrorView;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(8);
        }
        FastBitmap$CoordinateSystem();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<Unit> {
        final /* synthetic */ MerchantSearchResultFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(MerchantSearchResultFragment merchantSearchResultFragment) {
            super(0);
            this.this$0 = merchantSearchResultFragment;
        }

        public final void invoke() {
            this.this$0.toDoubleRange();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"id/dana/nearbyrevamp/search/searchresult/MerchantSearchResultFragment$setupRecyclerView$3$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends RecyclerView.toIntRange {
        final /* synthetic */ MerchantSearchResultFragment setMin;

        getMin(MerchantSearchResultFragment merchantSearchResultFragment) {
            this.setMin = merchantSearchResultFragment;
        }

        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            setOnWheelViewListener.getMax((Activity) this.setMin.getMax);
            if (!recyclerView.canScrollVertically(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                MerchantSearchResultFragment.length(this.setMin);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void toDoubleRange() {
        if (getParentFragment() instanceof NearbySearchFragment) {
            this.equals = true;
            GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver = this.setMin;
            if (settingChangeReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
            }
            Collection max = settingChangeReceiver.getMax();
            if (!(max == null || max.isEmpty())) {
                List max2 = settingChangeReceiver.getMax();
                Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
                Object last = CollectionsKt.last(max2);
                Intrinsics.checkNotNullExpressionValue(last, "items.last()");
                if (((ShopModel) last).asBinder == 3) {
                    settingChangeReceiver.getMax(settingChangeReceiver.getItemCount() - 1);
                }
            }
            GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver2 = this.setMin;
            if (settingChangeReceiver2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
            }
            ShopModel shopModel = new ShopModel();
            shopModel.asBinder = 2;
            Unit unit = Unit.INSTANCE;
            settingChangeReceiver2.getMax(shopModel);
            Fragment parentFragment = getParentFragment();
            if (parentFragment != null) {
                NearbySearchFragment nearbySearchFragment = (NearbySearchFragment) parentFragment;
                String str = this.getMin;
                int i = this.isInside;
                Intrinsics.checkNotNullParameter(str, FeatureParams.KEYWORD);
                setTextColor.length length2 = nearbySearchFragment.searchPresenter;
                if (length2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchPresenter");
                }
                length2.setMin(str, nearbySearchFragment.getMin, i);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type id.dana.nearbyrevamp.search.NearbySearchFragment");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    public static final class length extends Lambda implements Function0<Unit> {
        final /* synthetic */ Function1 $onTryAgain;
        final /* synthetic */ MerchantSearchResultFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(MerchantSearchResultFragment merchantSearchResultFragment, Function1 function1) {
            super(0);
            this.this$0 = merchantSearchResultFragment;
            this.$onTryAgain = function1;
        }

        public final void invoke() {
            this.$onTryAgain.invoke(this.this$0.getMin);
        }
    }

    public final void setMax(boolean z) {
        RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.setDefaultActionButtonContentDescription);
        int i = 0;
        if (recyclerView != null) {
            View view = recyclerView;
            boolean z2 = !z;
            Intrinsics.checkNotNullParameter(view, "<this>");
            view.setVisibility(z2 ? 0 : 8);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) setMin(resetInternal.setMax.fastForward);
        if (constraintLayout != null) {
            View view2 = constraintLayout;
            boolean z3 = !z;
            Intrinsics.checkNotNullParameter(view2, "<this>");
            view2.setVisibility(z3 ? 0 : 8);
        }
        NearbySearchResultErrorView nearbySearchResultErrorView = (NearbySearchResultErrorView) setMin(resetInternal.setMax.setMinimumHeight);
        if (nearbySearchResultErrorView != null) {
            View view3 = nearbySearchResultErrorView;
            Intrinsics.checkNotNullParameter(view3, "<this>");
            if (!z) {
                i = 8;
            }
            view3.setVisibility(i);
        }
    }

    public final void getMax() {
        super.getMax();
        GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver = this.setMin;
        if (settingChangeReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
        }
        settingChangeReceiver.getMin();
        values();
        this.toIntRange = false;
        this.isInside = 0;
    }

    public final void setMax() {
        PrepareException.AnonymousClass1 r1;
        GriverUcServiceProxy.getMin getmin = new GriverUcServiceProxy.getMin((byte) 0);
        if (this.getMax != null) {
            r1 = this.getMax.getApplicationComponent();
        } else {
            r1 = null;
        }
        if (r1 != null) {
            getmin.getMin = r1;
            getmin.getMin().getMax(this);
            this.setMin = new GriverDefaultOpenSettingExtension.SettingChangeReceiver(new getMax(this), new setMax(this));
            RecyclerView recyclerView = (RecyclerView) setMin(resetInternal.setMax.setDefaultActionButtonContentDescription);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
                GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver = this.setMin;
                if (settingChangeReceiver == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
                }
                recyclerView.setAdapter(settingChangeReceiver);
                recyclerView.addOnScrollListener(new getMin(this));
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) setMin(resetInternal.setMax.fastForward);
            if (constraintLayout != null) {
                constraintLayout.setOnClickListener(new setMin(this));
                return;
            }
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void length(MerchantSearchResultFragment merchantSearchResultFragment) {
        if (merchantSearchResultFragment.toIntRange && !merchantSearchResultFragment.equals) {
            GriverDefaultOpenSettingExtension.SettingChangeReceiver settingChangeReceiver = merchantSearchResultFragment.setMin;
            if (settingChangeReceiver == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantSearchResultAdapter");
            }
            if (settingChangeReceiver.setMin()) {
                merchantSearchResultFragment.toDoubleRange();
            }
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.IsOverlapping;
        if (hashMap != null) {
            hashMap.clear();
        }
    }
}
