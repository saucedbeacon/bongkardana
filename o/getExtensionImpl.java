package o;

import id.dana.di.modules.PinChallengeModule;
import o.b;
import o.isMainThread;

public final class getExtensionImpl implements getAdapterPosition<isMainThread.getMax> {
    private final b.C0007b<SkipQueryVerification> equals;
    private final PinChallengeModule getMax;
    private final b.C0007b<createNewStatement> getMin;
    private final b.C0007b<release> length;
    private final b.C0007b<onValidateSchema> setMax;
    private final b.C0007b<createQuery> setMin;
    private final b.C0007b<TypeConverters> toFloatRange;
    private final b.C0007b<SavedStateRegistry$1> toIntRange;

    private getExtensionImpl(PinChallengeModule pinChallengeModule, b.C0007b<onValidateSchema> bVar, b.C0007b<createNewStatement> bVar2, b.C0007b<createQuery> bVar3, b.C0007b<release> bVar4, b.C0007b<SavedStateRegistry$1> bVar5, b.C0007b<TypeConverters> bVar6, b.C0007b<SkipQueryVerification> bVar7) {
        this.getMax = pinChallengeModule;
        this.setMax = bVar;
        this.getMin = bVar2;
        this.setMin = bVar3;
        this.length = bVar4;
        this.toIntRange = bVar5;
        this.toFloatRange = bVar6;
        this.equals = bVar7;
    }

    public static getExtensionImpl getMax(PinChallengeModule pinChallengeModule, b.C0007b<onValidateSchema> bVar, b.C0007b<createNewStatement> bVar2, b.C0007b<createQuery> bVar3, b.C0007b<release> bVar4, b.C0007b<SavedStateRegistry$1> bVar5, b.C0007b<TypeConverters> bVar6, b.C0007b<SkipQueryVerification> bVar7) {
        return new getExtensionImpl(pinChallengeModule, bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public final /* synthetic */ Object get() {
        isMainThread.getMax max = this.getMax.getMax(this.setMax.get(), this.getMin.get(), this.setMin.get(), this.length.get(), this.toIntRange.get(), this.toFloatRange.get(), this.equals.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
