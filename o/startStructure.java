package o;

import dagger.Component;
import id.dana.di.PerActivity;
import id.dana.di.modules.SplitBillShareQRModule;
import id.dana.splitbill.view.SplitBillShareQrActivity;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {SplitBillShareQRModule.class})
public interface startStructure {
    void getMax(SplitBillShareQrActivity splitBillShareQrActivity);
}
