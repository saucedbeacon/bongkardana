package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.view.MerchantPromoDealsView;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.SimpleListAdapter;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0016J*\u0010\u000f\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00112\u0006\u0010\u0015\u001a\u00020\u0016¨\u0006\u0019"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantPromoDealsInfoAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantPromoDealsViewHolderModel;", "()V", "addLoadingState", "", "getItemCount", "", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setPromoAndDeals", "promoModels", "", "Lid/dana/nearbyme/model/PromoInfoModel;", "dealsModels", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "MerchantPromoDealsInfoViewHolder", "MerchantPromoDealsShimmerViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setOnSettingChangeListener extends IMultiInstanceInvalidationCallback.Stub<Ignore<SimpleListAdapter>, SimpleListAdapter> {
    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i != 1) {
            ignore = new getMax(viewGroup);
        } else {
            ignore = new length(viewGroup);
        }
        return ignore;
    }

    public setOnSettingChangeListener() {
        SimpleListAdapter.getMax getmax = SimpleListAdapter.getMin;
        getMin(CollectionsKt.mutableListOf(new SimpleListAdapter()));
    }

    public final int getItemViewType(int i) {
        return ((SimpleListAdapter) getMax().get(i)).setMin;
    }

    public final int getItemCount() {
        List max = getMax();
        Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
        if (CollectionsKt.firstOrNull(max) != null) {
            List max2 = getMax();
            Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
            if (((SimpleListAdapter) CollectionsKt.first(max2)).setMin == 1) {
                return 1;
            }
            List max3 = getMax();
            Intrinsics.checkNotNullExpressionValue(max3, FirebaseAnalytics.Param.ITEMS);
            if (((SimpleListAdapter) CollectionsKt.first(max3)).setMin == 0) {
                List max4 = getMax();
                Intrinsics.checkNotNullExpressionValue(max4, FirebaseAnalytics.Param.ITEMS);
                if (((SimpleListAdapter) CollectionsKt.first(max4)).getMin()) {
                    return 1;
                }
            }
        }
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantPromoDealsInfoAdapter$MerchantPromoDealsInfoViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantPromoDealsViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends Ignore<SimpleListAdapter> {
        public final /* synthetic */ void setMax(Object obj) {
            SimpleListAdapter simpleListAdapter = (SimpleListAdapter) obj;
            if (simpleListAdapter != null) {
                ShopModel shopModel = simpleListAdapter.setMax;
                if (shopModel != null) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    MerchantPromoDealsView merchantPromoDealsView = (MerchantPromoDealsView) view.findViewById(resetInternal.setMax.getContentPaddingLeft);
                    if (merchantPromoDealsView != null) {
                        merchantPromoDealsView.setShopModel(shopModel);
                    }
                }
                View view2 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                MerchantPromoDealsView merchantPromoDealsView2 = (MerchantPromoDealsView) view2.findViewById(resetInternal.setMax.getContentPaddingLeft);
                if (merchantPromoDealsView2 != null) {
                    merchantPromoDealsView2.populatePromoAndDeals(simpleListAdapter.length, simpleListAdapter.getMax);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_merchant_promo_deals_viewholder, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantPromoDealsInfoAdapter$MerchantPromoDealsShimmerViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantPromoDealsViewHolderModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends Ignore<SimpleListAdapter> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(@NotNull ViewGroup viewGroup) {
            super(viewGroup.getContext(), R.layout.item_merchant_promodeals_shimmer, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
        }

        public final /* synthetic */ void setMax(Object obj) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            containsFavoriteMenuItem.getMin(view.findViewById(resetInternal.setMax.MotionLayout), R.layout.view_merchant_promo_deals_skeleton);
        }
    }
}
