package o;

final class setExtensionSorter implements removeStateDidChangeHandler {
    private final setExtensionFilter length;
    private final String setMin;

    public setExtensionSorter(setExtensionFilter setextensionfilter, String str) {
        this.length = setextensionfilter;
        this.setMin = str;
    }

    public final void getMax() {
        this.length.lambda$decrementFreeTransferCount$1(this.setMin);
    }
}
