package id.dana.onboarding.verify;

import android.view.View;
import id.dana.tracker.rds.RDSConstant;
import kotlin.Metadata;
import o.Helper;
import o.convertSpToPx;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 4, 2})
final class VerifyNumberFragment$FastBitmap$CoordinateSystem implements View.OnFocusChangeListener {
    public static final VerifyNumberFragment$FastBitmap$CoordinateSystem length = new VerifyNumberFragment$FastBitmap$CoordinateSystem();

    VerifyNumberFragment$FastBitmap$CoordinateSystem() {
    }

    public final void onFocusChange(@Nullable View view, boolean z) {
        if (z) {
            convertSpToPx[] convertsptopxArr = {new Helper("Onboarding", "rds_on_lost_focus", (String) RDSConstant.PHONE_NUMBER_GET_FOCUS, true)};
            for (int i = 0; i <= 0; i++) {
                convertsptopxArr[0].length();
            }
        }
    }
}
