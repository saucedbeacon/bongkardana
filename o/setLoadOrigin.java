package o;

import id.dana.R;
import id.dana.sendmoney.summary.view.SummaryView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.getInsetDodgeRect;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007J\n\u0010\b\u001a\u00020\u0006*\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/sendmoney/summary/view/SummaryViewShimmerExt;", "", "()V", "skeletonSender", "Lcom/ethanhua/skeleton/SkeletonScreen;", "hideShimmer", "", "Lid/dana/sendmoney/summary/view/SummaryView;", "showShimmer", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setLoadOrigin {
    private static onDetachedFromLayoutParams setMax;
    @NotNull
    public static final setLoadOrigin setMin = new setLoadOrigin();

    private setLoadOrigin() {
    }

    public static void getMax(@NotNull SummaryView summaryView) {
        Intrinsics.checkNotNullParameter(summaryView, "$this$showShimmer");
        onDetachedFromLayoutParams ondetachedfromlayoutparams = setMax;
        if (ondetachedfromlayoutparams == null) {
            getInsetDodgeRect.setMax setmax = new getInsetDodgeRect.setMax(summaryView._$_findCachedViewById(resetInternal.setMax.previous));
            setmax.getMax = R.layout.view_skeleton_sender;
            setmax.setMax = 1500;
            setmax.length = true;
            setmax.setMin = IntRange.setMax(setmax.getMin.getContext(), R.color.f24782131100433);
            setmax.isInside = 20;
            getInsetDodgeRect getinsetdodgerect = new getInsetDodgeRect(setmax, (byte) 0);
            getinsetdodgerect.getMin();
            setMax = getinsetdodgerect;
        } else if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.getMin();
        }
    }

    public static void setMin(@NotNull SummaryView summaryView) {
        Intrinsics.checkNotNullParameter(summaryView, "$this$hideShimmer");
        onDetachedFromLayoutParams ondetachedfromlayoutparams = setMax;
        if (ondetachedfromlayoutparams != null) {
            ondetachedfromlayoutparams.length();
        }
        setMax = null;
    }
}
