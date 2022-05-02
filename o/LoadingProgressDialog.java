package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class LoadingProgressDialog extends isHasFace implements getGaussian {
    public static final List<setAnimationInterval> toFloatRange = Collections.unmodifiableList(new ArrayList());
    boolean equals;
    public List<setAnimationInterval> isInside;

    public LoadingProgressDialog() {
        this.getMin = 67;
    }

    public LoadingProgressDialog(int i, int i2) {
        super(i, i2);
        this.getMin = 67;
    }

    public final void getMax(List<setAnimationInterval> list) {
        List<setAnimationInterval> list2 = this.isInside;
        if (list2 != null) {
            list2.clear();
        }
        for (setAnimationInterval next : list) {
            if (next != null) {
                if (this.isInside == null) {
                    this.isInside = new ArrayList();
                }
                this.isInside.add(next);
                next.getMax(this);
            } else {
                throw new IllegalArgumentException("arg cannot be null");
            }
        }
    }

    public final void Grayscale$Algorithm() {
        this.equals = true;
    }

    public final boolean invokeSuspend() {
        return this.equals;
    }
}
