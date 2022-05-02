package o;

import java.util.LinkedHashMap;

final class remoteCall implements RedDotDrawable {
    private final isReceivedRemoteReady getMax;

    public remoteCall(isReceivedRemoteReady isreceivedremoteready) {
        this.getMax = isreceivedremoteready;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$getSettingsByKey$0((LinkedHashMap) obj);
    }
}
