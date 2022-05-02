package id.dana.richview.bank;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.textfield.TextInputEditText;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class AutoCompleteBankView_ViewBinding implements Unbinder {
    private View getMax;
    private AutoCompleteBankView length;
    private View setMin;

    @UiThread
    public AutoCompleteBankView_ViewBinding(final AutoCompleteBankView autoCompleteBankView, View view) {
        this.length = autoCompleteBankView;
        View max = drawDividersHorizontal.getMax(view, R.id.f42972131362815, "field 'bankName' and method 'editTextFocusChange'");
        autoCompleteBankView.bankName = (TextInputEditText) drawDividersHorizontal.getMin(max, R.id.f42972131362815, "field 'bankName'", TextInputEditText.class);
        this.getMax = max;
        max.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                autoCompleteBankView.editTextFocusChange(view, z);
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.f48322131363386, "field 'ivClearInput' and method 'clearBankNameClick'");
        autoCompleteBankView.ivClearInput = (ImageView) drawDividersHorizontal.getMin(max2, R.id.f48322131363386, "field 'ivClearInput'", ImageView.class);
        this.setMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                autoCompleteBankView.clearBankNameClick();
            }
        });
        autoCompleteBankView.rvBankList = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59082131364493, "field 'rvBankList'", RecyclerView.class);
    }

    @CallSuper
    public final void setMax() {
        AutoCompleteBankView autoCompleteBankView = this.length;
        if (autoCompleteBankView != null) {
            this.length = null;
            autoCompleteBankView.bankName = null;
            autoCompleteBankView.ivClearInput = null;
            autoCompleteBankView.rvBankList = null;
            this.getMax.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            this.getMax = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
