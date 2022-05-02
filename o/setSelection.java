package o;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.data.account.repository.AccountEntityRepository;
import id.dana.domain.payasset.model.Institution;
import id.dana.model.PayMethodModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lid/dana/sendmoney_v2/paymethod/viewholder/AddCardViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/model/PayMethodModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "bindData", "", "data", "setCellIcon", "icon", "", "payMethodModel", "setImageLogo", "placeholder", "setOnItemClickListener", "setRbSelectedCard", "selected", "", "setTvTitle", "textTitle", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class setSelection extends Ignore<PayMethodModel> {
    /* access modifiers changed from: private */
    public Ignore.setMin setMin;

    public final class core implements RedDotDrawable {
        private final AccountEntityRepository length;

        public core(AccountEntityRepository accountEntityRepository) {
            this.length = accountEntityRepository;
        }

        public final Object apply(Object obj) {
            return this.length.lambda$saveAvatarUrl$6((String) obj);
        }
    }

    public final /* synthetic */ void setMax(Object obj) {
        PayMethodModel payMethodModel = (PayMethodModel) obj;
        if (payMethodModel != null) {
            boolean min = payMethodModel.getMin();
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            RadioButton radioButton = (RadioButton) view.findViewById(resetInternal.setMax.getActionBarHideOffset);
            Intrinsics.checkNotNullExpressionValue(radioButton, "itemView.rb_selected_card");
            radioButton.setChecked(min);
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ((RadioButton) view2.findViewById(resetInternal.setMax.getActionBarHideOffset)).setOnClickListener(new getMax(this));
            String max = payMethodModel.setMax(this.length);
            Intrinsics.checkNotNullExpressionValue(max, "it.getAccountNameV2(context)");
            View view3 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view3, "itemView");
            TextView textView = (TextView) view3.findViewById(resetInternal.setMax.CustomTabsIntent$ShareState);
            Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_title");
            textView.setText(max);
            int max2 = payMethodModel.getMax();
            updateMessageMenuItem<Drawable> min2 = ((updateCornerMarking) Glide.getMax(this.length)).setMax("").setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax(max2).setMin(max2);
            View view4 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view4, "itemView");
            ImageView imageView = (ImageView) view4.findViewById(resetInternal.setMax.getState);
            Intrinsics.checkNotNull(imageView);
            min2.length(imageView);
            int i = (payMethodModel.IsOverlapping != null || payMethodModel.toFloatRange()) ? 0 : R.drawable.ic_card_type;
            if (payMethodModel.toIntRange() || payMethodModel.toFloatRange()) {
                View view5 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view5, "itemView");
                ImageView imageView2 = (ImageView) view5.findViewById(resetInternal.setMax.createButton);
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                View view6 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view6, "itemView");
                ImageView imageView3 = (ImageView) view6.findViewById(resetInternal.setMax.getThemeResId);
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
            } else {
                View view7 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view7, "itemView");
                ImageView imageView4 = (ImageView) view7.findViewById(resetInternal.setMax.createButton);
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                }
                View view8 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view8, "itemView");
                ImageView imageView5 = (ImageView) view8.findViewById(resetInternal.setMax.getThemeResId);
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                }
            }
            if (Intrinsics.areEqual((Object) Institution.BCA_ONEKLIK, (Object) payMethodModel.IsOverlapping)) {
                updateMessageMenuItem<Drawable> max3 = ((updateCornerMarking) Glide.getMax(this.length)).setMax("").setMax(evaluate.setMin).setMax((int) R.drawable.ic_oneklik_v2);
                View view9 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view9, "itemView");
                max3.length((ImageView) view9.findViewById(resetInternal.setMax.createButton));
            } else if (payMethodModel.toFloatRange()) {
                updateMessageMenuItem<Drawable> max4 = ((updateCornerMarking) Glide.getMax(this.length)).setMax("").setMax(evaluate.setMin).setMax((int) R.drawable.ic_express_pay_v2);
                View view10 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view10, "itemView");
                max4.length((ImageView) view10.findViewById(resetInternal.setMax.createButton));
            } else if (i != 0) {
                updateMessageMenuItem<Drawable> max5 = ((updateCornerMarking) Glide.getMax(this.length)).setMax("").setMax(evaluate.setMin).setMax(i);
                View view11 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view11, "itemView");
                max5.length((ImageView) view11.findViewById(resetInternal.setMax.getThemeResId));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setSelection(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_paymethod_add_card_v2, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ setSelection setMin;

        getMax(setSelection setselection) {
            this.setMin = setselection;
        }

        public final void onClick(View view) {
            Ignore.setMin min = this.setMin.setMin;
            if (min != null) {
                min.length(this.setMin.getBindingAdapterPosition());
            }
        }
    }

    public final void setMin(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onItemClickListener");
        super.setMin(setmin);
        this.setMin = setmin;
    }
}
