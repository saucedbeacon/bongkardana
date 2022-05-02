package o;

import id.dana.di.modules.ReferralTrackerModule;
import o.ConstraintProxy$StorageNotLowProxy;
import o.b;

public final class onFetchFailed implements getAdapterPosition<ConstraintProxy$StorageNotLowProxy.setMin> {
    private final b.C0007b<ConstraintProxy$NetworkStateProxy> getMin;
    private final ReferralTrackerModule setMin;

    private onFetchFailed(ReferralTrackerModule referralTrackerModule, b.C0007b<ConstraintProxy$NetworkStateProxy> bVar) {
        this.setMin = referralTrackerModule;
        this.getMin = bVar;
    }

    public static onFetchFailed setMax(ReferralTrackerModule referralTrackerModule, b.C0007b<ConstraintProxy$NetworkStateProxy> bVar) {
        return new onFetchFailed(referralTrackerModule, bVar);
    }

    public final /* synthetic */ Object get() {
        ConstraintProxy$StorageNotLowProxy.setMin length = this.setMin.length(this.getMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
