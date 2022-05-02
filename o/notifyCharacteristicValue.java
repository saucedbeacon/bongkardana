package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class notifyCharacteristicValue extends parseFailed<disconnect, Void> {
    private final onDescriptorWrite userRepository;

    @Inject
    public notifyCharacteristicValue(appxLoadFailed appxloadfailed, getScheme getscheme, onDescriptorWrite ondescriptorwrite) {
        super(appxloadfailed, getscheme);
        this.userRepository = ondescriptorwrite;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<disconnect> buildUseCaseObservable(Void voidR) {
        return this.userRepository.getUserInfoWithKyc().map(onCharacteristicRead.setMax);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ disconnect lambda$buildUseCaseObservable$0(disconnect disconnect) throws Exception {
        if (disconnect != null) {
            return disconnect;
        }
        throw new Exception("UserInfo is null");
    }
}
