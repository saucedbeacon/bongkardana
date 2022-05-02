package o;

import android.view.View;
import id.dana.sendmoney.calculator.CalculatorActivity;

public final class isCanUseRandomAccessFileExif implements View.OnClickListener {
    private final CalculatorActivity length;

    public isCanUseRandomAccessFileExif(CalculatorActivity calculatorActivity) {
        this.length = calculatorActivity;
    }

    public final void onClick(View view) {
        CalculatorActivity.length(this.length);
    }
}
