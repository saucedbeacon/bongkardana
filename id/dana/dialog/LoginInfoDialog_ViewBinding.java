package id.dana.dialog;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class LoginInfoDialog_ViewBinding implements Unbinder {
    private LoginInfoDialog getMax;

    @UiThread
    public LoginInfoDialog_ViewBinding(LoginInfoDialog loginInfoDialog, View view) {
        this.getMax = loginInfoDialog;
        loginInfoDialog.viewActionLoginDialog = drawDividersHorizontal.getMax(view, R.id.f52662131363822, "field 'viewActionLoginDialog'");
        loginInfoDialog.icImage = (ImageView) drawDividersHorizontal.length(view, R.id.f46062131363151, "field 'icImage'", ImageView.class);
        loginInfoDialog.icImageFg = (ImageView) drawDividersHorizontal.length(view, R.id.f46072131363152, "field 'icImageFg'", ImageView.class);
        loginInfoDialog.tvTitle = (TextView) drawDividersHorizontal.length(view, R.id.f69812131365610, "field 'tvTitle'", TextView.class);
        loginInfoDialog.tvMessage = (TextView) drawDividersHorizontal.length(view, R.id.f67292131365356, "field 'tvMessage'", TextView.class);
        loginInfoDialog.tvNegative = (Button) drawDividersHorizontal.length(view, R.id.f36492131362099, "field 'tvNegative'", Button.class);
        loginInfoDialog.tvPositive = (Button) drawDividersHorizontal.length(view, R.id.f36602131362112, "field 'tvPositive'", Button.class);
        loginInfoDialog.llSimpleDialog = (LinearLayout) drawDividersHorizontal.length(view, R.id.f53762131363932, "field 'llSimpleDialog'", LinearLayout.class);
    }

    @CallSuper
    public final void setMax() {
        LoginInfoDialog loginInfoDialog = this.getMax;
        if (loginInfoDialog != null) {
            this.getMax = null;
            loginInfoDialog.viewActionLoginDialog = null;
            loginInfoDialog.icImage = null;
            loginInfoDialog.icImageFg = null;
            loginInfoDialog.tvTitle = null;
            loginInfoDialog.tvMessage = null;
            loginInfoDialog.tvNegative = null;
            loginInfoDialog.tvPositive = null;
            loginInfoDialog.llSimpleDialog = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
