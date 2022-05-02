package id.dana.richview;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SearchView_ViewBinding implements Unbinder {
    private TextWatcher getMax;
    private View getMin;
    private View length;
    private SearchView setMin;

    @UiThread
    public SearchView_ViewBinding(final SearchView searchView, View view) {
        this.setMin = searchView;
        View max = drawDividersHorizontal.getMax(view, R.id.f43122131362830, "field 'etSearchContact' and method 'afterBankNumberChange'");
        searchView.etSearchContact = (EditText) drawDividersHorizontal.getMin(max, R.id.f43122131362830, "field 'etSearchContact'", EditText.class);
        this.getMin = max;
        AnonymousClass4 r0 = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                searchView.afterBankNumberChange(editable);
            }
        };
        this.getMax = r0;
        ((TextView) max).addTextChangedListener(r0);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f48312131363385, "field 'ivClear' and method 'clearKeyword'");
        searchView.ivClear = (ImageView) drawDividersHorizontal.getMin(max2, R.id.f48312131363385, "field 'ivClear'", ImageView.class);
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                searchView.clearKeyword();
            }
        });
        searchView.pbLoading = (ProgressBar) drawDividersHorizontal.setMin(view, R.id.f56622131364234, "field 'pbLoading'", ProgressBar.class);
    }

    @CallSuper
    public final void setMax() {
        SearchView searchView = this.setMin;
        if (searchView != null) {
            this.setMin = null;
            searchView.etSearchContact = null;
            searchView.ivClear = null;
            searchView.pbLoading = null;
            ((TextView) this.getMin).removeTextChangedListener(this.getMax);
            this.getMax = null;
            this.getMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
