package id.dana.onboarding.verify;

import android.widget.Button;
import id.dana.dialog.DialogPermission;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o.ViewPager2;
import o.resetInternal;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016¨\u0006\u0006"}, d2 = {"id/dana/onboarding/verify/VerifyNumberFragment$showLocationPermissionDialog$3", "Lid/dana/dialog/DialogPermission$DialogListener;", "onDialogDismissed", "", "onNegativeButtonClicked", "onPositiveButtonClicked", "app_productionRelease"}, k = 1, mv = {1, 4, 2})
public final class VerifyNumberFragment$Grayscale$Algorithm implements DialogPermission.length {
    final /* synthetic */ VerifyNumberFragment setMin;

    public final void onDialogDismissed() {
    }

    VerifyNumberFragment$Grayscale$Algorithm(VerifyNumberFragment verifyNumberFragment) {
        this.setMin = verifyNumberFragment;
    }

    public final void onPositiveButtonClicked() {
        Button button = (Button) this.setMin.getMax(resetInternal.setMax.ITrustedWebActivityService);
        if (button != null) {
            button.setEnabled(false);
        }
        VerifyNumberFragment.FastBitmap$CoordinateSystem(this.setMin).setMin();
        DialogPermission hashCode = this.setMin.FastBitmap$CoordinateSystem;
        if (hashCode != null) {
            hashCode.setMax();
        }
    }

    public final void onNegativeButtonClicked() {
        ViewPager2.OffscreenPageLimit.length length = this.setMin.permissionStatePresenter;
        if (length == null) {
            Intrinsics.throwUninitializedPropertyAccessException("permissionStatePresenter");
        }
        length.length(true);
        VerifyNumberFragment.values(this.setMin);
    }
}
