package o;

import kotlin.jvm.functions.Function1;
import o.GriverShareExtensionImpl;

final class sendShareResult implements Function1 {
    private final GriverShareExtensionImpl.AnonymousClass3 setMax;

    public sendShareResult(GriverShareExtensionImpl.AnonymousClass3 r1) {
        this.setMax = r1;
    }

    public final Object invoke(Object obj) {
        return GriverShareExtensionImpl.AnonymousClass3.getMax(this.setMax, (GriverButtonStyleExtension) obj);
    }
}
