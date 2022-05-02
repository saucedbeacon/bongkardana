package id.dana.richview.statement;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineDataSet;
import id.dana.R;
import id.dana.statement.marker.PointMarker;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.IntRange;
import o.closeDrawers;
import o.dispatchOnCancelled;
import o.findOpenDrawer;
import o.handleOnSurfaceTextureAvailable;
import o.onCancelLoad;
import o.onCanceled;
import o.removeDrawerListener;
import o.resetInternal;
import o.setDrawerLockMode;
import o.showNow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 E2\u00020\u0001:\u0001EB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010:\u001a\u00020;J\b\u0010<\u001a\u00020;H\u0002J\u0010\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\tH\u0002J\b\u0010@\u001a\u00020;H\u0002J\u0010\u0010A\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0012\u0010B\u001a\u00020;2\b\u0010C\u001a\u0004\u0018\u00010DH\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u001a\u0010\u001f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\"\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0013\"\u0004\b$\u0010\u0015R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\u001a\u0010.\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R\u001a\u00101\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u000e\"\u0004\b3\u0010\u0010R\u001a\u00104\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010\u0015R\u001a\u00107\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015¨\u0006F"}, d2 = {"Lid/dana/richview/statement/StatementChartView;", "Lcom/github/mikephil/charting/charts/LineChart;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationEnable", "", "getAnimationEnable", "()Z", "setAnimationEnable", "(Z)V", "backgroudColor", "getBackgroudColor", "()I", "setBackgroudColor", "(I)V", "circleEnabled", "getCircleEnabled", "setCircleEnabled", "dataset1Color", "getDataset1Color", "setDataset1Color", "dataset2Color", "getDataset2Color", "setDataset2Color", "gridColor", "getGridColor", "setGridColor", "labelColor", "getLabelColor", "setLabelColor", "lineDataSet1", "Lcom/github/mikephil/charting/data/LineDataSet;", "getLineDataSet1", "()Lcom/github/mikephil/charting/data/LineDataSet;", "setLineDataSet1", "(Lcom/github/mikephil/charting/data/LineDataSet;)V", "lineDataSet2", "getLineDataSet2", "setLineDataSet2", "maxXAxisRange", "getMaxXAxisRange", "setMaxXAxisRange", "showAllData", "getShowAllData", "setShowAllData", "startPosition", "getStartPosition", "setStartPosition", "visibleXRangeMaximum", "getVisibleXRangeMaximum", "setVisibleXRangeMaximum", "build", "", "configureXaxis", "getGradient", "Landroid/graphics/drawable/Drawable;", "baseColor", "handleDataSetUi", "initChart", "loadMarkerIcon", "entry", "Lcom/github/mikephil/charting/data/Entry;", "Companion", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StatementChartView extends LineChart {
    public static final float CHART_X_HALF_RANGE_SPACE = 0.255f;
    public static final float CHART_X_RANGE_SPACE = 0.51f;
    @NotNull
    public static final setMin Companion = new setMin((byte) 0);
    public static final int DURATION_CHART_ANIMATION = 300;
    public static final int MAX_DATE = 31;
    private boolean FastBitmap$CoordinateSystem = true;
    private int IsOverlapping;
    private int equals;
    private int getMax;
    private int getMin;
    private int isInside;
    private boolean length;
    private int setMax;
    private int setMin;
    @NotNull
    private LineDataSet toDoubleRange = new LineDataSet(new ArrayList(), "");
    private int toFloatRange;
    private boolean toIntRange;
    private HashMap toString;
    @NotNull
    private LineDataSet values = new LineDataSet(new ArrayList(), "");

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.toString;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-1933244876, oncanceled);
            onCancelLoad.getMin(-1933244876, oncanceled);
        }
        if (this.toString == null) {
            this.toString = new HashMap();
        }
        View view = (View) this.toString.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.toString.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lid/dana/richview/statement/StatementChartView$Companion;", "", "()V", "CHART_X_HALF_RANGE_SPACE", "", "CHART_X_RANGE_SPACE", "DURATION_CHART_ANIMATION", "", "MAX_DATE", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin {
        private setMin() {
        }

        public /* synthetic */ setMin(byte b) {
            this();
        }
    }

    public final boolean getShowAllData() {
        return this.length;
    }

    public final void setShowAllData(boolean z) {
        this.length = z;
    }

    public final int getVisibleXRangeMaximum() {
        return this.setMax;
    }

    public final void setVisibleXRangeMaximum(int i) {
        this.setMax = i;
    }

    public final int getGridColor() {
        return this.getMin;
    }

    public final void setGridColor(int i) {
        this.getMin = i;
    }

    public final int getLabelColor() {
        return this.setMin;
    }

    public final void setLabelColor(int i) {
        this.setMin = i;
    }

    public final int getDataset1Color() {
        return this.getMax;
    }

    public final void setDataset1Color(int i) {
        this.getMax = i;
    }

    public final int getDataset2Color() {
        return this.isInside;
    }

    public final void setDataset2Color(int i) {
        this.isInside = i;
    }

    public final int getStartPosition() {
        return this.IsOverlapping;
    }

    public final void setStartPosition(int i) {
        this.IsOverlapping = i;
    }

    public final int getBackgroudColor() {
        return this.equals;
    }

    public final void setBackgroudColor(int i) {
        this.equals = i;
    }

    public final int getMaxXAxisRange() {
        return this.toFloatRange;
    }

    public final void setMaxXAxisRange(int i) {
        this.toFloatRange = i;
    }

    public final boolean getCircleEnabled() {
        return this.toIntRange;
    }

    public final void setCircleEnabled(boolean z) {
        this.toIntRange = z;
    }

    @NotNull
    public final LineDataSet getLineDataSet1() {
        return this.values;
    }

    public final void setLineDataSet1(@NotNull LineDataSet lineDataSet) {
        Intrinsics.checkNotNullParameter(lineDataSet, "<set-?>");
        this.values = lineDataSet;
    }

    @NotNull
    public final LineDataSet getLineDataSet2() {
        return this.toDoubleRange;
    }

    public final void setLineDataSet2(@NotNull LineDataSet lineDataSet) {
        Intrinsics.checkNotNullParameter(lineDataSet, "<set-?>");
        this.toDoubleRange = lineDataSet;
    }

    public final boolean getAnimationEnable() {
        return this.FastBitmap$CoordinateSystem;
    }

    public final void setAnimationEnable(boolean z) {
        this.FastBitmap$CoordinateSystem = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatementChartView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatementChartView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        getMin(attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatementChartView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        getMin(attributeSet);
    }

    private final void getMin(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, resetInternal.getMin.ImmLeaksCleaner);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…eable.StatementChartView)");
        this.length = obtainStyledAttributes.getBoolean(6, false);
        this.setMax = obtainStyledAttributes.getInteger(8, 4);
        this.getMin = obtainStyledAttributes.getInteger(4, -1);
        this.setMin = obtainStyledAttributes.getInteger(5, -1);
        this.getMax = obtainStyledAttributes.getInteger(2, -1);
        this.isInside = obtainStyledAttributes.getInteger(3, -1);
        this.equals = obtainStyledAttributes.getInteger(0, IntRange.setMax(getContext(), R.color.f18632131099744));
        this.IsOverlapping = obtainStyledAttributes.getInteger(7, 0);
        this.toIntRange = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/richview/statement/StatementChartView$build$1$1", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "getFormattedValue", "", "value", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMax extends closeDrawers {
        final /* synthetic */ StatementChartView setMax;

        getMax(StatementChartView statementChartView) {
            this.setMax = statementChartView;
        }

        @NotNull
        public final String getMin(float f) {
            if (f < 1.0f) {
                return "";
            }
            XAxis xAxis = this.setMax.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis, "xAxis");
            return f >= xAxis.onMessageChannelReady ? "" : String.valueOf((int) f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/richview/statement/StatementChartView$build$1$2", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "getFormattedValue", "", "value", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends closeDrawers {
        final /* synthetic */ StatementChartView getMin;

        getMin(StatementChartView statementChartView) {
            this.getMin = statementChartView;
        }

        @NotNull
        public final String getMin(float f) {
            return (f < 1.0f || f > ((float) this.getMin.getMaxXAxisRange())) ? "" : String.valueOf((int) f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001c\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"id/dana/richview/statement/StatementChartView$build$1$3", "Lcom/github/mikephil/charting/listener/OnChartValueSelectedListener;", "onNothingSelected", "", "onValueSelected", "e", "Lcom/github/mikephil/charting/data/Entry;", "h", "Lcom/github/mikephil/charting/highlight/Highlight;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class length implements showNow {
        final /* synthetic */ StatementChartView length;

        length(StatementChartView statementChartView) {
            this.length = statementChartView;
        }

        public final void getMin(@Nullable Entry entry) {
            StatementChartView.access$loadMarkerIcon(this.length, entry);
        }
    }

    public final void build() {
        LineDataSet lineDataSet = this.values;
        int i = this.getMax;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, 0});
        gradientDrawable.setCornerRadius(0.0f);
        lineDataSet.setMin(gradientDrawable);
        lineDataSet.extraCallbackWithResult = true;
        lineDataSet.valueOf = this.equals;
        lineDataSet.IsOverlapping(this.getMax);
        lineDataSet.onNavigationEvent = this.toIntRange;
        lineDataSet.setMin(this.getMax);
        lineDataSet.FastBitmap$CoordinateSystem();
        lineDataSet.postMessage();
        lineDataSet.updateVisuals();
        lineDataSet.length(IntRange.setMax(getContext(), R.color.f18302131099697));
        LineDataSet lineDataSet2 = this.toDoubleRange;
        int i2 = this.isInside;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i2, 0});
        gradientDrawable2.setCornerRadius(0.0f);
        lineDataSet2.setMin(gradientDrawable2);
        lineDataSet2.IsOverlapping(this.isInside);
        lineDataSet2.onNavigationEvent = this.toIntRange;
        lineDataSet2.valueOf = this.equals;
        lineDataSet2.setMin(this.isInside);
        lineDataSet2.extraCallbackWithResult = true;
        lineDataSet2.FastBitmap$CoordinateSystem();
        lineDataSet2.postMessage();
        lineDataSet2.updateVisuals();
        lineDataSet2.length(IntRange.setMax(getContext(), R.color.f18302131099697));
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.values);
        arrayList.add(this.toDoubleRange);
        findOpenDrawer findopendrawer = new findOpenDrawer(arrayList);
        StatementChartView statementChartView = (StatementChartView) _$_findCachedViewById(resetInternal.setMax.removeItem);
        statementChartView.setData(findopendrawer);
        setDrawerLockMode description = statementChartView.getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "description");
        description.getMin(false);
        statementChartView.setTouchEnabled(true);
        statementChartView.setDrawGridBackground(false);
        statementChartView.getXAxis().length(false);
        statementChartView.getAxisRight().length(false);
        XAxis xAxis = statementChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis, "xAxis");
        xAxis.newSession = XAxis.XAxisPosition.BOTTOM;
        XAxis xAxis2 = statementChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis2, "xAxis");
        xAxis2.setMin(statementChartView.setMin);
        XAxis xAxis3 = statementChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis3, "xAxis");
        xAxis3.setMin(10.0f);
        if (statementChartView.toFloatRange > 0) {
            XAxis xAxis4 = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis4, "xAxis");
            xAxis4.length(((float) statementChartView.toFloatRange) + 0.1f);
        }
        if (statementChartView.toFloatRange >= 30) {
            XAxis xAxis5 = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis5, "xAxis");
            xAxis5.length(((float) statementChartView.toFloatRange) + 2.25f);
        }
        statementChartView.getAxis(YAxis.AxisDependency.RIGHT).getMax(false);
        YAxis axis = statementChartView.getAxis(YAxis.AxisDependency.RIGHT);
        Intrinsics.checkNotNullExpressionValue(axis, "getAxis(YAxis.AxisDependency.RIGHT)");
        axis.getMin(false);
        statementChartView.getAxis(YAxis.AxisDependency.LEFT).getMax(false);
        YAxis axisLeft = statementChartView.getAxisLeft();
        Intrinsics.checkNotNullExpressionValue(axisLeft, "axisLeft");
        axisLeft.setMin = statementChartView.getMin;
        statementChartView.getAxisLeft().getMax();
        statementChartView.getAxisLeft().onMessageChannelReady();
        YAxis axisLeft2 = statementChartView.getAxisLeft();
        Intrinsics.checkNotNullExpressionValue(axisLeft2, "axisLeft");
        axisLeft2.setMax(0.0f);
        statementChartView.getAxisRight().getMax();
        statementChartView.getAxisRight().onMessageChannelReady();
        YAxis axisRight = statementChartView.getAxisRight();
        Intrinsics.checkNotNullExpressionValue(axisRight, "axisRight");
        axisRight.setMax(0.0f);
        Legend legend = statementChartView.getLegend();
        Intrinsics.checkNotNullExpressionValue(legend, "legend");
        legend.getMin(false);
        Context context = statementChartView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, HummerConstants.CONTEXT);
        statementChartView.setMarker(new PointMarker(context, R.layout.custom_marker_view));
        statementChartView.setDragEnabled(true);
        statementChartView.setPinchZoom(false);
        statementChartView.setScaleEnabled(false);
        statementChartView.setViewPortOffsets(0.0f, 0.0f, 0.0f, 80.0f);
        if (statementChartView.length) {
            XAxis xAxis6 = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis6, "xAxis");
            xAxis6.setMax(0.0f);
            XAxis xAxis7 = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis7, "xAxis");
            xAxis7.length(xAxis7.onMessageChannelReady + 1.0f);
            XAxis xAxis8 = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis8, "xAxis");
            statementChartView.setVisibleXRangeMaximum(xAxis8.onMessageChannelReady);
            XAxis xAxis9 = statementChartView.getXAxis();
            XAxis xAxis10 = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis10, "xAxis");
            xAxis9.setMin((int) xAxis10.onMessageChannelReady, false);
            XAxis xAxis11 = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis11, "xAxis");
            xAxis11.length((closeDrawers) new getMax(statementChartView));
        } else {
            XAxis xAxis12 = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis12, "xAxis");
            xAxis12.setMax(-1.255f);
            statementChartView.setVisibleXRangeMaximum(((float) statementChartView.setMax) + 0.51f);
            statementChartView.getXAxis().setMin(statementChartView.setMax, false);
            XAxis xAxis13 = statementChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis13, "xAxis");
            xAxis13.length((closeDrawers) new getMin(statementChartView));
        }
        statementChartView.moveViewToX(((float) statementChartView.IsOverlapping) - 0.255f);
        if (statementChartView.FastBitmap$CoordinateSystem) {
            statementChartView.animateY(300);
        }
        ((StatementChartView) statementChartView._$_findCachedViewById(resetInternal.setMax.removeItem)).setOnChartValueSelectedListener(new length(statementChartView));
    }

    public static final /* synthetic */ void access$loadMarkerIcon(StatementChartView statementChartView, Entry entry) {
        removeDrawerListener marker = statementChartView.getMarker();
        if (marker != null) {
            handleOnSurfaceTextureAvailable handleonsurfacetextureavailable = handleOnSurfaceTextureAvailable.length;
            ((PointMarker) marker).update(handleOnSurfaceTextureAvailable.length(entry));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type id.dana.statement.marker.PointMarker");
    }
}
