package o;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class access$2300 extends uncheckItems<access$2400> {
    private final setIsUrgentResource rpcConnector;
    private final appxLoadFailed threadExecutor;

    @Inject
    public access$2300(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed) {
        this.rpcConnector = setisurgentresource;
        this.threadExecutor = appxloadfailed;
    }

    public access$2400 createData(String str) {
        return new access$2500(this.rpcConnector, this.threadExecutor);
    }
}
