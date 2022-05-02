package o;

import java.util.Iterator;

public final class createEvent extends createNodeForChild implements invalidateVirtualView {
    private long getMax;
    private final createEventForHost setMin;

    public createEvent() {
        this((obtainAccessibilityNodeInfo) null);
    }

    public createEvent(obtainAccessibilityNodeInfo obtainaccessibilitynodeinfo) {
        this.getMax = Long.MIN_VALUE;
        createEventForHost createeventforhost = new createEventForHost();
        this.setMin = createeventforhost;
        if (obtainaccessibilitynodeinfo == null) {
            return;
        }
        if (obtainaccessibilitynodeinfo != null) {
            createeventforhost.setMax = obtainaccessibilitynodeinfo;
            return;
        }
        throw new IllegalArgumentException("springConfig is required");
    }

    public final float setMin(long j) {
        createEvent createevent = this;
        long j2 = j;
        if (createevent.getMax == Long.MIN_VALUE) {
            createevent.getMax = j2;
            float f = createevent.getMax("initial").setMax;
            float f2 = createevent.getMax(TtmlNode.END).setMax;
            createEventForHost createeventforhost = createevent.setMin;
            double d = (double) f;
            createeventforhost.equals = d;
            createeventforhost.setMin.setMax = d;
            Iterator<Object> it = createeventforhost.IsOverlapping.iterator();
            while (it.hasNext()) {
                it.next();
            }
            createeventforhost.isInside = createeventforhost.setMin.setMax;
            createeventforhost.length.setMax = createeventforhost.setMin.setMax;
            createeventforhost.setMin.getMax = 0.0d;
            createevent.setMin.setMax((double) f2);
            return f;
        }
        float f3 = createevent.getMax(TtmlNode.END).setMax;
        createevent.setMin.setMax((double) f3);
        if (getMin()) {
            return f3;
        }
        double d2 = (double) (j2 - createevent.getMax);
        Double.isNaN(d2);
        double d3 = d2 / 1.0E9d;
        createEventForHost createeventforhost2 = createevent.setMin;
        boolean min = createeventforhost2.setMin();
        if (!min || !createeventforhost2.toIntRange) {
            if (d3 > 0.064d) {
                d3 = 0.064d;
            }
            createeventforhost2.toFloatRange += d3;
            double d4 = createeventforhost2.setMax.length;
            double d5 = createeventforhost2.setMax.getMax;
            double d6 = createeventforhost2.setMin.setMax;
            double d7 = createeventforhost2.setMin.getMax;
            double d8 = d6;
            double d9 = createeventforhost2.length.setMax;
            double d10 = createeventforhost2.length.getMax;
            while (createeventforhost2.toFloatRange >= 0.001d) {
                createeventforhost2.toFloatRange -= 0.001d;
                if (createeventforhost2.toFloatRange < 0.001d) {
                    createeventforhost2.getMax.setMax = d8;
                    createeventforhost2.getMax.getMax = d7;
                }
                double d11 = ((createeventforhost2.isInside - d9) * d4) - (d5 * d7);
                double d12 = d7 + (d11 * 0.001d * 0.5d);
                double d13 = d11;
                double d14 = ((createeventforhost2.isInside - (((d7 * 0.001d) * 0.5d) + d8)) * d4) - (d5 * d12);
                double d15 = d7 + (d14 * 0.001d * 0.5d);
                double d16 = d14;
                double d17 = ((createeventforhost2.isInside - (((d12 * 0.001d) * 0.5d) + d8)) * d4) - (d5 * d15);
                d9 = (d15 * 0.001d) + d8;
                double d18 = d7 + (d17 * 0.001d);
                d8 += (d7 + ((d12 + d15) * 2.0d) + d18) * 0.16666666666666666d * 0.001d;
                d7 += (d13 + ((d16 + d17) * 2.0d) + (((createeventforhost2.isInside - d9) * d4) - (d5 * d18))) * 0.16666666666666666d * 0.001d;
                d10 = d18;
            }
            double d19 = d8;
            createeventforhost2.length.setMax = d9;
            createeventforhost2.length.getMax = d10;
            createeventforhost2.setMin.setMax = d8;
            createeventforhost2.setMin.getMax = d7;
            if (createeventforhost2.toFloatRange > 0.0d) {
                double d20 = createeventforhost2.toFloatRange / 0.001d;
                double d21 = 1.0d - d20;
                createeventforhost2.setMin.setMax = (createeventforhost2.setMin.setMax * d20) + (createeventforhost2.getMax.setMax * d21);
                createeventforhost2.setMin.getMax = (createeventforhost2.setMin.getMax * d20) + (createeventforhost2.getMax.getMax * d21);
            }
            if (createeventforhost2.setMin() || (createeventforhost2.getMin && createeventforhost2.setMax())) {
                if (d4 > 0.0d) {
                    createeventforhost2.equals = createeventforhost2.isInside;
                    createeventforhost2.setMin.setMax = createeventforhost2.isInside;
                } else {
                    createeventforhost2.isInside = createeventforhost2.setMin.setMax;
                    createeventforhost2.equals = createeventforhost2.isInside;
                }
                if (0.0d != createeventforhost2.setMin.getMax) {
                    createeventforhost2.setMin.getMax = 0.0d;
                }
                min = true;
            }
            if (createeventforhost2.toIntRange) {
                createeventforhost2.toIntRange = false;
            }
            if (min) {
                createeventforhost2.toIntRange = true;
            }
            Iterator<Object> it2 = createeventforhost2.IsOverlapping.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            createevent = this;
            j2 = j;
        }
        createevent.getMax = j2;
        return (float) createevent.setMin.setMin.setMax;
    }

    public final boolean getMin() {
        return this.setMin.setMin();
    }
}
