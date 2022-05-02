package o;

import o.InitParams;
import org.yaml.snakeyaml.events.Event;

public final class getLogCustomizeControl extends Event {
    private final boolean getMax;

    public getLogCustomizeControl(InitParams.AnonymousClass1 r1, InitParams.AnonymousClass1 r2, boolean z) {
        super(r1, r2);
        this.getMax = z;
    }

    public final Event.ID setMin() {
        return Event.ID.DocumentEnd;
    }
}
