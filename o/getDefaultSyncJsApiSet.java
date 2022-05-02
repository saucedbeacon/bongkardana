package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class getDefaultSyncJsApiSet extends parseFailed<installPackage, setMin> {
    private final GriverResourceManager promoCenterRepository;

    @Inject
    getDefaultSyncJsApiSet(appxLoadFailed appxloadfailed, getScheme getscheme, GriverResourceManager griverResourceManager) {
        super(appxloadfailed, getscheme);
        this.promoCenterRepository = griverResourceManager;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<installPackage> buildUseCaseObservable(setMin setmin) {
        return this.promoCenterRepository.getCategories(setmin.pageSize, setmin.pageNumber, setmin.loadMore);
    }

    public static class setMin {
        /* access modifiers changed from: private */
        public final boolean loadMore;
        /* access modifiers changed from: private */
        public final int pageNumber;
        /* access modifiers changed from: private */
        public final int pageSize;

        private setMin(int i, int i2, boolean z) {
            this.pageSize = i;
            this.pageNumber = i2;
            this.loadMore = z;
        }

        public static setMin forGetCategory(int i, int i2, boolean z) {
            return new setMin(i, i2, z);
        }
    }
}
