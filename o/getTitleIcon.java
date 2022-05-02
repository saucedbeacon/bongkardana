package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lid/dana/sendmoney_v2/landing/adapter/RecentTransactionAdapter;", "Lid/dana/sendmoney_v2/landing/adapter/ExpandableAdapter;", "Lid/dana/base/BaseRecyclerViewHolder;", "Lid/dana/sendmoney/model/RecentRecipientModel;", "spanSize", "", "showMoreItem", "", "(IZ)V", "recipientHoldClickActionListener", "Lid/dana/sendmoney_v2/landing/view/RecipientHoldClickActionListener;", "getRecipientHoldClickActionListener", "()Lid/dana/sendmoney_v2/landing/view/RecipientHoldClickActionListener;", "setRecipientHoldClickActionListener", "(Lid/dana/sendmoney_v2/landing/view/RecipientHoldClickActionListener;)V", "getItemViewType", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTitleIcon extends isIndexValidInList<Ignore<increaseCount>, increaseCount> {
    @Nullable
    public notifyScanner setMax;

    public /* synthetic */ getTitleIcon() {
        this((byte) 0);
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Ignore ignore;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        switch (i) {
            case -1:
            case 1:
                ignore = new dp2px(viewGroup);
                break;
            case 0:
                ignore = new safeSetProgress(viewGroup);
                break;
            case 2:
                ignore = new isQVersion(viewGroup, this.setMax);
                break;
            case 3:
                ignore = new setProgressBackground(viewGroup);
                break;
            case 4:
                ignore = new reorderSize(viewGroup, this.setMax);
                break;
            case 5:
                ignore = new isQCompact(viewGroup);
                break;
            default:
                ignore = new CircleProgressBar(viewGroup);
                break;
        }
        return ignore;
    }

    private getTitleIcon(byte b) {
        super(2, 4);
    }

    public final int getItemViewType(int i) {
        increaseCount increasecount;
        if (IsOverlapping()) {
            return -1;
        }
        if (!getMin(i) && (increasecount = (increaseCount) setMin(i)) != null) {
            return increasecount.values;
        }
        return -2;
    }
}
