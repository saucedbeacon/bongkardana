package o;

import o.InitParams;
import org.yaml.snakeyaml.events.Event;

public final class isGreaterOrEqual extends setConfigRequestTimeSpan {
    public isGreaterOrEqual(String str, InitParams.AnonymousClass1 r2, InitParams.AnonymousClass1 r3) {
        super(str, r2, r3);
        if (str == null) {
            throw new NullPointerException("anchor is not specified for alias");
        }
    }

    public final Event.ID setMin() {
        return Event.ID.Alias;
    }
}
