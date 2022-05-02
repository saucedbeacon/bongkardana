package o;

import id.dana.di.modules.OtpChallengeModule;
import o.b;
import o.endTransaction;

public final class GriverExtension implements getAdapterPosition<endTransaction.setMax> {
    private final b.C0007b<lambda$beginTransaction$0> getMin;
    private final b.C0007b<internalBeginTransaction> length;
    private final OtpChallengeModule setMax;
    private final b.C0007b<internalInitInvalidationTracker> setMin;

    private GriverExtension(OtpChallengeModule otpChallengeModule, b.C0007b<internalInitInvalidationTracker> bVar, b.C0007b<internalBeginTransaction> bVar2, b.C0007b<lambda$beginTransaction$0> bVar3) {
        this.setMax = otpChallengeModule;
        this.setMin = bVar;
        this.length = bVar2;
        this.getMin = bVar3;
    }

    public static GriverExtension setMin(OtpChallengeModule otpChallengeModule, b.C0007b<internalInitInvalidationTracker> bVar, b.C0007b<internalBeginTransaction> bVar2, b.C0007b<lambda$beginTransaction$0> bVar3) {
        return new GriverExtension(otpChallengeModule, bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        endTransaction.setMax max = this.setMax.setMax(this.setMin.get(), this.length.get(), this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
