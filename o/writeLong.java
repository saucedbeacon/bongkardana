package o;

import java.util.List;

final class writeLong implements RedDotDrawable {
    private final writeShort setMax;

    public writeLong(writeShort writeshort) {
        this.setMax = writeshort;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getMissionsWithQuest$2((List) obj);
    }
}
