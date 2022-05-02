package o;

import java.util.List;

final class ActionCallback implements RedDotDrawable {
    private final onException setMin;

    public ActionCallback(onException onexception) {
        this.setMin = onexception;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$getHomeBannerDefaultContent$11((List) obj);
    }
}
