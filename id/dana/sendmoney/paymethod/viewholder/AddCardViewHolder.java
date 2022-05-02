package id.dana.sendmoney.paymethod.viewholder;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.domain.payasset.model.Institution;
import id.dana.model.PayMethodModel;
import o.Ignore;
import o.evaluate;
import o.getTopSortedChildren;
import o.isLineVisible;
import o.updateCornerMarking;

public class AddCardViewHolder extends Ignore<PayMethodModel> {
    private Context getMin;
    @BindView(2131363519)
    ImageView ivLogo;
    @BindView(2131363577)
    ImageView ivPrefixDescription;
    @BindView(2131364325)
    RadioButton rbSelectedCard;
    private Ignore.setMin setMax;
    @BindView(2131365600)
    TextView tvTitle;

    public final /* synthetic */ void setMax(Object obj) {
        int i;
        PayMethodModel payMethodModel = (PayMethodModel) obj;
        this.rbSelectedCard.setChecked(payMethodModel.getMin());
        this.tvTitle.setText(payMethodModel.length(this.getMin));
        String format = !TextUtils.isEmpty(payMethodModel.IsOverlapping) ? String.format("https://a.m.dana.id/resource/imgs/skywalker/bankicons/%s.png", new Object[]{payMethodModel.IsOverlapping.toLowerCase()}) : null;
        int max = payMethodModel.getMax();
        ((updateCornerMarking) Glide.getMax(this.length)).setMax(format).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax(max).setMin(max).length(this.ivLogo);
        if (Institution.BCA_ONEKLIK.equals(payMethodModel.IsOverlapping)) {
            i = R.drawable.ic_oneklik;
        } else {
            i = payMethodModel.toFloatRange() ? R.drawable.ic_logo_expresspay : R.drawable.ic_visamaster;
        }
        this.ivPrefixDescription.setImageResource(i);
    }

    public AddCardViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_paymethod_add_card, viewGroup);
        this.getMin = viewGroup.getContext();
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
