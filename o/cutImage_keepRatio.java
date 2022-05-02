package o;

import dagger.internal.InjectedFieldSignature;
import id.dana.sendmoney.calculator.CalculatorActivity;
import o.DiagnosticsReceiver;

public final class cutImage_keepRatio implements getBindingAdapter<CalculatorActivity> {
    @InjectedFieldSignature("id.dana.sendmoney.calculator.CalculatorActivity.presenter")
    public static void getMax(CalculatorActivity calculatorActivity, DiagnosticsReceiver.getMin getmin) {
        calculatorActivity.presenter = getmin;
    }
}
