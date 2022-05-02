package id.dana.sendmoney.paymethod.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.model.PayMethodModel;
import o.Ignore;

public class SectionViewHolder extends Ignore<PayMethodModel> {
    @BindView(2131365600)
    TextView tvTitle;

    public final void setMin(Ignore.setMin setmin) {
    }

    public final /* synthetic */ void setMax(Object obj) {
        this.tvTitle.setText(((PayMethodModel) obj).Grayscale$Algorithm);
    }

    public SectionViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_paymethod_section, viewGroup);
    }
}
