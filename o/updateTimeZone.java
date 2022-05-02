package o;

import android.content.Context;
import android.os.Handler;

public final class updateTimeZone {
    final Handler getMax;
    final Context getMin;
    private final boolean length;

    public updateTimeZone(Context context, LogContextImpl logContextImpl) {
        this.getMin = context;
        this.getMax = logContextImpl.setMin;
        this.length = logContextImpl.length();
    }

    public final boolean getMin() {
        return this.length;
    }
}
