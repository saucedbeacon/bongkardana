package id.dana.ocr.views;

import id.dana.data.foundation.logger.log.DanaLogConstants;
import id.dana.domain.usereducation.BottomSheetOnBoardingScenario;
import kotlin.Metadata;
import kotlin.jvm.JvmDefault;
import o.getSelectedIndex;
import o.updateActionSheetContent;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"id/dana/ocr/views/OCRCameraActivity$getBottomOnBoardingModule$1", "Lid/dana/usereducation/BottomSheetOnBoardingContract$View;", "onError", "", "errorMessage", "", "onGetBottomSheetOnBoardingAvailability", "show", "", "url", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class OCRCameraActivity$getBottomOnBoardingModule$1 implements getSelectedIndex.setMax {
    final /* synthetic */ OCRCameraActivity setMin;

    @JvmDefault
    public final void dismissProgress() {
    }

    public final void setMax(boolean z, @Nullable String str) {
    }

    @JvmDefault
    public final void showProgress() {
    }

    OCRCameraActivity$getBottomOnBoardingModule$1(OCRCameraActivity oCRCameraActivity) {
        this.setMin = oCRCameraActivity;
    }

    public final void onGetBottomSheetOnBoardingAvailability(boolean z, @Nullable String str) {
        if (z) {
            OCRCameraActivity.access$openBottomSheetOnBoardingViewList(this.setMin);
            this.setMin.getOnBoardingPresenter().getMax(BottomSheetOnBoardingScenario.SNAP_RECEIPT);
        }
    }

    public final void onError(@Nullable String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" on Error: ");
        sb.append(str);
        updateActionSheetContent.e(DanaLogConstants.TAG.USER_EDUCATION_TAG, sb.toString());
    }
}
