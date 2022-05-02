package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.SavedBankModule;
import id.dana.sendmoney.bank.savedcard.SavedBankCardView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SavedBankModule.class})
public interface getShortValue {
    void getMax(SavedBankCardView savedBankCardView);
}
