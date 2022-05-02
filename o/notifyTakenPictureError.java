package o;

import android.view.View;
import id.dana.richview.calculator.adapter.CalculatorAdapter;

public final class notifyTakenPictureError implements View.OnClickListener {
    private final CalculatorAdapter.CalculatorViewHolder getMin;
    private final int setMax;

    public notifyTakenPictureError(CalculatorAdapter.CalculatorViewHolder calculatorViewHolder, int i) {
        this.getMin = calculatorViewHolder;
        this.setMax = i;
    }

    public final void onClick(View view) {
        this.getMin.getMax.onPadClicked(this.getMin.setMin.getMin.get(this.setMax));
    }
}
