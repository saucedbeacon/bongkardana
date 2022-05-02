package id.dana.richview;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import com.google.android.material.textfield.TextInputLayout;
import id.dana.R;
import o.drawDividersHorizontal;

public class CommonInputFieldView_ViewBinding implements Unbinder {
    private CommonInputFieldView getMax;

    @UiThread
    public CommonInputFieldView_ViewBinding(CommonInputFieldView commonInputFieldView, View view) {
        this.getMax = commonInputFieldView;
        commonInputFieldView.sideIcon = (ImageView) drawDividersHorizontal.setMin(view, R.id.f60762131364665, "field 'sideIcon'", ImageView.class);
        commonInputFieldView.inputLayout = (TextInputLayout) drawDividersHorizontal.setMin(view, R.id.f46702131363217, "field 'inputLayout'", TextInputLayout.class);
        commonInputFieldView.etGroup = (TextInputLayout) drawDividersHorizontal.setMin(view, R.id.f43042131362822, "field 'etGroup'", TextInputLayout.class);
        commonInputFieldView.lblTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f52112131363767, "field 'lblTitle'", TextView.class);
        commonInputFieldView.etInputMaterial = (EditText) drawDividersHorizontal.setMin(view, R.id.f43052131362823, "field 'etInputMaterial'", EditText.class);
        commonInputFieldView.etInputCommon = (EditText) drawDividersHorizontal.setMin(view, R.id.f43062131362824, "field 'etInputCommon'", EditText.class);
        commonInputFieldView.btnClear = (Button) drawDividersHorizontal.setMin(view, R.id.f40552131362535, "field 'btnClear'", Button.class);
    }

    @CallSuper
    public final void setMax() {
        CommonInputFieldView commonInputFieldView = this.getMax;
        if (commonInputFieldView != null) {
            this.getMax = null;
            commonInputFieldView.sideIcon = null;
            commonInputFieldView.inputLayout = null;
            commonInputFieldView.etGroup = null;
            commonInputFieldView.lblTitle = null;
            commonInputFieldView.etInputMaterial = null;
            commonInputFieldView.etInputCommon = null;
            commonInputFieldView.btnClear = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
