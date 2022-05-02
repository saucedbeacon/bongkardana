package o;

import java.util.List;

final class onActivityHelperOnCreateFinished implements RedDotDrawable {
    private final SendMtopResponse getMin;

    public onActivityHelperOnCreateFinished(SendMtopResponse sendMtopResponse) {
        this.getMin = sendMtopResponse;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$getDefaultFeedFromConfig$2((List) obj);
    }
}
