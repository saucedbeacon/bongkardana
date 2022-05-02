package o;

import java.util.ArrayList;
import java.util.List;

public final class setDistance extends setRoundColor {
    public int equals = -1;
    public List<setRightEyeBlinkRatio> isInside = new ArrayList();
    public int toDoubleRange = -1;
    public isHasFace toFloatRange;
    public isHasFace toIntRange;
    public int values = -1;

    public setDistance() {
        this.getMin = 163;
    }

    public setDistance(int i, int i2) {
        super(i, i2);
        this.getMin = 163;
    }

    public final void setMax(List<setRightEyeBlinkRatio> list) {
        this.isInside.clear();
        for (setRightEyeBlinkRatio next : list) {
            if (next != null) {
                this.isInside.add(next);
                next.getMax(this);
            } else {
                throw new IllegalArgumentException("arg cannot be null");
            }
        }
    }
}
