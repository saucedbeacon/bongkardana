package o;

import java.util.Map;

final class getJSONArray implements RedDotDrawable {
    public static final getJSONArray setMax = new getJSONArray();

    public final Object apply(Object obj) {
        return ((Map) obj).entrySet();
    }
}
