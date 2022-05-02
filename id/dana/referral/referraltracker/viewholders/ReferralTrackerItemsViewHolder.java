package id.dana.referral.referraltracker.viewholders;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import butterknife.BindView;
import id.dana.R;
import o.Ignore;
import o.IntRange;
import o.StartupParamsBridgeExtension;

public class ReferralTrackerItemsViewHolder extends Ignore<StartupParamsBridgeExtension> {
    private Context getMax;
    private String getMin;
    @BindView(2131363607)
    ImageView ivReferralTrackerActive;
    @BindView(2131363609)
    ImageView ivReferralTrackerRegister;
    @BindView(2131363610)
    ImageView ivReferralTrackerReward;
    @BindView(2131365503)
    TextView tvReferralTrackerActive;
    @BindView(2131365505)
    TextView tvReferralTrackerNickname;
    @BindView(2131365506)
    TextView tvReferralTrackerPhoneNumber;
    @BindView(2131365507)
    TextView tvReferralTrackerRegister;
    @BindView(2131365508)
    TextView tvReferralTrackerReward;

    public final /* synthetic */ void setMax(Object obj) {
        StartupParamsBridgeExtension startupParamsBridgeExtension = (StartupParamsBridgeExtension) obj;
        this.getMin = "";
        if (startupParamsBridgeExtension != null) {
            if (TextUtils.isEmpty(startupParamsBridgeExtension.getMin)) {
                this.tvReferralTrackerNickname.setText(startupParamsBridgeExtension.getMax);
                this.tvReferralTrackerPhoneNumber.setText("");
            } else {
                this.tvReferralTrackerNickname.setText(startupParamsBridgeExtension.getMin);
                this.tvReferralTrackerPhoneNumber.setText(String.format("(%s)", new Object[]{startupParamsBridgeExtension.getMax}));
            }
            if (startupParamsBridgeExtension.setMin != null) {
                TextView textView = this.tvReferralTrackerRegister;
                String str = startupParamsBridgeExtension.setMin.setMax;
                String string = this.getMax.getString(R.string.referral_tracker_register);
                if (!TextUtils.isEmpty(str)) {
                    textView.setText(str);
                } else {
                    textView.setText(string);
                }
                setMin(this.tvReferralTrackerRegister, this.ivReferralTrackerRegister, startupParamsBridgeExtension.setMin.getMax(), R.drawable.ic_referral_tracker_success, R.drawable.ic_referral_tracker_success_grey);
                String str2 = startupParamsBridgeExtension.setMin.setMin;
                if (!TextUtils.isEmpty(str2)) {
                    this.getMin = str2;
                }
            }
            if (startupParamsBridgeExtension.setMax != null) {
                TextView textView2 = this.tvReferralTrackerActive;
                String str3 = startupParamsBridgeExtension.setMax.setMax;
                String string2 = this.getMax.getString(R.string.referral_tracker_active);
                if (!TextUtils.isEmpty(str3)) {
                    textView2.setText(str3);
                } else {
                    textView2.setText(string2);
                }
                setMin(this.tvReferralTrackerActive, this.ivReferralTrackerActive, startupParamsBridgeExtension.setMax.getMax(), R.drawable.ic_referral_tracker_success, R.drawable.ic_referral_tracker_success_grey);
                String str4 = startupParamsBridgeExtension.setMax.setMin;
                if (!TextUtils.isEmpty(str4)) {
                    this.getMin = str4;
                }
            }
            if (startupParamsBridgeExtension.length != null) {
                TextView textView3 = this.tvReferralTrackerReward;
                String str5 = startupParamsBridgeExtension.length.setMax;
                String string3 = this.getMax.getString(R.string.referral_tracker_reward);
                if (!TextUtils.isEmpty(str5)) {
                    textView3.setText(str5);
                } else {
                    textView3.setText(string3);
                }
                setMin(this.tvReferralTrackerReward, this.ivReferralTrackerReward, startupParamsBridgeExtension.length.getMax(), R.drawable.ic_referral_tracker_reward, R.drawable.ic_referral_tracker_reward_grey);
                String str6 = startupParamsBridgeExtension.length.setMin;
                if (!TextUtils.isEmpty(str6)) {
                    this.getMin = str6;
                }
            }
            if (!TextUtils.isEmpty(this.getMin)) {
                this.tvReferralTrackerReward.setText(this.getMin);
                this.tvReferralTrackerReward.setTextColor(IntRange.setMax(this.getMax, R.color.f18772131099764));
                this.ivReferralTrackerReward.setImageResource(R.drawable.ic_referral_tracker_no_reward);
                this.getMin = null;
            }
        }
    }

    private void setMin(TextView textView, ImageView imageView, boolean z, @DrawableRes int i, @DrawableRes int i2) {
        if (z) {
            textView.setTextColor(IntRange.setMax(this.getMax, R.color.f18772131099764));
            imageView.setImageResource(i);
            return;
        }
        textView.setTextColor(IntRange.setMax(this.getMax, R.color.f20402131099954));
        imageView.setImageResource(i2);
    }
}
