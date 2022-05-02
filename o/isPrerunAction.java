package o;

import dagger.Component;
import id.dana.contract.boundcard.BoundCardModule;
import id.dana.contract.payasset.QueryPayMethodModule;
import id.dana.contract.user.GetUserInfoModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.richview.boundcard.BoundCardView;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {BoundCardModule.class, QueryPayMethodModule.class, GetUserInfoModule.class, GlobalNetworkModule.class})
public interface isPrerunAction {
    void getMin(BoundCardView boundCardView);
}
