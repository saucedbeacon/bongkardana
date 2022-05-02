package id.dana.sendmoney.bank.other;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import id.dana.R;
import id.dana.richview.ForceImeEditText;
import id.dana.richview.bank.AutoCompleteBankView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class OtherBankAccountView_ViewBinding implements Unbinder {
    private View FastBitmap$CoordinateSystem;
    private View IsOverlapping;
    private View equals;
    private TextWatcher getMax;
    private OtherBankAccountView getMin;
    private View isInside;
    private View length;
    private View setMin;
    private View toFloatRange;
    private View toIntRange;

    @UiThread
    public OtherBankAccountView_ViewBinding(final OtherBankAccountView otherBankAccountView, View view) {
        this.getMin = otherBankAccountView;
        otherBankAccountView.autoCompleteBankView = (AutoCompleteBankView) drawDividersHorizontal.setMin(view, R.id.f72042131365839, "field 'autoCompleteBankView'", AutoCompleteBankView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f42982131362816, "field 'bankNumber', method 'inputBankNumberFocusChange', and method 'afterBankNumberChange'");
        otherBankAccountView.bankNumber = (TextInputEditText) drawDividersHorizontal.getMin(max, R.id.f42982131362816, "field 'bankNumber'", TextInputEditText.class);
        this.setMin = max;
        max.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                otherBankAccountView.inputBankNumberFocusChange(view, z);
            }
        });
        AnonymousClass1 r0 = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                otherBankAccountView.afterBankNumberChange(editable);
            }
        };
        this.getMax = r0;
        ((TextView) max).addTextChangedListener(r0);
        View max2 = drawDividersHorizontal.getMax(view, R.id.f36132131362062, "field 'btnConfirm' and method 'onConfirmClicked'");
        otherBankAccountView.btnConfirm = (Button) drawDividersHorizontal.getMin(max2, R.id.f36132131362062, "field 'btnConfirm'", Button.class);
        this.length = max2;
        max2.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                otherBankAccountView.onConfirmClicked(view);
            }
        });
        View max3 = drawDividersHorizontal.getMax(view, R.id.f42932131362811, "field 'etAlias' and method 'inputAliasFocusChange'");
        otherBankAccountView.etAlias = (ForceImeEditText) drawDividersHorizontal.getMin(max3, R.id.f42932131362811, "field 'etAlias'", ForceImeEditText.class);
        this.toFloatRange = max3;
        max3.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                otherBankAccountView.inputAliasFocusChange(view, z);
            }
        });
        View max4 = drawDividersHorizontal.getMax(view, R.id.f43142131362832, "field 'etSenderNameInput' and method 'inputSenderNameFocusChange'");
        otherBankAccountView.etSenderNameInput = (ForceImeEditText) drawDividersHorizontal.getMin(max4, R.id.f43142131362832, "field 'etSenderNameInput'", ForceImeEditText.class);
        this.IsOverlapping = max4;
        max4.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                otherBankAccountView.inputSenderNameFocusChange(view, z);
            }
        });
        otherBankAccountView.inputLayoutBankNumber = (TextInputLayout) drawDividersHorizontal.setMin(view, R.id.f46722131363219, "field 'inputLayoutBankNumber'", TextInputLayout.class);
        otherBankAccountView.inputLayoutSenderName = (TextInputLayout) drawDividersHorizontal.setMin(view, R.id.f46732131363220, "field 'inputLayoutSenderName'", TextInputLayout.class);
        View max5 = drawDividersHorizontal.getMax(view, R.id.f47952131363348, "field 'ivClearAlias' and method 'clearAlias'");
        otherBankAccountView.ivClearAlias = (ImageView) drawDividersHorizontal.getMin(max5, R.id.f47952131363348, "field 'ivClearAlias'", ImageView.class);
        this.toIntRange = max5;
        max5.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                otherBankAccountView.clearAlias();
            }
        });
        View max6 = drawDividersHorizontal.getMax(view, R.id.f48332131363387, "field 'ivClearBankNumber' and method 'clearBankNumber'");
        otherBankAccountView.ivClearBankNumber = (ImageView) drawDividersHorizontal.getMin(max6, R.id.f48332131363387, "field 'ivClearBankNumber'", ImageView.class);
        this.isInside = max6;
        max6.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                otherBankAccountView.clearBankNumber();
            }
        });
        View max7 = drawDividersHorizontal.getMax(view, R.id.f48342131363388, "field 'ivClearSenderName' and method 'clearSenderName'");
        otherBankAccountView.ivClearSenderName = (ImageView) drawDividersHorizontal.getMin(max7, R.id.f48342131363388, "field 'ivClearSenderName'", ImageView.class);
        this.equals = max7;
        max7.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                otherBankAccountView.clearSenderName();
            }
        });
        View max8 = drawDividersHorizontal.getMax(view, R.id.f54282131363986, "field 'mainLayout' and method 'onMainLayoutClicked'");
        otherBankAccountView.mainLayout = max8;
        this.FastBitmap$CoordinateSystem = max8;
        max8.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                otherBankAccountView.onMainLayoutClicked();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        OtherBankAccountView otherBankAccountView = this.getMin;
        if (otherBankAccountView != null) {
            this.getMin = null;
            otherBankAccountView.autoCompleteBankView = null;
            otherBankAccountView.bankNumber = null;
            otherBankAccountView.btnConfirm = null;
            otherBankAccountView.etAlias = null;
            otherBankAccountView.etSenderNameInput = null;
            otherBankAccountView.inputLayoutBankNumber = null;
            otherBankAccountView.inputLayoutSenderName = null;
            otherBankAccountView.ivClearAlias = null;
            otherBankAccountView.ivClearBankNumber = null;
            otherBankAccountView.ivClearSenderName = null;
            otherBankAccountView.mainLayout = null;
            this.setMin.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            ((TextView) this.setMin).removeTextChangedListener(this.getMax);
            this.getMax = null;
            this.setMin = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            this.toFloatRange.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            this.toFloatRange = null;
            this.IsOverlapping.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            this.IsOverlapping = null;
            this.toIntRange.setOnClickListener((View.OnClickListener) null);
            this.toIntRange = null;
            this.isInside.setOnClickListener((View.OnClickListener) null);
            this.isInside = null;
            this.equals.setOnClickListener((View.OnClickListener) null);
            this.equals = null;
            this.FastBitmap$CoordinateSystem.setOnClickListener((View.OnClickListener) null);
            this.FastBitmap$CoordinateSystem = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
