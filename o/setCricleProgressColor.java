package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class setCricleProgressColor extends isHasFace {
    public static final List<setEyeBlink> toIntRange = Collections.unmodifiableList(new ArrayList());
    public List<setEyeBlink> equals;
    public isHasFace isInside;
    public int toDoubleRange = -1;
    public isHasFace toFloatRange;

    public setCricleProgressColor() {
        this.getMin = 82;
    }

    public setCricleProgressColor(int i, int i2) {
        super(i, i2);
        this.getMin = 82;
    }

    public final void length(List<setEyeBlink> list) {
        if (list == null) {
            this.equals = null;
            return;
        }
        List<setEyeBlink> list2 = this.equals;
        if (list2 != null) {
            list2.clear();
        }
        for (setEyeBlink next : list) {
            if (next != null) {
                if (this.equals == null) {
                    this.equals = new ArrayList();
                }
                this.equals.add(next);
                next.getMax(this);
            } else {
                throw new IllegalArgumentException("arg cannot be null");
            }
        }
    }
}
