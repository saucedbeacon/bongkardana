package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class clearAllMethodInvokeOptimizer extends uncheckItems<setupMethodInvokeOptimizerForBridge> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final setIsUrgentResource rpcConnector;
    private final appxLoadFailed threadExecutor;

    @Inject
    public clearAllMethodInvokeOptimizer(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        this.rpcConnector = setisurgentresource;
        this.threadExecutor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    public setupMethodInvokeOptimizerForBridge createData(String str) {
        if (str.equals("mock")) {
            return new shouldThrowOut();
        }
        return new when(this.rpcConnector, this.threadExecutor, this.apSecurityFacade, this.context);
    }
}
