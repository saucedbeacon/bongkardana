package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.sendmoney.bank.all.CollapsibleSavedBankViewHolder;
import id.dana.sendmoney.contact.all.ContactViewHolder;
import id.dana.sendmoney.contact.all.NoRecentBankViewHolder;
import id.dana.sendmoney.contact.all.SendWithPhoneNumberViewHolder;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney.recipient.SectionViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.IMultiInstanceInvalidationCallback;
import o.PathUtils;
import o.changeMenuMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010(\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0006\u0010+\u001a\u00020)J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0016J\u0010\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0002J\u0010\u00104\u001a\u00020)2\u0006\u0010&\u001a\u00020'H\u0016J\u001e\u00105\u001a\u00020)2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u00102\u001a\u000201H\u0016J\u001e\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010.\u001a\u00020/2\u0006\u00107\u001a\u000201H\u0016J\u0012\u00108\u001a\u00020\u0010*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002R0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lid/dana/sendmoney_v2/recipient/adapter/RecipientAdapter;", "Lid/dana/base/BasePagedListAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney/model/RecipientViewModel;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "value", "", "", "danaContacts", "getDanaContacts", "()Ljava/util/List;", "setDanaContacts", "(Ljava/util/List;)V", "enableInvite", "", "getEnableInvite", "()Z", "setEnableInvite", "(Z)V", "filter", "getFilter", "()Ljava/lang/String;", "setFilter", "(Ljava/lang/String;)V", "recipientMoreActionListener", "Lid/dana/sendmoney_v2/recipient/view/RecipientMoreActionListener;", "getRecipientMoreActionListener", "()Lid/dana/sendmoney_v2/recipient/view/RecipientMoreActionListener;", "setRecipientMoreActionListener", "(Lid/dana/sendmoney_v2/recipient/view/RecipientMoreActionListener;)V", "recipientSelectedListener", "Lid/dana/sendmoney/view/RecipientSelectedListener;", "getRecipientSelectedListener", "()Lid/dana/sendmoney/view/RecipientSelectedListener;", "setRecipientSelectedListener", "(Lid/dana/sendmoney/view/RecipientSelectedListener;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "adjustViewHeight", "", "viewHolder", "clearDanaContact", "getContactViewHolder", "Lid/dana/sendmoney/contact/all/ContactViewHolder;", "parent", "Landroid/view/ViewGroup;", "getItemViewType", "", "position", "isLastItem", "onAttachedToRecyclerView", "onBindViewHolder", "onCreateViewHolder", "viewType", "isEmptyState", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class springBack extends IMultiInstanceInvalidationCallback.Stub.Proxy<Ignore<RecipientViewModel>, RecipientViewModel> {
    private RecyclerView IsOverlapping;
    public boolean equals;
    @NotNull
    public List<String> getMax = CollectionsKt.emptyList();
    @Nullable
    public setOriginText getMin;
    @Nullable
    public String isInside;
    @Nullable
    public PhotoItem length;

    public static final /* synthetic */ RecyclerView getMin(springBack springback) {
        RecyclerView recyclerView = springback.IsOverlapping;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
        }
        return recyclerView;
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        onBindViewHolder((Ignore) valueof, i);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        ContactViewHolder contactViewHolder;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        switch (i) {
            case 1:
            case 7:
            case 10:
            case 20:
            case 21:
            case 22:
            case 23:
                ignore = new SectionViewHolder(viewGroup);
                break;
            case 2:
                ignore = new setFinalY(viewGroup, this.length, this.getMin);
                break;
            case 3:
                if (this.equals) {
                    contactViewHolder = new PathUtils.AnonymousClass1(viewGroup, this.length, this.getMax);
                } else {
                    contactViewHolder = new PathUtils(viewGroup, this.length, this.getMax);
                }
                ignore = contactViewHolder;
                break;
            case 4:
            case 5:
            case 17:
            case 19:
                ignore = new abortAnimation(viewGroup);
                break;
            case 8:
                ignore = new DiskFormatter(viewGroup, this.length);
                break;
            case 9:
                ignore = new BaseReq(viewGroup);
                break;
            case 11:
                ignore = new SendWithPhoneNumberViewHolder(viewGroup, "send_money");
                break;
            case 12:
                ignore = new isOverScrolled(viewGroup, this.length);
                break;
            case 13:
            case 14:
                ignore = new CollapsibleSavedBankViewHolder(viewGroup);
                break;
            case 18:
                ignore = new setFinalX(viewGroup);
                break;
            case 24:
                ignore = new notifyVerticalEdgeReached(viewGroup, this.length);
                break;
            default:
                ignore = new abortAnimation(viewGroup);
                break;
        }
        return ignore;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public springBack(@NotNull changeMenuMode.setMin<RecipientViewModel> setmin) {
        super(setmin);
        Intrinsics.checkNotNullParameter(setmin, "diffCallback");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", "view", "Landroid/view/View;", "left", "", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {1, 4, 2}, xi = 48)
    public static final class setMax implements View.OnLayoutChangeListener {
        final /* synthetic */ springBack getMax;

        public setMax(springBack springback) {
            this.getMax = springback;
        }

        public final void onLayoutChange(@NotNull View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnLayoutChangeListener(this);
            int height = springBack.getMin(this.getMax).getHeight() - view.getBottom();
            if (height > 0) {
                view.getLayoutParams().height = view.getHeight() + height;
                view.requestLayout();
                return;
            }
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
    }

    public final void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.IsOverlapping = recyclerView;
    }

    public final void setMin(@NotNull Ignore<RecipientViewModel> ignore, int i) {
        Intrinsics.checkNotNullParameter(ignore, "viewHolder");
        super.onBindViewHolder(ignore, i);
        if (setMin(i) && length(ignore)) {
            View view = ignore.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "viewHolder.itemView");
            if (!ViewCompat.asInterface(view) || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new setMax(this));
                return;
            }
            RecyclerView recyclerView = this.IsOverlapping;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("recyclerView");
            }
            int height = recyclerView.getHeight() - view.getBottom();
            if (height > 0) {
                view.getLayoutParams().height = view.getHeight() + height;
                view.requestLayout();
                return;
            }
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
    }

    private static boolean length(Ignore<RecipientViewModel> ignore) {
        return (ignore instanceof abortAnimation) || (ignore instanceof NoRecentBankViewHolder) || (ignore instanceof setFinalX) || (ignore instanceof hasHost);
    }

    private final boolean setMin(int i) {
        return getItemCount() - 1 == i;
    }

    public final int getItemViewType(int i) {
        setExclusiveItemChecked<T> setexclusiveitemchecked;
        if (getItemCount() == 0) {
            return 5;
        }
        if (i < 0) {
            i = 0;
        }
        removeItemAt<T> removeitemat = this.setMin;
        if (removeitemat.IsOverlapping != null) {
            setexclusiveitemchecked = removeitemat.IsOverlapping;
        } else {
            setexclusiveitemchecked = removeitemat.toFloatRange;
        }
        RecipientViewModel recipientViewModel = (RecipientViewModel) setexclusiveitemchecked.get(i);
        if (recipientViewModel != null) {
            return recipientViewModel.values;
        }
        return 5;
    }
}
