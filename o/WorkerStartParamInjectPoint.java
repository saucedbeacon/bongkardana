package o;

public class WorkerStartParamInjectPoint extends setSpeed<base64, getMD5Base64> {
    /* access modifiers changed from: protected */
    public getMD5Base64 map(base64 base64) {
        if (base64 == null) {
            return null;
        }
        getMD5Base64 getmd5base64 = new getMD5Base64();
        getmd5base64.setScopeName(base64.getTitle());
        getmd5base64.setScopeDescription(base64.getDescription());
        return getmd5base64;
    }
}
