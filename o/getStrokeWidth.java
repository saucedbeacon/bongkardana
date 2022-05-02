package o;

import java.util.List;
import kotlin.jvm.functions.Function1;
import o.getPlatformCallback;

final class getStrokeWidth implements Function1 {
    private final getPlatformCallback.setMin getMin;
    private final String setMin;

    public getStrokeWidth(String str, getPlatformCallback.setMin setmin) {
        this.setMin = str;
        this.getMin = setmin;
    }

    public final Object invoke(Object obj) {
        return getPlatformCallback.length(this.setMin, this.getMin, (List) obj);
    }
}
