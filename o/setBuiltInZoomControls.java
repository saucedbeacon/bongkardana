package o;

import javax.inject.Inject;
import o.TitleBarRightButtonView;

public class setBuiltInZoomControls extends parseFailed<Boolean, Void> {
    private final getMediaPlaybackRequiresUserGesture deviceWhitelistRepository;

    @Inject
    public setBuiltInZoomControls(appxLoadFailed appxloadfailed, getScheme getscheme, getMediaPlaybackRequiresUserGesture getmediaplaybackrequiresusergesture) {
        super(appxloadfailed, getscheme);
        this.deviceWhitelistRepository = getmediaplaybackrequiresusergesture;
    }

    /* access modifiers changed from: protected */
    public TitleBarRightButtonView.AnonymousClass1<Boolean> buildUseCaseObservable(Void voidR) {
        return this.deviceWhitelistRepository.isWhitelistedDevice();
    }
}
