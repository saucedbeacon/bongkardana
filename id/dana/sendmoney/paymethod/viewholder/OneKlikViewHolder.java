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
import id.dana.model.PayMethodModel;
import o.Ignore;
import o.IntRange;
import o.evaluate;
import o.getTopSortedChildren;
import o.isLineVisible;
import o.updateCornerMarking;

public class OneKlikViewHolder extends Ignore<PayMethodModel> {
    private Context getMax;
    private boolean getMin;
    @BindView(2131363449)
    ImageView ivFilter;
    @BindView(2131363519)
    ImageView ivLogo;
    @BindView(2131363577)
    ImageView ivPrefixDescription;
    @BindView(2131364325)
    RadioButton rbSelectedCard;
    private Ignore.setMin setMin;
    @BindView(2131365193)
    TextView tvDescription;
    @BindView(2131365215)
    TextView tvDivider;
    @BindView(2131365600)
    TextView tvTitle;
    @BindView(2131365670)
    TextView tvWarning;

    public final /* synthetic */ void setMax(Object obj) {
        PayMethodModel payMethodModel = (PayMethodModel) obj;
        this.rbSelectedCard.setChecked(payMethodModel.getMin());
        String format = !TextUtils.isEmpty(payMethodModel.IsOverlapping) ? String.format("https://a.m.dana.id/resource/imgs/skywalker/bankicons/%s.png", new Object[]{payMethodModel.IsOverlapping.toLowerCase()}) : null;
        int max = payMethodModel.getMax();
        ((updateCornerMarking) Glide.getMax(this.getMax)).setMax(format).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax(max).setMin(max).length(this.ivLogo);
        this.tvTitle.setText(payMethodModel.length(this.getMax));
        this.tvDescription.setText(payMethodModel.getMin(this.getMax));
        this.getMin = payMethodModel.setMax();
        boolean max2 = payMethodModel.setMax();
        int i = 8;
        this.ivPrefixDescription.setVisibility(max2 ? 0 : 8);
        TextView textView = this.tvDivider;
        if (max2) {
            i = 0;
        }
        textView.setVisibility(i);
        this.rbSelectedCard.setEnabled(max2);
        if (!max2) {
            this.tvDescription.setText(this.length.getString(R.string.cant_use_pay_method));
            this.tvDescription.setTextColor(IntRange.setMax(this.length, R.color.f23792131100308));
            this.tvTitle.setTextColor(IntRange.setMax(this.length, R.color.f20402131099954));
            this.ivFilter.setVisibility(0);
        }
    }

    public OneKlikViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_paymethod_one_klik, viewGroup);
        this.getMax = viewGroup.getContext();
    }

    public final void setMin(Ignore.setMin setmin) {
        if (this.getMin) {
            this.setMin = setmin;
            super.setMin(setmin);
        }
    }

    @OnClick({2131364325})
    public void radioButtonClick() {
        Ignore.setMin setmin = this.setMin;
        if (setmin != null) {
            setmin.length(getAdapterPosition());
        }
    }
}
