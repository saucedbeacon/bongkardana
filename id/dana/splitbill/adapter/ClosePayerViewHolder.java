package id.dana.splitbill.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.splitbill.model.PayerModel;
import o.AUViewEventHelper;
import o.Ignore;
import o.evaluate;
import o.getTopSortedChildren;
import o.isLineVisible;
import o.isOriginHasAppInfo;
import o.updateCornerMarking;

public class ClosePayerViewHolder extends Ignore<PayerModel> {
    @BindView(2131362223)
    CheckBox cbClosePayer;
    @BindView(2131362296)
    CircleImageView civClosePayerAvatar;
    private length getMax;
    private Context getMin;
    @BindView(2131365146)
    TextView tvClosePayerAmount;
    @BindView(2131365147)
    TextView tvClosePayerName;
    @BindView(2131365148)
    TextView tvClosePayerPhone;

    public interface length {
        void setMax();
    }

    public final /* synthetic */ void setMax(Object obj) {
        PayerModel payerModel = (PayerModel) obj;
        this.cbClosePayer.setOnCheckedChangeListener(new AUViewEventHelper.ClickListenerWrapper(this, payerModel));
        this.cbClosePayer.setChecked(payerModel.length());
        ((updateCornerMarking) Glide.getMax(this.length)).setMax(payerModel.length).setMax(evaluate.setMin).setMax((getTopSortedChildren<?>) isLineVisible.getMax()).setMax((int) R.drawable.ic_contact_placeholder).setMin((int) R.drawable.ic_contact_placeholder).length((ImageView) this.civClosePayerAvatar);
        this.tvClosePayerName.setText(getMin(payerModel) ? this.getMin.getString(R.string.payer) : payerModel.getMin);
        this.tvClosePayerAmount.setText(payerModel.setMax.setMax());
        this.tvClosePayerPhone.setText(isOriginHasAppInfo.getNormalizePrefixPhoneNumber(payerModel.setMin));
    }

    public ClosePayerViewHolder(ViewGroup viewGroup, length length2) {
        super(viewGroup.getContext(), R.layout.item_close_payer, viewGroup);
        this.getMin = viewGroup.getContext();
        this.getMax = length2;
    }

    private static boolean getMin(PayerModel payerModel) {
        return TextUtils.isEmpty(payerModel.getMin) || "splitBillPayer".equals(payerModel.getMin);
    }

    public static /* synthetic */ void getMax(ClosePayerViewHolder closePayerViewHolder, PayerModel payerModel, boolean z) {
        payerModel.equals = z;
        closePayerViewHolder.getMax.setMax();
    }
}
