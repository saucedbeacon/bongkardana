package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lid/dana/home/view/GridItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "spanSize", "", "spacingInDp", "(Landroid/content/Context;II)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class DefaultAppExtension extends RecyclerView.getMax {
    private int getMin = 8;
    private final int length = 2;
    private final Context setMax;

    public DefaultAppExtension(@Nullable Context context) {
        this.setMax = context;
        if (context != null) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            this.getMin = (int) (((float) 8) * resources.getDisplayMetrics().density);
        }
    }

    public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        Intrinsics.checkNotNullParameter(recyclerView$Mean$Arithmetic, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view) + 1;
        if (recyclerView$Mean$Arithmetic.equals) {
            i = recyclerView$Mean$Arithmetic.setMax - recyclerView$Mean$Arithmetic.getMax;
        } else {
            i = recyclerView$Mean$Arithmetic.setMin;
        }
        rect.top = this.getMin / 2;
        rect.bottom = this.getMin / 2;
        rect.right = this.getMin / 2;
        rect.left = this.getMin / 2;
        if (childAdapterPosition <= this.length) {
            rect.top = 0;
        }
        if ((i - this.length) + 1 <= childAdapterPosition && i >= childAdapterPosition) {
            rect.bottom = 0;
        }
        if (childAdapterPosition % this.length == 0) {
            rect.right = 0;
        }
        if (childAdapterPosition % this.length == 1) {
            rect.left = 0;
        }
        if (i % 2 == 1 && childAdapterPosition == i - 1) {
            rect.bottom = this.getMin / 2;
        }
    }
}
