package id.dana.sendmoney.confirmation;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.UiThread;
import id.dana.R;
import id.dana.base.BaseActivity_ViewBinding;
import id.dana.richview.CurrencyTextView;
import id.dana.richview.LogoProgressView;
import id.dana.richview.SelectedAccountView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class SendMoneyConfirmationActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View length;
    private SendMoneyConfirmationActivity setMin;

    @UiThread
    public SendMoneyConfirmationActivity_ViewBinding(final SendMoneyConfirmationActivity sendMoneyConfirmationActivity, View view) {
        super(sendMoneyConfirmationActivity, view);
        this.setMin = sendMoneyConfirmationActivity;
        View max = drawDividersHorizontal.getMax(view, R.id.f36132131362062, "field 'btnConfirm' and method 'confirmSendMoney'");
        sendMoneyConfirmationActivity.btnConfirm = (Button) drawDividersHorizontal.getMin(max, R.id.f36132131362062, "field 'btnConfirm'", Button.class);
        this.length = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                sendMoneyConfirmationActivity.confirmSendMoney();
            }
        });
        sendMoneyConfirmationActivity.ivProfile = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50262131363581, "field 'ivProfile'", ImageView.class);
        sendMoneyConfirmationActivity.lpvLoading = (LogoProgressView) drawDividersHorizontal.setMin(view, R.id.f54102131363967, "field 'lpvLoading'", LogoProgressView.class);
        sendMoneyConfirmationActivity.originView = (SelectedAccountView) drawDividersHorizontal.setMin(view, R.id.f56282131364197, "field 'originView'", SelectedAccountView.class);
        sendMoneyConfirmationActivity.tvAccountNumber = (TextView) drawDividersHorizontal.setMin(view, R.id.f64542131365079, "field 'tvAccountNumber'", TextView.class);
        sendMoneyConfirmationActivity.tvAdditional = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f64652131365090, "field 'tvAdditional'", CurrencyTextView.class);
        sendMoneyConfirmationActivity.llAdditionalFee = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f52672131363823, "field 'llAdditionalFee'", LinearLayout.class);
        sendMoneyConfirmationActivity.tvAmount = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f64772131365102, "field 'tvAmount'", CurrencyTextView.class);
        sendMoneyConfirmationActivity.tvNote = (TextView) drawDividersHorizontal.setMin(view, R.id.f67702131365397, "field 'tvNote'", TextView.class);
        sendMoneyConfirmationActivity.notesView = drawDividersHorizontal.getMax(view, R.id.f51932131363749, "field 'notesView'");
        sendMoneyConfirmationActivity.tvExpiry = (TextView) drawDividersHorizontal.setMin(view, R.id.f66212131365248, "field 'tvExpiry'", TextView.class);
        sendMoneyConfirmationActivity.expiryTimeView = drawDividersHorizontal.getMax(view, R.id.f51842131363740, "field 'expiryTimeView'");
        sendMoneyConfirmationActivity.tvName = (TextView) drawDividersHorizontal.setMin(view, R.id.f67452131365372, "field 'tvName'", TextView.class);
        sendMoneyConfirmationActivity.tvWarning = (TextView) drawDividersHorizontal.setMin(view, R.id.f70402131365670, "field 'tvWarning'", TextView.class);
        sendMoneyConfirmationActivity.tvTotal = (TextView) drawDividersHorizontal.setMin(view, R.id.f70112131365641, "field 'tvTotal'", TextView.class);
        sendMoneyConfirmationActivity.ctvVoucher = (CurrencyTextView) drawDividersHorizontal.setMin(view, R.id.f41302131362616, "field 'ctvVoucher'", CurrencyTextView.class);
        sendMoneyConfirmationActivity.llVoucher = (LinearLayout) drawDividersHorizontal.setMin(view, R.id.f53862131363942, "field 'llVoucher'", LinearLayout.class);
        sendMoneyConfirmationActivity.tvTransferNote = (TextView) drawDividersHorizontal.setMin(view, R.id.f70182131365648, "field 'tvTransferNote'", TextView.class);
    }

    public final void setMax() {
        SendMoneyConfirmationActivity sendMoneyConfirmationActivity = this.setMin;
        if (sendMoneyConfirmationActivity != null) {
            this.setMin = null;
            sendMoneyConfirmationActivity.btnConfirm = null;
            sendMoneyConfirmationActivity.ivProfile = null;
            sendMoneyConfirmationActivity.lpvLoading = null;
            sendMoneyConfirmationActivity.originView = null;
            sendMoneyConfirmationActivity.tvAccountNumber = null;
            sendMoneyConfirmationActivity.tvAdditional = null;
            sendMoneyConfirmationActivity.llAdditionalFee = null;
            sendMoneyConfirmationActivity.tvAmount = null;
            sendMoneyConfirmationActivity.tvNote = null;
            sendMoneyConfirmationActivity.notesView = null;
            sendMoneyConfirmationActivity.tvExpiry = null;
            sendMoneyConfirmationActivity.expiryTimeView = null;
            sendMoneyConfirmationActivity.tvName = null;
            sendMoneyConfirmationActivity.tvWarning = null;
            sendMoneyConfirmationActivity.tvTotal = null;
            sendMoneyConfirmationActivity.ctvVoucher = null;
            sendMoneyConfirmationActivity.llVoucher = null;
            sendMoneyConfirmationActivity.tvTransferNote = null;
            this.length.setOnClickListener((View.OnClickListener) null);
            this.length = null;
            super.setMax();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
