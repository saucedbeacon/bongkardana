package o;

import id.dana.di.modules.SplitModule;
import o.sendLocation;

public final class GriverUserAgentExtension implements getAdapterPosition<sendLocation.setMin> {
    private final SplitModule getMax;

    private GriverUserAgentExtension(SplitModule splitModule) {
        this.getMax = splitModule;
    }

    public static GriverUserAgentExtension getMax(SplitModule splitModule) {
        return new GriverUserAgentExtension(splitModule);
    }

    public final /* synthetic */ Object get() {
        sendLocation.setMin length = this.getMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
