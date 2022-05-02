package id.dana.referral;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ReferralCodeSectionView_ViewBinding implements Unbinder {
    private ReferralCodeSectionView getMin;

    @UiThread
    public ReferralCodeSectionView_ViewBinding(ReferralCodeSectionView referralCodeSectionView, View view) {
        this.getMin = referralCodeSectionView;
        referralCodeSectionView.clReferralContainer = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40232131362503, "field 'clReferralContainer'", ConstraintLayout.class);
        referralCodeSectionView.tvReferralCode = (TextView) drawDividersHorizontal.setMin(view, R.id.f68712131365498, "field 'tvReferralCode'", TextView.class);
        referralCodeSectionView.llShareAction = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53702131363926, "field 'llShareAction'", LinearLayout.class);
        referralCodeSectionView.buttons = drawDividersHorizontal.setMin((Button) drawDividersHorizontal.setMin(view, R.id.f36312131362081, "field 'buttons'", Button.class), (Button) drawDividersHorizontal.setMin(view, R.id.f36742131362126, "field 'buttons'", Button.class));
    }

    @CallSuper
    public final void setMax() {
        ReferralCodeSectionView referralCodeSectionView = this.getMin;
        if (referralCodeSectionView != null) {
            this.getMin = null;
            referralCodeSectionView.clReferralContainer = null;
            referralCodeSectionView.tvReferralCode = null;
            referralCodeSectionView.llShareAction = null;
            referralCodeSectionView.buttons = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
