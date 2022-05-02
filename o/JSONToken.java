package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class JSONToken implements getAdapterPosition<setTimeoutForContext> {
    private final ApplicationModule getMin;
    private final b.C0007b<ResolveExtensionInvoker> length;

    private JSONToken(ApplicationModule applicationModule, b.C0007b<ResolveExtensionInvoker> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static JSONToken setMax(ApplicationModule applicationModule, b.C0007b<ResolveExtensionInvoker> bVar) {
        return new JSONToken(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setTimeoutForContext min = this.getMin.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
