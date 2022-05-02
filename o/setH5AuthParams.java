package o;

import java.util.ArrayList;
import java.util.List;

public class setH5AuthParams extends setSpeed<List<setExtraBeaconDataTracker>, List<RemoteDebugUtils>> {
    /* access modifiers changed from: protected */
    public List<RemoteDebugUtils> map(List<setExtraBeaconDataTracker> list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (setExtraBeaconDataTracker map : list) {
            arrayList.add(map(map));
        }
        return arrayList;
    }

    private RemoteDebugUtils map(setExtraBeaconDataTracker setextrabeacondatatracker) {
        return new RemoteDebugUtils(setextrabeacondatatracker.getUserId(), setextrabeacondatatracker.getLoginId(), setextrabeacondatatracker.getName(), setextrabeacondatatracker.getImageUrl(), getBadgeList.getNowDateInEpoch(), setextrabeacondatatracker.getShownName(), setextrabeacondatatracker.getShownNumber());
    }
}
