package o;

final class ExtensionFilter implements RedDotDrawable {
    private final toJSONString length;

    public ExtensionFilter(toJSONString tojsonstring) {
        this.length = tojsonstring;
    }

    public final Object apply(Object obj) {
        return getNodeExtensionMap.lambda$onScanSelf$3(this.length, (String) obj);
    }
}
