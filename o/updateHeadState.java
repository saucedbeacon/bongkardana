package o;

import id.dana.model.CurrencyAmountModel;
import id.dana.splitbill.model.PayerModel;

public final class updateHeadState extends setSpeed<setExtraBeaconDataTracker, PayerModel> {
    public final /* synthetic */ Object map(Object obj) {
        return getMax((setExtraBeaconDataTracker) obj);
    }

    protected static PayerModel getMax(setExtraBeaconDataTracker setextrabeacondatatracker) {
        if (setextrabeacondatatracker == null) {
            return null;
        }
        return new PayerModel(setextrabeacondatatracker.getImageUrl(), new CurrencyAmountModel(setextrabeacondatatracker.getFundAmount(), "Rp"), setextrabeacondatatracker.getLoginId(), setextrabeacondatatracker.getName(), setextrabeacondatatracker.getUserId(), setextrabeacondatatracker.getStatus());
    }
}
