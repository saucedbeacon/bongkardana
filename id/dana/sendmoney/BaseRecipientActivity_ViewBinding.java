package id.dana.sendmoney;

import android.view.View;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.sendmoney.view.RecipientView;
import o.drawDividersHorizontal;

public class BaseRecipientActivity_ViewBinding extends BaseActivity_ViewBinding {
    private BaseRecipientActivity length;

    @UiThread
    public BaseRecipientActivity_ViewBinding(BaseRecipientActivity baseRecipientActivity, View view) {
        super(baseRecipientActivity, view);
        this.length = baseRecipientActivity;
        baseRecipientActivity.recipientList = (RecipientView) drawDividersHorizontal.setMin(view, R.id.f73032131365938, "field 'recipientList'", RecipientView.class);
    }

    public void setMax() {
        BaseRecipientActivity baseRecipientActivity = this.length;
        if (baseRecipientActivity != null) {
            this.length = null;
            baseRecipientActivity.recipientList = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
