package o;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.getFixedHeightMinor;
import o.setOnFitSystemWindowsListener;
import o.setSelector;

public abstract class setSelector<T extends setSelector, V> extends setShowDividers {
    private static TimeInterpolator FastBitmap$CoordinateSystem = setSupportProgress.setMax(0.25f, 0.1f, 0.25f, 1.0f);
    private static long toString = 300;
    protected long IsOverlapping = 0;
    protected hasFocus equals = null;
    protected onForwardedEvent<V> getMax = null;
    protected getFixedHeightMinor getMin;
    private boolean hashCode = true;
    private Map<V, List<setDecorPadding<V>>> isInside = new HashMap();
    protected T length = null;
    protected TimeInterpolator setMax = null;
    protected V setMin = null;
    protected long toFloatRange = 0;
    private HashMap<String, Float> toIntRange = new HashMap<>();

    /* access modifiers changed from: protected */
    public abstract T getMin();

    private void length() {
        if (!this.hashCode) {
            throw new RuntimeException("AdditiveAnimator instances cannot be reused.");
        } else if (this.getMin == null) {
            this.getMin = new getFixedHeightMinor(this);
            length();
            this.getMin.setMax.setInterpolator(FastBitmap$CoordinateSystem);
            length();
            this.getMin.setMax.setDuration(toString);
        }
    }

    /* access modifiers changed from: package-private */
    public void setMin(List<setDecorPadding<V>> list) {
        for (setDecorPadding next : list) {
            T t = next.length.toIntRange;
            if (next.length.getMin != null) {
                next.length.getMin.set(t, Float.valueOf(next.setMin));
            } else {
                if (this.isInside == null) {
                    this.isInside = new HashMap();
                }
                List list2 = this.isInside.get(t);
                if (list2 == null) {
                    list2 = new ArrayList(1);
                    this.isInside.put(t, list2);
                }
                list2.add(next);
            }
        }
        Map<V, List<setDecorPadding<V>>> map = this.isInside;
        if (map != null) {
            for (V v : map.keySet()) {
                for (setDecorPadding setdecorpadding : this.isInside.get(v)) {
                    this.toIntRange.put(setdecorpadding.length.getMax, Float.valueOf(setdecorpadding.setMin));
                }
            }
        }
        for (List<setDecorPadding<V>> clear : this.isInside.values()) {
            clear.clear();
        }
        this.toIntRange.clear();
    }

    public final T getMin(FitWindowsLinearLayout<V> fitWindowsLinearLayout) {
        this.getMax.getMax = fitWindowsLinearLayout;
        hasFocus hasfocus = this.equals;
        if (hasfocus != null) {
            for (setSelector setselector : hasfocus.setMin) {
                setselector.getMax.getMax = fitWindowsLinearLayout;
            }
        }
        for (setOnFitSystemWindowsListener.setMax next : fitWindowsLinearLayout.setMax()) {
            Property<T, Float> property = next.length;
            float f = next.getMax;
            TypeEvaluator<Float> typeEvaluator = next.setMin;
            V v = this.setMin;
            DialogTitle dialogTitle = new DialogTitle(v, property, property.get(v).floatValue(), f);
            dialogTitle.isInside = typeEvaluator;
            dialogTitle.equals = this.setMax;
            dialogTitle.toDoubleRange = fitWindowsLinearLayout;
            getMin(dialogTitle);
        }
        return this;
    }

    public T getMin(V v) {
        if (this.equals != null) {
            setSelector min = getMin();
            min.setMin(this);
            min.length();
            min.getMin.setMax.setStartDelay(0);
            min.setMin((Runnable) new hasWindowFocus(min, 0));
            length();
            long startDelay = this.getMin.setMax.getStartDelay() + 0;
            min.length();
            min.getMin.setMax.setStartDelay(startDelay);
            min.setMin((Runnable) new hasWindowFocus(min, startDelay));
            return min.getMin(v);
        }
        this.setMin = v;
        this.getMax = onForwardedEvent.getMin(v);
        length();
        return this;
    }

    /* access modifiers changed from: private */
    public T setMax(TimeInterpolator timeInterpolator) {
        if (this.setMax != null) {
            return setMin(timeInterpolator);
        }
        length();
        this.getMin.setMax.setInterpolator(timeInterpolator);
        setMin((Runnable) new setListSelectionHidden(this, timeInterpolator));
        return this;
    }

    /* access modifiers changed from: private */
    public T setMin(TimeInterpolator timeInterpolator) {
        length();
        for (DialogTitle dialogTitle : this.getMin.getMin()) {
            length();
            dialogTitle.equals = this.getMin.setMax.getInterpolator();
        }
        this.setMax = timeInterpolator;
        length();
        this.getMin.setMax.setInterpolator(new LinearInterpolator());
        setMin((Runnable) new lookForSelectablePosition(this, timeInterpolator));
        return this;
    }

    public final void getMax() {
        T t = this.length;
        if (t != null) {
            t.getMax();
        }
        length();
        ValueAnimator valueAnimator = this.getMin.setMax;
        length();
        valueAnimator.setStartDelay(this.getMin.setMax.getStartDelay() + this.toFloatRange);
        length();
        this.getMin.setMax.start();
        this.hashCode = false;
    }

    /* access modifiers changed from: protected */
    public final void setMin(Runnable runnable) {
        T t;
        hasFocus hasfocus = this.equals;
        if (hasfocus != null && (t = this.length) != null && t.equals == hasfocus) {
            runnable.run();
        }
    }

    private T getMin(DialogTitle dialogTitle) {
        length();
        onForwardedEvent<V> onforwardedevent = this.getMax;
        getFixedHeightMinor getfixedheightminor = this.getMin;
        onforwardedevent.setMin.add(getfixedheightminor);
        getFixedHeightMinor.setMin setmin = new getFixedHeightMinor.setMin(dialogTitle);
        getfixedheightminor.getMax.add(setmin);
        Set set = getfixedheightminor.getMin.get(setmin.length.toIntRange);
        if (set == null) {
            set = new HashSet(1);
            getfixedheightminor.getMin.put(setmin.length.toIntRange, set);
        }
        set.add(setmin);
        onforwardedevent.setMax(dialogTitle.getMax, true).length = Float.valueOf(dialogTitle.length);
        setMin((Runnable) new isInTouchMode(this, dialogTitle));
        return this;
    }

    public final T setMin(long j) {
        length();
        this.getMin.setMax.setDuration(j);
        setMin((Runnable) new isFocused(this, j));
        return this;
    }

    /* access modifiers changed from: private */
    public T getMin(int i) {
        length();
        this.getMin.setMax.setRepeatCount(i);
        setMin((Runnable) new measureHeightOfChildrenCompat(this, i));
        return this;
    }

    /* access modifiers changed from: private */
    public T setMax(int i) {
        length();
        this.getMin.setMax.setRepeatMode(i);
        setMin((Runnable) new dispatchDraw(this, i));
        return this;
    }

    /* access modifiers changed from: protected */
    public T setMin(T t) {
        getMin(t.setMin);
        t.length();
        setMin(t.getMin.setMax.getDuration());
        t.length();
        setMax(t.getMin.setMax.getInterpolator());
        t.length();
        getMin(t.getMin.setMax.getRepeatCount());
        t.length();
        setMax(t.getMin.setMax.getRepeatMode());
        this.setMax = t.setMax;
        this.length = t;
        return this;
    }

    static /* synthetic */ void getMax(setSelector setselector, DialogTitle dialogTitle) {
        DialogTitle dialogTitle2;
        Float f;
        onForwardedEvent<T>.setMax max;
        Float f2 = null;
        if (dialogTitle.getMin != null) {
            f2 = dialogTitle.getMin.get(setselector.length.setMin);
        } else {
            String str = dialogTitle.getMax;
            onForwardedEvent<V> onforwardedevent = setselector.getMax;
            if (onforwardedevent != null) {
                onForwardedEvent<T>.setMax max2 = onforwardedevent.setMax(str, false);
                if (max2 == null) {
                    f = null;
                } else {
                    f = max2.getMin;
                }
                if (!(f == null || (max = setselector.getMax.setMax(str, false)) == null)) {
                    f2 = max.getMin;
                }
            }
        }
        T t = setselector.length;
        V v = t.setMin;
        if (dialogTitle.getMin != null) {
            if (dialogTitle.setMax != null) {
                dialogTitle2 = new DialogTitle(v, dialogTitle.getMin, f2.floatValue(), dialogTitle.setMax, dialogTitle.IsOverlapping, dialogTitle.toFloatRange);
            } else {
                dialogTitle2 = new DialogTitle(v, dialogTitle.getMin, f2.floatValue(), dialogTitle.length);
            }
        } else if (dialogTitle.setMax != null) {
            dialogTitle2 = new DialogTitle(v, dialogTitle.getMax, f2.floatValue(), dialogTitle.setMax, dialogTitle.IsOverlapping, dialogTitle.toFloatRange);
        } else {
            dialogTitle2 = new DialogTitle(v, dialogTitle.getMax, f2.floatValue(), dialogTitle.length);
        }
        if (dialogTitle.FastBitmap$CoordinateSystem) {
            dialogTitle2.FastBitmap$CoordinateSystem = dialogTitle.FastBitmap$CoordinateSystem;
            dialogTitle2.values = dialogTitle.values;
            dialogTitle2.length = f2.floatValue() + dialogTitle2.values;
        }
        if (dialogTitle.equals != null) {
            dialogTitle2.equals = dialogTitle.equals;
        }
        if (dialogTitle.isInside != null) {
            dialogTitle2.isInside = dialogTitle.isInside;
        }
        if (dialogTitle.toDoubleRange != null) {
            dialogTitle2.toDoubleRange = dialogTitle.toDoubleRange;
        }
        t.getMin(dialogTitle2);
    }

    static /* synthetic */ void setMax(setSelector setselector, long j) {
        T t = setselector.length;
        t.length();
        t.getMin.setMax.setStartDelay(j);
        t.setMin((Runnable) new hasWindowFocus(t, j));
    }
}
