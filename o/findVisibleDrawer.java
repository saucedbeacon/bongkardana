package o;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.DataSet;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import o.DrawerLayout;
import o.EmojiCompat$ReplaceStrategy;

public class findVisibleDrawer<T extends EmojiCompat$ReplaceStrategy> implements DrawerLayout.SavedState {
    protected T getMin;
    protected List<addFocusables> setMax = new ArrayList();

    public findVisibleDrawer(T t) {
        this.getMin = t;
    }

    /* access modifiers changed from: protected */
    public final isStateSaved setMin(float f, float f2) {
        getActivity transformer = this.getMin.getTransformer(YAxis.AxisDependency.LEFT);
        isStateSaved min = isStateSaved.getMin(0.0d, 0.0d);
        transformer.length(f, f2, min);
        return min;
    }

    /* access modifiers changed from: protected */
    public final addFocusables length(float f, float f2, float f3) {
        List<addFocusables> max = setMax(f, f2, f3);
        if (max.isEmpty()) {
            return null;
        }
        return getMin(max, f2, f3, getMin(max, f3, YAxis.AxisDependency.LEFT) < getMin(max, f3, YAxis.AxisDependency.RIGHT) ? YAxis.AxisDependency.LEFT : YAxis.AxisDependency.RIGHT, this.getMin.getMaxHighlightDistance());
    }

    private static float getMin(List<addFocusables> list, float f, YAxis.AxisDependency axisDependency) {
        float f2 = Float.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            addFocusables addfocusables = list.get(i);
            if (addfocusables.toFloatRange == axisDependency) {
                float abs = Math.abs(addfocusables.setMin - f);
                if (abs < f2) {
                    f2 = abs;
                }
            }
        }
        return f2;
    }

    /* access modifiers changed from: protected */
    public List<addFocusables> setMax(float f, float f2, float f3) {
        this.setMax.clear();
        dispatchOnDrawerClosed min = getMin();
        if (min == null) {
            return this.setMax;
        }
        int min2 = min.setMin();
        for (int i = 0; i < min2; i++) {
            EmojiAppCompatTextView min3 = min.setMin(i);
            if (min3.toIntRange()) {
                this.setMax.addAll(getMax(min3, i, f, DataSet.Rounding.CLOSEST));
            }
        }
        return this.setMax;
    }

    /* access modifiers changed from: protected */
    public List<addFocusables> getMax(EmojiAppCompatTextView emojiAppCompatTextView, int i, float f, DataSet.Rounding rounding) {
        Entry min;
        ArrayList arrayList = new ArrayList();
        List<Entry> min2 = emojiAppCompatTextView.setMin(f);
        if (min2.size() == 0 && (min = emojiAppCompatTextView.getMin(f, rounding)) != null) {
            min2 = emojiAppCompatTextView.setMin(min.length());
        }
        if (min2.size() == 0) {
            return arrayList;
        }
        for (Entry entry : min2) {
            isStateSaved max = this.getMin.getTransformer(emojiAppCompatTextView.getCause()).getMax(entry.length(), entry.getMin());
            arrayList.add(new addFocusables(entry.length(), entry.getMin(), (float) max.length, (float) max.getMin, i, emojiAppCompatTextView.getCause()));
        }
        return arrayList;
    }

    private addFocusables getMin(List<addFocusables> list, float f, float f2, YAxis.AxisDependency axisDependency, float f3) {
        addFocusables addfocusables = null;
        for (int i = 0; i < list.size(); i++) {
            addFocusables addfocusables2 = list.get(i);
            if (axisDependency == null || addfocusables2.toFloatRange == axisDependency) {
                float max = setMax(f, f2, addfocusables2.getMax, addfocusables2.setMin);
                if (max < f3) {
                    addfocusables = addfocusables2;
                    f3 = max;
                }
            }
        }
        return addfocusables;
    }

    /* access modifiers changed from: protected */
    public float setMax(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f - f3), (double) (f2 - f4));
    }

    /* access modifiers changed from: protected */
    public dispatchOnDrawerClosed getMin() {
        return this.getMin.getData();
    }

    public addFocusables setMax(float f, float f2) {
        getActivity transformer = this.getMin.getTransformer(YAxis.AxisDependency.LEFT);
        isStateSaved min = isStateSaved.getMin(0.0d, 0.0d);
        transformer.length(f, f2, min);
        isStateSaved.getMax(min);
        return length((float) min.length, f, f2);
    }
}
