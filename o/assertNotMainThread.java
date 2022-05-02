package o;

import android.os.Bundle;
import id.dana.challenge.ChallengeScenario;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\t"}, d2 = {"Lid/dana/challenge/ChallengeScenarioFactory;", "", "()V", "create", "Lid/dana/challenge/scenario/ScenarioFacade;", "scenario", "", "data", "Landroid/os/Bundle;", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class assertNotMainThread {
    @NotNull
    public static final assertNotMainThread length = new assertNotMainThread();

    private assertNotMainThread() {
    }

    @JvmStatic
    @NotNull
    public static final smoothSlideOpen setMax(@Nullable String str, @Nullable Bundle bundle) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1999183539:
                    if (str.equals(ChallengeScenario.REGISTRATION)) {
                        return new dispatchOnPanelClosed(bundle);
                    }
                    break;
                case -497502143:
                    if (str.equals("payment_auth")) {
                        return new setAllChildrenVisible(bundle);
                    }
                    break;
                case -489325167:
                    if (str.equals("unbind_merchant")) {
                        return new smoothSlideClosed(bundle);
                    }
                    break;
                case -41045063:
                    if (str.equals("auto_route")) {
                        return new getSliderFadeColor(bundle);
                    }
                    break;
                case 103149417:
                    if (str.equals("login")) {
                        return new getCoveredFadeColor(bundle);
                    }
                    break;
                case 703631723:
                    if (str.equals(ChallengeScenario.TRUST_RISK_LOGIN_TWILIO)) {
                        return new openPane(bundle);
                    }
                    break;
                case 1124674296:
                    if (str.equals("twilio_otp")) {
                        return new closePane(bundle);
                    }
                    break;
                case 1124674914:
                    if (str.equals("twilio_pin")) {
                        return new canSlide(bundle);
                    }
                    break;
                case 1573803584:
                    if (str.equals(ChallengeScenario.TRUST_RISK_LOGIN)) {
                        return new dispatchOnPanelOpened(bundle);
                    }
                    break;
                case 1656771640:
                    if (str.equals("face_activation")) {
                        return new dispatchOnPanelSlide(bundle);
                    }
                    break;
            }
        }
        return new updateObscuredViewsVisibility(bundle);
    }
}
