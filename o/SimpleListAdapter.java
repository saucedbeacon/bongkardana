package o;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.nearbyme.merchantreview.model.MerchantConsultReviewModel;
import id.dana.nearbyme.model.PromoInfoModel;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyme.model.ShopOpenHourModel;
import id.dana.nearbyrevamp.view.MerchantBasicInfoView;
import id.dana.richview.CurrencyTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.OptionMenuRecyclerAdapter;
import o.WheelView;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003JC\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001c\u001a\u00020\u0019J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, d2 = {"Lid/dana/nearbyrevamp/model/MerchantPromoDealsViewHolderModel;", "", "viewType", "", "promoInfoModels", "", "Lid/dana/nearbyme/model/PromoInfoModel;", "dealsInfoModels", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "(ILjava/util/List;Ljava/util/List;Lid/dana/nearbyme/model/ShopModel;)V", "getDealsInfoModels", "()Ljava/util/List;", "getPromoInfoModels", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "getViewType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "isPromoAndDealsExist", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class SimpleListAdapter {
    @NotNull
    public static final getMax getMin = new getMax((byte) 0);
    @Nullable
    public final List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> getMax;
    @Nullable
    public final List<PromoInfoModel> length;
    @Nullable
    public final ShopModel setMax;
    public final int setMin;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleListAdapter)) {
            return false;
        }
        SimpleListAdapter simpleListAdapter = (SimpleListAdapter) obj;
        return this.setMin == simpleListAdapter.setMin && Intrinsics.areEqual((Object) this.length, (Object) simpleListAdapter.length) && Intrinsics.areEqual((Object) this.getMax, (Object) simpleListAdapter.getMax) && Intrinsics.areEqual((Object) this.setMax, (Object) simpleListAdapter.setMax);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantPromoDealsViewHolderModel(viewType=");
        sb.append(this.setMin);
        sb.append(", promoInfoModels=");
        sb.append(this.length);
        sb.append(", dealsInfoModels=");
        sb.append(this.getMax);
        sb.append(", shopModel=");
        sb.append(this.setMax);
        sb.append(")");
        return sb.toString();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002+,B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0016J\u000e\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\nJ\u0006\u0010$\u001a\u00020\nJ\u0006\u0010%\u001a\u00020\nJ\u0006\u0010&\u001a\u00020\nJ\u0006\u0010'\u001a\u00020\nJ\u0014\u0010(\u001a\u00020\n2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030*R7\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006-"}, d2 = {"Lid/dana/nearbyrevamp/merchantlist/adapter/NewMerchantListAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopModel;", "()V", "onCardClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "shopModel", "", "getOnCardClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnCardClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onLoadMoreClickListener", "Lkotlin/Function0;", "getOnLoadMoreClickListener", "()Lkotlin/jvm/functions/Function0;", "setOnLoadMoreClickListener", "(Lkotlin/jvm/functions/Function0;)V", "getItemViewType", "", "position", "getMerchantList", "", "isEmptyState", "", "isLastItemShop", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeItemType", "type", "removeLoadMore", "removeLoading", "setEmptyState", "showLoadMore", "showLoading", "updateShops", "updatedShopsWithPromo", "", "MerchantEmptyViewHolder", "MerchantListViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class SimpleViewHolder extends IMultiInstanceInvalidationCallback.Stub<Ignore<ShopModel>, ShopModel> {
        public Function0<Unit> getMax;
        @Nullable
        public Function1<? super ShopModel, Unit> setMax;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lid/dana/nearbyrevamp/model/RatingViewHolderModel;", "", "viewType", "", "userReviewModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "merchantConsultReviewModel", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "(ILid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;Lid/dana/nearbyme/model/ShopModel;)V", "getMerchantConsultReviewModel", "()Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "getUserReviewModel", "()Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "getViewType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        /* renamed from: o.SimpleListAdapter$SimpleViewHolder$1  reason: invalid class name */
        public final class AnonymousClass1 {
            @NotNull
            public static final getMin getMax = new getMin((byte) 0);
            @Nullable
            public final OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 getMin;
            @Nullable
            public final MerchantConsultReviewModel length;
            @Nullable
            public final ShopModel setMax;
            public final int setMin;

            public final boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AnonymousClass1)) {
                    return false;
                }
                AnonymousClass1 r3 = (AnonymousClass1) obj;
                return this.setMin == r3.setMin && Intrinsics.areEqual((Object) this.getMin, (Object) r3.getMin) && Intrinsics.areEqual((Object) this.length, (Object) r3.length) && Intrinsics.areEqual((Object) this.setMax, (Object) r3.setMax);
            }

            @NotNull
            public final String toString() {
                StringBuilder sb = new StringBuilder("RatingViewHolderModel(viewType=");
                sb.append(this.setMin);
                sb.append(", userReviewModel=");
                sb.append(this.getMin);
                sb.append(", merchantConsultReviewModel=");
                sb.append(this.length);
                sb.append(", shopModel=");
                sb.append(this.setMax);
                sb.append(")");
                return sb.toString();
            }

            private AnonymousClass1(int i, @Nullable OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r2, @Nullable MerchantConsultReviewModel merchantConsultReviewModel, @Nullable ShopModel shopModel) {
                this.setMin = i;
                this.getMin = r2;
                this.length = merchantConsultReviewModel;
                this.setMax = shopModel;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ AnonymousClass1(int i, OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r4, MerchantConsultReviewModel merchantConsultReviewModel, ShopModel shopModel, int i2) {
                this(i, (i2 & 2) != 0 ? null : r4, (i2 & 4) != 0 ? null : merchantConsultReviewModel, (i2 & 8) != 0 ? null : shopModel);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lid/dana/nearbyrevamp/model/RatingViewHolderModel$Companion;", "", "()V", "MERCHANT_COACHMARK_ITEM", "", "MERCHANT_INPUT_REVIEW_ITEM", "MERCHANT_OWN_REVIEW_ITEM", "MERCHANT_RATING_ITEM", "MERCHANT_REVIEW_EMPTY_STATE", "MERCHANT_REVIEW_HEADER", "MERCHANT_REVIEW_SHIMMER", "createCoachmark", "Lid/dana/nearbyrevamp/model/RatingViewHolderModel;", "createEmptyState", "createHeader", "createRating", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "createShimmer", "createUserInputReview", "reviewForm", "Lid/dana/nearbyme/merchantreview/model/MerchantConsultReviewModel;", "createUserReview", "merchantReviewModel", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
            /* renamed from: o.SimpleListAdapter$SimpleViewHolder$1$getMin */
            public static final class getMin {
                private getMin() {
                }

                public /* synthetic */ getMin(byte b) {
                    this();
                }
            }

            public final int hashCode() {
                int hashCode = Integer.valueOf(this.setMin).hashCode() * 31;
                OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1 r1 = this.getMin;
                int i = 0;
                int hashCode2 = (hashCode + (r1 != null ? r1.hashCode() : 0)) * 31;
                MerchantConsultReviewModel merchantConsultReviewModel = this.length;
                int hashCode3 = (hashCode2 + (merchantConsultReviewModel != null ? merchantConsultReviewModel.hashCode() : 0)) * 31;
                ShopModel shopModel = this.setMax;
                if (shopModel != null) {
                    i = shopModel.hashCode();
                }
                return hashCode3 + i;
            }
        }

        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
            Ignore ignore;
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            if (i == 1) {
                ignore = new setMin(viewGroup);
            } else if (i == 2) {
                ignore = new AddPhoneContactBridgeExtension(viewGroup);
            } else if (i != 3) {
                ignore = new getMax(viewGroup, this.setMax);
            } else {
                Function0<Unit> function0 = this.getMax;
                if (function0 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("onLoadMoreClickListener");
                }
                ignore = new getDisplayPostal(viewGroup, function0);
            }
            return ignore;
        }

        public SimpleViewHolder() {
            super.getMin(CollectionsKt.emptyList());
        }

        public final boolean setMax() {
            List max = getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            ShopModel shopModel = (ShopModel) CollectionsKt.lastOrNull(max);
            return shopModel != null && shopModel.asBinder == 0;
        }

        public final boolean setMin() {
            List max = getMax();
            Intrinsics.checkNotNullExpressionValue(max, FirebaseAnalytics.Param.ITEMS);
            if (!(!max.isEmpty())) {
                return false;
            }
            List max2 = getMax();
            Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
            Object first = CollectionsKt.first(max2);
            Intrinsics.checkNotNullExpressionValue(first, "items.first()");
            return ((ShopModel) first).asBinder == 1;
        }

        public final void toIntRange() {
            List arrayList = new ArrayList();
            ShopModel shopModel = new ShopModel();
            shopModel.asBinder = 1;
            Unit unit = Unit.INSTANCE;
            arrayList.add(shopModel);
            Unit unit2 = Unit.INSTANCE;
            getMin(arrayList);
        }

        public final int getItemViewType(int i) {
            Object obj = getMax().get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
            return ((ShopModel) obj).asBinder;
        }

        public final void setMax(@NotNull List<? extends ShopModel> list) {
            Intrinsics.checkNotNullParameter(list, "updatedShopsWithPromo");
            if (!list.isEmpty()) {
                Collection max = getMax();
                if (!(max == null || max.isEmpty())) {
                    for (ShopModel shopModel : list) {
                        int indexOf = getMax().indexOf(shopModel);
                        if (indexOf != -1) {
                            Object obj = getMax().get(indexOf);
                            Intrinsics.checkNotNullExpressionValue(obj, "items[position]");
                            ((ShopModel) obj).length(shopModel.Mean$Arithmetic);
                            notifyItemChanged(indexOf);
                        }
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B4\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016R+\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyrevamp/merchantlist/adapter/NewMerchantListAdapter$MerchantListViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopModel;", "parent", "Landroid/view/ViewGroup;", "onCardClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "shopModel", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax extends Ignore<ShopModel> {
            /* access modifiers changed from: private */
            public final Function1<ShopModel, Unit> getMax;

            public final /* synthetic */ void setMax(Object obj) {
                ShopModel shopModel = (ShopModel) obj;
                if (shopModel != null) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    MerchantBasicInfoView merchantBasicInfoView = (MerchantBasicInfoView) view.findViewById(resetInternal.setMax.setRadius);
                    if (merchantBasicInfoView != null) {
                        MerchantBasicInfoView.showMerchantInfo$default(merchantBasicInfoView, shopModel, false, (MerchantBasicInfoView.InfoType) null, 6, (Object) null);
                        View _$_findCachedViewById = merchantBasicInfoView._$_findCachedViewById(resetInternal.setMax.setCardBackgroundColor);
                        if (_$_findCachedViewById != null) {
                            Intrinsics.checkNotNullParameter(_$_findCachedViewById, "<this>");
                            _$_findCachedViewById.setVisibility(0);
                        }
                        merchantBasicInfoView.setOnClickListener(new setMin(this, shopModel));
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMax(@NotNull ViewGroup viewGroup, @Nullable Function1<? super ShopModel, Unit> function1) {
                super(viewGroup.getContext(), R.layout.view_new_merchant_list_item, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                this.getMax = function1;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "id/dana/nearbyrevamp/merchantlist/adapter/NewMerchantListAdapter$MerchantListViewHolder$bindData$1$1"}, k = 3, mv = {1, 4, 2})
            static final class setMin implements View.OnClickListener {
                final /* synthetic */ ShopModel getMin;
                final /* synthetic */ getMax setMax;

                setMin(getMax getmax, ShopModel shopModel) {
                    this.setMax = getmax;
                    this.getMin = shopModel;
                }

                public final void onClick(View view) {
                    Function1 max = this.setMax.getMax;
                    if (max != null) {
                        max.invoke(this.getMin);
                    }
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyrevamp/merchantlist/adapter/NewMerchantListAdapter$MerchantEmptyViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMin extends Ignore<ShopModel> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public setMin(@NotNull ViewGroup viewGroup) {
                super(viewGroup.getContext(), R.layout.view_nearby_merchants_empty, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
            }
        }
    }

    public SimpleListAdapter(int i, @Nullable List<? extends PromoInfoModel> list, @Nullable List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> list2, @Nullable ShopModel shopModel) {
        this.setMin = i;
        this.length = list;
        this.getMax = list2;
        this.setMax = shopModel;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/OpenHourDetailAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopOpenHourModel;", "()V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "OpenHourDetailViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class OnItemClickListener extends IMultiInstanceInvalidationCallback.Stub<Ignore<ShopOpenHourModel>, ShopOpenHourModel> {
        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            return new getMax(viewGroup);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\t\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/OpenHourDetailAdapter$OpenHourDetailViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopOpenHourModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "highlightText", "Landroid/widget/TextView;", "highlight", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMax extends Ignore<ShopOpenHourModel> {
            public final /* synthetic */ void setMax(Object obj) {
                ShopOpenHourModel shopOpenHourModel = (ShopOpenHourModel) obj;
                if (shopOpenHourModel != null) {
                    View view = this.itemView;
                    TextView textView = (TextView) view.findViewById(resetInternal.setMax.measureHorizontal);
                    if (textView != null) {
                        textView.setText(shopOpenHourModel.length);
                    }
                    if (shopOpenHourModel.getMax()) {
                        TextView textView2 = (TextView) view.findViewById(resetInternal.setMax.setTabSelected);
                        if (textView2 != null) {
                            textView2.setText(view.getContext().getString(R.string.full_day_open_hour));
                        }
                    } else if (shopOpenHourModel.setMin == 0 || shopOpenHourModel.setMax == 0) {
                        TextView textView3 = (TextView) view.findViewById(resetInternal.setMax.setTabSelected);
                        if (textView3 != null) {
                            textView3.setText(view.getContext().getString(R.string.close_hour));
                        }
                    } else {
                        Date date = new Date(shopOpenHourModel.setMin * 1000);
                        if (WheelView.OnWheelViewListener.getMax == null) {
                            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                        }
                        Locale locale = WheelView.OnWheelViewListener.getMax;
                        String format = new SimpleDateFormat("HH:mm", locale).format(new Date(date.getTime()));
                        Date date2 = new Date(shopOpenHourModel.setMax * 1000);
                        if (WheelView.OnWheelViewListener.getMax == null) {
                            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
                        }
                        Locale locale2 = WheelView.OnWheelViewListener.getMax;
                        String format2 = new SimpleDateFormat("HH:mm", locale2).format(new Date(date2.getTime()));
                        TextView textView4 = (TextView) view.findViewById(resetInternal.setMax.setTabSelected);
                        if (textView4 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(format);
                            sb.append(" - ");
                            sb.append(format2);
                            textView4.setText(sb.toString());
                        }
                    }
                    TextView textView5 = (TextView) view.findViewById(resetInternal.setMax.measureHorizontal);
                    if (textView5 != null) {
                        length(textView5, shopOpenHourModel.setMin());
                    }
                    TextView textView6 = (TextView) view.findViewById(resetInternal.setMax.setTabSelected);
                    if (textView6 != null) {
                        length(textView6, shopOpenHourModel.setMin());
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMax(@NotNull ViewGroup viewGroup) {
                super(viewGroup.getContext(), R.layout.item_open_hour_detail, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
            }

            private static void length(TextView textView, boolean z) {
                Typeface typeface;
                int i;
                if (z) {
                    typeface = OptIn.length(textView.getContext(), R.font.f33542131296264);
                } else {
                    typeface = OptIn.length(textView.getContext(), R.font.f33562131296266);
                }
                textView.setTypeface(typeface);
                if (z) {
                    i = IntRange.setMax(textView.getContext(), R.color.f23432131100267);
                } else {
                    i = IntRange.setMax(textView.getContext(), R.color.f23952131100331);
                }
                textView.setTextColor(i);
            }
        }
    }

    public /* synthetic */ SimpleListAdapter() {
        this(1, (List<? extends PromoInfoModel>) null, (List<OptionMenuRecyclerAdapter.OptionMenuViewHolder>) null, (ShopModel) null);
    }

    public final boolean getMin() {
        Collection collection = this.length;
        if (collection == null || collection.isEmpty()) {
            Collection collection2 = this.getMax;
            return !(collection2 == null || collection2.isEmpty());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/nearbyrevamp/model/MerchantPromoDealsViewHolderModel$Companion;", "", "()V", "MERCHANT_PROMO_DEALS_ITEM", "", "MERCHANT_PROMO_DEALS_SHIMMER", "createItem", "Lid/dana/nearbyrevamp/model/MerchantPromoDealsViewHolderModel;", "promoInfoModels", "", "Lid/dana/nearbyme/model/PromoInfoModel;", "dealsInfoModels", "Lid/dana/nearbyme/merchantdetail/model/MerchantProductInfoModel;", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "createShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public final int hashCode() {
        int hashCode = Integer.valueOf(this.setMin).hashCode() * 31;
        List<PromoInfoModel> list = this.length;
        int i = 0;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        List<OptionMenuRecyclerAdapter.OptionMenuViewHolder> list2 = this.getMax;
        int hashCode3 = (hashCode2 + (list2 != null ? list2.hashCode() : 0)) * 31;
        ShopModel shopModel = this.setMax;
        if (shopModel != null) {
            i = shopModel.hashCode();
        }
        return hashCode3 + i;
    }
}
