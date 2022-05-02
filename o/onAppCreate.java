package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class onAppCreate extends uncheckItems<AppDestroyPoint> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final setIsUrgentResource rpcConnector;
    private final appxLoadFailed threadExecutor;

    @Inject
    public onAppCreate(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        this.rpcConnector = setisurgentresource;
        this.threadExecutor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    public AppDestroyPoint createData(String str) {
        return new AppExitPoint(this.rpcConnector, this.threadExecutor, this.apSecurityFacade, this.context);
    }
}
