package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.sendmoney_v2.landing.view.ShowMoreView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IMultiInstanceInvalidationCallback;
import o.Ignore;
import o.resetInternal;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b&\u0018\u0000*\u0010\b\u0000\u0010\u0001*\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0002*\u0004\b\u0001\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010 \u001a\u00020\u0006H\u0016J\b\u0010!\u001a\u00020\tH\u0004J\u0010\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0006H\u0004J\u001d\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00028\u00002\u0006\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\tR\u0014\u0010\u000b\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00068BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R5\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u001a0\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\r¨\u0006("}, d2 = {"Lid/dana/sendmoney_v2/landing/adapter/ExpandableAdapter;", "VH", "Lid/dana/base/BaseRecyclerViewHolder;", "T", "Lid/dana/base/BaseRecyclerViewAdapter;", "nonCollapsibleRowSize", "", "spanSize", "displayShowMore", "", "(IIZ)V", "addShowMore", "getAddShowMore", "()I", "<set-?>", "expanded", "getExpanded", "()Z", "hasMoreItem", "getHasMoreItem", "nonCollapsibleItemSize", "getNonCollapsibleItemSize", "onExpand", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "getOnExpand", "()Lkotlin/jvm/functions/Function1;", "setOnExpand", "(Lkotlin/jvm/functions/Function1;)V", "getSpanSize", "getItemCount", "isEmpty", "isMoreViewType", "position", "onBindViewHolder", "holder", "(Lid/dana/base/BaseRecyclerViewHolder;I)V", "toggleExpanded", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public abstract class isIndexValidInList<VH extends Ignore<T>, T> extends IMultiInstanceInvalidationCallback.Stub<VH, T> {
    @NotNull
    public Function1<? super Boolean, Unit> getMax = setMax.INSTANCE;
    private final int getMin;
    private final int length;
    private boolean setMax;
    private final boolean setMin = false;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\u0003\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "VH", "Lid/dana/base/BaseRecyclerViewHolder;", "T", "it", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function1<Boolean, Unit> {
        public static final setMax INSTANCE = new setMax();

        setMax() {
            super(1);
        }

        public final void invoke(boolean z) {
        }

        public final /* synthetic */ Object invoke(Object obj) {
            invoke(((Boolean) obj).booleanValue());
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        onBindViewHolder((Ignore) valueof, i);
    }

    /* access modifiers changed from: protected */
    public final int equals() {
        return this.getMin;
    }

    public isIndexValidInList(int i, int i2) {
        this.length = i;
        this.getMin = i2;
    }

    public final boolean setMin() {
        return this.setMax;
    }

    public final boolean setMax() {
        return !IsOverlapping() && getMax().size() > this.length * this.getMin;
    }

    public final void getMax(VH vh, int i) {
        super.onBindViewHolder(vh, i);
        if (!(vh instanceof CircleProgressBar)) {
            vh = null;
        }
        CircleProgressBar circleProgressBar = (CircleProgressBar) vh;
        if (circleProgressBar != null) {
            boolean z = this.setMax;
            View view = circleProgressBar.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ShowMoreView showMoreView = (ShowMoreView) view.findViewById(resetInternal.setMax.AppCompatSpinner$SavedState);
            if (showMoreView != null) {
                showMoreView.setExpanded(z);
            }
        }
    }

    public int getItemCount() {
        if (IsOverlapping()) {
            return 1;
        }
        if (getMax().size() <= this.length * this.getMin) {
            return getMax().size();
        }
        int size = getMax().size();
        int i = this.length;
        int i2 = this.getMin;
        if (size <= i * i2 || this.setMax) {
            return getMax().size() + (this.setMin ? 1 : 0);
        }
        return (i * i2) + (this.setMin ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    public final boolean getMin(int i) {
        return this.setMin && setMax() && getItemCount() - 1 == i;
    }

    /* access modifiers changed from: protected */
    public final boolean IsOverlapping() {
        List max = getMax();
        if (max != null) {
            return max.isEmpty();
        }
        return true;
    }

    public final boolean toFloatRange() {
        boolean z = !this.setMax;
        this.setMax = z;
        this.getMax.invoke(Boolean.valueOf(z));
        if (setMax()) {
            int size = getMax().size();
            int i = this.length;
            int i2 = this.getMin;
            int i3 = size - (i * i2);
            if (this.setMax) {
                notifyItemRangeInserted(i * i2, i3);
            } else {
                notifyItemRangeRemoved(i * i2, i3);
            }
            if (this.setMin) {
                notifyItemChanged(getItemCount() - 1, (Object) null);
            }
        } else {
            notifyDataSetChanged();
        }
        return this.setMax;
    }
}
