package o;

import id.dana.sendmoney_v2.landing.di.module.SendMoneyLandingModule;
import o.getTitleIcon_White;

public final class getLastMonth implements getAdapterPosition<getTitleIcon_White.getMin> {
    private final SendMoneyLandingModule setMax;

    private getLastMonth(SendMoneyLandingModule sendMoneyLandingModule) {
        this.setMax = sendMoneyLandingModule;
    }

    public static getLastMonth setMax(SendMoneyLandingModule sendMoneyLandingModule) {
        return new getLastMonth(sendMoneyLandingModule);
    }

    public final /* synthetic */ Object get() {
        getTitleIcon_White.getMin max = this.setMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
