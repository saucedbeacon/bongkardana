package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import id.dana.R;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.model.RecipientViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/sendmoney_v2/contact/all/SendWithNewNumberViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney/model/RecipientViewModel;", "parent", "Landroid/view/ViewGroup;", "recipientListener", "Lid/dana/sendmoney/view/BaseRecipientListener;", "(Landroid/view/ViewGroup;Lid/dana/sendmoney/view/BaseRecipientListener;)V", "getParent", "()Landroid/view/ViewGroup;", "recipientViewModel", "addNewPhoneNumberRecipient", "", "bindData", "data", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DiskFormatter extends Ignore<RecipientViewModel> {
    @NotNull
    private final ViewGroup getMax;
    private final setPhotoIndex getMin;
    private RecipientViewModel setMax;

    public final /* synthetic */ void setMax(Object obj) {
        RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
        Intrinsics.checkNotNullParameter(recipientViewModel, "data");
        this.setMax = recipientViewModel;
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.measureChildCollapseMargins);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_phone_number");
        textView.setText(recipientViewModel.isInside);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DiskFormatter(@NotNull ViewGroup viewGroup, @Nullable setPhotoIndex setphotoindex) {
        super(viewGroup.getContext(), R.layout.item_send_new_number_v2, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.getMax = viewGroup;
        this.getMin = setphotoindex;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMax implements View.OnClickListener {
        final /* synthetic */ DiskFormatter getMax;

        getMax(DiskFormatter diskFormatter) {
            this.getMax = diskFormatter;
        }

        public final void onClick(View view) {
            DiskFormatter.length(this.getMax);
        }
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
        this.itemView.setOnClickListener(new getMax(this));
    }

    public static final /* synthetic */ void length(DiskFormatter diskFormatter) {
        RecipientModel.length length = new RecipientModel.length("contact");
        length.FastBitmap$CoordinateSystem = "phonenumber";
        View view = diskFormatter.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        TextView textView = (TextView) view.findViewById(resetInternal.setMax.measureChildCollapseMargins);
        Intrinsics.checkNotNullExpressionValue(textView, "itemView.tv_phone_number");
        length.toFloatRange = textView.getText().toString();
        View view2 = diskFormatter.itemView;
        Intrinsics.checkNotNullExpressionValue(view2, "itemView");
        TextView textView2 = (TextView) view2.findViewById(resetInternal.setMax.measureChildCollapseMargins);
        Intrinsics.checkNotNullExpressionValue(textView2, "itemView.tv_phone_number");
        length.toIntRange = textView2.getText().toString();
        length.setMax = RecipientSource.MANUAL_INPUT;
        RecipientModel length2 = length.length();
        setPhotoIndex setphotoindex = diskFormatter.getMin;
        if (setphotoindex != null) {
            setphotoindex.onRecipientSelected(length2);
        }
    }
}
