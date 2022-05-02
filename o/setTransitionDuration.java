package o;

public final class setTransitionDuration implements setOnShow<int[]> {
    public final String getMin() {
        return "IntegerArrayPool";
    }

    public final int setMax() {
        return 4;
    }

    public final /* bridge */ /* synthetic */ int getMin(Object obj) {
        return ((int[]) obj).length;
    }

    public final /* bridge */ /* synthetic */ Object length(int i) {
        return new int[i];
    }
}
