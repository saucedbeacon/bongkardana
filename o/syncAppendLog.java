package o;

import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.events.Event;

public final class syncAppendLog extends toLevel {
    public syncAppendLog(String str, String str2, boolean z, InitParams.AnonymousClass1 r4, InitParams.AnonymousClass1 r5, DumperOptions.FlowStyle flowStyle) {
        super(str, str2, z, r4, r5, flowStyle);
    }

    public final Event.ID setMin() {
        return Event.ID.SequenceStart;
    }
}
