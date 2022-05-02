package o;

import android.content.Context;
import id.dana.DanaApplication;
import java.util.concurrent.Callable;

public final class setFlags implements Callable {
    private final DanaApplication getMin;
    private final Context setMin;

    public setFlags(DanaApplication danaApplication, Context context) {
        this.getMin = danaApplication;
        this.setMin = context;
    }

    public final Object call() {
        return DanaApplication.getMax(this.getMin, this.setMin);
    }
}
