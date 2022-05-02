package o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import id.dana.R;
import id.dana.richview.EmptyStateView;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney_v2.recipient.model.EmptyStateViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lid/dana/sendmoney_v2/recipient/bank/viewholder/EmptyStateViewHolder;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney/model/RecipientViewModel;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "bindData", "", "data", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class abortAnimation extends Ignore<RecipientViewModel> {
    public final /* synthetic */ void setMax(Object obj) {
        String str;
        RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
        String str2 = null;
        if (!(recipientViewModel instanceof EmptyStateViewModel)) {
            recipientViewModel = null;
        }
        EmptyStateViewModel emptyStateViewModel = (EmptyStateViewModel) recipientViewModel;
        if (emptyStateViewModel != null) {
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            EmptyStateView emptyStateView = (EmptyStateView) view.findViewById(resetInternal.setMax.HalfFloat);
            if (emptyStateView != null) {
                if (!emptyStateView.isViewBinded()) {
                    emptyStateView = null;
                }
                if (emptyStateView != null) {
                    Context context = emptyStateView.getContext();
                    String string = context != null ? context.getString(emptyStateViewModel.invokeSuspend) : null;
                    String str3 = "";
                    if (string == null) {
                        string = str3;
                    }
                    emptyStateView.setTitle(string);
                    Context context2 = emptyStateView.getContext();
                    if (context2 != null) {
                        str = context2.getString(emptyStateViewModel.Mean$Arithmetic);
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = str3;
                    }
                    emptyStateView.setDesc(str);
                    emptyStateView.setIcon(emptyStateViewModel.Grayscale$Algorithm);
                    Context context3 = emptyStateView.getContext();
                    if (context3 != null) {
                        str2 = context3.getString(emptyStateViewModel.valueOf);
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                    emptyStateView.setAction(str3);
                    emptyStateView.setHasAction(emptyStateViewModel.IsOverlapping());
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abortAnimation(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_recipient_contact_no_permission, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class length implements View.OnClickListener {
        final /* synthetic */ abortAnimation getMin;
        final /* synthetic */ Ignore.setMin setMin;

        length(abortAnimation abortanimation, Ignore.setMin setmin) {
            this.getMin = abortanimation;
            this.setMin = setmin;
        }

        public final void onClick(View view) {
            this.setMin.length(this.getMin.getBindingAdapterPosition());
        }
    }

    public final void setMin(@NotNull Ignore.setMin setmin) {
        Intrinsics.checkNotNullParameter(setmin, "onItemClickListener");
        View view = this.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "itemView");
        EmptyStateView emptyStateView = (EmptyStateView) view.findViewById(resetInternal.setMax.HalfFloat);
        if (emptyStateView != null) {
            emptyStateView.setOnActionClickListener(new length(this, setmin));
        }
    }
}
