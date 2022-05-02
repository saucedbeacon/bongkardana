package id.dana.nearbyme.summary;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.di.modules.MerchantModule;
import id.dana.domain.merchant.MerchantCategoryType;
import id.dana.nearbyme.NearbyMerchantLocationSearchView;
import id.dana.nearbyme.adapter.MerchantCategoryAdapter;
import id.dana.nearbyme.adapter.MerchantListAdapter;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.List;
import javax.inject.Inject;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.GetAboutInfoResult;
import o.IntRange;
import o.PrepareException;
import o.containsFavoriteMenuItem;
import o.dispatchOnCancelled;
import o.g;
import o.getAppIdList;
import o.getStaticPluginModelMap;
import o.isEnabled;
import o.k;
import o.onCancelLoad;
import o.onCanceled;
import o.onDetachedFromLayoutParams;
import o.setShadowResourceRight;
import o.stopIgnoring;
import org.jetbrains.annotations.NotNull;

public class MerchantListView extends BaseRichView implements GetAboutInfoResult.getMin, getAppIdList {
    private String IsOverlapping;
    @BindView(2131362459)
    CoordinatorLayout clMerchantList;
    @BindView(2131362524)
    ConstraintLayout clToolbarContent;
    private MerchantListAdapter equals;
    @BindView(2131362827)
    EditText etNearbySearch;
    private boolean getMax = false;
    private boolean getMin;
    private onDetachedFromLayoutParams isInside;
    private boolean length;
    @BindView(2131363890)
    LinearLayout llMerchantListEmptyState;
    @BindView(2131365905)
    NearbyMerchantLocationSearchView nearbyMerchantLocationSearchView;
    @BindView(2131364145)
    NestedScrollView nestedScrollView;
    @Inject
    public GetAboutInfoResult.getMax presenter;
    @BindView(2131364525)
    RecyclerView rvMerchantCategory;
    @BindView(2131364528)
    RecyclerView rvMerchantList;
    private MerchantCategoryAdapter setMax;
    private isEnabled setMin;
    private getAppIdList toFloatRange;
    private List<ShopModel> toIntRange;
    @BindView(2131365860)
    View viewDivider;
    @BindView(2131365961)
    View viewSpacer;

    public void dismissProgress() {
    }

    public int getLayout() {
        return R.layout.view_merchant_list;
    }

    @JvmDefault
    public final void getMin(@NotNull List<g.AnonymousClass1> list) {
        Intrinsics.checkNotNullParameter(list, "merchantCategoryModels");
    }

    @JvmDefault
    public final void length(@NotNull MerchantCategoryType merchantCategoryType) {
        Intrinsics.checkNotNullParameter(merchantCategoryType, "merchantCategoryType");
    }

    @JvmDefault
    public final void length(@NotNull List<g.AnonymousClass1> list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "checkedCategories");
    }

    public void onError(String str) {
    }

    @JvmDefault
    public final void setMax(@NotNull List<g.AnonymousClass1> list) {
        Intrinsics.checkNotNullParameter(list, "merchantCategoryModels");
    }

    public void showProgress() {
    }

    public MerchantListView(@NonNull Context context) {
        super(context);
    }

    public MerchantListView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MerchantListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MerchantListView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void injectComponent(PrepareException.AnonymousClass1 r4) {
        if (this.setMin == null) {
            getStaticPluginModelMap.length length2 = new getStaticPluginModelMap.length((byte) 0);
            if (r4 != null) {
                length2.setMax = r4;
                length2.length = new MerchantModule(this);
                stopIgnoring.setMin(length2.length, MerchantModule.class);
                stopIgnoring.setMin(length2.setMax, PrepareException.AnonymousClass1.class);
                this.setMin = new getStaticPluginModelMap(length2.length, length2.setMax, (byte) 0);
            } else {
                throw null;
            }
        }
        this.setMin.getMin(this);
        registerPresenter(this.presenter);
    }

    public void injected(boolean z) {
        if (z) {
            this.presenter.getMax();
        }
    }

    public void onGetMerchantCategories(@NotNull List<g.AnonymousClass1> list) {
        this.setMax.getMin(list);
        int i = 0;
        this.rvMerchantCategory.setVisibility((!(this.length ^ true) || !this.getMax) ? 8 : 0);
        this.setMax.getMin(list);
        this.setMax.setMin(getCateoriesById(this.IsOverlapping));
        String str = this.IsOverlapping;
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(326802715, oncanceled);
            onCancelLoad.getMin(326802715, oncanceled);
        }
        g.AnonymousClass1 cateoriesById = getCateoriesById(str);
        if (cateoriesById != null) {
            this.setMax.setMin(cateoriesById);
            MerchantCategoryAdapter merchantCategoryAdapter = this.setMax;
            if (cateoriesById == null || merchantCategoryAdapter.getMax() == null) {
                i = -1;
            } else if (!merchantCategoryAdapter.setMax()) {
                i = merchantCategoryAdapter.getMax().indexOf(cateoriesById);
            } else if (!cateoriesById.equals(merchantCategoryAdapter.setMin)) {
                i = merchantCategoryAdapter.getMax().indexOf(cateoriesById) + 1;
            }
            if (i >= 0) {
                this.rvMerchantCategory.smoothScrollToPosition(i);
            }
        }
    }

    public g.AnonymousClass1 getCateoriesById(String str) {
        int i;
        MerchantCategoryAdapter merchantCategoryAdapter = this.setMax;
        if (merchantCategoryAdapter != null) {
            if (str != null) {
                i = str.length();
            } else {
                i = 0;
            }
            int max = dispatchOnCancelled.setMax(i);
            if (i != max) {
                onCanceled oncanceled = new onCanceled(i, max, 1);
                onCancelLoad.setMax(-742617185, oncanceled);
                onCancelLoad.getMin(-742617185, oncanceled);
            }
            List<g.AnonymousClass1> max2 = merchantCategoryAdapter.getMax();
            if (max2 != null) {
                for (g.AnonymousClass1 r2 : max2) {
                    if (TextUtils.equals(r2.getMax, str)) {
                        return r2;
                    }
                }
            }
        }
        return null;
    }

    public void onMulitpleCategorySelected(@NotNull List<g.AnonymousClass1> list) {
        g.AnonymousClass1 r0 = this.setMax.setMin;
        if (r0 != null && list.contains(r0)) {
            this.rvMerchantCategory.smoothScrollToPosition(0);
        }
        getAppIdList getappidlist = this.toFloatRange;
        if (getappidlist != null) {
            getappidlist.onMulitpleCategorySelected(list);
        }
    }

    public void onCategoryClick(g.AnonymousClass1 r2) {
        this.toFloatRange.onCategoryClick(r2);
    }

    public ShopModel getMerchantItem(int i) {
        return getMerchantList().get(i);
    }

    public List<ShopModel> getMerchantList() {
        return this.toIntRange;
    }

    public void setMerchantList(List<ShopModel> list) {
        this.toIntRange = list;
        if (!list.isEmpty() || this.getMin) {
            if (!this.getMin) {
                length(false);
            }
            this.equals.getMin(list);
            this.equals.notifyDataSetChanged();
            hideShimmerMerchantList();
            return;
        }
        length(true);
        hideShimmerMerchantList();
    }

    private void length(boolean z) {
        int i = 0;
        this.llMerchantListEmptyState.setVisibility(z ? 0 : 8);
        RecyclerView recyclerView = this.rvMerchantList;
        if (z) {
            i = 8;
        }
        recyclerView.setVisibility(i);
    }

    public void hideShimmerMerchantList() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.isInside;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
    }

    public void displayLocationSearchView() {
        this.getMin = true;
        hideShimmerMerchantList();
        this.clToolbarContent.setVisibility(8);
        this.etNearbySearch.setVisibility(8);
        this.rvMerchantList.setVisibility(8);
        this.llMerchantListEmptyState.setVisibility(8);
        this.rvMerchantCategory.setVisibility(8);
        this.nearbyMerchantLocationSearchView.setVisibility(0);
        this.nearbyMerchantLocationSearchView.displayInitialLocationState();
    }

    public void displayLocationMerchantSearchView() {
        this.getMin = true;
        hideShimmerMerchantList();
        this.clToolbarContent.setVisibility(8);
        this.etNearbySearch.setVisibility(8);
        this.rvMerchantList.setVisibility(8);
        this.llMerchantListEmptyState.setVisibility(8);
        this.rvMerchantCategory.setVisibility(8);
        this.nearbyMerchantLocationSearchView.setVisibility(0);
        this.nearbyMerchantLocationSearchView.displayInitialMerchantState();
    }

    public void resetLocationMerchantSearchView() {
        int i = 0;
        this.getMin = false;
        this.clToolbarContent.setVisibility(0);
        this.nearbyMerchantLocationSearchView.setVisibility(8);
        this.nearbyMerchantLocationSearchView.resetState();
        this.etNearbySearch.setVisibility(0);
        this.etNearbySearch.setText("");
        boolean z = !this.length;
        RecyclerView recyclerView = this.rvMerchantCategory;
        if (!z || !this.getMax) {
            i = 8;
        }
        recyclerView.setVisibility(i);
    }

    public void setOnCategoryCheckedListener(getAppIdList getappidlist) {
        this.toFloatRange = getappidlist;
    }

    public void setOnTopUpButtonClickListener(MerchantListAdapter.setMin setmin) {
        MerchantListAdapter merchantListAdapter = this.equals;
        if (merchantListAdapter != null) {
            merchantListAdapter.getMax = setmin;
        }
    }

    public void setOnHomeShoppingClickListener(MerchantListAdapter.getMax getmax) {
        MerchantListAdapter merchantListAdapter = this.equals;
        if (merchantListAdapter != null) {
            merchantListAdapter.getMin = getmax;
        }
    }

    public void setOnMerchantClickListener(MerchantListAdapter.setMax setmax) {
        MerchantListAdapter merchantListAdapter = this.equals;
        if (merchantListAdapter != null) {
            merchantListAdapter.setMin = setmax;
        }
    }

    public void setOnPromoRibbonClickListener(MerchantListAdapter.getMin getmin) {
        MerchantListAdapter merchantListAdapter = this.equals;
        if (merchantListAdapter != null) {
            merchantListAdapter.length = getmin;
        }
    }

    public void setOnOtherStoreButtonClickListener(MerchantListAdapter.length length2) {
        MerchantListAdapter merchantListAdapter = this.equals;
        if (merchantListAdapter != null) {
            merchantListAdapter.setMax = length2;
        }
    }

    public void showShimmerMerchantList() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.isInside;
        if (ondetachedfromlayoutparams == null) {
            this.isInside = containsFavoriteMenuItem.getMin(this.rvMerchantList, R.layout.view_merchant_list_skeleton);
        } else {
            ondetachedfromlayoutparams.getMin();
        }
    }

    public void setPreSelectedCategoryId(String str) {
        this.IsOverlapping = str;
    }

    public void clearPreSelectedCategory() {
        if (this.setMax != null) {
            this.IsOverlapping = null;
            this.llMerchantListEmptyState.setVisibility(8);
            this.rvMerchantCategory.scrollToPosition(0);
        }
    }

    public void forceHideCategory() {
        this.length = true;
    }

    public void updateShopModelsWithPromo(List<ShopModel> list, Function1<ShopModel, ShopModel> function1) {
        MerchantListAdapter merchantListAdapter = this.equals;
        if (merchantListAdapter.getMax() != null && !merchantListAdapter.getMax().isEmpty()) {
            merchantListAdapter.IsOverlapping = false;
            for (ShopModel next : list) {
                int indexOf = merchantListAdapter.getMax().indexOf(next);
                if (indexOf >= 0) {
                    function1.invoke(next);
                    List<PromoInfoModel> list2 = next.Mean$Arithmetic;
                    if (merchantListAdapter.getMax().get(indexOf) != null) {
                        ((ShopModel) merchantListAdapter.getMax().get(indexOf)).length(list2);
                        merchantListAdapter.notifyItemChanged(indexOf);
                    }
                }
            }
        }
    }

    public void showSpacer(boolean z) {
        this.viewSpacer.setVisibility(z ? 0 : 8);
    }

    public void setup() {
        MerchantListAdapter merchantListAdapter = new MerchantListAdapter();
        this.equals = merchantListAdapter;
        this.rvMerchantList.setAdapter(merchantListAdapter);
        this.rvMerchantList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.rvMerchantList.addItemDecoration(new setShadowResourceRight(getContext(), IntRange.setMax(getContext(), R.color.f20352131099947), 0.5f));
        ViewCompat.setMax((View) this.rvMerchantList, false);
        MerchantCategoryAdapter merchantCategoryAdapter = new MerchantCategoryAdapter();
        this.setMax = merchantCategoryAdapter;
        merchantCategoryAdapter.getMax = this;
        this.rvMerchantCategory.setAdapter(this.setMax);
        this.rvMerchantCategory.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.rvMerchantCategory.addItemDecoration(new RecyclerView.getMax() {
            private final int getMin = 8;

            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
                rect.left = this.getMin;
                rect.right = this.getMin;
                rect.bottom = this.getMin;
            }
        });
        ViewCompat.setMax((View) this.rvMerchantCategory, false);
        this.nestedScrollView.setOnScrollChangeListener(new k.a(this));
    }

    public void onCheckMerchantFilterFeatureEnableSuccess(boolean z) {
        this.getMax = z;
        this.presenter.getMin();
    }

    public static /* synthetic */ void getMax(MerchantListView merchantListView, int i) {
        merchantListView.viewDivider.setVisibility(i == 0 ? 8 : 0);
    }
}
