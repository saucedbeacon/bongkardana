package o;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.CombinedChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class onDetach extends createFragmentContainer {
    protected WeakReference<Chart> getMax;
    protected List<addFocusables> setMax = new ArrayList();
    protected List<createFragmentContainer> setMin = new ArrayList(5);

    public onDetach(CombinedChart combinedChart, setDrawerShadow setdrawershadow, setTargetFragment settargetfragment) {
        super(setdrawershadow, settargetfragment);
        this.getMax = new WeakReference<>(combinedChart);
        getMax();
    }

    public final void getMax() {
        this.setMin.clear();
        CombinedChart combinedChart = (CombinedChart) this.getMax.get();
        if (combinedChart != null) {
            for (CombinedChart.DrawOrder ordinal : combinedChart.getDrawOrder()) {
                int i = AnonymousClass5.setMin[ordinal.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5 && combinedChart.getScatterData() != null) {
                                    this.setMin.add(new getMinimumMaxLifecycleState(combinedChart, this.equals, this.invokeSuspend));
                                }
                            } else if (combinedChart.getCandleData() != null) {
                                this.setMin.add(new performCreateView(combinedChart, this.equals, this.invokeSuspend));
                            }
                        } else if (combinedChart.getLineData() != null) {
                            this.setMin.add(new onHasView(combinedChart, this.equals, this.invokeSuspend));
                        }
                    } else if (combinedChart.getBubbleData() != null) {
                        this.setMin.add(new setShowsDialog(combinedChart, this.equals, this.invokeSuspend));
                    }
                } else if (combinedChart.getBarData() != null) {
                    this.setMin.add(new requireDialog(combinedChart, this.equals, this.invokeSuspend));
                }
            }
        }
    }

    /* renamed from: o.onDetach$5  reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] setMin;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder[] r0 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                setMin = r0
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.BUBBLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.LINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.CANDLE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = setMin     // Catch:{ NoSuchFieldError -> 0x003e }
                com.github.mikephil.charting.charts.CombinedChart$DrawOrder r1 = com.github.mikephil.charting.charts.CombinedChart.DrawOrder.SCATTER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.onDetach.AnonymousClass5.<clinit>():void");
        }
    }

    public final void setMax() {
        for (createFragmentContainer max : this.setMin) {
            max.setMax();
        }
    }

    public final void getMax(Canvas canvas) {
        for (createFragmentContainer max : this.setMin) {
            max.getMax(canvas);
        }
    }

    public final void setMax(Canvas canvas) {
        for (createFragmentContainer max : this.setMin) {
            max.setMax(canvas);
        }
    }

    public final void setMin(Canvas canvas) {
        for (createFragmentContainer min : this.setMin) {
            min.setMin(canvas);
        }
    }

    public final void setMax(Canvas canvas, addFocusables[] addfocusablesArr) {
        int i;
        Chart chart = this.getMax.get();
        if (chart != null) {
            for (createFragmentContainer next : this.setMin) {
                Object obj = null;
                if (next instanceof requireDialog) {
                    obj = ((requireDialog) next).getMax.getBarData();
                } else if (next instanceof onHasView) {
                    obj = ((onHasView) next).setMin.getLineData();
                } else if (next instanceof performCreateView) {
                    obj = ((performCreateView) next).setMax.getCandleData();
                } else if (next instanceof getMinimumMaxLifecycleState) {
                    obj = ((getMinimumMaxLifecycleState) next).length.getScatterData();
                } else if (next instanceof setShowsDialog) {
                    obj = ((setShowsDialog) next).getMin.getBubbleData();
                }
                if (obj == null) {
                    i = -1;
                } else {
                    i = ((setDrawerViewOffset) chart.getData()).values().indexOf(obj);
                }
                this.setMax.clear();
                for (addFocusables addfocusables : addfocusablesArr) {
                    if (addfocusables.length == i || addfocusables.length == -1) {
                        this.setMax.add(addfocusables);
                    }
                }
                List<addFocusables> list = this.setMax;
                next.setMax(canvas, (addFocusables[]) list.toArray(new addFocusables[list.size()]));
            }
        }
    }
}
