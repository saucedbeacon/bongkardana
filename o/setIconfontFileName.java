package o;

import id.dana.social.di.module.FeedsCommentReportModule;
import o.AUHorizontalListView;
import o.b;
import o.setBtnImage;

public final class setIconfontFileName implements getAdapterPosition<setBtnImage.getMin> {
    private final b.C0007b<AUHorizontalListView.ChoiceMode> getMin;
    private final FeedsCommentReportModule length;

    private setIconfontFileName(FeedsCommentReportModule feedsCommentReportModule, b.C0007b<AUHorizontalListView.ChoiceMode> bVar) {
        this.length = feedsCommentReportModule;
        this.getMin = bVar;
    }

    public static setIconfontFileName setMax(FeedsCommentReportModule feedsCommentReportModule, b.C0007b<AUHorizontalListView.ChoiceMode> bVar) {
        return new setIconfontFileName(feedsCommentReportModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setBtnImage.getMin max = this.length.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
