package o;

import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.events.Event;

public final class appendLogEvent extends setConfigRequestTimeSpan {
    public final LogContext IsOverlapping;
    public final String equals;
    public final String getMax;
    public final DumperOptions.ScalarStyle setMax;

    public appendLogEvent(String str, String str2, LogContext logContext, String str3, InitParams.AnonymousClass1 r5, InitParams.AnonymousClass1 r6, DumperOptions.ScalarStyle scalarStyle) {
        super(str, r5, r6);
        this.getMax = str2;
        this.IsOverlapping = logContext;
        if (str3 != null) {
            this.equals = str3;
            if (scalarStyle != null) {
                this.setMax = scalarStyle;
                return;
            }
            throw new NullPointerException("Style must be provided.");
        }
        throw new NullPointerException("Value must be provided.");
    }

    public final String getMax() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMax());
        sb.append(", tag=");
        sb.append(this.getMax);
        sb.append(", ");
        sb.append(this.IsOverlapping);
        sb.append(", value=");
        sb.append(this.equals);
        return sb.toString();
    }

    public final Event.ID setMin() {
        return Event.ID.Scalar;
    }
}
