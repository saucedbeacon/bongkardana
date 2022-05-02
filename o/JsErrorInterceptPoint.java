package o;

import o.b;

public final class JsErrorInterceptPoint implements getAdapterPosition<NativeCallResultPoint> {
    private final b.C0007b<PageBackInterceptPoint> ocrEntityDataFactoryProvider;

    public JsErrorInterceptPoint(b.C0007b<PageBackInterceptPoint> bVar) {
        this.ocrEntityDataFactoryProvider = bVar;
    }

    public final NativeCallResultPoint get() {
        return newInstance(this.ocrEntityDataFactoryProvider.get());
    }

    public static JsErrorInterceptPoint create(b.C0007b<PageBackInterceptPoint> bVar) {
        return new JsErrorInterceptPoint(bVar);
    }

    public static NativeCallResultPoint newInstance(PageBackInterceptPoint pageBackInterceptPoint) {
        return new NativeCallResultPoint(pageBackInterceptPoint);
    }
}
