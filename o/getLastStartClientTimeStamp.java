package o;

import o.addAnimatorUpdateListener;

final class getLastStartClientTimeStamp implements addAnimatorUpdateListener.getMax {
    private final RVAppRecord getMax;

    public getLastStartClientTimeStamp(RVAppRecord rVAppRecord) {
        this.getMax = rVAppRecord;
    }

    public final Object processFacade(Object obj) {
        return ((setSceneParams) obj).numUpdated(this.getMax);
    }
}
