package id.dana.sendmoney.paymethod.viewholder;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.model.PayMethodModel;
import o.Ignore;

public class BalanceViewHolder extends Ignore<PayMethodModel> {
    @BindView(2131363519)
    ImageView ivLogo;
    @BindView(2131364325)
    RadioButton rbSelectedCard;
    private Ignore.setMin setMax;
    @BindView(2131365193)
    TextView tvDescription;
    @BindView(2131365600)
    TextView tvTitle;

    public final /* synthetic */ void setMax(Object obj) {
        PayMethodModel payMethodModel = (PayMethodModel) obj;
        this.rbSelectedCard.setChecked(payMethodModel.getMin());
        this.ivLogo.setImageResource(payMethodModel.getMax());
        this.tvTitle.setText(payMethodModel.length(this.length));
        this.tvDescription.setText(payMethodModel.getMin(this.length));
    }

    public BalanceViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_paymethod_balance, viewGroup);
    }

    @OnClick({2131364325})
    public void radioButtonClick() {
        this.setMax.length(getAdapterPosition());
    }

    public final void setMin(Ignore.setMin setmin) {
        super.setMin(setmin);
        this.setMax = setmin;
    }
}
