package o;

import java.util.List;
import javax.inject.Inject;
import o.GriverAmcsLiteConfig;
import o.TitleBarRightButtonView;

public class getGriverSectionConfig extends parseFailed<GriverAmcsLiteConfig.AnonymousClass2, setMax> {
    private GriverBaseConstants homeInfoRepository;

    @Inject
    public getGriverSectionConfig(appxLoadFailed appxloadfailed, getScheme getscheme, GriverBaseConstants griverBaseConstants) {
        super(appxloadfailed, getscheme);
        this.homeInfoRepository = griverBaseConstants;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverAmcsLiteConfig.AnonymousClass2> buildUseCaseObservable(setMax setmax) {
        if (setmax != null) {
            return this.homeInfoRepository.getHomeInfo(setmax.filter);
        }
        return this.homeInfoRepository.getHomeInfo((List<String>) null);
    }

    public static class setMax {
        /* access modifiers changed from: private */
        public List<String> filter;

        private setMax(List<String> list) {
            this.filter = list;
        }

        public static setMax forGetHomeInfo(List<String> list) {
            return new setMax(list);
        }
    }
}
