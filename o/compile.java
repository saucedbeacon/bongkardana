package o;

import o.b;

public final class compile implements getAdapterPosition<ProcessUtils> {
    private final b.C0007b<asyncTraceEnd> amcsAddPayMethodConfigProvider;
    private final b.C0007b<invokeMethod> defaultAddPayMethodConfigProvider;
    private final b.C0007b<unBindStartToken> splitAddPayMethodConfigProvider;

    public compile(b.C0007b<invokeMethod> bVar, b.C0007b<asyncTraceEnd> bVar2, b.C0007b<unBindStartToken> bVar3) {
        this.defaultAddPayMethodConfigProvider = bVar;
        this.amcsAddPayMethodConfigProvider = bVar2;
        this.splitAddPayMethodConfigProvider = bVar3;
    }

    public final ProcessUtils get() {
        return newInstance(this.defaultAddPayMethodConfigProvider.get(), this.amcsAddPayMethodConfigProvider.get(), this.splitAddPayMethodConfigProvider.get());
    }

    public static compile create(b.C0007b<invokeMethod> bVar, b.C0007b<asyncTraceEnd> bVar2, b.C0007b<unBindStartToken> bVar3) {
        return new compile(bVar, bVar2, bVar3);
    }

    public static ProcessUtils newInstance(invokeMethod invokemethod, asyncTraceEnd asynctraceend, unBindStartToken unbindstarttoken) {
        return new ProcessUtils(invokemethod, asynctraceend, unbindstarttoken);
    }
}
