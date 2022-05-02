package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class setFaceId extends isHasFace implements getGaussian {
    public static final List<isHasFace> equals = Collections.unmodifiableList(new ArrayList());
    public int isInside;
    public List<isHasFace> toFloatRange;
    private int toIntRange;
    private boolean values;

    public setFaceId() {
        this.getMin = 66;
    }

    public setFaceId(int i) {
        super(i);
        this.getMin = 66;
    }

    public final void getMin(isHasFace ishasface) {
        if (ishasface != null) {
            if (this.toFloatRange == null) {
                this.toFloatRange = new ArrayList();
            }
            this.toFloatRange.add(ishasface);
            ishasface.getMax(this);
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final void toIntRange(int i) {
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(-826719584, oncanceled);
            onCancelLoad.getMin(-826719584, oncanceled);
        }
        this.toIntRange = i;
    }

    public final void Grayscale$Algorithm() {
        this.values = true;
    }

    public final boolean invokeSuspend() {
        return this.values;
    }
}
