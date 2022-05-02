package o;

import o.RemoteCallResult;

final class AccessController implements RedDotDrawable {
    private final getMonitorToken getMax;
    private final isRemoteCallExtension getMin;

    final class ApplyCallback implements RedDotDrawable {
        private final isRemoteCallExtension getMax;

        public ApplyCallback(isRemoteCallExtension isremotecallextension) {
            this.getMax = isremotecallextension;
        }

        public final Object apply(Object obj) {
            return this.getMax.lambda$getCardCredentialKey$26((String) obj);
        }
    }

    public AccessController(isRemoteCallExtension isremotecallextension, getMonitorToken getmonitortoken) {
        this.getMin = isremotecallextension;
        this.getMax = getmonitortoken;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$convertCardIndexNo$21(this.getMax, (RemoteCallResult.AnonymousClass1) obj);
    }
}
