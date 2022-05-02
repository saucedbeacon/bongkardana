package o;

import id.dana.di.modules.SendMoneyConfirmationModule;
import o.b;
import o.cutImageKeepRatio_new;

public final class getEnds implements getAdapterPosition<cutImageKeepRatio_new.getMax> {
    private final SendMoneyConfirmationModule setMax;
    private final b.C0007b<setIsUseNewMethod> setMin;

    private getEnds(SendMoneyConfirmationModule sendMoneyConfirmationModule, b.C0007b<setIsUseNewMethod> bVar) {
        this.setMax = sendMoneyConfirmationModule;
        this.setMin = bVar;
    }

    public static getEnds setMin(SendMoneyConfirmationModule sendMoneyConfirmationModule, b.C0007b<setIsUseNewMethod> bVar) {
        return new getEnds(sendMoneyConfirmationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        cutImageKeepRatio_new.getMax min = this.setMax.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
