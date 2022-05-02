package o;

import o.InitParams;
import org.yaml.snakeyaml.comments.CommentType;
import org.yaml.snakeyaml.events.Event;

public final class setLogCustomizeControl extends Event {
    public final CommentType getMax;
    public final String setMax;

    public setLogCustomizeControl(CommentType commentType, String str, InitParams.AnonymousClass1 r3, InitParams.AnonymousClass1 r4) {
        super(r3, r4);
        if (commentType != null) {
            this.getMax = commentType;
            if (str != null) {
                this.setMax = str;
                return;
            }
            throw new NullPointerException("Value must be provided.");
        }
        throw new NullPointerException("Event Type must be provided.");
    }

    public final String getMax() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMax());
        sb.append("type=");
        sb.append(this.getMax);
        sb.append(", value=");
        sb.append(this.setMax);
        return sb.toString();
    }

    public final Event.ID setMin() {
        return Event.ID.Comment;
    }
}
