package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.SavingModule;
import id.dana.richview.boundcard.DanaBalanceCardView;
import id.dana.richview.boundcard.DebitCardView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {GlobalNetworkModule.class, SavingModule.class})
public interface flush {
    void getMax(DanaBalanceCardView danaBalanceCardView);

    void length(DebitCardView debitCardView);
}
