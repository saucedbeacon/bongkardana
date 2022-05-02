package o;

import android.view.View;
import id.dana.richview.calculator.adapter.CalculatorAdapter;

public final class getSaveFile implements View.OnClickListener {
    private final CalculatorAdapter.CalculatorViewHolder length;

    public getSaveFile(CalculatorAdapter.CalculatorViewHolder calculatorViewHolder) {
        this.length = calculatorViewHolder;
    }

    public final void onClick(View view) {
        this.length.getMax.onOperatorClicked(this.length.setMin.length);
    }
}
