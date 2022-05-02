package o;

import dagger.Component;
import id.dana.challenge.otp.OtpChallengeFragment;
import id.dana.di.PerActivity;
import id.dana.di.modules.ChangePhoneNumberH5EventModule;
import id.dana.di.modules.OtherBankAccountModule;
import id.dana.di.modules.OtpChallengeModule;
import id.dana.sendmoney.bank.other.OtherBankAccountView;
import kotlin.Metadata;
import o.PrepareException;
import org.jetbrains.annotations.Nullable;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {OtherBankAccountModule.class})
public interface WebSocketSession {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lid/dana/di/component/OtpChallengeComponent;", "", "inject", "", "challengeFragment", "Lid/dana/challenge/otp/OtpChallengeFragment;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
    @PerActivity
    @Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {OtpChallengeModule.class, ChangePhoneNumberH5EventModule.class})
    public interface RVWebSocketCallbackProxy {
        void length(@Nullable OtpChallengeFragment otpChallengeFragment);
    }

    void getMin(OtherBankAccountView otherBankAccountView);
}
