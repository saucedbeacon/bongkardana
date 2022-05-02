package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.sendmoney.model.BankModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0014\u0010\u000f\u001a\u00020\u0007*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¨\u0006\u0013"}, d2 = {"Lid/dana/bank/viewholder/FeaturedBankViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney/model/BankModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setBankBcaViewAccessbility", "bankName", "", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "loadBankLogoImage", "Landroid/widget/ImageView;", "imageUrl", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class childColumns extends Ignore<BankModel> {
    @NotNull
    public static final length setMax = new length((byte) 0);

    public final /* synthetic */ void setMax(Object obj) {
        BankModel bankModel = (BankModel) obj;
        if (bankModel != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.getSwitchPadding);
            if (textView != null) {
                textView.setText(bankModel.setMin);
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ImageView imageView = (ImageView) view2.findViewById(resetInternal.setMax.onNightModeChanged);
            if (imageView != null) {
                ((updateCornerMarking) Glide.getMax(imageView.getContext())).setMax(bankModel.getMax()).setMax((int) R.drawable.ic_bank_placeholder).setMin((int) R.drawable.ic_bank_placeholder).onRelationshipValidationResult().length(imageView);
            }
            if (StringsKt.equals(bankModel.setMin, "bca", true)) {
                View view3 = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view3, "itemView");
                CardView cardView = (CardView) view3.findViewById(resetInternal.setMax.Dimension);
                if (cardView != null) {
                    cardView.setContentDescription(this.length.getString(R.string.btnTopBca));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public childColumns(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_top_bank_list, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ Ignore.setMin getMax;
        final /* synthetic */ childColumns setMin;

        getMin(childColumns childcolumns, Ignore.setMin setmin) {
            this.setMin = childcolumns;
            this.getMax = setmin;
        }

        public final void onClick(View view) {
            Ignore.setMin setmin = this.getMax;
            if (setmin != null) {
                setmin.length(this.setMin.getAbsoluteAdapterPosition());
            }
        }
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(resetInternal.setMax.onRequestPermissionsResult);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new getMin(this, setmin));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/bank/viewholder/FeaturedBankViewHolder$Companion;", "", "()V", "BANK_BCA", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length {
        private length() {
        }

        public /* synthetic */ length(byte b) {
            this();
        }
    }
}
