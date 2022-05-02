package o;

import android.os.Bundle;
import id.dana.challenge.pin.PinChallengeFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lid/dana/challenge/scenario/FaceActivationScenario;", "Lid/dana/challenge/scenario/ScenarioFacade;", "data", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "fragments", "", "Lid/dana/challenge/pin/PinChallengeFragment;", "kotlin.jvm.PlatformType", "getChallengeFragments", "getScenario", "", "onCompleted", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class dispatchOnPanelSlide implements smoothSlideOpen {
    private final List<PinChallengeFragment> length;

    public dispatchOnPanelSlide(@Nullable Bundle bundle) {
        this.length = CollectionsKt.mutableListOf(PinChallengeFragment.getMin(bundle));
    }

    @NotNull
    public final List<PinChallengeFragment> length() {
        return this.length;
    }
}
