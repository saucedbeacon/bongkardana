package id.dana.richview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.OnTextChanged;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.GriverPhotoSelectActivity;
import o.IComponent;
import o.getAbsPath;
import o.resetInternal;
import o.setOnWheelViewListener;

public class SearchView extends BaseRichView {
    @BindView(2131362830)
    EditText etSearchContact;
    private IComponent<Boolean> getMax = IComponent.setMax();
    @BindView(2131363385)
    ImageView ivClear;
    private IComponent<String> length = IComponent.setMax();
    @BindView(2131364234)
    ProgressBar pbLoading;
    private Drawable setMax;
    private String setMin;

    public int getLayout() {
        return R.layout.view_search;
    }

    public SearchView(@NonNull Context context) {
        super(context);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, resetInternal.getMin.getDefaultViewModelProviderFactory);
            try {
                this.setMax = obtainStyledAttributes.getDrawable(4);
                this.setMin = obtainStyledAttributes.getString(17);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setup() {
        Drawable drawable = this.setMax;
        if (drawable != null) {
            this.etSearchContact.setBackground(drawable);
        }
        this.etSearchContact.setImeOptions(6);
        this.etSearchContact.setOnFocusChangeListener(new getAbsPath(this));
        this.etSearchContact.setOnClickListener(new GriverPhotoSelectActivity(this));
        String str = this.setMin;
        if (str != null) {
            this.etSearchContact.setHint(str);
        }
    }

    public void setSearchHint(String str) {
        this.etSearchContact.setHint(str);
    }

    public void focusEtSearchContact() {
        this.etSearchContact.requestFocus();
        this.etSearchContact.setFocusableInTouchMode(true);
        setOnWheelViewListener.setMax(getContext());
    }

    public boolean isClearImageViewRect(int i, int i2) {
        Rect rect = new Rect();
        this.ivClear.getGlobalVisibleRect(rect);
        return rect.contains(i, i2);
    }

    public IComponent<String> getKeyword() {
        return this.length;
    }

    public IComponent<Boolean> getOnSearchClickedEvent() {
        return this.getMax;
    }

    public EditText getEditText() {
        return this.etSearchContact;
    }

    public void showLoading(boolean z) {
        int i = 0;
        if (z) {
            this.ivClear.setVisibility(8);
            this.pbLoading.setVisibility(0);
            return;
        }
        ImageView imageView = this.ivClear;
        if (TextUtils.isEmpty(this.etSearchContact.getText())) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.pbLoading.setVisibility(8);
    }

    @OnClick({2131363385})
    public void clearKeyword() {
        this.ivClear.setVisibility(8);
        this.etSearchContact.setText("");
    }

    public void clearSearchFocus() {
        this.etSearchContact.clearFocus();
    }

    /* access modifiers changed from: protected */
    @OnTextChanged(callback = OnTextChanged.Callback.AFTER_TEXT_CHANGED, value = {2131362830})
    public void afterBankNumberChange(Editable editable) {
        this.length.onNext(editable.toString());
        this.ivClear.setVisibility(TextUtils.isEmpty(editable) ? 8 : 0);
        int i = 16;
        if (!TextUtils.isEmpty(editable)) {
            i = 28;
        }
        this.etSearchContact.setPadding((int) (Resources.getSystem().getDisplayMetrics().density * 16.0f), (int) (Resources.getSystem().getDisplayMetrics().density * 8.0f), (int) (((float) i) * Resources.getSystem().getDisplayMetrics().density), (int) (Resources.getSystem().getDisplayMetrics().density * 8.0f));
    }

    public void setSearchViewInputType(int i) {
        this.etSearchContact.setInputType(i);
    }
}
