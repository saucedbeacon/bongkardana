package o;

import id.dana.splitbill.model.PayerModel;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

public final class setInitTextColor extends setSpeed<List<setExtraBeaconDataTracker>, List<PayerModel>> {
    private updateHeadState getMin;

    public final /* synthetic */ Object map(Object obj) {
        List<setExtraBeaconDataTracker> list = (List) obj;
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (setExtraBeaconDataTracker setextrabeacondatatracker : list) {
            if (setextrabeacondatatracker != null) {
                arrayList.add(updateHeadState.getMax(setextrabeacondatatracker));
            }
        }
        return arrayList;
    }

    @Inject
    public setInitTextColor(updateHeadState updateheadstate) {
        this.getMin = updateheadstate;
    }
}
