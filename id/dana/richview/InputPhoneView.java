package id.dana.richview;

import android.content.Context;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;
import id.dana.R;
import id.dana.base.BaseRichView;
import java.util.ArrayList;
import java.util.List;
import o.AUScreenUtils;
import o.checkApFlag;
import o.checkOppoConcave;
import o.getPxFromResourceId;
import o.setWhiteListAP;

public class InputPhoneView extends BaseRichView {
    @BindView(2131363211)
    EditText input;
    @BindView(2131364271)
    TextView prefix;
    @BindView(2131364645)
    View separator;
    /* access modifiers changed from: private */
    public checkApFlag setMin;

    public int getLayout() {
        return R.layout.view_input_phone;
    }

    public InputPhoneView(@NonNull Context context) {
        super(context);
    }

    public InputPhoneView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InputPhoneView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InputPhoneView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setup() {
        getResources();
        this.input.setTransformationMethod((TransformationMethod) null);
        AUScreenUtils.setMin setmin = new AUScreenUtils.setMin(this.input, (byte) 0);
        setmin.setMax = new getPxFromResourceId();
        AnonymousClass2 r0 = new checkOppoConcave() {
            final /* synthetic */ int setMax = 9;

            public final String getMax() {
                return "Length is below minimum";
            }

            public final boolean getMax(String str) {
                return str.length() >= this.setMax;
            }
        };
        if (setmin.setMin == null) {
            setmin.setMin = new ArrayList();
        }
        setmin.setMin.add(r0);
        setmin.getMin = new checkApFlag() {
            public final void getMax(String str) {
                View view = InputPhoneView.this.separator;
                InputPhoneView.this.getResources();
                view.setBackgroundColor(-1);
                if (InputPhoneView.this.setMin != null) {
                    InputPhoneView.this.setMin.getMax(str);
                }
            }

            public final void getMin(String str, List<setWhiteListAP> list) {
                InputPhoneView.this.separator.setBackgroundColor(InputPhoneView.this.getResources().getColor(str.length() > 0 ? R.color.f24762131100430 : R.color.f24772131100431));
                if (InputPhoneView.this.setMin != null) {
                    InputPhoneView.this.setMin.getMin(str, list);
                }
            }
        };
        setmin.setMax();
    }

    public String getPrefix() {
        return this.prefix.getText().toString();
    }

    public void setPrefix(String str) {
        this.prefix.setText(str);
    }

    public EditText getInput() {
        return this.input;
    }

    public void setInput(String str) {
        this.input.setText(str);
    }

    public void setEditable(boolean z) {
        this.input.setFocusable(z);
        this.input.setFocusableInTouchMode(z);
        this.input.setClickable(z);
    }

    public void setOnValidatedListener(checkApFlag checkapflag) {
        this.setMin = checkapflag;
    }

    public String getCompletePhoneNumber() {
        String replaceAll = this.input.getText().toString().replaceAll("-", "");
        StringBuilder sb = new StringBuilder();
        sb.append(getPrefix());
        sb.append(replaceAll);
        return sb.toString();
    }
}
