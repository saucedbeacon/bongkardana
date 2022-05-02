package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.RecipientHomeModule;
import id.dana.sendmoney.view.RecipientHomeView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {RecipientHomeModule.class})
public interface getRelatedArray {
    void getMax(RecipientHomeView recipientHomeView);
}
