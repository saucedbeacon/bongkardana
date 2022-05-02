package o;

import org.json.JSONObject;

final class exit implements RedDotDrawable {
    public static final exit getMax = new exit();

    public final Object apply(Object obj) {
        return getPositiveString.parseObject((JSONObject) obj);
    }
}
