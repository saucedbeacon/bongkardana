package o;

import java.util.List;

final class check implements RedDotDrawable {
    private final addExtraData length;

    public check(addExtraData addextradata) {
        this.length = addextradata;
    }

    public final Object apply(Object obj) {
        return this.length.apply((List) obj);
    }
}
