package id.dana.social.adapter.friendsheader;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.BindView;
import id.dana.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.Ignore;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0007H\u0002R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lid/dana/social/adapter/friendsheader/LoadMoreViewHolder;", "T", "Lid/dana/base/BaseRecyclerViewHolder;", "parent", "Landroid/view/ViewGroup;", "clickListener", "Lkotlin/Function0;", "", "(Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "btnLoadMore", "Landroid/widget/Button;", "getBtnLoadMore", "()Landroid/widget/Button;", "setBtnLoadMore", "(Landroid/widget/Button;)V", "getClickListener", "()Lkotlin/jvm/functions/Function0;", "getParent", "()Landroid/view/ViewGroup;", "bindData", "data", "(Ljava/lang/Object;)V", "setItemClickListener", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class LoadMoreViewHolder<T> extends Ignore<T> {
    @BindView(2131362093)
    public Button btnLoadMore;
    @NotNull
    private final ViewGroup setMax;
    @NotNull
    final Function0<Unit> setMin;

    public final void setMax(T t) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadMoreViewHolder(@NotNull ViewGroup viewGroup, @NotNull Function0<Unit> function0) {
        super(viewGroup.getContext(), R.layout.viewholder_loadmore, viewGroup);
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(function0, "clickListener");
        this.setMax = viewGroup;
        this.setMin = function0;
        Button button = this.btnLoadMore;
        if (button == null) {
            Intrinsics.throwUninitializedPropertyAccessException("btnLoadMore");
        }
        button.setOnClickListener(new getMin(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
    static final class getMin implements View.OnClickListener {
        final /* synthetic */ LoadMoreViewHolder length;

        getMin(LoadMoreViewHolder loadMoreViewHolder) {
            this.length = loadMoreViewHolder;
        }

        public final void onClick(View view) {
            this.length.setMin.invoke();
        }
    }
}
