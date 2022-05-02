package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.RecentContactModule;
import id.dana.sendmoney.contact.recent.RecentContactView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecentContactModule.class})
public interface toJSON {
    void getMin(RecentContactView recentContactView);
}
