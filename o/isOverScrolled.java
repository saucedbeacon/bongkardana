package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import id.dana.R;
import id.dana.sendmoney.model.RecipientViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/sendmoney_v2/recipient/bank/viewholder/SendWithNewAccountNumberViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney/model/RecipientViewModel;", "parent", "Landroid/view/ViewGroup;", "recipientSelectedListener", "Lid/dana/sendmoney/view/RecipientSelectedListener;", "(Landroid/view/ViewGroup;Lid/dana/sendmoney/view/RecipientSelectedListener;)V", "getParent", "()Landroid/view/ViewGroup;", "getRecipientSelectedListener", "()Lid/dana/sendmoney/view/RecipientSelectedListener;", "recipientViewModel", "addNewAccountNumberRecipient", "", "bindData", "data", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class isOverScrolled extends Ignore<RecipientViewModel> {
    private RecipientViewModel getMax;
    @Nullable
    private final PhotoItem getMin;
    @NotNull
    private final ViewGroup setMax;

    public final /* synthetic */ void setMax(Object obj) {
        RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
        Intrinsics.checkNotNullParameter(recipientViewModel, "data");
        this.getMax = recipientViewModel;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.ensureImeVisible);
        if (textView != null) {
            textView.setText(recipientViewModel.isInside);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isOverScrolled(@NotNull ViewGroup viewGroup, @Nullable PhotoItem photoItem) {
        super(viewGroup.getContext(), R.layout.item_send_new_account_number, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.setMax = viewGroup;
        this.getMin = photoItem;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ isOverScrolled length;

        getMin(isOverScrolled isoverscrolled) {
            this.length = isoverscrolled;
        }

        public final void onClick(View view) {
            isOverScrolled.getMin(this.length);
        }
    }

    public final void setMin(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onItemClickListener");
        this.itemView.setOnClickListener(new getMin(this));
    }

    public static final /* synthetic */ void getMin(isOverScrolled isoverscrolled) {
        PhotoItem photoItem = isoverscrolled.getMin;
        if (photoItem != null) {
            photoItem.getMax();
        }
    }
}
