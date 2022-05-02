package id.dana.myprofile.viewholder;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.domain.profilemenu.model.SettingModel;
import id.dana.richview.profile.paymentauth.PaymentAuthenticationView;
import o.Ignore;

public class ProfileMenuPaymentAuthViewHolder extends Ignore<SettingModel> {
    @BindView(2131365837)
    PaymentAuthenticationView paymentAuthenticationView;

    public final /* synthetic */ void setMax(Object obj) {
        SettingModel settingModel = (SettingModel) obj;
        if (settingModel != null) {
            this.paymentAuthenticationView.setTitle(settingModel.getTitle());
        }
    }

    public ProfileMenuPaymentAuthViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_authentication_payment, viewGroup);
    }
}
