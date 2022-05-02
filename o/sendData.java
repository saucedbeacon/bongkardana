package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class sendData extends parseFailed<disconnect, Void> {
    private final onDescriptorWrite userRepository;

    @Inject
    public sendData(appxLoadFailed appxloadfailed, getScheme getscheme, onDescriptorWrite ondescriptorwrite) {
        super(appxloadfailed, getscheme);
        this.userRepository = ondescriptorwrite;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<disconnect> buildUseCaseObservable(Void voidR) {
        return this.userRepository.getUserInfo();
    }
}
