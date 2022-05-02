package id.dana.splitbill.view;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class ClosePayerView_ViewBinding implements Unbinder {
    private ClosePayerView setMin;

    @UiThread
    public ClosePayerView_ViewBinding(ClosePayerView closePayerView, View view) {
        this.setMin = closePayerView;
        closePayerView.tvRemainingBillValue = (TextView) drawDividersHorizontal.setMin(view, R.id.f68852131365512, "field 'tvRemainingBillValue'", TextView.class);
        closePayerView.tvUnpaidBillCount = (TextView) drawDividersHorizontal.setMin(view, R.id.f70242131365654, "field 'tvUnpaidBillCount'", TextView.class);
        closePayerView.cbCloseAllPayer = (CheckBox) drawDividersHorizontal.setMin(view, R.id.f37672131362222, "field 'cbCloseAllPayer'", CheckBox.class);
    }

    @CallSuper
    public final void setMax() {
        ClosePayerView closePayerView = this.setMin;
        if (closePayerView != null) {
            this.setMin = null;
            closePayerView.tvRemainingBillValue = null;
            closePayerView.tvUnpaidBillCount = null;
            closePayerView.cbCloseAllPayer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
