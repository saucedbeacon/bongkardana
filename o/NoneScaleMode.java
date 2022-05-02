package o;

import android.view.ViewTreeObserver;
import id.dana.sendmoney.calculator.CalculatorActivity;

public final class NoneScaleMode implements ViewTreeObserver.OnGlobalLayoutListener {
    private final CalculatorActivity setMax;

    public NoneScaleMode(CalculatorActivity calculatorActivity) {
        this.setMax = calculatorActivity;
    }

    public final void onGlobalLayout() {
        this.setMax.rcSummaryView.setPeekHeightBasedOnView(this.setMax.calculatorPadView);
    }
}
