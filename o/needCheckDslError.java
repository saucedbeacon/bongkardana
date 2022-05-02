package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class needCheckDslError extends uncheckItems<checkDslErrorAndExit> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final setIsUrgentResource rpcConnector;
    private final appxLoadFailed threadExecutor;

    @Inject
    public needCheckDslError(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        this.rpcConnector = setisurgentresource;
        this.threadExecutor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    public checkDslErrorAndExit createData(String str) {
        return new createEmbedView(this.rpcConnector, this.threadExecutor, this.apSecurityFacade, this.context);
    }
}
