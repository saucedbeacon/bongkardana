package o;

import android.view.View;
import id.dana.sendmoney.calculator.CalculatorActivity;

public final class BFileUtils implements View.OnClickListener {
    private final CalculatorActivity getMax;

    public BFileUtils(CalculatorActivity calculatorActivity) {
        this.getMax = calculatorActivity;
    }

    public final void onClick(View view) {
        this.getMax.showSummaryView();
    }
}
