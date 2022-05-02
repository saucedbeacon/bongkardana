package o;

import java.util.List;
import javax.inject.Inject;
import o.NullBeaconDataFactory;
import o.TitleBarRightButtonView;

public class Region$1 extends parseFailed<List<NullBeaconDataFactory.AnonymousClass1>, setMax> {
    private final toUuidString servicesRepository;

    @Inject
    public Region$1(appxLoadFailed appxloadfailed, getScheme getscheme, toUuidString touuidstring) {
        super(appxloadfailed, getscheme);
        this.servicesRepository = touuidstring;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<NullBeaconDataFactory.AnonymousClass1>> buildUseCaseObservable(setMax setmax) {
        return this.servicesRepository.getServicesByName(setmax.names);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public List<String> names;

        private setMax(List<String> list) {
            this.names = list;
        }

        public static setMax forGetServicesByName(List<String> list) {
            return new setMax(list);
        }
    }
}
