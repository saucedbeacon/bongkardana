package id.dana.statement.marker;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.github.mikephil.charting.components.MarkerView;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.getRecordType;
import o.resetInternal;
import o.setArguments;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lid/dana/statement/marker/PointMarker;", "Lcom/github/mikephil/charting/components/MarkerView;", "context", "Landroid/content/Context;", "resId", "", "(Landroid/content/Context;I)V", "iconArrow", "iconBackground", "label", "", "getOffset", "Lcom/github/mikephil/charting/utils/MPPointF;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "update", "pointModel", "Lid/dana/richview/statement/model/PointModel;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class PointMarker extends MarkerView {
    private int getMax;
    private String getMin = "";
    private int length;
    private HashMap setMin;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.setMin;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.setMin == null) {
            this.setMin = new HashMap();
        }
        View view = (View) this.setMin.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.setMin.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointMarker(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(@Nullable Canvas canvas) {
        if (((ImageView) _$_findCachedViewById(resetInternal.setMax.getMinimumHeight)) != null && this.getMax > 0) {
            ((ImageView) _$_findCachedViewById(resetInternal.setMax.getMinimumHeight)).setImageDrawable(IntRange.length(getContext(), this.getMax));
            ((ImageView) _$_findCachedViewById(resetInternal.setMax.getMinimumHeight)).setBackgroundResource(this.length);
        }
    }

    @Nullable
    public final setArguments getOffset() {
        double d = (double) (-getHeight());
        Double.isNaN(d);
        return new setArguments((float) ((-getWidth()) / 2), (float) (d * 1.2d));
    }

    public final void update(@NotNull getRecordType getrecordtype) {
        Intrinsics.checkNotNullParameter(getrecordtype, "pointModel");
        this.getMax = getrecordtype.setMin;
        this.length = getrecordtype.length;
        this.getMin = getrecordtype.getMax;
        if (((TextView) _$_findCachedViewById(resetInternal.setMax.getNavigationContentDescription)) != null) {
            TextView textView = (TextView) _$_findCachedViewById(resetInternal.setMax.getNavigationContentDescription);
            Intrinsics.checkNotNullExpressionValue(textView, "tv_marker_label");
            textView.setText(this.getMin);
        }
    }
}
