package o;

public final class updateState implements setOnShow<byte[]> {
    public final String getMin() {
        return "ByteArrayPool";
    }

    public final int setMax() {
        return 1;
    }

    public final /* bridge */ /* synthetic */ int getMin(Object obj) {
        return ((byte[]) obj).length;
    }

    public final /* synthetic */ Object length(int i) {
        return setMax(i);
    }

    private static byte[] setMax(int i) {
        return new byte[i];
    }
}
