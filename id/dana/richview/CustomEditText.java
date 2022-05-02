package id.dana.richview;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.R;
import id.dana.base.BaseRichView;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.onPictureTakenError;
import o.resetInternal;

public class CustomEditText extends BaseRichView {
    private EditText getMax;
    private ImageView length;
    private boolean setMax;
    private String setMin;

    public int getLayout() {
        return R.layout.view_custom_edittext;
    }

    public CustomEditText(@NonNull Context context) {
        super(context);
    }

    public CustomEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void init(Context context, AttributeSet attributeSet) {
        super.init(context, attributeSet);
        this.getMax.addTextChangedListener(new TextWatcher() {
            int getMax;

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.getMax = charSequence.length();
            }

            public final void afterTextChanged(Editable editable) {
                CustomEditText.access$000(CustomEditText.this, editable, this.getMax);
            }
        });
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        TextView textView = (TextView) findViewById(R.id.f65942131365221);
        this.getMax = (EditText) findViewById(R.id.f42992131362817);
        this.length = (ImageView) findViewById(R.id.f48402131363394);
        if (attributeSet != null) {
            setStyledAttributes(context, attributeSet, resetInternal.getMin.ITrustedWebActivityService);
            try {
                int i = getStyledAttributes().getInt(4, 0);
                int i2 = getStyledAttributes().getInt(1, 0);
                this.getMax.setHint(getStyledAtrributesString(2));
                this.getMax.setFocusable(getStyledAttributes().getBoolean(0, true));
                if (i2 != 0) {
                    this.getMax.setInputType(i2);
                }
                if (i > 0) {
                    this.getMax.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
                }
                int resourceId = getStyledAttributes().getResourceId(3, 0);
                if (resourceId > 0) {
                    this.length.setImageResource(resourceId);
                }
                textView.setText(getStyledAtrributesString(5));
            } finally {
                getStyledAttributes().recycle();
            }
        }
    }

    public void setup() {
        getRootView().setOnClickListener(onPictureTakenError.length);
    }

    private boolean getMax() {
        return getText().equalsIgnoreCase(TextUtils.isEmpty(this.setMin) ? "" : this.setMin);
    }

    public boolean isManualInput() {
        return this.setMax;
    }

    public EditText getEtCustomEditText() {
        return this.getMax;
    }

    public String getText() {
        return this.getMax.getText().toString();
    }

    public void clearText() {
        EditText editText = this.getMax;
        if (editText != null) {
            editText.getText().clear();
        }
    }

    public void setOnEtCustomEditTextClicked(View.OnClickListener onClickListener) {
        this.getMax.setOnClickListener(onClickListener);
    }

    public void setOnIconClickListener(View.OnClickListener onClickListener) {
        this.length.setOnClickListener(onClickListener);
    }

    public void setText(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(1406501652, oncanceled);
            onCancelLoad.getMin(1406501652, oncanceled);
        }
        if (TextUtils.isEmpty(getText()) && str.length() > 2) {
            this.setMin = str;
        }
        this.getMax.setText(str);
    }

    static /* synthetic */ void access$000(CustomEditText customEditText, Editable editable, int i) {
        int length2 = editable.length() - i;
        boolean z = true;
        if (length2 > 1 || customEditText.getMax()) {
            z = false;
        }
        customEditText.setMax = z;
    }
}
