package id.dana.challenge;

import android.view.View;
import id.dana.dialog.LoginInfoDialog;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 2})
final class ChallengePinWithFaceActivity$Grayscale$Algorithm implements View.OnClickListener {
    final /* synthetic */ ChallengePinWithFaceActivity setMin;

    ChallengePinWithFaceActivity$Grayscale$Algorithm(ChallengePinWithFaceActivity challengePinWithFaceActivity) {
        this.setMin = challengePinWithFaceActivity;
    }

    public final void onClick(View view) {
        LoginInfoDialog access$getLoginInfoDialog$p = this.setMin.toDoubleRange;
        if (access$getLoginInfoDialog$p != null) {
            access$getLoginInfoDialog$p.setMax();
        }
    }
}
