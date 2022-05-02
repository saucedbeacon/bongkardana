package id.dana.sendmoney.bank.all;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.model.RecipientSource;
import id.dana.sendmoney.model.RecipientViewModel;
import id.dana.sendmoney.recipient.RecipientIdType;
import o.Ignore;
import o.PhotoItem;
import o.evaluate;
import o.getTopSortedChildren;
import o.isHttps;
import o.isLineVisible;
import o.updateCornerMarking;

public class BankViewHolder extends Ignore<RecipientViewModel> {
    private RecipientViewModel getMin;
    @BindView(2131363378)
    public AppCompatImageView ivChangeIcon;
    @BindView(2131363519)
    ImageView ivLogo;
    private final PhotoItem setMax;
    @BindView(2131365450)
    TextView tvPrefixDescription;
    @BindView(2131365600)
    TextView tvTitle;
    @BindView(2131365193)
    TextView tvViewDescription;
    @BindView(2131365861)
    public View vDividerFull;
    @BindView(2131365864)
    public View vDividerWithMargin;

    public final /* synthetic */ void setMax(Object obj) {
        String str;
        RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
        this.getMin = recipientViewModel;
        this.tvTitle.setText((TextUtils.isEmpty(recipientViewModel.setMin) ? recipientViewModel.setMax() : recipientViewModel.setMin).replace("*", "•"));
        String str2 = recipientViewModel.isInside;
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.replace(" ", "");
        }
        Object[] objArr = new Object[1];
        if (str2.length() >= 4) {
            str2 = str2.substring(str2.length() - 4);
        }
        objArr[0] = str2;
        this.tvViewDescription.setText(String.format("•••• %s", objArr));
        ((updateCornerMarking) Glide.getMax(this.length)).setMax(recipientViewModel.getMax()).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax((int) R.drawable.ic_bank_placeholder).setMin((int) R.drawable.ic_bank_placeholder).length(this.ivLogo);
        if (TextUtils.isEmpty(recipientViewModel.length)) {
            str = this.length.getString(R.string.debit);
        } else {
            str = recipientViewModel.length;
        }
        this.tvPrefixDescription.setText(str);
    }

    public BankViewHolder(ViewGroup viewGroup, PhotoItem photoItem) {
        super(viewGroup.getContext(), R.layout.item_saved_bank_cards, viewGroup);
        this.setMax = photoItem;
    }

    public final void setMin(Ignore.setMin setmin) {
        this.itemView.setOnClickListener(new isHttps(this));
    }

    public static /* synthetic */ void setMin(BankViewHolder bankViewHolder) {
        RecipientModel.length length = new RecipientModel.length("bank");
        length.toFloatRange = bankViewHolder.getMin.getMin();
        length.FastBitmap$CoordinateSystem = RecipientIdType.INSTITUTION;
        length.isInside = bankViewHolder.getMin.setMax();
        length.Mean$Arithmetic = bankViewHolder.getMin.equals;
        length.toIntRange = bankViewHolder.getMin.isInside;
        length.IsOverlapping = bankViewHolder.getMin.getMax();
        length.equals = bankViewHolder.getMin.length;
        length.values = bankViewHolder.getMin.toIntRange;
        length.toDoubleRange = bankViewHolder.getMin.toFloatRange;
        length.getMin = bankViewHolder.getMin.setMin;
        length.setMax = RecipientSource.ALL_CONTACTS;
        length.invoke = bankViewHolder.getMin.setMin();
        length.getCause = bankViewHolder.getMin.toIntRange();
        length.b = bankViewHolder.getMin.FastBitmap$CoordinateSystem;
        length.onNavigationEvent = bankViewHolder.getMin.toFloatRange();
        bankViewHolder.setMax.onRecipientSelected(length.length());
    }
}
