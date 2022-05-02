package o;

import o.OpenAPIBridgeExtension;
import o.PrepareException;
import o.b;

class loadTitleBarSnapshot$Grayscale$Algorithm implements b.C0007b<OpenAPIBridgeExtension.AnonymousClass1.C00041> {
    private final PrepareException.AnonymousClass1 getMin;

    loadTitleBarSnapshot$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        OpenAPIBridgeExtension.AnonymousClass1.C00041 INotificationSideChannel$Stub$Proxy = this.getMin.INotificationSideChannel$Stub$Proxy();
        if (INotificationSideChannel$Stub$Proxy != null) {
            return INotificationSideChannel$Stub$Proxy;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
