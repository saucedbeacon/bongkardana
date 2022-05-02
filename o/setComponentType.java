package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.AddReceiverInfoModule;
import id.dana.di.modules.DanaContactModule;
import id.dana.di.modules.SavedBankModule;
import id.dana.sendmoney.view.RecipientView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {DanaContactModule.class, SavedBankModule.class, AddReceiverInfoModule.class})
public interface setComponentType {
    void setMax(RecipientView recipientView);
}
