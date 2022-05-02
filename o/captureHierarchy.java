package o;

import o.b;

public final class captureHierarchy implements getAdapterPosition<getTransitionValues> {
    private final b.C0007b<openInBrowser> getMax;
    private final b.C0007b<queryAppInfo> length;

    private captureHierarchy(b.C0007b<queryAppInfo> bVar, b.C0007b<openInBrowser> bVar2) {
        this.length = bVar;
        this.getMax = bVar2;
    }

    public static captureHierarchy length(b.C0007b<queryAppInfo> bVar, b.C0007b<openInBrowser> bVar2) {
        return new captureHierarchy(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new getTransitionValues(this.length.get(), this.getMax.get());
    }
}
