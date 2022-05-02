package o;

import android.os.Bundle;
import id.dana.challenge.otp.OtpChallengeFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lid/dana/challenge/scenario/ReLoginScenario;", "Lid/dana/challenge/scenario/ScenarioFacade;", "data", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "fragments", "", "Lid/dana/challenge/otp/OtpChallengeFragment;", "getChallengeFragments", "getScenario", "", "onCompleted", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class updateObscuredViewsVisibility implements smoothSlideOpen {
    private final List<OtpChallengeFragment> getMax;

    public updateObscuredViewsVisibility(@Nullable Bundle bundle) {
        OtpChallengeFragment.length length = OtpChallengeFragment.setMax;
        OtpChallengeFragment otpChallengeFragment = new OtpChallengeFragment();
        otpChallengeFragment.setArguments(bundle);
        this.getMax = CollectionsKt.mutableListOf(otpChallengeFragment);
    }

    @NotNull
    public final List<OtpChallengeFragment> length() {
        return this.getMax;
    }
}
