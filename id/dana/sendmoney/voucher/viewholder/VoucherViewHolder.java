package id.dana.sendmoney.voucher.viewholder;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import id.dana.R;
import id.dana.richview.CurrencyTextView;
import id.dana.sendmoney.model.VoucherModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import o.Ignore;
import o.IntRange;
import o.WheelView;
import o.getShortName;
import o.startAnimation;

public class VoucherViewHolder extends Ignore<VoucherModel> {
    @BindView(2131362531)
    ConstraintLayout clVoucher;
    private final getShortName getMax;
    @BindView(2131363381)
    ImageView ivCheck;
    private boolean setMin;
    @BindView(2131365119)
    TextView tvBalance;
    @BindView(2131365193)
    TextView tvDescription;
    @BindView(2131365244)
    TextView tvExpireTime;
    @BindView(2131365563)
    TextView tvShowDetail;
    @BindView(2131365600)
    TextView tvTitle;

    public final /* synthetic */ void setMax(Object obj) {
        VoucherModel voucherModel = (VoucherModel) obj;
        this.setMin = voucherModel.length();
        this.tvShowDetail.setOnClickListener(new startAnimation(this, voucherModel));
        boolean z = this.setMin;
        this.tvTitle.setText(voucherModel.getMax);
        int i = 0;
        this.tvBalance.setText(String.format(this.length.getString(R.string.voucher_value), new Object[]{voucherModel.setMax.getMax}));
        this.tvDescription.setText(voucherModel.getMin);
        TextView textView = this.tvExpireTime;
        String string = this.length.getString(R.string.expired_voucher);
        Object[] objArr = new Object[1];
        String string2 = this.itemView.getContext().getString(R.string.complete_time);
        if (WheelView.OnWheelViewListener.getMax == null) {
            WheelView.OnWheelViewListener.getMax = new Locale(CurrencyTextView.DEFAULT_LANGUAGE_CODE, "ID");
        }
        objArr[0] = new SimpleDateFormat(string2, WheelView.OnWheelViewListener.getMax).format(new Date(voucherModel.toFloatRange));
        textView.setText(String.format(string, objArr));
        ImageView imageView = this.ivCheck;
        if (!voucherModel.setMin() || !z) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.clVoucher.setBackgroundResource((!z || !voucherModel.setMin()) ? R.drawable.bg_idle_voucher : R.drawable.bg_active_voucher);
        if (!z) {
            this.tvTitle.setTextColor(IntRange.setMax(this.length, R.color.f20402131099954));
            this.tvDescription.setTextColor(IntRange.setMax(this.length, R.color.f23792131100308));
            this.tvExpireTime.setTextColor(IntRange.setMax(this.length, R.color.f20402131099954));
            this.tvBalance.setTextColor(IntRange.setMax(this.length, R.color.f20402131099954));
        }
    }

    public VoucherViewHolder(ViewGroup viewGroup, getShortName getshortname) {
        super(viewGroup.getContext(), R.layout.view_voucher, viewGroup);
        this.getMax = getshortname;
    }

    public final void setMin(Ignore.setMin setmin) {
        if (this.setMin) {
            super.setMin(setmin);
        }
    }
}
