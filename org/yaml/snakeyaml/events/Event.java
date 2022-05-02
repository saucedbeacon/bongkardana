package org.yaml.snakeyaml.events;

import com.j256.ormlite.stmt.query.SimpleComparison;
import o.InitParams;

public abstract class Event {
    public final InitParams.AnonymousClass1 length;
    public final InitParams.AnonymousClass1 setMin;

    public enum ID {
        Alias,
        Comment,
        DocumentEnd,
        DocumentStart,
        MappingEnd,
        MappingStart,
        Scalar,
        SequenceEnd,
        SequenceStart,
        StreamEnd,
        StreamStart
    }

    public String getMax() {
        return "";
    }

    public abstract ID setMin();

    public Event(InitParams.AnonymousClass1 r1, InitParams.AnonymousClass1 r2) {
        this.length = r1;
        this.setMin = r2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(SimpleComparison.LESS_THAN_OPERATION);
        sb.append(getClass().getName());
        sb.append("(");
        sb.append(getMax());
        sb.append(")>");
        return sb.toString();
    }

    public final boolean length(ID id2) {
        return setMin() == id2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Event) {
            return toString().equals(obj.toString());
        }
        return false;
    }

    public int hashCode() {
        return toString().hashCode();
    }
}
