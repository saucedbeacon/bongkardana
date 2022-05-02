package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;
import o.b;

public final class GriverOpenAuthExtension implements getAdapterPosition<shouldShowRevokeOpenAuthItem> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;

    public GriverOpenAuthExtension(b.C0007b<getCommonResources> bVar) {
        this.accountRepositoryProvider = bVar;
    }

    public final shouldShowRevokeOpenAuthItem get() {
        return newInstance(this.accountRepositoryProvider.get());
    }

    public static GriverOpenAuthExtension create(b.C0007b<getCommonResources> bVar) {
        return new GriverOpenAuthExtension(bVar);
    }

    public class RevokeCallback extends parseFailed<String, Void> {
        private final getCommonResources accountRepository;

        @Inject
        public RevokeCallback(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
            super(appxloadfailed, getscheme);
            this.accountRepository = getcommonresources;
        }

        /* access modifiers changed from: protected */
        public TitleBarRightButtonView.AnonymousClass1<String> buildUseCaseObservable(Void voidR) {
            return this.accountRepository.getPhoneNumber();
        }
    }

    public static shouldShowRevokeOpenAuthItem newInstance(getCommonResources getcommonresources) {
        return new shouldShowRevokeOpenAuthItem(getcommonresources);
    }
}
