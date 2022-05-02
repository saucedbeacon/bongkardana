package id.dana.richview;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnEditorAction;
import butterknife.OnFocusChange;
import butterknife.OnTextChanged;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.GriverCapturePreviewActivity;
import o.IntRange;
import o.setOnWheelViewListener;
import o.z;

public class ToolbarSearchView extends BaseRichView {
    @BindView(2131362512)
    ConstraintLayout clSearchToolbar;
    @BindView(2131362831)
    EditText etSearchToolbar;
    private boolean getMax;
    private getMin getMin;
    @BindView(2131363390)
    ImageView ivClearToolbarSearch;
    @BindView(2131363776)
    TextView leftButtonSearchView;
    @BindView(2131364388)
    TextView rightButtonSearchView;
    @BindView(2131364442)
    RelativeLayout rlToolbarSearchView;
    @BindView(2131364780)
    Toolbar tbSearchView;
    @BindView(2131365539)
    TextView tvSearchViewTitle;

    public interface getMin {
        void getMax();

        void getMax(CharSequence charSequence);

        void length();

        void setMax();

        void setMin();
    }

    public int getLayout() {
        return R.layout.view_toolbar_search;
    }

    public ToolbarSearchView(@NonNull Context context) {
        super(context);
    }

    public ToolbarSearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ToolbarSearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setListener(getMin getmin) {
        this.getMin = getmin;
    }

    @OnEditorAction({2131362831})
    public boolean searchEditorAction(int i) {
        if (i != 3) {
            return false;
        }
        hideClearSearchButton();
        setOnWheelViewListener.length((View) this.etSearchToolbar);
        return false;
    }

    @OnFocusChange({2131362831})
    public void onSearchEditorFocusChange(boolean z) {
        if (z && !TextUtils.isEmpty(this.etSearchToolbar.getText())) {
            showClearSearchButton();
        }
    }

    @OnClick({2131365149})
    public void OnClickCloseSearch() {
        hideSearchView();
    }

    public boolean getSearchStatus() {
        return this.getMax;
    }

    public void setSearchStatus(boolean z) {
        this.getMax = z;
    }

    public void hideSearchView() {
        length(true);
    }

    private void length(boolean z) {
        this.clSearchToolbar.setVisibility(8);
        this.rlToolbarSearchView.setVisibility(0);
        this.etSearchToolbar.getText().clear();
        setOnWheelViewListener.length((View) this.etSearchToolbar);
        this.getMax = false;
        if (z) {
            this.getMin.length();
        }
    }

    @OnTextChanged({2131362831})
    public void onSearchToolbarTextChanged(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            showClearSearchButton();
        } else {
            hideClearSearchButton();
        }
        this.getMin.getMax(charSequence);
    }

    @OnClick({2131363390})
    public void onClickClearToolbarSearch() {
        clearSearch();
    }

    @OnClick({2131364388})
    public void onRightButtonSearchViewClicked() {
        showSearchBar();
        this.getMax = true;
        this.getMin.setMax();
    }

    public void showSearchBar() {
        this.clSearchToolbar.setVisibility(0);
        this.rlToolbarSearchView.setVisibility(8);
        EditText editText = this.etSearchToolbar;
        if (editText != null) {
            editText.requestFocus();
            setOnWheelViewListener.getMax((View) editText);
        }
    }

    public void setMenuLeftButton(@DrawableRes int i) {
        Toolbar toolbar = this.tbSearchView;
        if (toolbar != null && i != 0) {
            toolbar.setNavigationIcon(i);
            this.tbSearchView.setNavigationOnClickListener(new z(this));
            this.leftButtonSearchView.setVisibility(4);
        }
    }

    public void setMenuRightButton(@DrawableRes int i) {
        TextView textView = this.rightButtonSearchView;
        if (textView != null && i != 0) {
            textView.setBackground(getDrawableFromRes(i));
            this.rightButtonSearchView.setVisibility(0);
        }
    }

    public void setTitle(String str) {
        this.tvSearchViewTitle.setText(str);
    }

    public void showClearSearchButton() {
        this.ivClearToolbarSearch.setVisibility(0);
    }

    public void hideClearSearchButton() {
        this.ivClearToolbarSearch.setVisibility(8);
    }

    public Drawable getDrawableFromRes(@DrawableRes int i) {
        return IntRange.length(getContext(), i);
    }

    public void clearSearch() {
        this.etSearchToolbar.getText().clear();
        EditText editText = this.etSearchToolbar;
        if (editText != null) {
            editText.requestFocus();
            setOnWheelViewListener.getMax((View) editText);
        }
        this.getMin.getMax();
    }

    public void hideKeyboard() {
        setOnWheelViewListener.length((View) this.etSearchToolbar);
    }

    public void setSearchIconVisibility(int i) {
        TextView textView = this.rightButtonSearchView;
        if (textView != null) {
            textView.setVisibility(i);
        }
        if (i == 8 || i == 4) {
            length(false);
        }
    }

    public void setup() {
        View view = (View) this.rightButtonSearchView.getParent();
        view.post(new GriverCapturePreviewActivity.DeleteRunnable(this, view));
    }

    public static /* synthetic */ void getMin(ToolbarSearchView toolbarSearchView, View view) {
        Rect rect = new Rect();
        toolbarSearchView.rightButtonSearchView.getHitRect(rect);
        rect.top -= 5;
        rect.left -= 10;
        rect.bottom += 5;
        rect.right += 10;
        view.setTouchDelegate(new TouchDelegate(rect, toolbarSearchView.rightButtonSearchView));
    }
}
