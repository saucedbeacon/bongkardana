package o;

import java.util.Map;
import kotlin.jvm.functions.Function1;

final class Visibility implements Function1 {
    private final Map getMax;
    private final getMode length;
    private final String setMin;

    final class Mode implements Function1 {
        public static final Mode getMin = new Mode();

        public final Object invoke(Object obj) {
            return null;
        }
    }

    public Visibility(getMode getmode, Map map, String str) {
        this.length = getmode;
        this.getMax = map;
        this.setMin = str;
    }

    public final Object invoke(Object obj) {
        getMode getmode = this.length;
        new removeListener(getmode.setMin, this.getMax, this.setMin, ((Boolean) obj).booleanValue());
        return null;
    }
}
