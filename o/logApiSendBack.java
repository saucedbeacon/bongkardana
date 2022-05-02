package o;

import o.CommonBackPerform;

final class logApiSendBack implements RedDotDrawable {
    private final CommonBackPerform.AnonymousClass1 length;

    public logApiSendBack(CommonBackPerform.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final Object apply(Object obj) {
        return this.length.transform((ResourceResponseInfo) obj);
    }
}
