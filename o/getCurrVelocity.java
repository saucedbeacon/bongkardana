package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.model.PayMethodModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lid/dana/sendmoney_v2/paymethod/viewholder/DebitCardViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/PayMethodModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "enabled", "", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "bindData", "", "data", "configureView", "radioButtonClick", "setDisableViewHolder", "setImageLogo", "url", "", "placeholder", "", "setOnItemClickListener", "setRbSelectedCard", "selected", "setTvTitle", "textTitle", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getCurrVelocity extends Ignore<PayMethodModel> {
    private Ignore.setMin getMax;
    private boolean setMax;

    public final /* synthetic */ void setMax(Object obj) {
        PayMethodModel payMethodModel = (PayMethodModel) obj;
        if (payMethodModel != null) {
            boolean min = payMethodModel.getMin();
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            RadioButton radioButton = (RadioButton) view.findViewById(resetInternal.setMax.getActionBarHideOffset);
            Intrinsics.checkNotNullExpressionValue(radioButton, "itemView.rb_selected_card");
            radioButton.setChecked(min);
            int isInside = payMethodModel.isInside();
            int max = dispatchOnCancelled.setMax(0);
            if (max != 0) {
                onCanceled oncanceled = new onCanceled(0, max, 1);
                onCancelLoad.setMax(47601731, oncanceled);
                onCancelLoad.getMin(47601731, oncanceled);
            }
            updateMessageMenuItem<Drawable> min2 = ((updateCornerMarking) Glide.getMax(this.length)).setMax("").setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax(isInside).setMin(isInside);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            min2.length((ImageView) view2.findViewById(resetInternal.setMax.getState));
            String max2 = payMethodModel.getMax(this.length);
            Intrinsics.checkNotNullExpressionValue(max2, "data.getPayMethodTitle(context)");
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView = (TextView) view3.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_title");
            textView.setText(max2);
            this.setMax = payMethodModel.setMax();
            boolean max3 = payMethodModel.setMax();
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            RadioButton radioButton2 = (RadioButton) view4.findViewById(resetInternal.setMax.getActionBarHideOffset);
            Intrinsics.checkNotNullExpressionValue(radioButton2, "itemView.rb_selected_card");
            radioButton2.setEnabled(max3);
            if (!max3) {
                getSeletedIndex getseletedindex = getSeletedIndex.getMin;
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                ImageView imageView = (ImageView) view5.findViewById(resetInternal.setMax.getState);
                Intrinsics.checkNotNullExpressionValue(imageView, "itemView.iv_logo");
                getSeletedIndex.length(imageView);
            }
            View view6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
            ((RadioButton) view6.findViewById(resetInternal.setMax.getActionBarHideOffset)).setOnClickListener(new length(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getCurrVelocity(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_paymethod_debit_card_v2, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
        if (this.setMax) {
            super.setMin(setmin);
            this.getMax = setmin;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ getCurrVelocity getMax;

        length(getCurrVelocity getcurrvelocity) {
            this.getMax = getcurrvelocity;
        }

        public final void onClick(View view) {
            getCurrVelocity.setMin(this.getMax);
        }
    }

    public static final /* synthetic */ void setMin(getCurrVelocity getcurrvelocity) {
        Ignore.setMin setmin = getcurrvelocity.getMax;
        if (setmin != null) {
            setmin.length(getcurrvelocity.getAdapterPosition());
        }
    }
}
