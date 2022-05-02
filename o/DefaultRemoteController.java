package o;

import java.util.List;

final class DefaultRemoteController implements RedDotDrawable {
    private final List setMax;
    private final isRemoteCallExtension setMin;

    public DefaultRemoteController(isRemoteCallExtension isremotecallextension, List list) {
        this.setMin = isremotecallextension;
        this.setMax = list;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$storeSecureUserConfig$23(this.setMax, (Boolean) obj);
    }
}
