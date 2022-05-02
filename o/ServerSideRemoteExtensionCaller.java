package o;

import java.util.LinkedHashMap;

final class ServerSideRemoteExtensionCaller implements RedDotDrawable {
    private final setStartParams getMin;

    public ServerSideRemoteExtensionCaller(setStartParams setstartparams) {
        this.getMin = setstartparams;
    }

    public final Object apply(Object obj) {
        return this.getMin.transform((LinkedHashMap<String, LinkedHashMap<String, getActivityClz>>) (LinkedHashMap) obj);
    }
}
