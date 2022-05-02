package o;

final class filter implements RedDotDrawable {
    private final String length;
    private final String setMax;
    private final getNodeExtensionMap setMin;

    public filter(getNodeExtensionMap getnodeextensionmap, String str, String str2) {
        this.setMin = getnodeextensionmap;
        this.length = str;
        this.setMax = str2;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$decodeQrBarcode$2(this.length, this.setMax, (Long) obj);
    }
}
