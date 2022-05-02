package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.promocenter.model.PromoSectionModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getScrimColor;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u0011\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/promocenter/viewholders/RegularPromoSectionViewHolder;", "Lid/dana/promocenter/viewholders/BasePromoCenterSectionViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "skeletonScreen", "Lcom/ethanhua/skeleton/SkeletonScreen;", "bindData", "", "data", "Lid/dana/promocenter/model/PromoSectionModel;", "handleState", "state", "Lid/dana/promocenter/model/PromoSectionModel$State;", "hideSection", "hideShimmer", "showSection", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverH5 extends onScale {
    private onDetachedFromLayoutParams getMax;

    public final /* synthetic */ void setMax(Object obj) {
        setMax((PromoSectionModel) obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GriverH5(@NotNull ViewGroup viewGroup) {
        super(viewGroup, R.layout.view_regular_promo_section_viewholder);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    public final void getMin(@NotNull PromoSectionModel promoSectionModel) {
        Intrinsics.checkNotNullParameter(promoSectionModel, "data");
        super.setMax(promoSectionModel);
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(resetInternal.setMax.setImageURI);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(promoSectionModel.getMin);
            recyclerView.setAdapter(promoSectionModel.length);
        }
    }

    /* access modifiers changed from: protected */
    public final void setMin(@NotNull PromoSectionModel.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        int i = setResData.setMin[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (this.getMax != null) {
                        onDetachedFromLayoutParams ondetachedfromlayoutparams = this.getMax;
                        if (ondetachedfromlayoutparams == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
                        }
                        ondetachedfromlayoutparams.length();
                    }
                    View view = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view, "itemView");
                    view.setVisibility(0);
                } else if (i == 4) {
                    if (this.getMax != null) {
                        onDetachedFromLayoutParams ondetachedfromlayoutparams2 = this.getMax;
                        if (ondetachedfromlayoutparams2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
                        }
                        ondetachedfromlayoutparams2.length();
                    }
                    View view2 = this.itemView;
                    Intrinsics.checkNotNullExpressionValue(view2, "itemView");
                    view2.setVisibility(8);
                }
            } else if (this.getMax != null) {
                onDetachedFromLayoutParams ondetachedfromlayoutparams3 = this.getMax;
                if (ondetachedfromlayoutparams3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
                }
                ondetachedfromlayoutparams3.length();
            }
        } else if (this.getMax != null) {
            onDetachedFromLayoutParams ondetachedfromlayoutparams4 = this.getMax;
            if (ondetachedfromlayoutparams4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("skeletonScreen");
            }
            ondetachedfromlayoutparams4.getMin();
        } else {
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            getScrimColor.getMax getmax = new getScrimColor.getMax((RecyclerView) view3.findViewById(resetInternal.setMax.setImageURI));
            getmax.getMax = R.layout.view_regular_promo_skeleton;
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            RecyclerView recyclerView = (RecyclerView) view4.findViewById(resetInternal.setMax.setImageURI);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "itemView.rv_regular_promo");
            getmax.length = recyclerView.getAdapter();
            getmax.IsOverlapping = 1500;
            getmax.setMin = 4;
            getmax.getMin = true;
            getmax.toFloatRange = IntRange.setMax(getmax.setMax.getContext(), R.color.f24782131100433);
            getmax.toIntRange = 0;
            getScrimColor getscrimcolor = new getScrimColor(getmax, (byte) 0);
            getscrimcolor.getMin();
            Intrinsics.checkNotNullExpressionValue(getscrimcolor, "Skeleton.bind(itemView.r…)\n                .show()");
            this.getMax = getscrimcolor;
        }
    }
}
