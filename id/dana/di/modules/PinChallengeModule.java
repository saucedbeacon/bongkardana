package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.challenge.ChallengeScenario;
import id.dana.di.PerActivity;
import o.SavedStateRegistry$1;
import o.SkipQueryVerification;
import o.TypeConverters;
import o.createNewStatement;
import o.createQuery;
import o.isMainThread;
import o.onValidateSchema;
import o.release;

@Module
public class PinChallengeModule {
    private final isMainThread.getMin getMax;
    private final String setMax;

    public PinChallengeModule(isMainThread.getMin getmin, String str) {
        this.getMax = getmin;
        this.setMax = str;
    }

    @PerActivity
    @Provides
    public isMainThread.getMin getMin() {
        return this.getMax;
    }

    @PerActivity
    @Provides
    public isMainThread.getMax getMax(onValidateSchema onvalidateschema, createNewStatement createnewstatement, createQuery createquery, release release, SavedStateRegistry$1 savedStateRegistry$1, TypeConverters typeConverters, SkipQueryVerification skipQueryVerification) {
        if ("login".equals(this.setMax) || ChallengeScenario.TRUST_RISK_LOGIN.equals(this.setMax)) {
            return onvalidateschema;
        }
        if (ChallengeScenario.RELOGIN.equals(this.setMax)) {
            return createnewstatement;
        }
        if ("twilio_pin".equals(this.setMax) || "twilio_otp".equals(this.setMax)) {
            return typeConverters;
        }
        if ("payment_auth".equals(this.setMax)) {
            return createquery;
        }
        if ("face_activation".equals(this.setMax)) {
            return release;
        }
        if ("unbind_merchant".equals(this.setMax)) {
            return savedStateRegistry$1;
        }
        if ("auto_route".equals(this.setMax)) {
            return skipQueryVerification;
        }
        return null;
    }
}
