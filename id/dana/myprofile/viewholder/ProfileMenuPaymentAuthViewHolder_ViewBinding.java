package id.dana.myprofile.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.profile.paymentauth.PaymentAuthenticationView;
import o.drawDividersHorizontal;

public class ProfileMenuPaymentAuthViewHolder_ViewBinding implements Unbinder {
    private ProfileMenuPaymentAuthViewHolder length;

    @UiThread
    public ProfileMenuPaymentAuthViewHolder_ViewBinding(ProfileMenuPaymentAuthViewHolder profileMenuPaymentAuthViewHolder, View view) {
        this.length = profileMenuPaymentAuthViewHolder;
        profileMenuPaymentAuthViewHolder.paymentAuthenticationView = (PaymentAuthenticationView) drawDividersHorizontal.setMin(view, R.id.f72022131365837, "field 'paymentAuthenticationView'", PaymentAuthenticationView.class);
    }

    @CallSuper
    public final void setMax() {
        ProfileMenuPaymentAuthViewHolder profileMenuPaymentAuthViewHolder = this.length;
        if (profileMenuPaymentAuthViewHolder != null) {
            this.length = null;
            profileMenuPaymentAuthViewHolder.paymentAuthenticationView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
