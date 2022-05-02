package o;

import javax.inject.Inject;
import kotlin.Metadata;
import o.TitleBarRightButtonView;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lid/dana/domain/openbankaccount/ConfigBankAccountRepository;", "", "getConfig", "Lio/reactivex/Observable;", "Lid/dana/domain/openbankaccount/model/ConfigBankAccount;", "domain_release"}, k = 1, mv = {1, 4, 2})
public interface NetworkUtils {
    @NotNull
    TitleBarRightButtonView.AnonymousClass1<fileType> getConfig();

    public class NetworkDetailCallback extends parseFailed<Boolean, setMin> {
        private final setFireMoment paymentRepository;

        @Inject
        public NetworkDetailCallback(appxLoadFailed appxloadfailed, getScheme getscheme, setFireMoment setfiremoment) {
            super(appxloadfailed, getscheme);
            this.paymentRepository = setfiremoment;
        }

        /* access modifiers changed from: protected */
        public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(setMin setmin) {
            return this.paymentRepository.setSeedExtra(setmin.seedExtra);
        }

        public static class setMin {
            /* access modifiers changed from: private */
            public String seedExtra;

            private setMin(String str) {
                this.seedExtra = str;
            }

            public static setMin forSeedExtra(String str) {
                return new setMin(str);
            }
        }
    }
}
