package id.dana.sendmoney.calculator;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.calculator.CalculatorView;
import id.dana.sendmoney.summary.SummaryRichView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class CalculatorActivity_ViewBinding extends BaseActivity_ViewBinding {
    private CalculatorActivity length;
    private View setMin;

    @UiThread
    public CalculatorActivity_ViewBinding(final CalculatorActivity calculatorActivity, View view) {
        super(calculatorActivity, view);
        this.length = calculatorActivity;
        calculatorActivity.btnSetAmount = (Button) drawDividersHorizontal.setMin(view, R.id.f36802131362132, "field 'btnSetAmount'", Button.class);
        calculatorActivity.calculatorPadView = (CalculatorView) drawDividersHorizontal.setMin(view, R.id.f41722131362659, "field 'calculatorPadView'", CalculatorView.class);
        calculatorActivity.crvAmountValue = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f41202131362606, "field 'crvAmountValue'", CurrencyTextView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f48372131363391, "field 'ivClose' and method 'closeRecipient'");
        calculatorActivity.ivClose = (ImageView) drawDividersHorizontal.getMin(max, R.id.f48372131363391, "field 'ivClose'", ImageView.class);
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                calculatorActivity.closeRecipient();
            }
        });
        calculatorActivity.ivDanaUserLogo = (ImageView) drawDividersHorizontal.setMin(view, R.id.f48582131363412, "field 'ivDanaUserLogo'", ImageView.class);
        calculatorActivity.ivRecipient = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50462131363601, "field 'ivRecipient'", ImageView.class);
        calculatorActivity.rcSummaryView = (SummaryRichView) drawDividersHorizontal.setMin(view, R.id.f57492131364327, "field 'rcSummaryView'", SummaryRichView.class);
        calculatorActivity.tvErrorMsg = (TextView) drawDividersHorizontal.setMin(view, R.id.f66132131365240, "field 'tvErrorMsg'", TextView.class);
        calculatorActivity.tvRecipientName = (TextView) drawDividersHorizontal.setMin(view, R.id.f68672131365494, "field 'tvRecipientName'", TextView.class);
        calculatorActivity.tvRecipientNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f68682131365495, "field 'tvRecipientNumber'", TextView.class);
    }

    public final void setMax() {
        CalculatorActivity calculatorActivity = this.length;
        if (calculatorActivity != null) {
            this.length = null;
            calculatorActivity.btnSetAmount = null;
            calculatorActivity.calculatorPadView = null;
            calculatorActivity.crvAmountValue = null;
            calculatorActivity.ivClose = null;
            calculatorActivity.ivDanaUserLogo = null;
            calculatorActivity.ivRecipient = null;
            calculatorActivity.rcSummaryView = null;
            calculatorActivity.tvErrorMsg = null;
            calculatorActivity.tvRecipientName = null;
            calculatorActivity.tvRecipientNumber = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
