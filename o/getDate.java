package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.SendMoneyConfirmationModule;
import id.dana.sendmoney.confirmation.SendMoneyConfirmationActivity;
import id.dana.social.contract.share.ShareToFeedsModule;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SendMoneyConfirmationModule.class, ShareToFeedsModule.class})
public interface getDate {
    void setMax(SendMoneyConfirmationActivity sendMoneyConfirmationActivity);
}
