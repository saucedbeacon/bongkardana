package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class getIntegrity extends isHasFace {
    protected static final List<isHasFace> isInside = Collections.unmodifiableList(new ArrayList());
    protected int equals = -1;
    protected List<isHasFace> toFloatRange;
    protected isHasFace toIntRange;
    protected int values = -1;

    public getIntegrity() {
        this.getMin = 38;
    }

    public getIntegrity(int i) {
        super(i);
        this.getMin = 38;
    }

    public final isHasFace invoke() {
        return this.toIntRange;
    }

    public final void setMin(isHasFace ishasface) {
        if (ishasface != null) {
            this.toIntRange = ishasface;
            ishasface.getMax(this);
            return;
        }
        throw new IllegalArgumentException("arg cannot be null");
    }

    public final List<isHasFace> invokeSuspend() {
        List<isHasFace> list = this.toFloatRange;
        return list != null ? list : isInside;
    }

    public final void setMin(List<isHasFace> list) {
        if (list == null) {
            this.toFloatRange = null;
            return;
        }
        List<isHasFace> list2 = this.toFloatRange;
        if (list2 != null) {
            list2.clear();
        }
        for (isHasFace next : list) {
            if (next != null) {
                if (this.toFloatRange == null) {
                    this.toFloatRange = new ArrayList();
                }
                this.toFloatRange.add(next);
                next.getMax(this);
            } else {
                throw new IllegalArgumentException("arg cannot be null");
            }
        }
    }

    public final void toIntRange(int i) {
        this.equals = i;
    }

    public final void toString(int i) {
        this.values = i;
    }

    public final void getMax(int i, int i2) {
        this.equals = i;
        this.values = i2;
    }
}
