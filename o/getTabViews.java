package o;

import android.view.ViewGroup;
import id.dana.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lid/dana/social/adapter/friendsheader/FetchingNewDataViewHolder;", "T", "Lid/dana/base/BaseRecyclerViewHolder;", "parent", "Landroid/view/ViewGroup;", "(Landroid/view/ViewGroup;)V", "getParent", "()Landroid/view/ViewGroup;", "bindData", "", "data", "(Ljava/lang/Object;)V", "setOnItemClickListener", "onItemClickListener", "Lid/dana/base/BaseRecyclerViewHolder$OnItemClickListener;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class getTabViews<T> extends Ignore<T> {
    @NotNull
    private final ViewGroup setMax;

    public final void setMax(T t) {
    }

    public final void setMin(@Nullable Ignore.setMin setmin) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getTabViews(@NotNull ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.viewholder_fetching_new_data, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        this.setMax = viewGroup;
    }
}
