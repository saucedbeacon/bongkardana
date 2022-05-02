package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.RecipientActivityModule;
import id.dana.di.modules.ReferralTrackerModule;
import id.dana.sendmoney.contact.all.ContactActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecipientActivityModule.class, ReferralTrackerModule.class})
public interface getLastUpdateTime {
    void setMin(ContactActivity contactActivity);
}
