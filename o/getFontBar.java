package o;

import android.content.Context;
import javax.inject.Inject;

public class getFontBar extends uncheckItems<isTaskRoot> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final appxLoadFailed executor;
    private final setIsUrgentResource rpcConnector;

    @Inject
    public getFontBar(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        this.rpcConnector = setisurgentresource;
        this.executor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    public isTaskRoot createData(String str) {
        return new onTabInfoGot(this.rpcConnector, this.executor, this.apSecurityFacade, this.context);
    }
}
