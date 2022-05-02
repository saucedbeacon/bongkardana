package o;

import android.content.Context;
import o.WorkerParameters;
import o.b;

public final class updateAll implements getAdapterPosition<WorkManagerInitializer> {
    private final b.C0007b<isVerifFailed> equals;
    private final b.C0007b<GriverMainResourcePackage> getMax;
    private final b.C0007b<Context> getMin;
    private final b.C0007b<getSharedPreferenceForApp> length;
    private final b.C0007b<GriverAppXResourcePackage> setMax;
    private final b.C0007b<WorkerParameters.length> setMin;
    private final b.C0007b<MainResourcePackageWithoutVerify> toFloatRange;
    private final b.C0007b<setGeolocationEnabled> toIntRange;

    private updateAll(b.C0007b<WorkerParameters.length> bVar, b.C0007b<GriverMainResourcePackage> bVar2, b.C0007b<GriverAppXResourcePackage> bVar3, b.C0007b<getSharedPreferenceForApp> bVar4, b.C0007b<Context> bVar5, b.C0007b<isVerifFailed> bVar6, b.C0007b<MainResourcePackageWithoutVerify> bVar7, b.C0007b<setGeolocationEnabled> bVar8) {
        this.setMin = bVar;
        this.getMax = bVar2;
        this.setMax = bVar3;
        this.length = bVar4;
        this.getMin = bVar5;
        this.equals = bVar6;
        this.toFloatRange = bVar7;
        this.toIntRange = bVar8;
    }

    public static updateAll setMax(b.C0007b<WorkerParameters.length> bVar, b.C0007b<GriverMainResourcePackage> bVar2, b.C0007b<GriverAppXResourcePackage> bVar3, b.C0007b<getSharedPreferenceForApp> bVar4, b.C0007b<Context> bVar5, b.C0007b<isVerifFailed> bVar6, b.C0007b<MainResourcePackageWithoutVerify> bVar7, b.C0007b<setGeolocationEnabled> bVar8) {
        return new updateAll(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public final /* synthetic */ Object get() {
        WorkManagerInitializer workManagerInitializer = new WorkManagerInitializer(this.setMin.get(), this.getMax.get(), this.setMax.get(), this.length.get(), this.getMin.get());
        ConstraintProxy$BatteryNotLowProxy.getMax(workManagerInitializer, this.equals.get(), this.toFloatRange.get(), this.toIntRange.get());
        return workManagerInitializer;
    }
}
