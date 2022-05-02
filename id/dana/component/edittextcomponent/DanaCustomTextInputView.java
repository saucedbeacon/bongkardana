package id.dana.component.edittextcomponent;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import id.dana.component.BaseRichView;
import o.OptIn;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.setBackgroundColorRes;

public class DanaCustomTextInputView extends BaseRichView {
    private TextView IsOverlapping;
    private boolean getMax;
    /* access modifiers changed from: private */
    public View getMin;
    private String isInside;
    private int length;
    private int setMax;
    private String setMin;
    private EditText toIntRange;

    public DanaCustomTextInputView(@NonNull Context context) {
        super(context);
    }

    public DanaCustomTextInputView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DanaCustomTextInputView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getLayout() {
        return setBackgroundColorRes.toIntRange.view_custom_text_input;
    }

    public void parseAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, setBackgroundColorRes.IsOverlapping.ITrustedWebActivityService$Stub$Proxy, 0, 0);
            try {
                this.getMax = obtainStyledAttributes.getBoolean(setBackgroundColorRes.IsOverlapping.INotificationSideChannel$Default, true);
                this.setMax = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.cancel, 2);
                this.setMin = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.INotificationSideChannel$Stub$Proxy);
                this.length = obtainStyledAttributes.getInt(setBackgroundColorRes.IsOverlapping.cancelAll, 0);
                this.isInside = obtainStyledAttributes.getString(setBackgroundColorRes.IsOverlapping.INotificationSideChannel$Stub);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    private void getMin() {
        if (this.length > 0) {
            this.toIntRange.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.length)});
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.text.Editable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.text.Editable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: android.text.Editable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getValue() {
        /*
            r2 = this;
            boolean r0 = r2.getMax
            if (r0 == 0) goto L_0x0028
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.widget.TextView r1 = r2.IsOverlapping
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            android.widget.EditText r1 = r2.toIntRange
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L_0x0023:
            java.lang.String r0 = r0.toString()
            return r0
        L_0x0028:
            android.widget.EditText r0 = r2.toIntRange
            android.text.Editable r0 = r0.getText()
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.component.edittextcomponent.DanaCustomTextInputView.getValue():java.lang.String");
    }

    public void setPrefixEnable(boolean z) {
        this.getMax = z;
        this.IsOverlapping.setVisibility(z ? 0 : 8);
    }

    public void setPrefixValue(String str) {
        this.isInside = str;
        this.IsOverlapping.setText(TextUtils.isEmpty(str) ? "+62" : this.isInside);
    }

    public void setInputType(int i) {
        this.setMax = i;
        this.toIntRange.setInputType(i);
    }

    public void setHint(String str) {
        int length2 = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length2);
        if (length2 != max) {
            onCanceled oncanceled = new onCanceled(length2, max, 1);
            onCancelLoad.setMax(-1068146944, oncanceled);
            onCancelLoad.getMin(-1068146944, oncanceled);
        }
        this.setMin = str;
        this.toIntRange.setHint(str);
    }

    public void setMaxLength(int i) {
        this.length = i;
        getMin();
    }

    public void setup() {
        this.getMin = findViewById(setBackgroundColorRes.length.ITrustedWebActivityCallback);
        this.toIntRange = (EditText) findViewById(setBackgroundColorRes.length.invokeSuspend);
        TextView textView = (TextView) findViewById(setBackgroundColorRes.length.postMessage);
        this.IsOverlapping = textView;
        textView.setVisibility(this.getMax ? 0 : 8);
        this.toIntRange.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() != 0) {
                    DanaCustomTextInputView.this.getMin.setBackgroundColor(OptIn.setMin(DanaCustomTextInputView.this.getResources(), setBackgroundColorRes.getMax.IsOverlapping, (Resources.Theme) null));
                } else {
                    DanaCustomTextInputView.this.getMin.setBackgroundColor(OptIn.setMin(DanaCustomTextInputView.this.getResources(), setBackgroundColorRes.getMax.toIntRange, (Resources.Theme) null));
                }
            }
        });
        this.toIntRange.setInputType(this.setMax);
        this.toIntRange.setHint(this.setMin);
        getMin();
        this.IsOverlapping.setText(TextUtils.isEmpty(this.isInside) ? "+62" : this.isInside);
    }
}
