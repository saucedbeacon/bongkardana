package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.DanaContactModule;
import id.dana.richview.contactselector.ContactSelectorView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {DanaContactModule.class})
public interface RVAppInfoManager {
    void getMax(ContactSelectorView contactSelectorView);
}
