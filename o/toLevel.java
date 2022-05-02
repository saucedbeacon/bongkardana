package o;

import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;

public abstract class toLevel extends setConfigRequestTimeSpan {
    public final String getMax;
    private final boolean isInside;
    public final DumperOptions.FlowStyle setMax;

    public toLevel(String str, String str2, boolean z, InitParams.AnonymousClass1 r4, InitParams.AnonymousClass1 r5, DumperOptions.FlowStyle flowStyle) {
        super(str, r4, r5);
        this.getMax = str2;
        this.isInside = z;
        if (flowStyle != null) {
            this.setMax = flowStyle;
            return;
        }
        throw new NullPointerException("Flow style must be provided.");
    }

    public final boolean length() {
        return this.isInside;
    }

    public final String getMax() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMax());
        sb.append(", tag=");
        sb.append(this.getMax);
        sb.append(", implicit=");
        sb.append(this.isInside);
        return sb.toString();
    }
}
