package id.dana.oauth;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.LogoProgressView;
import o.drawDividersHorizontal;

public class MatchPhoneNumberDialog_ViewBinding implements Unbinder {
    private MatchPhoneNumberDialog length;

    @UiThread
    public MatchPhoneNumberDialog_ViewBinding(MatchPhoneNumberDialog matchPhoneNumberDialog, View view) {
        this.length = matchPhoneNumberDialog;
        matchPhoneNumberDialog.btnCancel = (Button) drawDividersHorizontal.setMin(view, R.id.f36082131362054, "field 'btnCancel'", Button.class);
        matchPhoneNumberDialog.btnLogin = (Button) drawDividersHorizontal.setMin(view, R.id.f36442131362094, "field 'btnLogin'", Button.class);
        matchPhoneNumberDialog.lpvLoading = (LogoProgressView) drawDividersHorizontal.setMin(view, R.id.f54102131363967, "field 'lpvLoading'", LogoProgressView.class);
    }

    @CallSuper
    public final void setMax() {
        MatchPhoneNumberDialog matchPhoneNumberDialog = this.length;
        if (matchPhoneNumberDialog != null) {
            this.length = null;
            matchPhoneNumberDialog.btnCancel = null;
            matchPhoneNumberDialog.btnLogin = null;
            matchPhoneNumberDialog.lpvLoading = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
