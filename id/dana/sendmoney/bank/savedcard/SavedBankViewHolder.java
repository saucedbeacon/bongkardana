package id.dana.sendmoney.bank.savedcard;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.sendmoney.model.RecentBankModel;
import o.Ignore;
import o.evaluate;
import o.getTopSortedChildren;
import o.isLineVisible;
import o.updateCornerMarking;

public class SavedBankViewHolder extends Ignore<RecentBankModel> {
    @BindView(2131363519)
    ImageView ivLogo;
    @BindView(2131365450)
    TextView tvPrefixDescription;
    @BindView(2131365600)
    TextView tvTitle;
    @BindView(2131365193)
    TextView tvViewDescription;

    public final /* synthetic */ void setMax(Object obj) {
        String str;
        String str2;
        RecentBankModel recentBankModel = (RecentBankModel) obj;
        if (TextUtils.isEmpty(recentBankModel.Grayscale$Algorithm)) {
            str = recentBankModel.equals;
        } else {
            str = recentBankModel.Grayscale$Algorithm;
        }
        this.tvTitle.setText(str);
        String str3 = recentBankModel.getMax;
        Object[] objArr = new Object[1];
        if (str3.length() >= 4) {
            str3 = str3.substring(str3.length() - 4);
        }
        objArr[0] = str3;
        this.tvViewDescription.setText(String.format("•••• %s", objArr));
        ((updateCornerMarking) Glide.getMax(this.length)).setMax(recentBankModel.Mean$Arithmetic).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax((int) R.drawable.ic_bank_placeholder).setMin((int) R.drawable.ic_bank_placeholder).length(this.ivLogo);
        if (TextUtils.isEmpty(recentBankModel.setMin)) {
            str2 = this.length.getString(R.string.debit);
        } else {
            str2 = recentBankModel.setMin;
        }
        this.tvPrefixDescription.setText(str2);
    }

    public SavedBankViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_saved_bank_cards, viewGroup);
    }
}
