package id.dana.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Mean$Arithmetic;
import com.ap.zoloz.hummer.biz.HummerConstants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\b\u0010\u0019\u001a\u00020\tH\u0002J\u0018\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J \u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0018\u00010\u001eR\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@BX\u000e¢\u0006\b\n\u0000\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00058BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lid/dana/utils/GridAutofitLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "context", "Landroid/content/Context;", "columnWidth", "", "(Landroid/content/Context;I)V", "orientation", "reverseLayout", "", "(Landroid/content/Context;IIZ)V", "value", "setColumnWidth", "(I)V", "columnWidthChanged", "defaultColumnWidth", "getDefaultColumnWidth", "()I", "defaultColumnWidth$delegate", "Lkotlin/Lazy;", "lastHeight", "lastWidth", "dimensionIsNotZero", "width", "height", "isOrientationVertical", "notLastItem", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class GridAutofitLayoutManager extends GridLayoutManager {
    @NotNull
    public static final setMax toFloatRange = new setMax((byte) 0);
    private boolean FastBitmap$CoordinateSystem = true;
    private final Lazy equals;
    private int hashCode;
    private int toString;
    private int values;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lid/dana/utils/GridAutofitLayoutManager$Companion;", "", "()V", "INITIAL_SPAN_COUNT", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMax {
        private setMax() {
        }

        public /* synthetic */ setMax(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GridAutofitLayoutManager(@NotNull Context context, int i) {
        super(context, 1);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Lazy lazy = LazyKt.lazy(getMax.INSTANCE);
        this.equals = lazy;
        if (this.values != i) {
            i = i <= 0 ? ((Number) lazy.getValue()).intValue() : i;
            this.values = i;
            if (i > 0) {
                this.FastBitmap$CoordinateSystem = true;
            }
        }
    }

    public final void onLayoutChildren(@Nullable RecyclerView.toDoubleRange todoublerange, @Nullable RecyclerView$Mean$Arithmetic recyclerView$Mean$Arithmetic) {
        int i;
        int i2;
        int width = getWidth();
        int height = getHeight();
        if (getMax(width, height) && getMin(width, height)) {
            if (getMin()) {
                i2 = width - getPaddingRight();
                i = getPaddingLeft();
            } else {
                i2 = height - getPaddingTop();
                i = getPaddingBottom();
            }
            length(Math.max(1, (i2 - i) / this.values));
            this.FastBitmap$CoordinateSystem = false;
        }
        this.hashCode = width;
        this.toString = height;
        super.onLayoutChildren(todoublerange, recyclerView$Mean$Arithmetic);
    }

    private final boolean getMin() {
        return getOrientation() == 1;
    }

    private final boolean getMin(int i, int i2) {
        return (!this.FastBitmap$CoordinateSystem && this.hashCode == i && this.toString == i2) ? false : true;
    }

    private final boolean getMax(int i, int i2) {
        return this.values > 0 && i > 0 && i2 > 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<Integer> {
        public static final getMax INSTANCE = new getMax();

        getMax() {
            super(0);
        }

        public final int invoke() {
            Resources system = Resources.getSystem();
            Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
            return (int) TypedValue.applyDimension(1, 48.0f, system.getDisplayMetrics());
        }
    }
}
