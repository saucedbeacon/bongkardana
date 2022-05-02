package id.dana.richview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.annotation.ColorRes;
import androidx.appcompat.widget.AppCompatEditText;
import id.dana.R;
import id.dana.model.CurrencyAmountModel;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.APImageDownloadRsp;
import o.IntRange;
import o.TitleBarRightButtonView;
import o.WheelView;
import o.getSecureSignatureComp;
import o.hideProgress;
import o.isOriginHasAppInfo;
import o.onLoadChildren;
import o.onPictureTaken;

public class CurrencyEditText extends AppCompatEditText {
    /* access modifiers changed from: private */
    public String getMax;
    private TextWatcher getMin;
    private setMax setMin;

    public interface setMax {
        void getMax();
    }

    public String getPrefix() {
        return "Rp";
    }

    public CurrencyEditText(Context context) {
        super(context);
        getMax();
    }

    public CurrencyEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getMax();
    }

    public CurrencyEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        getMax();
    }

    private void getMax() {
        setInputType(2);
        setTransformationMethod((TransformationMethod) null);
        setHint(getPrefix());
        setHintTextColor(IntRange.setMax(getContext(), R.color.f18552131099733));
        getBackground().setColorFilter(IntRange.setMax(getContext(), R.color.f24622131100412), PorterDuff.Mode.SRC_IN);
        this.getMin = new TextWatcher() {
            private int getMax;
            private int setMax;

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                this.getMax = CurrencyEditText.this.getSelectionStart();
                this.setMax = CurrencyEditText.this.getText().toString().length() - this.getMax;
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                String obj = editable.toString();
                if (!obj.contains(CurrencyEditText.this.getPrefix()) || !obj.startsWith(CurrencyEditText.this.getPrefix())) {
                    CurrencyEditText.this.removeTextChangedListener(this);
                    StringBuilder sb = new StringBuilder();
                    sb.append(CurrencyEditText.this.getPrefix());
                    sb.append(obj);
                    CurrencyEditText.this.setText(sb.toString());
                    try {
                        CurrencyEditText.this.setSelection(this.getMax);
                    } catch (Exception unused) {
                    }
                    CurrencyEditText.this.addTextChangedListener(this);
                } else if (obj.equals(CurrencyEditText.this.getPrefix())) {
                    CurrencyEditText.this.removeTextChangedListener(this);
                    CurrencyEditText.access$000(CurrencyEditText.this, 0);
                    CurrencyEditText currencyEditText = CurrencyEditText.this;
                    currencyEditText.setSelection(currencyEditText.getText().length());
                    CurrencyEditText.this.addTextChangedListener(this);
                } else {
                    String replaceAll = obj.replaceAll("[^0-9]", "");
                    if (!replaceAll.equals(CurrencyEditText.this.getMax) && !replaceAll.isEmpty()) {
                        if (replaceAll.startsWith("0")) {
                            replaceAll = replaceAll.substring(1);
                        }
                        String unused2 = CurrencyEditText.this.getMax = replaceAll;
                        CurrencyEditText.this.removeTextChangedListener(this);
                        CurrencyEditText.access$000(CurrencyEditText.this, new APImageDownloadRsp(replaceAll).setMin);
                        CurrencyEditText currencyEditText2 = CurrencyEditText.this;
                        if (currencyEditText2.getText().length() - this.setMax < 0) {
                            i = 0;
                        } else {
                            i = CurrencyEditText.this.getText().length() - this.setMax;
                        }
                        currencyEditText2.setSelection(i);
                        CurrencyEditText.this.addTextChangedListener(this);
                    }
                }
            }
        };
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public String getAmount() {
        return isOriginHasAppInfo.getCleanDot(getText().toString().replaceAll("Rp", ""));
    }

    public void setLocked(boolean z) {
        getBackground().setColorFilter(IntRange.setMax(getContext(), z ? R.color.f24202131100363 : R.color.f24622131100412), PorterDuff.Mode.SRC_IN);
    }

    public void removeUnderline() {
        setBackgroundResource(17170445);
    }

    public void setListener(setMax setmax) {
        this.setMin = setmax;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        setMax setmax;
        if (4 == keyEvent.getKeyCode() && (setmax = this.setMin) != null) {
            setmax.getMax();
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        if (!TextUtils.isEmpty(getText())) {
            setSelection(getText().length());
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            addTextChangedListener(this.getMin);
        } else {
            removeTextChangedListener(this.getMin);
        }
    }

    public void setTextHintColor(@ColorRes int i) {
        setHintTextColor(IntRange.setMax(getContext(), i));
    }

    public void setTextHint(String str) {
        setHint(str);
    }

    public TitleBarRightButtonView.AnonymousClass1<String> listenOriginalValue() {
        return onLoadChildren.textChanges(this).skipInitialValue().subscribeOn(getSecureSignatureComp.setMin()).map(onPictureTaken.setMax).debounce(100, TimeUnit.MILLISECONDS).observeOn(hideProgress.length());
    }

    public CurrencyAmountModel getAmountModel() {
        return new CurrencyAmountModel(getAmount(), getPrefix());
    }

    static /* synthetic */ void access$000(CurrencyEditText currencyEditText, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(currencyEditText.getPrefix());
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        sb.append(NumberFormat.getNumberInstance(WheelView.OnWheelViewListener.getMax).format(j));
        currencyEditText.setText(sb.toString());
    }
}
