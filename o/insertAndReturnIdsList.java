package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.sendmoney.model.BankModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002¨\u0006\u0010"}, d2 = {"Lid/dana/bank/viewholder/BankListViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney/model/BankModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "loadBankData", "Landroid/widget/ImageView;", "imageUrl", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class insertAndReturnIdsList extends Ignore<BankModel> {
    public final /* synthetic */ void setMax(Object obj) {
        BankModel bankModel = (BankModel) obj;
        if (bankModel != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            TextView textView = (TextView) view.findViewById(resetInternal.setMax.getSwitchPadding);
            if (textView != null) {
                textView.setText(bankModel.toIntRange);
            }
            View view2 = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "itemView");
            ImageView imageView = (ImageView) view2.findViewById(resetInternal.setMax.onNightModeChanged);
            if (imageView != null) {
                ((updateCornerMarking) Glide.getMax(imageView.getContext())).setMax(bankModel.getMax()).setMax((int) R.drawable.ic_bank_placeholder).setMin((int) R.drawable.ic_bank_placeholder).onRelationshipValidationResult().length(imageView);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public insertAndReturnIdsList(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_all_bank_list, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ Ignore.setMin getMin;
        final /* synthetic */ insertAndReturnIdsList setMin;

        getMin(insertAndReturnIdsList insertandreturnidslist, Ignore.setMin setmin) {
            this.setMin = insertandreturnidslist;
            this.getMin = setmin;
        }

        public final void onClick(View view) {
            Ignore.setMin setmin = this.getMin;
            if (setmin != null) {
                setmin.length(this.setMin.getAdapterPosition());
            }
        }
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        LinearLayout linearLayout = (LinearLayout) view.findViewById(resetInternal.setMax.size);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new getMin(this, setmin));
        }
    }
}
