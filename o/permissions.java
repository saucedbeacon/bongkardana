package o;

import java.util.Arrays;

final class permissions implements RedDotDrawable {
    public static final permissions getMax = new permissions();

    public final Object apply(Object obj) {
        return Arrays.asList((Object[]) obj);
    }
}
