package o;

import java.util.concurrent.Callable;

final class DefaultRemoteControlManagement implements Callable {
    private final isRemoteCallExtension setMax;

    public DefaultRemoteControlManagement(isRemoteCallExtension isremotecallextension) {
        this.setMax = isremotecallextension;
    }

    public final Object call() {
        return this.setMax.lambda$getRecentRecipient$1();
    }
}
