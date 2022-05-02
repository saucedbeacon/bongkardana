package o;

import android.view.View;
import id.dana.richview.calculator.adapter.CalculatorAdapter;

public final class doPictureProcess implements View.OnLongClickListener {
    private final CalculatorAdapter.CalculatorViewHolder getMax;

    public doPictureProcess(CalculatorAdapter.CalculatorViewHolder calculatorViewHolder) {
        this.getMax = calculatorViewHolder;
    }

    public final boolean onLongClick(View view) {
        return this.getMax.setMin();
    }
}
