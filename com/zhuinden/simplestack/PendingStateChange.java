package com.zhuinden.simplestack;

import java.util.List;
import o.viewNeedsUpdate;

public class PendingStateChange {
    public viewNeedsUpdate.getMax completionCallback;
    public boolean didForceExecute = false;
    public final int direction;
    public final boolean initialization;
    public final List<?> newHistory;
    private Status status = Status.ENQUEUED;

    public enum Status {
        ENQUEUED,
        IN_PROGRESS,
        COMPLETED
    }

    public PendingStateChange(List<?> list, int i, boolean z) {
        this.newHistory = list;
        this.direction = i;
        this.initialization = z;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status2) {
        if (status2 == null) {
            throw new NullPointerException("Status of pending state change cannot be null!");
        } else if (status2.ordinal() >= this.status.ordinal()) {
            this.status = status2;
        } else {
            StringBuilder sb = new StringBuilder("A pending state change cannot go to one of its previous states: [");
            sb.append(this.status);
            sb.append("] to [");
            sb.append(status2);
            sb.append("]");
            throw new IllegalStateException(sb.toString());
        }
    }
}
