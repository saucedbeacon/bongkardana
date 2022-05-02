package id.dana.splitbill.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import de.hdodenhof.circleimageview.CircleImageView;
import id.dana.R;
import id.dana.model.CurrencyAmountModel;
import id.dana.richview.CurrencyTextView;
import id.dana.splitbill.model.PayerModel;
import o.Ignore;
import o.IntRange;
import o.doDismissWithAnimation;
import o.isOriginHasAppInfo;
import o.setOnMenuWindowDismissListener;

public class PayerListViewHolder extends Ignore<PayerModel> {
    @BindView(2131362302)
    CircleImageView civPayerAvatar;
    @BindView(2131362484)
    ConstraintLayout clPayerContainer;
    @BindView(2131362613)
    CurrencyTextView ctvFundAmount;
    private boolean getMin;
    @BindView(2131363646)
    ImageView ivStatus;
    private Context setMin;
    @BindView(2131365372)
    TextView tvName;
    @BindView(2131365442)
    TextView tvPhoneNumber;

    public final /* synthetic */ void setMax(Object obj) {
        length((PayerModel) obj, false);
    }

    public PayerListViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_split_bill_recipient, viewGroup);
        this.setMin = viewGroup.getContext();
    }

    public final void length(PayerModel payerModel, boolean z) {
        if (payerModel != null) {
            this.getMin = z;
            this.clPayerContainer.setBackgroundColor(IntRange.setMax(this.setMin, payerModel.getMax() ? R.color.f23542131100282 : R.color.f24762131100430));
            new doDismissWithAnimation().getMax(this.setMin, this.civPayerAvatar, payerModel.length, R.drawable.ic_avatar_grey_default, (setOnMenuWindowDismissListener.length) null);
            this.tvName.setText(getMax(payerModel) ? this.setMin.getString(R.string.payer) : payerModel.getMin);
            this.tvPhoneNumber.setText(isOriginHasAppInfo.getNormalizePrefixPhoneNumber(payerModel.setMin));
            CurrencyAmountModel currencyAmountModel = payerModel.setMax;
            this.ctvFundAmount.setText(TextUtils.isEmpty(currencyAmountModel.getMax) ? "0" : currencyAmountModel.getMax);
            String str = payerModel.IsOverlapping;
            if (TextUtils.isEmpty(str) || !this.getMin) {
                this.ivStatus.setVisibility(8);
            } else {
                setMin(str);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setMin(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = r6.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            switch(r0) {
                case -1149187101: goto L_0x002a;
                case -604548089: goto L_0x0020;
                case -591252731: goto L_0x0016;
                case 1818119806: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "REVOKED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = 1
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "EXPIRED"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "IN_PROGRESS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = 3
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "SUCCESS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0034
            r6 = 0
            goto L_0x0035
        L_0x0034:
            r6 = -1
        L_0x0035:
            if (r6 == 0) goto L_0x009c
            if (r6 == r3) goto L_0x007a
            if (r6 == r2) goto L_0x0066
            if (r6 == r1) goto L_0x0044
            android.widget.ImageView r6 = r5.ivStatus
            r0 = 4
            r6.setVisibility(r0)
            return
        L_0x0044:
            android.widget.ImageView r6 = r5.ivStatus
            android.content.Context r0 = r5.length
            r1 = 2131232639(0x7f08077f, float:1.8081393E38)
            android.graphics.drawable.Drawable r0 = o.IntRange.length((android.content.Context) r0, (int) r1)
            r6.setImageDrawable(r0)
            android.widget.ImageView r6 = r5.ivStatus
            r6.setVisibility(r4)
            android.content.Context r6 = r5.length
            r0 = 2131887583(0x7f1205df, float:1.9409777E38)
            java.lang.String r6 = r6.getString(r0)
            android.widget.ImageView r0 = r5.ivStatus
            r0.setContentDescription(r6)
            return
        L_0x0066:
            android.widget.ImageView r6 = r5.ivStatus
            android.content.Context r0 = r5.length
            r1 = 2131231430(0x7f0802c6, float:1.807894E38)
            android.graphics.drawable.Drawable r0 = o.IntRange.length((android.content.Context) r0, (int) r1)
            r6.setImageDrawable(r0)
            android.widget.ImageView r6 = r5.ivStatus
            r6.setVisibility(r4)
            return
        L_0x007a:
            android.widget.ImageView r6 = r5.ivStatus
            android.content.Context r0 = r5.length
            r1 = 2131232662(0x7f080796, float:1.808144E38)
            android.graphics.drawable.Drawable r0 = o.IntRange.length((android.content.Context) r0, (int) r1)
            r6.setImageDrawable(r0)
            android.widget.ImageView r6 = r5.ivStatus
            r6.setVisibility(r4)
            android.content.Context r6 = r5.length
            r0 = 2131887584(0x7f1205e0, float:1.940978E38)
            java.lang.String r6 = r6.getString(r0)
            android.widget.ImageView r0 = r5.ivStatus
            r0.setContentDescription(r6)
            return
        L_0x009c:
            android.widget.ImageView r6 = r5.ivStatus
            android.content.Context r0 = r5.length
            r1 = 2131232746(0x7f0807ea, float:1.808161E38)
            android.graphics.drawable.Drawable r0 = o.IntRange.length((android.content.Context) r0, (int) r1)
            r6.setImageDrawable(r0)
            android.widget.ImageView r6 = r5.ivStatus
            r6.setVisibility(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: id.dana.splitbill.adapter.PayerListViewHolder.setMin(java.lang.String):void");
    }

    private static boolean getMax(PayerModel payerModel) {
        return TextUtils.isEmpty(payerModel.getMin) || "splitBillPayer".equals(payerModel.getMin);
    }
}
