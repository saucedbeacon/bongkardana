package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import id.dana.R;
import id.dana.model.PayMethodModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lid/dana/sendmoney_v2/paymethod/viewholder/OneKlikViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/PayMethodModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "enabled", "", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "bindData", "", "data", "configureView", "radioButtonClick", "setDisableViewHolder", "setOnItemClickListener", "setRbSelectedCard", "selected", "setTvTitle", "textTitle", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setFriction extends Ignore<PayMethodModel> {
    private Ignore.setMin getMin;
    private boolean setMin;

    public final /* synthetic */ void setMax(Object obj) {
        PayMethodModel payMethodModel = (PayMethodModel) obj;
        if (payMethodModel != null) {
            boolean min = payMethodModel.getMin();
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            RadioButton radioButton = (RadioButton) view.findViewById(resetInternal.setMax.getActionBarHideOffset);
            Intrinsics.checkNotNullExpressionValue(radioButton, "itemView.rb_selected_card");
            radioButton.setChecked(min);
            String max = payMethodModel.getMax(this.length);
            Intrinsics.checkNotNullExpressionValue(max, "data.getPayMethodTitle(context)");
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            TextView textView = (TextView) view2.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_title");
            textView.setText(max);
            this.setMin = payMethodModel.setMax();
            boolean max2 = payMethodModel.setMax();
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            RadioButton radioButton2 = (RadioButton) view3.findViewById(resetInternal.setMax.getActionBarHideOffset);
            Intrinsics.checkNotNullExpressionValue(radioButton2, "itemView.rb_selected_card");
            radioButton2.setEnabled(max2);
            if (!max2) {
                getSeletedIndex getseletedindex = getSeletedIndex.getMin;
                View view4 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view4, "itemView");
                ImageView imageView = (ImageView) view4.findViewById(resetInternal.setMax.onContentChanged);
                Intrinsics.checkNotNullExpressionValue(imageView, "itemView.ivOneclickLogo");
                getSeletedIndex.length(imageView);
                getSeletedIndex getseletedindex2 = getSeletedIndex.getMin;
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                ImageView imageView2 = (ImageView) view5.findViewById(resetInternal.setMax.getState);
                Intrinsics.checkNotNullExpressionValue(imageView2, "itemView.iv_logo");
                getSeletedIndex.length(imageView2);
            }
            View view6 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view6, "itemView");
            ((RadioButton) view6.findViewById(resetInternal.setMax.getActionBarHideOffset)).setOnClickListener(new setMax(this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setFriction(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_paymethod_one_klik_v2, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
        if (this.setMin) {
            super.setMin(setmin);
            this.getMin = setmin;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class setMax implements View.OnClickListener {
        final /* synthetic */ setFriction length;

        setMax(setFriction setfriction) {
            this.length = setfriction;
        }

        public final void onClick(View view) {
            setFriction.setMax(this.length);
        }
    }

    public static final /* synthetic */ void setMax(setFriction setfriction) {
        Ignore.setMin setmin = setfriction.getMin;
        if (setmin != null) {
            setmin.length(setfriction.getAdapterPosition());
        }
    }
}
