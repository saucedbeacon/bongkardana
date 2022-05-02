package o;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class releaseTempRect implements setGuidelinePercent {
    public final Set<layoutChildWithAnchor<?>> getMax = Collections.newSetFromMap(new WeakHashMap());

    public final void setMax() {
        for (T max : getDependents.getMin(this.getMax)) {
            max.setMax();
        }
    }

    public final void getMin() {
        for (T min : getDependents.getMin(this.getMax)) {
            min.getMin();
        }
    }

    public final void setMin() {
        for (T min : getDependents.getMin(this.getMax)) {
            min.setMin();
        }
    }
}
