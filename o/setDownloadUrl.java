package o;

import android.content.Context;
import o.b;

public final class setDownloadUrl implements getAdapterPosition<setIsUrgentResource> {
    private final b.C0007b<onAppResume> apSecurityFacadeProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<getPerformanceTracker> deviceInformationProvider;

    public setDownloadUrl(b.C0007b<Context> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<getPerformanceTracker> bVar3) {
        this.contextProvider = bVar;
        this.apSecurityFacadeProvider = bVar2;
        this.deviceInformationProvider = bVar3;
    }

    public final setIsUrgentResource get() {
        return newInstance(this.contextProvider.get(), this.apSecurityFacadeProvider.get(), this.deviceInformationProvider.get());
    }

    public static setDownloadUrl create(b.C0007b<Context> bVar, b.C0007b<onAppResume> bVar2, b.C0007b<getPerformanceTracker> bVar3) {
        return new setDownloadUrl(bVar, bVar2, bVar3);
    }

    public static setIsUrgentResource newInstance(Context context, onAppResume onappresume, getPerformanceTracker getperformancetracker) {
        return new setIsUrgentResource(context, onappresume, getperformancetracker);
    }
}
