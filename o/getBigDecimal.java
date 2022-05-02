package o;

import dagger.Component;
import id.dana.contract.deeplink.DeepLinkModule;
import id.dana.contract.staticqr.DecodeQrImageModule;
import id.dana.contract.staticqr.ScanQrModule;
import id.dana.di.PerActivity;
import id.dana.di.modules.BottomSheetOnBoardingModule;
import id.dana.di.modules.CheckoutH5EventModule;
import id.dana.di.modules.GlobalNetworkModule;
import id.dana.di.modules.PlayStoreReviewModules;
import id.dana.scanner.ScannerFragment;
import o.PrepareException;

@PerActivity
@Component(dependencies = {PrepareException.AnonymousClass1.class}, modules = {ScanQrModule.class, DecodeQrImageModule.class, DeepLinkModule.class, PlayStoreReviewModules.class, CheckoutH5EventModule.class, BottomSheetOnBoardingModule.class, GlobalNetworkModule.class})
public interface getBigDecimal {
    void getMax(ScannerFragment scannerFragment);
}
