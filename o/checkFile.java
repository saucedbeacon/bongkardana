package o;

import id.dana.sendmoney.calculator.CalculatorActivity;

public final class checkFile implements RedDotManager {
    private final CalculatorActivity setMin;

    public checkFile(CalculatorActivity calculatorActivity) {
        this.setMin = calculatorActivity;
    }

    public final void accept(Object obj) {
        this.setMin.presenter.setMax((String) obj);
    }
}
