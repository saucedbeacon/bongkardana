package o;

import android.content.Context;
import o.b;

public final class AppOnLoadResultPoint implements getAdapterPosition<AppPausePoint> {
    private final b.C0007b<Context> contextProvider;

    public AppOnLoadResultPoint(b.C0007b<Context> bVar) {
        this.contextProvider = bVar;
    }

    public final AppPausePoint get() {
        return newInstance(this.contextProvider.get());
    }

    public static AppOnLoadResultPoint create(b.C0007b<Context> bVar) {
        return new AppOnLoadResultPoint(bVar);
    }

    public static AppPausePoint newInstance(Context context) {
        return new AppPausePoint(context);
    }
}
