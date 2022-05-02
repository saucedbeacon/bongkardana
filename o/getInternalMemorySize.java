package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class getInternalMemorySize extends uncheckItems<appendExtraInfo> {
    private final appendExtraInfo remoteSslPinningEntityData$4aafb16f;

    @Inject
    public getInternalMemorySize(appendExtraInfo appendextrainfo) {
        this.remoteSslPinningEntityData$4aafb16f = appendextrainfo;
    }

    public appendExtraInfo createData(String str) {
        return this.remoteSslPinningEntityData$4aafb16f;
    }
}
