package o;

import java.util.Map;
import o.InitParams;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.events.Event;

public final class uploadAll extends Event {
    private final Map<String, String> getMax;
    private final DumperOptions.Version getMin;
    private final boolean setMax;

    public uploadAll(InitParams.AnonymousClass1 r1, InitParams.AnonymousClass1 r2, boolean z, DumperOptions.Version version, Map<String, String> map) {
        super(r1, r2);
        this.setMax = z;
        this.getMin = version;
        this.getMax = map;
    }

    public final Event.ID setMin() {
        return Event.ID.DocumentStart;
    }
}
