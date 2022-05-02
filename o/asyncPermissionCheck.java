package o;

import java.util.List;

final class asyncPermissionCheck implements RedDotDrawable {
    private final hasNext getMax;

    public asyncPermissionCheck(hasNext hasnext) {
        this.getMax = hasnext;
    }

    public final Object apply(Object obj) {
        return this.getMax.apply((List<RemoteNormalExtensionInvoker>) (List) obj);
    }
}
