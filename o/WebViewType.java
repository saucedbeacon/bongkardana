package o;

import javax.inject.Inject;
import o.GriverRVResourceManagerImpl;
import o.TitleBarRightButtonView;

public class WebViewType extends parseFailed<GriverRVResourceManagerImpl.AnonymousClass3, length> {
    private final GriverResourceManager promoCenterRepository;

    @Inject
    public WebViewType(appxLoadFailed appxloadfailed, getScheme getscheme, GriverResourceManager griverResourceManager) {
        super(appxloadfailed, getscheme);
        this.promoCenterRepository = griverResourceManager;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<GriverRVResourceManagerImpl.AnonymousClass3> buildUseCaseObservable(length length2) {
        return this.promoCenterRepository.getPromoList(length2.pageSize, length2.pageNumber, length2.sortBy);
    }

    public static class length {
        /* access modifiers changed from: private */
        public final int pageNumber;
        /* access modifiers changed from: private */
        public final int pageSize;
        /* access modifiers changed from: private */
        public final String sortBy;

        private length(int i, int i2, String str) {
            this.pageSize = i;
            this.pageNumber = i2;
            this.sortBy = str;
        }

        public static length forGetPromo(int i, int i2, String str) {
            return new length(i, i2, str);
        }
    }
}
