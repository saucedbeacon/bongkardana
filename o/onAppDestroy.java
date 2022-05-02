package o;

import java.util.List;

final class onAppDestroy implements RedDotDrawable {
    private final int length;
    private final SendMtopResponse setMax;
    private final List setMin;

    public onAppDestroy(SendMtopResponse sendMtopResponse, List list, int i) {
        this.setMax = sendMtopResponse;
        this.setMin = list;
        this.length = i;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$getIgrowthFeeds$3(this.setMin, this.length, (loadApp) obj);
    }
}
