package o;

import android.view.View;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import o.FitWindowsFrameLayout;
import o.setOnFitSystemWindowsListener;

public abstract class FitWindowsFrameLayout<T extends FitWindowsFrameLayout> extends setSelector<T, View> {
    protected boolean isInside = false;
    protected boolean toIntRange = true;

    public final /* synthetic */ setSelector getMin(Object obj) {
        View view = (View) obj;
        if (this.isInside) {
            length();
        }
        return (FitWindowsFrameLayout) super.getMin(view);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ setSelector setMin(setSelector setselector) {
        FitWindowsFrameLayout fitWindowsFrameLayout = (FitWindowsFrameLayout) setselector;
        super.setMin(fitWindowsFrameLayout);
        this.toIntRange = fitWindowsFrameLayout.toIntRange;
        this.isInside = fitWindowsFrameLayout.isInside;
        return this;
    }

    public final T getMin(View view) {
        if (this.isInside) {
            length();
        }
        return (FitWindowsFrameLayout) super.getMin(view);
    }

    /* access modifiers changed from: package-private */
    public final void setMin(List<setDecorPadding<View>> list) {
        HashSet<View> hashSet = new HashSet<>(1);
        HashMap hashMap = null;
        for (setDecorPadding next : list) {
            View view = (View) next.length.toIntRange;
            hashSet.add(view);
            if (next.length.getMin != null) {
                next.length.getMin.set(view, Float.valueOf(next.setMin));
            } else {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                List list2 = (List) hashMap.get(view);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(view, list2);
                }
                list2.add(next);
            }
        }
        if (hashMap != null) {
            for (View view2 : hashMap.keySet()) {
                HashMap hashMap2 = new HashMap();
                for (setDecorPadding setdecorpadding : (List) hashMap.get(view2)) {
                    hashMap2.put(setdecorpadding.length.getMax, Float.valueOf(setdecorpadding.setMin));
                }
            }
        }
        for (View view3 : hashSet) {
            if (!ViewCompat.onTransact(view3) && !this.toIntRange) {
                view3.requestLayout();
            }
        }
    }

    /* access modifiers changed from: private */
    public T length() {
        if (this.getMax != null) {
            this.getMax.setMax = true;
        }
        this.toIntRange = true;
        this.isInside = true;
        setMin((Runnable) new LinearLayoutCompat(this));
        return this;
    }

    public final T getMax(int i) {
        if (i == 0) {
            return (FitWindowsFrameLayout) getMin(new setDividerDrawable(0, Collections.singletonList(new setOnFitSystemWindowsListener.setMax(View.ALPHA, 1.0f))));
        }
        if (i == 4) {
            return (FitWindowsFrameLayout) getMin(new setDividerDrawable(4, Collections.singletonList(new setOnFitSystemWindowsListener.setMax(View.ALPHA, 0.0f))));
        }
        if (i != 8) {
            return this;
        }
        return (FitWindowsFrameLayout) getMin(new setDividerDrawable(8, Collections.singletonList(new setOnFitSystemWindowsListener.setMax(View.ALPHA, 0.0f))));
    }
}
