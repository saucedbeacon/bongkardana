package id.dana.sendmoney.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.RibbonView;
import o.drawDividersHorizontal;

public class SendMoneyHomeMenuViewHolder_ViewBinding implements Unbinder {
    private SendMoneyHomeMenuViewHolder getMax;

    @UiThread
    public SendMoneyHomeMenuViewHolder_ViewBinding(SendMoneyHomeMenuViewHolder sendMoneyHomeMenuViewHolder, View view) {
        this.getMax = sendMoneyHomeMenuViewHolder;
        sendMoneyHomeMenuViewHolder.clSendMoneyHomeMenu = (ConstraintLayout) drawDividersHorizontal.setMin(view, R.id.f40362131362516, "field 'clSendMoneyHomeMenu'", ConstraintLayout.class);
        sendMoneyHomeMenuViewHolder.ribbonView = (RibbonView) drawDividersHorizontal.setMin(view, R.id.f57972131364379, "field 'ribbonView'", RibbonView.class);
        sendMoneyHomeMenuViewHolder.ivSendMoney = (ImageView) drawDividersHorizontal.setMin(view, R.id.f50792131363634, "field 'ivSendMoney'", ImageView.class);
        sendMoneyHomeMenuViewHolder.tvSendToTitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69282131365555, "field 'tvSendToTitle'", TextView.class);
        sendMoneyHomeMenuViewHolder.tvSendToSubtitle = (TextView) drawDividersHorizontal.setMin(view, R.id.f69272131365554, "field 'tvSendToSubtitle'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        SendMoneyHomeMenuViewHolder sendMoneyHomeMenuViewHolder = this.getMax;
        if (sendMoneyHomeMenuViewHolder != null) {
            this.getMax = null;
            sendMoneyHomeMenuViewHolder.clSendMoneyHomeMenu = null;
            sendMoneyHomeMenuViewHolder.ribbonView = null;
            sendMoneyHomeMenuViewHolder.ivSendMoney = null;
            sendMoneyHomeMenuViewHolder.tvSendToTitle = null;
            sendMoneyHomeMenuViewHolder.tvSendToSubtitle = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
