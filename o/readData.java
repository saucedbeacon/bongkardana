package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class readData extends parseFailed<stopBleScan, Void> {
    private final onDescriptorWrite userRepository;

    @Inject
    public readData(appxLoadFailed appxloadfailed, getScheme getscheme, onDescriptorWrite ondescriptorwrite) {
        super(appxloadfailed, getscheme);
        this.userRepository = ondescriptorwrite;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<stopBleScan> buildUseCaseObservable(Void voidR) {
        return this.userRepository.getSingleBalance();
    }
}
