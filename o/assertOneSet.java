package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class assertOneSet extends uncheckItems<updatePadding> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final appxLoadFailed executor;
    private final setIsUrgentResource rpcConnector;

    @Inject
    public assertOneSet(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        this.rpcConnector = setisurgentresource;
        this.executor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    public updatePadding createData(String str) {
        return new afterTextChanged(this.rpcConnector, this.executor, this.apSecurityFacade, this.context);
    }
}
