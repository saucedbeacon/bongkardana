package id.dana.sendmoney.bank.all;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.sendmoney.BaseRecipientActivity_ViewBinding;
import id.dana.sendmoney.view.RecipientView;
import o.drawDividersHorizontal;

public class BankActivity_ViewBinding extends BaseRecipientActivity_ViewBinding {
    private BankActivity getMin;

    @UiThread
    public BankActivity_ViewBinding(BankActivity bankActivity, View view) {
        super(bankActivity, view);
        this.getMin = bankActivity;
        bankActivity.recipientView = (RecipientView) drawDividersHorizontal.setMin(view, R.id.f73032131365938, "field 'recipientView'", RecipientView.class);
    }

    public final void setMax() {
        BankActivity bankActivity = this.getMin;
        if (bankActivity != null) {
            this.getMin = null;
            bankActivity.recipientView = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
