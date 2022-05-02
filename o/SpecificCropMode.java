package o;

import android.content.DialogInterface;
import id.dana.sendmoney.calculator.CalculatorActivity;

public final class SpecificCropMode implements DialogInterface.OnDismissListener {
    private final CalculatorActivity length;

    public SpecificCropMode(CalculatorActivity calculatorActivity) {
        this.length = calculatorActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        CalculatorActivity.setMax(this.length);
    }
}
