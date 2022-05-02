package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class positiveButtonClicked extends uncheckItems<invalidateDividers> {
    private final isAtTop networkFileUploadEntityData;

    @Inject
    public positiveButtonClicked(isAtTop isattop) {
        this.networkFileUploadEntityData = isattop;
    }

    public invalidateDividers createData(String str) {
        return this.networkFileUploadEntityData;
    }
}
