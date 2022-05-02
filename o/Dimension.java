package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class Dimension {
    static int length;
    ArrayList<setMin> equals = null;
    int getMax = 0;
    int getMin = -1;
    boolean setMax = false;
    ArrayList<ConstraintWidget> setMin = new ArrayList<>();
    private int toIntRange = -1;

    public Dimension(int i) {
        int i2 = length;
        length = i2 + 1;
        this.getMin = i2;
        this.getMax = i;
    }

    public final boolean setMax(ConstraintWidget constraintWidget) {
        if (this.setMin.contains(constraintWidget)) {
            return false;
        }
        this.setMin.add(constraintWidget);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.getMax;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.getMin);
        sb.append("] <");
        String obj = sb.toString();
        Iterator<ConstraintWidget> it = this.setMin.iterator();
        while (it.hasNext()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" ");
            sb2.append(it.next().ITrustedWebActivityService);
            obj = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(" >");
        return sb3.toString();
    }

    public final void setMax(int i, Dimension dimension) {
        Iterator<ConstraintWidget> it = this.setMin.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            dimension.setMax(next);
            if (i == 0) {
                next.MediaBrowserCompat$MediaItem$Flags = dimension.getMin;
            } else {
                next.MediaDescriptionCompat = dimension.getMin;
            }
        }
        this.toIntRange = dimension.getMin;
    }

    /* access modifiers changed from: package-private */
    public final int setMax(reportFullyDrawn reportfullydrawn, ArrayList<ConstraintWidget> arrayList, int i) {
        int max;
        int max2;
        AnimRes animRes = (AnimRes) arrayList.get(0).requestPostMessageChannel;
        reportfullydrawn.getMax();
        animRes.setMin(reportfullydrawn, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).setMin(reportfullydrawn, false);
        }
        if (i == 0 && animRes.MediaMetadataCompat$BitmapKey > 0) {
            ActivityResultRegistry$1.getMax(animRes, reportfullydrawn, arrayList, 0);
        }
        if (i == 1 && animRes.MediaMetadataCompat > 0) {
            ActivityResultRegistry$1.getMax(animRes, reportfullydrawn, arrayList, 1);
        }
        try {
            reportfullydrawn.setMin();
        } catch (Exception unused) {
        }
        this.equals = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.equals.add(new setMin(arrayList.get(i3), i));
        }
        if (i == 0) {
            max = reportFullyDrawn.getMax((Object) animRes.ICustomTabsCallback$Default);
            max2 = reportFullyDrawn.getMax((Object) animRes.ICustomTabsCallback$Stub$Proxy);
            reportfullydrawn.getMax();
        } else {
            max = reportFullyDrawn.getMax((Object) animRes.setDefaultImpl);
            max2 = reportFullyDrawn.getMax((Object) animRes.getInterfaceDescriptor);
            reportfullydrawn.getMax();
        }
        return max2 - max;
    }

    public final void length(ArrayList<Dimension> arrayList) {
        int size = this.setMin.size();
        if (this.toIntRange != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                Dimension dimension = arrayList.get(i);
                if (this.toIntRange == dimension.getMin) {
                    setMax(this.getMax, dimension);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    class setMin {
        int equals;
        int getMax;
        WeakReference<ConstraintWidget> getMin;
        int isInside;
        int length;
        int setMax;
        int setMin;

        public setMin(ConstraintWidget constraintWidget, int i) {
            this.getMin = new WeakReference<>(constraintWidget);
            this.setMax = reportFullyDrawn.getMax((Object) constraintWidget.ICustomTabsCallback$Default);
            this.setMin = reportFullyDrawn.getMax((Object) constraintWidget.setDefaultImpl);
            this.length = reportFullyDrawn.getMax((Object) constraintWidget.ICustomTabsCallback$Stub$Proxy);
            this.getMax = reportFullyDrawn.getMax((Object) constraintWidget.getInterfaceDescriptor);
            this.equals = reportFullyDrawn.getMax((Object) constraintWidget.getDefaultImpl);
            this.isInside = i;
        }
    }
}
