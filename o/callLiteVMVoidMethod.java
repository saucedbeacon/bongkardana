package o;

public class callLiteVMVoidMethod {
    private final long estimatedSizeInBytes;
    private final int impressionsPerPush;

    public callLiteVMVoidMethod(int i, long j) {
        this.impressionsPerPush = i;
        this.estimatedSizeInBytes = j;
    }

    public int getImpressionsPerPush() {
        return this.impressionsPerPush;
    }

    public long getEstimatedSizeInBytes() {
        return this.estimatedSizeInBytes;
    }
}
