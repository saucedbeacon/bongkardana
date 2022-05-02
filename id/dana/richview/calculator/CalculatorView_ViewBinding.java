package id.dana.richview.calculator;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class CalculatorView_ViewBinding implements Unbinder {
    private CalculatorView getMin;

    @UiThread
    public CalculatorView_ViewBinding(CalculatorView calculatorView, View view) {
        this.getMin = calculatorView;
        calculatorView.rvCalculator = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59142131364499, "field 'rvCalculator'", RecyclerView.class);
        calculatorView.tvHintOperandLeft = (TextView) drawDividersHorizontal.setMin(view, R.id.f66682131365295, "field 'tvHintOperandLeft'", TextView.class);
        calculatorView.tvHintOperandRight = (TextView) drawDividersHorizontal.setMin(view, R.id.f66692131365296, "field 'tvHintOperandRight'", TextView.class);
        calculatorView.tvHintOperator = (TextView) drawDividersHorizontal.setMin(view, R.id.f66702131365297, "field 'tvHintOperator'", TextView.class);
        calculatorView.separator = drawDividersHorizontal.getMax(view, R.id.f73702131366005, "field 'separator'");
    }

    @CallSuper
    public final void setMax() {
        CalculatorView calculatorView = this.getMin;
        if (calculatorView != null) {
            this.getMin = null;
            calculatorView.rvCalculator = null;
            calculatorView.tvHintOperandLeft = null;
            calculatorView.tvHintOperandRight = null;
            calculatorView.tvHintOperator = null;
            calculatorView.separator = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
