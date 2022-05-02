package o;

final class JsAPICallStore implements RedDotManager {
    public static final JsAPICallStore length = new JsAPICallStore();

    public final void accept(Object obj) {
        RemoteCallbackPool.setMin((com_alibaba_ariver_app_api_ExtOpt$69$1) obj);
    }
}
