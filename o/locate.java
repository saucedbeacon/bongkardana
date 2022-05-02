package o;

import id.dana.social.di.module.FeedsCommentReportModule;
import o.setBtnImage;

public final class locate implements getAdapterPosition<setBtnImage.setMin> {
    private final FeedsCommentReportModule setMax;

    private locate(FeedsCommentReportModule feedsCommentReportModule) {
        this.setMax = feedsCommentReportModule;
    }

    public static locate getMax(FeedsCommentReportModule feedsCommentReportModule) {
        return new locate(feedsCommentReportModule);
    }

    public final /* synthetic */ Object get() {
        setBtnImage.setMin min = this.setMax.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
