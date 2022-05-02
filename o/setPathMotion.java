package o;

import id.dana.model.ThirdPartyService;
import kotlin.jvm.functions.Function1;

final class setPathMotion implements Function1 {
    private final ThirdPartyService getMax;
    private final setEpicenterCallback setMin;

    public setPathMotion(setEpicenterCallback setepicentercallback, ThirdPartyService thirdPartyService) {
        this.setMin = setepicentercallback;
        this.getMax = thirdPartyService;
    }

    public final Object invoke(Object obj) {
        setEpicenterCallback setepicentercallback = this.setMin;
        setepicentercallback.getMin.setMax(this.getMax.toIntRange, ((SplashEntryInfo) obj).getAuthCode(), setepicentercallback.length.getDeviceUUID());
        return null;
    }
}
