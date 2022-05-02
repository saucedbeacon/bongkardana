package o;

import o.b;

public final class NativeCallDispatchPoint implements getAdapterPosition<PageBackInterceptPoint> {
    private final b.C0007b<RVBridgeInterceptProxy> firebaseVisionOcrDataProvider;

    public NativeCallDispatchPoint(b.C0007b<RVBridgeInterceptProxy> bVar) {
        this.firebaseVisionOcrDataProvider = bVar;
    }

    public final PageBackInterceptPoint get() {
        return newInstance(this.firebaseVisionOcrDataProvider.get());
    }

    public static NativeCallDispatchPoint create(b.C0007b<RVBridgeInterceptProxy> bVar) {
        return new NativeCallDispatchPoint(bVar);
    }

    public static PageBackInterceptPoint newInstance(RVBridgeInterceptProxy rVBridgeInterceptProxy) {
        return new PageBackInterceptPoint(rVBridgeInterceptProxy);
    }
}
