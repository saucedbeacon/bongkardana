package o;

import java.util.Comparator;

final class GriverPageConfiguration implements Comparator {
    private final GriverParams setMin;

    public GriverPageConfiguration(GriverParams griverParams) {
        this.setMin = griverParams;
    }

    public final int compare(Object obj, Object obj2) {
        return GriverParams.setMin((getIcontype) obj, (getIcontype) obj2);
    }
}
