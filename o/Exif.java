package o;

import android.content.DialogInterface;
import id.dana.sendmoney.calculator.CalculatorActivity;

public final class Exif implements DialogInterface.OnDismissListener {
    private final CalculatorActivity setMin;

    public Exif(CalculatorActivity calculatorActivity) {
        this.setMin = calculatorActivity;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        CalculatorActivity.setMin(this.setMin);
    }
}
