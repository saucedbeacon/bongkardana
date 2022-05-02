package id.dana.challenge.otp;

import android.content.Intent;
import android.view.View;
import id.dana.challenge.ChallengeControl;
import id.dana.dialog.LoginInfoDialog;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
final class OtpChallengeFragment$FastBitmap$CoordinateSystem implements View.OnClickListener {
    final /* synthetic */ OtpChallengeFragment getMax;

    OtpChallengeFragment$FastBitmap$CoordinateSystem(OtpChallengeFragment otpChallengeFragment) {
        this.getMax = otpChallengeFragment;
    }

    public final void onClick(View view) {
        LoginInfoDialog IsOverlapping = this.getMax.toIntRange;
        if (IsOverlapping != null) {
            IsOverlapping.setMax();
        }
        this.getMax.getMax.setResult(0, new Intent().putExtra(ChallengeControl.Key.CANCEL_REASON, "close"));
        this.getMax.getMax.finish();
    }
}
