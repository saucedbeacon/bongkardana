package o;

import o.VisitNode;

final class getPageURI implements RedDotManager {
    private final String getMin;
    private final getData setMax;
    private final boolean setMin;

    public getPageURI(getData getdata, String str, boolean z) {
        this.setMax = getdata;
        this.getMin = str;
        this.setMin = z;
    }

    public final void accept(Object obj) {
        this.setMax.lambda$generateProfileQrDeepLink$2(this.getMin, this.setMin, (VisitNode.AnonymousClass1) obj);
    }
}
