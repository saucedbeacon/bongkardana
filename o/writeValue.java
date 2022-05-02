package o;

import dagger.Component;
import id.dana.contract.user.GetBalanceModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.richview.ToggleBalanceView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {GetBalanceModule.class, GlobalNetworkModule.class})
public interface writeValue {
    void setMax(ToggleBalanceView toggleBalanceView);
}
