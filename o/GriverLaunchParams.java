package o;

import android.content.Context;
import id.dana.di.modules.SplitModule;
import id.dana.toggle.userloginlogout.LoginLogoutObserver;
import o.a;
import o.b;
import o.sendLocation;

public final class GriverLaunchParams implements getAdapterPosition<setForce> {
    private final b.C0007b<a.AnonymousClass7> IsOverlapping;
    private final b.C0007b<getQueryScene> getMax;
    private final b.C0007b<LoginLogoutObserver> getMin;
    private final b.C0007b<getFrameMarginVertical$core> isInside;
    private final b.C0007b<Context> length;
    private final SplitModule setMax;
    private final b.C0007b<sendLocation.setMin> setMin;

    private GriverLaunchParams(SplitModule splitModule, b.C0007b<Context> bVar, b.C0007b<sendLocation.setMin> bVar2, b.C0007b<LoginLogoutObserver> bVar3, b.C0007b<getQueryScene> bVar4, b.C0007b<a.AnonymousClass7> bVar5, b.C0007b<getFrameMarginVertical$core> bVar6) {
        this.setMax = splitModule;
        this.length = bVar;
        this.setMin = bVar2;
        this.getMin = bVar3;
        this.getMax = bVar4;
        this.IsOverlapping = bVar5;
        this.isInside = bVar6;
    }

    public static GriverLaunchParams getMax(SplitModule splitModule, b.C0007b<Context> bVar, b.C0007b<sendLocation.setMin> bVar2, b.C0007b<LoginLogoutObserver> bVar3, b.C0007b<getQueryScene> bVar4, b.C0007b<a.AnonymousClass7> bVar5, b.C0007b<getFrameMarginVertical$core> bVar6) {
        return new GriverLaunchParams(splitModule, bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    public final /* synthetic */ Object get() {
        setForce max = this.setMax.setMax(this.length.get(), this.setMin.get(), this.getMin.get(), this.getMax.get(), this.IsOverlapping.get(), this.isInside.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
