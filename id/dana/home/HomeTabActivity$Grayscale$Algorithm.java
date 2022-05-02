package id.dana.home;

import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import o.remover;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"id/dana/home/HomeTabActivity$getFaceAuthModule$1", "Lid/dana/contract/switchfaceauth/FaceAuthPopUpConsultationContract$View;", "onError", "", "errorMessage", "", "onSuggestEnrollFaceAuth", "showEnrolDialog", "", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class HomeTabActivity$Grayscale$Algorithm implements remover.setMax {
    final /* synthetic */ HomeTabActivity setMin;

    @JvmDefault
    public final void dismissProgress() {
    }

    @JvmDefault
    public final void showProgress() {
    }

    HomeTabActivity$Grayscale$Algorithm(HomeTabActivity homeTabActivity) {
        this.setMin = homeTabActivity;
    }

    public final void length(boolean z) {
        if (z) {
            HomeTabActivity.access$displayFaceLoginSuggestionDialog(this.setMin);
        } else {
            this.setMin.nextOnboardingStep();
        }
    }

    public final void onError(@Nullable String str) {
        this.setMin.nextOnboardingStep();
    }
}
