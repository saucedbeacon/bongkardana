package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import id.dana.R;
import id.dana.promocenter.model.PromoSectionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ZoomRecyclerView;
import o.getInsetDodgeRect;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0006\u0010\u001a\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\nJ\u001c\u0010\u001c\u001a\u00020\n2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\nH\u0002J\u0006\u0010\"\u001a\u00020\nJ\u0006\u0010#\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lid/dana/promocenter/viewholders/PromoSpecialAdsSectionViewHolder;", "Lid/dana/promocenter/viewholders/BasePromoCenterSectionViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "promoSpecialAdsAdsAdapter", "Lid/dana/promocenter/adapter/PromoSpecialAdsAdapter;", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "bindData", "", "data", "Lid/dana/promocenter/model/PromoSectionModel;", "computeFadingScaleBasedOnItemWidth", "", "dx", "", "controlMaximumAndMinimumViewTransparency", "viewGroup", "alpha", "fadeViewHolder", "getPromoMerchantSpecialOnScrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "handleState", "state", "Lid/dana/promocenter/model/PromoSectionModel$State;", "hideSection", "hideShimmer", "setupRecyclerView", "recyclerViewAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "recyclerViewLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "setupRecyclerViewLeftPaddingOnPlaceholderCreated", "showSection", "showShimmer", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getResData extends onScale {
    @NotNull
    public static final getMax setMax = new getMax((byte) 0);
    private ZoomRecyclerView.AnonymousClass2 getMin;
    private onDetachedFromLayoutParams setMin;

    public final /* synthetic */ void setMax(Object obj) {
        setMax((PromoSectionModel) obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getResData(@NotNull ViewGroup viewGroup) {
        super(viewGroup, R.layout.view_promo_special_ads_section_viewholder);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    public final void getMin(@NotNull PromoSectionModel promoSectionModel) {
        Intrinsics.checkNotNullParameter(promoSectionModel, "data");
        super.setMax(promoSectionModel);
        RecyclerView.Adapter adapter = promoSectionModel.length;
        RecyclerView.IsOverlapping isOverlapping = promoSectionModel.getMin;
        if (adapter != null) {
            this.getMin = (ZoomRecyclerView.AnonymousClass2) adapter;
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            RecyclerView recyclerView = (RecyclerView) view.findViewById(resetInternal.setMax.setImageResource);
            if (recyclerView != null) {
                recyclerView.setLayoutManager(isOverlapping);
                ZoomRecyclerView.AnonymousClass2 r6 = this.getMin;
                if (r6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("promoSpecialAdsAdsAdapter");
                }
                recyclerView.setAdapter(r6);
                if (recyclerView.getItemDecorationCount() <= 0) {
                    recyclerView.addItemDecoration(new setShadowResourceRight(recyclerView.getContext(), (int) R.dimen.f26222131165268, 8388613));
                }
                recyclerView.addOnScrollListener(new getMin(this));
            }
            Context context = this.length;
            Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
            int dimension = (int) (context.getResources().getDimension(R.dimen.f32122131165954) + getTargetFragment.setMax(16.0f));
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            RecyclerView recyclerView2 = (RecyclerView) view2.findViewById(resetInternal.setMax.setImageResource);
            if (recyclerView2 != null) {
                recyclerView2.setPadding(dimension, 0, 0, 0);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.promocenter.adapter.PromoSpecialAdsAdapter");
    }

    /* access modifiers changed from: protected */
    public final void setMin(@NotNull PromoSectionModel.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = Response.setMin[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (this.setMin != null) {
                        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.setMin;
                        if (ondetachedfromlayoutparams == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
                        }
                        ondetachedfromlayoutparams.length();
                    }
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.getDefaultViewModelProviderFactory);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "itemView.cl_promo_special_ads");
                    constraintLayout.setVisibility(0);
                } else if (i == 4) {
                    if (this.setMin != null) {
                        onDetachedFromLayoutParams ondetachedfromlayoutparams2 = this.setMin;
                        if (ondetachedfromlayoutparams2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
                        }
                        ondetachedfromlayoutparams2.length();
                    }
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(resetInternal.setMax.getDefaultViewModelProviderFactory);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout2, "itemView.cl_promo_special_ads");
                    constraintLayout2.setVisibility(8);
                }
            } else if (this.setMin != null) {
                onDetachedFromLayoutParams ondetachedfromlayoutparams3 = this.setMin;
                if (ondetachedfromlayoutparams3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
                }
                ondetachedfromlayoutparams3.length();
            }
        } else if (this.setMin != null) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams4 = this.setMin;
            if (ondetachedfromlayoutparams4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
            }
            ondetachedfromlayoutparams4.getMin();
        } else {
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax((ConstraintLayout) view3.findViewById(resetInternal.setMax.getDefaultViewModelProviderFactory));
            setmax.getMax = R.layout.view_promo_special_ads_section_viewholder_skeleton;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 0;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            Intrinsics.checkNotNullExpressionValue(getinsetdodgerect, "Skeleton.bind(itemView.c…)\n                .show()");
            this.setMin = getinsetdodgerect;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/promocenter/viewholders/PromoSpecialAdsSectionViewHolder$getPromoMerchantSpecialOnScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "handleFadingIfFirstItemIsBetweenPlaceHolder", "", "dx", "", "onScrolled", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dy", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends RecyclerView.toIntRange {
        final /* synthetic */ getResData setMin;

        getMin(getResData getresdata) {
            this.setMin = getresdata;
        }

        public final void onScrolled(@NotNull RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            View view = this.setMin.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.ResultReceiver);
            if (constraintLayout != null) {
                float x = constraintLayout.getX();
                float x2 = constraintLayout.getX() + ((float) constraintLayout.getWidth());
                View view2 = this.setMin.itemView;
                Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                View childAt = ((RecyclerView) view2.findViewById(resetInternal.setMax.setImageResource)).getChildAt(0);
                Intrinsics.checkNotNullExpressionValue(childAt, "itemView.rv_promo_merchant_special.getChildAt(0)");
                if (childAt.getX() > x) {
                    View view3 = this.setMin.itemView;
                    Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                    View childAt2 = ((RecyclerView) view3.findViewById(resetInternal.setMax.setImageResource)).getChildAt(0);
                    Intrinsics.checkNotNullExpressionValue(childAt2, "itemView.rv_promo_merchant_special.getChildAt(0)");
                    if (childAt2.getX() < x2) {
                        getResData.getMin(this.setMin, i);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lid/dana/promocenter/viewholders/PromoSpecialAdsSectionViewHolder$Companion;", "", "()V", "MAXIMUM_TRANSPARENCY_VALUE", "", "MINIMUM_TRANSPARENCY_VALUE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax {
        private getMax() {
        }

        public /* synthetic */ getMax(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void getMin(getResData getresdata, int i) {
        ZoomRecyclerView.AnonymousClass2 r0 = getresdata.getMin;
        if (r0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("promoSpecialAdsAdsAdapter");
        }
        if (r0.getItemCount() > 0) {
            View view = getresdata.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            View childAt = ((RecyclerView) view.findViewById(resetInternal.setMax.setImageResource)).getChildAt(0);
            Intrinsics.checkNotNullExpressionValue(childAt, "itemView.rv_promo_merchant_special.getChildAt(0)");
            float width = ((float) i) * (1.0f / ((float) childAt.getWidth()));
            View view2 = getresdata.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(resetInternal.setMax.ResultReceiver);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "it");
            float alpha = constraintLayout.getAlpha() - width;
            ViewGroup viewGroup = constraintLayout;
            if (alpha <= 0.2f) {
                viewGroup.setAlpha(0.2f);
            } else if (alpha > 1.0f) {
                viewGroup.setAlpha(1.0f);
            } else {
                viewGroup.setAlpha(alpha);
            }
        }
    }
}
