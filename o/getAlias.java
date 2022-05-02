package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class getAlias extends uncheckItems<ResourceProviderPoint> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final appxLoadFailed executor;
    private final setIsUrgentResource rpcConnector;

    @Inject
    public getAlias(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        this.rpcConnector = setisurgentresource;
        this.executor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    public ResourceProviderPoint createData(String str) {
        if (((str.hashCode() == 1843485230 && str.equals("network")) ? (char) 0 : 65535) != 0) {
            return null;
        }
        return new setAlias(this.rpcConnector, this.executor, this.apSecurityFacade, this.context);
    }
}
