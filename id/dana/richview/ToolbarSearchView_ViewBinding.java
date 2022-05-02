package id.dana.richview;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class ToolbarSearchView_ViewBinding implements Unbinder {
    private View IsOverlapping;
    private View equals;
    private View getMax;
    private ToolbarSearchView getMin;
    private TextWatcher length;
    private View setMin;

    @UiThread
    public ToolbarSearchView_ViewBinding(final ToolbarSearchView toolbarSearchView, View view) {
        this.getMin = toolbarSearchView;
        toolbarSearchView.rlToolbarSearchView = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f58602131364442, "field 'rlToolbarSearchView'", RelativeLayout.class);
        toolbarSearchView.clSearchToolbar = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40322131362512, "field 'clSearchToolbar'", ConstraintLayout.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f43132131362831, "field 'etSearchToolbar', method 'searchEditorAction', method 'onSearchEditorFocusChange', and method 'onSearchToolbarTextChanged'");
        toolbarSearchView.etSearchToolbar = (EditText) drawDividersHorizontal.getMin(max, R.id.f43132131362831, "field 'etSearchToolbar'", EditText.class);
        this.getMax = max;
        TextView textView = (TextView) max;
        textView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return toolbarSearchView.searchEditorAction(i);
            }
        });
        max.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                toolbarSearchView.onSearchEditorFocusChange(z);
            }
        });
        AnonymousClass4 r1 = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                toolbarSearchView.onSearchToolbarTextChanged(charSequence);
            }
        };
        this.length = r1;
        textView.addTextChangedListener(r1);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f48362131363390, "field 'ivClearToolbarSearch' and method 'onClickClearToolbarSearch'");
        toolbarSearchView.ivClearToolbarSearch = (ImageView) drawDividersHorizontal.getMin(max2, R.id.f48362131363390, "field 'ivClearToolbarSearch'", ImageView.class);
        this.setMin = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                toolbarSearchView.onClickClearToolbarSearch();
            }
        });
        toolbarSearchView.tbSearchView = (Toolbar) drawDividersHorizontal.setMin(view, R.id.f61782131364780, "field 'tbSearchView'", Toolbar.class);
        toolbarSearchView.leftButtonSearchView = (TextView) drawDividersHorizontal.setMin(view, R.id.f52202131363776, "field 'leftButtonSearchView'", TextView.class);
        View max3 = drawDividersHorizontal.getMax(view, R.id.f58062131364388, "field 'rightButtonSearchView' and method 'onRightButtonSearchViewClicked'");
        toolbarSearchView.rightButtonSearchView = (TextView) drawDividersHorizontal.getMin(max3, R.id.f58062131364388, "field 'rightButtonSearchView'", TextView.class);
        this.equals = max3;
        max3.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                toolbarSearchView.onRightButtonSearchViewClicked();
            }
        });
        toolbarSearchView.tvSearchViewTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69122131365539, "field 'tvSearchViewTitle'", TextView.class);
        View max4 = drawDividersHorizontal.getMax(view, R.id.f65242131365149, "method 'OnClickCloseSearch'");
        this.IsOverlapping = max4;
        max4.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                toolbarSearchView.OnClickCloseSearch();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        ToolbarSearchView toolbarSearchView = this.getMin;
        if (toolbarSearchView != null) {
            this.getMin = null;
            toolbarSearchView.rlToolbarSearchView = null;
            toolbarSearchView.clSearchToolbar = null;
            toolbarSearchView.etSearchToolbar = null;
            toolbarSearchView.ivClearToolbarSearch = null;
            toolbarSearchView.tbSearchView = null;
            toolbarSearchView.leftButtonSearchView = null;
            toolbarSearchView.rightButtonSearchView = null;
            toolbarSearchView.tvSearchViewTitle = null;
            ((TextView) this.getMax).setOnEditorActionListener((TextView.OnEditorActionListener) null);
            this.getMax.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            ((TextView) this.getMax).removeTextChangedListener(this.length);
            this.length = null;
            this.getMax = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            this.equals.setOnClickListener((View.OnClickListener) null);
            this.equals = null;
            this.IsOverlapping.setOnClickListener((View.OnClickListener) null);
            this.IsOverlapping = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
