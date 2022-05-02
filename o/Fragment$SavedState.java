package o;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import java.util.Map;

public final class Fragment$SavedState implements Runnable {
    private final Map.Entry getMax;
    private final Event setMax;

    public Fragment$SavedState(Map.Entry entry, Event event) {
        this.getMax = entry;
        this.setMax = event;
    }

    public final void run() {
        ((EventHandler) this.getMax.getKey()).handle(this.setMax);
    }
}
