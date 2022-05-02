package o;

import android.content.Context;
import o.b;

public final class setTabItem implements getAdapterPosition<switchTab> {
    private final b.C0007b<AppPausePoint> amcsManagerProvider;
    private final b.C0007b<Context> contextProvider;

    public setTabItem(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2) {
        this.contextProvider = bVar;
        this.amcsManagerProvider = bVar2;
    }

    public final switchTab get() {
        return newInstance(this.contextProvider.get(), this.amcsManagerProvider.get());
    }

    public static setTabItem create(b.C0007b<Context> bVar, b.C0007b<AppPausePoint> bVar2) {
        return new setTabItem(bVar, bVar2);
    }

    public static switchTab newInstance(Context context, AppPausePoint appPausePoint) {
        return new switchTab(context, appPausePoint);
    }
}
