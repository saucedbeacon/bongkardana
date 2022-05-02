package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class charAt implements getAdapterPosition<GriverEnv> {
    private final b.C0007b<sendMsgToServerByApp> getMax;
    private final ApplicationModule setMax;

    private charAt(ApplicationModule applicationModule, b.C0007b<sendMsgToServerByApp> bVar) {
        this.setMax = applicationModule;
        this.getMax = bVar;
    }

    public static charAt length(ApplicationModule applicationModule, b.C0007b<sendMsgToServerByApp> bVar) {
        return new charAt(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverEnv length = this.setMax.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
