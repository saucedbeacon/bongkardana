package o;

import o.InitParams;
import org.yaml.snakeyaml.events.Event;

public final class setMaxLogSize extends LogCategory {
    public setMaxLogSize(InitParams.AnonymousClass1 r1, InitParams.AnonymousClass1 r2) {
        super(r1, r2);
    }

    public final Event.ID setMin() {
        return Event.ID.MappingEnd;
    }
}
