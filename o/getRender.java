package o;

final class getRender implements RedDotDrawable {
    private final getData length;

    public getRender(getData getdata) {
        this.length = getdata;
    }

    public final Object apply(Object obj) {
        return this.length.setSplitBillId((BridgeDSL) obj);
    }
}
