package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.sendmoney.recipient.recent.RecentRecipientModule;
import id.dana.sendmoney.recipient.recent.RecentRecipientView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecentRecipientModule.class})
public interface toJavaObject {
    void length(RecentRecipientView recentRecipientView);
}
