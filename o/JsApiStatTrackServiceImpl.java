package o;

import android.content.Context;
import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class JsApiStatTrackServiceImpl extends uncheckItems<trackKeyJSAPIInvoke> {
    private final onAppResume apSecurityFacade;
    private final Context context;
    private final appxLoadFailed executor;
    private final setIsUrgentResource rpcConnector;

    @Inject
    public JsApiStatTrackServiceImpl(setIsUrgentResource setisurgentresource, appxLoadFailed appxloadfailed, onAppResume onappresume, Context context2) {
        this.rpcConnector = setisurgentresource;
        this.executor = appxloadfailed;
        this.apSecurityFacade = onappresume;
        this.context = context2;
    }

    public trackKeyJSAPIInvoke createData(String str) {
        if ("local".equals(str)) {
            return new onAlipayJSBridgeReady();
        }
        return new appendJsApiDetail4TinyWithT2(this.rpcConnector, this.executor, this.apSecurityFacade, this.context);
    }
}
