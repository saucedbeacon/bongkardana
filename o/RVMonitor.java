package o;

import id.dana.data.content.mapper.SpaceResultMapper;

final class RVMonitor implements RedDotDrawable {
    private final SpaceResultMapper setMin;

    public RVMonitor(SpaceResultMapper spaceResultMapper) {
        this.setMin = spaceResultMapper;
    }

    public final Object apply(Object obj) {
        return this.setMin.apply(obj);
    }
}
