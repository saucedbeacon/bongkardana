package o;

import android.content.Context;
import javax.inject.Inject;

public class getOnlineResource extends uncheckItems<setExtEnable> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final setIsUrgentResource rpcConnector;
    private final BackKeyDownPoint securityGuardFacade;
    private final appxLoadFailed threadExecutor;

    @Inject
    public getOnlineResource(Context context2, setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, BackKeyDownPoint backKeyDownPoint) {
        this.context = context2;
        this.rpcConnector = setisurgentresource;
        this.threadExecutor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.securityGuardFacade = backKeyDownPoint;
    }

    public setExtEnable createData(String str) {
        return new hasKeyResourceFallback(this.rpcConnector, this.threadExecutor, this.apSecurityFacade, this.securityGuardFacade, this.context);
    }
}
