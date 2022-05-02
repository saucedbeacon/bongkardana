package o;

import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class H5UCProvider extends parseFailed<List<initUC7zSo>, length> {
    private final onWebViewDestory globalNetworkRepository;
    private final onDescriptorWrite userRepository;

    @Inject
    public H5UCProvider(appxLoadFailed appxloadfailed, getScheme getscheme, onWebViewDestory onwebviewdestory, onDescriptorWrite ondescriptorwrite) {
        super(appxloadfailed, getscheme);
        this.globalNetworkRepository = onwebviewdestory;
        this.userRepository = ondescriptorwrite;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<List<initUC7zSo>> buildUseCaseObservable(length length2) {
        return this.globalNetworkRepository.getRealtimeForexList(length2.fromCurrencies, length2.toCurrencies).flatMap(new clearServiceWorker(this));
    }

    /* access modifiers changed from: private */
    public TitleBarRightButtonView.AnonymousClass1<List<initUC7zSo>> getBalance(List<initUC7zSo> list) {
        return this.userRepository.getSingleBalance().flatMap(new clearServiceWorkerSync(list));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ TitleBarRightButtonView.AnonymousClass4 lambda$getBalance$0(List list, stopBleScan stopblescan) throws Exception {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((initUC7zSo) it.next()).setAmount(stopblescan.getAmount());
        }
        return TitleBarRightButtonView.AnonymousClass1.just(list);
    }

    public static class length {
        /* access modifiers changed from: private */
        public List<String> fromCurrencies;
        /* access modifiers changed from: private */
        public List<String> toCurrencies;

        private length(List<String> list, List<String> list2) {
            this.fromCurrencies = list;
            this.toCurrencies = list2;
        }

        public static length getRealtimeForex(List<String> list, List<String> list2) {
            return new length(list, list2);
        }
    }
}
