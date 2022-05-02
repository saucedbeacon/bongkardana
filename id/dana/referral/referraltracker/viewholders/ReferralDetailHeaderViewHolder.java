package id.dana.referral.referraltracker.viewholders;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.OnClick;
import id.dana.R;
import java.util.List;
import o.Ignore;
import o.StartupParamsBridgeExtension;
import o.handlePerformanceLog;
import o.setCloseButton;

public class ReferralDetailHeaderViewHolder extends Ignore<StartupParamsBridgeExtension> {
    @BindViews({2131362120, 2131362121})
    List<Button> btnReferralTracker;
    private boolean getMax;
    private Context getMin;
    @BindView(2131365502)
    TextView tvReferralTitle;
    @BindView(2131365545)
    TextView tvSeeHowItWorksHeader;

    public static /* synthetic */ void setMax() {
    }

    @OnClick({2131365545})
    public void doOpenHowItWorks() {
    }

    public final /* synthetic */ void setMax(Object obj) {
        String str;
        TextView textView;
        StartupParamsBridgeExtension startupParamsBridgeExtension = (StartupParamsBridgeExtension) obj;
        if (startupParamsBridgeExtension != null) {
            if (this.getMax) {
                this.tvSeeHowItWorksHeader.setVisibility(0);
                if (startupParamsBridgeExtension.equals != null && !startupParamsBridgeExtension.equals.isEmpty()) {
                    List<handlePerformanceLog> list = startupParamsBridgeExtension.equals;
                    for (int i = 0; i < list.size(); i++) {
                        handlePerformanceLog handleperformancelog = list.get(i);
                        if (handleperformancelog != null && i < this.btnReferralTracker.size()) {
                            Button button = this.btnReferralTracker.get(i);
                            button.setVisibility(handleperformancelog.setMin() ? 0 : 8);
                            if (!TextUtils.isEmpty(handleperformancelog.setMax)) {
                                button.setText(handleperformancelog.setMax);
                            }
                            if (!TextUtils.isEmpty(handleperformancelog.length)) {
                                button.setOnClickListener(new setCloseButton(this, handleperformancelog));
                            }
                        }
                    }
                }
            }
            if (!TextUtils.isEmpty(startupParamsBridgeExtension.toIntRange)) {
                textView = this.tvReferralTitle;
                str = startupParamsBridgeExtension.toIntRange;
            } else if (startupParamsBridgeExtension.getMax()) {
                textView = this.tvReferralTitle;
                if (this.getMax) {
                    str = this.getMin.getString(R.string.msg_referrer_hidden_description);
                } else {
                    str = this.getMin.getString(R.string.msg_referrer_description);
                }
            } else {
                return;
            }
            textView.setText(str);
        }
    }
}
