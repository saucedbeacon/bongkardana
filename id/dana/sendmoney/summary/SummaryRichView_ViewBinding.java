package id.dana.sendmoney.summary;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.feed.ShareToFeedsView;
import id.dana.sendmoney.paymethod.ChangePayMethodView;
import id.dana.sendmoney.remarks.NoteView;
import id.dana.sendmoney.view.ExpireTimeView;
import id.dana.sendmoney.voucher.ChangeVoucherView;
import o.drawDividersHorizontal;

public class SummaryRichView_ViewBinding implements Unbinder {
    private SummaryRichView getMin;

    @UiThread
    public SummaryRichView_ViewBinding(SummaryRichView summaryRichView, View view) {
        this.getMin = summaryRichView;
        summaryRichView.btnConfirm = (Button) drawDividersHorizontal.setMin(view, R.id.f36132131362062, "field 'btnConfirm'", Button.class);
        summaryRichView.changePayMethodView = (ChangePayMethodView) drawDividersHorizontal.setMin(view, R.id.f72832131365918, "field 'changePayMethodView'", ChangePayMethodView.class);
        summaryRichView.viewVoucherChooser = (ChangeVoucherView) drawDividersHorizontal.setMin(view, R.id.f73542131365989, "field 'viewVoucherChooser'", ChangeVoucherView.class);
        summaryRichView.shareToFeedsView = (ShareToFeedsView) drawDividersHorizontal.setMin(view, R.id.f60652131364653, "field 'shareToFeedsView'", ShareToFeedsView.class);
        summaryRichView.cvSummary = (CardView) drawDividersHorizontal.setMin(view, R.id.f41732131362660, "field 'cvSummary'", CardView.class);
        summaryRichView.etvChangeExpiry = (ExpireTimeView) drawDividersHorizontal.setMin(view, R.id.f43172131362835, "field 'etvChangeExpiry'", ExpireTimeView.class);
        summaryRichView.rvSetRemarks = (NoteView) drawDividersHorizontal.setMin(view, R.id.f59832131364568, "field 'rvSetRemarks'", NoteView.class);
        summaryRichView.tvAdditional = (TextView) drawDividersHorizontal.setMin(view, R.id.f64642131365089, "field 'tvAdditional'", TextView.class);
        summaryRichView.tvFreeTransfer = (TextView) drawDividersHorizontal.setMin(view, R.id.f66342131365261, "field 'tvFreeTransfer'", TextView.class);
        summaryRichView.bottomActionView = drawDividersHorizontal.getMax(view, R.id.f35052131361950, "field 'bottomActionView'");
        summaryRichView.dividerTop = drawDividersHorizontal.getMax(view, R.id.f42512131362761, "field 'dividerTop'");
        summaryRichView.dividerBottom = drawDividersHorizontal.getMax(view, R.id.f42452131362755, "field 'dividerBottom'");
    }

    @CallSuper
    public final void setMax() {
        SummaryRichView summaryRichView = this.getMin;
        if (summaryRichView != null) {
            this.getMin = null;
            summaryRichView.btnConfirm = null;
            summaryRichView.changePayMethodView = null;
            summaryRichView.viewVoucherChooser = null;
            summaryRichView.shareToFeedsView = null;
            summaryRichView.cvSummary = null;
            summaryRichView.etvChangeExpiry = null;
            summaryRichView.rvSetRemarks = null;
            summaryRichView.tvAdditional = null;
            summaryRichView.tvFreeTransfer = null;
            summaryRichView.bottomActionView = null;
            summaryRichView.dividerTop = null;
            summaryRichView.dividerBottom = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
