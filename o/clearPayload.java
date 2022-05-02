package o;

import android.content.Context;
import id.dana.DanaApplication;
import java.util.concurrent.Callable;

public final class clearPayload implements Callable {
    private final Context getMin;
    private final DanaApplication setMin;

    public clearPayload(DanaApplication danaApplication, Context context) {
        this.setMin = danaApplication;
        this.getMin = context;
    }

    public final Object call() {
        return DanaApplication.setMin(this.setMin, this.getMin);
    }
}
