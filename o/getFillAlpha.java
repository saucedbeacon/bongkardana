package o;

import java.util.Set;
import kotlin.jvm.functions.Function1;
import o.getPlatformCallback;

final class getFillAlpha implements Function1 {
    private final String getMax;
    private final getPlatformCallback.setMax setMax;

    public getFillAlpha(String str, getPlatformCallback.setMax setmax) {
        this.getMax = str;
        this.setMax = setmax;
    }

    public final Object invoke(Object obj) {
        return getPlatformCallback.length(this.getMax, this.setMax, (Set) obj);
    }
}
