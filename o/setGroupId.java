package o;

public class setGroupId extends setSpeed<BaseAppLog, initWithKey> {
    /* access modifiers changed from: protected */
    public initWithKey map(BaseAppLog baseAppLog) {
        if (baseAppLog == null) {
            return null;
        }
        initWithKey initwithkey = new initWithKey();
        initwithkey.setAuthenticationMethod(baseAppLog.getAuthenticationMethod());
        initwithkey.setEnrollFlag(baseAppLog.isEnrollFlag());
        initwithkey.setKycFlag(baseAppLog.isKycFlag());
        initwithkey.setRiskFlag(baseAppLog.isRiskFlag());
        return initwithkey;
    }
}
