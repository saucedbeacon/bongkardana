package o;

import java.util.List;
import javax.inject.Inject;
import o.NullBeaconDataFactory;
import o.TitleBarRightButtonView;

public class getUniqueId extends parseFailed<List<NullBeaconDataFactory.AnonymousClass1>, setMax> {
    private final toUuidString servicesRepository;

    @Inject
    public getUniqueId(appxLoadFailed appxloadfailed, getScheme getscheme, toUuidString touuidstring) {
        super(appxloadfailed, getscheme);
        this.servicesRepository = touuidstring;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> buildUseCaseObservable(setMax setmax) {
        return this.servicesRepository.getServicesByKey(setmax.keys);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public List<String> keys;

        private setMax(List<String> list) {
            this.keys = list;
        }

        public static setMax forGetServicesByKey(List<String> list) {
            return new setMax(list);
        }
    }
}
