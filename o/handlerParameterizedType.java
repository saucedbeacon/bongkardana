package o;

import dagger.Component;
import id.dana.contract.payqr.OfflinePayModule;
import id.dana.contract.payqr.PayQrModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.home.view.ZoomDialog;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {PayQrModule.class, OfflinePayModule.class, GlobalNetworkModule.class})
public interface handlerParameterizedType {
    void setMin(ZoomDialog zoomDialog);
}
