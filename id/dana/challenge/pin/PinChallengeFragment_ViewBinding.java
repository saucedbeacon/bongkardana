package id.dana.challenge.pin;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.PinEntryEditText;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class PinChallengeFragment_ViewBinding implements Unbinder {
    private View getMax;
    private View getMin;
    private PinChallengeFragment setMin;

    @UiThread
    public PinChallengeFragment_ViewBinding(final PinChallengeFragment pinChallengeFragment, View view) {
        this.setMin = pinChallengeFragment;
        pinChallengeFragment.bottomMesageBlock = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f52842131363840, "field 'bottomMesageBlock'", LinearLayout.class);
        pinChallengeFragment.bottomMessage = (TextView) drawDividersHorizontal.setMin(view, R.id.f35112131361957, "field 'bottomMessage'", TextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f35192131361965, "field 'bottomTryAgain' and method 'onTryAgain'");
        pinChallengeFragment.bottomTryAgain = (TextView) drawDividersHorizontal.getMin(max, R.id.f35192131361965, "field 'bottomTryAgain'", TextView.class);
        this.getMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                pinChallengeFragment.onTryAgain(view);
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f56292131364198, "field 'forgotPin' and method 'onForgotPin'");
        pinChallengeFragment.forgotPin = (TextView) drawDividersHorizontal.getMin(max2, R.id.f56292131364198, "field 'forgotPin'", TextView.class);
        this.getMax = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                pinChallengeFragment.onForgotPin(view);
            }
        });
        pinChallengeFragment.icImageFg = (ImageView) drawDividersHorizontal.length(view, R.id.f46072131363152, "field 'icImageFg'", ImageView.class);
        pinChallengeFragment.inputPin = (PinEntryEditText) drawDividersHorizontal.setMin(view, R.id.f46752131363222, "field 'inputPin'", PinEntryEditText.class);
        pinChallengeFragment.progressBar = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f46112131363156, "field 'progressBar'", RelativeLayout.class);
        pinChallengeFragment.relativeWarningIcon = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f58622131364444, "field 'relativeWarningIcon'", RelativeLayout.class);
        pinChallengeFragment.successIcon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f46122131363157, "field 'successIcon'", ImageView.class);
        pinChallengeFragment.successPin = (TextView) drawDividersHorizontal.setMin(view, R.id.f56872131364262, "field 'successPin'", TextView.class);
        pinChallengeFragment.txtInputPinMessage = (TextView) drawDividersHorizontal.setMin(view, R.id.f46772131363224, "field 'txtInputPinMessage'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        PinChallengeFragment pinChallengeFragment = this.setMin;
        if (pinChallengeFragment != null) {
            this.setMin = null;
            pinChallengeFragment.bottomMesageBlock = null;
            pinChallengeFragment.bottomMessage = null;
            pinChallengeFragment.bottomTryAgain = null;
            pinChallengeFragment.forgotPin = null;
            pinChallengeFragment.icImageFg = null;
            pinChallengeFragment.inputPin = null;
            pinChallengeFragment.progressBar = null;
            pinChallengeFragment.relativeWarningIcon = null;
            pinChallengeFragment.successIcon = null;
            pinChallengeFragment.successPin = null;
            pinChallengeFragment.txtInputPinMessage = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
