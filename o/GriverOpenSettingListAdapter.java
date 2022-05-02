package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.analytics.FirebaseAnalytics;
import id.dana.R;
import id.dana.component.buttoncomponent.DanaButtonSecondaryView;
import id.dana.nearbyme.model.ShopModel;
import id.dana.nearbyrevamp.merchantdetail.MerchantDetailView;
import id.dana.nearbyrevamp.view.MerchantBasicInfoView;
import id.dana.nearbyrevamp.view.UserReviewView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.LifeCycle;
import o.OptionMenuRecyclerAdapter;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantQrisInfoAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopModel;", "payClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "(Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;)V", "getItemCount", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MerchantQrisInfoViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverOpenSettingListAdapter extends IMultiInstanceInvalidationCallback.Stub<Ignore<ShopModel>, ShopModel> {
    private final Ignore.setMin getMax;

    public final int getItemCount() {
        return 1;
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new getMax(viewGroup, this.getMax);
    }

    public GriverOpenSettingListAdapter(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "payClickListener");
        this.getMax = setmin;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u001c\u001d\u001e\u001fB\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\n \u0011*\u0004\u0018\u00010\u00030\u0003J\u0006\u0010\u0012\u001a\u00020\u000eJ\u001e\u0010\u0013\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000eH\u0016J\u0006\u0010\u0019\u001a\u00020\u0006J\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantReviewsInfoAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "onLoadMoreClicked", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "addLoadMore", "addLoading", "addLoadingState", "getItemViewType", "", "position", "getLastItem", "kotlin.jvm.PlatformType", "getLastItemPosition", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeLoadMore", "removeLoading", "setShopModel", "MerchantReviewItemViewHolder", "MerchantReviewLoadMoreViewHolder", "MerchantReviewLoadingViewHolder", "MerchantReviewShimmerViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class OnSettingChangeListener extends IMultiInstanceInvalidationCallback.Stub<Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3>, OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> {
        public ShopModel getMax;
        private final Function0<Unit> setMax;

        public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
            onBindViewHolder((Ignore) valueof, i);
        }

        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
            Ignore ignore;
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            if (i == 0) {
                ignore = new getMin(viewGroup);
            } else if (i == 2) {
                ignore = new setMin(viewGroup);
            } else if (i == 3) {
                ignore = new setMax(viewGroup, this.setMax);
            } else if (i != 4) {
                ignore = new getMin(viewGroup);
            } else {
                ignore = new length(viewGroup);
            }
            return ignore;
        }

        public OnSettingChangeListener(@NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "onLoadMoreClicked");
            this.setMax = function0;
            setMin();
        }

        public final void setMin() {
            List arrayList = new ArrayList();
            for (int i = 0; i <= 4; i++) {
                OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.length length2 = OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass1.equals;
                arrayList.add(new OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3(2));
            }
            Unit unit = Unit.INSTANCE;
            getMin(arrayList);
        }

        public final void setMax() {
            Collection max = getMax();
            if (!(max == null || max.isEmpty())) {
                List max2 = getMax();
                Intrinsics.checkNotNullExpressionValue(max2, FirebaseAnalytics.Param.ITEMS);
                if (((OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3) CollectionsKt.last(max2)).setMax == 4) {
                    List max3 = getMax();
                    Intrinsics.checkNotNullExpressionValue(max3, FirebaseAnalytics.Param.ITEMS);
                    getMax(CollectionsKt.getLastIndex(max3));
                }
            }
        }

        public final void getMax(@NotNull Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> ignore, int i) {
            Intrinsics.checkNotNullParameter(ignore, "holder");
            if (ignore instanceof getMin) {
                ((getMin) ignore).setMax = this.getMax;
            }
            super.onBindViewHolder(ignore, i);
        }

        public final int getItemViewType(int i) {
            return ((OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3) getMax().get(i)).setMax;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantReviewsInfoAdapter$MerchantReviewShimmerViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMin extends Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public setMin(@NotNull ViewGroup viewGroup) {
                super(viewGroup.getContext(), R.layout.item_user_review_skeleton, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
            }

            public final /* synthetic */ void setMax(Object obj) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                containsFavoriteMenuItem.getMin(view.findViewById(resetInternal.setMax.MotionLayout), R.layout.view_user_review_skeleton);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantReviewsInfoAdapter$MerchantReviewItemViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "getShopModel", "()Lid/dana/nearbyme/model/ShopModel;", "setShopModel", "(Lid/dana/nearbyme/model/ShopModel;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> {
            @Nullable
            ShopModel setMax;

            public final /* synthetic */ void setMax(Object obj) {
                OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3 r4 = (OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3) obj;
                if (r4 != null && r4.getMax != null) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    UserReviewView userReviewView = (UserReviewView) view.findViewById(resetInternal.setMax.rateWithExtras);
                    if (userReviewView != null) {
                        userReviewView.setShopModel(this.setMax);
                    }
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    UserReviewView userReviewView2 = (UserReviewView) view2.findViewById(resetInternal.setMax.rateWithExtras);
                    if (userReviewView2 != null) {
                        userReviewView2.setData(r4.getMax);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMin(@NotNull ViewGroup viewGroup) {
                super(viewGroup.getContext(), R.layout.item_user_review, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantReviewsInfoAdapter$MerchantReviewLoadMoreViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "parent", "Landroid/view/ViewGroup;", "onLoadMoreClicked", "Lkotlin/Function0;", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "bindData", "item", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax extends Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> {
            /* access modifiers changed from: private */
            public final Function0<Unit> getMin;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public setMax(@NotNull ViewGroup viewGroup, @NotNull Function0<Unit> function0) {
                super(viewGroup.getContext(), R.layout.item_nearby_search_load_more, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                Intrinsics.checkNotNullParameter(function0, "onLoadMoreClicked");
                this.getMin = function0;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            static final class setMin implements View.OnClickListener {
                final /* synthetic */ setMax setMax;

                setMin(setMax setmax) {
                    this.setMax = setmax;
                }

                public final void onClick(View view) {
                    this.setMax.getMin.invoke();
                }
            }

            public final /* synthetic */ void setMax(Object obj) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                Button button = (Button) view.findViewById(resetInternal.setMax.ICustomTabsCallback);
                if (button != null) {
                    button.setOnClickListener(new setMin(this));
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantReviewsInfoAdapter$MerchantReviewLoadingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/merchantdetail/model/MerchantReviewViewModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length extends Ignore<OptionMenuRecyclerAdapter.OptionMenuViewHolder.AnonymousClass3> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public length(@NotNull ViewGroup viewGroup) {
                super(viewGroup.getContext(), R.layout.item_nearby_search_result_loading, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003&'(B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u001e\u0010\u001c\u001a\u00020\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001b\u001a\u00020\u0005H\u0016J\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0016J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010#\u001a\u00020$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006)"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantHeaderInfoAdapter;", "Lid/dana/base/BaseRecyclerViewAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel;", "navigationBarHeight", "", "(I)V", "listener", "Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;", "getListener", "()Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;", "setListener", "(Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;)V", "value", "", "shouldDisplayOpenHourRedirect", "getShouldDisplayOpenHourRedirect", "()Z", "setShouldDisplayOpenHourRedirect", "(Z)V", "shouldDisplaySeeMore", "getShouldDisplaySeeMore", "setShouldDisplaySeeMore", "addInitialState", "", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setMerchantHeaderInfoData", "shopModel", "Lid/dana/nearbyme/model/ShopModel;", "updateShopModel", "MerchantDetailBasicInfoShimmer", "MerchantDetailBasicInfoViewHolder", "MerchantDetailSeeMoreViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class OpenSettingViewHolder extends IMultiInstanceInvalidationCallback.Stub<Ignore<LifeCycle>, LifeCycle> {
        public boolean getMax = true;
        public boolean getMin = true;
        @Nullable
        public MerchantDetailView.setMin length;
        private final int setMin;

        public final int getItemCount() {
            return 2;
        }

        public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
            onBindViewHolder((Ignore) valueof, i);
        }

        public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
            Ignore ignore;
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            if (i == 1) {
                ignore = new getMin(viewGroup);
            } else if (i != 3) {
                ignore = new setMax(viewGroup);
            } else {
                ignore = new length(viewGroup, this.setMin);
            }
            return ignore;
        }

        public OpenSettingViewHolder(int i) {
            this.setMin = i;
            LifeCycle.setMax setmax = LifeCycle.length;
            LifeCycle.setMax setmax2 = LifeCycle.length;
            getMin(CollectionsKt.mutableListOf(new LifeCycle(1, (ShopModel) null, 6), new LifeCycle(3, (ShopModel) null, 6)));
        }

        public final int getItemViewType(int i) {
            return ((LifeCycle) getMax().get(i)).getMax;
        }

        public final void getMax(@NotNull Ignore<LifeCycle> ignore, int i) {
            Intrinsics.checkNotNullParameter(ignore, "holder");
            if (ignore instanceof length) {
                length length2 = (length) ignore;
                length2.setMax = this.getMin;
                length2.getMax = this.length;
            } else if (ignore instanceof setMax) {
                ((setMax) ignore).getMin = this.getMax;
            }
            super.onBindViewHolder(ignore, i);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantHeaderInfoAdapter$MerchantDetailBasicInfoViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "shouldDisplayOpenHourRedirect", "", "getShouldDisplayOpenHourRedirect", "()Z", "setShouldDisplayOpenHourRedirect", "(Z)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class setMax extends Ignore<LifeCycle> {
            boolean getMin;

            public final /* synthetic */ void setMax(Object obj) {
                ShopModel shopModel;
                MerchantBasicInfoView.InfoType infoType;
                LifeCycle lifeCycle = (LifeCycle) obj;
                if (lifeCycle != null && (shopModel = lifeCycle.setMin) != null) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    MerchantBasicInfoView merchantBasicInfoView = (MerchantBasicInfoView) view.findViewById(resetInternal.setMax.setRadius);
                    if (merchantBasicInfoView != null) {
                        merchantBasicInfoView.showMerchantInfo(shopModel, true, MerchantBasicInfoView.InfoType.DETAIL);
                    }
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    MerchantBasicInfoView merchantBasicInfoView2 = (MerchantBasicInfoView) view2.findViewById(resetInternal.setMax.setRadius);
                    if (merchantBasicInfoView2 != null) {
                        if (this.getMin) {
                            infoType = MerchantBasicInfoView.InfoType.DETAIL_WITH_OPENHOUR_REDIRECTION;
                        } else {
                            infoType = MerchantBasicInfoView.InfoType.DETAIL;
                        }
                        merchantBasicInfoView2.showAdditionalInfo(infoType);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public setMax(@NotNull ViewGroup viewGroup) {
                super(viewGroup.getContext(), R.layout.item_merchant_detail_header, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantHeaderInfoAdapter$MerchantDetailBasicInfoShimmer;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class getMin extends Ignore<LifeCycle> {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public getMin(@NotNull ViewGroup viewGroup) {
                super(viewGroup.getContext(), R.layout.item_merchant_detail_header_shimmer, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
            }

            public final /* synthetic */ void setMax(Object obj) {
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                containsFavoriteMenuItem.getMin(view.findViewById(resetInternal.setMax.MotionLayout), R.layout.view_merchant_header_info_skeleton);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantHeaderInfoAdapter$MerchantDetailSeeMoreViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyrevamp/model/MerchantDetailInfoModel;", "parent", "Landroid/view/ViewGroup;", "navigationBarHeight", "", "(Landroid/view/ViewGroup;I)V", "listener", "Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;", "getListener", "()Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;", "setListener", "(Lid/dana/nearbyrevamp/merchantdetail/MerchantDetailView$MerchantDetailViewListener;)V", "shouldDisplaySeeMore", "", "getShouldDisplaySeeMore", "()Z", "setShouldDisplaySeeMore", "(Z)V", "bindData", "", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
        public static final class length extends Ignore<LifeCycle> {
            @Nullable
            MerchantDetailView.setMin getMax;
            boolean setMax;
            private final int setMin;

            public final /* synthetic */ void setMax(Object obj) {
                if (((LifeCycle) obj) != null) {
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    DanaButtonSecondaryView danaButtonSecondaryView = (DanaButtonSecondaryView) view.findViewById(resetInternal.setMax.ICustomTabsCallback$Stub$Proxy);
                    int i = 0;
                    if (danaButtonSecondaryView != null) {
                        View view2 = danaButtonSecondaryView;
                        boolean z = this.setMax;
                        Intrinsics.checkNotNullParameter(view2, "<this>");
                        view2.setVisibility(z ? 0 : 8);
                    }
                    View view3 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                    DanaButtonSecondaryView danaButtonSecondaryView2 = (DanaButtonSecondaryView) view3.findViewById(resetInternal.setMax.ICustomTabsCallback$Stub$Proxy);
                    if (danaButtonSecondaryView2 != null) {
                        danaButtonSecondaryView2.setOnClickListener(new setMax(this));
                    }
                    View view4 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                    ConstraintLayout constraintLayout = (ConstraintLayout) view4.findViewById(resetInternal.setMax.playFromSearch);
                    if (constraintLayout != null) {
                        View view5 = constraintLayout;
                        if (this.setMax) {
                            i = this.setMin;
                        }
                        getBluetoothAdapterState.getMax(view5, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(i), 7);
                    }
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public length(@NotNull ViewGroup viewGroup, int i) {
                super(viewGroup.getContext(), R.layout.item_merchant_detail_see_more, viewGroup);
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                this.setMin = i;
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
            static final class setMax implements View.OnClickListener {
                final /* synthetic */ length length;

                setMax(length length2) {
                    this.length = length2;
                }

                public final void onClick(View view) {
                    MerchantDetailView.setMin setmin = this.length.getMax;
                    if (setmin != null) {
                        setmin.getMin();
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lid/dana/nearbyrevamp/merchantdetail/adapter/MerchantQrisInfoAdapter$MerchantQrisInfoViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/nearbyme/model/ShopModel;", "parent", "Landroid/view/ViewGroup;", "payClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "(Landroid/view/ViewGroup;Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;)V", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends Ignore<ShopModel> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public getMax(@NotNull ViewGroup viewGroup, @NotNull final Ignore.setMin setmin) {
            super(viewGroup.getContext(), R.layout.item_merchant_qris_info, viewGroup);
            Intrinsics.checkNotNullParameter(viewGroup, "parent");
            Intrinsics.checkNotNullParameter(setmin, "payClickListener");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            Button button = (Button) view.findViewById(resetInternal.setMax.cancel);
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener(this) {
                    final /* synthetic */ getMax setMin;

                    {
                        this.setMin = r1;
                    }

                    public final void onClick(View view) {
                        setmin.length(this.setMin.getAbsoluteAdapterPosition());
                    }
                });
            }
        }
    }
}
