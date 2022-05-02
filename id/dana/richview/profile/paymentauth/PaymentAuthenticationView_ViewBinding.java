package id.dana.richview.profile.paymentauth;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class PaymentAuthenticationView_ViewBinding implements Unbinder {
    private View getMax;
    private PaymentAuthenticationView getMin;

    @UiThread
    public PaymentAuthenticationView_ViewBinding(final PaymentAuthenticationView paymentAuthenticationView, View view) {
        this.getMin = paymentAuthenticationView;
        paymentAuthenticationView.tvTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69732131365600, "field 'tvTitle'", TextView.class);
        paymentAuthenticationView.switchButton = (SwitchCompat) drawDividersHorizontal.setMin(view, R.id.f61472131364747, "field 'switchButton'", SwitchCompat.class);
        paymentAuthenticationView.tvSubtitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69542131365581, "field 'tvSubtitle'", TextView.class);
        paymentAuthenticationView.ivDanaProtection = (ImageView) drawDividersHorizontal.setMin(view, R.id.f72222131365857, "field 'ivDanaProtection'", ImageView.class);
        paymentAuthenticationView.clContainerPaymentAuth = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40052131362485, "field 'clContainerPaymentAuth'", ConstraintLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f39332131362412, "method 'onClDanaProtectionClick'");
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                paymentAuthenticationView.onClDanaProtectionClick();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        PaymentAuthenticationView paymentAuthenticationView = this.getMin;
        if (paymentAuthenticationView != null) {
            this.getMin = null;
            paymentAuthenticationView.tvTitle = null;
            paymentAuthenticationView.switchButton = null;
            paymentAuthenticationView.tvSubtitle = null;
            paymentAuthenticationView.ivDanaProtection = null;
            paymentAuthenticationView.clContainerPaymentAuth = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
