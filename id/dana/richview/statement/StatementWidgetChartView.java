package id.dana.richview.statement;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.ap.zoloz.hummer.biz.HummerConstants;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.LineDataSet;
import id.dana.R;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o.IntRange;
import o.NebulaLoadingView;
import o.closeDrawers;
import o.findOpenDrawer;
import o.getTargetFragment;
import o.setDrawerLockMode;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u00020@H\u0002J\u0010\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\tH\u0002J\b\u0010E\u001a\u00020@H\u0002J\u0010\u0010F\u001a\u00020@2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010G\u001a\u00020@H\u0002R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016R\u000e\u0010\u001c\u001a\u00020\u001dXD¢\u0006\u0002\n\u0000R\u001b\u0010\u001e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\u001a\u0010*\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0016\"\u0004\b,\u0010-R*\u0010.\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`1X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0016\"\u0004\b8\u0010-R\u001b\u00109\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b;\u0010\u0018\u001a\u0004\b:\u0010\u0016R\u001b\u0010<\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b>\u0010\u0018\u001a\u0004\b=\u0010\u0016¨\u0006H"}, d2 = {"Lid/dana/richview/statement/StatementWidgetChartView;", "Lcom/github/mikephil/charting/charts/LineChart;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "animationEnable", "", "getAnimationEnable", "()Z", "setAnimationEnable", "(Z)V", "circleEnabled", "getCircleEnabled", "setCircleEnabled", "dataset1Color", "getDataset1Color", "()I", "dataset1Color$delegate", "Lkotlin/Lazy;", "dataset2Color", "getDataset2Color", "dataset2Color$delegate", "datasetLineWidth", "", "labelColor", "getLabelColor", "labelColor$delegate", "lineDataSet1", "Lcom/github/mikephil/charting/data/LineDataSet;", "getLineDataSet1", "()Lcom/github/mikephil/charting/data/LineDataSet;", "setLineDataSet1", "(Lcom/github/mikephil/charting/data/LineDataSet;)V", "lineDataSet2", "getLineDataSet2", "setLineDataSet2", "maxXAxisRange", "getMaxXAxisRange", "setMaxXAxisRange", "(I)V", "months", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getMonths", "()Ljava/util/ArrayList;", "setMonths", "(Ljava/util/ArrayList;)V", "startPosition", "getStartPosition", "setStartPosition", "statementChartGridColor", "getStatementChartGridColor", "statementChartGridColor$delegate", "widgetChartBackground", "getWidgetChartBackground", "widgetChartBackground$delegate", "build", "", "configureXaxis", "getGradient", "Landroid/graphics/drawable/Drawable;", "baseColor", "handleDataSetUi", "initChart", "setupAllDataChart", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class StatementWidgetChartView extends LineChart {
    private boolean FastBitmap$CoordinateSystem = true;
    @NotNull
    private LineDataSet IsOverlapping = new LineDataSet(new ArrayList(), "");
    private final float equals = 2.0f;
    private final Lazy getMax = LazyKt.lazy(new toIntRange(this));
    private final Lazy getMin = LazyKt.lazy(new getMax(this));
    @NotNull
    private ArrayList<String> hashCode = CollectionsKt.arrayListOf("JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "NOV", "DES");
    private boolean isInside = true;
    private final Lazy length = LazyKt.lazy(new length(this));
    private final Lazy setMax = LazyKt.lazy(new isInside(this));
    private final Lazy setMin = LazyKt.lazy(new setMax(this));
    @NotNull
    private LineDataSet toDoubleRange = new LineDataSet(new ArrayList(), "");
    private int toFloatRange;
    private int toIntRange;
    private HashMap values;

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.values;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        if (this.values == null) {
            this.values = new HashMap();
        }
        View view = (View) this.values.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.values.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class isInside extends Lambda implements Function0<Integer> {
        final /* synthetic */ StatementWidgetChartView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        isInside(StatementWidgetChartView statementWidgetChartView) {
            super(0);
            this.this$0 = statementWidgetChartView;
        }

        public final int invoke() {
            return IntRange.setMax(this.this$0.getContext(), R.color.f18622131099743);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class length extends Lambda implements Function0<Integer> {
        final /* synthetic */ StatementWidgetChartView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        length(StatementWidgetChartView statementWidgetChartView) {
            super(0);
            this.this$0 = statementWidgetChartView;
        }

        public final int invoke() {
            return IntRange.setMax(this.this$0.getContext(), R.color.f24792131100434);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class setMax extends Lambda implements Function0<Integer> {
        final /* synthetic */ StatementWidgetChartView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        setMax(StatementWidgetChartView statementWidgetChartView) {
            super(0);
            this.this$0 = statementWidgetChartView;
        }

        public final int invoke() {
            return IntRange.setMax(this.this$0.getContext(), R.color.f22242131100147);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class getMax extends Lambda implements Function0<Integer> {
        final /* synthetic */ StatementWidgetChartView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        getMax(StatementWidgetChartView statementWidgetChartView) {
            super(0);
            this.this$0 = statementWidgetChartView;
        }

        public final int invoke() {
            return IntRange.setMax(this.this$0.getContext(), R.color.f22232131100146);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 2})
    static final class toIntRange extends Lambda implements Function0<Integer> {
        final /* synthetic */ StatementWidgetChartView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        toIntRange(StatementWidgetChartView statementWidgetChartView) {
            super(0);
            this.this$0 = statementWidgetChartView;
        }

        public final int invoke() {
            return IntRange.setMax(this.this$0.getContext(), R.color.f18632131099744);
        }
    }

    public final int getStartPosition() {
        return this.toFloatRange;
    }

    public final void setStartPosition(int i) {
        this.toFloatRange = i;
    }

    public final int getMaxXAxisRange() {
        return this.toIntRange;
    }

    public final void setMaxXAxisRange(int i) {
        this.toIntRange = i;
    }

    public final boolean getCircleEnabled() {
        return this.isInside;
    }

    public final void setCircleEnabled(boolean z) {
        this.isInside = z;
    }

    @NotNull
    public final LineDataSet getLineDataSet1() {
        return this.IsOverlapping;
    }

    public final void setLineDataSet1(@NotNull LineDataSet lineDataSet) {
        Intrinsics.checkNotNullParameter(lineDataSet, "<set-?>");
        this.IsOverlapping = lineDataSet;
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

    @NotNull
    public final ArrayList<String> getMonths() {
        return this.hashCode;
    }

    public final void setMonths(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.hashCode = arrayList;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatementWidgetChartView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatementWidgetChartView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatementWidgetChartView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, HummerConstants.CONTEXT);
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/richview/statement/StatementWidgetChartView$setupAllDataChart$1", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "getFormattedValue", "", "value", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class setMin extends closeDrawers {
        final /* synthetic */ StatementWidgetChartView getMax;

        setMin(StatementWidgetChartView statementWidgetChartView) {
            this.getMax = statementWidgetChartView;
        }

        @NotNull
        public final String getMin(float f) {
            if (f < 0.0f) {
                return "";
            }
            XAxis xAxis = this.getMax.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis, "xAxis");
            if (f >= xAxis.onMessageChannelReady) {
                return "";
            }
            int i = (int) f;
            if (i <= this.getMax.getMonths().size()) {
                String str = this.getMax.getMonths().get(i);
                Intrinsics.checkNotNullExpressionValue(str, "months[value.toInt()]");
                return str;
            }
            String min = super.getMin(f);
            Intrinsics.checkNotNullExpressionValue(min, "super.getFormattedValue(value)");
            return min;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"id/dana/richview/statement/StatementWidgetChartView$configureXaxis$1$1", "Lcom/github/mikephil/charting/formatter/ValueFormatter;", "getFormattedValue", "", "value", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    public static final class getMin extends closeDrawers {
        getMin() {
        }

        @NotNull
        public final String getMin(float f) {
            String min = NebulaLoadingView.AnonymousClass1.getMin(String.valueOf(f));
            Intrinsics.checkNotNullExpressionValue(min, "NumberFormatterUtil.getPrettyAmount(\"$value\")");
            return min;
        }
    }

    public final void build() {
        LineDataSet lineDataSet = this.IsOverlapping;
        int intValue = ((Number) this.setMin.getValue()).intValue();
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{intValue, 0});
        gradientDrawable.setCornerRadius(0.0f);
        lineDataSet.setMin(gradientDrawable);
        lineDataSet.extraCallbackWithResult = true;
        float f = this.equals * 2.0f;
        if (f >= 1.0f) {
            lineDataSet.create = getTargetFragment.setMax(f);
        }
        float f2 = this.equals;
        if (f2 >= 0.5f) {
            lineDataSet.b = getTargetFragment.setMax(f2);
        }
        float f3 = this.equals;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        float f4 = 10.0f;
        if (f3 > 10.0f) {
            f3 = 10.0f;
        }
        lineDataSet.ICustomTabsCallback = getTargetFragment.setMax(f3);
        lineDataSet.valueOf = ((Number) this.getMax.getValue()).intValue();
        lineDataSet.IsOverlapping(((Number) this.setMin.getValue()).intValue());
        lineDataSet.onNavigationEvent = this.isInside;
        lineDataSet.setMin(((Number) this.setMin.getValue()).intValue());
        lineDataSet.FastBitmap$CoordinateSystem();
        lineDataSet.postMessage();
        lineDataSet.updateVisuals();
        lineDataSet.length(IntRange.setMax(getContext(), R.color.f18302131099697));
        LineDataSet lineDataSet2 = this.toDoubleRange;
        int intValue2 = ((Number) this.getMin.getValue()).intValue();
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{intValue2, 0});
        gradientDrawable2.setCornerRadius(0.0f);
        lineDataSet2.setMin(gradientDrawable2);
        lineDataSet2.IsOverlapping(((Number) this.getMin.getValue()).intValue());
        float f5 = this.equals * 2.0f;
        if (f5 >= 1.0f) {
            lineDataSet2.create = getTargetFragment.setMax(f5);
        }
        float f6 = this.equals;
        if (f6 >= 0.5f) {
            lineDataSet2.b = getTargetFragment.setMax(f6);
        }
        float f7 = this.equals;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        if (f7 <= 10.0f) {
            f4 = f7;
        }
        lineDataSet2.ICustomTabsCallback = getTargetFragment.setMax(f4);
        lineDataSet2.onNavigationEvent = this.isInside;
        lineDataSet2.valueOf = ((Number) this.getMax.getValue()).intValue();
        lineDataSet2.setMin(((Number) this.getMin.getValue()).intValue());
        lineDataSet2.extraCallbackWithResult = true;
        lineDataSet2.FastBitmap$CoordinateSystem();
        lineDataSet2.postMessage();
        lineDataSet2.updateVisuals();
        lineDataSet2.length(IntRange.setMax(getContext(), R.color.f18302131099697));
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.IsOverlapping);
        arrayList.add(this.toDoubleRange);
        findOpenDrawer findopendrawer = new findOpenDrawer(arrayList);
        StatementWidgetChartView statementWidgetChartView = this;
        statementWidgetChartView.setData(findopendrawer);
        setDrawerLockMode description = statementWidgetChartView.getDescription();
        Intrinsics.checkNotNullExpressionValue(description, "description");
        description.getMin(false);
        statementWidgetChartView.setTouchEnabled(false);
        statementWidgetChartView.getXAxis().length(false);
        XAxis xAxis = statementWidgetChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis, "xAxis");
        xAxis.newSession = XAxis.XAxisPosition.BOTTOM;
        XAxis xAxis2 = statementWidgetChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis2, "xAxis");
        xAxis2.setMin(((Number) statementWidgetChartView.length.getValue()).intValue());
        XAxis xAxis3 = statementWidgetChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis3, "xAxis");
        xAxis3.setMin(8.0f);
        if (statementWidgetChartView.toIntRange > 0) {
            XAxis xAxis4 = statementWidgetChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis4, "xAxis");
            xAxis4.length(((float) statementWidgetChartView.toIntRange) + 0.1f);
        }
        if (statementWidgetChartView.toIntRange >= 30) {
            XAxis xAxis5 = statementWidgetChartView.getXAxis();
            Intrinsics.checkNotNullExpressionValue(xAxis5, "xAxis");
            xAxis5.length(((float) statementWidgetChartView.toIntRange) + 2.25f);
        }
        YAxis axisRight = statementWidgetChartView.getAxisRight();
        axisRight.getMin(true);
        axisRight.getMax(true);
        axisRight.setMin(3, true);
        Intrinsics.checkNotNullExpressionValue(axisRight, "this");
        axisRight.setMin = ((Number) statementWidgetChartView.setMax.getValue()).intValue();
        axisRight.toDoubleRange();
        axisRight.length(true);
        axisRight.getMax();
        axisRight.extraCommand = YAxis.YAxisLabelPosition.INSIDE_CHART;
        axisRight.getDefaultImpl = false;
        axisRight.length((closeDrawers) new getMin());
        axisRight.setMin(-5.0f);
        axisRight.setMin(((Number) statementWidgetChartView.length.getValue()).intValue());
        axisRight.getMin(6.0f);
        axisRight.setMax(0.0f);
        YAxis axisLeft = statementWidgetChartView.getAxisLeft();
        Intrinsics.checkNotNullExpressionValue(axisLeft, "axisLeft");
        axisLeft.getMin(false);
        Legend legend = statementWidgetChartView.getLegend();
        Intrinsics.checkNotNullExpressionValue(legend, "legend");
        legend.getMin(false);
        statementWidgetChartView.setDragEnabled(false);
        statementWidgetChartView.setPinchZoom(false);
        statementWidgetChartView.setScaleEnabled(false);
        XAxis xAxis6 = statementWidgetChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis6, "xAxis");
        xAxis6.getMin(6.0f);
        XAxis xAxis7 = statementWidgetChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis7, "xAxis");
        xAxis7.setMax(0.0f);
        XAxis xAxis8 = statementWidgetChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis8, "xAxis");
        xAxis8.length(xAxis8.onMessageChannelReady + 1.0f);
        XAxis xAxis9 = statementWidgetChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis9, "xAxis");
        statementWidgetChartView.setVisibleXRangeMaximum(xAxis9.onMessageChannelReady);
        XAxis xAxis10 = statementWidgetChartView.getXAxis();
        XAxis xAxis11 = statementWidgetChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis11, "xAxis");
        xAxis10.setMin((int) xAxis11.onMessageChannelReady, false);
        XAxis xAxis12 = statementWidgetChartView.getXAxis();
        Intrinsics.checkNotNullExpressionValue(xAxis12, "xAxis");
        xAxis12.length((closeDrawers) new setMin(statementWidgetChartView));
        statementWidgetChartView.setBackgroundColor(((Number) statementWidgetChartView.getMax.getValue()).intValue());
    }
}
