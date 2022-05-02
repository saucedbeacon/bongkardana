package id.dana.referral.referraltracker.viewholders;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import id.dana.R;
import id.dana.referral.model.MyReferralConsult;
import o.Ignore;
import o.StartupParamsBridgeExtension;
import o.setH5OptionMenuTextFlag;

public class ReferralDetailBodyViewHolder extends Ignore<StartupParamsBridgeExtension> {
    private MyReferralConsult setMax;
    private Context setMin;
    @BindView(2131365498)
    TextView tvReferralCode;
    @BindView(2131365500)
    TextView tvReferralShareCode;

    @OnClick({2131362064})
    public void doCopyReferral() {
    }

    @OnClick({2131363604})
    public void doCopyReferralBox() {
    }

    @OnClick({2131365301})
    public void doOpenHowItWorks() {
    }

    @OnClick({2131362134})
    public void doShareReferralCode(View view) {
    }

    public final /* synthetic */ void setMax(Object obj) {
        String str;
        this.tvReferralCode.setText(this.setMax.length);
        TextView textView = this.tvReferralShareCode;
        setH5OptionMenuTextFlag min = setH5OptionMenuTextFlag.setMin(this.setMin.getString(R.string.msg_referred_description));
        String str2 = "";
        if (TextUtils.isEmpty(this.setMax.setMin.getMax)) {
            str = str2;
        } else if (this.setMax.setMin.getMin == null || this.setMax.setMin.getMin.setMax() == null) {
            str = this.setMax.setMin.getMax;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setMax.setMin.getMax);
            sb.append(" ");
            sb.append(this.setMax.setMin.getMin.setMax());
            str = sb.toString();
        }
        setH5OptionMenuTextFlag min2 = min.getMin("referrer", str);
        if (!TextUtils.isEmpty(this.setMax.setMin.getMax)) {
            if (this.setMax.setMax.getMin == null || this.setMax.setMax.getMin.setMax() == null) {
                str2 = this.setMax.setMax.getMax;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.setMax.setMax.getMax);
                sb2.append(" ");
                sb2.append(this.setMax.setMax.getMin.setMax());
                str2 = sb2.toString();
            }
        }
        textView.setText(min2.getMin("referred", str2).getMax());
    }
}
