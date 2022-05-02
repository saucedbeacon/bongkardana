package o;

import kotlin.jvm.functions.Function1;

final class DiagnosticsWorker implements Function1 {
    private final SystemForegroundService length;

    public DiagnosticsWorker(SystemForegroundService systemForegroundService) {
        this.length = systemForegroundService;
    }

    public final Object invoke(Object obj) {
        return this.length.isInside.onGetPayMethodError();
    }
}
