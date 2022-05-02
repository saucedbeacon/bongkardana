package o;

import android.location.Location;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.view.MerchantBasicInfoView;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmDefault;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0017J\u001e\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0017ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lid/dana/nearbyrevamp/search/NearbySearchResultListener;", "", "onClearButtonClicked", "", "onLocationSelected", "location", "Landroid/location/Location;", "onPlaceSelected", "nearbyLocation", "Lid/dana/domain/nearbyplaces/model/NearbyLocation;", "onSeeOnMapClicked", "shopModel", "", "Lid/dana/nearbyme/model/ShopModel;", "hasMore", "", "onShopSelected", "allShops", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public interface GriverDefaultOpenSettingExtension {
    @JvmDefault
    void getMin(@NotNull getCreateTime getcreatetime);

    @JvmDefault
    void length(@NotNull ShopModel shopModel, @NotNull List<? extends ShopModel> list, boolean z);

    @JvmDefault
    void q_();

    @JvmDefault
    void setMax(@NotNull List<? extends ShopModel> list, boolean z);

    @JvmDefault
    void setMin(@NotNull Location location);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB6\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00030\u00030\u0013J\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0014\u0010\u001d\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R)\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00060\bX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/MerchantSearchResultAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopModel;", "onLoadMoreClicked", "Lkotlin/Function0;", "", "onShopClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "shopModel", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "addLoadMore", "addLoading", "getItemViewType", "", "position", "getShops", "", "kotlin.jvm.PlatformType", "isLastItemShop", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeLoadMore", "removeLoading", "updateShops", "shopsWithPromo", "MerchantSearchResultViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class SettingChangeReceiver extends IMultiInstanceInvalidationCallback.Stub<Ignore<ShopModel>, ShopModel> {
        private final Function1<ShopModel, Unit> getMax;
        private final Function0<Unit> setMax;

        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
            Ignore ignore;
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            if (i == 2) {
                ignore = new AddPhoneContactBridgeExtension(viewGroup);
            } else if (i != 3) {
                ignore = new length(viewGroup, this.getMax);
            } else {
                ignore = new getDisplayPostal(viewGroup, this.setMax);
            }
            return ignore;
        }

        public SettingChangeReceiver(@NotNull Function0<Unit> function0, @NotNull Function1<? super ShopModel, Unit> function1) {
            Intrinsics.checkNotNullParameter(function0, "onLoadMoreClicked");
            Intrinsics.checkNotNullParameter(function1, "onShopClicked");
            this.setMax = function0;
            this.getMax = function1;
        }

        public final int getItemViewType(int i) {
            Object obj = getMax().get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
            return ((ShopModel) obj).asBinder;
        }

        public final boolean setMin() {
            List max = getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            ShopModel shopModel = (ShopModel) CollectionsKt.lastOrNull(max);
            return shopModel != null && shopModel.asBinder == 0;
        }

        public final void setMax() {
            Collection max = getMax();
            if (!(max == null || max.isEmpty())) {
                List max2 = getMax();
                Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
                Object last = CollectionsKt.last(max2);
                Intrinsics.checkNotNullExpressionValue(last, "items.last()");
                if (((ShopModel) last).asBinder == 2) {
                    getMax(getItemCount() - 1);
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B0\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012!\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R)\u0010\u0005\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyrevamp/search/adapter/MerchantSearchResultAdapter$MerchantSearchResultViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopModel;", "parent", "Landroid/view/ViewGroup;", "onShopClicked", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "shopModel", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length extends Ignore<ShopModel> {
            /* access modifiers changed from: private */
            public final Function1<ShopModel, Unit> setMax;

            public final /* synthetic */ void setMax(Object obj) {
                ShopModel shopModel = (ShopModel) obj;
                if (shopModel != null) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    MerchantBasicInfoView merchantBasicInfoView = (MerchantBasicInfoView) view.findViewById(resetInternal.setMax.setRadius);
                    if (merchantBasicInfoView != null) {
                        MerchantBasicInfoView.showMerchantInfo$default(merchantBasicInfoView, shopModel, true, (MerchantBasicInfoView.InfoType) null, 4, (Object) null);
                    }
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    MerchantBasicInfoView merchantBasicInfoView2 = (MerchantBasicInfoView) view2.findViewById(resetInternal.setMax.setRadius);
                    if (merchantBasicInfoView2 != null) {
                        merchantBasicInfoView2.setOnClickListener(new setMin(this, shopModel));
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public length(@NotNull ViewGroup viewGroup, @NotNull Function1<? super ShopModel, Unit> function1) {
                super(viewGroup.getContext(), R.layout.view_new_merchant_list_item, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                Intrinsics.checkNotNullParameter(function1, "onShopClicked");
                this.setMax = function1;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            static final class setMin implements View.OnClickListener {
                final /* synthetic */ length getMin;
                final /* synthetic */ ShopModel setMin;

                setMin(length length, ShopModel shopModel) {
                    this.getMin = length;
                    this.setMin = shopModel;
                }

                public final void onClick(View view) {
                    this.getMin.setMax.invoke(this.setMin);
                }
            }
        }
    }
}
