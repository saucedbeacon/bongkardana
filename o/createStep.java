package o;

import dagger.Component;
import id.dana.contract.payqr.AddNewCardModule;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.di.PerActivity;
import id.dana.pay.screen.AddNewCardFragment;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {AddNewCardModule.class, OfflinePayModule.class})
public interface createStep {
    void length(AddNewCardFragment addNewCardFragment);
}
