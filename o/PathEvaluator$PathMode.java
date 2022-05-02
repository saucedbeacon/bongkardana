package o;

import o.AppPreDownloadPackageManager;
import o.b;
import o.onSuccess;

public final class PathEvaluator$PathMode implements getAdapterPosition<IWorkManagerImplCallback> {
    private final b.C0007b<AppPreDownloadPackageManager.AnonymousClass1.AnonymousClass1> getMax;
    private final b.C0007b<setSelectedPhotoPaths> getMin;
    private final b.C0007b<savePresetConfiguration> length;
    private final b.C0007b<packagePathForURLString> setMax;
    private final b.C0007b<onSuccess.getMax> setMin;

    private PathEvaluator$PathMode(b.C0007b<onSuccess.getMax> bVar, b.C0007b<AppPreDownloadPackageManager.AnonymousClass1.AnonymousClass1> bVar2, b.C0007b<packagePathForURLString> bVar3, b.C0007b<savePresetConfiguration> bVar4, b.C0007b<setSelectedPhotoPaths> bVar5) {
        this.setMin = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
        this.length = bVar4;
        this.getMin = bVar5;
    }

    public static PathEvaluator$PathMode length(b.C0007b<onSuccess.getMax> bVar, b.C0007b<AppPreDownloadPackageManager.AnonymousClass1.AnonymousClass1> bVar2, b.C0007b<packagePathForURLString> bVar3, b.C0007b<savePresetConfiguration> bVar4, b.C0007b<setSelectedPhotoPaths> bVar5) {
        return new PathEvaluator$PathMode(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new IWorkManagerImplCallback(this.setMin.get(), this.getMax.get(), this.setMax.get(), this.length.get(), this.getMin.get());
    }
}
