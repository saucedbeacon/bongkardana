package id.dana.nearbyrevamp.merchantlist;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.base.BaseRichView;
import id.dana.nearbyme.merchantdetail.model.MerchantImageModel;
import id.dana.nearbyme.model.ShopModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.SimpleListAdapter;
import o.containsFavoriteMenuItem;
import o.onDetachedFromLayoutParams;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 92\u00020\u0001:\u00019B%\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB)\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\u0014\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0006\u0010\u0017\u001a\u00020\u0015J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u0010\u0010\u001d\u001a\u00020\u00152\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u0015H\u0002J\u001e\u0010!\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0#2\b\b\u0002\u0010$\u001a\u00020\u0007J\u0014\u0010%\u001a\u00020\u00152\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150'J)\u0010(\u001a\u00020\u00152!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020\u00150*J\b\u0010.\u001a\u00020\u0015H\u0016J\b\u0010/\u001a\u00020\u0015H\u0002J\u0006\u00100\u001a\u00020\u0015J\u0006\u00101\u001a\u00020\u0015J\u0006\u00102\u001a\u00020\u0015J\u0006\u00103\u001a\u00020\u0015J\u001c\u00104\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u0002060\f2\u0006\u00107\u001a\u00020\rJ\u0014\u00108\u001a\u00020\u00152\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\fR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lid/dana/nearbyrevamp/merchantlist/NewMerchantListView;", "Lid/dana/base/BaseRichView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "merchantList", "", "Lid/dana/nearbyme/model/ShopModel;", "getMerchantList", "()Ljava/util/List;", "merchantListAdapter", "Lid/dana/nearbyrevamp/merchantlist/adapter/NewMerchantListAdapter;", "skeletonScreenMerchant", "Lcom/ethanhua/skeleton/SkeletonScreen;", "appendItem", "", "shopModels", "clearMerchantList", "getItemCount", "getLayout", "hideShimmerMerchantList", "removeLoadMore", "removeLoading", "setCenterRecyclerView", "isBottomSheetExpanded", "", "setEmptyState", "setMerchantList", "shops", "", "currentPageNum", "setOnLoadMoreClicked", "onLoadMoreClick", "Lkotlin/Function0;", "setOnMerchantListClicked", "onMerchantItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "shopMode", "setup", "setupMerchantList", "showEmptyState", "showLoadMore", "showLoading", "showShimmerMerchantList", "updateImage", "merchantImages", "Lid/dana/nearbyme/merchantdetail/model/MerchantImageModel;", "shopModel", "updateShops", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class NewMerchantListView extends BaseRichView {
    @NotNull
    public static final setMax Companion = new setMax((byte) 0);
    private onDetachedFromLayoutParams getMin;
    /* access modifiers changed from: private */
    public SimpleListAdapter.SimpleViewHolder length;
    private HashMap setMin;

    @JvmOverloads
    public NewMerchantListView(@NotNull Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
    }

    @JvmOverloads
    public NewMerchantListView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getLayout() {
        return R.layout.view_new_merchant_list;
    }

    public static final /* synthetic */ SimpleListAdapter.SimpleViewHolder access$getMerchantListAdapter$p(NewMerchantListView newMerchantListView) {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = newMerchantListView.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        return simpleViewHolder;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NewMerchantListView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NewMerchantListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public NewMerchantListView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    public static /* synthetic */ void setMerchantList$default(NewMerchantListView newMerchantListView, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        newMerchantListView.setMerchantList(list, i);
    }

    public final void clearMerchantList() {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        simpleViewHolder.getMin();
    }

    public final void updateShops(@NotNull List<? extends ShopModel> list) {
        Intrinsics.checkNotNullParameter(list, "shops");
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        simpleViewHolder.setMax(list);
    }

    @NotNull
    public final List<ShopModel> getMerchantList() {
        if (this.length == null) {
            return CollectionsKt.emptyList();
        }
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        if (simpleViewHolder.getItemCount() == 1 && simpleViewHolder.setMin()) {
            return new ArrayList<>();
        }
        List<ShopModel> max = simpleViewHolder.getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        return max;
    }

    public final void showShimmerMerchantList() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
            return;
        }
        NewMerchantListView newMerchantListView = this;
        newMerchantListView.getMin = containsFavoriteMenuItem.getMin((RecyclerView) newMerchantListView._$_findCachedViewById(resetInternal.setMax.showPopupUnchecked), R.layout.view_new_merchant_list_skeleton);
    }

    public final void setOnMerchantListClicked(@NotNull Function1<? super ShopModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onMerchantItemClick");
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        simpleViewHolder.setMax = function1;
    }

    public final void setOnLoadMoreClicked(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onLoadMoreClick");
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        simpleViewHolder.getMax = function0;
    }

    public final void updateImage(@NotNull List<MerchantImageModel> list, @NotNull ShopModel shopModel) {
        Intrinsics.checkNotNullParameter(list, "merchantImages");
        Intrinsics.checkNotNullParameter(shopModel, "shopModel");
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        List max = simpleViewHolder.getMax();
        Intrinsics.checkNotNullExpressionValue(max, "merchantListAdapter.items");
        int i = 0;
        Iterator it = max.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual((Object) (ShopModel) it.next(), (Object) shopModel)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            SimpleListAdapter.SimpleViewHolder simpleViewHolder2 = this.length;
            if (simpleViewHolder2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
            }
            Object obj = simpleViewHolder2.getMax().get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "merchantListAdapter.items[existingShop]");
            ShopModel shopModel2 = (ShopModel) obj;
            shopModel2.ICustomTabsService = true;
            shopModel2.getDefaultImpl = list;
            SimpleListAdapter.SimpleViewHolder simpleViewHolder3 = this.length;
            if (simpleViewHolder3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
            }
            simpleViewHolder3.notifyItemChanged(i);
        }
    }

    public final void showLoading() {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        ShopModel shopModel = new ShopModel();
        shopModel.asBinder = 2;
        Unit unit = Unit.INSTANCE;
        simpleViewHolder.getMax(shopModel);
    }

    public final void showLoadMore() {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        ShopModel shopModel = new ShopModel();
        shopModel.asBinder = 3;
        Unit unit = Unit.INSTANCE;
        simpleViewHolder.getMax(shopModel);
    }

    public final void removeLoading() {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        if (simpleViewHolder.getItemCount() > 0 && simpleViewHolder.getItemViewType(simpleViewHolder.getItemCount() - 1) == 2) {
            simpleViewHolder.getMax(simpleViewHolder.getItemCount() - 1);
        }
    }

    public final void removeLoadMore() {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        if (simpleViewHolder.getItemCount() > 0 && simpleViewHolder.getItemViewType(simpleViewHolder.getItemCount() - 1) == 3) {
            simpleViewHolder.getMax(simpleViewHolder.getItemCount() - 1);
        }
    }

    public final void appendItem(@NotNull List<? extends ShopModel> list) {
        Intrinsics.checkNotNullParameter(list, "shopModels");
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        simpleViewHolder.length(list);
    }

    @NotNull
    public final List<ShopModel> getItemCount() {
        return getMerchantList();
    }

    public static /* synthetic */ void setCenterRecyclerView$default(NewMerchantListView newMerchantListView, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        newMerchantListView.setCenterRecyclerView(z);
    }

    public final void setCenterRecyclerView(boolean z) {
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        if (simpleViewHolder.setMin()) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopupUnchecked);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rvMerchantList");
            View view = recyclerView;
            view.setPadding(view.getPaddingLeft(), (int) (((float) (z ? 100 : 0)) * Resources.getSystem().getDisplayMetrics().density), view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/nearbyrevamp/merchantlist/NewMerchantListView$Companion;", "", "()V", "POPULAR_COUNT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    public final void setup() {
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(resetInternal.setMax.showPopupUnchecked);
        if (recyclerView != null) {
            this.length = new SimpleListAdapter.SimpleViewHolder();
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
            if (simpleViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
            }
            recyclerView.setAdapter(simpleViewHolder);
        }
    }

    public final void setMerchantList(@NotNull List<ShopModel> list, int i) {
        Intrinsics.checkNotNullParameter(list, "shops");
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        if (list.isEmpty()) {
            SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
            if (simpleViewHolder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
            }
            if (simpleViewHolder.getMax().isEmpty()) {
                SimpleListAdapter.SimpleViewHolder simpleViewHolder2 = this.length;
                if (simpleViewHolder2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
                }
                simpleViewHolder2.toIntRange();
                return;
            }
        }
        SimpleListAdapter.SimpleViewHolder simpleViewHolder3 = this.length;
        if (simpleViewHolder3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        if (simpleViewHolder3.getItemCount() > 0 && simpleViewHolder3.getItemViewType(simpleViewHolder3.getItemCount() - 1) == 1) {
            simpleViewHolder3.getMax(simpleViewHolder3.getItemCount() - 1);
        }
        if (i > 1) {
            removeLoading();
            SimpleListAdapter.SimpleViewHolder simpleViewHolder4 = this.length;
            if (simpleViewHolder4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
            }
            simpleViewHolder4.getMax().addAll(list);
            return;
        }
        Iterable<ShopModel> take = CollectionsKt.take(list, 3);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        for (ShopModel shopModel : take) {
            shopModel.ICustomTabsCallback$Default = true;
            arrayList.add(Unit.INSTANCE);
        }
        SimpleListAdapter.SimpleViewHolder simpleViewHolder5 = this.length;
        if (simpleViewHolder5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        simpleViewHolder5.getMin(list);
    }

    public final void showEmptyState() {
        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMin;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        SimpleListAdapter.SimpleViewHolder simpleViewHolder = this.length;
        if (simpleViewHolder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("merchantListAdapter");
        }
        simpleViewHolder.toIntRange();
        removeLoadMore();
    }
}
