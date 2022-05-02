package id.dana.sendmoney.recipient;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.model.RecipientViewModel;
import o.Ignore;

public class SectionViewHolder extends Ignore<RecipientViewModel> {
    @BindView(2131365289)
    TextView tvHeaderSection;
    @BindView(2131365860)
    View vDivider;

    @SuppressLint({"WrongConstant"})
    public final /* synthetic */ void setMax(Object obj) {
        RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
        int i = recipientViewModel.values;
        if (i == 1) {
            if (TextUtils.isEmpty(recipientViewModel.isInside)) {
                this.tvHeaderSection.setText(this.length.getString(R.string.all_contact));
                this.tvHeaderSection.setVisibility(0);
            } else {
                this.tvHeaderSection.setText(this.length.getString(R.string.contacts));
                this.tvHeaderSection.setVisibility(0);
            }
            this.vDivider.setVisibility(8);
        } else if (i == 7) {
            this.tvHeaderSection.setText(this.length.getString(R.string.search_result));
            this.tvHeaderSection.setVisibility(0);
        } else if (i == 23) {
            this.tvHeaderSection.setText(this.length.getString(R.string.recent_transfer));
            this.tvHeaderSection.setVisibility(0);
            TextViewCompat.setMax(this.tvHeaderSection, (int) R.style.f82312131952327);
        } else if (i == 20) {
            this.tvHeaderSection.setText(this.length.getString(R.string.bank_accounts));
            this.tvHeaderSection.setVisibility(0);
            TextViewCompat.setMax(this.tvHeaderSection, (int) R.style.f82312131952327);
        } else if (i != 21) {
            this.vDivider.setVisibility(8);
            this.tvHeaderSection.setVisibility(8);
        } else {
            this.tvHeaderSection.setText(this.length.getString(R.string.contacts));
            this.tvHeaderSection.setVisibility(0);
            TextViewCompat.setMax(this.tvHeaderSection, (int) R.style.f82312131952327);
        }
    }

    public SectionViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_recipient_state_section, viewGroup);
    }
}
