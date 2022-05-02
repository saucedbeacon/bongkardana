package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\f"}, d2 = {"Lid/dana/paymentsetting/viewholder/PaymentSettingViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/paymentsetting/model/PaymentSettingOnboardingModel;", "parent", "Landroid/view/ViewGroup;", "onNextPage", "Lkotlin/Function1;", "", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)V", "bindData", "data", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PdfSourceManager extends Ignore<getOrCreate> {
    public final /* synthetic */ void setMax(Object obj) {
        getOrCreate getorcreate = (getOrCreate) obj;
        if (getorcreate != null) {
            View view = this.itemView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setDither);
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(getorcreate.setMax);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            if (appCompatTextView != null) {
                appCompatTextView.setText(getorcreate.getMin);
            }
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(resetInternal.setMax.setSplitTrack);
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(getorcreate.setMin);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PdfSourceManager(@NotNull ViewGroup viewGroup, @NotNull Function1<? super Integer, Unit> function1) {
        super(viewGroup.getContext(), R.layout.item_payment_setting_onboarding, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function1, "onNextPage");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(resetInternal.setMax.setDither);
        if (appCompatImageView != null) {
            appCompatImageView.addOnLayoutChangeListener(new setMax(this, function1));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0000"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release"}, k = 1, mv = {1, 4, 2}, xi = 48)
    public static final class setMax implements View.OnLayoutChangeListener {
        final /* synthetic */ PdfSourceManager length;
        final /* synthetic */ Function1 setMax;

        public setMax(PdfSourceManager pdfSourceManager, Function1 function1) {
            this.length = pdfSourceManager;
            this.setMax = function1;
        }

        public final void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.setMax.invoke(Integer.valueOf(this.length.getAbsoluteAdapterPosition()));
        }
    }
}
