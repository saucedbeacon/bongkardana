package o;

import android.content.Context;
import o.b;

public final class createExtensionInstance implements getAdapterPosition<setRemoteControlManagement> {
    private final b.C0007b<Context> contextProvider;

    public createExtensionInstance(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final setRemoteControlManagement get() {
        return newInstance(this.contextProvider.get());
    }

    public static createExtensionInstance create(b.C0007b<Context> bVar) {
        return new createExtensionInstance(bVar);
    }

    public static setRemoteControlManagement newInstance(Context context) {
        return new setRemoteControlManagement(context);
    }
}
