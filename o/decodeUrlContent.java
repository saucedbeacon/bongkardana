package o;

import o.GriverDecodeUrl;
import o.b;

public final class decodeUrlContent implements getAdapterPosition<setPageConfiguration> {
    private final b.C0007b<GriverDecodeUrl.getMin> getMin;
    private final b.C0007b<setVerticalScrollbarOverlay> length;
    private final b.C0007b<execJavaScript> setMax;

    private decodeUrlContent(b.C0007b<GriverDecodeUrl.getMin> bVar, b.C0007b<execJavaScript> bVar2, b.C0007b<setVerticalScrollbarOverlay> bVar3) {
        this.getMin = bVar;
        this.setMax = bVar2;
        this.length = bVar3;
    }

    public static decodeUrlContent getMax(b.C0007b<GriverDecodeUrl.getMin> bVar, b.C0007b<execJavaScript> bVar2, b.C0007b<setVerticalScrollbarOverlay> bVar3) {
        return new decodeUrlContent(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new setPageConfiguration(this.getMin.get(), this.setMax.get(), this.length.get());
    }
}
