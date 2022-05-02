package o;

import dagger.Component;
import id.dana.contract.deeplink.generation.GenerateDeepLinkModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.SplitBillModule;
import id.dana.splitbill.view.SplitBillActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {GenerateDeepLinkModule.class, SplitBillModule.class})
public interface startArray {
    void getMin(SplitBillActivity splitBillActivity);
}
