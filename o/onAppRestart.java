package o;

import android.content.Context;
import o.b;

public final class onAppRestart implements getAdapterPosition<onAppResume> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<getPerformanceTracker> deviceInformationProvider;

    public onAppRestart(b.C0007b<Context> bVar, b.C0007b<getPerformanceTracker> bVar2) {
        this.contextProvider = bVar;
        this.deviceInformationProvider = bVar2;
    }

    public final onAppResume get() {
        return newInstance(this.contextProvider.get(), this.deviceInformationProvider.get());
    }

    public static onAppRestart create(b.C0007b<Context> bVar, b.C0007b<getPerformanceTracker> bVar2) {
        return new onAppRestart(bVar, bVar2);
    }

    public static onAppResume newInstance(Context context, getPerformanceTracker getperformancetracker) {
        return new onAppResume(context, getperformancetracker);
    }
}
