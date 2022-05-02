package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.Property;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class getFixedHeightMinor {
    List<setMin> getMax;
    Map<Object, Set<setMin>> getMin;
    boolean length;
    ValueAnimator setMax;
    setSelector setMin;

    final class setMin<T> {
        final DialogTitle<T> length;
        float setMin = 0.0f;

        setMin(DialogTitle<T> dialogTitle) {
            this.length = dialogTitle;
        }

        public final int hashCode() {
            return this.length.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return this.length.equals(((setMin) obj).length);
        }
    }

    getFixedHeightMinor(setSelector setselector) {
        this.getMax = new ArrayList();
        this.getMin = new HashMap();
        this.setMax = null;
        this.length = false;
        this.setMax = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.setMin = setselector;
        this.setMax.addUpdateListener(new getFixedWidthMajor(this, new ArrayList()));
        this.setMax.addListener(new AnimatorListenerAdapter() {
            boolean getMin = false;

            public final void onAnimationCancel(Animator animator) {
                this.getMin = true;
            }

            public final void onAnimationEnd(Animator animator) {
                onForwardedEvent<T>.setMax max;
                for (Object min : getFixedHeightMinor.this.getMin.keySet()) {
                    onForwardedEvent min2 = onForwardedEvent.getMin(min);
                    getFixedHeightMinor getfixedheightminor = getFixedHeightMinor.this;
                    boolean z = this.getMin;
                    min2.setMin.remove(getfixedheightminor);
                    min2.length();
                    for (DialogTitle next : getfixedheightminor.length(min2.getMin)) {
                        if (!(min2.getMax == null || min2.getMax.getMax() == null || !min2.getMax.length(next.toDoubleRange))) {
                            min2.getMax.getMax().getMin(min2.getMin);
                        }
                        if (!z && (max = min2.setMax(next.getMax, false)) != null) {
                            max.getMax = Math.max(max.getMax - 1, 0);
                            if (max.getMax == 0) {
                                min2.IsOverlapping.remove(next.getMax);
                            }
                        }
                    }
                }
            }

            public final void onAnimationStart(Animator animator) {
                getFixedHeightMinor.this.setMax();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void setMax() {
        Float f;
        if (!this.length) {
            this.length = true;
            for (Object next : new ArrayList(this.getMin.keySet())) {
                onForwardedEvent min = onForwardedEvent.getMin(next);
                min.getMax(this);
                Collection<setMin> collection = this.getMin.get(next);
                if (collection == null) {
                    collection = new HashSet<>();
                }
                for (setMin setmin : collection) {
                    DialogTitle<T> dialogTitle = setmin.length;
                    getFixedWidthMinor getfixedwidthminor = min.length;
                    setDecorPadding setdecorpadding = getfixedwidthminor.setMax.get(dialogTitle);
                    if (setdecorpadding == null) {
                        setdecorpadding = new setDecorPadding(dialogTitle);
                        getfixedwidthminor.setMax.put(dialogTitle, setdecorpadding);
                    }
                    onForwardedEvent<T>.setMax max = min.setMax(dialogTitle.getMax, true);
                    onForwardedEvent<T>.setMax max2 = min.setMax(dialogTitle.getMax, false);
                    Float f2 = null;
                    if (max2 == null) {
                        f = null;
                    } else {
                        f = max2.getMin;
                    }
                    if (f == null || max.getMax == 0) {
                        if (dialogTitle.getMin != null) {
                            Property<T, Float> property = dialogTitle.getMin;
                            onForwardedEvent<T>.setMax max3 = min.setMax(property.getName(), false);
                            if (max3 != null) {
                                f2 = max3.getMin;
                            }
                            if (f2 == null) {
                                f2 = property.get(min.getMin);
                            }
                        }
                        if (f2 != null) {
                            dialogTitle.setMin = f2.floatValue();
                        }
                        setdecorpadding.setMin = dialogTitle.setMin;
                    } else {
                        onForwardedEvent<T>.setMax max4 = min.setMax(dialogTitle.getMax, false);
                        if (max4 != null) {
                            f2 = max4.getMin;
                        }
                        dialogTitle.setMin = f2.floatValue();
                    }
                    if (dialogTitle.setMin()) {
                        dialogTitle.length = dialogTitle.setMin + dialogTitle.values;
                    }
                    dialogTitle.hashCode = setdecorpadding;
                    max.getMax++;
                    max.getMin = Float.valueOf(dialogTitle.length);
                    setmin.setMin = setmin.length.setMin;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final Collection<DialogTitle> getMin() {
        HashSet hashSet = new HashSet(this.getMax.size());
        for (setMin setmin : this.getMax) {
            hashSet.add(setmin.length);
        }
        return hashSet;
    }

    public final int hashCode() {
        return this.setMax.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((getFixedHeightMinor) obj).setMax == this.setMax) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean length(String str, Object obj) {
        setMin setmin;
        Collection collection = this.getMin.get(obj);
        if (collection == null) {
            collection = new HashSet();
        }
        Iterator it = collection.iterator();
        while (true) {
            if (!it.hasNext()) {
                setmin = null;
                break;
            }
            setmin = (setMin) it.next();
            if (setmin.length.getMax.equals(str)) {
                break;
            }
        }
        if (setmin != null) {
            this.getMax.remove(setmin);
            Set set = this.getMin.get(setmin.length.toIntRange);
            if (set != null) {
                set.remove(setmin);
                if (set.size() == 0) {
                    this.getMin.remove(setmin.length.toIntRange);
                }
            }
        }
        Collection collection2 = this.getMin.get(obj);
        return collection2 == null || collection2.size() == 0;
    }

    /* access modifiers changed from: package-private */
    public final Collection<DialogTitle> length(Object obj) {
        Collection<setMin> collection = this.getMin.get(obj);
        if (collection == null) {
            collection = new HashSet<>();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (setMin setmin : collection) {
            arrayList.add(setmin.length);
        }
        return arrayList;
    }
}
