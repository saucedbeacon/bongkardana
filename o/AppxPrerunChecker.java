package o;

import dagger.Component;
import id.dana.challenge.ChallengePinWithFaceActivity;
import id.dana.challenge.pinwithface.ChallengePinWithFaceModule;
import id.dana.contract.switchfaceauth.FaceAuthPopUpConsultationModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.AuthenticationModule;
import id.dana.di.modules.ConfirmPinModule;
import id.dana.di.modules.LogoutModule;
import id.dana.di.modules.PinChallengeModule;
import id.dana.di.modules.SendMoneyModule;
import id.dana.di.modules.TncSummaryModules;
import id.dana.onboarding.confirmpin.ConfirmPinFragment;
import id.dana.sendmoney.calculator.CalculatorActivity;
import id.dana.sendmoney.summary.view.SummaryView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SendMoneyModule.class})
public interface AppxPrerunChecker {

    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PinChallengeModule.class, AuthenticationModule.class, ChallengePinWithFaceModule.class, LogoutModule.class, FaceAuthPopUpConsultationModule.class})
    /* renamed from: o.AppxPrerunChecker$1  reason: invalid class name */
    public interface AnonymousClass1 {
        void getMin(ChallengePinWithFaceActivity challengePinWithFaceActivity);
    }

    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {ConfirmPinModule.class, TncSummaryModules.class})
    /* renamed from: o.AppxPrerunChecker$2  reason: invalid class name */
    public interface AnonymousClass2 {
        void length(ConfirmPinFragment confirmPinFragment);
    }

    void getMin(CalculatorActivity calculatorActivity);

    void length(SummaryView summaryView);
}
