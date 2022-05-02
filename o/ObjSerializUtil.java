package o;

import java.util.concurrent.Callable;

final class ObjSerializUtil implements Callable {
    private final String getMax;
    private final deserializ setMin;

    public ObjSerializUtil(deserializ deserializ, String str) {
        this.setMin = deserializ;
        this.getMax = str;
    }

    public final Object call() {
        return this.setMin.lambda$getUserLastCoordinate$0(this.getMax);
    }
}
