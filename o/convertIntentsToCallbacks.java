package o;

import java.util.Objects;
import javax.inject.Inject;
import o.NullBeaconDataFactory;
import o.TitleBarRightButtonView;

public class convertIntentsToCallbacks extends parseFailed<NullBeaconDataFactory.AnonymousClass1, Void> {
    private final onWebViewDestory globalNetworkRepository;
    private final toUuidString servicesRepository;

    @Inject
    public convertIntentsToCallbacks(appxLoadFailed appxloadfailed, getScheme getscheme, toUuidString touuidstring, onWebViewDestory onwebviewdestory) {
        super(appxloadfailed, getscheme);
        this.servicesRepository = touuidstring;
        this.globalNetworkRepository = onwebviewdestory;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<NullBeaconDataFactory.AnonymousClass1> buildUseCaseObservable(Void voidR) {
        TitleBarRightButtonView.AnonymousClass1<Boolean> isGlobalNetworkMode = this.globalNetworkRepository.isGlobalNetworkMode();
        toUuidString touuidstring = this.servicesRepository;
        Objects.requireNonNull(touuidstring);
        return isGlobalNetworkMode.flatMap(new MonitorNotifier(touuidstring));
    }
}
