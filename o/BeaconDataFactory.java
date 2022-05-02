package o;

import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class BeaconDataFactory extends parseFailed<Boolean, setMax> {
    private final toUuidString servicesRepository;

    @Inject
    public BeaconDataFactory(appxLoadFailed appxloadfailed, getScheme getscheme, toUuidString touuidstring) {
        super(appxloadfailed, getscheme);
        this.servicesRepository = touuidstring;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMax setmax) {
        return this.servicesRepository.saveFavoriteServices(setmax.services);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public List<String> services;

        private setMax(List<String> list) {
            this.services = list;
        }

        public static setMax forFavoriteServices(List<String> list) {
            return new setMax(list);
        }
    }
}
