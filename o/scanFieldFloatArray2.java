package o;

import id.dana.di.modules.ApplicationModule;
import o.GriverWebviewSetting;
import o.RVMain;
import o.b;

public final class scanFieldFloatArray2 implements getAdapterPosition<GriverWebviewSetting.AnonymousClass1> {
    private final b.C0007b<RVMain.AnonymousClass3> length;
    private final ApplicationModule setMax;

    private scanFieldFloatArray2(ApplicationModule applicationModule, b.C0007b<RVMain.AnonymousClass3> bVar) {
        this.setMax = applicationModule;
        this.length = bVar;
    }

    public static scanFieldFloatArray2 setMin(ApplicationModule applicationModule, b.C0007b<RVMain.AnonymousClass3> bVar) {
        return new scanFieldFloatArray2(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverWebviewSetting.AnonymousClass1 max = this.setMax.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
