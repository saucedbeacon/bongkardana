package o;

public class getAppLayoutDirection extends setSpeed<unRegisterWorker, onResultSuccess> {
    /* access modifiers changed from: protected */
    public onResultSuccess map(unRegisterWorker unregisterworker) {
        if (unregisterworker == null) {
            return null;
        }
        onResultSuccess onresultsuccess = new onResultSuccess();
        onresultsuccess.setMaskPhoneNumber(unregisterworker.maskPhoneNumber);
        onresultsuccess.setResult(unregisterworker.result);
        onresultsuccess.setRiskInfo(unregisterworker.riskInfo);
        onresultsuccess.setVerificationMethod(unregisterworker.verificationMethod);
        onresultsuccess.setVerificationPriority(unregisterworker.verificationPriority);
        return onresultsuccess;
    }
}
