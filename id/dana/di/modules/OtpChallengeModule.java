package id.dana.di.modules;

import dagger.Module;
import dagger.Provides;
import id.dana.challenge.ChallengeScenario;
import id.dana.di.PerActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.endTransaction;
import o.internalBeginTransaction;
import o.internalInitInvalidationTracker;
import o.lambda$beginTransaction$0;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\u0003H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lid/dana/di/modules/OtpChallengeModule;", "", "view", "Lid/dana/challenge/otp/AbstractOtpContract$View;", "scenario", "", "(Lid/dana/challenge/otp/AbstractOtpContract$View;Ljava/lang/String;)V", "providePresenter", "Lid/dana/challenge/otp/AbstractOtpContract$Presenter;", "otpRegistrationPresenter", "Lid/dana/challenge/otp/OtpRegistrationPresenter;", "otpLoginPresenter", "Lid/dana/challenge/otp/OtpLoginPresenter;", "otpTwilioPresenter", "Lid/dana/challenge/otp/OtpTwilioPresenter;", "provideView", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
@Module
public final class OtpChallengeModule {
    private final endTransaction.length getMax;
    private final String getMin;

    public OtpChallengeModule(@NotNull endTransaction.length length, @NotNull String str) {
        Intrinsics.checkNotNullParameter(length, "view");
        Intrinsics.checkNotNullParameter(str, "scenario");
        this.getMax = length;
        this.getMin = str;
    }

    @NotNull
    @PerActivity
    @Provides
    public final endTransaction.length setMax() {
        return this.getMax;
    }

    @NotNull
    @PerActivity
    @Provides
    public final endTransaction.setMax setMax(@NotNull internalInitInvalidationTracker internalinitinvalidationtracker, @NotNull internalBeginTransaction internalbegintransaction, @NotNull lambda$beginTransaction$0 lambda_begintransaction_0) {
        Intrinsics.checkNotNullParameter(internalinitinvalidationtracker, "otpRegistrationPresenter");
        Intrinsics.checkNotNullParameter(internalbegintransaction, "otpLoginPresenter");
        Intrinsics.checkNotNullParameter(lambda_begintransaction_0, "otpTwilioPresenter");
        if (Intrinsics.areEqual((Object) ChallengeScenario.REGISTRATION, (Object) this.getMin)) {
            return internalinitinvalidationtracker;
        }
        if (Intrinsics.areEqual((Object) "twilio_otp", (Object) this.getMin)) {
            return lambda_begintransaction_0;
        }
        return internalbegintransaction;
    }
}
