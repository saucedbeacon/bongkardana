package o;

final class IBigDataConsumerReadyCallback implements RedDotDrawable {
    private final RVByteBufferManager length;

    public IBigDataConsumerReadyCallback(RVByteBufferManager rVByteBufferManager) {
        this.length = rVByteBufferManager;
    }

    public final Object apply(Object obj) {
        return this.length.apply(obj);
    }
}
