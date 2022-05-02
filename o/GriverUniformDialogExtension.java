package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import id.dana.R;
import id.dana.miniprogram.tnc.TncDetailMiniProgramActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0015"}, d2 = {"Lid/dana/miniprogram/adapter/MiniProgramAgreementsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lid/dana/miniprogram/adapter/MiniProgramAgreementsAdapter$ViewHolder;", "agreements", "", "", "(Ljava/util/List;)V", "getAgreements", "()Ljava/util/List;", "setAgreements", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GriverUniformDialogExtension extends RecyclerView.Adapter<length> {
    @NotNull
    public List<String> setMin;

    public GriverUniformDialogExtension() {
        this((byte) 0);
    }

    public /* synthetic */ GriverUniformDialogExtension(byte b) {
        this((List<String>) CollectionsKt.emptyList());
    }

    public final /* synthetic */ void onBindViewHolder(RecyclerView.valueOf valueof, int i) {
        length length2 = (length) valueof;
        Intrinsics.checkNotNullParameter(length2, "holder");
        length2.getMax.setText(this.setMin.get(i));
    }

    public final /* synthetic */ RecyclerView.valueOf onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(viewGroup.getContext() instanceof TncDetailMiniProgramActivity ? R.layout.view_item_mini_program_scope_activity : R.layout.view_item_mini_program_scope_dialog, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "LayoutInflater.from(pare…(layoutId, parent, false)");
        return new length(inflate);
    }

    public GriverUniformDialogExtension(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "agreements");
        this.setMin = list;
    }

    public final int getItemCount() {
        return this.setMin.size();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lid/dana/miniprogram/adapter/MiniProgramAgreementsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "tvScope", "Landroid/widget/TextView;", "getTvScope$app_productionRelease", "()Landroid/widget/TextView;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length extends RecyclerView.valueOf {
        @NotNull
        final TextView getMax;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public length(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View findViewById = view.findViewById(R.id.f64102131365035);
            Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvScope)");
            this.getMax = (TextView) findViewById;
        }
    }
}
