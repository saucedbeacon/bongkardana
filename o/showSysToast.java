package o;

public final class showSysToast extends setSpeed<getUid, PopupWindowToast> {
    public final /* synthetic */ Object map(Object obj) {
        isNotifyAllowed isnotifyallowed;
        getUid getuid = (getUid) obj;
        checkOp checkop = null;
        if (getuid == null) {
            return null;
        }
        PopupWindowToast popupWindowToast = new PopupWindowToast();
        getWebViewType risk = getuid.getRisk();
        if (risk != null) {
            isnotifyallowed = new isNotifyAllowed();
            isnotifyallowed.getMin = risk.getSecurityId();
            isnotifyallowed.setMax = risk.getResult();
            isnotifyallowed.setMin = risk.getVerificationMethod();
        } else {
            isnotifyallowed = null;
        }
        popupWindowToast.setMax = isnotifyallowed;
        H5WebViewChoose securityContext = getuid.getSecurityContext();
        if (securityContext != null) {
            checkop = new checkOp();
            checkop.length = securityContext.getPubKey();
        }
        popupWindowToast.length = checkop;
        return popupWindowToast;
    }
}
