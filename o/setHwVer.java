package o;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import org.yaml.snakeyaml.comments.CommentType;
import org.yaml.snakeyaml.events.Event;

public final class setHwVer {
    private CommentType[] getMax;
    private List<setFeVer> setMax = new ArrayList();
    private Queue<Event> setMin;

    public setHwVer(final getLastSPMPage getlastspmpage, CommentType... commentTypeArr) {
        this.setMin = new AbstractQueue<Event>() {
            public final /* synthetic */ boolean offer(Object obj) {
                return getMax();
            }

            private static boolean getMax() {
                throw new UnsupportedOperationException();
            }

            public final Iterator<Event> iterator() {
                throw new UnsupportedOperationException();
            }

            public final int size() {
                throw new UnsupportedOperationException();
            }

            public final /* synthetic */ Object peek() {
                return getlastspmpage.setMin();
            }

            public final /* synthetic */ Object poll() {
                return getlastspmpage.getMin();
            }
        };
        this.getMax = commentTypeArr;
    }

    private boolean getMax(Event event) {
        if (event != null && event.length(Event.ID.Comment)) {
            setLogCustomizeControl setlogcustomizecontrol = (setLogCustomizeControl) event;
            for (CommentType commentType : this.getMax) {
                if (setlogcustomizecontrol.getMax == commentType) {
                    return true;
                }
            }
        }
        return false;
    }

    public final List<setFeVer> getMax() {
        try {
            return this.setMax;
        } finally {
            this.setMax = new ArrayList();
        }
    }

    public final boolean setMin() {
        return this.setMax.isEmpty();
    }

    public final setHwVer setMax() {
        while (getMax(this.setMin.peek())) {
            this.setMax.add(new setFeVer((setLogCustomizeControl) this.setMin.poll()));
        }
        return this;
    }
}
