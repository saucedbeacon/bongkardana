package o;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import id.dana.challenge.pinwithface.ChallengePinWithFaceModule;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.setParallaxDistance;
import org.jetbrains.annotations.NotNull;

public final class SlidingPaneLayout implements getAdapterPosition<setParallaxDistance.setMin> {
    private final ChallengePinWithFaceModule getMin;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/common/decoration/HorizontalItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacing", "", "(I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class LayoutParams extends RecyclerView.getMax {
        private final int getMax;

        public LayoutParams() {
            this((byte) 0);
        }

        private /* synthetic */ LayoutParams(byte b) {
            this(0);
        }

        public LayoutParams(int i) {
            this.getMax = i;
        }

        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            Intrinsics.checkNotNullParameter(rect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(recyclerView, "parent");
            Intrinsics.checkNotNullParameter(recyclerView$Mean$Arithmetic, "state");
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.top = this.getMax;
            }
            rect.left = this.getMax;
            rect.right = this.getMax;
            rect.bottom = this.getMax;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lid/dana/common/decoration/VerticalItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacing", "", "(I)V", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public final class SavedState extends RecyclerView.getMax {
        private final int setMax;

        public SavedState() {
            this((byte) 0);
        }

        private /* synthetic */ SavedState(byte b) {
            this(0);
        }

        public SavedState(int i) {
            this.setMax = i;
        }

        public final void getItemOffsets(@NotNull Rect rect, @NotNull View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
            Intrinsics.checkNotNullParameter(rect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(recyclerView, "parent");
            Intrinsics.checkNotNullParameter(recyclerView$Mean$Arithmetic, "state");
            if (recyclerView.getChildAdapterPosition(view) == 0) {
                rect.left = this.setMax;
            }
            rect.top = this.setMax;
            rect.right = this.setMax;
            rect.bottom = this.setMax;
        }
    }

    private SlidingPaneLayout(ChallengePinWithFaceModule challengePinWithFaceModule) {
        this.getMin = challengePinWithFaceModule;
    }

    public static SlidingPaneLayout getMin(ChallengePinWithFaceModule challengePinWithFaceModule) {
        return new SlidingPaneLayout(challengePinWithFaceModule);
    }

    public final /* synthetic */ Object get() {
        setParallaxDistance.setMin max = this.getMin.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
