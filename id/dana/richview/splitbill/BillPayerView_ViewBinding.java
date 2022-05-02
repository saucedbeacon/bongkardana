package id.dana.richview.splitbill;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.SearchView;
import id.dana.richview.contactselector.ContactSelectorView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class BillPayerView_ViewBinding implements Unbinder {
    private BillPayerView getMax;
    private View getMin;
    private View setMin;

    @UiThread
    public BillPayerView_ViewBinding(final BillPayerView billPayerView, View view) {
        this.getMax = billPayerView;
        billPayerView.cvPayerSelection = (CardView) drawDividersHorizontal.setMin(view, R.id.f41652131362652, "field 'cvPayerSelection'", CardView.class);
        billPayerView.contactSelectorView = (ContactSelectorView) drawDividersHorizontal.setMin(view, R.id.f72192131365854, "field 'contactSelectorView'", ContactSelectorView.class);
        billPayerView.selectedPayerView = (SelectedPayerView) drawDividersHorizontal.setMin(view, R.id.f73122131365947, "field 'selectedPayerView'", SelectedPayerView.class);
        billPayerView.searchView = (SearchView) drawDividersHorizontal.setMin(view, R.id.f73072131365942, "field 'searchView'", SearchView.class);
        billPayerView.llBtnContainer = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f52862131363842, "field 'llBtnContainer'", LinearLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f36082131362054, "method 'onCancel'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                billPayerView.onCancel();
            }
        });
        View max2 = drawDividersHorizontal.getMax(view, R.id.btn_done, "method 'onFinished'");
        this.getMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                billPayerView.onFinished();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        BillPayerView billPayerView = this.getMax;
        if (billPayerView != null) {
            this.getMax = null;
            billPayerView.cvPayerSelection = null;
            billPayerView.contactSelectorView = null;
            billPayerView.selectedPayerView = null;
            billPayerView.searchView = null;
            billPayerView.llBtnContainer = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            this.getMin.setOnClickListener((View.OnClickListener) null);
            this.getMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
