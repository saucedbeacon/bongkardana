package o;

import java.util.ArrayList;
import java.util.List;

public final class F2fPayChannelView extends setRoundColor {
    public List<NotProguard> equals = new ArrayList();
    public isHasFace isInside;
    public int toDoubleRange = -1;
    public int toFloatRange = -1;
    public isHasFace toIntRange;
    public int values = -1;

    public F2fPayChannelView() {
        this.getMin = 158;
    }

    public F2fPayChannelView(int i, int i2) {
        super(i, i2);
        this.getMin = 158;
    }

    public final void setMin(List<NotProguard> list) {
        this.equals.clear();
        for (NotProguard next : list) {
            if (next != null) {
                this.equals.add(next);
                next.getMax(this);
            } else {
                throw new IllegalArgumentException("arg cannot be null");
            }
        }
    }
}
