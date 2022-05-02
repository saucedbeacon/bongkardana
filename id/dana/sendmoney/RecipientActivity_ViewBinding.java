package id.dana.sendmoney;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.sendmoney.view.RecipientHomeView;
import o.drawDividersHorizontal;

public class RecipientActivity_ViewBinding extends BaseActivity_ViewBinding {
    private RecipientActivity length;

    @UiThread
    public RecipientActivity_ViewBinding(RecipientActivity recipientActivity, View view) {
        super(recipientActivity, view);
        this.length = recipientActivity;
        recipientActivity.recipientList = (RecipientHomeView) drawDividersHorizontal.setMin(view, R.id.f73032131365938, "field 'recipientList'", RecipientHomeView.class);
        recipientActivity.tvHelpRightButton = (TextView) drawDividersHorizontal.setMin(view, R.id.f58042131364386, "field 'tvHelpRightButton'", TextView.class);
    }

    public final void setMax() {
        RecipientActivity recipientActivity = this.length;
        if (recipientActivity != null) {
            this.length = null;
            recipientActivity.recipientList = null;
            recipientActivity.tvHelpRightButton = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
