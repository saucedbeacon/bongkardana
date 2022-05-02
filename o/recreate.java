package o;

import org.json.JSONObject;

final class recreate implements RedDotDrawable {
    public static final recreate getMax = new recreate();

    public final Object apply(Object obj) {
        return getPositiveString.parseObject((JSONObject) obj);
    }
}
