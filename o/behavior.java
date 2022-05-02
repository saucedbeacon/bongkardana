package o;

import java.util.List;

final class behavior implements RedDotDrawable {
    private final GriverAMCSLiteAppUpdater setMin;

    public behavior(GriverAMCSLiteAppUpdater griverAMCSLiteAppUpdater) {
        this.setMin = griverAMCSLiteAppUpdater;
    }

    public final Object apply(Object obj) {
        return this.setMin.setCdpContents((List) obj);
    }
}
