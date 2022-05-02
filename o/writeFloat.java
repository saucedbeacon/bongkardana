package o;

import java.util.List;

final class writeFloat implements RedDotDrawable {
    private final List setMin;

    public writeFloat(List list) {
        this.setMin = list;
    }

    public final Object apply(Object obj) {
        return writeShort.lambda$getMissionsWithQuest$1(this.setMin, (Object[]) obj);
    }
}
