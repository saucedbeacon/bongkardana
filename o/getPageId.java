package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class getPageId extends uncheckItems<setExitListener> {
    private final addRenderReadyListener branchDeepLinkEntityData;

    @Inject
    public getPageId(addRenderReadyListener addrenderreadylistener) {
        this.branchDeepLinkEntityData = addrenderreadylistener;
    }

    public setExitListener createData(String str) {
        return this.branchDeepLinkEntityData;
    }
}
