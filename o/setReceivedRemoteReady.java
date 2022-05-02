package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;
import o.BaseEmbedView;

@Singleton
public class setReceivedRemoteReady extends uncheckItems<BaseEmbedView.AnonymousClass1> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final appxLoadFailed executor;
    private final setIsUrgentResource rpcConnector;

    @Inject
    public setReceivedRemoteReady(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        this.rpcConnector = setisurgentresource;
        this.executor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    public BaseEmbedView.AnonymousClass1 createData(String str) {
        return new setLastStartClientTimeStamp(this.rpcConnector, this.executor, this.apSecurityFacade, this.context);
    }
}
