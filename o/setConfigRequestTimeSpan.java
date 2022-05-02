package o;

import o.InitParams;
import org.yaml.snakeyaml.events.Event;

public abstract class setConfigRequestTimeSpan extends Event {
    public final String getMin;

    public setConfigRequestTimeSpan(String str, InitParams.AnonymousClass1 r2, InitParams.AnonymousClass1 r3) {
        super(r2, r3);
        this.getMin = str;
    }

    public String getMax() {
        StringBuilder sb = new StringBuilder("anchor=");
        sb.append(this.getMin);
        return sb.toString();
    }
}
