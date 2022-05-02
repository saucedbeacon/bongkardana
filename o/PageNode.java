package o;

final class PageNode implements RedDotDrawable {
    private final APWebSettings length;

    public PageNode(APWebSettings aPWebSettings) {
        this.length = aPWebSettings;
    }

    public final Object apply(Object obj) {
        return getData.lambda$generateSplitBillQrDeepLink$5(this.length, (Long) obj);
    }
}
