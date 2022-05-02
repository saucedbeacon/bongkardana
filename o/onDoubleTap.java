package o;

import javax.inject.Inject;

public final class onDoubleTap extends setSpeed<resourceTypeMonitor, onScaleEnd> {
    onDoubleTapEvent getMin;

    public final /* synthetic */ Object map(Object obj) {
        resourceTypeMonitor resourcetypemonitor = (resourceTypeMonitor) obj;
        if (resourcetypemonitor == null) {
            return null;
        }
        onScaleEnd onscaleend = new onScaleEnd();
        onscaleend.getMin = onDoubleTapEvent.getMax(resourcetypemonitor.getPromoList());
        onscaleend.getMax = resourcetypemonitor.isHasMore();
        return onscaleend;
    }

    @Inject
    public onDoubleTap(onDoubleTapEvent ondoubletapevent) {
        this.getMin = ondoubletapevent;
    }
}
