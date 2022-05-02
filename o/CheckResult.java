package o;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.ArrayList;

public final class CheckResult {
    private setMax getMax = new setMax();
    public final ArrayList<ConstraintWidget> getMin = new ArrayList<>();
    public AnimRes setMax;

    public interface getMax {
        void getMin();

        void setMax(ConstraintWidget constraintWidget, setMax setmax);
    }

    public static class setMax {
        public static int getMax = 0;
        public static int length = 1;
        public static int setMin = 2;
        public int IsOverlapping;
        public int equals;
        public ConstraintWidget.DimensionBehaviour getMin;
        public boolean hashCode;
        public int isInside;
        public ConstraintWidget.DimensionBehaviour setMax;
        public boolean toDoubleRange;
        public int toFloatRange;
        public int toIntRange;
        public int values;
    }

    public final void getMin(AnimRes animRes) {
        this.getMin.clear();
        int size = animRes.onVolumeInfoChanged.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) animRes.onVolumeInfoChanged.get(i);
            if (constraintWidget.extraCommand[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT || constraintWidget.extraCommand[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                this.getMin.add(constraintWidget);
            }
        }
        animRes.setMax.getMax = true;
    }

    public CheckResult(AnimRes animRes) {
        this.setMax = animRes;
    }

    public final void setMin(AnimRes animRes, int i, int i2) {
        int ICustomTabsCallback = animRes.ICustomTabsCallback();
        int b = animRes.b();
        animRes.toIntRange(0);
        animRes.isInside(0);
        animRes.getMax(i);
        animRes.toFloatRange(i2);
        animRes.toIntRange(ICustomTabsCallback);
        animRes.isInside(b);
        this.setMax.asInterface();
    }

    public final boolean length(getMax getmax, ConstraintWidget constraintWidget, int i) {
        int i2;
        int i3;
        boolean z = false;
        this.getMax.getMin = constraintWidget.extraCommand[0];
        this.getMax.setMax = constraintWidget.extraCommand[1];
        setMax setmax = this.getMax;
        if (constraintWidget.areNotificationsEnabled == 8) {
            i2 = 0;
        } else {
            i2 = constraintWidget.requestPostMessageChannelWithExtras;
        }
        setmax.IsOverlapping = i2;
        setMax setmax2 = this.getMax;
        if (constraintWidget.areNotificationsEnabled == 8) {
            i3 = 0;
        } else {
            i3 = constraintWidget.postMessage;
        }
        setmax2.isInside = i3;
        this.getMax.hashCode = false;
        this.getMax.values = i;
        boolean z2 = this.getMax.getMin == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z3 = this.getMax.setMax == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z4 = z2 && constraintWidget.updateVisuals > 0.0f;
        boolean z5 = z3 && constraintWidget.updateVisuals > 0.0f;
        if (z4 && constraintWidget.valueOf[0] == 4) {
            this.getMax.getMin = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z5 && constraintWidget.valueOf[1] == 4) {
            this.getMax.setMax = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        getmax.setMax(constraintWidget, this.getMax);
        constraintWidget.getMax(this.getMax.toFloatRange);
        constraintWidget.toFloatRange(this.getMax.toIntRange);
        constraintWidget.ICustomTabsCallback$Stub = this.getMax.toDoubleRange;
        int i4 = this.getMax.equals;
        constraintWidget.IPostMessageService$Stub = i4;
        if (i4 > 0) {
            z = true;
        }
        constraintWidget.ICustomTabsCallback$Stub = z;
        this.getMax.values = setMax.getMax;
        return this.getMax.hashCode;
    }
}
